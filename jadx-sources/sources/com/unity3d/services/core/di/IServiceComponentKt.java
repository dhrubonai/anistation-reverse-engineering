package com.unity3d.services.core.di;

import defpackage.a34;
import defpackage.jf3;
import defpackage.rb3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class IServiceComponentKt {
    public static final <T> T get(IServiceComponent iServiceComponent, String str) {
        iServiceComponent.getClass();
        str.getClass();
        iServiceComponent.getServiceProvider().getRegistry();
        a34.r0();
        throw null;
    }

    public static Object get$default(IServiceComponent iServiceComponent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        iServiceComponent.getClass();
        str.getClass();
        iServiceComponent.getServiceProvider().getRegistry();
        a34.r0();
        throw null;
    }

    public static final <T> rb3 inject(IServiceComponent iServiceComponent, String str, jf3 jf3Var) {
        iServiceComponent.getClass();
        str.getClass();
        jf3Var.getClass();
        a34.r0();
        throw null;
    }

    public static rb3 inject$default(IServiceComponent iServiceComponent, String str, jf3 jf3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            jf3Var = jf3.z;
        }
        iServiceComponent.getClass();
        str.getClass();
        jf3Var.getClass();
        a34.r0();
        throw null;
    }
}
