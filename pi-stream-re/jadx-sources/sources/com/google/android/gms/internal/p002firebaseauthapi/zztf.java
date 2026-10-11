package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zztf extends zzaja<zztf, zza> implements zzakm {
    private static final zztf zzc;
    private static volatile zzakx<zztf> zzd;
    private int zze;
    private zzahm zzf = zzahm.zza;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zztf, zza> implements zzakm {
        private zza() {
            super(zztf.zzc);
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zztf) this.zza).zza(zzahmVar);
            return this;
        }

        public /* synthetic */ zza(zztg zztgVar) {
            this();
        }
    }

    static {
        zztf zztfVar = new zztf();
        zzc = zztfVar;
        zzaja.zza((Class<zztf>) zztf.class, zztfVar);
    }

    private zztf() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzakx<zztf> zze() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzahm zzd() {
        return this.zzf;
    }

    public static zztf zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zztf) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zztg zztgVar = null;
        switch (zztg.zza[i10 - 1]) {
            case 1:
                return new zztf();
            case 2:
                return new zza(zztgVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zztf> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zztf.class) {
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
        this.zzf = zzahmVar;
    }
}
