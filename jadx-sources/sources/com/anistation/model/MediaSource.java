package com.anistation.model;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MediaSource {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ MediaSource[] $VALUES;
    private final String label;
    public static final MediaSource ORIGINAL = new MediaSource("ORIGINAL", 0, "Original");
    public static final MediaSource MANGA = new MediaSource("MANGA", 1, "Manga");
    public static final MediaSource LIGHT_NOVEL = new MediaSource("LIGHT_NOVEL", 2, "Light Novel");
    public static final MediaSource VISUAL_NOVEL = new MediaSource("VISUAL_NOVEL", 3, "Visual Novel");
    public static final MediaSource VIDEO_GAME = new MediaSource("VIDEO_GAME", 4, "Video Game");
    public static final MediaSource OTHER = new MediaSource("OTHER", 5, "Other");
    public static final MediaSource NOVEL = new MediaSource("NOVEL", 6, "Novel");
    public static final MediaSource DOUJINSHI = new MediaSource("DOUJINSHI", 7, "Doujinshi");
    public static final MediaSource ANIME = new MediaSource("ANIME", 8, "Anime");
    public static final MediaSource WEB_NOVEL = new MediaSource("WEB_NOVEL", 9, "Web Novel");
    public static final MediaSource LIVE_ACTION = new MediaSource("LIVE_ACTION", 10, "Live Action");
    public static final MediaSource GAME = new MediaSource("GAME", 11, "Game");
    public static final MediaSource COMIC = new MediaSource("COMIC", 12, "Comic");
    public static final MediaSource MULTIMEDIA_PROJECT = new MediaSource("MULTIMEDIA_PROJECT", 13, "Multimedia Project");
    public static final MediaSource PICTURE_BOOK = new MediaSource("PICTURE_BOOK", 14, "Picture Book");

    private static final /* synthetic */ MediaSource[] $values() {
        return new MediaSource[]{ORIGINAL, MANGA, LIGHT_NOVEL, VISUAL_NOVEL, VIDEO_GAME, OTHER, NOVEL, DOUJINSHI, ANIME, WEB_NOVEL, LIVE_ACTION, GAME, COMIC, MULTIMEDIA_PROJECT, PICTURE_BOOK};
    }

    static {
        MediaSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private MediaSource(String str, int i, String str2) {
        this.label = str2;
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static MediaSource valueOf(String str) {
        return (MediaSource) Enum.valueOf(MediaSource.class, str);
    }

    public static MediaSource[] values() {
        return (MediaSource[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
