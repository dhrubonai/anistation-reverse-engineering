package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzsk extends zzaja<zzsk, zza> implements zzakm {
    private static final zzsk zzc;
    private static volatile zzakx<zzsk> zzd;
    private int zze;
    private zzsl zzf;
    private int zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzsk, zza> implements zzakm {
        private zza() {
            super(zzsk.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzsk) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsj zzsjVar) {
            this();
        }

        public final zza zza(zzsl zzslVar) {
            zzh();
            ((zzsk) this.zza).zza(zzslVar);
            return this;
        }
    }

    static {
        zzsk zzskVar = new zzsk();
        zzc = zzskVar;
        zzaja.zza((Class<zzsk>) zzsk.class, zzskVar);
    }

    private zzsk() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzsk zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzsl zze() {
        zzsl zzslVar = this.zzf;
        if (zzslVar == null) {
            return zzsl.zzd();
        }
        return zzslVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsj zzsjVar = null;
        switch (zzsj.zza[i10 - 1]) {
            case 1:
                return new zzsk();
            case 2:
                return new zza(zzsjVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsk> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzsk.class) {
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
    public final void zza(zzsl zzslVar) {
        zzslVar.getClass();
        this.zzf = zzslVar;
        this.zze |= 1;
    }
}
