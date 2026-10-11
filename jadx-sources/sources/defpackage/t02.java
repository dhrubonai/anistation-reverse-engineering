package defpackage;

import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.external.ExternalDownloadRecord;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class t02 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ t02(long j, px5 px5Var) {
        this.x = (byte) 2;
        this.y = j;
        this.z = px5Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        float percentDownloaded;
        byte b = this.x;
        long j = this.y;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                Integer num = (Integer) obj2;
                ExternalDownloadRecord externalDownloadRecord = (ExternalDownloadRecord) obj;
                externalDownloadRecord.getClass();
                EpisodeDownloadState episodeDownloadState = EpisodeDownloadState.DOWNLOADING;
                if (num != null) {
                    percentDownloaded = num.intValue();
                } else {
                    percentDownloaded = externalDownloadRecord.getPercentDownloaded();
                }
                return ExternalDownloadRecord.copy$default(externalDownloadRecord, null, episodeDownloadState, percentDownloaded, Math.max(j, externalDownloadRecord.getBytesDownloaded()), 0L, 0, null, null, null, 0L, null, 2033, null);
            case 1:
                kd3 kd3Var = (kd3) obj2;
                kd3Var.d(c13.c(((c13) ((wj) obj).d()).a, j));
                kd3Var.c.invoke();
                return pn6Var;
            default:
                bp1.k0((bp1) obj, this.y, 0L, 0L, db.B(((Number) ((px5) obj2).getValue()).floatValue(), 0.0f, 1.0f), 118);
                return pn6Var;
        }
    }

    public /* synthetic */ t02(Object obj, long j, byte b) {
        this.x = b;
        this.z = obj;
        this.y = j;
    }
}
