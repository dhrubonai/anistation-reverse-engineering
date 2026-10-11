package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zztp extends zzaja<zztp, zza> implements zzakm {
    private static final zztp zzc;
    private static volatile zzakx<zztp> zzd;
    private int zze;
    private zztw zzf;
    private zztk zzg;
    private int zzh;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zztp, zza> implements zzakm {
        private zza() {
            super(zztp.zzc);
        }

        public final zza zza(zztk zztkVar) {
            zzh();
            ((zztp) this.zza).zza(zztkVar);
            return this;
        }

        public /* synthetic */ zza(zztq zztqVar) {
            this();
        }

        public final zza zza(zztj zztjVar) {
            zzh();
            ((zztp) this.zza).zza(zztjVar);
            return this;
        }

        public final zza zza(zztw zztwVar) {
            zzh();
            ((zztp) this.zza).zza(zztwVar);
            return this;
        }
    }

    static {
        zztp zztpVar = new zztp();
        zzc = zztpVar;
        zzaja.zza((Class<zztp>) zztp.class, zztpVar);
    }

    private zztp() {
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zztp zze() {
        return zzc;
    }

    public final zztj zza() {
        zztj zza2 = zztj.zza(this.zzh);
        return zza2 == null ? zztj.UNRECOGNIZED : zza2;
    }

    public final zztk zzb() {
        zztk zztkVar = this.zzg;
        if (zztkVar == null) {
            return zztk.zzc();
        }
        return zztkVar;
    }

    public final zztw zzf() {
        zztw zztwVar = this.zzf;
        if (zztwVar == null) {
            return zztw.zzc();
        }
        return zztwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zztq zztqVar = null;
        switch (zztq.zza[i10 - 1]) {
            case 1:
                return new zztp();
            case 2:
                return new zza(zztqVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zztp> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zztp.class) {
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
    public final void zza(zztk zztkVar) {
        zztkVar.getClass();
        this.zzg = zztkVar;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztj zztjVar) {
        this.zzh = zztjVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztw zztwVar) {
        zztwVar.getClass();
        this.zzf = zztwVar;
        this.zze |= 1;
    }
}
