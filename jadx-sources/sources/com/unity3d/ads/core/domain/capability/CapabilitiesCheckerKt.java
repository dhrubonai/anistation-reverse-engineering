package com.unity3d.ads.core.domain.capability;

import defpackage.y45;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CapabilitiesCheckerKt {
    public static final boolean isClassResolvable(String str) {
        Object y45Var;
        str.getClass();
        try {
            y45Var = Class.forName(str, false, CapabilitiesChecker.class.getClassLoader());
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        return !(y45Var instanceof y45);
    }
}
