package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zznu extends zzit implements zzkf {
    private static final zznu zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzib zzi;
    private zzlj zzj;
    private int zzk;
    private zzna zzl;
    private String zzg = "";
    private String zzh = "";
    private zzjb zzm = zzit.zzx();

    static {
        zznu zznuVar = new zznu();
        zzb = zznuVar;
        zzit.zzD(zznu.class, zznuVar);
    }

    private zznu() {
    }

    public static zznu zzg() {
        return zzb;
    }

    public static zznu zzi(byte[] bArr) {
        return (zznu) zzit.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzns zznsVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zznt(zznsVar);
                }
                return new zznu();
            }
            return zzit.zzA(zzb, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zzd", "zze", "zzi", "zzj", "zzk", "zzm", zznl.class, "zzf", "zzg", "zzh", "zzl"});
        }
        return (byte) 1;
    }
}
