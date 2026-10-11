package com.anistation.local.dao;

import android.database.SQLException;
import com.anistation.local.entity.AnimeListItem;
import com.anistation.local.entity.AnimeWithProgress;
import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
import com.anistation.model.animelist.WatchStatus;
import defpackage.a34;
import defpackage.b0;
import defpackage.e73;
import defpackage.g85;
import defpackage.jv1;
import defpackage.kv1;
import defpackage.lv1;
import defpackage.m85;
import defpackage.nt1;
import defpackage.p17;
import defpackage.pn6;
import defpackage.q23;
import defpackage.q71;
import defpackage.t80;
import defpackage.tm;
import defpackage.ui;
import defpackage.um;
import defpackage.v65;
import defpackage.vm;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.wm;
import defpackage.xm;
import defpackage.ze0;
import defpackage.zg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AnimeListDao_Impl implements tm {
    public static final Companion Companion = new Companion(null);
    private final v65 __db;
    private final lv1 __upsertAdapterOfAnimeListItem;
    private final p17 __watchStatusConverter;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.anistation.local.dao.AnimeListDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kv1 {
        public AnonymousClass1() {
        }

        @Override // defpackage.kv1
        public void bind(m85 m85Var, AnimeListItem animeListItem) {
            m85Var.getClass();
            animeListItem.getClass();
            m85Var.J(1, animeListItem.getAnimeId());
            String anistationId = animeListItem.getAnistationId();
            if (anistationId == null) {
                m85Var.h(2);
            } else {
                m85Var.J(2, anistationId);
            }
            m85Var.e(3, animeListItem.getAnilistId());
            if (animeListItem.getMalId() == null) {
                m85Var.h(4);
            } else {
                m85Var.e(4, r0.intValue());
            }
            m85Var.J(5, animeListItem.getTitle());
            String coverImage = animeListItem.getCoverImage();
            if (coverImage == null) {
                m85Var.h(6);
            } else {
                m85Var.J(6, coverImage);
            }
            String bannerImage = animeListItem.getBannerImage();
            if (bannerImage == null) {
                m85Var.h(7);
            } else {
                m85Var.J(7, bannerImage);
            }
            if (animeListItem.getTotalEpisodes() == null) {
                m85Var.h(8);
            } else {
                m85Var.e(8, r0.intValue());
            }
            m85Var.e(9, animeListItem.getCurrentAiredEpisodes());
            MediaStatus mediaStatus = animeListItem.getMediaStatus();
            if (mediaStatus == null) {
                m85Var.h(10);
            } else {
                m85Var.J(10, AnimeListDao_Impl.this.__MediaStatus_enumToString(mediaStatus));
            }
            p17 p17Var = AnimeListDao_Impl.this.__watchStatusConverter;
            WatchStatus watchStatus = animeListItem.getWatchStatus();
            p17Var.getClass();
            watchStatus.getClass();
            m85Var.J(11, watchStatus.name());
            m85Var.e(12, animeListItem.getImportedProgress());
            m85Var.e(13, animeListItem.getScore());
            MediaFormat format = animeListItem.getFormat();
            if (format == null) {
                m85Var.h(14);
            } else {
                m85Var.J(14, AnimeListDao_Impl.this.__MediaFormat_enumToString(format));
            }
            String notes = animeListItem.getNotes();
            if (notes == null) {
                m85Var.h(15);
            } else {
                m85Var.J(15, notes);
            }
            m85Var.e(16, animeListItem.getCreatedAt());
            m85Var.e(17, animeListItem.getUpdatedAt());
        }

        @Override // defpackage.kv1
        public String createQuery() {
            return "INSERT INTO `anime_list` (`animeId`,`anistationId`,`anilistId`,`malId`,`title`,`coverImage`,`bannerImage`,`totalEpisodes`,`currentAiredEpisodes`,`mediaStatus`,`watchStatus`,`importedProgress`,`score`,`format`,`notes`,`createdAt`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.anistation.local.dao.AnimeListDao_Impl$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends jv1 {
        public AnonymousClass2() {
        }

        @Override // defpackage.jv1
        public void bind(m85 m85Var, AnimeListItem animeListItem) {
            m85Var.getClass();
            animeListItem.getClass();
            m85Var.J(1, animeListItem.getAnimeId());
            String anistationId = animeListItem.getAnistationId();
            if (anistationId == null) {
                m85Var.h(2);
            } else {
                m85Var.J(2, anistationId);
            }
            m85Var.e(3, animeListItem.getAnilistId());
            if (animeListItem.getMalId() == null) {
                m85Var.h(4);
            } else {
                m85Var.e(4, r0.intValue());
            }
            m85Var.J(5, animeListItem.getTitle());
            String coverImage = animeListItem.getCoverImage();
            if (coverImage == null) {
                m85Var.h(6);
            } else {
                m85Var.J(6, coverImage);
            }
            String bannerImage = animeListItem.getBannerImage();
            if (bannerImage == null) {
                m85Var.h(7);
            } else {
                m85Var.J(7, bannerImage);
            }
            if (animeListItem.getTotalEpisodes() == null) {
                m85Var.h(8);
            } else {
                m85Var.e(8, r0.intValue());
            }
            m85Var.e(9, animeListItem.getCurrentAiredEpisodes());
            MediaStatus mediaStatus = animeListItem.getMediaStatus();
            if (mediaStatus == null) {
                m85Var.h(10);
            } else {
                m85Var.J(10, AnimeListDao_Impl.this.__MediaStatus_enumToString(mediaStatus));
            }
            p17 p17Var = AnimeListDao_Impl.this.__watchStatusConverter;
            WatchStatus watchStatus = animeListItem.getWatchStatus();
            p17Var.getClass();
            watchStatus.getClass();
            m85Var.J(11, watchStatus.name());
            m85Var.e(12, animeListItem.getImportedProgress());
            m85Var.e(13, animeListItem.getScore());
            MediaFormat format = animeListItem.getFormat();
            if (format == null) {
                m85Var.h(14);
            } else {
                m85Var.J(14, AnimeListDao_Impl.this.__MediaFormat_enumToString(format));
            }
            String notes = animeListItem.getNotes();
            if (notes == null) {
                m85Var.h(15);
            } else {
                m85Var.J(15, notes);
            }
            m85Var.e(16, animeListItem.getCreatedAt());
            m85Var.e(17, animeListItem.getUpdatedAt());
            m85Var.J(18, animeListItem.getAnimeId());
        }

        @Override // defpackage.jv1
        public String createQuery() {
            return "UPDATE `anime_list` SET `animeId` = ?,`anistationId` = ?,`anilistId` = ?,`malId` = ?,`title` = ?,`coverImage` = ?,`bannerImage` = ?,`totalEpisodes` = ?,`currentAiredEpisodes` = ?,`mediaStatus` = ?,`watchStatus` = ?,`importedProgress` = ?,`score` = ?,`format` = ?,`notes` = ?,`createdAt` = ?,`updatedAt` = ? WHERE `animeId` = ?";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MediaStatus.values().length];
            try {
                iArr[MediaStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaStatus.RELEASING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaStatus.NOT_YET_RELEASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaStatus.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaStatus.HIATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MediaStatus.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MediaFormat.values().length];
            try {
                iArr2[MediaFormat.TV.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MediaFormat.TV_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MediaFormat.MOVIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MediaFormat.SPECIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MediaFormat.OVA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MediaFormat.ONA.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MediaFormat.MUSIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[MediaFormat.MANGA.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[MediaFormat.NOVEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[MediaFormat.ONE_SHOT.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[MediaFormat.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p17, java.lang.Object] */
    public AnimeListDao_Impl(v65 v65Var) {
        v65Var.getClass();
        this.__watchStatusConverter = new Object();
        this.__db = v65Var;
        this.__upsertAdapterOfAnimeListItem = new lv1(new kv1() { // from class: com.anistation.local.dao.AnimeListDao_Impl.1
            public AnonymousClass1() {
            }

            @Override // defpackage.kv1
            public void bind(m85 m85Var, AnimeListItem animeListItem) {
                m85Var.getClass();
                animeListItem.getClass();
                m85Var.J(1, animeListItem.getAnimeId());
                String anistationId = animeListItem.getAnistationId();
                if (anistationId == null) {
                    m85Var.h(2);
                } else {
                    m85Var.J(2, anistationId);
                }
                m85Var.e(3, animeListItem.getAnilistId());
                if (animeListItem.getMalId() == null) {
                    m85Var.h(4);
                } else {
                    m85Var.e(4, r0.intValue());
                }
                m85Var.J(5, animeListItem.getTitle());
                String coverImage = animeListItem.getCoverImage();
                if (coverImage == null) {
                    m85Var.h(6);
                } else {
                    m85Var.J(6, coverImage);
                }
                String bannerImage = animeListItem.getBannerImage();
                if (bannerImage == null) {
                    m85Var.h(7);
                } else {
                    m85Var.J(7, bannerImage);
                }
                if (animeListItem.getTotalEpisodes() == null) {
                    m85Var.h(8);
                } else {
                    m85Var.e(8, r0.intValue());
                }
                m85Var.e(9, animeListItem.getCurrentAiredEpisodes());
                MediaStatus mediaStatus = animeListItem.getMediaStatus();
                if (mediaStatus == null) {
                    m85Var.h(10);
                } else {
                    m85Var.J(10, AnimeListDao_Impl.this.__MediaStatus_enumToString(mediaStatus));
                }
                p17 p17Var = AnimeListDao_Impl.this.__watchStatusConverter;
                WatchStatus watchStatus = animeListItem.getWatchStatus();
                p17Var.getClass();
                watchStatus.getClass();
                m85Var.J(11, watchStatus.name());
                m85Var.e(12, animeListItem.getImportedProgress());
                m85Var.e(13, animeListItem.getScore());
                MediaFormat format = animeListItem.getFormat();
                if (format == null) {
                    m85Var.h(14);
                } else {
                    m85Var.J(14, AnimeListDao_Impl.this.__MediaFormat_enumToString(format));
                }
                String notes = animeListItem.getNotes();
                if (notes == null) {
                    m85Var.h(15);
                } else {
                    m85Var.J(15, notes);
                }
                m85Var.e(16, animeListItem.getCreatedAt());
                m85Var.e(17, animeListItem.getUpdatedAt());
            }

            @Override // defpackage.kv1
            public String createQuery() {
                return "INSERT INTO `anime_list` (`animeId`,`anistationId`,`anilistId`,`malId`,`title`,`coverImage`,`bannerImage`,`totalEpisodes`,`currentAiredEpisodes`,`mediaStatus`,`watchStatus`,`importedProgress`,`score`,`format`,`notes`,`createdAt`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        }, new jv1() { // from class: com.anistation.local.dao.AnimeListDao_Impl.2
            public AnonymousClass2() {
            }

            @Override // defpackage.jv1
            public void bind(m85 m85Var, AnimeListItem animeListItem) {
                m85Var.getClass();
                animeListItem.getClass();
                m85Var.J(1, animeListItem.getAnimeId());
                String anistationId = animeListItem.getAnistationId();
                if (anistationId == null) {
                    m85Var.h(2);
                } else {
                    m85Var.J(2, anistationId);
                }
                m85Var.e(3, animeListItem.getAnilistId());
                if (animeListItem.getMalId() == null) {
                    m85Var.h(4);
                } else {
                    m85Var.e(4, r0.intValue());
                }
                m85Var.J(5, animeListItem.getTitle());
                String coverImage = animeListItem.getCoverImage();
                if (coverImage == null) {
                    m85Var.h(6);
                } else {
                    m85Var.J(6, coverImage);
                }
                String bannerImage = animeListItem.getBannerImage();
                if (bannerImage == null) {
                    m85Var.h(7);
                } else {
                    m85Var.J(7, bannerImage);
                }
                if (animeListItem.getTotalEpisodes() == null) {
                    m85Var.h(8);
                } else {
                    m85Var.e(8, r0.intValue());
                }
                m85Var.e(9, animeListItem.getCurrentAiredEpisodes());
                MediaStatus mediaStatus = animeListItem.getMediaStatus();
                if (mediaStatus == null) {
                    m85Var.h(10);
                } else {
                    m85Var.J(10, AnimeListDao_Impl.this.__MediaStatus_enumToString(mediaStatus));
                }
                p17 p17Var = AnimeListDao_Impl.this.__watchStatusConverter;
                WatchStatus watchStatus = animeListItem.getWatchStatus();
                p17Var.getClass();
                watchStatus.getClass();
                m85Var.J(11, watchStatus.name());
                m85Var.e(12, animeListItem.getImportedProgress());
                m85Var.e(13, animeListItem.getScore());
                MediaFormat format = animeListItem.getFormat();
                if (format == null) {
                    m85Var.h(14);
                } else {
                    m85Var.J(14, AnimeListDao_Impl.this.__MediaFormat_enumToString(format));
                }
                String notes = animeListItem.getNotes();
                if (notes == null) {
                    m85Var.h(15);
                } else {
                    m85Var.J(15, notes);
                }
                m85Var.e(16, animeListItem.getCreatedAt());
                m85Var.e(17, animeListItem.getUpdatedAt());
                m85Var.J(18, animeListItem.getAnimeId());
            }

            @Override // defpackage.jv1
            public String createQuery() {
                return "UPDATE `anime_list` SET `animeId` = ?,`anistationId` = ?,`anilistId` = ?,`malId` = ?,`title` = ?,`coverImage` = ?,`bannerImage` = ?,`totalEpisodes` = ?,`currentAiredEpisodes` = ?,`mediaStatus` = ?,`watchStatus` = ?,`importedProgress` = ?,`score` = ?,`format` = ?,`notes` = ?,`createdAt` = ?,`updatedAt` = ? WHERE `animeId` = ?";
            }
        });
    }

    public final String __MediaFormat_enumToString(MediaFormat mediaFormat) {
        switch (WhenMappings.$EnumSwitchMapping$1[mediaFormat.ordinal()]) {
            case 1:
                return "TV";
            case 2:
                return "TV_SHORT";
            case 3:
                return "MOVIE";
            case 4:
                return "SPECIAL";
            case 5:
                return "OVA";
            case 6:
                return "ONA";
            case 7:
                return "MUSIC";
            case 8:
                return "MANGA";
            case 9:
                return "NOVEL";
            case 10:
                return "ONE_SHOT";
            case 11:
                return "UNKNOWN";
            default:
                ze0.l();
                return null;
        }
    }

    private final MediaFormat __MediaFormat_stringToEnum(String str) {
        switch (str.hashCode()) {
            case -2113236897:
                if (str.equals("TV_SHORT")) {
                    return MediaFormat.TV_SHORT;
                }
                break;
            case -1480403629:
                if (str.equals("ONE_SHOT")) {
                    return MediaFormat.ONE_SHOT;
                }
                break;
            case -1290482535:
                if (str.equals("SPECIAL")) {
                    return MediaFormat.SPECIAL;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    return MediaFormat.TV;
                }
                break;
            case 78402:
                if (str.equals("ONA")) {
                    return MediaFormat.ONA;
                }
                break;
            case 78650:
                if (str.equals("OVA")) {
                    return MediaFormat.OVA;
                }
                break;
            case 73124756:
                if (str.equals("MANGA")) {
                    return MediaFormat.MANGA;
                }
                break;
            case 73549584:
                if (str.equals("MOVIE")) {
                    return MediaFormat.MOVIE;
                }
                break;
            case 73725445:
                if (str.equals("MUSIC")) {
                    return MediaFormat.MUSIC;
                }
                break;
            case 74472988:
                if (str.equals("NOVEL")) {
                    return MediaFormat.NOVEL;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return MediaFormat.UNKNOWN;
                }
                break;
        }
        ze0.k("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }

    public final String __MediaStatus_enumToString(MediaStatus mediaStatus) {
        switch (WhenMappings.$EnumSwitchMapping$0[mediaStatus.ordinal()]) {
            case 1:
                return "FINISHED";
            case 2:
                return "RELEASING";
            case 3:
                return "NOT_YET_RELEASED";
            case 4:
                return "CANCELLED";
            case 5:
                return "HIATUS";
            case 6:
                return "UNKNOWN";
            default:
                ze0.l();
                return null;
        }
    }

    private final MediaStatus __MediaStatus_stringToEnum(String str) {
        switch (str.hashCode()) {
            case -1418760476:
                if (str.equals("RELEASING")) {
                    return MediaStatus.RELEASING;
                }
                break;
            case -1031784143:
                if (str.equals("CANCELLED")) {
                    return MediaStatus.CANCELLED;
                }
                break;
            case 108966002:
                if (str.equals("FINISHED")) {
                    return MediaStatus.FINISHED;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return MediaStatus.UNKNOWN;
                }
                break;
            case 507230944:
                if (str.equals("NOT_YET_RELEASED")) {
                    return MediaStatus.NOT_YET_RELEASED;
                }
                break;
            case 2130735762:
                if (str.equals("HIATUS")) {
                    return MediaStatus.HIATUS;
                }
                break;
        }
        ze0.k("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }

    /* renamed from: access$promoteLegacyIdentity$s-1417023712 */
    public static final Object m0access$promoteLegacyIdentity$s1417023712(AnimeListDao_Impl animeListDao_Impl, String str, int i, vz0 vz0Var) {
        animeListDao_Impl.getClass();
        return tm.a(animeListDao_Impl, str, i, vz0Var);
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

    public static final pn6 deleteByAnimeId$lambda$0(String str, String str2, g85 g85Var) {
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

    public static final List getAllOnce$lambda$0(String str, AnimeListDao_Impl animeListDao_Impl, g85 g85Var) {
        String c0;
        int i;
        int i2;
        int i3;
        Integer valueOf;
        String c02;
        String c03;
        Integer valueOf2;
        MediaStatus __MediaStatus_stringToEnum;
        int i4;
        MediaFormat __MediaFormat_stringToEnum;
        AnimeListDao_Impl animeListDao_Impl2 = animeListDao_Impl;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "animeId");
            int K2 = t80.K(s0, "anistationId");
            int K3 = t80.K(s0, "anilistId");
            int K4 = t80.K(s0, "malId");
            int K5 = t80.K(s0, "title");
            int K6 = t80.K(s0, "coverImage");
            int K7 = t80.K(s0, "bannerImage");
            int K8 = t80.K(s0, "totalEpisodes");
            int K9 = t80.K(s0, "currentAiredEpisodes");
            int K10 = t80.K(s0, "mediaStatus");
            int K11 = t80.K(s0, "watchStatus");
            int K12 = t80.K(s0, "importedProgress");
            int K13 = t80.K(s0, "score");
            int K14 = t80.K(s0, "format");
            int K15 = t80.K(s0, "notes");
            int K16 = t80.K(s0, "createdAt");
            int K17 = t80.K(s0, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c04 = s0.c0(K);
                String str2 = null;
                if (s0.isNull(K2)) {
                    c0 = null;
                    i2 = K;
                    i = K2;
                } else {
                    c0 = s0.c0(K2);
                    i = K2;
                    i2 = K;
                }
                int i5 = (int) s0.getLong(K3);
                if (s0.isNull(K4)) {
                    i3 = i5;
                    valueOf = null;
                } else {
                    i3 = i5;
                    valueOf = Integer.valueOf((int) s0.getLong(K4));
                }
                String c05 = s0.c0(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                if (s0.isNull(K7)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K7);
                }
                if (s0.isNull(K8)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf((int) s0.getLong(K8));
                }
                int i6 = (int) s0.getLong(K9);
                if (s0.isNull(K10)) {
                    __MediaStatus_stringToEnum = null;
                } else {
                    __MediaStatus_stringToEnum = animeListDao_Impl2.__MediaStatus_stringToEnum(s0.c0(K10));
                }
                String c06 = s0.c0(K11);
                animeListDao_Impl2.__watchStatusConverter.getClass();
                WatchStatus a = p17.a(c06);
                int i7 = (int) s0.getLong(K12);
                int i8 = (int) s0.getLong(K13);
                int i9 = K14;
                if (s0.isNull(i9)) {
                    i4 = i8;
                    __MediaFormat_stringToEnum = null;
                } else {
                    i4 = i8;
                    __MediaFormat_stringToEnum = animeListDao_Impl2.__MediaFormat_stringToEnum(s0.c0(i9));
                }
                int i10 = K15;
                if (!s0.isNull(i10)) {
                    str2 = s0.c0(i10);
                }
                int i11 = K16;
                String str3 = str2;
                long j = s0.getLong(i11);
                K16 = i11;
                int i12 = K17;
                K17 = i12;
                arrayList.add(new AnimeListItem(c04, c0, i3, valueOf, c05, c02, c03, valueOf2, i6, __MediaStatus_stringToEnum, a, i7, i4, __MediaFormat_stringToEnum, str3, j, s0.getLong(i12)));
                animeListDao_Impl2 = animeListDao_Impl;
                K15 = i10;
                K14 = i9;
                K = i2;
                K2 = i;
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final AnimeListItem getByAnimeId$lambda$0(String str, String str2, AnimeListDao_Impl animeListDao_Impl, g85 g85Var) {
        String c0;
        Integer valueOf;
        String c02;
        String c03;
        Integer valueOf2;
        MediaStatus __MediaStatus_stringToEnum;
        MediaFormat __MediaFormat_stringToEnum;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            int K = t80.K(s0, "animeId");
            int K2 = t80.K(s0, "anistationId");
            int K3 = t80.K(s0, "anilistId");
            int K4 = t80.K(s0, "malId");
            int K5 = t80.K(s0, "title");
            int K6 = t80.K(s0, "coverImage");
            int K7 = t80.K(s0, "bannerImage");
            int K8 = t80.K(s0, "totalEpisodes");
            int K9 = t80.K(s0, "currentAiredEpisodes");
            int K10 = t80.K(s0, "mediaStatus");
            int K11 = t80.K(s0, "watchStatus");
            int K12 = t80.K(s0, "importedProgress");
            int K13 = t80.K(s0, "score");
            int K14 = t80.K(s0, "format");
            int K15 = t80.K(s0, "notes");
            int K16 = t80.K(s0, "createdAt");
            int K17 = t80.K(s0, "updatedAt");
            AnimeListItem animeListItem = null;
            String c04 = null;
            if (s0.p0()) {
                String c05 = s0.c0(K);
                if (s0.isNull(K2)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K2);
                }
                int i = (int) s0.getLong(K3);
                if (s0.isNull(K4)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf((int) s0.getLong(K4));
                }
                String c06 = s0.c0(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                if (s0.isNull(K7)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K7);
                }
                if (s0.isNull(K8)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf((int) s0.getLong(K8));
                }
                int i2 = (int) s0.getLong(K9);
                if (s0.isNull(K10)) {
                    __MediaStatus_stringToEnum = null;
                } else {
                    __MediaStatus_stringToEnum = animeListDao_Impl.__MediaStatus_stringToEnum(s0.c0(K10));
                }
                String c07 = s0.c0(K11);
                animeListDao_Impl.__watchStatusConverter.getClass();
                WatchStatus a = p17.a(c07);
                int i3 = (int) s0.getLong(K12);
                int i4 = (int) s0.getLong(K13);
                if (s0.isNull(K14)) {
                    __MediaFormat_stringToEnum = null;
                } else {
                    __MediaFormat_stringToEnum = animeListDao_Impl.__MediaFormat_stringToEnum(s0.c0(K14));
                }
                if (!s0.isNull(K15)) {
                    c04 = s0.c0(K15);
                }
                animeListItem = new AnimeListItem(c05, c0, i, valueOf, c06, c02, c03, valueOf2, i2, __MediaStatus_stringToEnum, a, i3, i4, __MediaFormat_stringToEnum, c04, s0.getLong(K16), s0.getLong(K17));
            }
            return animeListItem;
        } finally {
            s0.close();
        }
    }

    public static final AnimeListItem getLegacyByAnilistId$lambda$0(String str, int i, AnimeListDao_Impl animeListDao_Impl, g85 g85Var) {
        String c0;
        Integer valueOf;
        String c02;
        String c03;
        Integer valueOf2;
        MediaStatus __MediaStatus_stringToEnum;
        MediaFormat __MediaFormat_stringToEnum;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        long j = i;
        try {
            s0.e(1, j);
            s0.e(2, j);
            int K = t80.K(s0, "animeId");
            int K2 = t80.K(s0, "anistationId");
            int K3 = t80.K(s0, "anilistId");
            int K4 = t80.K(s0, "malId");
            int K5 = t80.K(s0, "title");
            int K6 = t80.K(s0, "coverImage");
            int K7 = t80.K(s0, "bannerImage");
            int K8 = t80.K(s0, "totalEpisodes");
            int K9 = t80.K(s0, "currentAiredEpisodes");
            int K10 = t80.K(s0, "mediaStatus");
            int K11 = t80.K(s0, "watchStatus");
            int K12 = t80.K(s0, "importedProgress");
            int K13 = t80.K(s0, "score");
            int K14 = t80.K(s0, "format");
            int K15 = t80.K(s0, "notes");
            int K16 = t80.K(s0, "createdAt");
            int K17 = t80.K(s0, "updatedAt");
            AnimeListItem animeListItem = null;
            String c04 = null;
            if (s0.p0()) {
                String c05 = s0.c0(K);
                if (s0.isNull(K2)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K2);
                }
                int i2 = (int) s0.getLong(K3);
                if (s0.isNull(K4)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf((int) s0.getLong(K4));
                }
                String c06 = s0.c0(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                if (s0.isNull(K7)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K7);
                }
                if (s0.isNull(K8)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf((int) s0.getLong(K8));
                }
                int i3 = (int) s0.getLong(K9);
                if (s0.isNull(K10)) {
                    __MediaStatus_stringToEnum = null;
                } else {
                    __MediaStatus_stringToEnum = animeListDao_Impl.__MediaStatus_stringToEnum(s0.c0(K10));
                }
                String c07 = s0.c0(K11);
                animeListDao_Impl.__watchStatusConverter.getClass();
                WatchStatus a = p17.a(c07);
                int i4 = (int) s0.getLong(K12);
                int i5 = (int) s0.getLong(K13);
                if (s0.isNull(K14)) {
                    __MediaFormat_stringToEnum = null;
                } else {
                    __MediaFormat_stringToEnum = animeListDao_Impl.__MediaFormat_stringToEnum(s0.c0(K14));
                }
                if (!s0.isNull(K15)) {
                    c04 = s0.c0(K15);
                }
                animeListItem = new AnimeListItem(c05, c0, i2, valueOf, c06, c02, c03, valueOf2, i3, __MediaStatus_stringToEnum, a, i4, i5, __MediaFormat_stringToEnum, c04, s0.getLong(K16), s0.getLong(K17));
            }
            return animeListItem;
        } finally {
            s0.close();
        }
    }

    public static final List observeAll$lambda$0(String str, AnimeListDao_Impl animeListDao_Impl, g85 g85Var) {
        String c0;
        int i;
        int i2;
        int i3;
        Integer valueOf;
        String c02;
        String c03;
        Integer valueOf2;
        MediaStatus __MediaStatus_stringToEnum;
        int i4;
        MediaFormat __MediaFormat_stringToEnum;
        AnimeListDao_Impl animeListDao_Impl2 = animeListDao_Impl;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "animeId");
            int K2 = t80.K(s0, "anistationId");
            int K3 = t80.K(s0, "anilistId");
            int K4 = t80.K(s0, "malId");
            int K5 = t80.K(s0, "title");
            int K6 = t80.K(s0, "coverImage");
            int K7 = t80.K(s0, "bannerImage");
            int K8 = t80.K(s0, "totalEpisodes");
            int K9 = t80.K(s0, "currentAiredEpisodes");
            int K10 = t80.K(s0, "mediaStatus");
            int K11 = t80.K(s0, "watchStatus");
            int K12 = t80.K(s0, "importedProgress");
            int K13 = t80.K(s0, "score");
            int K14 = t80.K(s0, "format");
            int K15 = t80.K(s0, "notes");
            int K16 = t80.K(s0, "createdAt");
            int K17 = t80.K(s0, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                String c04 = s0.c0(K);
                String str2 = null;
                if (s0.isNull(K2)) {
                    c0 = null;
                    i2 = K;
                    i = K2;
                } else {
                    c0 = s0.c0(K2);
                    i = K2;
                    i2 = K;
                }
                int i5 = (int) s0.getLong(K3);
                if (s0.isNull(K4)) {
                    i3 = i5;
                    valueOf = null;
                } else {
                    i3 = i5;
                    valueOf = Integer.valueOf((int) s0.getLong(K4));
                }
                String c05 = s0.c0(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                if (s0.isNull(K7)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K7);
                }
                if (s0.isNull(K8)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf((int) s0.getLong(K8));
                }
                int i6 = (int) s0.getLong(K9);
                if (s0.isNull(K10)) {
                    __MediaStatus_stringToEnum = null;
                } else {
                    __MediaStatus_stringToEnum = animeListDao_Impl2.__MediaStatus_stringToEnum(s0.c0(K10));
                }
                String c06 = s0.c0(K11);
                animeListDao_Impl2.__watchStatusConverter.getClass();
                WatchStatus a = p17.a(c06);
                int i7 = (int) s0.getLong(K12);
                int i8 = (int) s0.getLong(K13);
                int i9 = K14;
                if (s0.isNull(i9)) {
                    i4 = i8;
                    __MediaFormat_stringToEnum = null;
                } else {
                    i4 = i8;
                    __MediaFormat_stringToEnum = animeListDao_Impl2.__MediaFormat_stringToEnum(s0.c0(i9));
                }
                int i10 = K15;
                if (!s0.isNull(i10)) {
                    str2 = s0.c0(i10);
                }
                int i11 = K16;
                String str3 = str2;
                long j = s0.getLong(i11);
                K16 = i11;
                int i12 = K17;
                K17 = i12;
                arrayList.add(new AnimeListItem(c04, c0, i3, valueOf, c05, c02, c03, valueOf2, i6, __MediaStatus_stringToEnum, a, i7, i4, __MediaFormat_stringToEnum, str3, j, s0.getLong(i12)));
                animeListDao_Impl2 = animeListDao_Impl;
                K15 = i10;
                K14 = i9;
                K = i2;
                K2 = i;
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final List observeAllWithProgress$lambda$0(String str, AnimeListDao_Impl animeListDao_Impl, g85 g85Var) {
        m85 m85Var;
        int i;
        ArrayList arrayList;
        Integer valueOf;
        String c0;
        int i2;
        int i3;
        int i4;
        Integer valueOf2;
        String c02;
        String c03;
        Integer valueOf3;
        MediaStatus __MediaStatus_stringToEnum;
        int i5;
        MediaFormat __MediaFormat_stringToEnum;
        AnimeListDao_Impl animeListDao_Impl2 = animeListDao_Impl;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            int K = t80.K(s0, "animeId");
            int K2 = t80.K(s0, "anistationId");
            int K3 = t80.K(s0, "anilistId");
            int K4 = t80.K(s0, "malId");
            int K5 = t80.K(s0, "title");
            int K6 = t80.K(s0, "coverImage");
            int K7 = t80.K(s0, "bannerImage");
            int K8 = t80.K(s0, "totalEpisodes");
            int K9 = t80.K(s0, "currentAiredEpisodes");
            int K10 = t80.K(s0, "mediaStatus");
            int K11 = t80.K(s0, "watchStatus");
            int K12 = t80.K(s0, "importedProgress");
            int K13 = t80.K(s0, "score");
            int K14 = t80.K(s0, "format");
            int K15 = t80.K(s0, "notes");
            int K16 = t80.K(s0, "createdAt");
            int K17 = t80.K(s0, "updatedAt");
            int K18 = t80.K(s0, "episodeNumber");
            int i6 = K13;
            ArrayList arrayList2 = new ArrayList();
            while (s0.p0()) {
                String str2 = null;
                if (s0.isNull(K18)) {
                    i = K12;
                    arrayList = arrayList2;
                    valueOf = null;
                } else {
                    i = K12;
                    arrayList = arrayList2;
                    valueOf = Integer.valueOf((int) s0.getLong(K18));
                }
                String c04 = s0.c0(K);
                if (s0.isNull(K2)) {
                    c0 = null;
                    i3 = K;
                    i2 = K2;
                } else {
                    c0 = s0.c0(K2);
                    i2 = K2;
                    i3 = K;
                }
                int i7 = (int) s0.getLong(K3);
                if (s0.isNull(K4)) {
                    i4 = i7;
                    valueOf2 = null;
                } else {
                    i4 = i7;
                    valueOf2 = Integer.valueOf((int) s0.getLong(K4));
                }
                String c05 = s0.c0(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                if (s0.isNull(K7)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K7);
                }
                if (s0.isNull(K8)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf((int) s0.getLong(K8));
                }
                int i8 = (int) s0.getLong(K9);
                if (s0.isNull(K10)) {
                    __MediaStatus_stringToEnum = null;
                } else {
                    __MediaStatus_stringToEnum = animeListDao_Impl2.__MediaStatus_stringToEnum(s0.c0(K10));
                }
                String c06 = s0.c0(K11);
                animeListDao_Impl2.__watchStatusConverter.getClass();
                WatchStatus a = p17.a(c06);
                int i9 = i;
                int i10 = K3;
                int i11 = (int) s0.getLong(i9);
                int i12 = i6;
                int i13 = (int) s0.getLong(i12);
                int i14 = K14;
                if (s0.isNull(i14)) {
                    i5 = i13;
                    __MediaFormat_stringToEnum = null;
                } else {
                    i5 = i13;
                    __MediaFormat_stringToEnum = animeListDao_Impl2.__MediaFormat_stringToEnum(s0.c0(i14));
                }
                int i15 = K15;
                if (!s0.isNull(i15)) {
                    str2 = s0.c0(i15);
                }
                int i16 = K16;
                String str3 = str2;
                long j = s0.getLong(i16);
                K16 = i16;
                int i17 = K17;
                K17 = i17;
                m85Var = s0;
                try {
                    ArrayList arrayList3 = arrayList;
                    arrayList3.add(new AnimeWithProgress(new AnimeListItem(c04, c0, i4, valueOf2, c05, c02, c03, valueOf3, i8, __MediaStatus_stringToEnum, a, i11, i5, __MediaFormat_stringToEnum, str3, j, s0.getLong(i17)), valueOf));
                    s0 = m85Var;
                    K15 = i15;
                    K14 = i14;
                    K = i3;
                    K12 = i9;
                    K2 = i2;
                    arrayList2 = arrayList3;
                    i6 = i12;
                    K3 = i10;
                    animeListDao_Impl2 = animeListDao_Impl;
                } catch (Throwable th) {
                    th = th;
                    m85Var.close();
                    throw th;
                }
            }
            ArrayList arrayList4 = arrayList2;
            s0.close();
            return arrayList4;
        } catch (Throwable th2) {
            th = th2;
            m85Var = s0;
        }
    }

    public static final AnimeListItem observeByIdentity$lambda$0(String str, String str2, int i, AnimeListDao_Impl animeListDao_Impl, g85 g85Var) {
        String c0;
        Integer valueOf;
        String c02;
        String c03;
        Integer valueOf2;
        MediaStatus __MediaStatus_stringToEnum;
        MediaFormat __MediaFormat_stringToEnum;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            long j = i;
            s0.e(2, j);
            s0.e(3, j);
            s0.J(4, str2);
            int K = t80.K(s0, "animeId");
            int K2 = t80.K(s0, "anistationId");
            int K3 = t80.K(s0, "anilistId");
            int K4 = t80.K(s0, "malId");
            int K5 = t80.K(s0, "title");
            int K6 = t80.K(s0, "coverImage");
            int K7 = t80.K(s0, "bannerImage");
            int K8 = t80.K(s0, "totalEpisodes");
            int K9 = t80.K(s0, "currentAiredEpisodes");
            int K10 = t80.K(s0, "mediaStatus");
            int K11 = t80.K(s0, "watchStatus");
            int K12 = t80.K(s0, "importedProgress");
            int K13 = t80.K(s0, "score");
            int K14 = t80.K(s0, "format");
            int K15 = t80.K(s0, "notes");
            int K16 = t80.K(s0, "createdAt");
            int K17 = t80.K(s0, "updatedAt");
            AnimeListItem animeListItem = null;
            String c04 = null;
            if (s0.p0()) {
                String c05 = s0.c0(K);
                if (s0.isNull(K2)) {
                    c0 = null;
                } else {
                    c0 = s0.c0(K2);
                }
                int i2 = (int) s0.getLong(K3);
                if (s0.isNull(K4)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf((int) s0.getLong(K4));
                }
                String c06 = s0.c0(K5);
                if (s0.isNull(K6)) {
                    c02 = null;
                } else {
                    c02 = s0.c0(K6);
                }
                if (s0.isNull(K7)) {
                    c03 = null;
                } else {
                    c03 = s0.c0(K7);
                }
                if (s0.isNull(K8)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf((int) s0.getLong(K8));
                }
                int i3 = (int) s0.getLong(K9);
                if (s0.isNull(K10)) {
                    __MediaStatus_stringToEnum = null;
                } else {
                    __MediaStatus_stringToEnum = animeListDao_Impl.__MediaStatus_stringToEnum(s0.c0(K10));
                }
                String c07 = s0.c0(K11);
                animeListDao_Impl.__watchStatusConverter.getClass();
                WatchStatus a = p17.a(c07);
                int i4 = (int) s0.getLong(K12);
                int i5 = (int) s0.getLong(K13);
                if (s0.isNull(K14)) {
                    __MediaFormat_stringToEnum = null;
                } else {
                    __MediaFormat_stringToEnum = animeListDao_Impl.__MediaFormat_stringToEnum(s0.c0(K14));
                }
                if (!s0.isNull(K15)) {
                    c04 = s0.c0(K15);
                }
                animeListItem = new AnimeListItem(c05, c0, i2, valueOf, c06, c02, c03, valueOf2, i3, __MediaStatus_stringToEnum, a, i4, i5, __MediaFormat_stringToEnum, c04, s0.getLong(K16), s0.getLong(K17));
            }
            return animeListItem;
        } finally {
            s0.close();
        }
    }

    public static final boolean observeIsSaved$lambda$0(String str, String str2, int i, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        boolean z = true;
        try {
            s0.J(1, str2);
            long j = i;
            s0.e(2, j);
            s0.e(3, j);
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

    public static final pn6 upsert$lambda$0(AnimeListDao_Impl animeListDao_Impl, AnimeListItem animeListItem, g85 g85Var) {
        g85Var.getClass();
        lv1 lv1Var = animeListDao_Impl.__upsertAdapterOfAnimeListItem;
        lv1Var.getClass();
        try {
            lv1Var.a.insert(g85Var, animeListItem);
        } catch (SQLException e) {
            lv1.a(e);
            lv1Var.b.handle(g85Var, animeListItem);
        }
        return pn6.a;
    }

    public static final pn6 upsertAll$lambda$0(AnimeListDao_Impl animeListDao_Impl, List list, g85 g85Var) {
        g85Var.getClass();
        animeListDao_Impl.__upsertAdapterOfAnimeListItem.b(g85Var, list);
        return pn6.a;
    }

    @Override // defpackage.tm
    public Object clearAll(vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new ui((byte) 3));
        if (L == w11.x) {
            return L;
        }
        return pn6.a;
    }

    @Override // defpackage.tm
    public Object deleteByAnimeId(String str, vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new zg(str, (byte) 1));
        if (L == w11.x) {
            return L;
        }
        return pn6.a;
    }

    @Override // defpackage.tm
    public Object getAllOnce(vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new um(this, (byte) 0));
    }

    @Override // defpackage.tm
    public Object getByAnimeId(String str, vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new b0(str, this, (byte) 9));
    }

    @Override // defpackage.tm
    public Object getLegacyByAnilistId(int i, vz0 vz0Var) {
        return q23.L(vz0Var, this.__db, true, false, new xm(i, (Object) this, (byte) 0));
    }

    public w42 observeAll() {
        return a34.M(this.__db, false, new String[]{"anime_list"}, new um(this, (byte) 1));
    }

    @Override // defpackage.tm
    public w42 observeAllWithProgress() {
        return a34.M(this.__db, false, new String[]{"anime_list", "watch_progress"}, new um(this, (byte) 2));
    }

    @Override // defpackage.tm
    public w42 observeByIdentity(String str, int i) {
        str.getClass();
        return a34.M(this.__db, false, new String[]{"anime_list"}, new vm((byte) 0, i, str, this));
    }

    @Override // defpackage.tm
    public w42 observeIsSaved(String str, int i) {
        str.getClass();
        return a34.M(this.__db, false, new String[]{"anime_list"}, new wm(str, i, (byte) 0));
    }

    @Override // defpackage.tm
    public Object promoteLegacyIdentity(String str, int i, vz0 vz0Var) {
        Object K = q23.K(vz0Var, new AnimeListDao_Impl$promoteLegacyIdentity$2(this, str, i, null), this.__db);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }

    @Override // defpackage.tm
    public Object upsert(AnimeListItem animeListItem, vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new b0(this, animeListItem, (byte) 8));
        if (L == w11.x) {
            return L;
        }
        return pn6.a;
    }

    @Override // defpackage.tm
    public Object upsertAll(List<AnimeListItem> list, vz0 vz0Var) {
        Object L = q23.L(vz0Var, this.__db, false, true, new b0(this, list, (byte) 10));
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
