package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzsg extends zzaja<zzsg, zza> implements zzakm {
    private static final zzsg zzc;
    private static volatile zzakx<zzsg> zzd;
    private int zze;
    private zzsk zzf;
    private zzuf zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzsg, zza> implements zzakm {
        private zza() {
            super(zzsg.zzc);
        }

        public final zza zza(zzsk zzskVar) {
            zzh();
            ((zzsg) this.zza).zza(zzskVar);
            return this;
        }

        public /* synthetic */ zza(zzsf zzsfVar) {
            this();
        }

        public final zza zza(zzuf zzufVar) {
            zzh();
            ((zzsg) this.zza).zza(zzufVar);
            return this;
        }
    }

    static {
        zzsg zzsgVar = new zzsg();
        zzc = zzsgVar;
        zzaja.zza((Class<zzsg>) zzsg.class, zzsgVar);
    }

    private zzsg() {
    }

    public static zza zza() {
        return zzc.zzl();
    }

    public final zzsk zzc() {
        zzsk zzskVar = this.zzf;
        if (zzskVar == null) {
            return zzsk.zzd();
        }
        return zzskVar;
    }

    public final zzuf zzd() {
        zzuf zzufVar = this.zzg;
        if (zzufVar == null) {
            return zzuf.zze();
        }
        return zzufVar;
    }

    public static zzsg zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzsg) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsf zzsfVar = null;
        switch (zzsf.zza[i10 - 1]) {
            case 1:
                return new zzsg();
            case 2:
                return new zza(zzsfVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsg> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzsg.class) {
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
    public final void zza(zzsk zzskVar) {
        zzskVar.getClass();
        this.zzf = zzskVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuf zzufVar) {
        zzufVar.getClass();
        this.zzg = zzufVar;
        this.zze |= 2;
    }
}
