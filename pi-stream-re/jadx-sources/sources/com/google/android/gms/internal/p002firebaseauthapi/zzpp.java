package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzpp extends zzqs {
    private final int zza;
    private final int zzb;
    private final zzb zzc;

    /* loaded from: classes.dex */
    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private zzb zzc;

        public final zza zza(int i10) {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 << 3)));
            }
            this.zza = Integer.valueOf(i10);
            return this;
        }

        public final zza zzb(int i10) {
            if (i10 >= 10 && 16 >= i10) {
                this.zzb = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException(g.n("Invalid tag size for AesCmacParameters: ", i10));
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zzb.zzd;
        }

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zzpp zza() {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        return new zzpp(num.intValue(), this.zzb.intValue(), this.zzc);
                    }
                    throw new GeneralSecurityException("variant not set");
                }
                throw new GeneralSecurityException("tag size not set");
            }
            throw new GeneralSecurityException("key size not set");
        }
    }

    /* loaded from: classes.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("LEGACY");
        public static final zzb zzd = new zzb("NO_PREFIX");
        private final String zze;

        private zzb(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    public static zza zzd() {
        return new zza();
    }

    private final int zzf() {
        int i10;
        zzb zzbVar = this.zzc;
        if (zzbVar == zzb.zzd) {
            return this.zzb;
        }
        if (zzbVar == zzb.zza) {
            i10 = this.zzb;
        } else if (zzbVar == zzb.zzb) {
            i10 = this.zzb;
        } else if (zzbVar == zzb.zzc) {
            i10 = this.zzb;
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return i10 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpp)) {
            return false;
        }
        zzpp zzppVar = (zzpp) obj;
        if (zzppVar.zza != this.zza || zzppVar.zzf() != zzf() || zzppVar.zzc != this.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzpp.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        if (this.zzc != zzb.zzd) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzb zze() {
        return this.zzc;
    }

    private zzpp(int i10, int i11, zzb zzbVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzbVar;
    }
}
