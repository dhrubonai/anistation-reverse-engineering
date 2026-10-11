package com.unity3d.ads.core.data.repository;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {144}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidCacheRepository$clearCache$2 extends t36 implements ic2 {
    long J$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$clearCache$2(AndroidCacheRepository androidCacheRepository, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidCacheRepository;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidCacheRepository$clearCache$2(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidCacheRepository$clearCache$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x018d A[Catch: Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:37:0x0148, B:40:0x0159, B:25:0x0198, B:19:0x0181, B:21:0x018d, B:23:0x0190), top: B:36:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
