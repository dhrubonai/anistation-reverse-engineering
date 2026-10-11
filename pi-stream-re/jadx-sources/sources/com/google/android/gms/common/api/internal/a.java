package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2369a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.i f2370b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f2371c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2372d;

    public a(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.e eVar, String str) {
        this.f2370b = iVar;
        this.f2371c = eVar;
        this.f2372d = str;
        this.f2369a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!p7.a0.q(this.f2370b, aVar.f2370b) || !p7.a0.q(this.f2371c, aVar.f2371c) || !p7.a0.q(this.f2372d, aVar.f2372d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2369a;
    }
}
