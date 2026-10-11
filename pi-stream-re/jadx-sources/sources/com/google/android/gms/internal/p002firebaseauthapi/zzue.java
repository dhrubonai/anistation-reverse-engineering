package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzue extends zzaja<zzue, zza> implements zzakm {
    private static final zzue zzc;
    private static volatile zzakx<zzue> zzd;
    private int zze;
    private int zzf;
    private zzui zzg;
    private zzahm zzh = zzahm.zza;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzue, zza> implements zzakm {
        private zza() {
            super(zzue.zzc);
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzue) this.zza).zza(zzahmVar);
            return this;
        }

        public /* synthetic */ zza(zzud zzudVar) {
            this();
        }

        public final zza zza(zzui zzuiVar) {
            zzh();
            ((zzue) this.zza).zza(zzuiVar);
            return this;
        }

        public final zza zza(int i10) {
            zzh();
            ((zzue) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzue zzueVar = new zzue();
        zzc = zzueVar;
        zzaja.zza((Class<zzue>) zzue.class, zzueVar);
    }

    private zzue() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzue zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzui zze() {
        zzui zzuiVar = this.zzg;
        if (zzuiVar == null) {
            return zzui.zze();
        }
        return zzuiVar;
    }

    public final zzahm zzf() {
        return this.zzh;
    }

    public static zzue zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzue) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzud zzudVar = null;
        switch (zzud.zza[i10 - 1]) {
            case 1:
                return new zzue();
            case 2:
                return new zza(zzudVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzue> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzue.class) {
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
        this.zzh = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzui zzuiVar) {
        zzuiVar.getClass();
        this.zzg = zzuiVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
