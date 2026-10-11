package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.anistation.android.R;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ip4 implements jc2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ ec2 C;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ip4(xm6 xm6Var, boolean z, ub2 ub2Var, Map map, ub2 ub2Var2) {
        this.z = xm6Var;
        this.y = z;
        this.A = ub2Var;
        this.B = map;
        this.C = ub2Var2;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        gp4 gp4Var;
        int i;
        String str;
        yz3 yz3Var;
        int i2;
        int i3;
        int i4;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz3 vz3Var = vz3.x;
        boolean z2 = false;
        ec2 ec2Var = this.C;
        Object obj4 = this.B;
        Object obj5 = this.A;
        Object obj6 = this.z;
        byte b2 = 2;
        switch (b) {
            case 0:
                w44 w44Var = (w44) obj6;
                hp4 hp4Var = (hp4) obj4;
                sb2 sb2Var = (sb2) ec2Var;
                w44 w44Var2 = (w44) obj5;
                p90 p90Var = (p90) obj;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                p90Var.getClass();
                if ((intValue & 6) == 0) {
                    if (kd2Var.f(p90Var)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue |= i4;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    boolean z3 = this.y;
                    if (z3) {
                        kd2Var.e0(1211082020);
                        z22 z22Var = ar5.c;
                        boolean f = kd2Var.f(w44Var);
                        Object Q = kd2Var.Q();
                        if (f || Q == au0.a) {
                            Q = new ec(w44Var, b2);
                            kd2Var.n0(Q);
                        }
                        b90.a(v36.a(z22Var, pn6Var, (PointerInputEventHandler) Q), kd2Var, 0);
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(1211491406);
                        kd2Var.q(false);
                    }
                    if (hp4Var != null) {
                        gp4Var = hp4Var.a;
                    } else {
                        hp4 hp4Var2 = (hp4) w44Var2.getValue();
                        if (hp4Var2 != null) {
                            gp4Var = hp4Var2.a;
                        } else {
                            gp4Var = null;
                        }
                    }
                    if (gp4Var == null) {
                        i = -1;
                    } else {
                        i = jp4.a[gp4Var.ordinal()];
                    }
                    if (i != -1) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    i2 = 177642549;
                                    i3 = R.string.unlocked;
                                } else {
                                    kd2Var.e0(177635514);
                                    kd2Var.q(false);
                                    ze0.l();
                                    return null;
                                }
                            } else {
                                i2 = 177639962;
                                i3 = R.string.tap_to_unlock;
                            }
                        } else {
                            i2 = 177637274;
                            i3 = R.string.screen_locked;
                        }
                        str = h11.i(kd2Var, i2, i3, kd2Var, false);
                    } else {
                        kd2Var.e0(1212004330);
                        kd2Var.q(false);
                        str = "";
                    }
                    if (z3 && gp4Var == gp4.y) {
                        yz3Var = q23.n(15, sb2Var, vz3Var, null, false);
                    } else {
                        yz3Var = vz3Var;
                    }
                    if (hp4Var != null) {
                        z2 = true;
                    }
                    te4.c(z2, oi4.A(p90Var.a(vz3Var, pk2.C), 0.0f, p90Var.b() * 0.2f), dv1.b(null, 3), dv1.c(null, 3), null, nx7.R(1308586956, new ao((Object) yz3Var, (Object) gp4Var, (Object) str, (byte) 7), kd2Var), kd2Var, 200064, 16);
                    return pn6Var;
                }
                kd2Var.Y();
                return pn6Var;
            default:
                xm6 xm6Var = (xm6) obj6;
                ub2 ub2Var = (ub2) obj5;
                Map map = (Map) obj4;
                ub2 ub2Var2 = (ub2) ec2Var;
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    s10.c(R.drawable.schedule, lz5.f(R.string.frequency, kd2Var2), lz5.f(R.string.automatic_backup_summary, kd2Var2), null, nx7.R(-1094338948, new n10(xm6Var, this.y, (ec2) ub2Var, (Object) map, (byte) 1), kd2Var2), kd2Var2, 24576, 8);
                    tq1 tq1Var = op0.a;
                    kb0.e(n77.T(vz3Var, 16.0f, 0.0f, 2), 0.8f, ep0.b(0.5f, ((mp0) kd2Var2.j(tq1Var)).r), kd2Var2, 54, 0);
                    s10.c(R.drawable.my_list, lz5.f(R.string.include_anime_list, kd2Var2), lz5.f(R.string.include_anime_list_summary, kd2Var2), null, nx7.R(-2065048091, new q(xm6Var, ub2Var2, (byte) 8), kd2Var2), kd2Var2, 24576, 8);
                    kb0.e(n77.T(vz3Var, 16.0f, 0.0f, 2), 0.8f, ep0.b(0.5f, ((mp0) kd2Var2.j(tq1Var)).r), kd2Var2, 54, 0);
                    s10.c(R.drawable.folder, lz5.f(R.string.backup_location_title, kd2Var2), lz5.f(R.string.backup_location_path, kd2Var2) + "\n" + lz5.f(R.string.backup_location_retention, kd2Var2), null, null, kd2Var2, 0, 24);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ ip4(boolean z, w44 w44Var, hp4 hp4Var, sb2 sb2Var, w44 w44Var2) {
        this.y = z;
        this.z = w44Var;
        this.B = hp4Var;
        this.C = sb2Var;
        this.A = w44Var2;
    }
}
