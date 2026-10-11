package defpackage;

import com.anistation.local.entity.AnimeListItem;
import com.anistation.model.animelist.WatchStatus;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zm {
    public final AnimeListItem a;
    public final int b;
    public final WatchStatus c;

    public zm(AnimeListItem animeListItem, int i, WatchStatus watchStatus) {
        watchStatus.getClass();
        this.a = animeListItem;
        this.b = i;
        this.c = watchStatus;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zm) {
                zm zmVar = (zm) obj;
                if (!this.a.equals(zmVar.a) || this.b != zmVar.b || this.c != zmVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + qx1.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ExportAnimeRow(anime=" + this.a + ", watchedEpisodes=" + this.b + ", status=" + this.c + ")";
    }
}
