package com.unity3d.ads.core.data.model;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdObjectState {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ AdObjectState[] $VALUES;
    public static final AdObjectState INIT = new AdObjectState("INIT", 0);
    public static final AdObjectState LOADED = new AdObjectState("LOADED", 1);
    public static final AdObjectState SHOWING = new AdObjectState("SHOWING", 2);
    public static final AdObjectState EXPIRED = new AdObjectState("EXPIRED", 3);
    public static final AdObjectState COMPLETED = new AdObjectState("COMPLETED", 4);

    private static final /* synthetic */ AdObjectState[] $values() {
        return new AdObjectState[]{INIT, LOADED, SHOWING, EXPIRED, COMPLETED};
    }

    static {
        AdObjectState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private AdObjectState(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static AdObjectState valueOf(String str) {
        return (AdObjectState) Enum.valueOf(AdObjectState.class, str);
    }

    public static AdObjectState[] values() {
        return (AdObjectState[]) $VALUES.clone();
    }
}
