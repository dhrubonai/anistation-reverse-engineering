package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c5.a;
import p7.a0;

/* loaded from: classes.dex */
public class UserProfileChangeRequest extends a {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new zzav();
    private String zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private Uri zze;

    /* loaded from: classes.dex */
    public static class Builder {
        private String zza;
        private Uri zzb;
        private boolean zzc;
        private boolean zzd;

        public UserProfileChangeRequest build() {
            String uri;
            String str = this.zza;
            Uri uri2 = this.zzb;
            if (uri2 == null) {
                uri = null;
            } else {
                uri = uri2.toString();
            }
            return new UserProfileChangeRequest(str, uri, this.zzc, this.zzd);
        }

        public String getDisplayName() {
            return this.zza;
        }

        public Uri getPhotoUri() {
            return this.zzb;
        }

        public Builder setDisplayName(String str) {
            if (str == null) {
                this.zzc = true;
            } else {
                this.zza = str;
            }
            return this;
        }

        public Builder setPhotoUri(Uri uri) {
            if (uri == null) {
                this.zzd = true;
            } else {
                this.zzb = uri;
            }
            return this;
        }
    }

    public UserProfileChangeRequest(String str, String str2, boolean z9, boolean z10) {
        Uri parse;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z9;
        this.zzd = z10;
        if (TextUtils.isEmpty(str2)) {
            parse = null;
        } else {
            parse = Uri.parse(str2);
        }
        this.zze = parse;
    }

    public String getDisplayName() {
        return this.zza;
    }

    public Uri getPhotoUri() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 2, getDisplayName(), false);
        a0.n0(parcel, 3, this.zzb, false);
        a0.d0(parcel, 4, this.zzc);
        a0.d0(parcel, 5, this.zzd);
        a0.u0(t02, parcel);
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
