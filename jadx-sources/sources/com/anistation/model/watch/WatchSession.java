package com.anistation.model.watch;

import com.anistation.model.Episode;
import defpackage.a34;
import defpackage.h11;
import defpackage.q71;
import defpackage.qx1;
import defpackage.uz5;
import defpackage.zo5;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WatchSession {
    private final int anilistId;
    private final String anistationId;
    private final String episodeTitle;
    private final List<Episode> episodes;
    private final Integer malId;
    private final String offlineAudioTrackKey;
    private final String offlineSourceType;
    private final int startEpisodeNumber;

    public WatchSession(String str, int i, Integer num, String str2, List<Episode> list, int i2, String str3, String str4) {
        str2.getClass();
        list.getClass();
        this.anistationId = str;
        this.anilistId = i;
        this.malId = num;
        this.episodeTitle = str2;
        this.episodes = list;
        this.startEpisodeNumber = i2;
        this.offlineSourceType = str3;
        this.offlineAudioTrackKey = str4;
    }

    public static /* synthetic */ WatchSession copy$default(WatchSession watchSession, String str, int i, Integer num, String str2, List list, int i2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = watchSession.anistationId;
        }
        if ((i3 & 2) != 0) {
            i = watchSession.anilistId;
        }
        if ((i3 & 4) != 0) {
            num = watchSession.malId;
        }
        if ((i3 & 8) != 0) {
            str2 = watchSession.episodeTitle;
        }
        if ((i3 & 16) != 0) {
            list = watchSession.episodes;
        }
        if ((i3 & 32) != 0) {
            i2 = watchSession.startEpisodeNumber;
        }
        if ((i3 & 64) != 0) {
            str3 = watchSession.offlineSourceType;
        }
        if ((i3 & 128) != 0) {
            str4 = watchSession.offlineAudioTrackKey;
        }
        String str5 = str3;
        String str6 = str4;
        List list2 = list;
        int i4 = i2;
        return watchSession.copy(str, i, num, str2, list2, i4, str5, str6);
    }

    public final String component1() {
        return this.anistationId;
    }

    public final int component2() {
        return this.anilistId;
    }

    public final Integer component3() {
        return this.malId;
    }

    public final String component4() {
        return this.episodeTitle;
    }

    public final List<Episode> component5() {
        return this.episodes;
    }

    public final int component6() {
        return this.startEpisodeNumber;
    }

    public final String component7() {
        return this.offlineSourceType;
    }

    public final String component8() {
        return this.offlineAudioTrackKey;
    }

    public final WatchSession copy(String str, int i, Integer num, String str2, List<Episode> list, int i2, String str3, String str4) {
        str2.getClass();
        list.getClass();
        return new WatchSession(str, i, num, str2, list, i2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchSession)) {
            return false;
        }
        WatchSession watchSession = (WatchSession) obj;
        if (a34.i(this.anistationId, watchSession.anistationId) && this.anilistId == watchSession.anilistId && a34.i(this.malId, watchSession.malId) && a34.i(this.episodeTitle, watchSession.episodeTitle) && a34.i(this.episodes, watchSession.episodes) && this.startEpisodeNumber == watchSession.startEpisodeNumber && a34.i(this.offlineSourceType, watchSession.offlineSourceType) && a34.i(this.offlineAudioTrackKey, watchSession.offlineAudioTrackKey)) {
            return true;
        }
        return false;
    }

    public final int getAnilistId() {
        return this.anilistId;
    }

    public final String getAnimeId() {
        String obj;
        String str = this.anistationId;
        if (str != null && (obj = uz5.w0(str).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return String.valueOf(this.anilistId);
    }

    public final String getAnistationId() {
        return this.anistationId;
    }

    public final String getEpisodeTitle() {
        return this.episodeTitle;
    }

    public final List<Episode> getEpisodes() {
        return this.episodes;
    }

    public final Integer getMalId() {
        return this.malId;
    }

    public final String getOfflineAudioTrackKey() {
        return this.offlineAudioTrackKey;
    }

    public final String getOfflineSourceType() {
        return this.offlineSourceType;
    }

    public final int getStartEpisodeNumber() {
        return this.startEpisodeNumber;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.anistationId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = qx1.c(this.anilistId, hashCode * 31, 31);
        Integer num = this.malId;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int c2 = qx1.c(this.startEpisodeNumber, zo5.j(this.episodes, zo5.i(this.episodeTitle, (c + hashCode2) * 31, 31), 31), 31);
        String str2 = this.offlineSourceType;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i2 = (c2 + hashCode3) * 31;
        String str3 = this.offlineAudioTrackKey;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.anistationId;
        int i = this.anilistId;
        Integer num = this.malId;
        String str2 = this.episodeTitle;
        List<Episode> list = this.episodes;
        int i2 = this.startEpisodeNumber;
        String str3 = this.offlineSourceType;
        String str4 = this.offlineAudioTrackKey;
        StringBuilder m = h11.m(i, "WatchSession(anistationId=", str, ", anilistId=", ", malId=");
        m.append(num);
        m.append(", episodeTitle=");
        m.append(str2);
        m.append(", episodes=");
        m.append(list);
        m.append(", startEpisodeNumber=");
        m.append(i2);
        m.append(", offlineSourceType=");
        return h11.l(m, str3, ", offlineAudioTrackKey=", str4, ")");
    }

    public /* synthetic */ WatchSession(String str, int i, Integer num, String str2, List list, int i2, String str3, String str4, int i3, q71 q71Var) {
        this((i3 & 1) != 0 ? null : str, i, num, str2, list, i2, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : str4);
    }
}
