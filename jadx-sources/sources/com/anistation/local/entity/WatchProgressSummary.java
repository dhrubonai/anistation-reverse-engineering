package com.anistation.local.entity;

import defpackage.a34;
import defpackage.h11;
import defpackage.qx1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WatchProgressSummary {
    private final int anilistId;
    private final String animeId;
    private final int completedEpisodes;
    private final int highestStartedEpisode;
    private final long updatedAt;

    public WatchProgressSummary(String str, int i, int i2, int i3, long j) {
        str.getClass();
        this.animeId = str;
        this.anilistId = i;
        this.highestStartedEpisode = i2;
        this.completedEpisodes = i3;
        this.updatedAt = j;
    }

    public static /* synthetic */ WatchProgressSummary copy$default(WatchProgressSummary watchProgressSummary, String str, int i, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = watchProgressSummary.animeId;
        }
        if ((i4 & 2) != 0) {
            i = watchProgressSummary.anilistId;
        }
        if ((i4 & 4) != 0) {
            i2 = watchProgressSummary.highestStartedEpisode;
        }
        if ((i4 & 8) != 0) {
            i3 = watchProgressSummary.completedEpisodes;
        }
        if ((i4 & 16) != 0) {
            j = watchProgressSummary.updatedAt;
        }
        long j2 = j;
        return watchProgressSummary.copy(str, i, i2, i3, j2);
    }

    public final String component1() {
        return this.animeId;
    }

    public final int component2() {
        return this.anilistId;
    }

    public final int component3() {
        return this.highestStartedEpisode;
    }

    public final int component4() {
        return this.completedEpisodes;
    }

    public final long component5() {
        return this.updatedAt;
    }

    public final WatchProgressSummary copy(String str, int i, int i2, int i3, long j) {
        str.getClass();
        return new WatchProgressSummary(str, i, i2, i3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchProgressSummary)) {
            return false;
        }
        WatchProgressSummary watchProgressSummary = (WatchProgressSummary) obj;
        if (a34.i(this.animeId, watchProgressSummary.animeId) && this.anilistId == watchProgressSummary.anilistId && this.highestStartedEpisode == watchProgressSummary.highestStartedEpisode && this.completedEpisodes == watchProgressSummary.completedEpisodes && this.updatedAt == watchProgressSummary.updatedAt) {
            return true;
        }
        return false;
    }

    public final int getAnilistId() {
        return this.anilistId;
    }

    public final String getAnimeId() {
        return this.animeId;
    }

    public final int getCompletedEpisodes() {
        return this.completedEpisodes;
    }

    public final int getHighestStartedEpisode() {
        return this.highestStartedEpisode;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return Long.hashCode(this.updatedAt) + qx1.c(this.completedEpisodes, qx1.c(this.highestStartedEpisode, qx1.c(this.anilistId, this.animeId.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.animeId;
        int i = this.anilistId;
        int i2 = this.highestStartedEpisode;
        int i3 = this.completedEpisodes;
        long j = this.updatedAt;
        StringBuilder m = h11.m(i, "WatchProgressSummary(animeId=", str, ", anilistId=", ", highestStartedEpisode=");
        h11.y(m, i2, ", completedEpisodes=", i3, ", updatedAt=");
        return qx1.k(j, ")", m);
    }
}
