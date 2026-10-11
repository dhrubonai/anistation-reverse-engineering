package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x6.i;
import x6.j;

/* loaded from: classes.dex */
public final class zzct implements zzdd {
    public static final zzct zza = new zzct();

    private zzct() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(j.o0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzpq) it.next()).zzN()));
        }
        if (!arrayList.contains(Boolean.FALSE)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzb(i.o1(zzpqVarArr))) {
            for (zzpq zzpqVar : zzpqVarArr) {
                zzcjVar.zzc().zzb(zzpqVar.zzi());
            }
            return;
        }
        throw new zzae(4, 5, null);
    }
}
