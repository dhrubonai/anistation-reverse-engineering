package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzta extends zzaja<zzta, zza> implements zzakm {
    private static final zzta zzc;
    private static volatile zzakx<zzta> zzd;
    private int zze;
    private int zzf;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzta, zza> implements zzakm {
        private zza() {
            super(zzta.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzta) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsz zzszVar) {
            this();
        }
    }

    static {
        zzta zztaVar = new zzta();
        zzc = zztaVar;
        zzaja.zza((Class<zzta>) zzta.class, zztaVar);
    }

    private zzta() {
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zzta zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzta) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsz zzszVar = null;
        switch (zzsz.zza[i10 - 1]) {
            case 1:
                return new zzta();
            case 2:
                return new zza(zzszVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzta> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzta.class) {
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
        this.zze = i10;
    }
}
