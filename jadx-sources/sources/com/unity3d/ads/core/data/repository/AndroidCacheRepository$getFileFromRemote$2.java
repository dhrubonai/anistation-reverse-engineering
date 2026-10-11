package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.tl7;
import defpackage.ub2;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.yq0;
import defpackage.ze0;
import defpackage.zq0;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2", f = "AndroidCacheRepository.kt", l = {120, 124}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidCacheRepository$getFileFromRemote$2 extends t36 implements ic2 {
    final /* synthetic */ File $cacheDirectory;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2$1", f = "AndroidCacheRepository.kt", l = {121}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ub2 {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ yq0 $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, yq0 yq0Var, vz0 vz0Var) {
            super(1, vz0Var);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$fileResult = yq0Var;
        }

        @Override // defpackage.h30
        public final vz0 create(vz0 vz0Var) {
            return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$fileResult, vz0Var);
        }

        @Override // defpackage.ub2
        public final Object invoke(vz0 vz0Var) {
            return ((AnonymousClass1) create(vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            CacheDataSource cacheDataSource;
            AnonymousClass1 anonymousClass1;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    m37.N(obj);
                    anonymousClass1 = this;
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                cacheDataSource = this.this$0.remoteCacheDataSource;
                File file = this.$cacheDirectory;
                String str = this.$filename;
                String str2 = this.$url;
                Integer num = new Integer(0);
                this.label = 1;
                anonymousClass1 = this;
                obj = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, file, str, str2, num, 0, null, anonymousClass1, 48, null);
                w11 w11Var = w11.x;
                if (obj == w11Var) {
                    return w11Var;
                }
            }
            ((zq0) anonymousClass1.$fileResult).Q((CacheResult) obj);
            return pn6.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getFileFromRemote$2(AndroidCacheRepository androidCacheRepository, String str, File file, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidCacheRepository$getFileFromRemote$2(this.this$0, this.$url, this.$cacheDirectory, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidCacheRepository$getFileFromRemote$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        DownloadPriorityQueue downloadPriorityQueue;
        yq0 yq0Var;
        int i = this.label;
        w11 w11Var = w11.x;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    m37.N(obj);
                    return obj;
                }
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yq0Var = (yq0) this.L$0;
            m37.N(obj);
        } else {
            m37.N(obj);
            String filename = this.this$0.getFilename(this.$url);
            zq0 c = tl7.c();
            downloadPriorityQueue = this.this$0.downloadPriorityQueue;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$cacheDirectory, filename, this.$url, c, null);
            this.L$0 = c;
            this.label = 1;
            if (downloadPriorityQueue.invoke(0, anonymousClass1, this) != w11Var) {
                yq0Var = c;
            }
            return w11Var;
        }
        this.L$0 = null;
        this.label = 2;
        Object o = ((zq0) yq0Var).o(this);
        if (o == w11Var) {
            return w11Var;
        }
        return o;
    }
}
