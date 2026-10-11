package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class zzfm implements Iterable {
    private final zzfe zza = zzfe.zza();

    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z9 = true;
        while (it.hasNext()) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(it.next());
            z9 = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
