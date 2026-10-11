package defpackage;

import com.anistation.model.download.EpisodeDownload;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class sj1 implements sb2 {
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ EpisodeDownload z;

    public /* synthetic */ sj1(ub2 ub2Var, EpisodeDownload episodeDownload) {
        this.y = ub2Var;
        this.z = episodeDownload;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        EpisodeDownload episodeDownload = this.z;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                if (episodeDownload != null) {
                    ub2Var.invoke(episodeDownload.getId());
                }
                return pn6Var;
            default:
                ub2Var.invoke(Boolean.valueOf(!episodeDownload.isPaused()));
                return pn6Var;
        }
    }

    public /* synthetic */ sj1(EpisodeDownload episodeDownload, ub2 ub2Var) {
        this.z = episodeDownload;
        this.y = ub2Var;
    }
}
