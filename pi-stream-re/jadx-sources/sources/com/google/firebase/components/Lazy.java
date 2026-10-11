package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance;
    private volatile Provider<T> provider;

    public Lazy(T t9) {
        this.instance = UNINITIALIZED;
        this.instance = t9;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t9 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t9 == obj) {
            synchronized (this) {
                t9 = (T) this.instance;
                if (t9 == obj) {
                    t9 = this.provider.get();
                    this.instance = t9;
                    this.provider = null;
                }
            }
        }
        return t9;
    }

    public boolean isInitialized() {
        if (this.instance != UNINITIALIZED) {
            return true;
        }
        return false;
    }

    public Lazy(Provider<T> provider) {
        this.instance = UNINITIALIZED;
        this.provider = provider;
    }
}
