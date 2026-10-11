package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzpq extends zzit implements zzkf {
    private static final zzpq zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzpq zzpqVar = new zzpq();
        zzb = zzpqVar;
        zzit.zzD(zzpq.class, zzpqVar);
    }

    private zzpq() {
    }

    public final long zzH() {
        if (this.zzd == 8) {
            return ((Long) this.zze).longValue();
        }
        return 0L;
    }

    public final zzgw zzI() {
        if (this.zzd == 3) {
            return (zzgw) this.zze;
        }
        return zzgw.zzb;
    }

    public final String zzK() {
        if (this.zzd == 4) {
            return (String) this.zze;
        }
        return "";
    }

    public final String zzL() {
        if (this.zzd == 12) {
            return (String) this.zze;
        }
        return "";
    }

    public final boolean zzM() {
        if (this.zzd == 2) {
            return ((Boolean) this.zze).booleanValue();
        }
        return false;
    }

    public final boolean zzN() {
        return this.zzd == 1;
    }

    public final int zzO() {
        switch (this.zzd) {
            case 0:
                return 16;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case zzaja.zze.zzg /* 7 */:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }

    public final double zzf() {
        if (this.zzd == 11) {
            return ((Double) this.zze).doubleValue();
        }
        return 0.0d;
    }

    public final float zzg() {
        if (this.zzd == 10) {
            return ((Float) this.zze).floatValue();
        }
        return 0.0f;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzor zzorVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzpp(zzorVar);
                }
                return new zzpq();
            }
            return zzit.zzA(zzb, "\u0000\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001>\u0000\u0002:\u0000\u0003=\u0000\u0004Ȼ\u0000\u0005B\u0000\u0006B\u0000\u0007>\u0000\bC\u0000\t6\u0000\n4\u0000\u000b3\u0000\fȻ\u0000\r:\u0000\u000e?\u0000\u000f?\u0000", new Object[]{"zze", "zzd"});
        }
        return (byte) 1;
    }

    public final int zzi() {
        if (this.zzd == 1) {
            return ((Integer) this.zze).intValue();
        }
        return 0;
    }

    public final int zzj() {
        if (this.zzd == 5) {
            return ((Integer) this.zze).intValue();
        }
        return 0;
    }

    public final int zzk() {
        if (this.zzd == 6) {
            return ((Integer) this.zze).intValue();
        }
        return 0;
    }
}
