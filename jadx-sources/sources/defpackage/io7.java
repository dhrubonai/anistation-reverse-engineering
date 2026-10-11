package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class io7 extends vp7 {
    public long A;
    public final js y;
    public final js z;

    /* JADX WARN: Type inference failed for: r2v1, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r2v2, types: [so5, js] */
    public io7(gu7 gu7Var) {
        super(gu7Var);
        this.z = new so5(0);
        this.y = new so5(0);
    }

    public final void M(long j, String str) {
        gu7 gu7Var = (gu7) this.x;
        if (str != null && str.length() != 0) {
            au7 au7Var = gu7Var.D;
            gu7.l(au7Var);
            au7Var.U(new dc7(this, str, j, (byte) 0));
        } else {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.a("Ad unit id must be a non-empty string");
        }
    }

    public final void N(long j, String str) {
        gu7 gu7Var = (gu7) this.x;
        if (str != null && str.length() != 0) {
            au7 au7Var = gu7Var.D;
            gu7.l(au7Var);
            au7Var.U(new dc7(this, str, j, (byte) 1));
        } else {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.a("Ad unit id must be a non-empty string");
        }
    }

    public final void O(long j) {
        py7 py7Var = ((gu7) this.x).I;
        gu7.k(py7Var);
        dy7 P = py7Var.P(false);
        js jsVar = this.y;
        Iterator it = ((gs) jsVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Q(str, j - ((Long) jsVar.get(str)).longValue(), P);
        }
        if (!jsVar.isEmpty()) {
            P(j - this.A, P);
        }
        R(j);
    }

    public final void P(long j, dy7 dy7Var) {
        gu7 gu7Var = (gu7) this.x;
        if (dy7Var == null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.K.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.K.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            i28.H0(dy7Var, bundle, true);
            qx7 qx7Var = gu7Var.J;
            gu7.k(qx7Var);
            qx7Var.S("am", "_xa", bundle);
        }
    }

    public final void Q(String str, long j, dy7 dy7Var) {
        gu7 gu7Var = (gu7) this.x;
        if (dy7Var == null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.K.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                es7 es7Var2 = gu7Var.C;
                gu7.l(es7Var2);
                es7Var2.K.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            i28.H0(dy7Var, bundle, true);
            qx7 qx7Var = gu7Var.J;
            gu7.k(qx7Var);
            qx7Var.S("am", "_xu", bundle);
        }
    }

    public final void R(long j) {
        js jsVar = this.y;
        Iterator it = ((gs) jsVar.keySet()).iterator();
        while (it.hasNext()) {
            jsVar.put((String) it.next(), Long.valueOf(j));
        }
        if (!jsVar.isEmpty()) {
            this.A = j;
        }
    }
}
