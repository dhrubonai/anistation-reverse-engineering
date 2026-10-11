package defpackage;

import androidx.work.impl.model.WorkSpecDao_Impl;
import com.anistation.download.service.ExternalDownloadService;
import com.anistation.local.dao.WatchProgressDao_Impl;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.external.ExternalDownloadRecord;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class da implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;

    public /* synthetic */ da(af3 af3Var, int i) {
        this.x = (byte) 7;
        this.y = i;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        ub2 ub2Var;
        List legacyProgress$lambda$0;
        List allEligibleWorkSpecsForScheduling$lambda$0;
        List eligibleWorkForScheduling$lambda$0;
        byte b = this.x;
        int i = this.y;
        switch (b) {
            case 0:
                return Boolean.valueOf(((h82) obj).i1(i));
            case 1:
                return Boolean.valueOf(((h82) obj).i1(i));
            case 2:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
            case 3:
                ExternalDownloadRecord externalDownloadRecord = (ExternalDownloadRecord) obj;
                int i2 = ExternalDownloadService.R;
                externalDownloadRecord.getClass();
                return ExternalDownloadRecord.copy$default(externalDownloadRecord, null, EpisodeDownloadState.FAILED, 0.0f, 0L, 0L, this.y, null, null, null, 0L, null, 2013, null);
            case 4:
                return Boolean.valueOf(((h82) obj).i1(i));
            case 5:
                return Boolean.valueOf(((h82) obj).i1(i));
            case 6:
                return Boolean.valueOf(((h82) obj).a1(i));
            case 7:
                zd3 zd3Var = (zd3) obj;
                ft5 b2 = et5.b();
                if (b2 != null) {
                    ub2Var = b2.e();
                } else {
                    ub2Var = null;
                }
                et5.k(b2, et5.e(b2), ub2Var);
                int i3 = zd3Var.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    zd3Var.a(i + i4);
                }
                return pn6.a;
            case 8:
                legacyProgress$lambda$0 = WatchProgressDao_Impl.getLegacyProgress$lambda$0("\n        SELECT * FROM watch_progress\n        WHERE anilistId = ? AND animeId = CAST(? AS TEXT)\n        ", i, (g85) obj);
                return legacyProgress$lambda$0;
            case 9:
                allEligibleWorkSpecsForScheduling$lambda$0 = WorkSpecDao_Impl.getAllEligibleWorkSpecsForScheduling$lambda$0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", i, (g85) obj);
                return allEligibleWorkSpecsForScheduling$lambda$0;
            default:
                eligibleWorkForScheduling$lambda$0 = WorkSpecDao_Impl.getEligibleWorkForScheduling$lambda$0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", i, (g85) obj);
                return eligibleWorkForScheduling$lambda$0;
        }
    }

    public /* synthetic */ da(int i, byte b) {
        this.x = b;
        this.y = i;
    }
}
