package defpackage;

import android.app.Activity;
import androidx.work.impl.model.DependencyDao_Impl;
import com.anistation.local.dao.AnimeListDao_Impl;
import com.anistation.local.entity.AnimeListItem;
import com.anistation.model.update.AppUpdateCheck;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b0(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        float f;
        long j;
        pn6 upsert$lambda$0;
        AnimeListItem byAnimeId$lambda$0;
        pn6 upsertAll$lambda$0;
        Object value;
        ov1 ov1Var;
        byte b = this.x;
        byte b2 = 1;
        byte b3 = 2;
        byte b4 = 0;
        vz0 vz0Var = null;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                ((u34) obj3).b((pt4) obj2);
                return pn6Var;
            case 1:
                r8 r8Var = (r8) obj3;
                a9 a9Var = (a9) obj2;
                long j2 = ((qn1) obj).a;
                if (r8Var.w1()) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                long g = xc4.g(f, j2);
                if (r8Var.N == rg4.x) {
                    j = g & 4294967295L;
                } else {
                    j = g >> 32;
                }
                a9.b(a9Var, r8Var.g0.c(Float.intBitsToFloat((int) j)));
                return pn6Var;
            case 2:
                return new qz2((en4) obj3, new y7((pd) obj2, (byte) 14));
            case 3:
                vr4 vr4Var = (vr4) obj3;
                vr4Var.setPositionProvider((xr4) obj2);
                vr4Var.r();
                return new wd((byte) 0);
            case 4:
                ((za3) obj3).e0(((yz3) obj).w((yz3) obj2));
                return pn6Var;
            case 5:
                px5 px5Var = (px5) obj3;
                p55 p55Var = (p55) obj;
                p55Var.getClass();
                p55Var.h(((Number) px5Var.getValue()).floatValue());
                p55Var.i(((Number) px5Var.getValue()).floatValue());
                p55Var.c(((Number) ((px5) obj2).getValue()).floatValue());
                return pn6Var;
            case 6:
                mc6 mc6Var = (mc6) obj;
                mc6Var.getClass();
                ((w44) obj2).setValue(mc6Var);
                ((ub2) obj3).invoke(mc6Var.a.y);
                return pn6Var;
            case 7:
                ((ci1) obj).getClass();
                return new qj((Activity) obj3, (Float) obj2, b4);
            case 8:
                upsert$lambda$0 = AnimeListDao_Impl.upsert$lambda$0((AnimeListDao_Impl) obj3, (AnimeListItem) obj2, (g85) obj);
                return upsert$lambda$0;
            case 9:
                byAnimeId$lambda$0 = AnimeListDao_Impl.getByAnimeId$lambda$0("SELECT * FROM anime_list WHERE animeId = ? LIMIT 1", (String) obj3, (AnimeListDao_Impl) obj2, (g85) obj);
                return byAnimeId$lambda$0;
            case 10:
                upsertAll$lambda$0 = AnimeListDao_Impl.upsertAll$lambda$0((AnimeListDao_Impl) obj3, (List) obj2, (g85) obj);
                return upsertAll$lambda$0;
            case 11:
                og3 og3Var = (og3) obj3;
                ((ci1) obj).getClass();
                pq pqVar = new pq((kr) obj2, b4);
                og3Var.getLifecycle().a(pqVar);
                return new qj(og3Var, pqVar, b2);
            case 12:
                AppUpdateCheck appUpdateCheck = (AppUpdateCheck) obj2;
                int intValue = ((Integer) obj).intValue();
                sx5 sx5Var = ((kr) obj3).d;
                do {
                    value = sx5Var.getValue();
                } while (!sx5Var.j(value, new br(appUpdateCheck, intValue)));
                return pn6Var;
            case 13:
                hz hzVar = (hz) obj3;
                iz izVar = (iz) obj2;
                te6 te6Var = hzVar.L;
                if (te6Var != null) {
                    te6Var.b();
                }
                hzVar.L = null;
                zq0 zq0Var = izVar.y;
                if (zq0Var != null) {
                    zq0Var.Q(pn6Var);
                }
                izVar.y = null;
                return pn6Var;
            case 14:
                oz ozVar = (oz) obj3;
                bt0 bt0Var = (bt0) obj2;
                m74 m74Var = ozVar.a;
                if (m74Var != null) {
                    m74.a(m74Var, bt0Var.b);
                } else {
                    wd4 wd4Var = ozVar.b;
                    if (wd4Var != null) {
                        nz nzVar = bt0Var.a;
                        nzVar.getClass();
                        qd4 qd4Var = new qd4(nzVar, new sd4(null, nzVar));
                        nzVar.a.add(qd4Var);
                        m74.a(wd4Var.b().c, qd4Var);
                    } else {
                        ze0.m("Unreachable");
                        return null;
                    }
                }
                return new qj(ozVar, bt0Var, b3);
            case 15:
                ub2 ub2Var = (ub2) obj2;
                mc6 mc6Var2 = (mc6) obj;
                if (!a34.i((mc6) obj3, mc6Var2)) {
                    ub2Var.invoke(mc6Var2);
                }
                return pn6Var;
            case 16:
                tl7.z((v11) obj3, null, null, new c0((d82) obj, (ng6) obj2, vz0Var, (byte) 12), 3);
                return pn6Var;
            case 17:
                dm4.n((dm4) obj, (em4) obj3, 0, 0, ((y60) obj2).L, 4);
                return pn6Var;
            case 18:
                ka0 ka0Var = (ka0) obj2;
                bb3 bb3Var = (bb3) obj;
                bb3Var.a();
                bp1.e0(bb3Var, (id) obj3, ka0Var, 0.0f, null, 60);
                return pn6Var;
            case 19:
                bb3 bb3Var2 = (bb3) obj;
                bb3Var2.a();
                bp1.e0(bb3Var2, ((zg4) obj3).O, (ka0) obj2, 0.0f, null, 60);
                return pn6Var;
            case 20:
                tl7.z((v11) obj3, null, null, new m80((do5) obj2, ((Float) obj).floatValue(), vz0Var, b4), 3);
                return pn6Var;
            case 21:
                ((v90) obj3).a.k((my0) obj2);
                return pn6Var;
            case 22:
                int h0 = io3.h0(((Float) obj).floatValue());
                ((qi4) obj2).i(h0);
                ((ko4) obj3).F(h0, 0);
                return pn6Var;
            case 23:
                List list = (List) obj3;
                pe3 pe3Var = (pe3) obj;
                pe3Var.getClass();
                pe3Var.B0(list.size(), null, new eo(list, (byte) 2), new os0(802480018, true, new vh0(list, (ub2) obj2, b4)));
                return pn6Var;
            case 24:
                uf3 uf3Var = (uf3) obj3;
                ka0 ka0Var2 = (ka0) obj2;
                bb3 bb3Var3 = (bb3) obj;
                bb3Var3.a();
                if (((Boolean) uf3Var.s.getValue()).booleanValue() || ((Boolean) uf3Var.t.getValue()).booleanValue()) {
                    bp1.a0(bb3Var3, ka0Var2, 0L, 0L, 0.0f, null, 126);
                }
                return pn6Var;
            case 25:
                return DependencyDao_Impl.c((DependencyDao_Impl) obj3, (ae1) obj2, (g85) obj);
            case 26:
                ha6 ha6Var = (ha6) obj2;
                if (!((Boolean) ((pp5) obj3).invoke((an1) obj)).booleanValue()) {
                    return null;
                }
                return ha6Var;
            case 27:
                String str = (String) obj2;
                j56 j56Var = (j56) obj;
                j56Var.getClass();
                j56 j56Var2 = ((iu1) obj3).B.b;
                dp0.Y(j56Var2.a, j56Var.a);
                List list2 = j56Var2.b;
                list2.getClass();
                j56Var.b = list2;
                String str2 = j56Var2.c;
                j56Var.c = str2;
                if (str2 != null) {
                    str = str2;
                }
                j56Var.c = str;
                return pn6Var;
            case 28:
                pv1 pv1Var = (pv1) obj3;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                Object obj4 = pv1Var.a.get(z05.a(obj.getClass()));
                if (obj4 instanceof ov1) {
                    ov1Var = (ov1) obj4;
                } else {
                    ov1Var = null;
                }
                pv1Var.b.get(obj);
                Object obj5 = linkedHashMap.get(obj);
                if (obj5 == null) {
                    if (ov1Var == null || (obj5 = (Map) ov1Var.c.invoke(obj)) == null) {
                        obj5 = ot1.x;
                    }
                    linkedHashMap.put(obj, obj5);
                }
                Map map = (Map) obj5;
                if (ov1Var != null) {
                    return new j74(obj, ov1Var.b.invoke(obj), map, ov1Var.d);
                }
                ov3.p(obj, "Unknown screen ");
                return null;
            default:
                ((u34) obj3).b((n13) obj2);
                return pn6Var;
        }
    }
}
