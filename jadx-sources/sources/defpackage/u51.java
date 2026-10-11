package defpackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u51 implements kc2 {
    public final /* synthetic */ ic2 A;
    public final /* synthetic */ DateTimeFormatter B;
    public final /* synthetic */ DateTimeFormatter C;
    public final /* synthetic */ List x;
    public final /* synthetic */ LocalDate y;
    public final /* synthetic */ LocalDate z;

    public u51(List list, LocalDate localDate, LocalDate localDate2, ic2 ic2Var, DateTimeFormatter dateTimeFormatter, DateTimeFormatter dateTimeFormatter2) {
        this.x = list;
        this.y = localDate;
        this.z = localDate2;
        this.A = ic2Var;
        this.B = dateTimeFormatter;
        this.C = dateTimeFormatter2;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        long j;
        long j2;
        long b;
        long j3;
        int i2;
        int i3;
        Object obj5 = (zc3) obj;
        int intValue = ((Number) obj2).intValue();
        kd2 kd2Var = (kd2) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (kd2Var.f(obj5)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (kd2Var.d(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            LocalDate localDate = (LocalDate) this.x.get(intValue);
            kd2Var.e0(-466345701);
            boolean i4 = a34.i(localDate, this.y);
            if (i4) {
                kd2Var.e0(1924620831);
                j = n03.r(kd2Var).o;
                kd2Var.q(false);
            } else {
                kd2Var.e0(1924622618);
                j = n03.r(kd2Var).p;
                kd2Var.q(false);
            }
            if (i4) {
                kd2Var.e0(1924625117);
                j2 = n03.r(kd2Var).n;
                kd2Var.q(false);
            } else {
                kd2Var.e0(1924626847);
                j2 = n03.r(kd2Var).o;
                kd2Var.q(false);
            }
            long j4 = j2;
            if (i4) {
                kd2Var.e0(1924630469);
                b = ep0.b(0.7f, n03.r(kd2Var).n);
                kd2Var.q(false);
            } else {
                kd2Var.e0(1924632989);
                b = ep0.b(0.6f, n03.r(kd2Var).o);
                kd2Var.q(false);
            }
            long j5 = b;
            vz3 vz3Var = vz3.x;
            yz3 h = bx7.h(n03.k(ar5.g(ar5.n(vz3Var, 100.0f, 0.0f, 2), 65.0f, 0.0f, 2), n03.w(kd2Var).c), j, io3.h);
            if (!i4 && a34.i(localDate, this.z)) {
                kd2Var.e0(1924646399);
                j3 = n03.r(kd2Var).o;
                kd2Var.q(false);
            } else {
                kd2Var.e0(1924647934);
                kd2Var.q(false);
                j3 = ep0.h;
            }
            yz3 f = m37.f(h, 1.5f, j3, n03.w(kd2Var).c);
            Object obj6 = this.A;
            boolean f2 = kd2Var.f(obj6) | kd2Var.h(localDate);
            DateTimeFormatter dateTimeFormatter = this.B;
            boolean h2 = f2 | kd2Var.h(dateTimeFormatter);
            Object Q = kd2Var.Q();
            if (h2 || Q == au0.a) {
                Q = new h01(obj6, localDate, dateTimeFormatter, (byte) 1);
                kd2Var.n0(Q);
            }
            yz3 S = n77.S(kb0.A(f, false, null, null, false, (sb2) Q, kd2Var, 0, 31), 14.0f, 8.0f);
            xp0 a = vp0.a(x97.A, pk2.L, kd2Var, 54);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, S);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, a);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            String format = localDate.format(this.C);
            format.getClass();
            yc6.b(format, null, j4, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, n03.y(kd2Var).h, kd2Var, 0, 24576, 114682);
            ov5.a(kd2Var, ar5.e(vz3Var, 2.0f));
            String format2 = localDate.format(dateTimeFormatter);
            format2.getClass();
            yc6.b(format2, null, j5, 0L, s92.C, null, 0L, null, 0L, 0, false, 1, 0, n03.y(kd2Var).l, kd2Var, 1572864, 24576, 114618);
            kd2Var.q(true);
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
