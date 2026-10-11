package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzuw extends zzaja<zzuw, zza> implements zzakm {
    private static final zzuw zzc;
    private static volatile zzakx<zzuw> zzd;
    private int zze;
    private int zzf;
    private zzus zzg;
    private zzahm zzh = zzahm.zza;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzuw, zza> implements zzakm {
        private zza() {
            super(zzuw.zzc);
        }

        public final zza zza(zzus zzusVar) {
            zzh();
            ((zzuw) this.zza).zza(zzusVar);
            return this;
        }

        public /* synthetic */ zza(zzuv zzuvVar) {
            this();
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzuw) this.zza).zza(zzahmVar);
            return this;
        }

        public final zza zza(int i10) {
            zzh();
            ((zzuw) this.zza).zza(0);
            return this;
        }
    }

    static {
        zzuw zzuwVar = new zzuw();
        zzc = zzuwVar;
        zzaja.zza((Class<zzuw>) zzuw.class, zzuwVar);
    }

    private zzuw() {
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zzuw zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzus zzb() {
        zzus zzusVar = this.zzg;
        if (zzusVar == null) {
            return zzus.zzf();
        }
        return zzusVar;
    }

    public final zzahm zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public static zzuw zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzuw) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzuv zzuvVar = null;
        switch (zzuv.zza[i10 - 1]) {
            case 1:
                return new zzuw();
            case 2:
                return new zza(zzuvVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzuw> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzuw.class) {
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
    public final void zza(zzus zzusVar) {
        zzusVar.getClass();
        this.zzg = zzusVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzh = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
