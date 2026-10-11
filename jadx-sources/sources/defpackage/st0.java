package defpackage;

import android.content.Context;
import com.anistation.local.AniStationDatabase;
import com.anistation.model.Recent;
import com.anistation.model.download.DownloadAnimeGroup;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class st0 implements ic2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ st0(tr2 tr2Var) {
        this.x = (byte) 23;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        hq0 hq0Var;
        byte b = this.x;
        boolean z = false;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((za3) ((tt0) obj)).d0((vo3) obj2);
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                ((za3) ((tt0) obj)).getClass();
                return pn6Var;
            case 2:
                ai4 ai4Var = (ai4) obj;
                int intValue = ((Integer) obj2).intValue();
                ai4Var.getClass();
                return Character.valueOf(((String) ai4Var.x).charAt(intValue));
            case 3:
                ((Character) obj).getClass();
                ((Integer) obj2).getClass();
                return Boolean.FALSE;
            case 4:
                l11 l11Var = (l11) obj;
                j11 j11Var = (j11) obj2;
                l11Var.getClass();
                j11Var.getClass();
                l11 minusKey = l11Var.minusKey(j11Var.getKey());
                it1 it1Var = it1.x;
                if (minusKey != it1Var) {
                    h95 h95Var = h95.B;
                    n11 n11Var = (n11) minusKey.get(h95Var);
                    if (n11Var == null) {
                        hq0Var = new hq0(j11Var, minusKey);
                    } else {
                        l11 minusKey2 = minusKey.minusKey(h95Var);
                        if (minusKey2 == it1Var) {
                            return new hq0(n11Var, j11Var);
                        }
                        hq0Var = new hq0(n11Var, new hq0(j11Var, minusKey2));
                    }
                    return hq0Var;
                }
                return j11Var;
            case 5:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 6:
                return ((l11) obj).plus((j11) obj2);
            case 7:
                return ((l11) obj).plus((j11) obj2);
            case 8:
                xx3 xx3Var = (xx3) obj;
                Throwable th = (Throwable) obj2;
                xx3Var.getClass();
                zq0 zq0Var = xx3Var.b;
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                zq0Var.g0(th);
                return pn6Var;
            case 9:
                dc5 dc5Var = (dc5) obj;
                li4 li4Var = (li4) obj2;
                dc5Var.getClass();
                li4Var.getClass();
                return new pf1((pn) dc5Var.d(z05.a(pn.class), null, null), (cy6) dc5Var.d(z05.a(cy6.class), null, null), (cn) dc5Var.d(z05.a(cn.class), null, null), (String) li4Var.a(z05.a(String.class)));
            case 10:
                ((Integer) obj2).getClass();
                qi1.e(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 11:
                ((Integer) obj2).getClass();
                qi1.b(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 12:
                dc5 dc5Var2 = (dc5) obj;
                dc5Var2.getClass();
                ((li4) obj2).getClass();
                return new zl1((Context) dc5Var2.d(z05.a(Context.class), null, null));
            case 13:
                dc5 dc5Var3 = (dc5) obj;
                dc5Var3.getClass();
                ((li4) obj2).getClass();
                return new fl1((ok1) dc5Var3.d(z05.a(ok1.class), null, null), (Context) dc5Var3.d(z05.a(Context.class), null, null));
            case 14:
                dc5 dc5Var4 = (dc5) obj;
                dc5Var4.getClass();
                ((li4) obj2).getClass();
                return new tm1((qk1) dc5Var4.d(z05.a(qk1.class), null, null), (cy6) dc5Var4.d(z05.a(cy6.class), null, null));
            case 15:
                ((Integer) obj).intValue();
                DownloadAnimeGroup downloadAnimeGroup = (DownloadAnimeGroup) obj2;
                downloadAnimeGroup.getClass();
                return downloadAnimeGroup.getAnimeId();
            case 16:
                return Boolean.valueOf(a34.i(obj, obj2));
            case 17:
                dc5 dc5Var5 = (dc5) obj;
                dc5Var5.getClass();
                ((li4) obj2).getClass();
                return new rn2((pn) dc5Var5.d(z05.a(pn.class), null, null), (cy6) dc5Var5.d(z05.a(cy6.class), null, null));
            case 18:
                ((Integer) obj).intValue();
                Recent recent = (Recent) obj2;
                recent.getClass();
                Object id = recent.getId();
                if (id == null) {
                    id = Integer.valueOf(recent.getAnilistId());
                }
                return "recent-block2-" + id + "-" + recent.getEpisodeNumber();
            case 19:
                ((Integer) obj).intValue();
                Recent recent2 = (Recent) obj2;
                recent2.getClass();
                Object id2 = recent2.getId();
                if (id2 == null) {
                    id2 = Integer.valueOf(recent2.getAnilistId());
                }
                return "recent-remaining-" + id2 + "-" + recent2.getEpisodeNumber();
            case 20:
                ((Integer) obj).intValue();
                Recent recent3 = (Recent) obj2;
                recent3.getClass();
                Object id3 = recent3.getId();
                if (id3 == null) {
                    id3 = Integer.valueOf(recent3.getAnilistId());
                }
                return "recent-block1-" + id3 + "-" + recent3.getEpisodeNumber();
            case 21:
                char charValue = ((Character) obj).charValue();
                ((Integer) obj2).intValue();
                if (charValue == ' ') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                ((fs2) obj).getClass();
                ((or2) obj2).getClass();
                return pn6Var;
            case 23:
                int intValue2 = ((Integer) obj2).intValue();
                ((es2) obj).getClass();
                return Long.valueOf(o2.x.g() + Math.min((long) (Math.pow(2.0d, intValue2 - 1) * 1000.0d), 60000L));
            case 24:
                ((Integer) obj2).intValue();
                return new li2(tl7.e(1));
            case 25:
                wc3 wc3Var = (wc3) obj2;
                return te4.I(Integer.valueOf(wc3Var.d.b.h()), Integer.valueOf(wc3Var.d.c.h()));
            case 26:
                af3 af3Var = (af3) obj2;
                return te4.I(Integer.valueOf(af3Var.h()), Integer.valueOf(af3Var.i()));
            case 27:
                Map c = ((df3) obj2).c();
                if (c.isEmpty()) {
                    return null;
                }
                return c;
            case 28:
                dc5 dc5Var6 = (dc5) obj;
                dc5Var6.getClass();
                ((li4) obj2).getClass();
                q65 l = wc7.l(o80.j(dc5Var6), AniStationDatabase.class, "anistation_database");
                l.a(n03.k, n03.l, n03.m);
                return (AniStationDatabase) l.b();
            default:
                dc5 dc5Var7 = (dc5) obj;
                dc5Var7.getClass();
                ((li4) obj2).getClass();
                return ((AniStationDatabase) dc5Var7.d(z05.a(AniStationDatabase.class), null, null)).watchProgressDao();
        }
    }

    public /* synthetic */ st0(byte b) {
        this.x = b;
    }
}
