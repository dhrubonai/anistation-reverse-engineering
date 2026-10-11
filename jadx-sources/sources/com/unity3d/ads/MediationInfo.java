package com.unity3d.ads;

import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MediationInfo {
    private final String adapterVersion;
    private final String name;
    private final String version;

    public MediationInfo(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.version = str2;
        this.adapterVersion = str3;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.name = lowerCase;
    }

    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }
}
