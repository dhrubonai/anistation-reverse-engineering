package com.anistation.model.watch;

import com.anistation.model.watch.shiro.ShiroPlaybackPlan;
import com.anistation.model.watch.shiro.ShiroPlaybackPlan$$serializer;
import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.ds;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.jk5;
import defpackage.kj5;
import defpackage.mj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.rb3;
import defpackage.x73;
import defpackage.yj2;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class SourcesResponse {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final List<DownloadSource> downloads;
    private final Map<String, String> headers;
    private final ShiroPlaybackPlan playback;
    private final Skips skips;
    private final List<Source> sources;
    private final List<Track> tracks;

    static {
        jk5 jk5Var = new jk5((byte) 6);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{bx7.B(jf3Var, jk5Var), bx7.B(jf3Var, new jk5((byte) 7)), null, bx7.B(jf3Var, new jk5((byte) 8)), bx7.B(jf3Var, new jk5((byte) 9)), null};
    }

    public /* synthetic */ SourcesResponse(int i, List list, List list2, Skips skips, List list3, Map map, ShiroPlaybackPlan shiroPlaybackPlan, kj5 kj5Var) {
        if (23 != (i & 23)) {
            iq4.throwMissingFieldException(i, 23, SourcesResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.sources = list;
        this.tracks = list2;
        this.skips = skips;
        if ((i & 8) == 0) {
            this.downloads = null;
        } else {
            this.downloads = list3;
        }
        this.headers = map;
        if ((i & 32) == 0) {
            this.playback = null;
        } else {
            this.playback = shiroPlaybackPlan;
        }
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_() {
        return new ds(Source$$serializer.INSTANCE, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$0() {
        return new ds(Track$$serializer.INSTANCE, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$1() {
        return new ds(DownloadSource$$serializer.INSTANCE, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$2() {
        mz5 mz5Var = mz5.a;
        return new yj2(mz5Var, mz5Var, (byte) 1);
    }

    public static /* synthetic */ SourcesResponse copy$default(SourcesResponse sourcesResponse, List list, List list2, Skips skips, List list3, Map map, ShiroPlaybackPlan shiroPlaybackPlan, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sourcesResponse.sources;
        }
        if ((i & 2) != 0) {
            list2 = sourcesResponse.tracks;
        }
        if ((i & 4) != 0) {
            skips = sourcesResponse.skips;
        }
        if ((i & 8) != 0) {
            list3 = sourcesResponse.downloads;
        }
        if ((i & 16) != 0) {
            map = sourcesResponse.headers;
        }
        if ((i & 32) != 0) {
            shiroPlaybackPlan = sourcesResponse.playback;
        }
        Map map2 = map;
        ShiroPlaybackPlan shiroPlaybackPlan2 = shiroPlaybackPlan;
        return sourcesResponse.copy(list, list2, skips, list3, map2, shiroPlaybackPlan2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(SourcesResponse sourcesResponse, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        hu0Var.encodeNullableSerializableElement(aj5Var, 0, (mj5) rb3VarArr[0].getValue(), sourcesResponse.sources);
        hu0Var.encodeNullableSerializableElement(aj5Var, 1, (mj5) rb3VarArr[1].getValue(), sourcesResponse.tracks);
        hu0Var.encodeNullableSerializableElement(aj5Var, 2, Skips$$serializer.INSTANCE, sourcesResponse.skips);
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 3) || sourcesResponse.downloads != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 3, (mj5) rb3VarArr[3].getValue(), sourcesResponse.downloads);
        }
        hu0Var.encodeNullableSerializableElement(aj5Var, 4, (mj5) rb3VarArr[4].getValue(), sourcesResponse.headers);
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 5) || sourcesResponse.playback != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 5, ShiroPlaybackPlan$$serializer.INSTANCE, sourcesResponse.playback);
        }
    }

    public final List<Source> component1() {
        return this.sources;
    }

    public final List<Track> component2() {
        return this.tracks;
    }

    public final Skips component3() {
        return this.skips;
    }

    public final List<DownloadSource> component4() {
        return this.downloads;
    }

    public final Map<String, String> component5() {
        return this.headers;
    }

    public final ShiroPlaybackPlan component6() {
        return this.playback;
    }

    public final SourcesResponse copy(List<Source> list, List<Track> list2, Skips skips, List<DownloadSource> list3, Map<String, String> map, ShiroPlaybackPlan shiroPlaybackPlan) {
        return new SourcesResponse(list, list2, skips, list3, map, shiroPlaybackPlan);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourcesResponse)) {
            return false;
        }
        SourcesResponse sourcesResponse = (SourcesResponse) obj;
        if (a34.i(this.sources, sourcesResponse.sources) && a34.i(this.tracks, sourcesResponse.tracks) && a34.i(this.skips, sourcesResponse.skips) && a34.i(this.downloads, sourcesResponse.downloads) && a34.i(this.headers, sourcesResponse.headers) && a34.i(this.playback, sourcesResponse.playback)) {
            return true;
        }
        return false;
    }

    public final List<DownloadSource> getDownloads() {
        return this.downloads;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final ShiroPlaybackPlan getPlayback() {
        return this.playback;
    }

    public final Skips getSkips() {
        return this.skips;
    }

    public final List<Source> getSources() {
        return this.sources;
    }

    public final List<Track> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        List<Source> list = this.sources;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<Track> list2 = this.tracks;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Skips skips = this.skips;
        if (skips == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = skips.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<DownloadSource> list3 = this.downloads;
        if (list3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Map<String, String> map = this.headers;
        if (map == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = map.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        ShiroPlaybackPlan shiroPlaybackPlan = this.playback;
        if (shiroPlaybackPlan != null) {
            i = shiroPlaybackPlan.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        return "SourcesResponse(sources=" + this.sources + ", tracks=" + this.tracks + ", skips=" + this.skips + ", downloads=" + this.downloads + ", headers=" + this.headers + ", playback=" + this.playback + ")";
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return SourcesResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SourcesResponse(List<Source> list, List<Track> list2, Skips skips, List<DownloadSource> list3, Map<String, String> map, ShiroPlaybackPlan shiroPlaybackPlan) {
        this.sources = list;
        this.tracks = list2;
        this.skips = skips;
        this.downloads = list3;
        this.headers = map;
        this.playback = shiroPlaybackPlan;
    }

    public /* synthetic */ SourcesResponse(List list, List list2, Skips skips, List list3, Map map, ShiroPlaybackPlan shiroPlaybackPlan, int i, q71 q71Var) {
        this(list, list2, skips, (i & 8) != 0 ? null : list3, map, (i & 32) != 0 ? null : shiroPlaybackPlan);
    }
}
