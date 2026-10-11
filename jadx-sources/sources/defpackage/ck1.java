package defpackage;

import com.anistation.model.download.EpisodeDownload;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ck1 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ EpisodeDownload z;

    public ck1(EpisodeDownload episodeDownload, ub2 ub2Var) {
        this.x = (byte) 2;
        this.z = episodeDownload;
        this.y = ub2Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        EpisodeDownload episodeDownload = this.z;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                ub2Var.invoke(episodeDownload.getId());
                return pn6Var;
            case 1:
                ub2Var.invoke(episodeDownload.getId());
                return pn6Var;
            case 2:
                if (episodeDownload.isCompleted()) {
                    ub2Var.invoke(episodeDownload.getId());
                }
                return pn6Var;
            default:
                ub2Var.invoke(episodeDownload.getId());
                return pn6Var;
        }
    }

    public /* synthetic */ ck1(ub2 ub2Var, EpisodeDownload episodeDownload, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = episodeDownload;
    }
}
