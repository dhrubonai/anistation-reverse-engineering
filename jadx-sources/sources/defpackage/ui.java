package defpackage;

import android.content.Context;
import android.net.LinkAddress;
import com.anistation.local.dao.AnimeListDao_Impl;
import com.anistation.model.Anime;
import com.anistation.model.watch.Provider;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ui implements ub2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ ui(byte b) {
        this.x = b;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        pn6 clearAll$lambda$0;
        byte b = this.x;
        vz0 vz0Var = null;
        byte b2 = 0;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 1:
                bi5 bi5Var = (bi5) obj;
                bi5Var.getClass();
                zh5.f(bi5Var, 0);
                return pn6Var;
            case 2:
                bi5 bi5Var2 = (bi5) obj;
                bi5Var2.getClass();
                zh5.f(bi5Var2, 0);
                return pn6Var;
            case 3:
                clearAll$lambda$0 = AnimeListDao_Impl.clearAll$lambda$0("DELETE FROM anime_list", (g85) obj);
                return clearAll$lambda$0;
            case 4:
                Anime anime = (Anime) obj;
                anime.getClass();
                return vc2.a(anime.getAnilistId(), anime.getId());
            case 5:
                Anime anime2 = (Anime) obj;
                anime2.getClass();
                return vc2.a(anime2.getAnilistId(), anime2.getId());
            case 6:
                return Boolean.valueOf(!(((go) obj) instanceof hi4));
            case 7:
                e04 e04Var = (e04) obj;
                e04Var.getClass();
                vs0 vs0Var = new vs0((byte) 15);
                kz5 kz5Var = zp2.C;
                im0 a = z05.a(ch1.class);
                v83 v83Var = v83.x;
                e04Var.a(new k03(new r50(kz5Var, a, null, vs0Var, v83Var)));
                e04Var.a(new k03(new r50(kz5Var, z05.a(t55.class), null, new vs0((byte) 16), v83Var)));
                dp0.Z(e04Var.e, new e04[]{d94.a, xj3.a, ej1.a, k35.a, zm2.a, ue1.a, ux6.a, v54.a, mb5.a, ge5.a, pl5.a, dm1.a, qq.a});
                return pn6Var;
            case 8:
                Byte b3 = (Byte) obj;
                b3.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b3}, 1));
            case 9:
                e04 e04Var2 = (e04) obj;
                e04Var2.getClass();
                iz5.b(e04Var2, z05.a(kr.class), new vs0((byte) 17));
                n77.u(zz.u(z05.a(qp.class), new vs0((byte) 18), v83.x, e04Var2, 8), z05.a(qp.class));
                return pn6Var;
            case 10:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                return Integer.valueOf(charSequence.length());
            case 11:
                return (pt) obj;
            case 12:
                tk4 tk4Var = (tk4) obj;
                tk4Var.getClass();
                if (t80.f == tk4Var) {
                    t80.f = null;
                }
                return pn6Var;
            case 13:
                e53 e53Var = (e53) obj;
                e53Var.getClass();
                e53Var.a = true;
                e53Var.b = true;
                e53Var.c = true;
                e53Var.e = true;
                return pn6Var;
            case 14:
                Byte b4 = (Byte) obj;
                b4.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b4}, 1));
            case 15:
                s20 s20Var = (s20) obj;
                s20Var.getClass();
                v94.y(s20Var);
                return pn6Var;
            case 16:
                ((s20) obj).c1();
                return pn6Var;
            case 17:
                wl3 wl3Var = (wl3) obj;
                wl3Var.c(h98.b, (int) (wl3Var.a().j() >> 32));
                wl3Var.c(h98.a, 0.0f);
                return pn6Var;
            case 18:
                return pn6Var;
            case 19:
                e73 e73Var = (e73) obj;
                e73Var.getClass();
                return f73.a(e73Var);
            case 20:
                cn0 cn0Var = (cn0) obj;
                cn0Var.getClass();
                cn0Var.a(nr1.y, new g70(3, vz0Var));
                cn0Var.a(p7.z, new h70(2, vz0Var, b2));
                return pn6Var;
            case 21:
                ((bb3) obj).a();
                return pn6Var;
            case 22:
                return Boolean.TRUE;
            case 23:
                return pn6Var;
            case 24:
                return pn6Var;
            case 25:
                al4 al4Var = (al4) obj;
                tq1 tq1Var = eb.b;
                al4Var.getClass();
                if (!((Context) sw0.E(al4Var, tq1Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    fa0.a.getClass();
                    return ea0.c;
                }
                return ha0.b;
            case 26:
                return ((LinkAddress) obj).getAddress();
            case 27:
                xx2 xx2Var = (xx2) obj;
                xx2Var.getClass();
                Integer castPriority = ((Provider) xx2Var.b).getCastPriority();
                if (castPriority == null) {
                    return Integer.MAX_VALUE;
                }
                return castPriority;
            case 28:
                xx2 xx2Var2 = (xx2) obj;
                xx2Var2.getClass();
                if (((Provider) xx2Var2.b).getDefault()) {
                    return 0;
                }
                return 1;
            default:
                xx2 xx2Var3 = (xx2) obj;
                xx2Var3.getClass();
                return Integer.valueOf(xx2Var3.a);
        }
    }
}
