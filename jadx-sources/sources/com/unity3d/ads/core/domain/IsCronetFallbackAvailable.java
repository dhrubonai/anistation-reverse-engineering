package com.unity3d.ads.core.domain;

import defpackage.q71;
import defpackage.y45;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class IsCronetFallbackAvailable {
    public static final Companion Companion = new Companion(null);
    public static final String FALLBACK_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private final String className;

    public /* synthetic */ IsCronetFallbackAvailable(String str, int i, q71 q71Var) {
        this((i & 1) != 0 ? FALLBACK_PROVIDER_CLASS : str);
    }

    public final boolean invoke() {
        Object y45Var;
        try {
            y45Var = Class.forName(this.className);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        return !(y45Var instanceof y45);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }

    public IsCronetFallbackAvailable(String str) {
        str.getClass();
        this.className = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IsCronetFallbackAvailable() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
