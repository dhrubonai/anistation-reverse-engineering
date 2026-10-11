package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f2429a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.c f2430b;

    public /* synthetic */ h0(a aVar, b5.c cVar) {
        this.f2429a = aVar;
        this.f2430b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof h0)) {
            h0 h0Var = (h0) obj;
            if (p7.a0.q(this.f2429a, h0Var.f2429a) && p7.a0.q(this.f2430b, h0Var.f2430b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2429a, this.f2430b});
    }

    public final String toString() {
        z3.e eVar = new z3.e(this);
        eVar.f(this.f2429a, "key");
        eVar.f(this.f2430b, "feature");
        return eVar.toString();
    }
}
