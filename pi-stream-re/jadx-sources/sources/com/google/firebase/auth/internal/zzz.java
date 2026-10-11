package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import java.util.List;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public final class zzz implements AuthResult {
    public static final Parcelable.Creator<zzz> CREATOR = new zzy();
    private zzaf zza;
    private zzx zzb;
    private com.google.firebase.auth.zzd zzc;

    public zzz(zzaf zzafVar) {
        b.s(zzafVar);
        this.zza = zzafVar;
        List<zzab> zzi = zzafVar.zzi();
        this.zzb = null;
        for (int i10 = 0; i10 < zzi.size(); i10++) {
            if (!TextUtils.isEmpty(zzi.get(i10).zza())) {
                this.zzb = new zzx(zzi.get(i10).getProviderId(), zzi.get(i10).zza(), zzafVar.zzj());
            }
        }
        if (this.zzb == null) {
            this.zzb = new zzx(zzafVar.zzj());
        }
        this.zzc = zzafVar.zzg();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final AdditionalUserInfo getAdditionalUserInfo() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final AuthCredential getCredential() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final FirebaseUser getUser() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.m0(parcel, 1, getUser(), i10, false);
        a0.m0(parcel, 2, getAdditionalUserInfo(), i10, false);
        a0.m0(parcel, 3, this.zzc, i10, false);
        a0.u0(t02, parcel);
    }

    public zzz(zzaf zzafVar, zzx zzxVar, com.google.firebase.auth.zzd zzdVar) {
        this.zza = zzafVar;
        this.zzb = zzxVar;
        this.zzc = zzdVar;
    }
}
