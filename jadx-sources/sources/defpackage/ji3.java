package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ji3 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ AtomicBoolean y;

    public /* synthetic */ ji3(AtomicBoolean atomicBoolean, byte b) {
        this.x = b;
        this.y = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        AtomicBoolean atomicBoolean = this.y;
        switch (b) {
            case 0:
                atomicBoolean.set(true);
                return;
            default:
                atomicBoolean.set(true);
                return;
        }
    }
}
