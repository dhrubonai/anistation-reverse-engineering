package defpackage;

import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl;
import com.anistation.local.dao.WatchProgressDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class dr6 implements ub2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ dr6(byte b) {
        this.x = b;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        List allLastWatchedProgress$lambda$0;
        pn6 clearRemovedWatchHistory$lambda$0;
        pn6 clearAll$lambda$0;
        List progressSummaries$lambda$0;
        List allRemovedOnce$lambda$0;
        List allOnce$lambda$0;
        pn6 deleteAll$lambda$0;
        List allUnfinishedWork$lambda$0;
        List scheduledWorkWithContentUris$lambda$0;
        int countNonFinishedContentUriTriggerWorkers$lambda$0;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ol olVar = (ol) obj;
                float f = olVar.a;
                float f2 = olVar.b;
                return new xc4((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            case 1:
                long j = ((c13) obj).a;
                return new ol((int) (j >> 32), (int) (j & 4294967295L));
            case 2:
                ol olVar2 = (ol) obj;
                return new c13((Math.round(olVar2.b) & 4294967295L) | (Math.round(olVar2.a) << 32));
            case 3:
                long j2 = ((k13) obj).a;
                return new ol((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 4:
                ol olVar3 = (ol) obj;
                int round = Math.round(olVar3.a);
                int i = 0;
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(olVar3.b);
                if (round2 >= 0) {
                    i = round2;
                }
                return new k13((round << 32) | (i & 4294967295L));
            case 5:
                n05 n05Var = (n05) obj;
                return new ql(n05Var.a, n05Var.b, n05Var.c, n05Var.d);
            case 6:
                ql qlVar = (ql) obj;
                return new n05(qlVar.a, qlVar.b, qlVar.c, qlVar.d);
            case 7:
                return Float.valueOf(((nl) obj).a);
            case 8:
                e04 e04Var = (e04) obj;
                e04Var.getClass();
                iz5.b(e04Var, z05.a(v27.class), new ao5((byte) 11));
                return pn6Var;
            case 9:
                allLastWatchedProgress$lambda$0 = WatchProgressDao_Impl.getAllLastWatchedProgress$lambda$0("\n        SELECT * FROM watch_progress AS wp\n        WHERE wp.id = (\n            SELECT id FROM watch_progress\n            WHERE animeId = wp.animeId\n            ORDER BY updatedAt DESC, episodeNumber DESC\n            LIMIT 1\n        )\n        AND wp.animeId NOT IN (SELECT animeId FROM removed_watch_progress)\n        ORDER BY updatedAt DESC\n        ", (g85) obj);
                return allLastWatchedProgress$lambda$0;
            case 10:
                clearRemovedWatchHistory$lambda$0 = WatchProgressDao_Impl.clearRemovedWatchHistory$lambda$0("DELETE FROM removed_watch_progress", (g85) obj);
                return clearRemovedWatchHistory$lambda$0;
            case 11:
                clearAll$lambda$0 = WatchProgressDao_Impl.clearAll$lambda$0("DELETE FROM watch_progress", (g85) obj);
                return clearAll$lambda$0;
            case 12:
                progressSummaries$lambda$0 = WatchProgressDao_Impl.getProgressSummaries$lambda$0("\n        SELECT\n            animeId,\n            anilistId,\n            MAX(episodeNumber) AS highestStartedEpisode,\n            MAX(CASE WHEN completed = 1 THEN episodeNumber ELSE 0 END) AS completedEpisodes,\n            MAX(updatedAt) AS updatedAt\n        FROM watch_progress\n        GROUP BY animeId\n        ", (g85) obj);
                return progressSummaries$lambda$0;
            case 13:
                allRemovedOnce$lambda$0 = WatchProgressDao_Impl.getAllRemovedOnce$lambda$0("SELECT * FROM removed_watch_progress ORDER BY animeId", (g85) obj);
                return allRemovedOnce$lambda$0;
            case 14:
                allOnce$lambda$0 = WatchProgressDao_Impl.getAllOnce$lambda$0("SELECT * FROM watch_progress ORDER BY updatedAt DESC", (g85) obj);
                return allOnce$lambda$0;
            case 15:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 16:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 17:
                ((Long) obj).getClass();
                return pn6Var;
            case 18:
                ((Long) obj).getClass();
                return pn6Var;
            case 19:
                return Float.valueOf(((Float) obj).floatValue() * 0.32f);
            case 20:
                p55 p55Var = (p55) obj;
                p55Var.getClass();
                p55Var.k(p75.a(20.0f));
                p55Var.e(true);
                return pn6Var;
            case 21:
                Throwable th = (Throwable) obj;
                th.getClass();
                return th.getCause();
            case 22:
                return ((z57) obj).f;
            case 23:
                return ((z57) obj).c;
            case 24:
                g67 g67Var = (g67) obj;
                g67Var.getClass();
                return g67Var;
            case 25:
                gx0 gx0Var = (gx0) obj;
                gx0Var.getClass();
                return gx0Var.getClass().getSimpleName();
            case 26:
                deleteAll$lambda$0 = WorkProgressDao_Impl.deleteAll$lambda$0("DELETE FROM WorkProgress", (g85) obj);
                return deleteAll$lambda$0;
            case 27:
                allUnfinishedWork$lambda$0 = WorkSpecDao_Impl.getAllUnfinishedWork$lambda$0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", (g85) obj);
                return allUnfinishedWork$lambda$0;
            case 28:
                scheduledWorkWithContentUris$lambda$0 = WorkSpecDao_Impl.getScheduledWorkWithContentUris$lambda$0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", (g85) obj);
                return scheduledWorkWithContentUris$lambda$0;
            default:
                countNonFinishedContentUriTriggerWorkers$lambda$0 = WorkSpecDao_Impl.countNonFinishedContentUriTriggerWorkers$lambda$0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", (g85) obj);
                return Integer.valueOf(countNonFinishedContentUriTriggerWorkers$lambda$0);
        }
    }
}
