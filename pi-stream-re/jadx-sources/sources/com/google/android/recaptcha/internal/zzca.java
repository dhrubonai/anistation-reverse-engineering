package com.google.android.recaptcha.internal;

import a7.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p7.y;
import r6.h0;
import w6.f;
import x6.m;
import z6.e;

/* loaded from: classes.dex */
public final class zzca implements zzbu {
    public static final zzbv zza = new zzbv(null);
    private final y zzb;
    private final zzcl zzc;
    private final zzee zzd;
    private final Map zze;
    private final Map zzf;

    public zzca(y yVar, zzcl zzclVar, zzee zzeeVar, Map map) {
        this.zzb = yVar;
        this.zzc = zzclVar;
        this.zzd = zzeeVar;
        this.zze = map;
        this.zzf = zzclVar.zzb().zzc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzcj zzcjVar, e eVar) {
        Object E = h0.E(new zzbx(zzcjVar, list, this, null), eVar);
        if (E == a.f156a) {
            return E;
        }
        return f.f11019a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzcj zzcjVar, e eVar) {
        Object E = h0.E(new zzby(exc, zzcjVar, this, null), eVar);
        if (E == a.f156a) {
            return E;
        }
        return f.f11019a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(zzpr zzprVar, zzcj zzcjVar) {
        zzfh zzb = zzfh.zzb();
        int zza2 = zzcjVar.zza();
        zzdd zzddVar = (zzdd) this.zze.get(Integer.valueOf(zzprVar.zzf()));
        if (zzddVar != null) {
            int zzg = zzprVar.zzg();
            zzpq[] zzpqVarArr = (zzpq[]) zzprVar.zzj().toArray(new zzpq[0]);
            zzddVar.zza(zzg, zzcjVar, (zzpq[]) Arrays.copyOf(zzpqVarArr, zzpqVarArr.length));
            if (zza2 == zzcjVar.zza()) {
                zzcjVar.zzg(zzcjVar.zza() + 1);
            }
            zzb.zzf();
            long zza3 = zzb.zza(TimeUnit.MICROSECONDS);
            zzv zzvVar = zzv.zza;
            int zzk = zzprVar.zzk();
            if (zzk != 1) {
                zzv.zza(zzk - 2, zza3);
                zzprVar.zzk();
                zzprVar.zzg();
                m.r0(zzprVar.zzj(), null, null, null, new zzbw(this), 31);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        throw new zzae(5, 2, null);
    }

    @Override // com.google.android.recaptcha.internal.zzbu
    public final void zza(String str) {
        h0.k0(this.zzb, new zzbz(new zzcj(this.zzc), this, str, null));
    }
}
