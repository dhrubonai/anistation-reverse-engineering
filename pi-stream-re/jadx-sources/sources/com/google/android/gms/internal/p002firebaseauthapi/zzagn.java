package com.google.android.gms.internal.p002firebaseauthapi;

import i5.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzagn {
    private final int zza;
    private List<String> zzb;

    public zzagn() {
        this(null);
    }

    public static zzagn zza() {
        return new zzagn(null);
    }

    public final List<String> zzb() {
        return this.zzb;
    }

    private zzagn(List<String> list) {
        this.zza = 1;
        this.zzb = new ArrayList();
    }

    public zzagn(int i10, List<String> list) {
        this.zza = 1;
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, b.a(list.get(i11)));
            }
            this.zzb = Collections.unmodifiableList(list);
            return;
        }
        this.zzb = Collections.emptyList();
    }
}
