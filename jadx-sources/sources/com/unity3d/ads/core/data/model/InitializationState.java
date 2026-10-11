package com.unity3d.ads.core.data.model;

import defpackage.sv1;
import defpackage.t80;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class InitializationState {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ InitializationState[] $VALUES;
    public static final InitializationState NOT_INITIALIZED = new InitializationState("NOT_INITIALIZED", 0);
    public static final InitializationState INITIALIZING = new InitializationState("INITIALIZING", 1);
    public static final InitializationState INITIALIZED = new InitializationState("INITIALIZED", 2);
    public static final InitializationState FAILED = new InitializationState("FAILED", 3);

    private static final /* synthetic */ InitializationState[] $values() {
        return new InitializationState[]{NOT_INITIALIZED, INITIALIZING, INITIALIZED, FAILED};
    }

    static {
        InitializationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private InitializationState(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static InitializationState valueOf(String str) {
        return (InitializationState) Enum.valueOf(InitializationState.class, str);
    }

    public static InitializationState[] values() {
        return (InitializationState[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }
}
