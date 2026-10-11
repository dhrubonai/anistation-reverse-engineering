package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzss extends zzaja<zzss, zza> implements zzakm {
    private static final zzss zzc;
    private static volatile zzakx<zzss> zzd;
    private int zze;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzss, zza> implements zzakm {
        private zza() {
            super(zzss.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzss) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsr zzsrVar) {
            this();
        }
    }

    static {
        zzss zzssVar = new zzss();
        zzc = zzssVar;
        zzaja.zza((Class<zzss>) zzss.class, zzssVar);
    }

    private zzss() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzss zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsr zzsrVar = null;
        switch (zzsr.zza[i10 - 1]) {
            case 1:
                return new zzss();
            case 2:
                return new zza(zzsrVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzss> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzss.class) {
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
