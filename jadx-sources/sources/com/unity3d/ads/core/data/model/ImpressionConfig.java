package com.unity3d.ads.core.data.model;

import defpackage.a34;
import defpackage.qx1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ImpressionConfig {
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m51boximpl(String str) {
        return new ImpressionConfig(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m52constructorimpl(String str) {
        str.getClass();
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m53equalsimpl(String str, Object obj) {
        if (!(obj instanceof ImpressionConfig) || !a34.i(str, ((ImpressionConfig) obj).m57unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m54equalsimpl0(String str, String str2) {
        return a34.i(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m55hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m56toStringimpl(String str) {
        return qx1.g(')', "ImpressionConfig(data=", str);
    }

    public boolean equals(Object obj) {
        return m53equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m55hashCodeimpl(this.data);
    }

    public String toString() {
        return m56toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m57unboximpl() {
        return this.data;
    }
}
