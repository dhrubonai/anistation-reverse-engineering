package defpackage;

import com.anistation.model.download.DownloadAnimeGroup;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jm1 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ DownloadAnimeGroup z;

    public /* synthetic */ jm1(ub2 ub2Var, DownloadAnimeGroup downloadAnimeGroup, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = downloadAnimeGroup;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        DownloadAnimeGroup downloadAnimeGroup = this.z;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                ub2Var.invoke(downloadAnimeGroup);
                return pn6Var;
            default:
                ub2Var.invoke(downloadAnimeGroup.getAnimeId());
                return pn6Var;
        }
    }
}
