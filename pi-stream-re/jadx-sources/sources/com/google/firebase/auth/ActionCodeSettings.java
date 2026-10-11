package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import p7.a0;

/* loaded from: classes.dex */
public class ActionCodeSettings extends a {
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new zzc();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;
    private final String zzf;
    private final boolean zzg;
    private String zzh;
    private int zzi;
    private String zzj;

    /* loaded from: classes.dex */
    public static class Builder {
        private String zza;
        private String zzb;
        private String zzc;
        private boolean zzd;
        private String zze;
        private boolean zzf;
        private String zzg;

        public ActionCodeSettings build() {
            if (this.zza != null) {
                return new ActionCodeSettings(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public String getDynamicLinkDomain() {
            return this.zzg;
        }

        public boolean getHandleCodeInApp() {
            return this.zzf;
        }

        public String getIOSBundleId() {
            return this.zzb;
        }

        public String getUrl() {
            return this.zza;
        }

        public Builder setAndroidPackageName(String str, boolean z9, String str2) {
            this.zzc = str;
            this.zzd = z9;
            this.zze = str2;
            return this;
        }

        public Builder setDynamicLinkDomain(String str) {
            this.zzg = str;
            return this;
        }

        public Builder setHandleCodeInApp(boolean z9) {
            this.zzf = z9;
            return this;
        }

        public Builder setIOSBundleId(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setUrl(String str) {
            this.zza = str;
            return this;
        }

        private Builder() {
            this.zzf = false;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ActionCodeSettings zzb() {
        return new ActionCodeSettings(new Builder());
    }

    public boolean canHandleCodeInApp() {
        return this.zzg;
    }

    public boolean getAndroidInstallApp() {
        return this.zze;
    }

    public String getAndroidMinimumVersion() {
        return this.zzf;
    }

    public String getAndroidPackageName() {
        return this.zzd;
    }

    public String getIOSBundle() {
        return this.zzb;
    }

    public String getUrl() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, getUrl(), false);
        a0.n0(parcel, 2, getIOSBundle(), false);
        a0.n0(parcel, 3, this.zzc, false);
        a0.n0(parcel, 4, getAndroidPackageName(), false);
        a0.d0(parcel, 5, getAndroidInstallApp());
        a0.n0(parcel, 6, getAndroidMinimumVersion(), false);
        a0.d0(parcel, 7, canHandleCodeInApp());
        a0.n0(parcel, 8, this.zzh, false);
        a0.h0(parcel, 9, this.zzi);
        a0.n0(parcel, 10, this.zzj, false);
        a0.u0(t02, parcel);
    }

    public final int zza() {
        return this.zzi;
    }

    public final String zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzh;
    }

    private ActionCodeSettings(Builder builder) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = null;
        this.zzd = builder.zzc;
        this.zze = builder.zzd;
        this.zzf = builder.zze;
        this.zzg = builder.zzf;
        this.zzj = builder.zzg;
    }

    public final void zza(String str) {
        this.zzh = str;
    }

    public final void zza(int i10) {
        this.zzi = i10;
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z9, String str5, boolean z10, String str6, int i10, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = z9;
        this.zzf = str5;
        this.zzg = z10;
        this.zzh = str6;
        this.zzi = i10;
        this.zzj = str7;
    }
}
