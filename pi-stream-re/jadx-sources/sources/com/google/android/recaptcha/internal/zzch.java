package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import r6.h0;
import x6.i;
import x6.o;

/* loaded from: classes.dex */
public final class zzch extends zzce {
    private final zzcg zza;
    private final String zzb;

    public zzch(zzcg zzcgVar, String str, Object obj) {
        super(obj);
        this.zza = zzcgVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzce
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (h0.g(method.getName(), this.zzb)) {
            zzcg zzcgVar = this.zza;
            if (objArr != null) {
                list = i.g1(objArr);
            } else {
                list = o.f11318a;
            }
            zzcgVar.zzb(list);
            return true;
        }
        return false;
    }
}
