package com.unity3d.ads.core.data.model;

import defpackage.a34;
import defpackage.qx1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdDataRefreshToken {
    private final String data;

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m37boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m38constructorimpl(String str) {
        str.getClass();
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m39equalsimpl(String str, Object obj) {
        if (!(obj instanceof AdDataRefreshToken) || !a34.i(str, ((AdDataRefreshToken) obj).m43unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m40equalsimpl0(String str, String str2) {
        return a34.i(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m41hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m42toStringimpl(String str) {
        return qx1.g(')', "AdDataRefreshToken(data=", str);
    }

    public boolean equals(Object obj) {
        return m39equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m41hashCodeimpl(this.data);
    }

    public String toString() {
        return m42toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m43unboximpl() {
        return this.data;
    }
}
