package com.unity3d.services.core.di;

import defpackage.a34;
import defpackage.sb2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class IServiceComponentKt$inject$1 implements sb2 {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    public IServiceComponentKt$inject$1(IServiceComponent iServiceComponent, String str) {
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    @Override // defpackage.sb2
    public final T invoke() {
        this.$this_inject.getServiceProvider().getRegistry();
        a34.r0();
        throw null;
    }
}
