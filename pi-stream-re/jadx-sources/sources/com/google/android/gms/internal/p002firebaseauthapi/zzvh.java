package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzvh extends zzaja<zzvh, zzb> implements zzakm {
    private static final zzvh zzc;
    private static volatile zzakx<zzvh> zzd;
    private int zze;
    private zzajg<zza> zzf = zzaja.zzo();

    /* loaded from: classes.dex */
    public static final class zza extends zzaja<zza, C0000zza> implements zzakm {
        private static final zza zzc;
        private static volatile zzakx<zza> zzd;
        private int zze;
        private zzux zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvh$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0000zza extends zzaja.zzb<zza, C0000zza> implements zzakm {
            private C0000zza() {
                super(zza.zzc);
            }

            public final C0000zza zza(zzux zzuxVar) {
                zzh();
                ((zza) this.zza).zza(zzuxVar);
                return this;
            }

            public /* synthetic */ C0000zza(zzvg zzvgVar) {
                this();
            }

            public final C0000zza zza(int i10) {
                zzh();
                ((zza) this.zza).zza(i10);
                return this;
            }

            public final C0000zza zza(zzvt zzvtVar) {
                zzh();
                ((zza) this.zza).zza(zzvtVar);
                return this;
            }

            public final C0000zza zza(zzvb zzvbVar) {
                zzh();
                ((zza) this.zza).zza(zzvbVar);
                return this;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzaja.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static C0000zza zzd() {
            return zzc.zzl();
        }

        public final int zza() {
            return this.zzh;
        }

        public final zzux zzb() {
            zzux zzuxVar = this.zzf;
            if (zzuxVar == null) {
                return zzux.zzd();
            }
            return zzuxVar;
        }

        public final zzvb zzc() {
            zzvb zza = zzvb.zza(this.zzg);
            if (zza == null) {
                return zzvb.UNRECOGNIZED;
            }
            return zza;
        }

        public final zzvt zzf() {
            zzvt zza = zzvt.zza(this.zzi);
            if (zza == null) {
                return zzvt.UNRECOGNIZED;
            }
            return zza;
        }

        public final boolean zzg() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
        public final Object zza(int i10, Object obj, Object obj2) {
            zzvg zzvgVar = null;
            switch (zzvg.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0000zza(zzvgVar);
                case 3:
                    return zzaja.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzakx<zza> zzakxVar = zzd;
                    if (zzakxVar == null) {
                        synchronized (zza.class) {
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
        public final void zza(zzux zzuxVar) {
            zzuxVar.getClass();
            this.zzf = zzuxVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i10) {
            this.zzh = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzvt zzvtVar) {
            this.zzi = zzvtVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzvb zzvbVar) {
            this.zzg = zzvbVar.zza();
        }
    }

    /* loaded from: classes.dex */
    public static final class zzb extends zzaja.zzb<zzvh, zzb> implements zzakm {
        private zzb() {
            super(zzvh.zzc);
        }

        public final int zza() {
            return ((zzvh) this.zza).zza();
        }

        public final zza zzb(int i10) {
            return ((zzvh) this.zza).zza(i10);
        }

        public /* synthetic */ zzb(zzvg zzvgVar) {
            this();
        }

        public final zzb zza(zza zzaVar) {
            zzh();
            ((zzvh) this.zza).zza(zzaVar);
            return this;
        }

        public final List<zza> zzb() {
            return Collections.unmodifiableList(((zzvh) this.zza).zze());
        }

        public final zzb zza(int i10) {
            zzh();
            ((zzvh) this.zza).zzc(i10);
            return this;
        }
    }

    static {
        zzvh zzvhVar = new zzvh();
        zzc = zzvhVar;
        zzaja.zza((Class<zzvh>) zzvh.class, zzvhVar);
    }

    private zzvh() {
    }

    public static zzb zzc() {
        return zzc.zzl();
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final List<zza> zze() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(int i10) {
        this.zze = i10;
    }

    public final zza zza(int i10) {
        return this.zzf.get(i10);
    }

    public static zzvh zza(InputStream inputStream, zzaip zzaipVar) {
        return (zzvh) zzaja.zza(zzc, inputStream, zzaipVar);
    }

    public static zzvh zza(byte[] bArr, zzaip zzaipVar) {
        return (zzvh) zzaja.zza(zzc, bArr, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzvg zzvgVar = null;
        switch (zzvg.zza[i10 - 1]) {
            case 1:
                return new zzvh();
            case 2:
                return new zzb(zzvgVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzakx<zzvh> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzvh.class) {
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
    public final void zza(zza zzaVar) {
        zzaVar.getClass();
        zzajg<zza> zzajgVar = this.zzf;
        if (!zzajgVar.zzc()) {
            this.zzf = zzaja.zza(zzajgVar);
        }
        this.zzf.add(zzaVar);
    }
}
