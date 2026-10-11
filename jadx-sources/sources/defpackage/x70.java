package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x70 {
    public static final x70 a = new Object();
    public static final float b = iv.i;
    public static final float c = 640.0f;
    public static final float d = 56.0f;
    public static final float e = 125.0f;

    public final void a(yz3 yz3Var, float f, float f2, om5 om5Var, long j, kd2 kd2Var, final int i) {
        boolean z;
        final yz3 yz3Var2;
        final float f3;
        final float f4;
        final om5 om5Var2;
        final long j2;
        long d2;
        float f5;
        float f6;
        om5 om5Var3;
        yz3 yz3Var3;
        kd2Var.f0(-1364277227);
        int i2 = i | 9654;
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                yz3Var3 = yz3Var;
                f5 = f;
                f6 = f2;
                om5Var3 = om5Var;
                d2 = j;
            } else {
                float f7 = iv.h;
                float f8 = iv.g;
                o75 o75Var = ((cn5) kd2Var.j(dn5.a)).e;
                d2 = op0.d(iv.f, kd2Var);
                f5 = f7;
                f6 = f8;
                om5Var3 = o75Var;
                yz3Var3 = vz3.x;
            }
            kd2Var.r();
            String m = lt5.m(R.string.m3c_bottom_sheet_drag_handle_description, kd2Var);
            sk6 sk6Var = zn5.a;
            yz3 T = n77.T(yz3Var3, 0.0f, 22.0f, 1);
            boolean f9 = kd2Var.f(m);
            Object Q = kd2Var.Q();
            if (f9 || Q == au0.a) {
                Q = new zg(m, (byte) 3);
                kd2Var.n0(Q);
            }
            long j3 = d2;
            l36.a(rh5.a(T, false, (ub2) Q), om5Var3, j3, 0L, 0.0f, 0.0f, null, nx7.R(-1039573072, new w70(f5, f6), kd2Var), kd2Var, 12582912, 120);
            om5Var2 = om5Var3;
            j2 = j3;
            yz3Var2 = yz3Var3;
            f3 = f5;
            f4 = f6;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
            f3 = f;
            f4 = f2;
            om5Var2 = om5Var;
            j2 = j;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(yz3Var2, f3, f4, om5Var2, j2, i) { // from class: v70
                public final /* synthetic */ float A;
                public final /* synthetic */ om5 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ yz3 y;
                public final /* synthetic */ float z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(196609);
                    x70.this.a(this.y, this.z, this.A, this.B, this.C, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }
}
