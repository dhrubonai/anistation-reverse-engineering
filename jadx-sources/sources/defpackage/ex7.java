package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ex7 implements b55 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nq3 b;

    public /* synthetic */ ex7(nq3 nq3Var, byte b) {
        this.a = b;
        this.b = nq3Var;
    }

    @Override // defpackage.b55
    public final void a(a55 a55Var) {
        byte b = this.a;
        nq3 nq3Var = this.b;
        hl7 hl7Var = (hl7) a55Var;
        switch (b) {
            case 0:
                Status b2 = hl7Var.b();
                int i = b2.x;
                if (i != 0) {
                    zk3 zk3Var = (zk3) nq3Var.b;
                    Log.w(zk3Var.a, zk3Var.c("Error fetching queue items, statusCode=" + i + ", statusMessage=" + b2.y, new Object[0]));
                }
                nq3Var.k = null;
                if (!((ArrayDeque) nq3Var.h).isEmpty()) {
                    h15 h15Var = (h15) nq3Var.i;
                    gm7 gm7Var = (gm7) nq3Var.j;
                    h15Var.removeCallbacks(gm7Var);
                    h15Var.postDelayed(gm7Var, 500L);
                    return;
                }
                return;
            default:
                Status b3 = hl7Var.b();
                int i2 = b3.x;
                if (i2 != 0) {
                    zk3 zk3Var2 = (zk3) nq3Var.b;
                    Log.w(zk3Var2.a, zk3Var2.c("Error fetching queue item ids, statusCode=" + i2 + ", statusMessage=" + b3.y, new Object[0]));
                }
                nq3Var.l = null;
                if (!((ArrayDeque) nq3Var.h).isEmpty()) {
                    h15 h15Var2 = (h15) nq3Var.i;
                    gm7 gm7Var2 = (gm7) nq3Var.j;
                    h15Var2.removeCallbacks(gm7Var2);
                    h15Var2.postDelayed(gm7Var2, 500L);
                    return;
                }
                return;
        }
    }
}
