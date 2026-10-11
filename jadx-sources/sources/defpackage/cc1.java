package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class cc1 implements ss6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cc1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ss6
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((CountDownLatch) obj).countDown();
                return;
            case 1:
                ((jh6) obj).h();
                return;
            case 2:
                jh6 jh6Var = ((b86) obj).A;
                jh6Var.getClass();
                jh6Var.f();
                a61.a();
                return;
            default:
                ((ge6) obj).b();
                return;
        }
    }
}
