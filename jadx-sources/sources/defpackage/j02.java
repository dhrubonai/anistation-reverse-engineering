package defpackage;

import com.anistation.download.service.ExternalDownloadService;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.external.ExternalDownloadRecord;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class j02 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ File y;

    public /* synthetic */ j02(File file, byte b) {
        this.x = b;
        this.y = file;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        File file = this.y;
        switch (b) {
            case 0:
                ExternalDownloadRecord externalDownloadRecord = (ExternalDownloadRecord) obj;
                int i = ExternalDownloadService.R;
                externalDownloadRecord.getClass();
                return ExternalDownloadRecord.copy$default(externalDownloadRecord, null, EpisodeDownloadState.DOWNLOADING, 99.0f, file.length(), 0L, 0, null, null, null, 0L, null, 2033, null);
            default:
                ExternalDownloadRecord externalDownloadRecord2 = (ExternalDownloadRecord) obj;
                externalDownloadRecord2.getClass();
                return ExternalDownloadRecord.copy$default(externalDownloadRecord2, null, null, 0.0f, 0L, 0L, 0, null, null, null, 0L, file.getName(), 1023, null);
        }
    }
}
