package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import w4.j;

/* loaded from: classes.dex */
public abstract class zbai extends zbb implements zbaj {
    public zbai() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) zbc.zba(parcel, Status.CREATOR);
            j jVar = (j) zbc.zba(parcel, j.CREATOR);
            zbc.zbb(parcel);
            zbb(status, jVar);
            return true;
        }
        return false;
    }
}
