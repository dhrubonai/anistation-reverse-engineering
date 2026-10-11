package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public class zzan<E> {
    public static int zza(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return f.API_PRIORITY_OTHER;
            }
            return i12;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
