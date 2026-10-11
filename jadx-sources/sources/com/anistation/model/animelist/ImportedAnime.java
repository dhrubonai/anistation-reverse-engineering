package com.anistation.model.animelist;

import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
import com.google.protobuf.CodedOutputStream;
import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.co2;
import defpackage.h11;
import defpackage.hu0;
import defpackage.i13;
import defpackage.iq4;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.qx1;
import defpackage.rb3;
import defpackage.uv1;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class ImportedAnime {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final int anilistId;
    private final String bannerImage;
    private final String coverImage;
    private final int currentAiredEpisodes;
    private final MediaFormat format;
    private final String id;
    private final Integer malId;
    private final MediaStatus mediaStatus;
    private final String notes;
    private final int progress;
    private final Integer score;
    private final WatchStatus status;
    private final String title;
    private final Integer totalEpisodes;

    static {
        co2 co2Var = new co2((byte) 10);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{null, null, null, null, null, null, null, null, bx7.B(jf3Var, co2Var), bx7.B(jf3Var, new co2((byte) 11)), null, null, bx7.B(jf3Var, new co2((byte) 12)), null};
    }

    public /* synthetic */ ImportedAnime(int i, String str, int i2, Integer num, String str2, String str3, String str4, Integer num2, int i3, MediaStatus mediaStatus, WatchStatus watchStatus, int i4, Integer num3, MediaFormat mediaFormat, String str5, kj5 kj5Var) {
        if (16382 != (i & 16382)) {
            iq4.throwMissingFieldException(i, 16382, ImportedAnime$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.anilistId = i2;
        this.malId = num;
        this.title = str2;
        this.coverImage = str3;
        this.bannerImage = str4;
        this.totalEpisodes = num2;
        this.currentAiredEpisodes = i3;
        this.mediaStatus = mediaStatus;
        this.status = watchStatus;
        this.progress = i4;
        this.score = num3;
        this.format = mediaFormat;
        this.notes = str5;
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_() {
        return MediaStatus.Companion.serializer();
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$0() {
        return WatchStatus.Companion.serializer();
    }

    public static final x73 _childSerializers$_anonymous_$1() {
        MediaFormat[] values = MediaFormat.values();
        values.getClass();
        return new uv1("com.anistation.model.MediaFormat", values);
    }

    public static /* synthetic */ ImportedAnime copy$default(ImportedAnime importedAnime, String str, int i, Integer num, String str2, String str3, String str4, Integer num2, int i2, MediaStatus mediaStatus, WatchStatus watchStatus, int i3, Integer num3, MediaFormat mediaFormat, String str5, int i4, Object obj) {
        String str6;
        int i5;
        Integer num4;
        String str7;
        String str8;
        String str9;
        Integer num5;
        int i6;
        MediaStatus mediaStatus2;
        WatchStatus watchStatus2;
        int i7;
        Integer num6;
        MediaFormat mediaFormat2;
        String str10;
        if ((i4 & 1) != 0) {
            str6 = importedAnime.id;
        } else {
            str6 = str;
        }
        if ((i4 & 2) != 0) {
            i5 = importedAnime.anilistId;
        } else {
            i5 = i;
        }
        if ((i4 & 4) != 0) {
            num4 = importedAnime.malId;
        } else {
            num4 = num;
        }
        if ((i4 & 8) != 0) {
            str7 = importedAnime.title;
        } else {
            str7 = str2;
        }
        if ((i4 & 16) != 0) {
            str8 = importedAnime.coverImage;
        } else {
            str8 = str3;
        }
        if ((i4 & 32) != 0) {
            str9 = importedAnime.bannerImage;
        } else {
            str9 = str4;
        }
        if ((i4 & 64) != 0) {
            num5 = importedAnime.totalEpisodes;
        } else {
            num5 = num2;
        }
        if ((i4 & 128) != 0) {
            i6 = importedAnime.currentAiredEpisodes;
        } else {
            i6 = i2;
        }
        if ((i4 & 256) != 0) {
            mediaStatus2 = importedAnime.mediaStatus;
        } else {
            mediaStatus2 = mediaStatus;
        }
        if ((i4 & 512) != 0) {
            watchStatus2 = importedAnime.status;
        } else {
            watchStatus2 = watchStatus;
        }
        if ((i4 & 1024) != 0) {
            i7 = importedAnime.progress;
        } else {
            i7 = i3;
        }
        if ((i4 & 2048) != 0) {
            num6 = importedAnime.score;
        } else {
            num6 = num3;
        }
        if ((i4 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            mediaFormat2 = importedAnime.format;
        } else {
            mediaFormat2 = mediaFormat;
        }
        if ((i4 & 8192) != 0) {
            str10 = importedAnime.notes;
        } else {
            str10 = str5;
        }
        return importedAnime.copy(str6, i5, num4, str7, str8, str9, num5, i6, mediaStatus2, watchStatus2, i7, num6, mediaFormat2, str10);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(ImportedAnime importedAnime, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 0) || importedAnime.id != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5.a, importedAnime.id);
        }
        v0 v0Var = (v0) hu0Var;
        v0Var.t(1, importedAnime.anilistId, aj5Var);
        i13 i13Var = i13.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 2, i13Var, importedAnime.malId);
        v0Var.w(aj5Var, 3, importedAnime.title);
        mz5 mz5Var = mz5.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 4, mz5Var, importedAnime.coverImage);
        hu0Var.encodeNullableSerializableElement(aj5Var, 5, mz5Var, importedAnime.bannerImage);
        hu0Var.encodeNullableSerializableElement(aj5Var, 6, i13Var, importedAnime.totalEpisodes);
        v0Var.t(7, importedAnime.currentAiredEpisodes, aj5Var);
        hu0Var.encodeNullableSerializableElement(aj5Var, 8, (mj5) rb3VarArr[8].getValue(), importedAnime.mediaStatus);
        v0Var.v(aj5Var, 9, (mj5) rb3VarArr[9].getValue(), importedAnime.status);
        v0Var.t(10, importedAnime.progress, aj5Var);
        hu0Var.encodeNullableSerializableElement(aj5Var, 11, i13Var, importedAnime.score);
        hu0Var.encodeNullableSerializableElement(aj5Var, 12, (mj5) rb3VarArr[12].getValue(), importedAnime.format);
        hu0Var.encodeNullableSerializableElement(aj5Var, 13, mz5Var, importedAnime.notes);
    }

    public final String component1() {
        return this.id;
    }

    public final WatchStatus component10() {
        return this.status;
    }

    public final int component11() {
        return this.progress;
    }

    public final Integer component12() {
        return this.score;
    }

    public final MediaFormat component13() {
        return this.format;
    }

    public final String component14() {
        return this.notes;
    }

    public final int component2() {
        return this.anilistId;
    }

    public final Integer component3() {
        return this.malId;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.coverImage;
    }

    public final String component6() {
        return this.bannerImage;
    }

    public final Integer component7() {
        return this.totalEpisodes;
    }

    public final int component8() {
        return this.currentAiredEpisodes;
    }

    public final MediaStatus component9() {
        return this.mediaStatus;
    }

    public final ImportedAnime copy(String str, int i, Integer num, String str2, String str3, String str4, Integer num2, int i2, MediaStatus mediaStatus, WatchStatus watchStatus, int i3, Integer num3, MediaFormat mediaFormat, String str5) {
        str2.getClass();
        watchStatus.getClass();
        return new ImportedAnime(str, i, num, str2, str3, str4, num2, i2, mediaStatus, watchStatus, i3, num3, mediaFormat, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportedAnime)) {
            return false;
        }
        ImportedAnime importedAnime = (ImportedAnime) obj;
        if (a34.i(this.id, importedAnime.id) && this.anilistId == importedAnime.anilistId && a34.i(this.malId, importedAnime.malId) && a34.i(this.title, importedAnime.title) && a34.i(this.coverImage, importedAnime.coverImage) && a34.i(this.bannerImage, importedAnime.bannerImage) && a34.i(this.totalEpisodes, importedAnime.totalEpisodes) && this.currentAiredEpisodes == importedAnime.currentAiredEpisodes && this.mediaStatus == importedAnime.mediaStatus && this.status == importedAnime.status && this.progress == importedAnime.progress && a34.i(this.score, importedAnime.score) && this.format == importedAnime.format && a34.i(this.notes, importedAnime.notes)) {
            return true;
        }
        return false;
    }

    public final int getAnilistId() {
        return this.anilistId;
    }

    public final String getBannerImage() {
        return this.bannerImage;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final int getCurrentAiredEpisodes() {
        return this.currentAiredEpisodes;
    }

    public final MediaFormat getFormat() {
        return this.format;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMalId() {
        return this.malId;
    }

    public final MediaStatus getMediaStatus() {
        return this.mediaStatus;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final Integer getScore() {
        return this.score;
    }

    public final WatchStatus getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTotalEpisodes() {
        return this.totalEpisodes;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = qx1.c(this.anilistId, hashCode * 31, 31);
        Integer num = this.malId;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i2 = zo5.i(this.title, (c + hashCode2) * 31, 31);
        String str2 = this.coverImage;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str3 = this.bannerImage;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Integer num2 = this.totalEpisodes;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int c2 = qx1.c(this.currentAiredEpisodes, (i4 + hashCode5) * 31, 31);
        MediaStatus mediaStatus = this.mediaStatus;
        if (mediaStatus == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = mediaStatus.hashCode();
        }
        int c3 = qx1.c(this.progress, (this.status.hashCode() + ((c2 + hashCode6) * 31)) * 31, 31);
        Integer num3 = this.score;
        if (num3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num3.hashCode();
        }
        int i5 = (c3 + hashCode7) * 31;
        MediaFormat mediaFormat = this.format;
        if (mediaFormat == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = mediaFormat.hashCode();
        }
        int i6 = (i5 + hashCode8) * 31;
        String str4 = this.notes;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        String str = this.id;
        int i = this.anilistId;
        Integer num = this.malId;
        String str2 = this.title;
        String str3 = this.coverImage;
        String str4 = this.bannerImage;
        Integer num2 = this.totalEpisodes;
        int i2 = this.currentAiredEpisodes;
        MediaStatus mediaStatus = this.mediaStatus;
        WatchStatus watchStatus = this.status;
        int i3 = this.progress;
        Integer num3 = this.score;
        MediaFormat mediaFormat = this.format;
        String str5 = this.notes;
        StringBuilder m = h11.m(i, "ImportedAnime(id=", str, ", anilistId=", ", malId=");
        m.append(num);
        m.append(", title=");
        m.append(str2);
        m.append(", coverImage=");
        qx1.x(m, str3, ", bannerImage=", str4, ", totalEpisodes=");
        m.append(num2);
        m.append(", currentAiredEpisodes=");
        m.append(i2);
        m.append(", mediaStatus=");
        m.append(mediaStatus);
        m.append(", status=");
        m.append(watchStatus);
        m.append(", progress=");
        m.append(i3);
        m.append(", score=");
        m.append(num3);
        m.append(", format=");
        m.append(mediaFormat);
        m.append(", notes=");
        m.append(str5);
        m.append(")");
        return m.toString();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return ImportedAnime$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ImportedAnime(String str, int i, Integer num, String str2, String str3, String str4, Integer num2, int i2, MediaStatus mediaStatus, WatchStatus watchStatus, int i3, Integer num3, MediaFormat mediaFormat, String str5) {
        str2.getClass();
        watchStatus.getClass();
        this.id = str;
        this.anilistId = i;
        this.malId = num;
        this.title = str2;
        this.coverImage = str3;
        this.bannerImage = str4;
        this.totalEpisodes = num2;
        this.currentAiredEpisodes = i2;
        this.mediaStatus = mediaStatus;
        this.status = watchStatus;
        this.progress = i3;
        this.score = num3;
        this.format = mediaFormat;
        this.notes = str5;
    }

    public /* synthetic */ ImportedAnime(String str, int i, Integer num, String str2, String str3, String str4, Integer num2, int i2, MediaStatus mediaStatus, WatchStatus watchStatus, int i3, Integer num3, MediaFormat mediaFormat, String str5, int i4, q71 q71Var) {
        this((i4 & 1) != 0 ? null : str, i, num, str2, str3, str4, num2, i2, mediaStatus, watchStatus, i3, num3, mediaFormat, str5);
    }
}
