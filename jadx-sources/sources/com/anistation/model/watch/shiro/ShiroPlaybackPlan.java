package com.anistation.model.watch.shiro;

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
import defpackage.qx1;
import defpackage.rb3;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class ShiroPlaybackPlan {
    private final List<String> allowedHostSuffixes;
    private final long expiresAtEpochSeconds;
    private final String fallbackUrl;
    private final long issuedAtEpochSeconds;
    private final ShiroPlaylistTransform playlist;
    private final String protocol;
    private final ShiroSegmentTransform segment;
    public static final Companion Companion = new Companion(null);
    private static final rb3[] $childSerializers = {null, null, null, null, null, bx7.B(jf3.y, new jk5((byte) 4)), null};

    public /* synthetic */ ShiroPlaybackPlan(int i, String str, long j, long j2, ShiroPlaylistTransform shiroPlaylistTransform, ShiroSegmentTransform shiroSegmentTransform, List list, String str2, kj5 kj5Var) {
        if (127 != (i & 127)) {
            iq4.throwMissingFieldException(i, 127, ShiroPlaybackPlan$$serializer.INSTANCE.getDescriptor());
        }
        this.protocol = str;
        this.issuedAtEpochSeconds = j;
        this.expiresAtEpochSeconds = j2;
        this.playlist = shiroPlaylistTransform;
        this.segment = shiroSegmentTransform;
        this.allowedHostSuffixes = list;
        this.fallbackUrl = str2;
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_() {
        return new ds(mz5.a, (byte) 0);
    }

    public static /* synthetic */ ShiroPlaybackPlan copy$default(ShiroPlaybackPlan shiroPlaybackPlan, String str, long j, long j2, ShiroPlaylistTransform shiroPlaylistTransform, ShiroSegmentTransform shiroSegmentTransform, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shiroPlaybackPlan.protocol;
        }
        if ((i & 2) != 0) {
            j = shiroPlaybackPlan.issuedAtEpochSeconds;
        }
        if ((i & 4) != 0) {
            j2 = shiroPlaybackPlan.expiresAtEpochSeconds;
        }
        if ((i & 8) != 0) {
            shiroPlaylistTransform = shiroPlaybackPlan.playlist;
        }
        if ((i & 16) != 0) {
            shiroSegmentTransform = shiroPlaybackPlan.segment;
        }
        if ((i & 32) != 0) {
            list = shiroPlaybackPlan.allowedHostSuffixes;
        }
        if ((i & 64) != 0) {
            str2 = shiroPlaybackPlan.fallbackUrl;
        }
        long j3 = j2;
        return shiroPlaybackPlan.copy(str, j, j3, shiroPlaylistTransform, shiroSegmentTransform, list, str2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(ShiroPlaybackPlan shiroPlaybackPlan, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, shiroPlaybackPlan.protocol);
        v0Var.u(aj5Var, 1, shiroPlaybackPlan.issuedAtEpochSeconds);
        v0Var.u(aj5Var, 2, shiroPlaybackPlan.expiresAtEpochSeconds);
        v0Var.v(aj5Var, 3, ShiroPlaylistTransform$$serializer.INSTANCE, shiroPlaybackPlan.playlist);
        v0Var.v(aj5Var, 4, ShiroSegmentTransform$$serializer.INSTANCE, shiroPlaybackPlan.segment);
        v0Var.v(aj5Var, 5, (mj5) rb3VarArr[5].getValue(), shiroPlaybackPlan.allowedHostSuffixes);
        v0Var.w(aj5Var, 6, shiroPlaybackPlan.fallbackUrl);
    }

    public final String component1() {
        return this.protocol;
    }

    public final long component2() {
        return this.issuedAtEpochSeconds;
    }

    public final long component3() {
        return this.expiresAtEpochSeconds;
    }

    public final ShiroPlaylistTransform component4() {
        return this.playlist;
    }

    public final ShiroSegmentTransform component5() {
        return this.segment;
    }

    public final List<String> component6() {
        return this.allowedHostSuffixes;
    }

    public final String component7() {
        return this.fallbackUrl;
    }

    public final ShiroPlaybackPlan copy(String str, long j, long j2, ShiroPlaylistTransform shiroPlaylistTransform, ShiroSegmentTransform shiroSegmentTransform, List<String> list, String str2) {
        str.getClass();
        shiroPlaylistTransform.getClass();
        shiroSegmentTransform.getClass();
        list.getClass();
        str2.getClass();
        return new ShiroPlaybackPlan(str, j, j2, shiroPlaylistTransform, shiroSegmentTransform, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiroPlaybackPlan)) {
            return false;
        }
        ShiroPlaybackPlan shiroPlaybackPlan = (ShiroPlaybackPlan) obj;
        if (a34.i(this.protocol, shiroPlaybackPlan.protocol) && this.issuedAtEpochSeconds == shiroPlaybackPlan.issuedAtEpochSeconds && this.expiresAtEpochSeconds == shiroPlaybackPlan.expiresAtEpochSeconds && a34.i(this.playlist, shiroPlaybackPlan.playlist) && a34.i(this.segment, shiroPlaybackPlan.segment) && a34.i(this.allowedHostSuffixes, shiroPlaybackPlan.allowedHostSuffixes) && a34.i(this.fallbackUrl, shiroPlaybackPlan.fallbackUrl)) {
            return true;
        }
        return false;
    }

    public final List<String> getAllowedHostSuffixes() {
        return this.allowedHostSuffixes;
    }

    public final long getExpiresAtEpochSeconds() {
        return this.expiresAtEpochSeconds;
    }

    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final long getIssuedAtEpochSeconds() {
        return this.issuedAtEpochSeconds;
    }

    public final ShiroPlaylistTransform getPlaylist() {
        return this.playlist;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final ShiroSegmentTransform getSegment() {
        return this.segment;
    }

    public int hashCode() {
        return this.fallbackUrl.hashCode() + zo5.j(this.allowedHostSuffixes, (this.segment.hashCode() + ((this.playlist.hashCode() + qx1.d(qx1.d(this.protocol.hashCode() * 31, this.issuedAtEpochSeconds, 31), this.expiresAtEpochSeconds, 31)) * 31)) * 31, 31);
    }

    public String toString() {
        String str = this.protocol;
        long j = this.issuedAtEpochSeconds;
        long j2 = this.expiresAtEpochSeconds;
        ShiroPlaylistTransform shiroPlaylistTransform = this.playlist;
        ShiroSegmentTransform shiroSegmentTransform = this.segment;
        List<String> list = this.allowedHostSuffixes;
        String str2 = this.fallbackUrl;
        StringBuilder sb = new StringBuilder("ShiroPlaybackPlan(protocol=");
        sb.append(str);
        sb.append(", issuedAtEpochSeconds=");
        sb.append(j);
        qx1.w(sb, ", expiresAtEpochSeconds=", j2, ", playlist=");
        sb.append(shiroPlaylistTransform);
        sb.append(", segment=");
        sb.append(shiroSegmentTransform);
        sb.append(", allowedHostSuffixes=");
        sb.append(list);
        sb.append(", fallbackUrl=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return ShiroPlaybackPlan$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShiroPlaybackPlan(String str, long j, long j2, ShiroPlaylistTransform shiroPlaylistTransform, ShiroSegmentTransform shiroSegmentTransform, List<String> list, String str2) {
        str.getClass();
        shiroPlaylistTransform.getClass();
        shiroSegmentTransform.getClass();
        list.getClass();
        str2.getClass();
        this.protocol = str;
        this.issuedAtEpochSeconds = j;
        this.expiresAtEpochSeconds = j2;
        this.playlist = shiroPlaylistTransform;
        this.segment = shiroSegmentTransform;
        this.allowedHostSuffixes = list;
        this.fallbackUrl = str2;
    }
}
