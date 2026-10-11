package com.google.android.recaptcha.internal;

import h7.p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import r6.h0;
import x6.o;

/* loaded from: classes.dex */
public final class zzcf extends zzce {
    private final p zza;
    private final String zzb;

    public zzcf(p pVar, String str, Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x6.o] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.recaptcha.internal.zzin, com.google.android.recaptcha.internal.zzpi] */
    @Override // com.google.android.recaptcha.internal.zzce
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        ?? r02;
        if (!h0.g(method.getName(), this.zzb)) {
            return false;
        }
        ?? zzf = zzpl.zzf();
        if (objArr != null) {
            r02 = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzpj zzf2 = zzpk.zzf();
                zzf2.zzv(obj2.toString());
                r02.add((zzpk) zzf2.zzj());
            }
        } else {
            r02 = o.f11318a;
        }
        zzf.zzd(r02);
        zzpl zzplVar = (zzpl) zzf.zzj();
        p pVar = this.zza;
        byte[] zzd = zzplVar.zzd();
        pVar.invoke(objArr, zzfy.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
