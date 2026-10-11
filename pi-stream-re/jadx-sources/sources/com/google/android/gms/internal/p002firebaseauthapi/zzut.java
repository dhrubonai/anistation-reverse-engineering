package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzut extends zzaja<zzut, zza> implements zzakm {
    private static final zzut zzc;
    private static volatile zzakx<zzut> zzd;
    private int zze;
    private int zzf;
    private zzuw zzg;
    private zzahm zzh = zzahm.zza;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzut, zza> implements zzakm {
        private zza() {
            super(zzut.zzc);
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzut) this.zza).zza(zzahmVar);
            return this;
        }

        public /* synthetic */ zza(zzuu zzuuVar) {
            this();
        }

        public final zza zza(zzuw zzuwVar) {
            zzh();
            ((zzut) this.zza).zza(zzuwVar);
            return this;
        }

        public final zza zza(int i10) {
            zzh();
            ((zzut) this.zza).zza(0);
            return this;
        }
    }

    static {
        zzut zzutVar = new zzut();
        zzc = zzutVar;
        zzaja.zza((Class<zzut>) zzut.class, zzutVar);
    }

    private zzut() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzuw zzd() {
        zzuw zzuwVar = this.zzg;
        if (zzuwVar == null) {
            return zzuw.zze();
        }
        return zzuwVar;
    }

    public final zzahm zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public static zzut zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzut) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzuu zzuuVar = null;
        switch (zzuu.zza[i10 - 1]) {
            case 1:
                return new zzut();
            case 2:
                return new zza(zzuuVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzut> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzut.class) {
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
    public final void zza(zzuw zzuwVar) {
        zzuwVar.getClass();
        this.zzg = zzuwVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
