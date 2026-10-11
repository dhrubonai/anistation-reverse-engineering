package com.anistation.model.watch;

import defpackage.a34;
import defpackage.aj5;
import defpackage.hu0;
import defpackage.i13;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Provider {
    public static final Companion Companion = new Companion(null);
    private final boolean castCompatible;
    private final Integer castPriority;

    /* renamed from: default, reason: not valid java name */
    private final boolean f3default;
    private final String id;
    private final boolean multiAudio;
    private final String tip;

    public /* synthetic */ Provider(int i, String str, boolean z, String str2, boolean z2, boolean z3, Integer num, kj5 kj5Var) {
        if (7 != (i & 7)) {
            iq4.throwMissingFieldException(i, 7, Provider$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.f3default = z;
        this.tip = str2;
        if ((i & 8) == 0) {
            this.multiAudio = false;
        } else {
            this.multiAudio = z2;
        }
        if ((i & 16) == 0) {
            this.castCompatible = true;
        } else {
            this.castCompatible = z3;
        }
        if ((i & 32) == 0) {
            this.castPriority = null;
        } else {
            this.castPriority = num;
        }
    }

    public static /* synthetic */ Provider copy$default(Provider provider, String str, boolean z, String str2, boolean z2, boolean z3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = provider.id;
        }
        if ((i & 2) != 0) {
            z = provider.f3default;
        }
        if ((i & 4) != 0) {
            str2 = provider.tip;
        }
        if ((i & 8) != 0) {
            z2 = provider.multiAudio;
        }
        if ((i & 16) != 0) {
            z3 = provider.castCompatible;
        }
        if ((i & 32) != 0) {
            num = provider.castPriority;
        }
        boolean z4 = z3;
        Integer num2 = num;
        return provider.copy(str, z, str2, z2, z4, num2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Provider provider, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, provider.id);
        v0Var.p(aj5Var, 1, provider.f3default);
        v0Var.encodeNullableSerializableElement(aj5Var, 2, mz5.a, provider.tip);
        if (v0Var.shouldEncodeElementDefault(aj5Var, 3) || provider.multiAudio) {
            v0Var.p(aj5Var, 3, provider.multiAudio);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 4) || !provider.castCompatible) {
            v0Var.p(aj5Var, 4, provider.castCompatible);
        }
        if (v0Var.shouldEncodeElementDefault(aj5Var, 5) || provider.castPriority != null) {
            v0Var.encodeNullableSerializableElement(aj5Var, 5, i13.a, provider.castPriority);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component2() {
        return this.f3default;
    }

    public final String component3() {
        return this.tip;
    }

    public final boolean component4() {
        return this.multiAudio;
    }

    public final boolean component5() {
        return this.castCompatible;
    }

    public final Integer component6() {
        return this.castPriority;
    }

    public final Provider copy(String str, boolean z, String str2, boolean z2, boolean z3, Integer num) {
        str.getClass();
        return new Provider(str, z, str2, z2, z3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Provider)) {
            return false;
        }
        Provider provider = (Provider) obj;
        if (a34.i(this.id, provider.id) && this.f3default == provider.f3default && a34.i(this.tip, provider.tip) && this.multiAudio == provider.multiAudio && this.castCompatible == provider.castCompatible && a34.i(this.castPriority, provider.castPriority)) {
            return true;
        }
        return false;
    }

    public final boolean getCastCompatible() {
        return this.castCompatible;
    }

    public final Integer getCastPriority() {
        return this.castPriority;
    }

    public final boolean getDefault() {
        return this.f3default;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getMultiAudio() {
        return this.multiAudio;
    }

    public final String getTip() {
        return this.tip;
    }

    public int hashCode() {
        int hashCode;
        int g = zo5.g(this.id.hashCode() * 31, 31, this.f3default);
        String str = this.tip;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g2 = zo5.g(zo5.g((g + hashCode) * 31, 31, this.multiAudio), 31, this.castCompatible);
        Integer num = this.castPriority;
        if (num != null) {
            i = num.hashCode();
        }
        return g2 + i;
    }

    public String toString() {
        return "Provider(id=" + this.id + ", default=" + this.f3default + ", tip=" + this.tip + ", multiAudio=" + this.multiAudio + ", castCompatible=" + this.castCompatible + ", castPriority=" + this.castPriority + ")";
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Provider$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Provider(String str, boolean z, String str2, boolean z2, boolean z3, Integer num) {
        str.getClass();
        this.id = str;
        this.f3default = z;
        this.tip = str2;
        this.multiAudio = z2;
        this.castCompatible = z3;
        this.castPriority = num;
    }

    public /* synthetic */ Provider(String str, boolean z, String str2, boolean z2, boolean z3, Integer num, int i, q71 q71Var) {
        this(str, z, str2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? true : z3, (i & 32) != 0 ? null : num);
    }
}
