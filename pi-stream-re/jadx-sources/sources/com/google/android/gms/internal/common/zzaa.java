package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* loaded from: classes.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i10) {
    }

    public final zzaa zza(Object obj) {
        obj.getClass();
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = f.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr, i11);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        objArr2[i12] = obj;
        return this;
    }
}
