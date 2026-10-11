package com.anistation.model.github;

import defpackage.a34;
import defpackage.aj5;
import defpackage.h11;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.q71;
import defpackage.qx1;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class DevProfile {
    public static final Companion Companion = new Companion(null);
    private final String avatarUrl;
    private final String bio;
    private final String name;
    private final String profileUrl;
    private final String username;

    public /* synthetic */ DevProfile(int i, String str, String str2, String str3, String str4, String str5, kj5 kj5Var) {
        if (31 != (i & 31)) {
            iq4.throwMissingFieldException(i, 31, DevProfile$$serializer.INSTANCE.getDescriptor());
        }
        this.username = str;
        this.avatarUrl = str2;
        this.profileUrl = str3;
        this.name = str4;
        this.bio = str5;
    }

    public static /* synthetic */ DevProfile copy$default(DevProfile devProfile, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = devProfile.username;
        }
        if ((i & 2) != 0) {
            str2 = devProfile.avatarUrl;
        }
        if ((i & 4) != 0) {
            str3 = devProfile.profileUrl;
        }
        if ((i & 8) != 0) {
            str4 = devProfile.name;
        }
        if ((i & 16) != 0) {
            str5 = devProfile.bio;
        }
        String str6 = str5;
        String str7 = str3;
        return devProfile.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(DevProfile devProfile, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, devProfile.username);
        v0Var.w(aj5Var, 1, devProfile.avatarUrl);
        v0Var.w(aj5Var, 2, devProfile.profileUrl);
        v0Var.w(aj5Var, 3, devProfile.name);
        v0Var.w(aj5Var, 4, devProfile.bio);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final String component3() {
        return this.profileUrl;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.bio;
    }

    public final DevProfile copy(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new DevProfile(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevProfile)) {
            return false;
        }
        DevProfile devProfile = (DevProfile) obj;
        if (a34.i(this.username, devProfile.username) && a34.i(this.avatarUrl, devProfile.avatarUrl) && a34.i(this.profileUrl, devProfile.profileUrl) && a34.i(this.name, devProfile.name) && a34.i(this.bio, devProfile.bio)) {
            return true;
        }
        return false;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfileUrl() {
        return this.profileUrl;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.bio.hashCode() + zo5.i(this.name, zo5.i(this.profileUrl, zo5.i(this.avatarUrl, this.username.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.username;
        String str2 = this.avatarUrl;
        String str3 = this.profileUrl;
        String str4 = this.name;
        String str5 = this.bio;
        StringBuilder o = h11.o("DevProfile(username=", str, ", avatarUrl=", str2, ", profileUrl=");
        qx1.x(o, str3, ", name=", str4, ", bio=");
        return h11.k(o, str5, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return DevProfile$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAvatarUrl$annotations() {
    }

    public static /* synthetic */ void getProfileUrl$annotations() {
    }

    public static /* synthetic */ void getUsername$annotations() {
    }

    public DevProfile(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.username = str;
        this.avatarUrl = str2;
        this.profileUrl = str3;
        this.name = str4;
        this.bio = str5;
    }
}
