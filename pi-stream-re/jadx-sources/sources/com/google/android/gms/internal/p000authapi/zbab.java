package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import w4.g;

/* loaded from: classes.dex */
public abstract class zbab extends zbb implements zbac {
    public zbab() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) zbc.zba(parcel, Status.CREATOR);
            g gVar = (g) zbc.zba(parcel, g.CREATOR);
            zbc.zbb(parcel);
            zbb(status, gVar);
            return true;
        }
        return false;
    }
}
