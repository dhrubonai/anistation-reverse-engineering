package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zztk extends zzaja<zztk, zza> implements zzakm {
    private static final zztk zzc;
    private static volatile zzakx<zztk> zzd;
    private int zze;
    private zzvd zzf;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zztk, zza> implements zzakm {
        private zza() {
            super(zztk.zzc);
        }

        public final zza zza(zzvd zzvdVar) {
            zzh();
            ((zztk) this.zza).zza(zzvdVar);
            return this;
        }

        public /* synthetic */ zza(zztm zztmVar) {
            this();
        }
    }

    static {
        zztk zztkVar = new zztk();
        zzc = zztkVar;
        zzaja.zza((Class<zztk>) zztk.class, zztkVar);
    }

    private zztk() {
    }

    public static zza zza() {
        return zzc.zzl();
    }

    public static zztk zzc() {
        return zzc;
    }

    public final zzvd zzd() {
        zzvd zzvdVar = this.zzf;
        if (zzvdVar == null) {
            return zzvd.zzc();
        }
        return zzvdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zztm zztmVar = null;
        switch (zztm.zza[i10 - 1]) {
            case 1:
                return new zztk();
            case 2:
                return new zza(zztmVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zztk> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zztk.class) {
                        zzakxVar = zzd;
                        if (zzakxVar == null) {
                            zzakxVar = new zzaja.zza<>(zzc);
                            zzd = zzakxVar;
                        }
                    }
                }
                return zzakxVar;
            case 6:
                return (byte) 1;
            case zzaja.zze.zzg /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvd zzvdVar) {
        zzvdVar.getClass();
        this.zzf = zzvdVar;
        this.zze |= 1;
    }
}
