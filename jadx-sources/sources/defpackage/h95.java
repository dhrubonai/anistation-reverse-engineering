package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h95 implements k11, vd1, tt5, xm0, s80, cf6 {
    public final /* synthetic */ byte x;
    public static final h95 y = new h95(1);
    public static final /* synthetic */ h95 z = new h95(2);
    public static final ec0 A = new ec0(null);
    public static final /* synthetic */ h95 B = new h95(3);
    public static final h95 C = new h95(4);
    public static final h95 D = new h95(5);
    public static final h95 E = new h95(6);
    public static final /* synthetic */ h95 F = new h95(7);
    public static final /* synthetic */ h95 G = new h95(8);
    public static final h95 H = new h95(9);
    public static final /* synthetic */ h95 I = new h95(10);
    public static final h95 J = new h95(11);
    public static final h95 K = new h95(12);
    public static final h95 L = new h95(13);
    public static final h95 M = new h95(14);
    public static final h95 N = new h95(15);
    public static final h95 O = new h95(16);
    public static final j67 P = new Object();
    public static final h95 Q = new h95(18);
    public static final h95 R = new h95(19);
    public static final h95 S = new h95(20);
    public static final h95 T = new h95(21);
    public static final h95 U = new h95(22);
    public static final h95 V = new h95(23);
    public static final h95 W = new h95(24);
    public static final h95 X = new h95(25);
    public static final h95 Y = new h95(26);
    public static final h95 Z = new h95(27);
    public static final h95 a0 = new h95(28);
    public static final h95 b0 = new h95(29);

    public /* synthetic */ h95(byte b) {
        this.x = b;
    }

    @Override // defpackage.cf6
    public bf6 a() {
        return new bf6(j04.b());
    }

    @Override // defpackage.s80
    public long b(fm0 fm0Var, int i) {
        return ((bd6) fm0Var.B).k(i);
    }

    @Override // defpackage.vd1
    public float c(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public void d(Drawable drawable, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        kd2Var.f0(257732500);
        if (kd2Var.h(drawable)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            yz3 i4 = ar5.i(vz3.x, sz0.e);
            boolean h = kd2Var.h(drawable);
            Object Q2 = kd2Var.Q();
            if (h || Q2 == au0.a) {
                Q2 = new pp5((Object) drawable, (byte) 7);
                kd2Var.n0(Q2);
            }
            b90.a(nx7.w(i4, (ub2) Q2), kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new vl5((byte) 3, i, this, drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xm0
    public void f(wp2 wp2Var, t36 t36Var) {
        wp2Var.A.f(ir2.l, new b7((jc2) t36Var, null, (byte) 1));
    }

    @Override // defpackage.tt5
    public boolean g(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.x) {
            case 9:
                return "NeverEqualPolicy";
            case 13:
                return "SingleLineCodepointTransformation";
            case 15:
                int i = j04.y;
                return "TimeSource(System.nanoTime())";
            default:
                return super.toString();
        }
    }
}
