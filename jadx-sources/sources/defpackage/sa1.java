package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sa1 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final Object b;

    public sa1() {
        this.a = (byte) 0;
        this.b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            default:
                Thread newThread = ((ThreadFactory) obj).newThread(runnable);
                newThread.setName("ScionFrontendApi");
                return newThread;
        }
    }

    public sa1(sp7 sp7Var) {
        this.a = (byte) 1;
        this.b = Executors.defaultThreadFactory();
    }
}
