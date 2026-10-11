package defpackage;

import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl;
import com.anistation.local.dao.AnimeListDao_Impl;
import com.anistation.local.dao.WatchProgressDao_Impl;
import com.anistation.local.entity.WatchProgress;
import com.anistation.local.entity.WatchProgressSummary;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wm implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    public /* synthetic */ wm(int i, String str) {
        this.x = (byte) 6;
        this.z = i;
        this.y = str;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        boolean observeIsSaved$lambda$0;
        WatchProgress lastWatchedProgress$lambda$0;
        WatchProgressSummary progressSummary$lambda$0;
        List allWatchedProgress$lambda$0;
        pn6 stopReason$lambda$0;
        pn6 resetWorkSpecNextScheduleTimeOverride$lambda$0;
        byte b = this.x;
        int i = this.z;
        String str = this.y;
        g85 g85Var = (g85) obj;
        switch (b) {
            case 0:
                observeIsSaved$lambda$0 = AnimeListDao_Impl.observeIsSaved$lambda$0("\n        SELECT EXISTS(\n            SELECT 1 FROM anime_list\n            WHERE animeId = ? OR\n                (? > 0 AND anilistId = ?)\n        )\n        ", str, i, g85Var);
                return Boolean.valueOf(observeIsSaved$lambda$0);
            case 1:
                return SystemIdInfoDao_Impl.a(str, i, g85Var);
            case 2:
                return SystemIdInfoDao_Impl.b(str, i, g85Var);
            case 3:
                lastWatchedProgress$lambda$0 = WatchProgressDao_Impl.getLastWatchedProgress$lambda$0("\n        SELECT * FROM watch_progress\n        WHERE animeId = ? OR\n            (? > 0 AND anilistId = ?)\n        ORDER BY updatedAt DESC\n        LIMIT 1\n        ", str, i, g85Var);
                return lastWatchedProgress$lambda$0;
            case 4:
                progressSummary$lambda$0 = WatchProgressDao_Impl.getProgressSummary$lambda$0("\n        SELECT\n            animeId,\n            anilistId,\n            MAX(episodeNumber) AS highestStartedEpisode,\n            MAX(CASE WHEN completed = 1 THEN episodeNumber ELSE 0 END) AS completedEpisodes,\n            MAX(updatedAt) AS updatedAt\n        FROM watch_progress\n        WHERE animeId = ? OR\n            (? > 0 AND anilistId = ?)\n        GROUP BY animeId\n        ORDER BY CASE WHEN animeId = ? THEN 0 ELSE 1 END\n        LIMIT 1\n        ", str, i, g85Var);
                return progressSummary$lambda$0;
            case 5:
                allWatchedProgress$lambda$0 = WatchProgressDao_Impl.getAllWatchedProgress$lambda$0("\n        SELECT * FROM watch_progress\n        WHERE animeId = ? OR\n            (? > 0 AND anilistId = ?)\n        ORDER BY updatedAt DESC\n        ", str, i, g85Var);
                return allWatchedProgress$lambda$0;
            case 6:
                stopReason$lambda$0 = WorkSpecDao_Impl.setStopReason$lambda$0("UPDATE workspec SET stop_reason=? WHERE id=?", i, str, g85Var);
                return stopReason$lambda$0;
            default:
                resetWorkSpecNextScheduleTimeOverride$lambda$0 = WorkSpecDao_Impl.resetWorkSpecNextScheduleTimeOverride$lambda$0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)", str, i, g85Var);
                return resetWorkSpecNextScheduleTimeOverride$lambda$0;
        }
    }

    public /* synthetic */ wm(String str, int i, byte b) {
        this.x = b;
        this.y = str;
        this.z = i;
    }
}
