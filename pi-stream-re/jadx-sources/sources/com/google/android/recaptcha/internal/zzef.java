package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import x6.i;
import x6.m;
import x6.o;

/* loaded from: classes.dex */
public final class zzef {
    private List zza = o.f11318a;

    public final long zza(long[] jArr) {
        Iterator it = m.s0(i.n1(jArr), this.zza).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
            }
            return ((Number) next).longValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final void zzb(long[] jArr) {
        this.zza = i.n1(jArr);
    }
}
