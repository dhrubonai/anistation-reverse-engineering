package com.anistation.model.download;

import defpackage.a34;
import defpackage.aj5;
import defpackage.h11;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.v0;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class OfflineSubtitleMetadata {
    public static final Companion Companion = new Companion(null);

    /* renamed from: default, reason: not valid java name */
    private final boolean f1default;
    private final String fileName;
    private final String label;
    private final String lang;

    public /* synthetic */ OfflineSubtitleMetadata(int i, String str, String str2, String str3, boolean z, kj5 kj5Var) {
        if (15 != (i & 15)) {
            iq4.throwMissingFieldException(i, 15, OfflineSubtitleMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.fileName = str;
        this.lang = str2;
        this.label = str3;
        this.f1default = z;
    }

    public static /* synthetic */ OfflineSubtitleMetadata copy$default(OfflineSubtitleMetadata offlineSubtitleMetadata, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offlineSubtitleMetadata.fileName;
        }
        if ((i & 2) != 0) {
            str2 = offlineSubtitleMetadata.lang;
        }
        if ((i & 4) != 0) {
            str3 = offlineSubtitleMetadata.label;
        }
        if ((i & 8) != 0) {
            z = offlineSubtitleMetadata.f1default;
        }
        return offlineSubtitleMetadata.copy(str, str2, str3, z);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(OfflineSubtitleMetadata offlineSubtitleMetadata, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, offlineSubtitleMetadata.fileName);
        mz5 mz5Var = mz5.a;
        v0Var.encodeNullableSerializableElement(aj5Var, 1, mz5Var, offlineSubtitleMetadata.lang);
        v0Var.encodeNullableSerializableElement(aj5Var, 2, mz5Var, offlineSubtitleMetadata.label);
        v0Var.p(aj5Var, 3, offlineSubtitleMetadata.f1default);
    }

    public final String component1() {
        return this.fileName;
    }

    public final String component2() {
        return this.lang;
    }

    public final String component3() {
        return this.label;
    }

    public final boolean component4() {
        return this.f1default;
    }

    public final OfflineSubtitleMetadata copy(String str, String str2, String str3, boolean z) {
        str.getClass();
        return new OfflineSubtitleMetadata(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineSubtitleMetadata)) {
            return false;
        }
        OfflineSubtitleMetadata offlineSubtitleMetadata = (OfflineSubtitleMetadata) obj;
        if (a34.i(this.fileName, offlineSubtitleMetadata.fileName) && a34.i(this.lang, offlineSubtitleMetadata.lang) && a34.i(this.label, offlineSubtitleMetadata.label) && this.f1default == offlineSubtitleMetadata.f1default) {
            return true;
        }
        return false;
    }

    public final boolean getDefault() {
        return this.f1default;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLang() {
        return this.lang;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.fileName.hashCode() * 31;
        String str = this.lang;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.label;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Boolean.hashCode(this.f1default) + ((i2 + i) * 31);
    }

    public String toString() {
        String str = this.fileName;
        String str2 = this.lang;
        String str3 = this.label;
        boolean z = this.f1default;
        StringBuilder o = h11.o("OfflineSubtitleMetadata(fileName=", str, ", lang=", str2, ", label=");
        o.append(str3);
        o.append(", default=");
        o.append(z);
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
            return OfflineSubtitleMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OfflineSubtitleMetadata(String str, String str2, String str3, boolean z) {
        str.getClass();
        this.fileName = str;
        this.lang = str2;
        this.label = str3;
        this.f1default = z;
    }
}
