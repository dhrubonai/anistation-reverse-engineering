package com.unity3d.ads.network.model;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class RequestType {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ RequestType[] $VALUES;
    public static final RequestType POST = new RequestType("POST", 0);
    public static final RequestType GET = new RequestType("GET", 1);
    public static final RequestType HEAD = new RequestType("HEAD", 2);

    private static final /* synthetic */ RequestType[] $values() {
        return new RequestType[]{POST, GET, HEAD};
    }

    static {
        RequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private RequestType(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) $VALUES.clone();
    }
}
