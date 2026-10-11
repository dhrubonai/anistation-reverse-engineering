package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzne extends zzci {
    private final zzos zza;

    public zzne(zzos zzosVar) {
        this.zza = zzosVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzne)) {
            return false;
        }
        zzos zzosVar = ((zzne) obj).zza;
        if (!this.zza.zza().zzd().equals(zzosVar.zza().zzd()) || !this.zza.zza().zzf().equals(zzosVar.zza().zzf()) || !this.zza.zza().zze().equals(zzosVar.zza().zze())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zza().zzf();
        int i10 = zznh.zza[this.zza.zza().zzd().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        if (this.zza.zza().zzd() != zzvt.RAW) {
            return true;
        }
        return false;
    }

    public final zzos zzb() {
        return this.zza;
    }
}
