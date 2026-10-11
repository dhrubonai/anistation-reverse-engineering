package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import com.google.android.gms.auth.api.credentials.Credential;
import p7.a0;

/* loaded from: classes.dex */
public final class zbp extends a {
    public static final Parcelable.Creator<zbp> CREATOR = new zbq();
    private final Credential zba;

    public zbp(Credential credential) {
        this.zba = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.m0(parcel, 1, this.zba, i10, false);
        a0.u0(t02, parcel);
    }
}
