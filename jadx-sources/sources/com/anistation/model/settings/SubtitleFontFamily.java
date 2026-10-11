package com.anistation.model.settings;

import com.unity3d.ads.BuildConfig;
import defpackage.a34;
import defpackage.q71;
import defpackage.sv1;
import defpackage.t80;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class SubtitleFontFamily {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ SubtitleFontFamily[] $VALUES;
    public static final Companion Companion;
    private final String displayName;
    private final String id;
    public static final SubtitleFontFamily DEFAULT = new SubtitleFontFamily("DEFAULT", 0, BuildConfig.FLAVOR, "Default");
    public static final SubtitleFontFamily TREBUCHET = new SubtitleFontFamily("TREBUCHET", 1, "trebuc", "Trebuchet");
    public static final SubtitleFontFamily INTER = new SubtitleFontFamily("INTER", 2, "inter", "Inter");
    public static final SubtitleFontFamily LEVENIM = new SubtitleFontFamily("LEVENIM", 3, "levenim", "Levenim");

    private static final /* synthetic */ SubtitleFontFamily[] $values() {
        return new SubtitleFontFamily[]{DEFAULT, TREBUCHET, INTER, LEVENIM};
    }

    static {
        SubtitleFontFamily[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
        Companion = new Companion(null);
    }

    private SubtitleFontFamily(String str, int i, String str2, String str3) {
        this.id = str2;
        this.displayName = str3;
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static SubtitleFontFamily valueOf(String str) {
        return (SubtitleFontFamily) Enum.valueOf(SubtitleFontFamily.class, str);
    }

    public static SubtitleFontFamily[] values() {
        return (SubtitleFontFamily[]) $VALUES.clone();
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final SubtitleFontFamily fromId(String str) {
            Object obj;
            Iterator<E> it = SubtitleFontFamily.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (a34.i(((SubtitleFontFamily) obj).getId(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            SubtitleFontFamily subtitleFontFamily = (SubtitleFontFamily) obj;
            if (subtitleFontFamily == null) {
                return SubtitleFontFamily.DEFAULT;
            }
            return subtitleFontFamily;
        }

        private Companion() {
        }
    }
}
