package com.unity3d.ads.core.data.model;

import defpackage.a34;
import defpackage.qx1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class GatewayUrl {
    private final String url;

    private /* synthetic */ GatewayUrl(String str) {
        this.url = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GatewayUrl m44boximpl(String str) {
        return new GatewayUrl(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m45constructorimpl(String str) {
        str.getClass();
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m46equalsimpl(String str, Object obj) {
        if (!(obj instanceof GatewayUrl) || !a34.i(str, ((GatewayUrl) obj).m50unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m47equalsimpl0(String str, String str2) {
        return a34.i(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m48hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m49toStringimpl(String str) {
        return qx1.g(')', "GatewayUrl(url=", str);
    }

    public boolean equals(Object obj) {
        return m46equalsimpl(this.url, obj);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return m48hashCodeimpl(this.url);
    }

    public String toString() {
        return m49toStringimpl(this.url);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m50unboximpl() {
        return this.url;
    }
}
