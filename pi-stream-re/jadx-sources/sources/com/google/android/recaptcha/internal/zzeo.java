package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import o7.f;
import w6.b;

/* loaded from: classes.dex */
public final class zzeo implements zzen {
    private final Context zzb;
    private final Map zzc = f.g1(new b(2, "activity"), new b(3, "phone"), new b(4, "input_method"), new b(5, "audio"));

    public zzeo(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final Object zza(Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            Object obj2 = this.zzc.get(Integer.valueOf(num.intValue()));
            if (obj2 != null) {
                return this.zzb.getSystemService((String) obj2);
            }
            throw new zzae(4, 4, null);
        }
        throw new zzae(4, 5, null);
    }
}
