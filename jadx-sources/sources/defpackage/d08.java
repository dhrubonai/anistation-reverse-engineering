package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d08 extends j18 {
    public final HashMap A;
    public final sb6 B;
    public final sb6 C;
    public final sb6 D;
    public final sb6 E;
    public final sb6 F;
    public final sb6 G;

    public d08(z18 z18Var) {
        super(z18Var);
        this.A = new HashMap();
        bt7 bt7Var = ((gu7) this.x).B;
        gu7.j(bt7Var);
        this.B = new sb6(bt7Var, "last_delete_stale", 0L);
        bt7 bt7Var2 = ((gu7) this.x).B;
        gu7.j(bt7Var2);
        this.C = new sb6(bt7Var2, "last_delete_stale_batch", 0L);
        bt7 bt7Var3 = ((gu7) this.x).B;
        gu7.j(bt7Var3);
        this.D = new sb6(bt7Var3, "backoff", 0L);
        bt7 bt7Var4 = ((gu7) this.x).B;
        gu7.j(bt7Var4);
        this.E = new sb6(bt7Var4, "last_upload", 0L);
        bt7 bt7Var5 = ((gu7) this.x).B;
        gu7.j(bt7Var5);
        this.F = new sb6(bt7Var5, "last_upload_attempt", 0L);
        bt7 bt7Var6 = ((gu7) this.x).B;
        gu7.j(bt7Var6);
        this.G = new sb6(bt7Var6, "midnight_offset", 0L);
    }

    public final Pair P(b48 b48Var, xv7 xv7Var) {
        String str = b48Var.x;
        a34.u(str);
        if (xv7Var.i(wv7.AD_STORAGE) && b48Var.K) {
            return Q(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    public final Pair Q(String str) {
        a08 a08Var;
        x6 x6Var;
        L();
        gu7 gu7Var = (gu7) this.x;
        pk2 pk2Var = gu7Var.H;
        ak7 ak7Var = gu7Var.A;
        pk2Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.A;
        a08 a08Var2 = (a08) hashMap.get(str);
        if (a08Var2 != null && elapsedRealtime < a08Var2.c) {
            return new Pair(a08Var2.a, Boolean.valueOf(a08Var2.b));
        }
        long T = ak7Var.T(str, tq7.b) + elapsedRealtime;
        try {
            try {
                x6Var = y6.a(gu7Var.x);
            } catch (PackageManager.NameNotFoundException unused) {
                if (a08Var2 != null && elapsedRealtime < a08Var2.c + ak7Var.T(str, tq7.c)) {
                    return new Pair(a08Var2.a, Boolean.valueOf(a08Var2.b));
                }
                x6Var = null;
            }
        } catch (Exception e) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.J.b(e, "Unable to get advertising id");
            a08Var = new a08(T, "", false);
        }
        if (x6Var == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = x6Var.b;
        if (str2 != null) {
            a08Var = new a08(T, str2, x6Var.c);
        } else {
            a08Var = new a08(T, "", x6Var.c);
        }
        hashMap.put(str, a08Var);
        return new Pair(a08Var.a, Boolean.valueOf(a08Var.b));
    }

    public final String R(b48 b48Var, xv7 xv7Var) {
        String str = b48Var.x;
        a34.u(str);
        if (xv7Var.i(wv7.AD_STORAGE) && b48Var.K) {
            L();
            String str2 = (String) Q(str).first;
            MessageDigest e0 = i28.e0();
            if (e0 == null) {
                return null;
            }
            return String.format(Locale.US, "%032X", new BigInteger(1, e0.digest(str2.getBytes())));
        }
        return "";
    }

    @Override // defpackage.j18
    public final void O() {
    }
}
