package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes.dex */
public final class zzpn extends zzit implements zzkf {
    private static final zzpn zzb;
    private String zzd = "";
    private zziy zze = zzit.zzv();
    private zzja zzf = zzit.zzw();

    static {
        zzpn zzpnVar = new zzpn();
        zzb = zzpnVar;
        zzit.zzD(zzpn.class, zzpnVar);
    }

    private zzpn() {
    }

    public static zzpn zzg(byte[] bArr) {
        return (zzpn) zzit.zzu(zzb, bArr);
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
                    return new zzpm(zzorVar);
                }
                return new zzpn();
            }
            return zzit.zzA(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final List zzj() {
        return this.zzf;
    }
}
