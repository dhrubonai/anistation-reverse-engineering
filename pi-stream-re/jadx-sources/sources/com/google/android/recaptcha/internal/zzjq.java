package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes.dex */
final class zzjq extends zzjs {
    public /* synthetic */ zzjq(zzjp zzjpVar) {
        super(null);
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final List zza(Object obj, long j4) {
        int i10;
        zzjb zzjbVar = (zzjb) zzlv.zzf(obj, j4);
        if (!zzjbVar.zzc()) {
            int size = zzjbVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzjb zzd = zzjbVar.zzd(i10);
            zzlv.zzs(obj, j4, zzd);
            return zzd;
        }
        return zzjbVar;
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzb(Object obj, long j4) {
        ((zzjb) zzlv.zzf(obj, j4)).zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzc(Object obj, Object obj2, long j4) {
        zzjb zzjbVar = (zzjb) zzlv.zzf(obj, j4);
        zzjb zzjbVar2 = (zzjb) zzlv.zzf(obj2, j4);
        int size = zzjbVar.size();
        int size2 = zzjbVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzjbVar.zzc()) {
                zzjbVar = zzjbVar.zzd(size2 + size);
            }
            zzjbVar.addAll(zzjbVar2);
        }
        if (size > 0) {
            zzjbVar2 = zzjbVar;
        }
        zzlv.zzs(obj, j4, zzjbVar2);
    }

    private zzjq() {
        super(null);
    }
}
