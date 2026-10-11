package com.google.android.recaptcha.internal;

import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class zzol extends zzit implements zzkf {
    private static final zzol zzb;
    private int zzd;
    private long zzf;
    private int zzg;
    private String zze = "";
    private zzjb zzh = zzit.zzx();

    static {
        zzol zzolVar = new zzol();
        zzb = zzolVar;
        zzit.zzD(zzol.class, zzolVar);
    }

    private zzol() {
    }

    public static zzol zzg(InputStream inputStream) {
        return (zzol) zzit.zzt(zzb, inputStream);
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzok(null);
                }
                return new zzol();
            }
            return zzit.zzA(zzb, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzon.class});
        }
        return (byte) 1;
    }

    public final String zzi() {
        return this.zze;
    }

    public final List zzj() {
        return this.zzh;
    }
}
