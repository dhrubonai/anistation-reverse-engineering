package com.anistation.model.settings;

import defpackage.a34;
import defpackage.q71;
import defpackage.sv1;
import defpackage.t80;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ThemeMode {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ ThemeMode[] $VALUES;
    public static final Companion Companion;
    private final String label;
    public static final ThemeMode SYSTEM = new ThemeMode("SYSTEM", 0, "System");
    public static final ThemeMode LIGHT = new ThemeMode("LIGHT", 1, "Light");
    public static final ThemeMode DARK = new ThemeMode("DARK", 2, "Dark");

    private static final /* synthetic */ ThemeMode[] $values() {
        return new ThemeMode[]{SYSTEM, LIGHT, DARK};
    }

    static {
        ThemeMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
        Companion = new Companion(null);
    }

    private ThemeMode(String str, int i, String str2) {
        this.label = str2;
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static ThemeMode valueOf(String str) {
        return (ThemeMode) Enum.valueOf(ThemeMode.class, str);
    }

    public static ThemeMode[] values() {
        return (ThemeMode[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final ThemeMode fromStorageValue(String str) {
            Object obj;
            Iterator<E> it = ThemeMode.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (a34.i(((ThemeMode) obj).name(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ThemeMode themeMode = (ThemeMode) obj;
            if (themeMode == null) {
                return ThemeMode.SYSTEM;
            }
            return themeMode;
        }

        private Companion() {
        }
    }
}
