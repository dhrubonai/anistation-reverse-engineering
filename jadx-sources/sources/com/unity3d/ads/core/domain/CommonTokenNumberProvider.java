package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.d46;
import defpackage.rb3;
import defpackage.y7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonTokenNumberProvider implements TokenNumberProvider {
    private final rb3 number$delegate;

    public CommonTokenNumberProvider(SessionRepository sessionRepository) {
        sessionRepository.getClass();
        this.number$delegate = new d46(new y7(sessionRepository, (byte) 28));
    }

    public static /* synthetic */ int a(SessionRepository sessionRepository) {
        return sessionRepository.getHeaderBiddingTokenCounter();
    }

    private final int getNumber() {
        return ((Number) this.number$delegate.getValue()).intValue();
    }

    @Override // com.unity3d.ads.core.domain.TokenNumberProvider
    public int invoke() {
        return getNumber();
    }
}
