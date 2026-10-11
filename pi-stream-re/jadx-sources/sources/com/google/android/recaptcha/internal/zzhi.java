package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes.dex */
final class zzhi implements zzmd {
    private final zzhh zza;

    private zzhi(zzhh zzhhVar) {
        byte[] bArr = zzjc.zzd;
        this.zza = zzhhVar;
        zzhhVar.zza = this;
    }

    public static zzhi zza(zzhh zzhhVar) {
        zzhi zzhiVar = zzhhVar.zza;
        if (zzhiVar != null) {
            return zzhiVar;
        }
        return new zzhi(zzhhVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzA(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzB(int i10, int i11) {
        this.zza.zzp(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzC(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                i12 += zzhh.zzy((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                zzhh zzhhVar = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzhhVar.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzhh zzhhVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            zzhhVar2.zzp(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzD(int i10, long j4) {
        this.zza.zzr(i10, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzE(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = ((Long) list.get(i13)).longValue();
                i12 += zzhh.zzz((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                zzhh zzhhVar = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzhhVar.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzhh zzhhVar2 = this.zza;
            long longValue3 = ((Long) list.get(i11)).longValue();
            zzhhVar2.zzr(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    @Deprecated
    public final void zzF(int i10) {
        this.zza.zzo(i10, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzG(int i10, String str) {
        this.zza.zzm(i10, str);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzH(int i10, List list) {
        int i11 = 0;
        if (list instanceof zzjm) {
            zzjm zzjmVar = (zzjm) list;
            while (i11 < list.size()) {
                Object zzf = zzjmVar.zzf(i11);
                if (zzf instanceof String) {
                    this.zza.zzm(i10, (String) zzf);
                } else {
                    this.zza.zze(i10, (zzgw) zzf);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzm(i10, (String) list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzI(int i10, int i11) {
        this.zza.zzp(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzJ(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzhh.zzy(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzp(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzK(int i10, long j4) {
        this.zza.zzr(i10, j4);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzL(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzhh.zzz(((Long) list.get(i13)).longValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzb(int i10, boolean z9) {
        this.zza.zzd(i10, z9);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzc(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzd(int i10, zzgw zzgwVar) {
        this.zza.zze(i10, zzgwVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzgw) list.get(i11));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzf(int i10, double d10) {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzg(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzo(i10, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzi(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzj(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzhh.zzu(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzk(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzl(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzm(int i10, long j4) {
        this.zza.zzh(i10, j4);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzn(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzo(int i10, float f10) {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzp(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzq(int i10, Object obj, zzkr zzkrVar) {
        zzhh zzhhVar = this.zza;
        zzhhVar.zzo(i10, 3);
        zzkrVar.zzj((zzke) obj, zzhhVar.zza);
        zzhhVar.zzo(i10, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzr(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzs(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzhh.zzu(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzt(int i10, long j4) {
        this.zza.zzr(i10, j4);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzu(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzhh.zzz(((Long) list.get(i13)).longValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzv(int i10, Object obj, zzkr zzkrVar) {
        zzke zzkeVar = (zzke) obj;
        zzhe zzheVar = (zzhe) this.zza;
        zzheVar.zzq((i10 << 3) | 2);
        zzheVar.zzq(((zzgf) zzkeVar).zza(zzkrVar));
        zzkrVar.zzj(zzkeVar, zzheVar.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzw(int i10, Object obj) {
        if (obj instanceof zzgw) {
            zzhe zzheVar = (zzhe) this.zza;
            zzheVar.zzq(11);
            zzheVar.zzp(2, i10);
            zzheVar.zze(3, (zzgw) obj);
            zzheVar.zzq(12);
            return;
        }
        zzhh zzhhVar = this.zza;
        zzke zzkeVar = (zzke) obj;
        zzhe zzheVar2 = (zzhe) zzhhVar;
        zzheVar2.zzq(11);
        zzheVar2.zzp(2, i10);
        zzheVar2.zzq(26);
        zzheVar2.zzq(zzkeVar.zzn());
        zzkeVar.zze(zzhhVar);
        zzheVar2.zzq(12);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzx(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzy(int i10, List list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzz(int i10, long j4) {
        this.zza.zzh(i10, j4);
    }
}
