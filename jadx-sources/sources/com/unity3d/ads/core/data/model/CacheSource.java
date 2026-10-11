package com.unity3d.ads.core.data.model;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CacheSource {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ CacheSource[] $VALUES;
    public static final CacheSource LOCAL = new CacheSource("LOCAL", 0);
    public static final CacheSource REMOTE = new CacheSource("REMOTE", 1);

    private static final /* synthetic */ CacheSource[] $values() {
        return new CacheSource[]{LOCAL, REMOTE};
    }

    static {
        CacheSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private CacheSource(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static CacheSource valueOf(String str) {
        return (CacheSource) Enum.valueOf(CacheSource.class, str);
    }

    public static CacheSource[] values() {
        return (CacheSource[]) $VALUES.clone();
    }
}
