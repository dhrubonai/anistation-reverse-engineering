package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z0 implements Map.Entry {
    public final Map.Entry x;
    public final /* synthetic */ Internal.MapAdapter y;

    public z0(Internal.MapAdapter mapAdapter, Map.Entry entry) {
        this.y = mapAdapter;
        this.x = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Map.Entry) && this.x.getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.x.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Internal.MapAdapter.Converter converter;
        converter = this.y.valueConverter;
        return converter.doForward(this.x.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Internal.MapAdapter.Converter converter;
        Internal.MapAdapter.Converter converter2;
        Internal.MapAdapter mapAdapter = this.y;
        converter = mapAdapter.valueConverter;
        Object value = this.x.setValue(converter.doBackward(obj));
        if (value != null) {
            converter2 = mapAdapter.valueConverter;
            return converter2.doForward(value);
        }
        return null;
    }
}
