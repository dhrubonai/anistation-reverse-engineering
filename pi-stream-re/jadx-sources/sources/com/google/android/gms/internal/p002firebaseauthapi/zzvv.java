package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

@Deprecated
/* loaded from: classes.dex */
public final class zzvv extends zzaja<zzvv, zza> implements zzakm {
    private static final zzvv zzc;
    private static volatile zzakx<zzvv> zzd;
    private String zze = "";
    private zzajg<zzve> zzf = zzaja.zzo();

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzvv, zza> implements zzakm {
        private zza() {
            super(zzvv.zzc);
        }

        public /* synthetic */ zza(zzvu zzvuVar) {
            this();
        }
    }

    static {
        zzvv zzvvVar = new zzvv();
        zzc = zzvvVar;
        zzaja.zza((Class<zzvv>) zzvv.class, zzvvVar);
    }

    private zzvv() {
    }

    public static zzvv zzb() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzvu zzvuVar = null;
        switch (zzvu.zza[i10 - 1]) {
            case 1:
                return new zzvv();
            case 2:
                return new zza(zzvuVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzve.class});
            case 4:
                return zzc;
            case 5:
                zzakx<zzvv> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzvv.class) {
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
}
