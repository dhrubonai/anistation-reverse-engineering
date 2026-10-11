package defpackage;

import com.anistation.local.dao.AnimeListDao_Impl;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class um implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ AnimeListDao_Impl y;

    public /* synthetic */ um(AnimeListDao_Impl animeListDao_Impl, byte b) {
        this.x = b;
        this.y = animeListDao_Impl;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        AnimeListDao_Impl animeListDao_Impl = this.y;
        g85 g85Var = (g85) obj;
        switch (b) {
            case 0:
                return AnimeListDao_Impl.c(animeListDao_Impl, g85Var);
            case 1:
                return AnimeListDao_Impl.d(animeListDao_Impl, g85Var);
            default:
                return AnimeListDao_Impl.b(animeListDao_Impl, g85Var);
        }
    }
}
