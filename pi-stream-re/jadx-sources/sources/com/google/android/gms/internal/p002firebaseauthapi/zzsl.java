package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzsl extends zzaja<zzsl, zza> implements zzakm {
    private static final zzsl zzc;
    private static volatile zzakx<zzsl> zzd;
    private int zze;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzsl, zza> implements zzakm {
        private zza() {
            super(zzsl.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzsl) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsm zzsmVar) {
            this();
        }
    }

    static {
        zzsl zzslVar = new zzsl();
        zzc = zzslVar;
        zzaja.zza((Class<zzsl>) zzsl.class, zzslVar);
    }

    private zzsl() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzsl zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsm zzsmVar = null;
        switch (zzsm.zza[i10 - 1]) {
            case 1:
                return new zzsl();
            case 2:
                return new zza(zzsmVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsl> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzsl.class) {
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
