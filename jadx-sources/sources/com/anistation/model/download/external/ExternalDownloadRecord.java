package com.anistation.model.download.external;

import com.anistation.model.download.EpisodeDownloadState;
import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.hu0;
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
import defpackage.vj1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class ExternalDownloadRecord {
    private final long bytesDownloaded;
    private final long contentLength;
    private final String exportedVideoFileName;
    private final int failureReason;
    private final String fileName;
    private final float percentDownloaded;
    private final ExternalDownloadRequest request;
    private final EpisodeDownloadState state;
    private final String subtitleUri;
    private final long updatedAt;
    private final String videoUri;
    public static final Companion Companion = new Companion(null);
    private static final rb3[] $childSerializers = {null, bx7.B(jf3.y, new vj1((byte) 10)), null, null, null, null, null, null, null, null, null};

    public /* synthetic */ ExternalDownloadRecord(int i, ExternalDownloadRequest externalDownloadRequest, EpisodeDownloadState episodeDownloadState, float f, long j, long j2, int i2, String str, String str2, String str3, long j3, String str4, kj5 kj5Var) {
        long j4;
        if (1 != (i & 1)) {
            iq4.throwMissingFieldException(i, 1, ExternalDownloadRecord$$serializer.INSTANCE.getDescriptor());
        }
        this.request = externalDownloadRequest;
        if ((i & 2) == 0) {
            this.state = EpisodeDownloadState.QUEUED;
        } else {
            this.state = episodeDownloadState;
        }
        if ((i & 4) == 0) {
            this.percentDownloaded = 0.0f;
        } else {
            this.percentDownloaded = f;
        }
        if ((i & 8) == 0) {
            this.bytesDownloaded = 0L;
        } else {
            this.bytesDownloaded = j;
        }
        if ((i & 16) == 0) {
            this.contentLength = -1L;
        } else {
            this.contentLength = j2;
        }
        if ((i & 32) == 0) {
            this.failureReason = 0;
        } else {
            this.failureReason = i2;
        }
        if ((i & 64) == 0) {
            this.videoUri = null;
        } else {
            this.videoUri = str;
        }
        if ((i & 128) == 0) {
            this.subtitleUri = null;
        } else {
            this.subtitleUri = str2;
        }
        if ((i & 256) == 0) {
            this.fileName = null;
        } else {
            this.fileName = str3;
        }
        if ((i & 512) == 0) {
            j4 = System.currentTimeMillis();
        } else {
            j4 = j3;
        }
        this.updatedAt = j4;
        if ((i & 1024) == 0) {
            this.exportedVideoFileName = null;
        } else {
            this.exportedVideoFileName = str4;
        }
    }

    public static final x73 _childSerializers$_anonymous_() {
        EpisodeDownloadState[] values = EpisodeDownloadState.values();
        values.getClass();
        return new uv1("com.anistation.model.download.EpisodeDownloadState", values);
    }

    public static final /* synthetic */ rb3[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ ExternalDownloadRecord copy$default(ExternalDownloadRecord externalDownloadRecord, ExternalDownloadRequest externalDownloadRequest, EpisodeDownloadState episodeDownloadState, float f, long j, long j2, int i, String str, String str2, String str3, long j3, String str4, int i2, Object obj) {
        ExternalDownloadRequest externalDownloadRequest2;
        EpisodeDownloadState episodeDownloadState2;
        float f2;
        long j4;
        long j5;
        int i3;
        String str5;
        String str6;
        String str7;
        long j6;
        String str8;
        if ((i2 & 1) != 0) {
            externalDownloadRequest2 = externalDownloadRecord.request;
        } else {
            externalDownloadRequest2 = externalDownloadRequest;
        }
        if ((i2 & 2) != 0) {
            episodeDownloadState2 = externalDownloadRecord.state;
        } else {
            episodeDownloadState2 = episodeDownloadState;
        }
        if ((i2 & 4) != 0) {
            f2 = externalDownloadRecord.percentDownloaded;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            j4 = externalDownloadRecord.bytesDownloaded;
        } else {
            j4 = j;
        }
        if ((i2 & 16) != 0) {
            j5 = externalDownloadRecord.contentLength;
        } else {
            j5 = j2;
        }
        if ((i2 & 32) != 0) {
            i3 = externalDownloadRecord.failureReason;
        } else {
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            str5 = externalDownloadRecord.videoUri;
        } else {
            str5 = str;
        }
        if ((i2 & 128) != 0) {
            str6 = externalDownloadRecord.subtitleUri;
        } else {
            str6 = str2;
        }
        if ((i2 & 256) != 0) {
            str7 = externalDownloadRecord.fileName;
        } else {
            str7 = str3;
        }
        if ((i2 & 512) != 0) {
            j6 = externalDownloadRecord.updatedAt;
        } else {
            j6 = j3;
        }
        if ((i2 & 1024) != 0) {
            str8 = externalDownloadRecord.exportedVideoFileName;
        } else {
            str8 = str4;
        }
        return externalDownloadRecord.copy(externalDownloadRequest2, episodeDownloadState2, f2, j4, j5, i3, str5, str6, str7, j6, str8);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(ExternalDownloadRecord externalDownloadRecord, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        v0 v0Var = (v0) hu0Var;
        v0Var.v(aj5Var, 0, ExternalDownloadRequest$$serializer.INSTANCE, externalDownloadRecord.request);
        if (v0Var.shouldEncodeElementDefault(aj5Var, 1) || externalDownloadRecord.state != EpisodeDownloadState.QUEUED) {
            v0Var.v(aj5Var, 1, (mj5) rb3VarArr[1].getValue(), externalDownloadRecord.state);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 2) || Float.compare(externalDownloadRecord.percentDownloaded, 0.0f) != 0) {
            v0Var.r(aj5Var, 2, externalDownloadRecord.percentDownloaded);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 3) || externalDownloadRecord.bytesDownloaded != 0) {
            v0Var.u(aj5Var, 3, externalDownloadRecord.bytesDownloaded);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 4) || externalDownloadRecord.contentLength != -1) {
            v0Var.u(aj5Var, 4, externalDownloadRecord.contentLength);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 5) || externalDownloadRecord.failureReason != 0) {
            v0Var.t(5, externalDownloadRecord.failureReason, aj5Var);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 6) || externalDownloadRecord.videoUri != null) {
            v0Var.encodeNullableSerializableElement(aj5Var, 6, mz5.a, externalDownloadRecord.videoUri);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 7) || externalDownloadRecord.subtitleUri != null) {
            v0Var.encodeNullableSerializableElement(aj5Var, 7, mz5.a, externalDownloadRecord.subtitleUri);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 8) || externalDownloadRecord.fileName != null) {
            v0Var.encodeNullableSerializableElement(aj5Var, 8, mz5.a, externalDownloadRecord.fileName);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 9) || externalDownloadRecord.updatedAt != System.currentTimeMillis()) {
            v0Var.u(aj5Var, 9, externalDownloadRecord.updatedAt);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 10) || externalDownloadRecord.exportedVideoFileName != null) {
            v0Var.encodeNullableSerializableElement(aj5Var, 10, mz5.a, externalDownloadRecord.exportedVideoFileName);
        }
    }

    public final ExternalDownloadRequest component1() {
        return this.request;
    }

    public final long component10() {
        return this.updatedAt;
    }

    public final String component11() {
        return this.exportedVideoFileName;
    }

    public final EpisodeDownloadState component2() {
        return this.state;
    }

    public final float component3() {
        return this.percentDownloaded;
    }

    public final long component4() {
        return this.bytesDownloaded;
    }

    public final long component5() {
        return this.contentLength;
    }

    public final int component6() {
        return this.failureReason;
    }

    public final String component7() {
        return this.videoUri;
    }

    public final String component8() {
        return this.subtitleUri;
    }

    public final String component9() {
        return this.fileName;
    }

    public final ExternalDownloadRecord copy(ExternalDownloadRequest externalDownloadRequest, EpisodeDownloadState episodeDownloadState, float f, long j, long j2, int i, String str, String str2, String str3, long j3, String str4) {
        externalDownloadRequest.getClass();
        episodeDownloadState.getClass();
        return new ExternalDownloadRecord(externalDownloadRequest, episodeDownloadState, f, j, j2, i, str, str2, str3, j3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalDownloadRecord)) {
            return false;
        }
        ExternalDownloadRecord externalDownloadRecord = (ExternalDownloadRecord) obj;
        if (a34.i(this.request, externalDownloadRecord.request) && this.state == externalDownloadRecord.state && Float.compare(this.percentDownloaded, externalDownloadRecord.percentDownloaded) == 0 && this.bytesDownloaded == externalDownloadRecord.bytesDownloaded && this.contentLength == externalDownloadRecord.contentLength && this.failureReason == externalDownloadRecord.failureReason && a34.i(this.videoUri, externalDownloadRecord.videoUri) && a34.i(this.subtitleUri, externalDownloadRecord.subtitleUri) && a34.i(this.fileName, externalDownloadRecord.fileName) && this.updatedAt == externalDownloadRecord.updatedAt && a34.i(this.exportedVideoFileName, externalDownloadRecord.exportedVideoFileName)) {
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

    public final String getExportedVideoFileName() {
        return this.exportedVideoFileName;
    }

    public final int getFailureReason() {
        return this.failureReason;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final float getPercentDownloaded() {
        return this.percentDownloaded;
    }

    public final ExternalDownloadRequest getRequest() {
        return this.request;
    }

    public final EpisodeDownloadState getState() {
        return this.state;
    }

    public final String getSubtitleUri() {
        return this.subtitleUri;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getVideoUri() {
        return this.videoUri;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int c = qx1.c(this.failureReason, qx1.d(qx1.d(qx1.b(this.percentDownloaded, (this.state.hashCode() + (this.request.hashCode() * 31)) * 31, 31), this.bytesDownloaded, 31), this.contentLength, 31), 31);
        String str = this.videoUri;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        String str2 = this.subtitleUri;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.fileName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int d = qx1.d((i3 + hashCode3) * 31, this.updatedAt, 31);
        String str4 = this.exportedVideoFileName;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return d + i;
    }

    public String toString() {
        ExternalDownloadRequest externalDownloadRequest = this.request;
        EpisodeDownloadState episodeDownloadState = this.state;
        float f = this.percentDownloaded;
        long j = this.bytesDownloaded;
        long j2 = this.contentLength;
        int i = this.failureReason;
        String str = this.videoUri;
        String str2 = this.subtitleUri;
        String str3 = this.fileName;
        long j3 = this.updatedAt;
        String str4 = this.exportedVideoFileName;
        StringBuilder sb = new StringBuilder("ExternalDownloadRecord(request=");
        sb.append(externalDownloadRequest);
        sb.append(", state=");
        sb.append(episodeDownloadState);
        sb.append(", percentDownloaded=");
        sb.append(f);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        qx1.w(sb, ", contentLength=", j2, ", failureReason=");
        sb.append(i);
        sb.append(", videoUri=");
        sb.append(str);
        sb.append(", subtitleUri=");
        qx1.x(sb, str2, ", fileName=", str3, ", updatedAt=");
        sb.append(j3);
        sb.append(", exportedVideoFileName=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return ExternalDownloadRecord$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExternalDownloadRecord(ExternalDownloadRequest externalDownloadRequest, EpisodeDownloadState episodeDownloadState, float f, long j, long j2, int i, String str, String str2, String str3, long j3, String str4) {
        externalDownloadRequest.getClass();
        episodeDownloadState.getClass();
        this.request = externalDownloadRequest;
        this.state = episodeDownloadState;
        this.percentDownloaded = f;
        this.bytesDownloaded = j;
        this.contentLength = j2;
        this.failureReason = i;
        this.videoUri = str;
        this.subtitleUri = str2;
        this.fileName = str3;
        this.updatedAt = j3;
        this.exportedVideoFileName = str4;
    }

    public /* synthetic */ ExternalDownloadRecord(ExternalDownloadRequest externalDownloadRequest, EpisodeDownloadState episodeDownloadState, float f, long j, long j2, int i, String str, String str2, String str3, long j3, String str4, int i2, q71 q71Var) {
        this(externalDownloadRequest, (i2 & 2) != 0 ? EpisodeDownloadState.QUEUED : episodeDownloadState, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? -1L : j2, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? System.currentTimeMillis() : j3, (i2 & 1024) != 0 ? null : str4);
    }
}
