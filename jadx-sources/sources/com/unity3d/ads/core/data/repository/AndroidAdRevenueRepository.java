package com.unity3d.ads.core.data.repository;

import defpackage.jn5;
import defpackage.t44;
import defpackage.ta0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidAdRevenueRepository implements AdRevenueRepository {
    private final t44 adRevenueEvents = jn5.a(0, 64, ta0.y);

    @Override // com.unity3d.ads.core.data.repository.AdRevenueRepository
    public t44 getAdRevenueEvents() {
        return this.adRevenueEvents;
    }
}
