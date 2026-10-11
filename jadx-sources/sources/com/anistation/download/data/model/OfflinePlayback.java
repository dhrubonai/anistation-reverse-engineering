package com.anistation.download.data.model;

import com.anistation.model.download.OfflineDownloadMetadata;
import defpackage.a34;
import defpackage.lw3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class OfflinePlayback {
    private final lw3 mediaSource;
    private final OfflineDownloadMetadata metadata;

    public OfflinePlayback(lw3 lw3Var, OfflineDownloadMetadata offlineDownloadMetadata) {
        lw3Var.getClass();
        offlineDownloadMetadata.getClass();
        this.mediaSource = lw3Var;
        this.metadata = offlineDownloadMetadata;
    }

    public static /* synthetic */ OfflinePlayback copy$default(OfflinePlayback offlinePlayback, lw3 lw3Var, OfflineDownloadMetadata offlineDownloadMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            lw3Var = offlinePlayback.mediaSource;
        }
        if ((i & 2) != 0) {
            offlineDownloadMetadata = offlinePlayback.metadata;
        }
        return offlinePlayback.copy(lw3Var, offlineDownloadMetadata);
    }

    public final lw3 component1() {
        return this.mediaSource;
    }

    public final OfflineDownloadMetadata component2() {
        return this.metadata;
    }

    public final OfflinePlayback copy(lw3 lw3Var, OfflineDownloadMetadata offlineDownloadMetadata) {
        lw3Var.getClass();
        offlineDownloadMetadata.getClass();
        return new OfflinePlayback(lw3Var, offlineDownloadMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflinePlayback)) {
            return false;
        }
        OfflinePlayback offlinePlayback = (OfflinePlayback) obj;
        if (a34.i(this.mediaSource, offlinePlayback.mediaSource) && a34.i(this.metadata, offlinePlayback.metadata)) {
            return true;
        }
        return false;
    }

    public final lw3 getMediaSource() {
        return this.mediaSource;
    }

    public final OfflineDownloadMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.mediaSource.hashCode() * 31);
    }

    public String toString() {
        return "OfflinePlayback(mediaSource=" + this.mediaSource + ", metadata=" + this.metadata + ")";
    }
}
