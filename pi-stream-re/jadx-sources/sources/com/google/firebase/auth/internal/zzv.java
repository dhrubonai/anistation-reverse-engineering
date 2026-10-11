package com.google.firebase.auth.internal;

import com.google.firebase.auth.ActionCodeMultiFactorInfo;
import com.google.firebase.auth.MultiFactorInfo;
import w7.b;

/* loaded from: classes.dex */
public final class zzv extends ActionCodeMultiFactorInfo {
    private final MultiFactorInfo zza;

    public zzv(String str, MultiFactorInfo multiFactorInfo) {
        b.o(str);
        this.email = str;
        b.s(multiFactorInfo);
        this.zza = multiFactorInfo;
    }

    @Override // com.google.firebase.auth.ActionCodeMultiFactorInfo
    public final MultiFactorInfo getMultiFactorInfo() {
        return this.zza;
    }
}
