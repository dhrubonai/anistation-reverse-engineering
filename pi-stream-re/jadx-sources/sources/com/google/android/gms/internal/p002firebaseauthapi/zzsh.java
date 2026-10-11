package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzsh extends zzaja<zzsh, zza> implements zzakm {
    private static final zzsh zzc;
    private static volatile zzakx<zzsh> zzd;
    private int zze;
    private int zzf;
    private zzsl zzg;
    private zzahm zzh = zzahm.zza;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzsh, zza> implements zzakm {
        private zza() {
            super(zzsh.zzc);
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzsh) this.zza).zza(zzahmVar);
            return this;
        }

        public /* synthetic */ zza(zzsi zzsiVar) {
            this();
        }

        public final zza zza(zzsl zzslVar) {
            zzh();
            ((zzsh) this.zza).zza(zzslVar);
            return this;
        }
    }

    static {
        zzsh zzshVar = new zzsh();
        zzc = zzshVar;
        zzaja.zza((Class<zzsh>) zzsh.class, zzshVar);
    }

    private zzsh() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzsh zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsl zze() {
        zzsl zzslVar = this.zzg;
        if (zzslVar == null) {
            return zzsl.zzd();
        }
        return zzslVar;
    }

    public final zzahm zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsi zzsiVar = null;
        switch (zzsi.zza[i10 - 1]) {
            case 1:
                return new zzsh();
            case 2:
                return new zza(zzsiVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsh> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzsh.class) {
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
    public final void zza(zzsl zzslVar) {
        zzslVar.getClass();
        this.zzg = zzslVar;
        this.zze |= 1;
    }
}
