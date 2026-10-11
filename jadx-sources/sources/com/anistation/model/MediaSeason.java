package com.anistation.model;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MediaSeason {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ MediaSeason[] $VALUES;
    private final String label;
    public static final MediaSeason WINTER = new MediaSeason("WINTER", 0, "Winter");
    public static final MediaSeason SPRING = new MediaSeason("SPRING", 1, "Spring");
    public static final MediaSeason SUMMER = new MediaSeason("SUMMER", 2, "Summer");
    public static final MediaSeason FALL = new MediaSeason("FALL", 3, "Fall");

    private static final /* synthetic */ MediaSeason[] $values() {
        return new MediaSeason[]{WINTER, SPRING, SUMMER, FALL};
    }

    static {
        MediaSeason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private MediaSeason(String str, int i, String str2) {
        this.label = str2;
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static MediaSeason valueOf(String str) {
        return (MediaSeason) Enum.valueOf(MediaSeason.class, str);
    }

    public static MediaSeason[] values() {
        return (MediaSeason[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
