package com.anistation.model.report;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class BugStatus {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ BugStatus[] $VALUES;
    public static final BugStatus ACTIVE = new BugStatus("ACTIVE", 0);
    public static final BugStatus RESOLVED = new BugStatus("RESOLVED", 1);
    public static final BugStatus WONT_FIX = new BugStatus("WONT_FIX", 2);

    private static final /* synthetic */ BugStatus[] $values() {
        return new BugStatus[]{ACTIVE, RESOLVED, WONT_FIX};
    }

    static {
        BugStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private BugStatus(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static BugStatus valueOf(String str) {
        return (BugStatus) Enum.valueOf(BugStatus.class, str);
    }

    public static BugStatus[] values() {
        return (BugStatus[]) $VALUES.clone();
    }
}
