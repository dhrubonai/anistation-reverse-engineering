package com.google.firebase.auth.internal;

import com.google.firebase.auth.ActionCodeEmailInfo;
import w7.b;

/* loaded from: classes.dex */
public final class zzt extends ActionCodeEmailInfo {
    private final String zza;

    public zzt(String str, String str2) {
        b.o(str);
        this.email = str;
        b.o(str2);
        this.zza = str2;
    }

    @Override // com.google.firebase.auth.ActionCodeEmailInfo
    public final String getPreviousEmail() {
        return this.zza;
    }
}
