package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzhh extends zzgm {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzhh.class.getName());
    private static final boolean zzd = zzlv.zzx();
    zzhi zza;

    private zzhh() {
    }

    public /* synthetic */ zzhh(zzhg zzhgVar) {
    }

    public static zzhh zzA(byte[] bArr, int i10, int i11) {
        return new zzhe(bArr, 0, i11);
    }

    @Deprecated
    public static int zzt(int i10, zzke zzkeVar, zzkr zzkrVar) {
        int zza = ((zzgf) zzkeVar).zza(zzkrVar);
        int zzy = zzy(i10 << 3);
        return zzy + zzy + zza;
    }

    public static int zzu(int i10) {
        if (i10 >= 0) {
            return zzy(i10);
        }
        return 10;
    }

    public static int zzv(zzke zzkeVar) {
        int zzn = zzkeVar.zzn();
        return zzy(zzn) + zzn;
    }

    public static int zzw(zzke zzkeVar, zzkr zzkrVar) {
        int zza = ((zzgf) zzkeVar).zza(zzkrVar);
        return zzy(zza) + zza;
    }

    public static int zzx(String str) {
        int length;
        try {
            length = zzma.zzc(str);
        } catch (zzlz unused) {
            length = str.getBytes(zzjc.zzb).length;
        }
        return zzy(length) + length;
    }

    public static int zzy(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzz(long j4) {
        int i10;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j4) != 0) {
            j4 >>>= 14;
            i10 += 2;
        }
        return (j4 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public final void zzB() {
        if (zza() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzlz zzlzVar) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzlzVar);
        byte[] bytes = str.getBytes(zzjc.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzhf(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z9);

    public abstract void zze(int i10, zzgw zzgwVar);

    public abstract void zzf(int i10, int i11);

    public abstract void zzg(int i10);

    public abstract void zzh(int i10, long j4);

    public abstract void zzi(long j4);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, String str);

    public abstract void zzo(int i10, int i11);

    public abstract void zzp(int i10, int i11);

    public abstract void zzq(int i10);

    public abstract void zzr(int i10, long j4);

    public abstract void zzs(long j4);
}
