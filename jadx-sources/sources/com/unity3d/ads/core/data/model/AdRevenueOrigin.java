package com.unity3d.ads.core.data.model;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdRevenueOrigin {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ AdRevenueOrigin[] $VALUES;
    public static final AdRevenueOrigin AUTOMATIC_COLLECTION = new AdRevenueOrigin("AUTOMATIC_COLLECTION", 0);

    private static final /* synthetic */ AdRevenueOrigin[] $values() {
        return new AdRevenueOrigin[]{AUTOMATIC_COLLECTION};
    }

    static {
        AdRevenueOrigin[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private AdRevenueOrigin(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static AdRevenueOrigin valueOf(String str) {
        return (AdRevenueOrigin) Enum.valueOf(AdRevenueOrigin.class, str);
    }

    public static AdRevenueOrigin[] values() {
        return (AdRevenueOrigin[]) $VALUES.clone();
    }
}
