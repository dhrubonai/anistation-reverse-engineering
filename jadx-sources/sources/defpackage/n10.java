package defpackage;

import com.anistation.android.R;
import com.anistation.model.animelist.WatchStatus;
import com.anistation.model.backup.BackupFrequency;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class n10 implements ic2 {
    public final /* synthetic */ ec2 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ n10(String str, List list, boolean z, ub2 ub2Var, int i) {
        this.x = (byte) 2;
        this.B = str;
        this.y = list;
        this.z = z;
        this.A = ub2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        vz3 vz3Var;
        boolean z2;
        byte b = this.x;
        byte b2 = 16;
        boolean z3 = this.z;
        pn6 pn6Var = pn6.a;
        ec2 ec2Var = this.A;
        Object obj3 = this.B;
        Object obj4 = this.y;
        switch (b) {
            case 0:
                xm6 xm6Var = (xm6) obj4;
                sb2 sb2Var = (sb2) ec2Var;
                String str = (String) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    vz3 vz3Var2 = vz3.x;
                    yz3 R = n77.R(vz3Var2, 16.0f);
                    vr vrVar = new vr(16.0f, true, new ze0((byte) 6));
                    w50 w50Var = pk2.K;
                    xp0 a = vp0.a(vrVar, w50Var, kd2Var, 6);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, R);
                    tt0.d.getClass();
                    kd2Var.h0();
                    boolean z4 = kd2Var.S;
                    t53 t53Var = za3.p0;
                    if (z4) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    st0 st0Var = p7.F;
                    ss5.i(st0Var, kd2Var, a);
                    ys0 ys0Var = p7.E;
                    ss5.i(ys0Var, kd2Var, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    st0 st0Var2 = p7.G;
                    ss5.i(st0Var2, kd2Var, valueOf);
                    ss5.h(kd2Var);
                    ys0 ys0Var2 = p7.D;
                    ss5.i(ys0Var2, kd2Var, E);
                    yz3 c = ar5.c(vz3Var2, 1.0f);
                    z75 a2 = y75.a(x97.y, pk2.I, kd2Var, 48);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, c);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, a2);
                    ss5.i(ys0Var, kd2Var, l2);
                    h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E2);
                    yz3 i = ar5.i(vz3Var2, 46.0f);
                    o75 o75Var = p75.a;
                    tq1 tq1Var = op0.a;
                    l36.a(i, o75Var, ((mp0) kd2Var.j(tq1Var)).r, 0L, 0.0f, 0.0f, null, wk6.a, kd2Var, 12582918, 120);
                    kd2 kd2Var2 = kd2Var;
                    ov5.a(kd2Var2, ar5.l(vz3Var2, 14.0f));
                    ob3 ob3Var = new ob3(1.0f, true);
                    xp0 a3 = vp0.a(new vr(4.0f, true, new ze0((byte) 6)), w50Var, kd2Var2, 6);
                    int hashCode3 = Long.hashCode(kd2Var2.T);
                    al4 l3 = kd2Var2.l();
                    yz3 E3 = o80.E(kd2Var2, ob3Var);
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(st0Var, kd2Var2, a3);
                    ss5.i(ys0Var, kd2Var2, l3);
                    h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
                    ss5.i(ys0Var2, kd2Var2, E3);
                    io ioVar = new io();
                    ioVar.b(lz5.f(R.string.last_backup, kd2Var2));
                    int d = ioVar.d(new pv5(0L, hz5.g(14), (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65533));
                    try {
                        ioVar.b(" " + str);
                        ioVar.c(d);
                        ko e = ioVar.e();
                        tq1 tq1Var2 = pl6.a;
                        yc6.c(e, null, ((mp0) kd2Var2.j(tq1Var)).o, 0L, s92.C, 0L, null, 0L, 0, false, 0, 0, null, null, ((nl6) kd2Var2.j(tq1Var2)).j, kd2Var2, 1572864, 0, 262074);
                        yc6.b(lz5.f(R.string.backup_description, kd2Var2), null, ep0.b(0.7f, ((mp0) kd2Var2.j(tq1Var)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var2.j(tq1Var2)).l, 0L, null, null, 0L, null, hz5.g(16), null, 16646143), kd2Var2, 0, 0, 131066);
                        kd2Var2.q(true);
                        kd2Var2.q(true);
                        String str2 = xm6Var.w;
                        if (str2 == null) {
                            kd2Var2.e0(-1531068673);
                            kd2Var2.q(false);
                            vz3Var = vz3Var2;
                        } else {
                            kd2Var2.e0(-1531068672);
                            vz3Var = vz3Var2;
                            l36.a(ar5.c(vz3Var, 1.0f), ((cn5) kd2Var2.j(dn5.a)).c, ep0.b(0.6f, ((mp0) kd2Var2.j(tq1Var)).r), 0L, 0.0f, 0.0f, null, nx7.R(-115346767, new q10(str2, (byte) 0), kd2Var2), kd2Var2, 12582918, 120);
                            kd2Var2 = kd2Var2;
                            kd2Var2.q(false);
                        }
                        kd2 kd2Var3 = kd2Var2;
                        nx7.a(lz5.f(R.string.back_up_now, kd2Var2), ar5.c(vz3Var, 1.0f), null, null, !z3, xm6Var.z, 0.0f, 0L, 0L, null, null, sb2Var, kd2Var3, 48, 0, 4044);
                        kd2Var3.q(true);
                        return pn6Var;
                    } catch (Throwable th) {
                        ioVar.c(d);
                        throw th;
                    }
                }
                kd2Var.Y();
                return pn6Var;
            case 1:
                xm6 xm6Var2 = (xm6) obj4;
                ub2 ub2Var = (ub2) ec2Var;
                Map map = (Map) obj3;
                kd2 kd2Var4 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var4.V(intValue2 & 1, z2)) {
                    sv1 entries = BackupFrequency.getEntries();
                    BackupFrequency backupFrequency = xm6Var2.t;
                    boolean z5 = !z3;
                    boolean f = kd2Var4.f(map);
                    Object Q = kd2Var4.Q();
                    if (f || Q == au0.a) {
                        Q = new l0(map, b2);
                        kd2Var4.n0(Q);
                    }
                    t80.a(entries, backupFrequency, ub2Var, null, (ub2) Q, z5, null, 0L, null, null, kd2Var4, 0, 968);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                m37.b((String) obj3, (List) obj4, this.z, (ub2) ec2Var, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 3:
                ((Integer) obj2).getClass();
                nx7.j((String) obj3, this.z, (sb2) ec2Var, (sb2) obj4, (kd2) obj, kb0.N(1));
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                wt5.d(this.z, (WatchStatus) obj4, (ub2) obj3, (sb2) ec2Var, vz3.x, (kd2) obj, kb0.N(3073));
                return pn6Var;
        }
    }

    public /* synthetic */ n10(xm6 xm6Var, boolean z, ec2 ec2Var, Object obj, byte b) {
        this.x = b;
        this.y = xm6Var;
        this.z = z;
        this.A = ec2Var;
        this.B = obj;
    }

    public /* synthetic */ n10(String str, boolean z, sb2 sb2Var, sb2 sb2Var2, int i) {
        this.x = (byte) 3;
        this.B = str;
        this.z = z;
        this.A = sb2Var;
        this.y = sb2Var2;
    }

    public /* synthetic */ n10(boolean z, WatchStatus watchStatus, ub2 ub2Var, sb2 sb2Var, int i) {
        this.x = (byte) 4;
        this.z = z;
        this.y = watchStatus;
        this.B = ub2Var;
        this.A = sb2Var;
    }
}
