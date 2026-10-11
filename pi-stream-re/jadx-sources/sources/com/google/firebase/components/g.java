package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2969a;

    public /* synthetic */ g(int i10) {
        this.f2969a = i10;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f2969a) {
            case 0:
                return OptionalProvider.a();
            default:
                return Collections.emptySet();
        }
    }
}
