package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzaeg extends zzaft {
    private final String zza;
    private final String zzb;

    public zzaeg(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaft) {
            zzaft zzaftVar = (zzaft) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzaftVar.zzb()) : zzaftVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzaftVar.zza()) : zzaftVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zza;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final String zzb() {
        return this.zza;
    }
}
