package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tt3 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ bu3 y;

    public /* synthetic */ tt3(bu3 bu3Var, byte b) {
        this.x = b;
        this.y = bu3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        bu3 bu3Var = this.y;
        switch (b) {
            case 0:
                bu3Var.r();
                return;
            case 1:
                bu3Var.getClass();
                return;
            default:
                synchronized (bu3Var.a) {
                    try {
                        if (!bu3Var.w) {
                            final sk5 d1 = bu3Var.t.d1();
                            if (!bu3Var.c.hasMessages(1)) {
                                sk5 sk5Var = bu3Var.s.c;
                                jo4 jo4Var = d1.a;
                                int i = jo4Var.b;
                                jo4 jo4Var2 = sk5Var.a;
                                if (i == jo4Var2.b && jo4Var.e == jo4Var2.e && jo4Var.h == jo4Var2.h && jo4Var.i == jo4Var2.i) {
                                    st3 st3Var = bu3Var.g.f;
                                    nw2 p = st3Var.p();
                                    for (int i2 = 0; i2 < p.size(); i2++) {
                                        final dt3 dt3Var = (dt3) p.get(i2);
                                        st3Var.M();
                                        final boolean x = st3Var.x(dt3Var, 16);
                                        final boolean x2 = st3Var.x(dt3Var, 17);
                                        bu3Var.c(dt3Var, new au3() { // from class: ut3
                                            @Override // defpackage.au3
                                            public final void d(ct3 ct3Var, int i3) {
                                                ct3Var.h(i3, sk5.this, x, x2, dt3Var.c);
                                            }
                                        });
                                    }
                                    try {
                                        bu3Var.h.k.h(0, d1, true, true, 0);
                                    } catch (RemoteException e) {
                                        kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
                                    }
                                }
                            }
                            bu3Var.r();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
