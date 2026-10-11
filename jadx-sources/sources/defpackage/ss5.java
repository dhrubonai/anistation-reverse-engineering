package defpackage;

import android.view.View;
import com.anistation.android.R;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ss5 {
    public static final void a(int i, kd2 kd2Var) {
        int i2;
        boolean z;
        int i3;
        kd2Var.f0(274621471);
        byte b = 4;
        if ((i & 6) == 0) {
            if (kd2Var.f(null)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if ((38347923 & i4) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i4 & 1, z)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
            } else {
                dn5.a(z51.m, kd2Var);
                op0.d(z51.l, kd2Var);
                op0.d(z51.o, kd2Var);
                np0 np0Var = z51.k;
                op0.d(np0Var, kd2Var);
                op0.d(np0Var, kd2Var);
                op0.d(z51.n, kd2Var);
            }
            kd2Var.r();
            throw null;
        }
        kd2Var.Y();
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new r(i, b);
        }
    }

    public static String b(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(int r2, int r3, int r4, long r5) {
        /*
            int r0 = defpackage.nd6.g(r5)
            int r1 = defpackage.nd6.f(r5)
            if (r1 >= r2) goto Lb
            return r5
        Lb:
            if (r0 > r2) goto L17
            if (r3 > r1) goto L17
            int r3 = r3 - r2
            int r4 = r4 - r3
            if (r0 != r1) goto L14
            goto L22
        L14:
            int r2 = r1 + r4
            goto L2c
        L17:
            if (r0 <= r2) goto L1e
            if (r1 >= r3) goto L1e
            int r2 = r2 + r4
            r0 = r2
            goto L2c
        L1e:
            if (r0 < r3) goto L24
            int r3 = r3 - r2
            int r4 = r4 - r3
        L22:
            int r0 = r0 + r4
            goto L14
        L24:
            if (r2 >= r0) goto L2c
            int r0 = r2 + r4
            int r3 = r3 - r2
            int r4 = r4 - r3
            int r2 = r4 + r1
        L2c:
            long r2 = defpackage.fy5.a(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss5.c(int, int, int, long):long");
    }

    public static final ew6 d(View view) {
        ew6 ew6Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof ew6) {
                ew6Var = (ew6) tag;
            } else {
                ew6Var = null;
            }
            if (ew6Var != null) {
                return ew6Var;
            }
            Object d = nz5.d(view);
            if (d instanceof View) {
                view = (View) d;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final void e(kd2 kd2Var, Integer num) {
        st0 st0Var = p7.G;
        if (kd2Var.S) {
            kd2Var.b(num, st0Var);
        }
    }

    public static String f(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder n = h11.n("<", str2, " threw ");
                    n.append(e.getClass().getName());
                    n.append(">");
                    sb = n.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) valueOf, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static final void g(o96 o96Var) {
        kk0 kk0Var = o96Var.y;
        int length = kk0Var.length();
        int length2 = kk0Var.length() + 1;
        if (length < 0 || length >= length2) {
            hz2.a("Expected " + length + " to be in [0, " + length2 + ")");
        }
        o96Var.C = fy5.a(length, length);
    }

    public static final void h(kd2 kd2Var) {
        kd2Var.b(pn6.a, new ao5((byte) 6));
    }

    public static final void i(ic2 ic2Var, kd2 kd2Var, Object obj) {
        if (!kd2Var.S && a34.i(kd2Var.Q(), obj)) {
            return;
        }
        kd2Var.n0(obj);
        kd2Var.b(obj, ic2Var);
    }

    public static final void j(o96 o96Var, int i, int i2) {
        o96Var.g(fy5.a(db.C(i, 0, o96Var.y.length()), db.C(i2, 0, o96Var.y.length())));
    }

    public static final void k(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof p96) {
            k(((p96) charSequence).A, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
