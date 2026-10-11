package com.bumptech.glide;

import java.util.List;

/* loaded from: classes.dex */
public final class i extends h {
    public i(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public i(Object obj, List list) {
        super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }

    public i(Class cls, Class cls2) {
        super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i10, Class cls) {
        super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        if (i10 != 3) {
            return;
        }
        super("Failed to find source encoder for data class: " + cls);
    }

    public i() {
        super("Failed to find image header parser.");
    }
}
