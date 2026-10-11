package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzid {
    private final Object zza;
    private final int zzb;

    public zzid(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzid)) {
            return false;
        }
        zzid zzidVar = (zzid) obj;
        if (this.zza != zzidVar.zza || this.zzb != zzidVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
