package com.unity3d.ads.core.data.model;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class LoadAdType {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ LoadAdType[] $VALUES;
    public static final LoadAdType FULLSCREEN = new LoadAdType("FULLSCREEN", 0);
    public static final LoadAdType REWARDED_OFFERS = new LoadAdType("REWARDED_OFFERS", 1);

    private static final /* synthetic */ LoadAdType[] $values() {
        return new LoadAdType[]{FULLSCREEN, REWARDED_OFFERS};
    }

    static {
        LoadAdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private LoadAdType(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static LoadAdType valueOf(String str) {
        return (LoadAdType) Enum.valueOf(LoadAdType.class, str);
    }

    public static LoadAdType[] values() {
        return (LoadAdType[]) $VALUES.clone();
    }
}
