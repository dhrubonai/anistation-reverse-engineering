package defpackage;

import android.content.Context;
import com.anistation.android.R;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vs0 implements ic2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ vs0(byte b) {
        this.x = b;
    }

    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, tn6] */
    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.x;
        t53 t53Var = za3.p0;
        vz3 vz3Var = vz3.x;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i = 0;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (kd2Var.V(intValue & 1, z2)) {
                    h98.d(lz5.f(R.string.oops_no_details_found, kd2Var), lz5.f(R.string.anime_details_not_available, kd2Var), ar5.c, kd2Var, 384, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                u.c(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                u.h(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 3:
                return ((e9) obj2).c.getValue();
            case 4:
                a34.l0((za3) obj).setDensity((ud1) obj2);
                return pn6Var;
            case 5:
                a34.l0((za3) obj).setLifecycleOwner((og3) obj2);
                return pn6Var;
            case 6:
                a34.l0((za3) obj).setSavedStateRegistryOwner((ga5) obj2);
                return pn6Var;
            case 7:
                sv6 l0 = a34.l0((za3) obj);
                int ordinal = ((ia3) obj2).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i = 1;
                    } else {
                        ze0.l();
                        return null;
                    }
                }
                l0.setLayoutDirection(i);
                return pn6Var;
            case 8:
                a34.l0((za3) obj).setResetBlock((ub2) obj2);
                return pn6Var;
            case 9:
                a34.l0((za3) obj).setUpdateBlock((ub2) obj2);
                return pn6Var;
            case 10:
                a34.l0((za3) obj).setReleaseBlock((ub2) obj2);
                return pn6Var;
            case 11:
                a34.l0((za3) obj).setUpdateBlock((ub2) obj2);
                return pn6Var;
            case 12:
                a34.l0((za3) obj).setReleaseBlock((ub2) obj2);
                return pn6Var;
            case 13:
                a34.l0((za3) obj).setModifier((yz3) obj2);
                return pn6Var;
            case 14:
                ((Integer) obj2).getClass();
                iv.e(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 15:
                dc5 dc5Var = (dc5) obj;
                dc5Var.getClass();
                ((li4) obj2).getClass();
                return new ch1((kf2) dc5Var.d(z05.a(kf2.class), null, null));
            case 16:
                ((dc5) obj).getClass();
                ((li4) obj2).getClass();
                return new zn6(new Object());
            case 17:
                dc5 dc5Var2 = (dc5) obj;
                dc5Var2.getClass();
                ((li4) obj2).getClass();
                return new kr((rq) dc5Var2.d(z05.a(rq.class), null, null), (qp) dc5Var2.d(z05.a(qp.class), null, null));
            case 18:
                dc5 dc5Var3 = (dc5) obj;
                dc5Var3.getClass();
                ((li4) obj2).getClass();
                return new qp((Context) dc5Var3.d(z05.a(Context.class), null, null));
            case 19:
                CharSequence charSequence = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                return Character.valueOf(charSequence.charAt(intValue2));
            case 20:
                kd2 kd2Var2 = (kd2) obj;
                ((Integer) obj2).getClass();
                kd2Var2.e0(-303914756);
                w32 w32Var = new w32(0);
                kd2Var2.q(false);
                return w32Var;
            case 21:
                kd2 kd2Var3 = (kd2) obj;
                ((Integer) obj2).getClass();
                kd2Var3.e0(1740974271);
                w32 w32Var2 = new w32(0);
                kd2Var3.q(false);
                return w32Var2;
            case 22:
                xq2 xq2Var = (xq2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                xq2Var.getClass();
                return Character.valueOf(xq2Var.a.charAt(intValue3));
            case 23:
                return CleanupDirectory.a((ai4) obj, (File) obj2);
            case 24:
                String str = (String) obj;
                j11 j11Var = (j11) obj2;
                str.getClass();
                j11Var.getClass();
                if (str.length() == 0) {
                    return j11Var.toString();
                }
                return str + ", " + j11Var;
            case 25:
                StringBuilder sb = (StringBuilder) obj;
                wz3 wz3Var = (wz3) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(wz3Var);
                return sb;
            case 26:
                kd2 kd2Var4 = (kd2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z5 = true;
                }
                if (kd2Var4.V(intValue4 & 1, z5)) {
                    yz3 R = n77.R(ar5.c(vz3Var, 1.0f), 20.0f);
                    xp0 a = vp0.a(new vr(10.0f, true, new ze0((byte) 6)), pk2.K, kd2Var4, 6);
                    int hashCode = Long.hashCode(kd2Var4.T);
                    al4 l = kd2Var4.l();
                    yz3 E = o80.E(kd2Var4, R);
                    tt0.d.getClass();
                    kd2Var4.h0();
                    if (kd2Var4.S) {
                        kd2Var4.k(t53Var);
                    } else {
                        kd2Var4.q0();
                    }
                    ss5.i(p7.F, kd2Var4, a);
                    ss5.i(p7.E, kd2Var4, l);
                    ss5.i(p7.G, kd2Var4, Integer.valueOf(hashCode));
                    ss5.h(kd2Var4);
                    ss5.i(p7.D, kd2Var4, E);
                    String f = lz5.f(R.string.disclaimer_1, kd2Var4);
                    tq1 tq1Var = pl6.a;
                    xd6 xd6Var = ((nl6) kd2Var4.j(tq1Var)).l;
                    tq1 tq1Var2 = op0.a;
                    yc6.b(f, null, ep0.b(0.75f, ((mp0) kd2Var4.j(tq1Var2)).o), 0L, null, null, 0L, new c86(3), 0L, 0, false, 0, 0, xd6Var, kd2Var4, 0, 0, 130042);
                    kb0.e(null, 0.0f, ep0.b(0.5f, ((mp0) kd2Var4.j(tq1Var2)).r), kd2Var4, 0, 3);
                    yc6.b(lz5.f(R.string.disclaimer_2, kd2Var4), null, ep0.b(0.75f, ((mp0) kd2Var4.j(tq1Var2)).o), 0L, null, null, 0L, new c86(3), 0L, 0, false, 0, 0, ((nl6) kd2Var4.j(tq1Var)).l, kd2Var4, 0, 0, 130042);
                    kd2Var4.q(true);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 27:
                kd2 kd2Var5 = (kd2) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z4 = true;
                }
                if (!kd2Var5.V(intValue5 & 1, z4)) {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 28:
                kd2 kd2Var6 = (kd2) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                }
                if (!kd2Var6.V(intValue6 & 1, z3)) {
                    kd2Var6.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var7 = (kd2) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var7.V(intValue7 & 1, z)) {
                    vo3 c = b90.c(pk2.C, false);
                    int hashCode2 = Long.hashCode(kd2Var7.T);
                    al4 l2 = kd2Var7.l();
                    yz3 E2 = o80.E(kd2Var7, vz3Var);
                    tt0.d.getClass();
                    kd2Var7.h0();
                    if (kd2Var7.S) {
                        kd2Var7.k(t53Var);
                    } else {
                        kd2Var7.q0();
                    }
                    ss5.i(p7.F, kd2Var7, c);
                    ss5.i(p7.E, kd2Var7, l2);
                    ss5.i(p7.G, kd2Var7, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var7);
                    ss5.i(p7.D, kd2Var7, E2);
                    yt2.a(w65.H(R.drawable.backup, kd2Var7, 0), null, ar5.i(vz3Var, 22.0f), ((mp0) kd2Var7.j(op0.a)).o, kd2Var7, 440, 0);
                    kd2Var7.q(true);
                } else {
                    kd2Var7.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ vs0(int i, byte b) {
        this.x = b;
    }
}
