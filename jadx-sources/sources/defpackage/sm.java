package defpackage;

import com.anistation.local.dao.AnimeListDao_Impl;
import com.anistation.local.entity.AnimeListItem;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sm extends xz0 {
    public AnimeListItem A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ AnimeListDao_Impl D;
    public int E;
    public tm x;
    public String y;
    public AnimeListItem z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(AnimeListDao_Impl animeListDao_Impl, vz0 vz0Var) {
        super(vz0Var);
        this.D = animeListDao_Impl;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return tm.a(this.D, null, 0, this);
    }
}
