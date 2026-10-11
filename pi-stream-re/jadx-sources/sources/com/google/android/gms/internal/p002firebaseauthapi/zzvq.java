package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzvq extends zzaja<zzvq, zza> implements zzakm {
    private static final zzvq zzc;
    private static volatile zzakx<zzvq> zzd;
    private int zze;
    private String zzf = "";
    private zzvd zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzvq, zza> implements zzakm {
        private zza() {
            super(zzvq.zzc);
        }

        public final zza zza(zzvd zzvdVar) {
            zzh();
            ((zzvq) this.zza).zza(zzvdVar);
            return this;
        }

        public /* synthetic */ zza(zzvr zzvrVar) {
            this();
        }

        public final zza zza(String str) {
            zzh();
            ((zzvq) this.zza).zza(str);
            return this;
        }
    }

    static {
        zzvq zzvqVar = new zzvq();
        zzc = zzvqVar;
        zzaja.zza((Class<zzvq>) zzvq.class, zzvqVar);
    }

    private zzvq() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzvq zzd() {
        return zzc;
    }

    public final zzvd zza() {
        zzvd zzvdVar = this.zzg;
        return zzvdVar == null ? zzvd.zzc() : zzvdVar;
    }

    public final String zze() {
        return this.zzf;
    }

    public static zzvq zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzvq) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzvr zzvrVar = null;
        switch (zzvr.zza[i10 - 1]) {
            case 1:
                return new zzvq();
            case 2:
                return new zza(zzvrVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzvq> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzvq.class) {
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
    public final void zza(zzvd zzvdVar) {
        zzvdVar.getClass();
        this.zzg = zzvdVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zzf = str;
    }
}
