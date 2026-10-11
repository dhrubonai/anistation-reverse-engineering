package defpackage;

import com.anistation.model.Anime;
import com.anistation.model.MediaStatus;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hm implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Anime y;

    public /* synthetic */ hm(Anime anime, byte b) {
        this.x = b;
        this.y = anime;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        boolean z;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z2 = false;
        Anime anime = this.y;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (kd2Var.V(intValue & 1, z2)) {
                    String label = anime.getFormat().getLabel();
                    long j = ep0.e;
                    n03.c(label, null, null, j, null, ep0.b, null, null, kd2Var, 199680, 214);
                    Integer seasonYear = anime.getSeasonYear();
                    if (seasonYear == null || (str = String.valueOf(seasonYear.intValue())) == null) {
                        str = "N/A";
                    }
                    n03.c(str, null, null, ep0.c, new s70(1.0f, new su5(ep0.b(0.15f, j))), j, null, null, kd2Var, 224256, 198);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    if (anime.getStatus() == MediaStatus.RELEASING) {
                        kd2Var2.e0(1379991537);
                        n03.c(anime.getStatus().getLabel(), null, null, ip0.m, null, ep0.e, null, null, kd2Var2, 196608, 214);
                        kd2Var2 = kd2Var2;
                        kd2Var2.q(false);
                    } else {
                        kd2Var2.e0(1380189503);
                        kd2Var2.q(false);
                    }
                    tq1 tq1Var = op0.a;
                    n03.b(null, null, ((mp0) kd2Var2.j(tq1Var)).o, ((mp0) kd2Var2.j(tq1Var)).n, null, nx7.R(-1233060555, new o0(anime, (byte) 26), kd2Var2), kd2Var2, 1572864, 43);
                    kd2 kd2Var3 = kd2Var2;
                    n03.c(anime.getFormat().getLabel(), null, null, ((mp0) kd2Var2.j(tq1Var)).o, null, ((mp0) kd2Var2.j(tq1Var)).n, null, null, kd2Var3, 0, 214);
                    if (anime.getSeasonYear() != null) {
                        kd2Var3.e0(1381581930);
                        n03.c(String.valueOf(anime.getSeasonYear()), null, null, ((mp0) kd2Var3.j(tq1Var)).r, null, ((mp0) kd2Var3.j(tq1Var)).o, null, null, kd2Var3, 0, 214);
                        kd2Var3.q(false);
                    } else {
                        kd2Var3.e0(1381848127);
                        kd2Var3.q(false);
                    }
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
