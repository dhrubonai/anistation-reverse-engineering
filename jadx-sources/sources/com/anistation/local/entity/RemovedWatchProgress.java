package com.anistation.local.entity;

import defpackage.a34;
import defpackage.qx1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class RemovedWatchProgress {
    private final String animeId;

    public RemovedWatchProgress(String str) {
        str.getClass();
        this.animeId = str;
    }

    public static /* synthetic */ RemovedWatchProgress copy$default(RemovedWatchProgress removedWatchProgress, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = removedWatchProgress.animeId;
        }
        return removedWatchProgress.copy(str);
    }

    public final String component1() {
        return this.animeId;
    }

    public final RemovedWatchProgress copy(String str) {
        str.getClass();
        return new RemovedWatchProgress(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RemovedWatchProgress) && a34.i(this.animeId, ((RemovedWatchProgress) obj).animeId)) {
            return true;
        }
        return false;
    }

    public final String getAnimeId() {
        return this.animeId;
    }

    public int hashCode() {
        return this.animeId.hashCode();
    }

    public String toString() {
        return qx1.m("RemovedWatchProgress(animeId=", this.animeId, ")");
    }
}
