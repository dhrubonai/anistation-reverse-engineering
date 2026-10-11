package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ol7 implements Executor {
    public static final /* synthetic */ ol7 y = new ol7(0);
    public final /* synthetic */ byte x;

    public /* synthetic */ ol7(byte b) {
        this.x = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.x) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
