package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y81 implements lm2 {
    public final /* synthetic */ b91 x;

    public y81(b91 b91Var) {
        this.x = b91Var;
    }

    @Override // defpackage.lm2
    public final void a() {
        this.x.B.remove(this);
    }

    @Override // defpackage.lm2
    public final boolean g(Uri uri, fr0 fr0Var, boolean z) {
        boolean z2;
        boolean e;
        b91 b91Var = this.x;
        HashMap hashMap = b91Var.A;
        if (b91Var.P == null) {
            ol2 ol2Var = b91Var.J;
            if (ol2Var != null && ol2Var.k) {
                z2 = true;
            } else {
                z2 = false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            a91 a91Var = (a91) hashMap.get(uri);
            a91Var.getClass();
            om2 om2Var = a91Var.a;
            int size = om2Var.b.size();
            ho6 it = zw2.m(om2Var.b.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                if (b91Var.f((Uri) it.next(), elapsedRealtime)) {
                    i++;
                }
            }
            int size2 = b91Var.K.size();
            z62 listIterator = b91Var.K.listIterator(0);
            int i2 = 0;
            while (listIterator.hasNext()) {
                om2 om2Var2 = (om2) listIterator.next();
                if (z2) {
                    e = b91Var.f(om2Var2.b(), elapsedRealtime);
                } else {
                    e = b91Var.e(om2Var2, elapsedRealtime);
                }
                if (e) {
                    i2++;
                }
            }
            fj3 fj3Var = new fj3(z2, size, i, size2, i2);
            b91Var.z.getClass();
            gj3 h = q18.h(fj3Var, fr0Var);
            if (h != null) {
                long j = h.b;
                if (z2 && h.a == 1) {
                    ol2 ol2Var2 = b91Var.J;
                    ol2Var2.getClass();
                    return ol2Var2.a(j);
                }
                a91 a91Var2 = (a91) hashMap.get(uri);
                if (a91Var2 != null) {
                    return a91Var2.a(uri, j, null);
                }
            }
        }
        return false;
    }
}
