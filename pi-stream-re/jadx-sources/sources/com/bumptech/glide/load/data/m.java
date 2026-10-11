package com.bumptech.glide.load.data;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final y3.h f2269a;

    public m(y3.h hVar) {
        this.f2269a = hVar;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        return new n((InputStream) obj, this.f2269a);
    }
}
