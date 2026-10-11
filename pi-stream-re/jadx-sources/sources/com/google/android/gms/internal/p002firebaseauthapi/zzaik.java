package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaik implements zzanb {
    private final zzaii zza;

    private zzaik(zzaii zzaiiVar) {
        zzaii zzaiiVar2 = (zzaii) zzajc.zza(zzaiiVar, "output");
        this.zza = zzaiiVar2;
        zzaiiVar2.zza = this;
    }

    public static zzaik zza(zzaii zzaiiVar) {
        zzaik zzaikVar = zzaiiVar.zza;
        return zzaikVar != null ? zzaikVar : new zzaik(zzaiiVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzb(int i10, List<Double> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zza(list.get(i13).doubleValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzc(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zza(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzd(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zzb(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzg(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zze(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zza(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzf(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzf(int i10, List<Float> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zza(list.get(i13).floatValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzg(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zzc(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzh(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zzb(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzi(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zze(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzg(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzj(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zzc(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzf(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzk(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zzf(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzi(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzl(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zzd(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzg(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzg(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzm(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zzh(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzk(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzn(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zze(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zza() {
        return zzana.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, boolean z9) {
        this.zza.zzb(i10, z9);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, List<Boolean> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaii.zza(list.get(i13).booleanValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzb(int i10, int i11) {
        this.zza.zzg(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzd(int i10, int i11) {
        this.zza.zzg(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zze(int i10, int i11) {
        this.zza.zzi(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzf(int i10, int i11) {
        this.zza.zzk(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzb(int i10, long j4) {
        this.zza.zzh(i10, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zze(int i10, long j4) {
        this.zza.zzh(i10, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzc(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzd(int i10, long j4) {
        this.zza.zzg(i10, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzb(int i10, Object obj, zzalc zzalcVar) {
        this.zza.zzc(i10, (zzakk) obj, zzalcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzc(int i10, long j4) {
        this.zza.zzf(i10, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, zzahm zzahmVar) {
        this.zza.zzc(i10, zzahmVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzb(int i10, List<?> list, zzalc zzalcVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, list.get(i11), zzalcVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, List<zzahm> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzc(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzj(i10, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof zzajq) {
            zzajq zzajqVar = (zzajq) list;
            while (i11 < list.size()) {
                Object zzb = zzajqVar.zzb(i11);
                if (zzb instanceof String) {
                    this.zza.zzb(i10, (String) zzb);
                } else {
                    this.zza.zzc(i10, (zzahm) zzb);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    @Deprecated
    public final void zza(int i10) {
        this.zza.zzj(i10, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, long j4) {
        this.zza.zzf(i10, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, float f10) {
        this.zza.zzb(i10, f10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, Object obj, zzalc zzalcVar) {
        zzaii zzaiiVar = this.zza;
        zzaiiVar.zzj(i10, 3);
        zzalcVar.zza((zzalc) obj, (zzanb) zzaiiVar.zza);
        zzaiiVar.zzj(i10, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, List<?> list, zzalc zzalcVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, list.get(i11), zzalcVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final <K, V> void zza(int i10, zzakf<K, V> zzakfVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzj(i10, 2);
            this.zza.zzl(zzakc.zza(zzakfVar, entry.getKey(), entry.getValue()));
            zzakc.zza(this.zza, zzakfVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, Object obj) {
        if (obj instanceof zzahm) {
            this.zza.zzd(i10, (zzahm) obj);
        } else {
            this.zza.zzb(i10, (zzakk) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(int i10, String str) {
        this.zza.zzb(i10, str);
    }
}
