package com.anistation.model.animelist;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AnimeListImportProvider {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ AnimeListImportProvider[] $VALUES;
    public static final AnimeListImportProvider ANILIST = new AnimeListImportProvider("ANILIST", 0);
    public static final AnimeListImportProvider MAL = new AnimeListImportProvider("MAL", 1);

    private static final /* synthetic */ AnimeListImportProvider[] $values() {
        return new AnimeListImportProvider[]{ANILIST, MAL};
    }

    static {
        AnimeListImportProvider[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private AnimeListImportProvider(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static AnimeListImportProvider valueOf(String str) {
        return (AnimeListImportProvider) Enum.valueOf(AnimeListImportProvider.class, str);
    }

    public static AnimeListImportProvider[] values() {
        return (AnimeListImportProvider[]) $VALUES.clone();
    }
}
