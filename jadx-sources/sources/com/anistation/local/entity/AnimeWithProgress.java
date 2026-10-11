package com.anistation.local.entity;

import defpackage.a34;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AnimeWithProgress {
    private final AnimeListItem anime;
    private final Integer currentEpisode;

    public AnimeWithProgress(AnimeListItem animeListItem, Integer num) {
        animeListItem.getClass();
        this.anime = animeListItem;
        this.currentEpisode = num;
    }

    public static /* synthetic */ AnimeWithProgress copy$default(AnimeWithProgress animeWithProgress, AnimeListItem animeListItem, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            animeListItem = animeWithProgress.anime;
        }
        if ((i & 2) != 0) {
            num = animeWithProgress.currentEpisode;
        }
        return animeWithProgress.copy(animeListItem, num);
    }

    public final AnimeListItem component1() {
        return this.anime;
    }

    public final Integer component2() {
        return this.currentEpisode;
    }

    public final AnimeWithProgress copy(AnimeListItem animeListItem, Integer num) {
        animeListItem.getClass();
        return new AnimeWithProgress(animeListItem, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimeWithProgress)) {
            return false;
        }
        AnimeWithProgress animeWithProgress = (AnimeWithProgress) obj;
        if (a34.i(this.anime, animeWithProgress.anime) && a34.i(this.currentEpisode, animeWithProgress.currentEpisode)) {
            return true;
        }
        return false;
    }

    public final AnimeListItem getAnime() {
        return this.anime;
    }

    public final Integer getCurrentEpisode() {
        return this.currentEpisode;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.anime.hashCode() * 31;
        Integer num = this.currentEpisode;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AnimeWithProgress(anime=" + this.anime + ", currentEpisode=" + this.currentEpisode + ")";
    }
}
