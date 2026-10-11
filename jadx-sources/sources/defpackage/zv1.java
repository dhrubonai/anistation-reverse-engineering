package defpackage;

import com.anistation.model.download.EpisodeDownload;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class zv1 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ EpisodeDownload y;

    public /* synthetic */ zv1(EpisodeDownload episodeDownload, byte b) {
        this.x = b;
        this.y = episodeDownload;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        float progressFraction;
        byte b = this.x;
        EpisodeDownload episodeDownload = this.y;
        switch (b) {
            case 0:
                progressFraction = episodeDownload.getProgressFraction();
                break;
            case 1:
                progressFraction = episodeDownload.getProgressFraction();
                break;
            default:
                progressFraction = episodeDownload.getProgressFraction();
                break;
        }
        return Float.valueOf(progressFraction);
    }
}
