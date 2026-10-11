package com.anistation.model.download.external;

import com.anistation.model.download.DownloadSettings;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.download.OfflineDownloadMetadata$$serializer;
import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.ds;
import defpackage.h11;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.rb3;
import defpackage.v0;
import defpackage.vj1;
import defpackage.x73;
import defpackage.zo5;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class ExternalDownloadRequest {
    private final String destinationName;
    private final String destinationTreeUri;
    private final String id;
    private final OfflineDownloadMetadata metadata;
    private final List<ExternalStreamKey> streamKeys;
    private final ExternalSubtitleRequest subtitle;
    public static final Companion Companion = new Companion(null);
    private static final rb3[] $childSerializers = {null, null, bx7.B(jf3.y, new vj1((byte) 12)), null, null, null};

    public /* synthetic */ ExternalDownloadRequest(int i, String str, OfflineDownloadMetadata offlineDownloadMetadata, List list, ExternalSubtitleRequest externalSubtitleRequest, String str2, String str3, kj5 kj5Var) {
        if (15 != (i & 15)) {
            iq4.throwMissingFieldException(i, 15, ExternalDownloadRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.metadata = offlineDownloadMetadata;
        this.streamKeys = list;
        this.subtitle = externalSubtitleRequest;
        if ((i & 16) == 0) {
            this.destinationTreeUri = null;
        } else {
            this.destinationTreeUri = str2;
        }
        if ((i & 32) == 0) {
            this.destinationName = DownloadSettings.DEFAULT_EXTERNAL_LOCATION;
        } else {
            this.destinationName = str3;
        }
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_() {
        return new ds(ExternalStreamKey$$serializer.INSTANCE, (byte) 0);
    }

    public static /* synthetic */ ExternalDownloadRequest copy$default(ExternalDownloadRequest externalDownloadRequest, String str, OfflineDownloadMetadata offlineDownloadMetadata, List list, ExternalSubtitleRequest externalSubtitleRequest, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalDownloadRequest.id;
        }
        if ((i & 2) != 0) {
            offlineDownloadMetadata = externalDownloadRequest.metadata;
        }
        if ((i & 4) != 0) {
            list = externalDownloadRequest.streamKeys;
        }
        if ((i & 8) != 0) {
            externalSubtitleRequest = externalDownloadRequest.subtitle;
        }
        if ((i & 16) != 0) {
            str2 = externalDownloadRequest.destinationTreeUri;
        }
        if ((i & 32) != 0) {
            str3 = externalDownloadRequest.destinationName;
        }
        String str4 = str2;
        String str5 = str3;
        return externalDownloadRequest.copy(str, offlineDownloadMetadata, list, externalSubtitleRequest, str4, str5);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(ExternalDownloadRequest externalDownloadRequest, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, externalDownloadRequest.id);
        v0Var.v(aj5Var, 1, OfflineDownloadMetadata$$serializer.INSTANCE, externalDownloadRequest.metadata);
        v0Var.v(aj5Var, 2, (mj5) rb3VarArr[2].getValue(), externalDownloadRequest.streamKeys);
        v0Var.encodeNullableSerializableElement(aj5Var, 3, ExternalSubtitleRequest$$serializer.INSTANCE, externalDownloadRequest.subtitle);
        if (v0Var.shouldEncodeElementDefault(aj5Var, 4) || externalDownloadRequest.destinationTreeUri != null) {
            v0Var.encodeNullableSerializableElement(aj5Var, 4, mz5.a, externalDownloadRequest.destinationTreeUri);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 5) || !a34.i(externalDownloadRequest.destinationName, DownloadSettings.DEFAULT_EXTERNAL_LOCATION)) {
            v0Var.w(aj5Var, 5, externalDownloadRequest.destinationName);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final OfflineDownloadMetadata component2() {
        return this.metadata;
    }

    public final List<ExternalStreamKey> component3() {
        return this.streamKeys;
    }

    public final ExternalSubtitleRequest component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.destinationTreeUri;
    }

    public final String component6() {
        return this.destinationName;
    }

    public final ExternalDownloadRequest copy(String str, OfflineDownloadMetadata offlineDownloadMetadata, List<ExternalStreamKey> list, ExternalSubtitleRequest externalSubtitleRequest, String str2, String str3) {
        str.getClass();
        offlineDownloadMetadata.getClass();
        list.getClass();
        str3.getClass();
        return new ExternalDownloadRequest(str, offlineDownloadMetadata, list, externalSubtitleRequest, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalDownloadRequest)) {
            return false;
        }
        ExternalDownloadRequest externalDownloadRequest = (ExternalDownloadRequest) obj;
        if (a34.i(this.id, externalDownloadRequest.id) && a34.i(this.metadata, externalDownloadRequest.metadata) && a34.i(this.streamKeys, externalDownloadRequest.streamKeys) && a34.i(this.subtitle, externalDownloadRequest.subtitle) && a34.i(this.destinationTreeUri, externalDownloadRequest.destinationTreeUri) && a34.i(this.destinationName, externalDownloadRequest.destinationName)) {
            return true;
        }
        return false;
    }

    public final String getDestinationName() {
        return this.destinationName;
    }

    public final String getDestinationTreeUri() {
        return this.destinationTreeUri;
    }

    public final String getId() {
        return this.id;
    }

    public final OfflineDownloadMetadata getMetadata() {
        return this.metadata;
    }

    public final List<ExternalStreamKey> getStreamKeys() {
        return this.streamKeys;
    }

    public final ExternalSubtitleRequest getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int hashCode;
        int j = zo5.j(this.streamKeys, (this.metadata.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
        ExternalSubtitleRequest externalSubtitleRequest = this.subtitle;
        int i = 0;
        if (externalSubtitleRequest == null) {
            hashCode = 0;
        } else {
            hashCode = externalSubtitleRequest.hashCode();
        }
        int i2 = (j + hashCode) * 31;
        String str = this.destinationTreeUri;
        if (str != null) {
            i = str.hashCode();
        }
        return this.destinationName.hashCode() + ((i2 + i) * 31);
    }

    public String toString() {
        String str = this.id;
        OfflineDownloadMetadata offlineDownloadMetadata = this.metadata;
        List<ExternalStreamKey> list = this.streamKeys;
        ExternalSubtitleRequest externalSubtitleRequest = this.subtitle;
        String str2 = this.destinationTreeUri;
        String str3 = this.destinationName;
        StringBuilder sb = new StringBuilder("ExternalDownloadRequest(id=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(offlineDownloadMetadata);
        sb.append(", streamKeys=");
        sb.append(list);
        sb.append(", subtitle=");
        sb.append(externalSubtitleRequest);
        sb.append(", destinationTreeUri=");
        return h11.l(sb, str2, ", destinationName=", str3, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return ExternalDownloadRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExternalDownloadRequest(String str, OfflineDownloadMetadata offlineDownloadMetadata, List<ExternalStreamKey> list, ExternalSubtitleRequest externalSubtitleRequest, String str2, String str3) {
        str.getClass();
        offlineDownloadMetadata.getClass();
        list.getClass();
        str3.getClass();
        this.id = str;
        this.metadata = offlineDownloadMetadata;
        this.streamKeys = list;
        this.subtitle = externalSubtitleRequest;
        this.destinationTreeUri = str2;
        this.destinationName = str3;
    }

    public /* synthetic */ ExternalDownloadRequest(String str, OfflineDownloadMetadata offlineDownloadMetadata, List list, ExternalSubtitleRequest externalSubtitleRequest, String str2, String str3, int i, q71 q71Var) {
        this(str, offlineDownloadMetadata, list, externalSubtitleRequest, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? DownloadSettings.DEFAULT_EXTERNAL_LOCATION : str3);
    }
}
