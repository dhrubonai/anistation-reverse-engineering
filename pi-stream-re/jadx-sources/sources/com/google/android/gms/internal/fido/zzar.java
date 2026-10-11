package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
final class zzar extends zzao {
    private final zzat zza;

    public zzar(zzat zzatVar, int i10) {
        super(zzatVar.size(), i10);
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.internal.fido.zzao
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
