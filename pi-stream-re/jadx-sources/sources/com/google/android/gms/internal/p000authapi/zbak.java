package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import w4.l;

/* loaded from: classes.dex */
public abstract class zbak extends zbb implements zbal {
    public zbak() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) zbc.zba(parcel, Status.CREATOR);
            l lVar = (l) zbc.zba(parcel, l.CREATOR);
            zbc.zbb(parcel);
            zbb(status, lVar);
            return true;
        }
        return false;
    }
}
