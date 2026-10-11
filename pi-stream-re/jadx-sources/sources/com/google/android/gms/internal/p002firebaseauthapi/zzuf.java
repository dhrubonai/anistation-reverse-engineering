package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzuf extends zzaja<zzuf, zza> implements zzakm {
    private static final zzuf zzc;
    private static volatile zzakx<zzuf> zzd;
    private int zze;
    private zzui zzf;
    private int zzg;
    private int zzh;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzuf, zza> implements zzakm {
        private zza() {
            super(zzuf.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzuf) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzug zzugVar) {
            this();
        }

        public final zza zza(zzui zzuiVar) {
            zzh();
            ((zzuf) this.zza).zza(zzuiVar);
            return this;
        }
    }

    static {
        zzuf zzufVar = new zzuf();
        zzc = zzufVar;
        zzaja.zza((Class<zzuf>) zzuf.class, zzufVar);
    }

    private zzuf() {
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zzuf zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzh;
    }

    public final zzui zzf() {
        zzui zzuiVar = this.zzf;
        if (zzuiVar == null) {
            return zzui.zze();
        }
        return zzuiVar;
    }

    public static zzuf zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzuf) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzug zzugVar = null;
        switch (zzug.zza[i10 - 1]) {
            case 1:
                return new zzuf();
            case 2:
                return new zza(zzugVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzuf> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzuf.class) {
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
    public final void zza(int i10) {
        this.zzg = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzui zzuiVar) {
        zzuiVar.getClass();
        this.zzf = zzuiVar;
        this.zze |= 1;
    }
}
