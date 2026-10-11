package com.unity3d.ads.core.domain;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class HttpClientSelection {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ HttpClientSelection[] $VALUES;
    public static final HttpClientSelection CRONET_WITHOUT_QUIC = new HttpClientSelection("CRONET_WITHOUT_QUIC", 0);
    public static final HttpClientSelection CRONET_WITH_QUIC = new HttpClientSelection("CRONET_WITH_QUIC", 1);
    public static final HttpClientSelection LEGACY = new HttpClientSelection("LEGACY", 2);
    public static final HttpClientSelection OKHTTP3 = new HttpClientSelection("OKHTTP3", 3);

    private static final /* synthetic */ HttpClientSelection[] $values() {
        return new HttpClientSelection[]{CRONET_WITHOUT_QUIC, CRONET_WITH_QUIC, LEGACY, OKHTTP3};
    }

    static {
        HttpClientSelection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private HttpClientSelection(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static HttpClientSelection valueOf(String str) {
        return (HttpClientSelection) Enum.valueOf(HttpClientSelection.class, str);
    }

    public static HttpClientSelection[] values() {
        return (HttpClientSelection[]) $VALUES.clone();
    }
}
