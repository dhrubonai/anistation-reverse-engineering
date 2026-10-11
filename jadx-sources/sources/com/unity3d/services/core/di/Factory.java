package com.unity3d.services.core.di;

import defpackage.rb3;
import defpackage.sb2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
final class Factory<T> implements rb3 {
    private final sb2 initializer;

    public Factory(sb2 sb2Var) {
        sb2Var.getClass();
        this.initializer = sb2Var;
    }

    @Override // defpackage.rb3
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    @Override // defpackage.rb3
    public boolean isInitialized() {
        return false;
    }
}
