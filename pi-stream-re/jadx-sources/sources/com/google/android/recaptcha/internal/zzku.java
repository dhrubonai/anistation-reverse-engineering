package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzku extends zzle {
    public zzku(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                ((zzii) zzg(i10).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzii) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
