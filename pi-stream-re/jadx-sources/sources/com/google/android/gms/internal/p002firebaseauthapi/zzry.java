package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzry extends zzaja<zzry, zza> implements zzakm {
    private static final zzry zzc;
    private static volatile zzakx<zzry> zzd;
    private int zze;
    private int zzf;
    private zzahm zzg = zzahm.zza;
    private zzsc zzh;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzry, zza> implements zzakm {
        private zza() {
            super(zzry.zzc);
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzry) this.zza).zza(zzahmVar);
            return this;
        }

        public /* synthetic */ zza(zzrx zzrxVar) {
            this();
        }

        public final zza zza(zzsc zzscVar) {
            zzh();
            ((zzry) this.zza).zza(zzscVar);
            return this;
        }
    }

    static {
        zzry zzryVar = new zzry();
        zzc = zzryVar;
        zzaja.zza((Class<zzry>) zzry.class, zzryVar);
    }

    private zzry() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzakx<zzry> zzf() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsc zzd() {
        zzsc zzscVar = this.zzh;
        if (zzscVar == null) {
            return zzsc.zzd();
        }
        return zzscVar;
    }

    public final zzahm zze() {
        return this.zzg;
    }

    public static zzry zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzry) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzrx zzrxVar = null;
        switch (zzrx.zza[i10 - 1]) {
            case 1:
                return new zzry();
            case 2:
                return new zza(zzrxVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzry> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzry.class) {
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
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzg = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsc zzscVar) {
        zzscVar.getClass();
        this.zzh = zzscVar;
        this.zze |= 1;
    }
}
