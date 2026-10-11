package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzti extends zzaja<zzti, zza> implements zzakm {
    private static final zzti zzc;
    private static volatile zzakx<zzti> zzd;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzti, zza> implements zzakm {
        private zza() {
            super(zzti.zzc);
        }

        public /* synthetic */ zza(zzth zzthVar) {
            this();
        }
    }

    static {
        zzti zztiVar = new zzti();
        zzc = zztiVar;
        zzaja.zza((Class<zzti>) zzti.class, zztiVar);
    }

    private zzti() {
    }

    public static zzti zzb() {
        return zzc;
    }

    public static zzti zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzti) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzth zzthVar = null;
        switch (zzth.zza[i10 - 1]) {
            case 1:
                return new zzti();
            case 2:
                return new zza(zzthVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzakx<zzti> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzti.class) {
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
