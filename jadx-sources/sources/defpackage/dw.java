package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class dw implements Runnable {
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ dw(pz2 pz2Var, boolean z) {
        this.z = pz2Var;
        this.y = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        boolean z = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                iw iwVar = (iw) ((pz2) obj).z;
                String str = eq6.a;
                iwVar.e(z);
                return;
            default:
                cn7 cn7Var = (cn7) ((wz2) ((sn3) obj).y).f;
                cn7Var.getClass();
                ol2 ol2Var = (ol2) cn7Var.x;
                io3.B(ol2Var.k);
                if (z && ol2Var.m == null) {
                    ol2Var.f();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ dw(sn3 sn3Var, IOException iOException, boolean z) {
        this.z = sn3Var;
        this.y = z;
    }
}
