package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzvi extends zzaja<zzvi, zza> implements zzakm {
    private static final zzvi zzc;
    private static volatile zzakx<zzvi> zzd;
    private int zze;
    private zzajg<zzb> zzf = zzaja.zzo();

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzvi, zza> implements zzakm {
        private zza() {
            super(zzvi.zzc);
        }

        public final zza zza(zzb zzbVar) {
            zzh();
            ((zzvi) this.zza).zza(zzbVar);
            return this;
        }

        public /* synthetic */ zza(zzvj zzvjVar) {
            this();
        }

        public final zza zza(int i10) {
            zzh();
            ((zzvi) this.zza).zzc(i10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class zzb extends zzaja<zzb, zza> implements zzakm {
        private static final zzb zzc;
        private static volatile zzakx<zzb> zzd;
        private String zze = "";
        private int zzf;
        private int zzg;
        private int zzh;

        /* loaded from: classes.dex */
        public static final class zza extends zzaja.zzb<zzb, zza> implements zzakm {
            private zza() {
                super(zzb.zzc);
            }

            public final zza zza(int i10) {
                zzh();
                ((zzb) this.zza).zza(i10);
                return this;
            }

            public /* synthetic */ zza(zzvj zzvjVar) {
                this();
            }

            public final zza zza(zzvt zzvtVar) {
                zzh();
                ((zzb) this.zza).zza(zzvtVar);
                return this;
            }

            public final zza zza(zzvb zzvbVar) {
                zzh();
                ((zzb) this.zza).zza(zzvbVar);
                return this;
            }

            public final zza zza(String str) {
                zzh();
                ((zzb) this.zza).zza(str);
                return this;
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzaja.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zzb() {
            return zzc.zzl();
        }

        public final int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
        public final Object zza(int i10, Object obj, Object obj2) {
            zzvj zzvjVar = null;
            switch (zzvj.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzvjVar);
                case 3:
                    return zzaja.zza(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzakx<zzb> zzakxVar = zzd;
                    if (zzakxVar == null) {
                        synchronized (zzb.class) {
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
        public final void zza(zzvt zzvtVar) {
            this.zzh = zzvtVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzvb zzvbVar) {
            this.zzf = zzvbVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze = str;
        }
    }

    static {
        zzvi zzviVar = new zzvi();
        zzc = zzviVar;
        zzaja.zza((Class<zzvi>) zzvi.class, zzviVar);
    }

    private zzvi() {
    }

    public static zza zza() {
        return zzc.zzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(int i10) {
        this.zze = i10;
    }

    public final zzb zza(int i10) {
        return this.zzf.get(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzvj zzvjVar = null;
        switch (zzvj.zza[i10 - 1]) {
            case 1:
                return new zzvi();
            case 2:
                return new zza(zzvjVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzb.class});
            case 4:
                return zzc;
            case 5:
                zzakx<zzvi> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzvi.class) {
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
    public final void zza(zzb zzbVar) {
        zzbVar.getClass();
        zzajg<zzb> zzajgVar = this.zzf;
        if (!zzajgVar.zzc()) {
            this.zzf = zzaja.zza(zzajgVar);
        }
        this.zzf.add(zzbVar);
    }
}
