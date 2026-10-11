package defpackage;

import android.view.View;
import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class rz5 {
    public static int a = 2;

    public static final int a(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static byte b(long j) {
        boolean z;
        if ((j >> 8) == 0) {
            z = true;
        } else {
            z = false;
        }
        io3.l(j, "out of range: %s", z);
        return (byte) j;
    }

    public static final og3 c(View view) {
        og3 og3Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof og3) {
                og3Var = (og3) tag;
            } else {
                og3Var = null;
            }
            if (og3Var != null) {
                return og3Var;
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

    public static final Object d(rf6 rf6Var, ic2 ic2Var) {
        h98.A(rf6Var, true, new hi1(x97.C(rf6Var.B.getContext()).a(rf6Var.C, rf6Var, rf6Var.A)));
        return lz5.e(rf6Var, false, rf6Var, ic2Var);
    }

    public static int e(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        if (i7 < 4) {
            return 4;
        }
        return i7 + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(long r6, defpackage.ic2 r8, defpackage.vz0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.sf6
            if (r0 == 0) goto L13
            r0 = r9
            sf6 r0 = (defpackage.sf6) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            sf6 r0 = new sf6
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.y
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            w05 r6 = r0.x
            defpackage.m37.N(r9)     // Catch: defpackage.qf6 -> L28
            return r9
        L28:
            r7 = move-exception
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L30:
            defpackage.m37.N(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3a
            goto L5c
        L3a:
            w05 r9 = new w05
            r9.<init>()
            r0.x = r9     // Catch: defpackage.qf6 -> L54
            r0.z = r3     // Catch: defpackage.qf6 -> L54
            rf6 r1 = new rf6     // Catch: defpackage.qf6 -> L54
            r1.<init>(r6, r0)     // Catch: defpackage.qf6 -> L54
            r9.x = r1     // Catch: defpackage.qf6 -> L54
            java.lang.Object r6 = d(r1, r8)     // Catch: defpackage.qf6 -> L54
            w11 r7 = defpackage.w11.x
            if (r6 != r7) goto L53
            return r7
        L53:
            return r6
        L54:
            r7 = move-exception
            r6 = r9
        L56:
            h43 r8 = r7.x
            java.lang.Object r6 = r6.x
            if (r8 != r6) goto L5d
        L5c:
            return r2
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz5.f(long, ic2, vz0):java.lang.Object");
    }

    public static void g(int i, Object obj) {
        if (obj != null) {
            return;
        }
        qi2.m(h11.g(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
    }
}
