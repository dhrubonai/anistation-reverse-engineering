package com.anistation.model.download;

import com.google.protobuf.CodedOutputStream;
import defpackage.a34;
import defpackage.db;
import defpackage.h11;
import defpackage.qx1;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class EpisodeDownload {
    private final long bytesDownloaded;
    private final long contentLength;
    private final String externalFileName;
    private final String externalSubtitleUri;
    private final String externalVideoUri;
    private final int failureReason;
    private final String id;
    private final boolean isExternal;
    private final boolean isInternal;
    private final boolean isWaitingForWifi;
    private final OfflineDownloadMetadata metadata;
    private final float percentDownloaded;
    private final EpisodeDownloadState state;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ EpisodeDownload(java.lang.String r20, com.anistation.model.download.OfflineDownloadMetadata r21, com.anistation.model.download.EpisodeDownloadState r22, boolean r23, boolean r24, float r25, long r26, long r28, int r30, boolean r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, defpackage.q71 r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L9
            r7 = r2
            goto Lb
        L9:
            r7 = r23
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L11
            r8 = r2
            goto L13
        L11:
            r8 = r24
        L13:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L19
            r15 = r2
            goto L1b
        L19:
            r15 = r31
        L1b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L23
            r16 = r2
            goto L25
        L23:
            r16 = r32
        L25:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2c
            r17 = r2
            goto L2e
        L2c:
            r17 = r33
        L2e:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L45
            r18 = r2
        L34:
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r9 = r25
            r10 = r26
            r12 = r28
            r14 = r30
            goto L48
        L45:
            r18 = r34
            goto L34
        L48:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anistation.model.download.EpisodeDownload.<init>(java.lang.String, com.anistation.model.download.OfflineDownloadMetadata, com.anistation.model.download.EpisodeDownloadState, boolean, boolean, float, long, long, int, boolean, java.lang.String, java.lang.String, java.lang.String, int, q71):void");
    }

    public static /* synthetic */ EpisodeDownload copy$default(EpisodeDownload episodeDownload, String str, OfflineDownloadMetadata offlineDownloadMetadata, EpisodeDownloadState episodeDownloadState, boolean z, boolean z2, float f, long j, long j2, int i, boolean z3, String str2, String str3, String str4, int i2, Object obj) {
        String str5;
        OfflineDownloadMetadata offlineDownloadMetadata2;
        EpisodeDownloadState episodeDownloadState2;
        boolean z4;
        boolean z5;
        float f2;
        long j3;
        long j4;
        int i3;
        boolean z6;
        String str6;
        String str7;
        String str8;
        if ((i2 & 1) != 0) {
            str5 = episodeDownload.id;
        } else {
            str5 = str;
        }
        if ((i2 & 2) != 0) {
            offlineDownloadMetadata2 = episodeDownload.metadata;
        } else {
            offlineDownloadMetadata2 = offlineDownloadMetadata;
        }
        if ((i2 & 4) != 0) {
            episodeDownloadState2 = episodeDownload.state;
        } else {
            episodeDownloadState2 = episodeDownloadState;
        }
        if ((i2 & 8) != 0) {
            z4 = episodeDownload.isInternal;
        } else {
            z4 = z;
        }
        if ((i2 & 16) != 0) {
            z5 = episodeDownload.isExternal;
        } else {
            z5 = z2;
        }
        if ((i2 & 32) != 0) {
            f2 = episodeDownload.percentDownloaded;
        } else {
            f2 = f;
        }
        if ((i2 & 64) != 0) {
            j3 = episodeDownload.bytesDownloaded;
        } else {
            j3 = j;
        }
        if ((i2 & 128) != 0) {
            j4 = episodeDownload.contentLength;
        } else {
            j4 = j2;
        }
        if ((i2 & 256) != 0) {
            i3 = episodeDownload.failureReason;
        } else {
            i3 = i;
        }
        if ((i2 & 512) != 0) {
            z6 = episodeDownload.isWaitingForWifi;
        } else {
            z6 = z3;
        }
        if ((i2 & 1024) != 0) {
            str6 = episodeDownload.externalVideoUri;
        } else {
            str6 = str2;
        }
        if ((i2 & 2048) != 0) {
            str7 = episodeDownload.externalSubtitleUri;
        } else {
            str7 = str3;
        }
        if ((i2 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            str8 = episodeDownload.externalFileName;
        } else {
            str8 = str4;
        }
        return episodeDownload.copy(str5, offlineDownloadMetadata2, episodeDownloadState2, z4, z5, f2, j3, j4, i3, z6, str6, str7, str8);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isWaitingForWifi;
    }

    public final String component11() {
        return this.externalVideoUri;
    }

    public final String component12() {
        return this.externalSubtitleUri;
    }

    public final String component13() {
        return this.externalFileName;
    }

    public final OfflineDownloadMetadata component2() {
        return this.metadata;
    }

    public final EpisodeDownloadState component3() {
        return this.state;
    }

    public final boolean component4() {
        return this.isInternal;
    }

    public final boolean component5() {
        return this.isExternal;
    }

    public final float component6() {
        return this.percentDownloaded;
    }

    public final long component7() {
        return this.bytesDownloaded;
    }

    public final long component8() {
        return this.contentLength;
    }

    public final int component9() {
        return this.failureReason;
    }

    public final EpisodeDownload copy(String str, OfflineDownloadMetadata offlineDownloadMetadata, EpisodeDownloadState episodeDownloadState, boolean z, boolean z2, float f, long j, long j2, int i, boolean z3, String str2, String str3, String str4) {
        str.getClass();
        offlineDownloadMetadata.getClass();
        episodeDownloadState.getClass();
        return new EpisodeDownload(str, offlineDownloadMetadata, episodeDownloadState, z, z2, f, j, j2, i, z3, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeDownload)) {
            return false;
        }
        EpisodeDownload episodeDownload = (EpisodeDownload) obj;
        if (a34.i(this.id, episodeDownload.id) && a34.i(this.metadata, episodeDownload.metadata) && this.state == episodeDownload.state && this.isInternal == episodeDownload.isInternal && this.isExternal == episodeDownload.isExternal && Float.compare(this.percentDownloaded, episodeDownload.percentDownloaded) == 0 && this.bytesDownloaded == episodeDownload.bytesDownloaded && this.contentLength == episodeDownload.contentLength && this.failureReason == episodeDownload.failureReason && this.isWaitingForWifi == episodeDownload.isWaitingForWifi && a34.i(this.externalVideoUri, episodeDownload.externalVideoUri) && a34.i(this.externalSubtitleUri, episodeDownload.externalSubtitleUri) && a34.i(this.externalFileName, episodeDownload.externalFileName)) {
            return true;
        }
        return false;
    }

    public final long getBytesDownloaded() {
        return this.bytesDownloaded;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExternalFileName() {
        return this.externalFileName;
    }

    public final String getExternalSubtitleUri() {
        return this.externalSubtitleUri;
    }

    public final String getExternalVideoUri() {
        return this.externalVideoUri;
    }

    public final int getFailureReason() {
        return this.failureReason;
    }

    public final String getId() {
        return this.id;
    }

    public final OfflineDownloadMetadata getMetadata() {
        return this.metadata;
    }

    public final float getPercentDownloaded() {
        return this.percentDownloaded;
    }

    public final float getProgressFraction() {
        if (this.state == EpisodeDownloadState.COMPLETED) {
            return 1.0f;
        }
        if (!Float.isNaN(this.percentDownloaded)) {
            float f = this.percentDownloaded;
            if (f >= 0.0f) {
                return db.B(f / 100.0f, 0.0f, 1.0f);
            }
        }
        return 0.0f;
    }

    public final EpisodeDownloadState getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int g = zo5.g(qx1.c(this.failureReason, qx1.d(qx1.d(qx1.b(this.percentDownloaded, zo5.g(zo5.g((this.state.hashCode() + ((this.metadata.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.isInternal), 31, this.isExternal), 31), this.bytesDownloaded, 31), this.contentLength, 31), 31), 31, this.isWaitingForWifi);
        String str = this.externalVideoUri;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (g + hashCode) * 31;
        String str2 = this.externalSubtitleUri;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.externalFileName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public final boolean isActive() {
        return this.state.getCanPause();
    }

    public final boolean isCompleted() {
        if (this.state == EpisodeDownloadState.COMPLETED) {
            return true;
        }
        return false;
    }

    public final boolean isExternal() {
        return this.isExternal;
    }

    public final boolean isInternal() {
        return this.isInternal;
    }

    public final boolean isPaused() {
        return this.state.getCanResume();
    }

    public final boolean isWaitingForWifi() {
        return this.isWaitingForWifi;
    }

    public String toString() {
        String str = this.id;
        OfflineDownloadMetadata offlineDownloadMetadata = this.metadata;
        EpisodeDownloadState episodeDownloadState = this.state;
        boolean z = this.isInternal;
        boolean z2 = this.isExternal;
        float f = this.percentDownloaded;
        long j = this.bytesDownloaded;
        long j2 = this.contentLength;
        int i = this.failureReason;
        boolean z3 = this.isWaitingForWifi;
        String str2 = this.externalVideoUri;
        String str3 = this.externalSubtitleUri;
        String str4 = this.externalFileName;
        StringBuilder sb = new StringBuilder("EpisodeDownload(id=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(offlineDownloadMetadata);
        sb.append(", state=");
        sb.append(episodeDownloadState);
        sb.append(", isInternal=");
        sb.append(z);
        sb.append(", isExternal=");
        sb.append(z2);
        sb.append(", percentDownloaded=");
        sb.append(f);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        qx1.w(sb, ", contentLength=", j2, ", failureReason=");
        sb.append(i);
        sb.append(", isWaitingForWifi=");
        sb.append(z3);
        sb.append(", externalVideoUri=");
        qx1.x(sb, str2, ", externalSubtitleUri=", str3, ", externalFileName=");
        return h11.k(sb, str4, ")");
    }

    public EpisodeDownload(String str, OfflineDownloadMetadata offlineDownloadMetadata, EpisodeDownloadState episodeDownloadState, boolean z, boolean z2, float f, long j, long j2, int i, boolean z3, String str2, String str3, String str4) {
        str.getClass();
        offlineDownloadMetadata.getClass();
        episodeDownloadState.getClass();
        this.id = str;
        this.metadata = offlineDownloadMetadata;
        this.state = episodeDownloadState;
        this.isInternal = z;
        this.isExternal = z2;
        this.percentDownloaded = f;
        this.bytesDownloaded = j;
        this.contentLength = j2;
        this.failureReason = i;
        this.isWaitingForWifi = z3;
        this.externalVideoUri = str2;
        this.externalSubtitleUri = str3;
        this.externalFileName = str4;
    }
}
