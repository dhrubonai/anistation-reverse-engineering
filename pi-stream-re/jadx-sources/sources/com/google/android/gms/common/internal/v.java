package com.google.android.gms.common.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v implements com.google.android.gms.common.api.e {

    /* renamed from: b, reason: collision with root package name */
    public static final v f2602b = new v(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f2603a;

    public /* synthetic */ v(String str) {
        this.f2603a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return p7.a0.q(this.f2603a, ((v) obj).f2603a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2603a});
    }
}
