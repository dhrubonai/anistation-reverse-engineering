package com.anistation.model.watch.shiro;

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
public final class ShiroPlaylistTransform {
    public static final Companion Companion = new Companion(null);
    private final String key;
    private final int maxBytes;
    private final String type;

    public /* synthetic */ ShiroPlaylistTransform(int i, String str, String str2, int i2, kj5 kj5Var) {
        if (7 != (i & 7)) {
            iq4.throwMissingFieldException(i, 7, ShiroPlaylistTransform$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.key = str2;
        this.maxBytes = i2;
    }

    public static /* synthetic */ ShiroPlaylistTransform copy$default(ShiroPlaylistTransform shiroPlaylistTransform, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shiroPlaylistTransform.type;
        }
        if ((i2 & 2) != 0) {
            str2 = shiroPlaylistTransform.key;
        }
        if ((i2 & 4) != 0) {
            i = shiroPlaylistTransform.maxBytes;
        }
        return shiroPlaylistTransform.copy(str, str2, i);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(ShiroPlaylistTransform shiroPlaylistTransform, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, shiroPlaylistTransform.type);
        v0Var.w(aj5Var, 1, shiroPlaylistTransform.key);
        v0Var.t(2, shiroPlaylistTransform.maxBytes, aj5Var);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.key;
    }

    public final int component3() {
        return this.maxBytes;
    }

    public final ShiroPlaylistTransform copy(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        return new ShiroPlaylistTransform(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiroPlaylistTransform)) {
            return false;
        }
        ShiroPlaylistTransform shiroPlaylistTransform = (ShiroPlaylistTransform) obj;
        if (a34.i(this.type, shiroPlaylistTransform.type) && a34.i(this.key, shiroPlaylistTransform.key) && this.maxBytes == shiroPlaylistTransform.maxBytes) {
            return true;
        }
        return false;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getMaxBytes() {
        return this.maxBytes;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxBytes) + zo5.i(this.key, this.type.hashCode() * 31, 31);
    }

    public String toString() {
        return zo5.k(this.maxBytes, ")", h11.o("ShiroPlaylistTransform(type=", this.type, ", key=", this.key, ", maxBytes="));
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return ShiroPlaylistTransform$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShiroPlaylistTransform(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.key = str2;
        this.maxBytes = i;
    }
}
