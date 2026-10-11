package com.anistation.model;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MediaFormat {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ MediaFormat[] $VALUES;
    private final String label;
    public static final MediaFormat TV = new MediaFormat("TV", 0, "TV");
    public static final MediaFormat TV_SHORT = new MediaFormat("TV_SHORT", 1, "TV Short");
    public static final MediaFormat MOVIE = new MediaFormat("MOVIE", 2, "Movie");
    public static final MediaFormat SPECIAL = new MediaFormat("SPECIAL", 3, "Special");
    public static final MediaFormat OVA = new MediaFormat("OVA", 4, "OVA");
    public static final MediaFormat ONA = new MediaFormat("ONA", 5, "ONA");
    public static final MediaFormat MUSIC = new MediaFormat("MUSIC", 6, "Music");
    public static final MediaFormat MANGA = new MediaFormat("MANGA", 7, "Manga");
    public static final MediaFormat NOVEL = new MediaFormat("NOVEL", 8, "Novel");
    public static final MediaFormat ONE_SHOT = new MediaFormat("ONE_SHOT", 9, "One Shot");
    public static final MediaFormat UNKNOWN = new MediaFormat("UNKNOWN", 10, "Unknown");

    private static final /* synthetic */ MediaFormat[] $values() {
        return new MediaFormat[]{TV, TV_SHORT, MOVIE, SPECIAL, OVA, ONA, MUSIC, MANGA, NOVEL, ONE_SHOT, UNKNOWN};
    }

    static {
        MediaFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private MediaFormat(String str, int i, String str2) {
        this.label = str2;
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static MediaFormat valueOf(String str) {
        return (MediaFormat) Enum.valueOf(MediaFormat.class, str);
    }

    public static MediaFormat[] values() {
        return (MediaFormat[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
