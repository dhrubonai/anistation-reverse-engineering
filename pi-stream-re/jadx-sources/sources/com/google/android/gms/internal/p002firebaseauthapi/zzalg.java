package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzalg extends zzalh {
    public zzalg(int i10) {
        super(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    public final void zza() {
        if (!zze()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                Map.Entry zzb = zzb(i10);
                if (((zzaiu) zzb.getKey()).zze()) {
                    zzb.setValue(Collections.unmodifiableList((List) zzb.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzaiu) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
