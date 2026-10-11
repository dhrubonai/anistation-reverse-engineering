package defpackage;

import com.anistation.model.Info;
import com.anistation.model.MediaStatus;
import com.anistation.model.NextAiringEpisode;
import com.anistation.model.Resource;
import com.anistation.model.animelist.WatchStatus;
import com.anistation.model.library.AnimeListItem;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hf1 extends t36 implements ic2 {
    public final /* synthetic */ zm6 x;
    public final /* synthetic */ Info y;
    public final /* synthetic */ kc2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf1(zm6 zm6Var, Info info, kc2 kc2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = zm6Var;
        this.y = info;
        this.z = kc2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new hf1(this.x, this.y, this.z, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        hf1 hf1Var = (hf1) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        hf1Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Integer num;
        WatchStatus watchStatus;
        MediaStatus mediaStatus;
        MediaStatus mediaStatus2;
        Integer num2;
        Integer num3;
        NextAiringEpisode nextAiringEpisode;
        Integer episodeNumber;
        m37.N(obj);
        zm6 zm6Var = this.x;
        boolean z = zm6Var.g;
        pn6 pn6Var = pn6.a;
        if (z && !a34.i(zm6Var.a, Resource.Loading.INSTANCE)) {
            boolean z2 = true;
            Info info = this.y;
            WatchStatus watchStatus2 = null;
            if (info != null && (nextAiringEpisode = info.getNextAiringEpisode()) != null && (episodeNumber = nextAiringEpisode.getEpisodeNumber()) != null) {
                num = new Integer(episodeNumber.intValue() - 1);
            } else {
                num = null;
            }
            int size = zm6Var.e.size();
            AnimeListItem animeListItem = zm6Var.f;
            if (animeListItem != null) {
                watchStatus = animeListItem.getWatchStatus();
            } else {
                watchStatus = null;
            }
            int i = 0;
            if (watchStatus != WatchStatus.PLAN_TO_WATCH) {
                z2 = false;
            }
            if (animeListItem != null) {
                mediaStatus = animeListItem.getMediaStatus();
            } else {
                mediaStatus = null;
            }
            if (info != null) {
                mediaStatus2 = info.getStatus();
            } else {
                mediaStatus2 = null;
            }
            if (mediaStatus != mediaStatus2 || (num != null && (animeListItem == null || animeListItem.getCurrentAiredEpisodes() != num.intValue()))) {
                if (info != null) {
                    num2 = info.getTotalEpisodes();
                } else {
                    num2 = null;
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    if (info != null) {
                        num3 = info.getTotalEpisodes();
                    } else {
                        num3 = null;
                    }
                    if (num3 != null) {
                        i = num3.intValue();
                    }
                }
                Integer num4 = new Integer(i);
                Integer num5 = new Integer(size);
                if (!z2 && animeListItem != null) {
                    watchStatus2 = animeListItem.getWatchStatus();
                }
                this.z.e(num2, num4, num5, watchStatus2);
            }
        }
        return pn6Var;
    }
}
