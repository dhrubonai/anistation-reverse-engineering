package com.unity3d.ads.core.data.repository;

import defpackage.c32;
import defpackage.d32;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.u22;
import defpackage.ub2;
import defpackage.uc2;
import defpackage.v11;
import defpackage.v22;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidCacheRepository$getCacheSize$2 extends t36 implements ic2 {
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass1 extends uc2 implements ub2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, File.class, "isFile", "isFile()Z", 0);
        }

        @Override // defpackage.ub2
        public final Boolean invoke(File file) {
            file.getClass();
            return Boolean.valueOf(file.isFile());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getCacheSize$2(AndroidCacheRepository androidCacheRepository, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidCacheRepository;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidCacheRepository$getCacheSize$2(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidCacheRepository$getCacheSize$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        File cacheDir;
        if (this.label == 0) {
            m37.N(obj);
            cacheDir = this.this$0.getCacheDir();
            cacheDir.getClass();
            u22 u22Var = new u22(cacheDir, v22.x);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            anonymousClass1.getClass();
            c32 c32Var = new c32(new d32(u22Var, true, anonymousClass1));
            long j = 0;
            while (c32Var.hasNext()) {
                j += ((File) c32Var.next()).length();
            }
            return new Long(j);
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
