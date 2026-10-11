package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes.dex */
public final class zzpf extends zzit implements zzkf {
    private static final zzpf zzb;
    private zzjb zzd = zzit.zzx();

    static {
        zzpf zzpfVar = new zzpf();
        zzb = zzpfVar;
        zzit.zzD(zzpf.class, zzpfVar);
    }

    private zzpf() {
    }

    public static zzpf zzg(byte[] bArr) {
        return (zzpf) zzit.zzu(zzb, bArr);
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
                    return new zzpe(zzorVar);
                }
                return new zzpf();
            }
            return zzit.zzA(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzpr.class});
        }
        return (byte) 1;
    }

    public final List zzi() {
        return this.zzd;
    }
}
