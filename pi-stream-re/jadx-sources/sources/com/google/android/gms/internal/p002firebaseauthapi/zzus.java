package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzus extends zzaja<zzus, zza> implements zzakm {
    private static final zzus zzc;
    private static volatile zzakx<zzus> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzus, zza> implements zzakm {
        private zza() {
            super(zzus.zzc);
        }

        public final zza zza(zzuj zzujVar) {
            zzh();
            ((zzus) this.zza).zza(zzujVar);
            return this;
        }

        public /* synthetic */ zza(zzur zzurVar) {
            this();
        }

        public final zza zza(zzuk zzukVar) {
            zzh();
            ((zzus) this.zza).zza(zzukVar);
            return this;
        }

        public final zza zza(zzum zzumVar) {
            zzh();
            ((zzus) this.zza).zza(zzumVar);
            return this;
        }
    }

    static {
        zzus zzusVar = new zzus();
        zzc = zzusVar;
        zzaja.zza((Class<zzus>) zzus.class, zzusVar);
    }

    private zzus() {
    }

    public static zza zzd() {
        return zzc.zzl();
    }

    public static zzus zzf() {
        return zzc;
    }

    public final zzuj zza() {
        zzuj zza2 = zzuj.zza(this.zzg);
        return zza2 == null ? zzuj.UNRECOGNIZED : zza2;
    }

    public final zzuk zzb() {
        zzuk zza2 = zzuk.zza(this.zzf);
        if (zza2 == null) {
            return zzuk.UNRECOGNIZED;
        }
        return zza2;
    }

    public final zzum zzc() {
        zzum zza2 = zzum.zza(this.zze);
        if (zza2 == null) {
            return zzum.UNRECOGNIZED;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzur zzurVar = null;
        switch (zzur.zza[i10 - 1]) {
            case 1:
                return new zzus();
            case 2:
                return new zza(zzurVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzus> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzus.class) {
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
    public final void zza(zzuj zzujVar) {
        this.zzg = zzujVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuk zzukVar) {
        this.zzf = zzukVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzum zzumVar) {
        this.zze = zzumVar.zza();
    }
}
