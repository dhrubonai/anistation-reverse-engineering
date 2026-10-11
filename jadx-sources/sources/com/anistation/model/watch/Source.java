package com.anistation.model.watch;

import defpackage.a34;
import defpackage.aj5;
import defpackage.h11;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.q71;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Source {
    public static final Companion Companion = new Companion(null);
    private final String quality;
    private final String type;
    private final String url;

    public /* synthetic */ Source(int i, String str, String str2, String str3, kj5 kj5Var) {
        if (7 != (i & 7)) {
            iq4.throwMissingFieldException(i, 7, Source$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.quality = str2;
        this.type = str3;
    }

    public static /* synthetic */ Source copy$default(Source source, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = source.url;
        }
        if ((i & 2) != 0) {
            str2 = source.quality;
        }
        if ((i & 4) != 0) {
            str3 = source.type;
        }
        return source.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Source source, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, source.url);
        v0Var.w(aj5Var, 1, source.quality);
        v0Var.w(aj5Var, 2, source.type);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.quality;
    }

    public final String component3() {
        return this.type;
    }

    public final Source copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new Source(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source source = (Source) obj;
        if (a34.i(this.url, source.url) && a34.i(this.quality, source.quality) && a34.i(this.type, source.type)) {
            return true;
        }
        return false;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.type.hashCode() + zo5.i(this.quality, this.url.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.url;
        String str2 = this.quality;
        return h11.k(h11.o("Source(url=", str, ", quality=", str2, ", type="), this.type, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Source$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Source(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.url = str;
        this.quality = str2;
        this.type = str3;
    }
}
