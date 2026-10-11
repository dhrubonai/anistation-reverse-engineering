package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class lh0 implements jc2 {
    public final /* synthetic */ ec2 A;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ List y;
    public final /* synthetic */ float z;

    public /* synthetic */ lh0(float f, List list, sb2 sb2Var) {
        this.z = f;
        this.y = list;
        this.A = sb2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        long j;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz3 vz3Var = vz3.x;
        boolean z3 = false;
        ec2 ec2Var = this.A;
        float f = this.z;
        List list = this.y;
        switch (b) {
            case 0:
                sb2 sb2Var = (sb2) ec2Var;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z3 = true;
                }
                if (kd2Var.V(intValue & 1, z3)) {
                    l36.a(n77.U(ar5.c(vz3Var, 1.0f), 15.0f, 10.0f, 15.0f, f), ((cn5) kd2Var.j(dn5.a)).d, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, nx7.R(-471195997, new q(list, sb2Var, (byte) 13), kd2Var), kd2Var, 12582912, 120);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                ub2 ub2Var = (ub2) ec2Var;
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        float floatValue = ((Number) it.next()).floatValue();
                        if (f == floatValue) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String valueOf = String.valueOf(floatValue);
                        if (z2) {
                            kd2Var2.e0(-1065749299);
                            j = ((mp0) kd2Var2.j(op0.a)).o;
                            kd2Var2.q(false);
                        } else {
                            kd2Var2.e0(-1065657973);
                            j = ((mp0) kd2Var2.j(op0.a)).r;
                            kd2Var2.q(false);
                        }
                        long j2 = j;
                        vh4 vh4Var = new vh4(12.0f, 8.0f, 12.0f, 8.0f);
                        yz3 n = ar5.n(vz3Var, 55.0f, 0.0f, 2);
                        boolean f2 = kd2Var2.f(ub2Var) | kd2Var2.c(floatValue);
                        Object Q = kd2Var2.Q();
                        if (f2 || Q == au0.a) {
                            Q = new b74(ub2Var, floatValue, (byte) 1);
                            kd2Var2.n0(Q);
                        }
                        kd2 kd2Var3 = kd2Var2;
                        db.l(valueOf, z2, (ub2) Q, n, vh4Var, null, j2, 0L, false, kd2Var3, 27648, 416);
                        kd2Var2 = kd2Var3;
                    }
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ lh0(List list, float f, ub2 ub2Var) {
        this.y = list;
        this.z = f;
        this.A = ub2Var;
    }
}
