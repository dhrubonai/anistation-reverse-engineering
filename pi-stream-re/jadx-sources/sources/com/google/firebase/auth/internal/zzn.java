package com.google.firebase.auth.internal;

import a3.g;

/* loaded from: classes.dex */
final class zzn extends zzj {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzj) {
            zzj zzjVar = (zzj) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzjVar.zzc()) : zzjVar.zzc() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzjVar.zza()) : zzjVar.zza() == null) {
                    String str3 = this.zzc;
                    if (str3 != null ? str3.equals(zzjVar.zzb()) : zzjVar.zzb() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.zza;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.zzb;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.zzc;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 ^ i10;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzc;
        StringBuilder sb = new StringBuilder("AttestationResult{recaptchaV2Token=");
        sb.append(str);
        sb.append(", playIntegrityToken=");
        sb.append(str2);
        sb.append(", recaptchaEnterpriseToken=");
        return g.t(sb, str3, "}");
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String zzc() {
        return this.zza;
    }

    private zzn(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
