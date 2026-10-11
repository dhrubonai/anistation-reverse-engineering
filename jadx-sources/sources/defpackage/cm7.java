package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cm7 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final im7 g;

    public cm7(gu7 gu7Var, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        im7 im7Var;
        a34.u(str2);
        a34.u(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.F.b(es7.P(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    es7 es7Var2 = gu7Var.C;
                    gu7.l(es7Var2);
                    es7Var2.C.a("Param name can't be null");
                    it.remove();
                } else {
                    i28 i28Var = gu7Var.F;
                    gu7.j(i28Var);
                    Object U = i28Var.U(bundle2.get(next), next);
                    if (U == null) {
                        es7 es7Var3 = gu7Var.C;
                        gu7.l(es7Var3);
                        es7Var3.F.b(gu7Var.G.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        i28 i28Var2 = gu7Var.F;
                        gu7.j(i28Var2);
                        i28Var2.c0(bundle2, next, U);
                    }
                }
            }
            im7Var = new im7(bundle2);
        } else {
            im7Var = new im7(new Bundle());
        }
        this.g = im7Var;
    }

    public final cm7 a(gu7 gu7Var, long j) {
        return new cm7(gu7Var, this.c, this.a, this.b, this.d, this.e, j, this.g);
    }

    public final String toString() {
        String bundle = this.g.x.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + bundle.length() + 1);
        qx1.x(sb, "Event{appId='", str, "', name='", str2);
        return qx1.q(sb, "', params=", bundle, "}");
    }

    public cm7(gu7 gu7Var, String str, String str2, String str3, long j, long j2, long j3, im7 im7Var) {
        a34.u(str2);
        a34.u(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.F.c("Event created with reverse previous/current timestamps. appId, name", es7.P(str2), es7.P(str3));
        }
        this.g = im7Var;
    }
}
