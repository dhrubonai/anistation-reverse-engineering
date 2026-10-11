package com.unity3d.ads.core.data.repository;

import defpackage.ic2;
import defpackage.jc2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.ub2;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.yq0;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {91, 98, 111}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidCacheRepository$getFileInternal$2 extends t36 implements ic2 {
    final /* synthetic */ File $cacheDirectory;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ jc2 $onProgress;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {100, 107}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ub2 {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ yq0 $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ int $intervalMs;
        final /* synthetic */ jc2 $onProgress;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i, yq0 yq0Var, int i2, jc2 jc2Var, vz0 vz0Var) {
            super(1, vz0Var);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$priority = i;
            this.$fileResult = yq0Var;
            this.$intervalMs = i2;
            this.$onProgress = jc2Var;
        }

        @Override // defpackage.h30
        public final vz0 create(vz0 vz0Var) {
            return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, this.$intervalMs, this.$onProgress, vz0Var);
        }

        @Override // defpackage.ub2
        public final Object invoke(vz0 vz0Var) {
            return ((AnonymousClass1) create(vz0Var)).invokeSuspend(pn6.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
        
            if (r0 == r12) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            return r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        
            if (r0 == r12) goto L19;
         */
        @Override // defpackage.h30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                int r0 = r13.label
                pn6 r10 = defpackage.pn6.a
                r11 = 2
                r1 = 1
                w11 r12 = defpackage.w11.x
                if (r0 == 0) goto L1f
                if (r0 == r1) goto L1a
                if (r0 != r11) goto L13
                defpackage.m37.N(r14)
                r0 = r14
                goto L78
            L13:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ze0.m(r0)
                r0 = 0
                return r0
            L1a:
                defpackage.m37.N(r14)
                r0 = r14
                goto L48
            L1f:
                defpackage.m37.N(r14)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r13.this$0
                com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
                java.io.File r2 = r13.$cacheDirectory
                r3 = r2
                java.lang.String r2 = r13.$filename
                r4 = r3
                java.lang.String r3 = r13.$url
                int r5 = r13.$priority
                r6 = r4
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r5)
                r13.label = r1
                r5 = 0
                r1 = r6
                r6 = 0
                r8 = 48
                r9 = 0
                r7 = r13
                java.lang.Object r0 = com.unity3d.ads.core.data.datasource.CacheDataSource.DefaultImpls.getFile$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r0 != r12) goto L48
                goto L77
            L48:
                com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r1 == 0) goto L56
                yq0 r1 = r13.$fileResult
                zq0 r1 = (defpackage.zq0) r1
                r1.Q(r0)
                return r10
            L56:
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r13.this$0
                com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getRemoteCacheDataSource$p(r0)
                java.io.File r1 = r13.$cacheDirectory
                java.lang.String r2 = r13.$filename
                java.lang.String r3 = r13.$url
                int r4 = r13.$priority
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r4)
                r4 = r5
                int r5 = r13.$intervalMs
                jc2 r6 = r13.$onProgress
                r13.label = r11
                r7 = r13
                java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r12) goto L78
            L77:
                return r12
            L78:
                com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                yq0 r1 = r13.$fileResult
                zq0 r1 = (defpackage.zq0) r1
                r1.Q(r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getFileInternal$2(AndroidCacheRepository androidCacheRepository, String str, File file, int i, int i2, jc2 jc2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
        this.$priority = i;
        this.$intervalMs = i2;
        this.$onProgress = jc2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidCacheRepository$getFileInternal$2(this.this$0, this.$url, this.$cacheDirectory, this.$priority, this.$intervalMs, this.$onProgress, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidCacheRepository$getFileInternal$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad A[RETURN] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r7 = r24
            int r0 = r7.label
            r10 = 3
            r11 = 2
            r12 = 0
            r1 = 1
            w11 r13 = defpackage.w11.x
            if (r0 == 0) goto L31
            if (r0 == r1) goto L25
            if (r0 == r11) goto L1c
            if (r0 != r10) goto L16
            defpackage.m37.N(r25)
            return r25
        L16:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r12
        L1c:
            java.lang.Object r0 = r7.L$0
            yq0 r0 = (defpackage.yq0) r0
            defpackage.m37.N(r25)
            goto La0
        L25:
            java.lang.Object r0 = r7.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.m37.N(r25)
            r17 = r0
            r0 = r25
            goto L62
        L31:
            defpackage.m37.N(r25)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r7.this$0
            java.lang.String r2 = r7.$url
            java.lang.String r2 = r0.getFilename(r2)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r7.this$0
            com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
            java.io.File r3 = r7.$cacheDirectory
            r4 = r3
            java.lang.String r3 = r7.$url
            int r5 = r7.$priority
            r6 = r4
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            r7.L$0 = r2
            r7.label = r1
            r5 = 0
            r1 = r6
            r6 = 0
            r8 = 48
            r9 = 0
            java.lang.Object r0 = com.unity3d.ads.core.data.datasource.CacheDataSource.DefaultImpls.getFile$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r13) goto L60
            goto Lac
        L60:
            r17 = r2
        L62:
            com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            if (r1 == 0) goto L69
            return r0
        L69:
            zq0 r20 = defpackage.tl7.c()
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r7.this$0
            com.unity3d.ads.core.domain.work.DownloadPriorityQueue r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getDownloadPriorityQueue$p(r0)
            int r1 = r7.$priority
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1 r14 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r15 = r7.this$0
            java.io.File r2 = r7.$cacheDirectory
            java.lang.String r3 = r7.$url
            int r4 = r7.$intervalMs
            jc2 r5 = r7.$onProgress
            r23 = 0
            r19 = r1
            r16 = r2
            r18 = r3
            r21 = r4
            r22 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r19
            r1 = r20
            r7.L$0 = r1
            r7.label = r11
            java.lang.Object r0 = r0.invoke(r2, r14, r7)
            if (r0 != r13) goto L9f
            goto Lac
        L9f:
            r0 = r1
        La0:
            r7.L$0 = r12
            r7.label = r10
            zq0 r0 = (defpackage.zq0) r0
            java.lang.Object r0 = r0.o(r7)
            if (r0 != r13) goto Lad
        Lac:
            return r13
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
