package defpackage;

import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gj1 extends t36 implements ic2 {
    public final /* synthetic */ tm1 x;
    public final /* synthetic */ Route.DownloadList y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj1(tm1 tm1Var, Route.DownloadList downloadList, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = tm1Var;
        this.y = downloadList;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new gj1(this.x, this.y, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        gj1 gj1Var = (gj1) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        gj1Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        Route.DownloadList downloadList = this.y;
        this.x.e(downloadList.getAnimeId(), downloadList.getAnilistId());
        return pn6.a;
    }
}
