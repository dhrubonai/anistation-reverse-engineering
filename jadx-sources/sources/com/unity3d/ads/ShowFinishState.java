package com.unity3d.ads;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ShowFinishState {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ ShowFinishState[] $VALUES;
    public static final ShowFinishState SKIPPED = new ShowFinishState("SKIPPED", 0);
    public static final ShowFinishState COMPLETED = new ShowFinishState("COMPLETED", 1);

    private static final /* synthetic */ ShowFinishState[] $values() {
        return new ShowFinishState[]{SKIPPED, COMPLETED};
    }

    static {
        ShowFinishState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private ShowFinishState(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static ShowFinishState valueOf(String str) {
        return (ShowFinishState) Enum.valueOf(ShowFinishState.class, str);
    }

    public static ShowFinishState[] values() {
        return (ShowFinishState[]) $VALUES.clone();
    }
}
