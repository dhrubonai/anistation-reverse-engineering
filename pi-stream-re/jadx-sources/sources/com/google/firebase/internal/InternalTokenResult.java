package com.google.firebase.internal;

import java.util.Arrays;
import p7.a0;
import z3.e;

/* loaded from: classes.dex */
public class InternalTokenResult {
    private String zza;

    public InternalTokenResult(String str) {
        this.zza = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InternalTokenResult)) {
            return false;
        }
        return a0.q(this.zza, ((InternalTokenResult) obj).zza);
    }

    public String getToken() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public String toString() {
        e eVar = new e(this);
        eVar.f(this.zza, "token");
        return eVar.toString();
    }
}
