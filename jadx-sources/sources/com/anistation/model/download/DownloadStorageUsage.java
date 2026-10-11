package com.anistation.model.download;

import defpackage.q71;
import defpackage.qx1;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DownloadStorageUsage {
    private final long externalBytes;
    private final long freeBytes;
    private final long internalBytes;

    public /* synthetic */ DownloadStorageUsage(long j, long j2, long j3, int i, q71 q71Var) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }

    public static /* synthetic */ DownloadStorageUsage copy$default(DownloadStorageUsage downloadStorageUsage, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = downloadStorageUsage.internalBytes;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = downloadStorageUsage.externalBytes;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = downloadStorageUsage.freeBytes;
        }
        return downloadStorageUsage.copy(j4, j5, j3);
    }

    public final long component1() {
        return this.internalBytes;
    }

    public final long component2() {
        return this.externalBytes;
    }

    public final long component3() {
        return this.freeBytes;
    }

    public final DownloadStorageUsage copy(long j, long j2, long j3) {
        return new DownloadStorageUsage(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadStorageUsage)) {
            return false;
        }
        DownloadStorageUsage downloadStorageUsage = (DownloadStorageUsage) obj;
        if (this.internalBytes == downloadStorageUsage.internalBytes && this.externalBytes == downloadStorageUsage.externalBytes && this.freeBytes == downloadStorageUsage.freeBytes) {
            return true;
        }
        return false;
    }

    public final long getExternalBytes() {
        return this.externalBytes;
    }

    public final long getFreeBytes() {
        return this.freeBytes;
    }

    public final long getInternalBytes() {
        return this.internalBytes;
    }

    public final long getUsedBytes() {
        return this.internalBytes + this.externalBytes;
    }

    public int hashCode() {
        return Long.hashCode(this.freeBytes) + qx1.d(Long.hashCode(this.internalBytes) * 31, this.externalBytes, 31);
    }

    public String toString() {
        long j = this.internalBytes;
        long j2 = this.externalBytes;
        long j3 = this.freeBytes;
        StringBuilder n = zo5.n(j, "DownloadStorageUsage(internalBytes=", ", externalBytes=");
        n.append(j2);
        n.append(", freeBytes=");
        n.append(j3);
        n.append(")");
        return n.toString();
    }

    public DownloadStorageUsage(long j, long j2, long j3) {
        this.internalBytes = j;
        this.externalBytes = j2;
        this.freeBytes = j3;
    }

    public DownloadStorageUsage() {
        this(0L, 0L, 0L, 7, null);
    }
}
