package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public final class zzx implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzx> CREATOR = new zzw();
    private final String zza;
    private final String zzb;
    private Map<String, Object> zzc;
    private boolean zzd;

    public zzx(boolean z9) {
        this.zzd = z9;
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final Map<String, Object> getProfile() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getProviderId() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getUsername() {
        if ("github.com".equals(this.zza)) {
            return (String) this.zzc.get("login");
        }
        if ("twitter.com".equals(this.zza)) {
            return (String) this.zzc.get("screen_name");
        }
        return null;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final boolean isNewUser() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, getProviderId(), false);
        a0.n0(parcel, 2, this.zzb, false);
        a0.d0(parcel, 3, isNewUser());
        a0.u0(t02, parcel);
    }

    public zzx(String str, String str2, boolean z9) {
        b.o(str);
        b.o(str2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbh.zzb(str2);
        this.zzd = z9;
    }
}
