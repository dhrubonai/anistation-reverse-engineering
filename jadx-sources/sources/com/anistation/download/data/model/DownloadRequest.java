package com.anistation.download.data.model;

import com.anistation.model.Episode;
import com.anistation.model.MediaFormat;
import com.anistation.model.watch.Source;
import com.anistation.model.watch.SourcesResponse;
import com.anistation.model.watch.Track;
import com.anistation.model.watch.WatchSession;
import com.google.protobuf.CodedOutputStream;
import defpackage.a34;
import defpackage.h11;
import defpackage.qx1;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DownloadRequest {
    private final String airedAt;
    private final String animeTitle;
    private final String bannerImage;
    private final String coverImage;
    private final Episode episode;
    private final MediaFormat format;
    private final SourcesResponse response;
    private final Integer seasonYear;
    private final String selectedAudioLabel;
    private final String selectedAudioLanguage;
    private final Track selectedSubtitle;
    private final String server;
    private final WatchSession session;
    private final Source source;
    private final String sourceType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DownloadRequest(com.anistation.model.watch.WatchSession r20, com.anistation.model.Episode r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Integer r25, com.anistation.model.MediaFormat r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, com.anistation.model.watch.Source r30, com.anistation.model.watch.SourcesResponse r31, com.anistation.model.watch.Track r32, java.lang.String r33, java.lang.String r34, int r35, defpackage.q71 r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto La
            r16 = r2
            goto Lc
        La:
            r16 = r32
        Lc:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L13
            r17 = r2
            goto L15
        L13:
            r17 = r33
        L15:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L36
            r18 = r2
        L1b:
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            goto L39
        L36:
            r18 = r34
            goto L1b
        L39:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anistation.download.data.model.DownloadRequest.<init>(com.anistation.model.watch.WatchSession, com.anistation.model.Episode, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.anistation.model.MediaFormat, java.lang.String, java.lang.String, java.lang.String, com.anistation.model.watch.Source, com.anistation.model.watch.SourcesResponse, com.anistation.model.watch.Track, java.lang.String, java.lang.String, int, q71):void");
    }

    public static /* synthetic */ DownloadRequest copy$default(DownloadRequest downloadRequest, WatchSession watchSession, Episode episode, String str, String str2, String str3, Integer num, MediaFormat mediaFormat, String str4, String str5, String str6, Source source, SourcesResponse sourcesResponse, Track track, String str7, String str8, int i, Object obj) {
        WatchSession watchSession2;
        Episode episode2;
        String str9;
        String str10;
        String str11;
        Integer num2;
        MediaFormat mediaFormat2;
        String str12;
        String str13;
        String str14;
        Source source2;
        SourcesResponse sourcesResponse2;
        Track track2;
        String str15;
        String str16;
        if ((i & 1) != 0) {
            watchSession2 = downloadRequest.session;
        } else {
            watchSession2 = watchSession;
        }
        if ((i & 2) != 0) {
            episode2 = downloadRequest.episode;
        } else {
            episode2 = episode;
        }
        if ((i & 4) != 0) {
            str9 = downloadRequest.animeTitle;
        } else {
            str9 = str;
        }
        if ((i & 8) != 0) {
            str10 = downloadRequest.coverImage;
        } else {
            str10 = str2;
        }
        if ((i & 16) != 0) {
            str11 = downloadRequest.bannerImage;
        } else {
            str11 = str3;
        }
        if ((i & 32) != 0) {
            num2 = downloadRequest.seasonYear;
        } else {
            num2 = num;
        }
        if ((i & 64) != 0) {
            mediaFormat2 = downloadRequest.format;
        } else {
            mediaFormat2 = mediaFormat;
        }
        if ((i & 128) != 0) {
            str12 = downloadRequest.airedAt;
        } else {
            str12 = str4;
        }
        if ((i & 256) != 0) {
            str13 = downloadRequest.server;
        } else {
            str13 = str5;
        }
        if ((i & 512) != 0) {
            str14 = downloadRequest.sourceType;
        } else {
            str14 = str6;
        }
        if ((i & 1024) != 0) {
            source2 = downloadRequest.source;
        } else {
            source2 = source;
        }
        if ((i & 2048) != 0) {
            sourcesResponse2 = downloadRequest.response;
        } else {
            sourcesResponse2 = sourcesResponse;
        }
        if ((i & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            track2 = downloadRequest.selectedSubtitle;
        } else {
            track2 = track;
        }
        if ((i & 8192) != 0) {
            str15 = downloadRequest.selectedAudioLanguage;
        } else {
            str15 = str7;
        }
        if ((i & 16384) != 0) {
            str16 = downloadRequest.selectedAudioLabel;
        } else {
            str16 = str8;
        }
        return downloadRequest.copy(watchSession2, episode2, str9, str10, str11, num2, mediaFormat2, str12, str13, str14, source2, sourcesResponse2, track2, str15, str16);
    }

    public final WatchSession component1() {
        return this.session;
    }

    public final String component10() {
        return this.sourceType;
    }

    public final Source component11() {
        return this.source;
    }

    public final SourcesResponse component12() {
        return this.response;
    }

    public final Track component13() {
        return this.selectedSubtitle;
    }

    public final String component14() {
        return this.selectedAudioLanguage;
    }

    public final String component15() {
        return this.selectedAudioLabel;
    }

    public final Episode component2() {
        return this.episode;
    }

    public final String component3() {
        return this.animeTitle;
    }

    public final String component4() {
        return this.coverImage;
    }

    public final String component5() {
        return this.bannerImage;
    }

    public final Integer component6() {
        return this.seasonYear;
    }

    public final MediaFormat component7() {
        return this.format;
    }

    public final String component8() {
        return this.airedAt;
    }

    public final String component9() {
        return this.server;
    }

    public final DownloadRequest copy(WatchSession watchSession, Episode episode, String str, String str2, String str3, Integer num, MediaFormat mediaFormat, String str4, String str5, String str6, Source source, SourcesResponse sourcesResponse, Track track, String str7, String str8) {
        watchSession.getClass();
        episode.getClass();
        str.getClass();
        str5.getClass();
        str6.getClass();
        source.getClass();
        sourcesResponse.getClass();
        return new DownloadRequest(watchSession, episode, str, str2, str3, num, mediaFormat, str4, str5, str6, source, sourcesResponse, track, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (a34.i(this.session, downloadRequest.session) && a34.i(this.episode, downloadRequest.episode) && a34.i(this.animeTitle, downloadRequest.animeTitle) && a34.i(this.coverImage, downloadRequest.coverImage) && a34.i(this.bannerImage, downloadRequest.bannerImage) && a34.i(this.seasonYear, downloadRequest.seasonYear) && this.format == downloadRequest.format && a34.i(this.airedAt, downloadRequest.airedAt) && a34.i(this.server, downloadRequest.server) && a34.i(this.sourceType, downloadRequest.sourceType) && a34.i(this.source, downloadRequest.source) && a34.i(this.response, downloadRequest.response) && a34.i(this.selectedSubtitle, downloadRequest.selectedSubtitle) && a34.i(this.selectedAudioLanguage, downloadRequest.selectedAudioLanguage) && a34.i(this.selectedAudioLabel, downloadRequest.selectedAudioLabel)) {
            return true;
        }
        return false;
    }

    public final String getAiredAt() {
        return this.airedAt;
    }

    public final String getAnimeTitle() {
        return this.animeTitle;
    }

    public final String getBannerImage() {
        return this.bannerImage;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final Episode getEpisode() {
        return this.episode;
    }

    public final MediaFormat getFormat() {
        return this.format;
    }

    public final SourcesResponse getResponse() {
        return this.response;
    }

    public final Integer getSeasonYear() {
        return this.seasonYear;
    }

    public final String getSelectedAudioLabel() {
        return this.selectedAudioLabel;
    }

    public final String getSelectedAudioLanguage() {
        return this.selectedAudioLanguage;
    }

    public final Track getSelectedSubtitle() {
        return this.selectedSubtitle;
    }

    public final String getServer() {
        return this.server;
    }

    public final WatchSession getSession() {
        return this.session;
    }

    public final Source getSource() {
        return this.source;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i = zo5.i(this.animeTitle, (this.episode.hashCode() + (this.session.hashCode() * 31)) * 31, 31);
        String str = this.coverImage;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str2 = this.bannerImage;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        Integer num = this.seasonYear;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        MediaFormat mediaFormat = this.format;
        if (mediaFormat == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = mediaFormat.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        String str3 = this.airedAt;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int hashCode8 = (this.response.hashCode() + ((this.source.hashCode() + zo5.i(this.sourceType, zo5.i(this.server, (i6 + hashCode5) * 31, 31), 31)) * 31)) * 31;
        Track track = this.selectedSubtitle;
        if (track == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = track.hashCode();
        }
        int i7 = (hashCode8 + hashCode6) * 31;
        String str4 = this.selectedAudioLanguage;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str5 = this.selectedAudioLabel;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return i8 + i2;
    }

    public String toString() {
        WatchSession watchSession = this.session;
        Episode episode = this.episode;
        String str = this.animeTitle;
        String str2 = this.coverImage;
        String str3 = this.bannerImage;
        Integer num = this.seasonYear;
        MediaFormat mediaFormat = this.format;
        String str4 = this.airedAt;
        String str5 = this.server;
        String str6 = this.sourceType;
        Source source = this.source;
        SourcesResponse sourcesResponse = this.response;
        Track track = this.selectedSubtitle;
        String str7 = this.selectedAudioLanguage;
        String str8 = this.selectedAudioLabel;
        StringBuilder sb = new StringBuilder("DownloadRequest(session=");
        sb.append(watchSession);
        sb.append(", episode=");
        sb.append(episode);
        sb.append(", animeTitle=");
        qx1.x(sb, str, ", coverImage=", str2, ", bannerImage=");
        sb.append(str3);
        sb.append(", seasonYear=");
        sb.append(num);
        sb.append(", format=");
        sb.append(mediaFormat);
        sb.append(", airedAt=");
        sb.append(str4);
        sb.append(", server=");
        qx1.x(sb, str5, ", sourceType=", str6, ", source=");
        sb.append(source);
        sb.append(", response=");
        sb.append(sourcesResponse);
        sb.append(", selectedSubtitle=");
        sb.append(track);
        sb.append(", selectedAudioLanguage=");
        sb.append(str7);
        sb.append(", selectedAudioLabel=");
        return h11.k(sb, str8, ")");
    }

    public DownloadRequest(WatchSession watchSession, Episode episode, String str, String str2, String str3, Integer num, MediaFormat mediaFormat, String str4, String str5, String str6, Source source, SourcesResponse sourcesResponse, Track track, String str7, String str8) {
        watchSession.getClass();
        episode.getClass();
        str.getClass();
        str5.getClass();
        str6.getClass();
        source.getClass();
        sourcesResponse.getClass();
        this.session = watchSession;
        this.episode = episode;
        this.animeTitle = str;
        this.coverImage = str2;
        this.bannerImage = str3;
        this.seasonYear = num;
        this.format = mediaFormat;
        this.airedAt = str4;
        this.server = str5;
        this.sourceType = str6;
        this.source = source;
        this.response = sourcesResponse;
        this.selectedSubtitle = track;
        this.selectedAudioLanguage = str7;
        this.selectedAudioLabel = str8;
    }
}
