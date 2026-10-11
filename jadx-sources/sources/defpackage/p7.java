package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p7 implements o7, xm0, v96, es0, z06, tt5, ja5 {
    public static final gr C;
    public static final ys0 D;
    public static kz L;
    public static volatile p7 y;
    public final /* synthetic */ byte x;
    public static final p7 z = new p7(1);
    public static final p7 A = new p7(2);
    public static final /* synthetic */ p7 B = new p7(3);
    public static final ys0 E = new ys0(29);
    public static final st0 F = new st0((byte) 0);
    public static final st0 G = new st0((byte) 1);
    public static final hi0 H = new hi0(24);
    public static final p7 I = new p7(5);
    public static final p7 J = new p7(6);
    public static final p7 K = new p7(7);
    public static final p7 M = new p7(8);
    public static final p7 N = new p7(9);
    public static final p7 O = new p7(10);
    public static final p7 P = new p7(11);
    public static final p7 Q = new p7(12);
    public static final p7 R = new p7(13);
    public static final p7 S = new p7(14);
    public static final p7 T = new p7(15);
    public static final p7 U = new p7(16);
    public static final p7 V = new p7(17);
    public static final p7 W = new p7(18);
    public static final p7 X = new p7(20);
    public static final p7 Y = new p7(21);
    public static final p7 Z = new p7(22);
    public static final p7 a0 = new p7(23);
    public static final p7 b0 = new p7(24);
    public static final p7 c0 = new p7(25);
    public static final p7 d0 = new p7(26);
    public static final p7 e0 = new p7(27);
    public static final p7 f0 = new p7(28);
    public static final p7 g0 = new p7(29);

    static {
        byte b = 28;
        C = new gr(b);
        D = new ys0(b);
    }

    public /* synthetic */ p7(byte b) {
        this.x = b;
    }

    public static p51 a(nj5 nj5Var, ap1 ap1Var, List list, ke0 ke0Var, sb2 sb2Var, int i) {
        vz0 vz0Var = null;
        e21 e21Var = ap1Var;
        if ((i & 2) != 0) {
            e21Var = null;
        }
        if ((i & 4) != 0) {
            list = nt1.x;
        }
        i22 i22Var = new i22(nj5Var, sb2Var);
        e21 e21Var2 = e21Var;
        if (e21Var == null) {
            e21Var2 = new r18((byte) 25);
        }
        return new p51(i22Var, te4.H(new c0((Object) list, vz0Var, (byte) 26)), e21Var2, ke0Var);
    }

    public static gh7 b(Object obj) {
        mf7 mf7Var = (mf7) obj;
        gh7 gh7Var = mf7Var.zzc;
        if (gh7Var == gh7.f) {
            gh7 a = gh7.a();
            mf7Var.zzc = a;
            return a;
        }
        return gh7Var;
    }

    public static boolean d(int i, fm0 fm0Var, Object obj) {
        ze7 ze7Var = (ze7) fm0Var.B;
        int i2 = fm0Var.y;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5) {
                                fm0Var.Y(5);
                                ((gh7) obj).d(5 | (i3 << 3), Integer.valueOf(ze7Var.u()));
                                return true;
                            }
                            p65.p();
                            return false;
                        }
                        if (i != 0) {
                            return false;
                        }
                        jz7.e("Protocol message end-group tag did not match expected tag.");
                        return false;
                    }
                    gh7 a = gh7.a();
                    int i5 = i3 << 3;
                    int i6 = i + 1;
                    if (i6 >= 100) {
                        jz7.e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        return false;
                    }
                    while (fm0Var.f0() != Integer.MAX_VALUE && d(i6, fm0Var, a)) {
                    }
                    if ((i5 | 4) == fm0Var.y) {
                        if (a.e) {
                            a.e = false;
                        }
                        ((gh7) obj).d(i5 | 3, a);
                        return true;
                    }
                    jz7.e("Protocol message end-group tag did not match expected tag.");
                    return false;
                }
                ((gh7) obj).d((i3 << 3) | 2, fm0Var.g0());
                return true;
            }
            fm0Var.Y(1);
            ((gh7) obj).d((i3 << 3) | 1, Long.valueOf(ze7Var.t()));
            return true;
        }
        fm0Var.Y(0);
        ((gh7) obj).d(i3 << 3, Long.valueOf(ze7Var.r()));
        return true;
    }

    @Override // defpackage.v96
    public void c(os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        kd2Var.f0(-2101003086);
        if (kd2Var.f(this)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            os0Var.invoke(kd2Var, 6);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new q((byte) 9, i, this, os0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xm0
    public void f(wp2 wp2Var, t36 t36Var) {
        Object obj;
        vz0 vz0Var = null;
        switch (this.x) {
            case 1:
                wp2Var.D.f(ir2.h, new a7((ic2) t36Var, vz0Var, (byte) 0));
                return;
            case 12:
                wp2Var.A.f(ir2.j, new b9(t36Var, vz0Var, (byte) 5));
                return;
            case 13:
                jc2 jc2Var = (jc2) t36Var;
                p18 p18Var = ls2.b;
                ou ouVar = kq2.a;
                mv0 mv0Var = (mv0) wp2Var.E.d(kq2.a);
                if (mv0Var != null) {
                    obj = mv0Var.d(ls2.c);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    ((ls2) obj).a.add(new qr2(jc2Var, wp2Var, null));
                    return;
                }
                StringBuilder sb = new StringBuilder("Plugin ");
                sb.append(p18Var);
                ou ouVar2 = ls2.c;
                sb.append(" is not installed. Consider using `install(");
                sb.append(ouVar2);
                sb.append(")` in client config first.");
                throw new IllegalStateException(sb.toString());
            default:
                wp2Var.B.f(ir2.p, new a7((lc2) t36Var, vz0Var, (byte) 4));
                return;
        }
    }

    @Override // defpackage.tt5
    public boolean g(Object obj, Object obj2) {
        return a34.i(obj, obj2);
    }

    @Override // defpackage.es0
    public Object h(kz kzVar) {
        Object l = kzVar.l(new px4(bh3.class, Executor.class));
        l.getClass();
        return q23.B((Executor) l);
    }

    @Override // defpackage.z06
    public void i(y06 y06Var) {
        y06Var.clear();
    }

    @Override // defpackage.ja5
    public Object j(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        Object obj4 = list.get(2);
        Object obj5 = list.get(3);
        obj2.getClass();
        obj3.getClass();
        int intValue = ((Integer) obj3).intValue();
        obj4.getClass();
        long a = fy5.a(intValue, ((Integer) obj4).intValue());
        obj5.getClass();
        return new ic6((String) obj2, a, jf7.F(obj5));
    }

    @Override // defpackage.z06
    public boolean q(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.x) {
            case 14:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ja5
    public Object u(i95 i95Var, Object obj) {
        ic6 ic6Var = (ic6) obj;
        String obj2 = ic6Var.c().A.toString();
        long j = ic6Var.c().B;
        int i = nd6.c;
        return te4.I(obj2, Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) (ic6Var.c().B & 4294967295L)), jf7.H(i95Var, ic6Var.a));
    }
}
