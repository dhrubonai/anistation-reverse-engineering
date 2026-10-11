package com.anistation.model.backup;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class BackupFrequency {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ BackupFrequency[] $VALUES;
    public static final BackupFrequency NEVER = new BackupFrequency("NEVER", 0);
    public static final BackupFrequency DAILY = new BackupFrequency("DAILY", 1);
    public static final BackupFrequency WEEKLY = new BackupFrequency("WEEKLY", 2);
    public static final BackupFrequency MONTHLY = new BackupFrequency("MONTHLY", 3);

    private static final /* synthetic */ BackupFrequency[] $values() {
        return new BackupFrequency[]{NEVER, DAILY, WEEKLY, MONTHLY};
    }

    static {
        BackupFrequency[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private BackupFrequency(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static BackupFrequency valueOf(String str) {
        return (BackupFrequency) Enum.valueOf(BackupFrequency.class, str);
    }

    public static BackupFrequency[] values() {
        return (BackupFrequency[]) $VALUES.clone();
    }
}
