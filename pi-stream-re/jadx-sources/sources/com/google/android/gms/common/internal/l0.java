package com.google.android.gms.common.internal;

/* loaded from: classes.dex */
public final class l0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f2554g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(f fVar, int i10) {
        super(fVar, i10, null);
        this.f2554g = fVar;
    }

    @Override // com.google.android.gms.common.internal.d0
    public final void b(b5.a aVar) {
        f fVar = this.f2554g;
        if (fVar.enableLocalFallback() && f.zzo(fVar)) {
            f.zzk(fVar, 16);
        } else {
            fVar.zzc.b(aVar);
            fVar.onConnectionFailed(aVar);
        }
    }

    @Override // com.google.android.gms.common.internal.d0
    public final boolean c() {
        this.f2554g.zzc.b(b5.a.f1505e);
        return true;
    }
}
