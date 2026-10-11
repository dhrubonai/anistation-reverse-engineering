package com.anistation.local.dao;

import android.database.SQLException;
import com.anistation.local.entity.RemovedWatchProgress;
import com.anistation.local.entity.WatchProgress;
import com.anistation.local.entity.WatchProgressSummary;
import defpackage.a34;
import defpackage.ay6;
import defpackage.by6;
import defpackage.da;
import defpackage.dr6;
import defpackage.e73;
import defpackage.g85;
import defpackage.jv1;
import defpackage.kv1;
import defpackage.ll5;
import defpackage.lv1;
import defpackage.m85;
import defpackage.nt1;
import defpackage.pn6;
import defpackage.q23;
import defpackage.q71;
import defpackage.t80;
import defpackage.v65;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.wm;
import defpackage.zg;
import defpackage.zx6;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WatchProgressDao_Impl implements zx6 {
    public static final Companion Companion = new Companion(null);
    private final v65 __db;
    private final kv1 __insertAdapterOfRemovedWatchProgress;
    private final lv1 __upsertAdapterOfWatchProgress;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.anistation.local.dao.WatchProgressDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kv1 {
        @Override // defpackage.kv1
        public void bind(m85 m85Var, RemovedWatchProgress removedWatchProgress) {
            m85Var.getClass();
            removedWatchProgress.getClass();
            m85Var.J(1, removedWatchProgress.getAnimeId());
        }

        @Override // defpackage.kv1
        public String createQuery() {
            return "INSERT OR REPLACE INTO `removed_watch_progress` (`animeId`) VALUES (?)";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.anistation.local.dao.WatchProgressDao_Impl$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kv1 {
        @Override // defpackage.kv1
        public void bind(m85 m85Var, WatchProgress watchProgress) {
            m85Var.getClass();
            watchProgress.getClass();
            m85Var.J(1, watchProgress.getId());
            m85Var.J(2, watchProgress.getAnimeId());
            String anistationId = watchProgress.getAnistationId();
            if (anistationId == null) {
                m85Var.h(3);
            } else {
                m85Var.J(3, anistationId);
            }
            m85Var.e(4, watchProgress.getAnilistId());
            m85Var.e(5, watchProgress.getMalId());
            String animeTitle = watchProgress.getAnimeTitle();
            if (animeTitle == null) {
                m85Var.h(6);
            } else {
                m85Var.J(6, animeTitle);
            }
            m85Var.J(7, watchProgress.getEpisodeTitle());
            String coverImage = watchProgress.getCoverImage();
            if (coverImage == null) {
                m85Var.h(8);
            } else {
                m85Var.J(8, coverImage);
            }
            String thumbnailImage = watchProgress.getThumbnailImage();
            if (thumbnailImage == null) {
                m85Var.h(9);
            } else {
                m85Var.J(9, thumbnailImage);
            }
            m85Var.e(10, watchProgress.getEpisodeNumber());
            m85Var.e(11, watchProgress.getPositionMs());
            m85Var.e(12, watchProgress.getDurationMs());
            m85Var.e(13, watchProgress.getCompleted() ? 1L : 0L);
            m85Var.e(14, watchProgress.getUpdatedAt());
        }

        @Override // defpackage.kv1
        public String createQuery() {
            return "INSERT INTO `watch_progress` (`id`,`animeId`,`anistationId`,`anilistId`,`malId`,`animeTitle`,`episodeTitle`,`coverImage`,`thumbnailImage`,`episodeNumber`,`positionMs`,`durationMs`,`completed`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.anistation.local.dao.WatchProgressDao_Impl$3 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends jv1 {
        @Override // defpackage.jv1
        public void bind(m85 m85Var, WatchProgress watchProgress) {
            m85Var.getClass();
            watchProgress.getClass();
            m85Var.J(1, watchProgress.getId());
            m85Var.J(2, watchProgress.getAnimeId());
            String anistationId = watchProgress.getAnistationId();
            if (anistationId == null) {
                m85Var.h(3);
            } else {
                m85Var.J(3, anistationId);
            }
            m85Var.e(4, watchProgress.getAnilistId());
            m85Var.e(5, watchProgress.getMalId());
            String animeTitle = watchProgress.getAnimeTitle();
            if (animeTitle == null) {
                m85Var.h(6);
            } else {
                m85Var.J(6, animeTitle);
            }
            m85Var.J(7, watchProgress.getEpisodeTitle());
            String coverImage = watchProgress.getCoverImage();
            if (coverImage == null) {
                m85Var.h(8);
            } else {
                m85Var.J(8, coverImage);
            }
            String thumbnailImage = watchProgress.getThumbnailImage();
            if (thumbnailImage == null) {
                m85Var.h(9);
            } else {
                m85Var.J(9, thumbnailImage);
            }
            m85Var.e(10, watchProgress.getEpisodeNumber());
            m85Var.e(11, watchProgress.getPositionMs());
            m85Var.e(12, watchProgress.getDurationMs());
            m85Var.e(13, watchProgress.getCompleted() ? 1L : 0L);
            m85Var.e(14, watchProgress.getUpdatedAt());
            m85Var.J(15, watchProgress.getId());
        }

        @Override // defpackage.jv1
        public String createQuery() {
            return "UPDATE `watch_progress` SET `id` = ?,`animeId` = ?,`anistationId` = ?,`anilistId` = ?,`malId` = ?,`animeTitle` = ?,`episodeTitle` = ?,`coverImage` = ?,`thumbnailImage` = ?,`episodeNumber` = ?,`positionMs` = ?,`durationMs` = ?,`completed` = ?,`updatedAt` = ? WHERE `id` = ?";
        }
    }

    public WatchProgressDao_Impl(v65 v65Var) {
        v65Var.getClass();
        this.__db = v65Var;
        this.__insertAdapterOfRemovedWatchProgress = new kv1() { // from class: com.anistation.local.dao.WatchProgressDao_Impl.1
            @Override // defpackage.kv1
            public void bind(m85 m85Var, RemovedWatchProgress removedWatchProgress) {
                m85Var.getClass();
                removedWatchProgress.getClass();
                m85Var.J(1, removedWatchProgress.getAnimeId());
            }

            @Override // defpackage.kv1
            public String createQuery() {
                return "INSERT OR REPLACE INTO `removed_watch_progress` (`animeId`) VALUES (?)";
            }
        };
        this.__upsertAdapterOfWatchProgress = new lv1(new kv1() { // from class: com.anistation.local.dao.WatchProgressDao_Impl.2
            @Override // defpackage.kv1
            public void bind(m85 m85Var, WatchProgress watchProgress) {
                m85Var.getClass();
                watchProgress.getClass();
                m85Var.J(1, watchProgress.getId());
                m85Var.J(2, watchProgress.getAnimeId());
                String anistationId = watchProgress.getAnistationId();
                if (anistationId == null) {
                    m85Var.h(3);
                } else {
                    m85Var.J(3, anistationId);
                }
                m85Var.e(4, watchProgress.getAnilistId());
                m85Var.e(5, watchProgress.getMalId());
                String animeTitle = watchProgress.getAnimeTitle();
                if (animeTitle == null) {
                    m85Var.h(6);
                } else {
                    m85Var.J(6, animeTitle);
                }
                m85Var.J(7, watchProgress.getEpisodeTitle());
                String coverImage = watchProgress.getCoverImage();
                if (coverImage == null) {
                    m85Var.h(8);
                } else {
                    m85Var.J(8, coverImage);
                }
                String thumbnailImage = watchProgress.getThumbnailImage();
                if (thumbnailImage == null) {
                    m85Var.h(9);
                } else {
                    m85Var.J(9, thumbnailImage);
                }
                m85Var.e(10, watchProgress.getEpisodeNumber());
                m85Var.e(11, watchProgress.getPositionMs());
                m85Var.e(12, watchProgress.getDurationMs());
                m85Var.e(13, watchProgress.getCompleted() ? 1L : 0L);
                m85Var.e(14, watchProgress.getUpdatedAt());
            }

            @Override // defpackage.kv1
            public String createQuery() {
                return "INSERT INTO `watch_progress` (`id`,`animeId`,`anistationId`,`anilistId`,`malId`,`animeTitle`,`episodeTitle`,`coverImage`,`thumbnailImage`,`episodeNumber`,`positionMs`,`durationMs`,`completed`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        }, new jv1() { // from class: com.anistation.local.dao.WatchProgressDao_Impl.3
            @Override // defpackage.jv1
            public void bind(m85 m85Var, WatchProgress watchProgress) {
                m85Var.getClass();
                watchProgress.getClass();
                m85Var.J(1, watchProgress.getId());
                m85Var.J(2, watchProgress.getAnimeId());
                String anistationId = watchProgress.getAnistationId();
                if (anistationId == null) {
                    m85Var.h(3);
                } else {
                    m85Var.J(3, anistationId);
                }
                m85Var.e(4, watchProgress.getAnilistId());
                m85Var.e(5, watchProgress.getMalId());
                String animeTitle = watchProgress.getAnimeTitle();
                if (animeTitle == null) {
                    m85Var.h(6);
                } else {
                    m85Var.J(6, animeTitle);
                }
                m85Var.J(7, watchProgress.getEpisodeTitle());
                String coverImage = watchProgress.getCoverImage();
                if (coverImage == null) {
                    m85Var.h(8);
                } else {
                    m85Var.J(8, coverImage);
                }
                String thumbnailImage = watchProgress.getThumbnailImage();
                if (thumbnailImage == null) {
                    m85Var.h(9);
                } else {
                    m85Var.J(9, thumbnailImage);
                }
                m85Var.e(10, watchProgress.getEpisodeNumber());
                m85Var.e(11, watchProgress.getPositionMs());
                m85Var.e(12, watchProgress.getDurationMs());
                m85Var.e(13, watchProgress.getCompleted() ? 1L : 0L);
                m85Var.e(14, watchProgress.getUpdatedAt());
                m85Var.J(15, watchProgress.getId());
            }

            @Override // defpackage.jv1
            public String createQuery() {
                return "UPDATE `watch_progress` SET `id` = ?,`animeId` = ?,`anistationId` = ?,`anilistId` = ?,`malId` = ?,`animeTitle` = ?,`episodeTitle` = ?,`coverImage` = ?,`thumbnailImage` = ?,`episodeNumber` = ?,`positionMs` = ?,`durationMs` = ?,`completed` = ?,`updatedAt` = ? WHERE `id` = ?";
            }
        });
    }

    public static final Object access$promoteLegacyIdentity$s283565558(WatchProgressDao_Impl watchProgressDao_Impl, String str, int i, vz0 vz0Var) {
        watchProgressDao_Impl.getClass();
        return zx6.a(watchProgressDao_Impl, str, i, vz0Var);
    }

    public static final pn6 clearAll$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final pn6 clearRemovedWatchHistory$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final pn6 deleteById$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final List getAllLastWatchedProgress$lambda$0(String str, g85 g85Var) {
        String c0;
        String c02;
        String c03;
        boolean z;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "animeId");
            int K3 = t80.K(s0, "anistationId");
            int K4 = t80.K(s0, "anilistId");
            int K5 = t80.K(s0, "malId");
            int K6 = t80.K(s0, "animeTitle");
            int K7 = t80.K(s0, "episodeTitle");
            int K8 = t80.K(s0, "coverImage");
            int K9 = t80.K(s0, "thumbnailImage");
            int K10 = t80.K(s0, "episodeNumber");
            int K11 = t80.K(s0, "positionMs");
            int K12 = t80.K(s0, "durationMs");
            int K13 = t80.K(s0, "completed");
            int K14 = t80.K(s0, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c04 = s0.c0(K);
                String c05 = s0.c0(K2);
                String str2 = null;
                if (s0.isNull(K3)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K3);
                }
                int i = K2;
                int i2 = K3;
                int i3 = (int) s0.getLong(K4);
                int i4 = (int) s0.getLong(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                String c06 = s0.c0(K7);
                if (s0.isNull(K8)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K8);
                }
                if (!s0.isNull(K9)) {
                    str2 = s0.c0(K9);
                }
                String str3 = str2;
                int i5 = (int) s0.getLong(K10);
                long j = s0.getLong(K11);
                long j2 = s0.getLong(K12);
                if (((int) s0.getLong(K13)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new WatchProgress(c04, c05, c0, i3, i4, c02, c06, c03, str3, i5, j, j2, z, s0.getLong(K14)));
                K2 = i;
                K3 = i2;
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final List getAllOnce$lambda$0(String str, g85 g85Var) {
        String c0;
        String c02;
        String c03;
        boolean z;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "animeId");
            int K3 = t80.K(s0, "anistationId");
            int K4 = t80.K(s0, "anilistId");
            int K5 = t80.K(s0, "malId");
            int K6 = t80.K(s0, "animeTitle");
            int K7 = t80.K(s0, "episodeTitle");
            int K8 = t80.K(s0, "coverImage");
            int K9 = t80.K(s0, "thumbnailImage");
            int K10 = t80.K(s0, "episodeNumber");
            int K11 = t80.K(s0, "positionMs");
            int K12 = t80.K(s0, "durationMs");
            int K13 = t80.K(s0, "completed");
            int K14 = t80.K(s0, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c04 = s0.c0(K);
                String c05 = s0.c0(K2);
                String str2 = null;
                if (s0.isNull(K3)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K3);
                }
                int i = K2;
                int i2 = K3;
                int i3 = (int) s0.getLong(K4);
                int i4 = (int) s0.getLong(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                String c06 = s0.c0(K7);
                if (s0.isNull(K8)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K8);
                }
                if (!s0.isNull(K9)) {
                    str2 = s0.c0(K9);
                }
                String str3 = str2;
                int i5 = (int) s0.getLong(K10);
                long j = s0.getLong(K11);
                long j2 = s0.getLong(K12);
                if (((int) s0.getLong(K13)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new WatchProgress(c04, c05, c0, i3, i4, c02, c06, c03, str3, i5, j, j2, z, s0.getLong(K14)));
                K2 = i;
                K3 = i2;
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final List getAllRemovedOnce$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "animeId");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                arrayList.add(new RemovedWatchProgress(s0.c0(K)));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final List getAllWatchedProgress$lambda$0(String str, String str2, int i, g85 g85Var) {
        String c0;
        String c02;
        String c03;
        boolean z;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            long j = i;
            s0.e(2, j);
            s0.e(3, j);
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "animeId");
            int K3 = t80.K(s0, "anistationId");
            int K4 = t80.K(s0, "anilistId");
            int K5 = t80.K(s0, "malId");
            int K6 = t80.K(s0, "animeTitle");
            int K7 = t80.K(s0, "episodeTitle");
            int K8 = t80.K(s0, "coverImage");
            int K9 = t80.K(s0, "thumbnailImage");
            int K10 = t80.K(s0, "episodeNumber");
            int K11 = t80.K(s0, "positionMs");
            int K12 = t80.K(s0, "durationMs");
            int K13 = t80.K(s0, "completed");
            int K14 = t80.K(s0, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c04 = s0.c0(K);
                String c05 = s0.c0(K2);
                String str3 = null;
                if (s0.isNull(K3)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K3);
                }
                int i2 = K;
                int i3 = K2;
                int i4 = (int) s0.getLong(K4);
                int i5 = (int) s0.getLong(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                String c06 = s0.c0(K7);
                if (s0.isNull(K8)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K8);
                }
                if (!s0.isNull(K9)) {
                    str3 = s0.c0(K9);
                }
                String str4 = str3;
                int i6 = (int) s0.getLong(K10);
                long j2 = s0.getLong(K11);
                long j3 = s0.getLong(K12);
                if (((int) s0.getLong(K13)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new WatchProgress(c04, c05, c0, i4, i5, c02, c06, c03, str4, i6, j2, j3, z, s0.getLong(K14)));
                K = i2;
                K2 = i3;
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final WatchProgress getById$lambda$0(String str, String str2, g85 g85Var) {
        String c0;
        String c02;
        String c03;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        boolean z = true;
        try {
            s0.J(1, str2);
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "animeId");
            int K3 = t80.K(s0, "anistationId");
            int K4 = t80.K(s0, "anilistId");
            int K5 = t80.K(s0, "malId");
            int K6 = t80.K(s0, "animeTitle");
            int K7 = t80.K(s0, "episodeTitle");
            int K8 = t80.K(s0, "coverImage");
            int K9 = t80.K(s0, "thumbnailImage");
            int K10 = t80.K(s0, "episodeNumber");
            int K11 = t80.K(s0, "positionMs");
            int K12 = t80.K(s0, "durationMs");
            int K13 = t80.K(s0, "completed");
            int K14 = t80.K(s0, "updatedAt");
            WatchProgress watchProgress = null;
            String c04 = null;
            if (s0.p0()) {
                String c05 = s0.c0(K);
                String c06 = s0.c0(K2);
                if (s0.isNull(K3)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K3);
                }
                int i = (int) s0.getLong(K4);
                int i2 = (int) s0.getLong(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                String c07 = s0.c0(K7);
                if (s0.isNull(K8)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K8);
                }
                if (!s0.isNull(K9)) {
                    c04 = s0.c0(K9);
                }
                String str3 = c04;
                int i3 = (int) s0.getLong(K10);
                long j = s0.getLong(K11);
                long j2 = s0.getLong(K12);
                if (((int) s0.getLong(K13)) == 0) {
                    z = false;
                }
                watchProgress = new WatchProgress(c05, c06, c0, i, i2, c02, c07, c03, str3, i3, j, j2, z, s0.getLong(K14));
            }
            return watchProgress;
        } finally {
            s0.close();
        }
    }

    public static final WatchProgress getLastWatchedProgress$lambda$0(String str, String str2, int i, g85 g85Var) {
        String c0;
        String c02;
        String c03;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        boolean z = true;
        try {
            s0.J(1, str2);
            long j = i;
            s0.e(2, j);
            s0.e(3, j);
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "animeId");
            int K3 = t80.K(s0, "anistationId");
            int K4 = t80.K(s0, "anilistId");
            int K5 = t80.K(s0, "malId");
            int K6 = t80.K(s0, "animeTitle");
            int K7 = t80.K(s0, "episodeTitle");
            int K8 = t80.K(s0, "coverImage");
            int K9 = t80.K(s0, "thumbnailImage");
            int K10 = t80.K(s0, "episodeNumber");
            int K11 = t80.K(s0, "positionMs");
            int K12 = t80.K(s0, "durationMs");
            int K13 = t80.K(s0, "completed");
            int K14 = t80.K(s0, "updatedAt");
            WatchProgress watchProgress = null;
            String c04 = null;
            if (s0.p0()) {
                String c05 = s0.c0(K);
                String c06 = s0.c0(K2);
                if (s0.isNull(K3)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K3);
                }
                int i2 = (int) s0.getLong(K4);
                int i3 = (int) s0.getLong(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                String c07 = s0.c0(K7);
                if (s0.isNull(K8)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K8);
                }
                if (!s0.isNull(K9)) {
                    c04 = s0.c0(K9);
                }
                String str3 = c04;
                int i4 = (int) s0.getLong(K10);
                long j2 = s0.getLong(K11);
                long j3 = s0.getLong(K12);
                if (((int) s0.getLong(K13)) == 0) {
                    z = false;
                }
                watchProgress = new WatchProgress(c05, c06, c0, i2, i3, c02, c07, c03, str3, i4, j2, j3, z, s0.getLong(K14));
            }
            return watchProgress;
        } finally {
            s0.close();
        }
    }

    public static final List getLegacyProgress$lambda$0(String str, int i, g85 g85Var) {
        String c0;
        String c02;
        String c03;
        boolean z;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        long j = i;
        try {
            s0.e(1, j);
            s0.e(2, j);
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "animeId");
            int K3 = t80.K(s0, "anistationId");
            int K4 = t80.K(s0, "anilistId");
            int K5 = t80.K(s0, "malId");
            int K6 = t80.K(s0, "animeTitle");
            int K7 = t80.K(s0, "episodeTitle");
            int K8 = t80.K(s0, "coverImage");
            int K9 = t80.K(s0, "thumbnailImage");
            int K10 = t80.K(s0, "episodeNumber");
            int K11 = t80.K(s0, "positionMs");
            int K12 = t80.K(s0, "durationMs");
            int K13 = t80.K(s0, "completed");
            int K14 = t80.K(s0, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c04 = s0.c0(K);
                String c05 = s0.c0(K2);
                String str2 = null;
                if (s0.isNull(K3)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K3);
                }
                int i2 = K;
                int i3 = K2;
                int i4 = (int) s0.getLong(K4);
                int i5 = (int) s0.getLong(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                String c06 = s0.c0(K7);
                if (s0.isNull(K8)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K8);
                }
                if (!s0.isNull(K9)) {
                    str2 = s0.c0(K9);
                }
                String str3 = str2;
                int i6 = (int) s0.getLong(K10);
                long j2 = s0.getLong(K11);
                long j3 = s0.getLong(K12);
                if (((int) s0.getLong(K13)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new WatchProgress(c04, c05, c0, i4, i5, c02, c06, c03, str3, i6, j2, j3, z, s0.getLong(K14)));
                K = i2;
                K2 = i3;
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final WatchProgress getProgress$lambda$0(String str, String str2, int i, int i2, g85 g85Var) {
        String c0;
        String c02;
        String c03;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        boolean z = true;
        try {
            s0.J(1, str2);
            long j = i;
            s0.e(2, j);
            s0.e(3, j);
            s0.e(4, i2);
            s0.J(5, str2);
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "animeId");
            int K3 = t80.K(s0, "anistationId");
            int K4 = t80.K(s0, "anilistId");
            int K5 = t80.K(s0, "malId");
            int K6 = t80.K(s0, "animeTitle");
            int K7 = t80.K(s0, "episodeTitle");
            int K8 = t80.K(s0, "coverImage");
            int K9 = t80.K(s0, "thumbnailImage");
            int K10 = t80.K(s0, "episodeNumber");
            int K11 = t80.K(s0, "positionMs");
            int K12 = t80.K(s0, "durationMs");
            int K13 = t80.K(s0, "completed");
            int K14 = t80.K(s0, "updatedAt");
            WatchProgress watchProgress = null;
            String c04 = null;
            if (s0.p0()) {
                String c05 = s0.c0(K);
                String c06 = s0.c0(K2);
                if (s0.isNull(K3)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K3);
                }
                int i3 = (int) s0.getLong(K4);
                int i4 = (int) s0.getLong(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                String c07 = s0.c0(K7);
                if (s0.isNull(K8)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K8);
                }
                if (!s0.isNull(K9)) {
                    c04 = s0.c0(K9);
                }
                String str3 = c04;
                int i5 = (int) s0.getLong(K10);
                long j2 = s0.getLong(K11);
                long j3 = s0.getLong(K12);
                if (((int) s0.getLong(K13)) == 0) {
                    z = false;
                }
                watchProgress = new WatchProgress(c05, c06, c0, i3, i4, c02, c07, c03, str3, i5, j2, j3, z, s0.getLong(K14));
            }
            return watchProgress;
        } finally {
            s0.close();
        }
    }

    public static final List getProgressSummaries$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                arrayList.add(new WatchProgressSummary(s0.c0(0), (int) s0.getLong(1), (int) s0.getLong(2), (int) s0.getLong(3), s0.getLong(4)));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final WatchProgressSummary getProgressSummary$lambda$0(String str, String str2, int i, g85 g85Var) {
        WatchProgressSummary watchProgressSummary;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            long j = i;
            s0.e(2, j);
            s0.e(3, j);
            s0.J(4, str2);
            if (s0.p0()) {
                watchProgressSummary = new WatchProgressSummary(s0.c0(0), (int) s0.getLong(1), (int) s0.getLong(2), (int) s0.getLong(3), s0.getLong(4));
            } else {
                watchProgressSummary = null;
            }
            return watchProgressSummary;
        } finally {
            s0.close();
        }
    }

    public static final pn6 hideFromWatchHistory$lambda$0(WatchProgressDao_Impl watchProgressDao_Impl, List list, g85 g85Var) {
        g85Var.getClass();
        watchProgressDao_Impl.__insertAdapterOfRemovedWatchProgress.insert(g85Var, (Iterable<Object>) list);
        return pn6.a;
    }

    public static final boolean isHidden$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        boolean z = true;
        try {
            s0.J(1, str2);
            boolean z2 = false;
            if (s0.p0()) {
                if (((int) s0.getLong(0)) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            s0.close();
        }
    }

    public static final WatchProgress observeProgress$lambda$0(String str, String str2, int i, int i2, g85 g85Var) {
        String c0;
        String c02;
        String c03;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        boolean z = true;
        try {
            s0.J(1, str2);
            long j = i;
            s0.e(2, j);
            s0.e(3, j);
            s0.e(4, i2);
            s0.J(5, str2);
            int K = t80.K(s0, "id");
            int K2 = t80.K(s0, "animeId");
            int K3 = t80.K(s0, "anistationId");
            int K4 = t80.K(s0, "anilistId");
            int K5 = t80.K(s0, "malId");
            int K6 = t80.K(s0, "animeTitle");
            int K7 = t80.K(s0, "episodeTitle");
            int K8 = t80.K(s0, "coverImage");
            int K9 = t80.K(s0, "thumbnailImage");
            int K10 = t80.K(s0, "episodeNumber");
            int K11 = t80.K(s0, "positionMs");
            int K12 = t80.K(s0, "durationMs");
            int K13 = t80.K(s0, "completed");
            int K14 = t80.K(s0, "updatedAt");
            WatchProgress watchProgress = null;
            String c04 = null;
            if (s0.p0()) {
                String c05 = s0.c0(K);
                String c06 = s0.c0(K2);
                if (s0.isNull(K3)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K3);
                }
                int i3 = (int) s0.getLong(K4);
                int i4 = (int) s0.getLong(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                String c07 = s0.c0(K7);
                if (s0.isNull(K8)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K8);
                }
                if (!s0.isNull(K9)) {
                    c04 = s0.c0(K9);
                }
                String str3 = c04;
                int i5 = (int) s0.getLong(K10);
                long j2 = s0.getLong(K11);
                long j3 = s0.getLong(K12);
                if (((int) s0.getLong(K13)) == 0) {
                    z = false;
                }
                watchProgress = new WatchProgress(c05, c06, c0, i3, i4, c02, c07, c03, str3, i5, j2, j3, z, s0.getLong(K14));
            }
            return watchProgress;
        } finally {
            s0.close();
        }
    }

    public static final pn6 unhideFromWatchHistory$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final pn6 upsertAllProgress$lambda$0(WatchProgressDao_Impl watchProgressDao_Impl, List list, g85 g85Var) {
        g85Var.getClass();
        watchProgressDao_Impl.__upsertAdapterOfWatchProgress.b(g85Var, list);
        return pn6.a;
    }

    public static final pn6 upsertProgress$lambda$0(WatchProgressDao_Impl watchProgressDao_Impl, WatchProgress watchProgress, g85 g85Var) {
        g85Var.getClass();
        lv1 lv1Var = watchProgressDao_Impl.__upsertAdapterOfWatchProgress;
        lv1Var.getClass();
        try {
            lv1Var.a.insert(g85Var, watchProgress);
        } catch (SQLException e) {
            lv1.a(e);
            lv1Var.b.handle(g85Var, watchProgress);
        }
        return pn6.a;
    }

    @Override // defpackage.zx6
    public Object clearAll(vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new dr6((byte) 11));
        if (L == w11.x) {
            return L;
        }
        return pn6.a;
    }

    @Override // defpackage.zx6
    public Object clearRemovedWatchHistory(vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new dr6((byte) 10));
        if (L == w11.x) {
            return L;
        }
        return pn6.a;
    }

    @Override // defpackage.zx6
    public Object deleteById(String str, vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new zg(str, (byte) 29));
        if (L == w11.x) {
            return L;
        }
        return pn6.a;
    }

    @Override // defpackage.zx6
    public w42 getAllLastWatchedProgress() {
        return a34.M(this.__db, false, new String[]{"watch_progress", "removed_watch_progress"}, new dr6((byte) 9));
    }

    @Override // defpackage.zx6
    public Object getAllOnce(vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new dr6((byte) 14));
    }

    @Override // defpackage.zx6
    public Object getAllRemovedOnce(vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new dr6((byte) 13));
    }

    @Override // defpackage.zx6
    public w42 getAllWatchedProgress(String str, int i) {
        str.getClass();
        return a34.M(this.__db, false, new String[]{"watch_progress"}, new wm(str, i, (byte) 5));
    }

    @Override // defpackage.zx6
    public Object getById(String str, vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new zg(str, (byte) 26));
    }

    @Override // defpackage.zx6
    public w42 getLastWatchedProgress(String str, int i) {
        str.getClass();
        return a34.M(this.__db, false, new String[]{"watch_progress"}, new wm(str, i, (byte) 3));
    }

    @Override // defpackage.zx6
    public Object getLegacyProgress(int i, vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new da(i, (byte) 8));
    }

    @Override // defpackage.zx6
    public Object getProgress(String str, int i, int i2, vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new by6(str, i, i2, (byte) 0));
    }

    @Override // defpackage.zx6
    public Object getProgressSummaries(vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new dr6((byte) 12));
    }

    public Object getProgressSummary(String str, int i, vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new wm(str, i, (byte) 4));
    }

    @Override // defpackage.zx6
    public Object hideFromWatchHistory(List<RemovedWatchProgress> list, vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new ay6(this, list, (byte) 0));
        if (L == w11.x) {
            return L;
        }
        return pn6.a;
    }

    @Override // defpackage.zx6
    public Object isHidden(String str, vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new zg(str, (byte) 27));
    }

    public w42 observeProgress(String str, int i, int i2) {
        str.getClass();
        return a34.M(this.__db, false, new String[]{"watch_progress"}, new by6(str, i, i2, (byte) 1));
    }

    @Override // defpackage.zx6
    public Object promoteLegacyIdentity(String str, int i, vz0 vz0Var) {
        Object K = q23.K(vz0Var, new WatchProgressDao_Impl$promoteLegacyIdentity$2(this, str, i, null), this.__db);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }

    @Override // defpackage.zx6
    public Object unhideFromWatchHistory(String str, vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new zg(str, (byte) 28));
        if (L == w11.x) {
            return L;
        }
        return pn6.a;
    }

    @Override // defpackage.zx6
    public Object upsertAllProgress(List<WatchProgress> list, vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new ay6(this, list, (byte) 1));
        if (L == w11.x) {
            return L;
        }
        return pn6.a;
    }

    @Override // defpackage.zx6
    public Object upsertProgress(WatchProgress watchProgress, vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new ll5((Object) this, (Object) watchProgress, (byte) 19));
        if (L == w11.x) {
            return L;
        }
        return pn6.a;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final List<e73> getRequiredConverters() {
            return nt1.x;
        }

        private Companion() {
        }
    }
}
