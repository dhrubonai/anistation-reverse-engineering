package com.anistation.model;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class Status {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    public static final Status OK = new Status("OK", 0);
    public static final Status NOT_FOUND = new Status("NOT_FOUND", 1);
    public static final Status SERVER_ERROR = new Status("SERVER_ERROR", 2);
    public static final Status BAD_REQUEST = new Status("BAD_REQUEST", 3);
    public static final Status TOO_MANY_REQUESTS = new Status("TOO_MANY_REQUESTS", 4);
    public static final Status FORBIDDEN = new Status("FORBIDDEN", 5);
    public static final Status UNAUTHORIZED = new Status("UNAUTHORIZED", 6);

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{OK, NOT_FOUND, SERVER_ERROR, BAD_REQUEST, TOO_MANY_REQUESTS, FORBIDDEN, UNAUTHORIZED};
    }

    static {
        Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private Status(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
