package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import s4.a;

/* loaded from: classes.dex */
public final class zzal {
    private static final Status zza = new Status(13, null);

    public final q addWorkAccount(o oVar, String str) {
        return oVar.a(new zzae(this, a.f9897a, oVar, str));
    }

    public final q removeWorkAccount(o oVar, Account account) {
        return oVar.a(new zzag(this, a.f9897a, oVar, account));
    }

    public final void setWorkAuthenticatorEnabled(o oVar, boolean z9) {
        setWorkAuthenticatorEnabledWithResult(oVar, z9);
    }

    public final q setWorkAuthenticatorEnabledWithResult(o oVar, boolean z9) {
        return oVar.a(new zzac(this, a.f9897a, oVar, z9));
    }
}
