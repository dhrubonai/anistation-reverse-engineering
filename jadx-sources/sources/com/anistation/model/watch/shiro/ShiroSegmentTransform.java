package com.anistation.model.watch.shiro;

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
public final class ShiroSegmentTransform {
    public static final Companion Companion = new Companion(null);
    private final int clearSyncByte;
    private final String key;
    private final long maxBytes;
    private final int pngHeaderBytes;
    private final String type;
    private final int webpHeaderBytes;

    public /* synthetic */ ShiroSegmentTransform(int i, String str, String str2, int i2, int i3, int i4, long j, kj5 kj5Var) {
        if (63 != (i & 63)) {
            iq4.throwMissingFieldException(i, 63, ShiroSegmentTransform$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.key = str2;
        this.pngHeaderBytes = i2;
        this.webpHeaderBytes = i3;
        this.clearSyncByte = i4;
        this.maxBytes = j;
    }

    public static /* synthetic */ ShiroSegmentTransform copy$default(ShiroSegmentTransform shiroSegmentTransform, String str, String str2, int i, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = shiroSegmentTransform.type;
        }
        if ((i4 & 2) != 0) {
            str2 = shiroSegmentTransform.key;
        }
        if ((i4 & 4) != 0) {
            i = shiroSegmentTransform.pngHeaderBytes;
        }
        if ((i4 & 8) != 0) {
            i2 = shiroSegmentTransform.webpHeaderBytes;
        }
        if ((i4 & 16) != 0) {
            i3 = shiroSegmentTransform.clearSyncByte;
        }
        if ((i4 & 32) != 0) {
            j = shiroSegmentTransform.maxBytes;
        }
        long j2 = j;
        int i5 = i3;
        int i6 = i;
        return shiroSegmentTransform.copy(str, str2, i6, i2, i5, j2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(ShiroSegmentTransform shiroSegmentTransform, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, shiroSegmentTransform.type);
        v0Var.w(aj5Var, 1, shiroSegmentTransform.key);
        v0Var.t(2, shiroSegmentTransform.pngHeaderBytes, aj5Var);
        v0Var.t(3, shiroSegmentTransform.webpHeaderBytes, aj5Var);
        v0Var.t(4, shiroSegmentTransform.clearSyncByte, aj5Var);
        v0Var.u(aj5Var, 5, shiroSegmentTransform.maxBytes);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.key;
    }

    public final int component3() {
        return this.pngHeaderBytes;
    }

    public final int component4() {
        return this.webpHeaderBytes;
    }

    public final int component5() {
        return this.clearSyncByte;
    }

    public final long component6() {
        return this.maxBytes;
    }

    public final ShiroSegmentTransform copy(String str, String str2, int i, int i2, int i3, long j) {
        str.getClass();
        str2.getClass();
        return new ShiroSegmentTransform(str, str2, i, i2, i3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiroSegmentTransform)) {
            return false;
        }
        ShiroSegmentTransform shiroSegmentTransform = (ShiroSegmentTransform) obj;
        if (a34.i(this.type, shiroSegmentTransform.type) && a34.i(this.key, shiroSegmentTransform.key) && this.pngHeaderBytes == shiroSegmentTransform.pngHeaderBytes && this.webpHeaderBytes == shiroSegmentTransform.webpHeaderBytes && this.clearSyncByte == shiroSegmentTransform.clearSyncByte && this.maxBytes == shiroSegmentTransform.maxBytes) {
            return true;
        }
        return false;
    }

    public final int getClearSyncByte() {
        return this.clearSyncByte;
    }

    public final String getKey() {
        return this.key;
    }

    public final long getMaxBytes() {
        return this.maxBytes;
    }

    public final int getPngHeaderBytes() {
        return this.pngHeaderBytes;
    }

    public final String getType() {
        return this.type;
    }

    public final int getWebpHeaderBytes() {
        return this.webpHeaderBytes;
    }

    public int hashCode() {
        return Long.hashCode(this.maxBytes) + qx1.c(this.clearSyncByte, qx1.c(this.webpHeaderBytes, qx1.c(this.pngHeaderBytes, zo5.i(this.key, this.type.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.key;
        int i = this.pngHeaderBytes;
        int i2 = this.webpHeaderBytes;
        int i3 = this.clearSyncByte;
        long j = this.maxBytes;
        StringBuilder o = h11.o("ShiroSegmentTransform(type=", str, ", key=", str2, ", pngHeaderBytes=");
        h11.y(o, i, ", webpHeaderBytes=", i2, ", clearSyncByte=");
        o.append(i3);
        o.append(", maxBytes=");
        o.append(j);
        o.append(")");
        return o.toString();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return ShiroSegmentTransform$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShiroSegmentTransform(String str, String str2, int i, int i2, int i3, long j) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.key = str2;
        this.pngHeaderBytes = i;
        this.webpHeaderBytes = i2;
        this.clearSyncByte = i3;
        this.maxBytes = j;
    }
}
