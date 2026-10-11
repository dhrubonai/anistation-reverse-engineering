package defpackage;

import com.anistation.local.dao.AnimeListDao_Impl;
import com.anistation.local.entity.AnimeListItem;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xm implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ xm(int i, Object obj, byte b) {
        this.x = b;
        this.y = i;
        this.z = obj;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        AnimeListItem legacyByAnilistId$lambda$0;
        ub2 ub2Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.y;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                legacyByAnilistId$lambda$0 = AnimeListDao_Impl.getLegacyByAnilistId$lambda$0("\n        SELECT * FROM anime_list\n        WHERE anilistId = ? AND animeId = CAST(? AS TEXT)\n        LIMIT 1\n        ", i, (AnimeListDao_Impl) obj2, (g85) obj);
                return legacyByAnilistId$lambda$0;
            case 1:
                boolean i1 = ((h82) obj).i1(i);
                ((w05) obj2).x = Boolean.valueOf(i1);
                return Boolean.valueOf(i1);
            case 2:
                zd3 zd3Var = (zd3) obj;
                k91 k91Var = ((wc3) obj2).a;
                ft5 b2 = et5.b();
                if (b2 != null) {
                    ub2Var = b2.e();
                } else {
                    ub2Var = null;
                }
                et5.k(b2, et5.e(b2), ub2Var);
                k91Var.getClass();
                int i2 = zd3Var.a;
                if (i2 == -1) {
                    i2 = 2;
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    zd3Var.a(i + i3);
                }
                return pn6Var;
            case 3:
                return Boolean.valueOf(((List) obj).addAll(i, (Collection) obj2));
            default:
                ((String) obj).getClass();
                ((ub2) obj2).invoke(Integer.valueOf(i));
                return pn6Var;
        }
    }

    public /* synthetic */ xm(Object obj, int i, byte b) {
        this.x = b;
        this.z = obj;
        this.y = i;
    }
}
