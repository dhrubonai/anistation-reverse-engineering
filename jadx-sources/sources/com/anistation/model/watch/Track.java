package com.anistation.model.watch;

import defpackage.a34;
import defpackage.aj5;
import defpackage.h11;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.qx1;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Track {
    public static final Companion Companion = new Companion(null);

    /* renamed from: default, reason: not valid java name */
    private final boolean f4default;
    private final String id;
    private final String label;
    private final String lang;
    private final String url;

    public /* synthetic */ Track(int i, String str, String str2, String str3, String str4, boolean z, kj5 kj5Var) {
        if (31 != (i & 31)) {
            iq4.throwMissingFieldException(i, 31, Track$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.url = str2;
        this.lang = str3;
        this.label = str4;
        this.f4default = z;
    }

    public static /* synthetic */ Track copy$default(Track track, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = track.id;
        }
        if ((i & 2) != 0) {
            str2 = track.url;
        }
        if ((i & 4) != 0) {
            str3 = track.lang;
        }
        if ((i & 8) != 0) {
            str4 = track.label;
        }
        if ((i & 16) != 0) {
            z = track.f4default;
        }
        boolean z2 = z;
        String str5 = str3;
        return track.copy(str, str2, str5, str4, z2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Track track, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, track.id);
        v0Var.w(aj5Var, 1, track.url);
        mz5 mz5Var = mz5.a;
        v0Var.encodeNullableSerializableElement(aj5Var, 2, mz5Var, track.lang);
        v0Var.encodeNullableSerializableElement(aj5Var, 3, mz5Var, track.label);
        v0Var.p(aj5Var, 4, track.f4default);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.lang;
    }

    public final String component4() {
        return this.label;
    }

    public final boolean component5() {
        return this.f4default;
    }

    public final Track copy(String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        return new Track(str, str2, str3, str4, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track track = (Track) obj;
        if (a34.i(this.id, track.id) && a34.i(this.url, track.url) && a34.i(this.lang, track.lang) && a34.i(this.label, track.label) && this.f4default == track.f4default) {
            return true;
        }
        return false;
    }

    public final boolean getDefault() {
        return this.f4default;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int i = zo5.i(this.url, this.id.hashCode() * 31, 31);
        String str = this.lang;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str2 = this.label;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Boolean.hashCode(this.f4default) + ((i3 + i2) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.url;
        String str3 = this.lang;
        String str4 = this.label;
        boolean z = this.f4default;
        StringBuilder o = h11.o("Track(id=", str, ", url=", str2, ", lang=");
        qx1.x(o, str3, ", label=", str4, ", default=");
        return qx1.r(o, z, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Track$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Track(String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.url = str2;
        this.lang = str3;
        this.label = str4;
        this.f4default = z;
    }
}
