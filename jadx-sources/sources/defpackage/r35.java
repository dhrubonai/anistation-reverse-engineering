package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r35 implements ThreadFactory {
    public static final /* synthetic */ r35 b = new r35(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ r35(byte b2) {
        this.a = b2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new vt(runnable, "fonts-androidx");
            default:
                Object obj = sx7.j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
