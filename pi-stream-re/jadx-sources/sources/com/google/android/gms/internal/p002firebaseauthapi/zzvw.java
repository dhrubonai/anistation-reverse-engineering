package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzvw extends zzaja<zzvw, zza> implements zzakm {
    private static final zzvw zzc;
    private static volatile zzakx<zzvw> zzd;
    private int zze;
    private zzahm zzf = zzahm.zza;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzvw, zza> implements zzakm {
        private zza() {
            super(zzvw.zzc);
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzvw) this.zza).zza(zzahmVar);
            return this;
        }

        public /* synthetic */ zza(zzvx zzvxVar) {
            this();
        }
    }

    static {
        zzvw zzvwVar = new zzvw();
        zzc = zzvwVar;
        zzaja.zza((Class<zzvw>) zzvw.class, zzvwVar);
    }

    private zzvw() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzakx<zzvw> zze() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzahm zzd() {
        return this.zzf;
    }

    public static zzvw zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzvw) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzvx zzvxVar = null;
        switch (zzvx.zza[i10 - 1]) {
            case 1:
                return new zzvw();
            case 2:
                return new zza(zzvxVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzvw> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzvw.class) {
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
