package com.unity3d.services.core.domain;

import defpackage.j91;
import defpackage.ja1;
import defpackage.n11;
import defpackage.qm3;
import defpackage.rh1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class SDKDispatchers implements ISDKDispatchers {

    /* renamed from: default, reason: not valid java name */
    private final n11 f5default;

    /* renamed from: io, reason: collision with root package name */
    private final n11 f6io;
    private final n11 main;

    public SDKDispatchers() {
        ja1 ja1Var = rh1.a;
        this.f6io = j91.y;
        this.f5default = rh1.a;
        this.main = qm3.a;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public n11 getDefault() {
        return this.f5default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public n11 getIo() {
        return this.f6io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public n11 getMain() {
        return this.main;
    }
}
