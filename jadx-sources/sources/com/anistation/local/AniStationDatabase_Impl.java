package com.anistation.local;

import com.anistation.local.AniStationDatabase_Impl;
import com.anistation.local.dao.AnimeListDao_Impl;
import com.anistation.local.dao.WatchProgressDao_Impl;
import defpackage.d46;
import defpackage.e73;
import defpackage.fy5;
import defpackage.g85;
import defpackage.i33;
import defpackage.jx;
import defpackage.n03;
import defpackage.oy3;
import defpackage.rb3;
import defpackage.s66;
import defpackage.sb2;
import defpackage.tm;
import defpackage.v66;
import defpackage.y65;
import defpackage.z05;
import defpackage.z65;
import defpackage.zx6;
import defpackage.zz;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AniStationDatabase_Impl extends AniStationDatabase {
    private final rb3 _animeListDao;
    private final rb3 _watchProgressDao;

    public AniStationDatabase_Impl() {
        final byte b = 0;
        this._watchProgressDao = new d46(new sb2(this) { // from class: kh
            public final /* synthetic */ AniStationDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                WatchProgressDao_Impl _watchProgressDao$lambda$0;
                AnimeListDao_Impl _animeListDao$lambda$0;
                byte b2 = b;
                AniStationDatabase_Impl aniStationDatabase_Impl = this.y;
                switch (b2) {
                    case 0:
                        _watchProgressDao$lambda$0 = AniStationDatabase_Impl._watchProgressDao$lambda$0(aniStationDatabase_Impl);
                        return _watchProgressDao$lambda$0;
                    default:
                        _animeListDao$lambda$0 = AniStationDatabase_Impl._animeListDao$lambda$0(aniStationDatabase_Impl);
                        return _animeListDao$lambda$0;
                }
            }
        });
        final byte b2 = 1;
        this._animeListDao = new d46(new sb2(this) { // from class: kh
            public final /* synthetic */ AniStationDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                WatchProgressDao_Impl _watchProgressDao$lambda$0;
                AnimeListDao_Impl _animeListDao$lambda$0;
                byte b22 = b2;
                AniStationDatabase_Impl aniStationDatabase_Impl = this.y;
                switch (b22) {
                    case 0:
                        _watchProgressDao$lambda$0 = AniStationDatabase_Impl._watchProgressDao$lambda$0(aniStationDatabase_Impl);
                        return _watchProgressDao$lambda$0;
                    default:
                        _animeListDao$lambda$0 = AniStationDatabase_Impl._animeListDao$lambda$0(aniStationDatabase_Impl);
                        return _animeListDao$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimeListDao_Impl _animeListDao$lambda$0(AniStationDatabase_Impl aniStationDatabase_Impl) {
        return new AnimeListDao_Impl(aniStationDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchProgressDao_Impl _watchProgressDao$lambda$0(AniStationDatabase_Impl aniStationDatabase_Impl) {
        return new WatchProgressDao_Impl(aniStationDatabase_Impl);
    }

    @Override // com.anistation.local.AniStationDatabase
    public tm animeListDao() {
        return (tm) this._animeListDao.getValue();
    }

    public void clearAllTables() {
        performClear(false, "watch_progress", "anime_list", "removed_watch_progress");
    }

    @Override // defpackage.v65
    public List<oy3> createAutoMigrations(Map<e73, ? extends jx> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // defpackage.v65
    public i33 createInvalidationTracker() {
        return new i33(this, new LinkedHashMap(), new LinkedHashMap(), "watch_progress", "anime_list", "removed_watch_progress");
    }

    @Override // defpackage.v65
    public z65 createOpenDelegate() {
        return new z65() { // from class: com.anistation.local.AniStationDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(4, "aa53dc6cded4707368838a2aded559ef", "d9d4fca48a7c5b783c24b42c8db4d748");
            }

            @Override // defpackage.z65
            public void createAllTables(g85 g85Var) {
                g85Var.getClass();
                zz.y("CREATE TABLE IF NOT EXISTS `watch_progress` (`id` TEXT NOT NULL, `animeId` TEXT NOT NULL, `anistationId` TEXT, `anilistId` INTEGER NOT NULL, `malId` INTEGER NOT NULL, `animeTitle` TEXT, `episodeTitle` TEXT NOT NULL, `coverImage` TEXT, `thumbnailImage` TEXT, `episodeNumber` INTEGER NOT NULL, `positionMs` INTEGER NOT NULL, `durationMs` INTEGER NOT NULL, `completed` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`id`))", g85Var);
                zz.y("CREATE TABLE IF NOT EXISTS `anime_list` (`animeId` TEXT NOT NULL, `anistationId` TEXT, `anilistId` INTEGER NOT NULL, `malId` INTEGER, `title` TEXT NOT NULL, `coverImage` TEXT, `bannerImage` TEXT, `totalEpisodes` INTEGER, `currentAiredEpisodes` INTEGER NOT NULL, `mediaStatus` TEXT, `watchStatus` TEXT NOT NULL, `importedProgress` INTEGER NOT NULL, `score` INTEGER NOT NULL, `format` TEXT, `notes` TEXT, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`animeId`))", g85Var);
                zz.y("CREATE TABLE IF NOT EXISTS `removed_watch_progress` (`animeId` TEXT NOT NULL, PRIMARY KEY(`animeId`))", g85Var);
                zz.y("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", g85Var);
                zz.y("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'aa53dc6cded4707368838a2aded559ef')", g85Var);
            }

            @Override // defpackage.z65
            public void dropAllTables(g85 g85Var) {
                g85Var.getClass();
                zz.y("DROP TABLE IF EXISTS `watch_progress`", g85Var);
                zz.y("DROP TABLE IF EXISTS `anime_list`", g85Var);
                zz.y("DROP TABLE IF EXISTS `removed_watch_progress`", g85Var);
            }

            @Override // defpackage.z65
            public void onCreate(g85 g85Var) {
                g85Var.getClass();
            }

            @Override // defpackage.z65
            public void onOpen(g85 g85Var) {
                g85Var.getClass();
                AniStationDatabase_Impl.this.internalInitInvalidationTracker(g85Var);
            }

            @Override // defpackage.z65
            public void onPostMigrate(g85 g85Var) {
                g85Var.getClass();
            }

            @Override // defpackage.z65
            public void onPreMigrate(g85 g85Var) {
                g85Var.getClass();
                n03.n(g85Var);
            }

            @Override // defpackage.z65
            public y65 onValidateSchema(g85 g85Var) {
                g85Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new s66(1, 1, "id", "TEXT", null, true));
                linkedHashMap.put("animeId", new s66(0, 1, "animeId", "TEXT", null, true));
                linkedHashMap.put("anistationId", new s66(0, 1, "anistationId", "TEXT", null, false));
                linkedHashMap.put("anilistId", new s66(0, 1, "anilistId", "INTEGER", null, true));
                linkedHashMap.put("malId", new s66(0, 1, "malId", "INTEGER", null, true));
                linkedHashMap.put("animeTitle", new s66(0, 1, "animeTitle", "TEXT", null, false));
                linkedHashMap.put("episodeTitle", new s66(0, 1, "episodeTitle", "TEXT", null, true));
                linkedHashMap.put("coverImage", new s66(0, 1, "coverImage", "TEXT", null, false));
                linkedHashMap.put("thumbnailImage", new s66(0, 1, "thumbnailImage", "TEXT", null, false));
                linkedHashMap.put("episodeNumber", new s66(0, 1, "episodeNumber", "INTEGER", null, true));
                linkedHashMap.put("positionMs", new s66(0, 1, "positionMs", "INTEGER", null, true));
                linkedHashMap.put("durationMs", new s66(0, 1, "durationMs", "INTEGER", null, true));
                linkedHashMap.put("completed", new s66(0, 1, "completed", "INTEGER", null, true));
                linkedHashMap.put("updatedAt", new s66(0, 1, "updatedAt", "INTEGER", null, true));
                v66 v66Var = new v66("watch_progress", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                v66 g = fy5.g("watch_progress", g85Var);
                if (!v66Var.equals(g)) {
                    return new y65("watch_progress(com.anistation.local.entity.WatchProgress).\n Expected:\n" + v66Var + "\n Found:\n" + g, false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("animeId", new s66(1, 1, "animeId", "TEXT", null, true));
                linkedHashMap2.put("anistationId", new s66(0, 1, "anistationId", "TEXT", null, false));
                linkedHashMap2.put("anilistId", new s66(0, 1, "anilistId", "INTEGER", null, true));
                linkedHashMap2.put("malId", new s66(0, 1, "malId", "INTEGER", null, false));
                linkedHashMap2.put("title", new s66(0, 1, "title", "TEXT", null, true));
                linkedHashMap2.put("coverImage", new s66(0, 1, "coverImage", "TEXT", null, false));
                linkedHashMap2.put("bannerImage", new s66(0, 1, "bannerImage", "TEXT", null, false));
                linkedHashMap2.put("totalEpisodes", new s66(0, 1, "totalEpisodes", "INTEGER", null, false));
                linkedHashMap2.put("currentAiredEpisodes", new s66(0, 1, "currentAiredEpisodes", "INTEGER", null, true));
                linkedHashMap2.put("mediaStatus", new s66(0, 1, "mediaStatus", "TEXT", null, false));
                linkedHashMap2.put("watchStatus", new s66(0, 1, "watchStatus", "TEXT", null, true));
                linkedHashMap2.put("importedProgress", new s66(0, 1, "importedProgress", "INTEGER", null, true));
                linkedHashMap2.put("score", new s66(0, 1, "score", "INTEGER", null, true));
                linkedHashMap2.put("format", new s66(0, 1, "format", "TEXT", null, false));
                linkedHashMap2.put("notes", new s66(0, 1, "notes", "TEXT", null, false));
                linkedHashMap2.put("createdAt", new s66(0, 1, "createdAt", "INTEGER", null, true));
                linkedHashMap2.put("updatedAt", new s66(0, 1, "updatedAt", "INTEGER", null, true));
                v66 v66Var2 = new v66("anime_list", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                v66 g2 = fy5.g("anime_list", g85Var);
                if (!v66Var2.equals(g2)) {
                    return new y65("anime_list(com.anistation.local.entity.AnimeListItem).\n Expected:\n" + v66Var2 + "\n Found:\n" + g2, false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("animeId", new s66(1, 1, "animeId", "TEXT", null, true));
                v66 v66Var3 = new v66("removed_watch_progress", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                v66 g3 = fy5.g("removed_watch_progress", g85Var);
                if (!v66Var3.equals(g3)) {
                    return new y65("removed_watch_progress(com.anistation.local.entity.RemovedWatchProgress).\n Expected:\n" + v66Var3 + "\n Found:\n" + g3, false);
                }
                return new y65(null, true);
            }
        };
    }

    @Override // defpackage.v65
    public Set<e73> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // defpackage.v65
    public Map<e73, List<e73>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(z05.a(zx6.class), WatchProgressDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(z05.a(tm.class), AnimeListDao_Impl.Companion.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // com.anistation.local.AniStationDatabase
    public zx6 watchProgressDao() {
        return (zx6) this._watchProgressDao.getValue();
    }
}
