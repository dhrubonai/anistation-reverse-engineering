package com.unity3d.ads.core.domain.billing;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {
    private final ProductDetailsFetcher primaryFetcher;
    private final ProductDetailsFetcher secondaryFetcher;

    public ProductDetailsFetcherWithFallback(ProductDetailsFetcher productDetailsFetcher, ProductDetailsFetcher productDetailsFetcher2) {
        productDetailsFetcher.getClass();
        productDetailsFetcher2.getClass();
        this.primaryFetcher = productDetailsFetcher;
        this.secondaryFetcher = productDetailsFetcher2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        if (r10 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchProductDetails(java.lang.String r9, defpackage.vz0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 r0 = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 r0 = new com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L44
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r8 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r8
            defpackage.m37.N(r10)
            goto L81
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r2
        L38:
            defpackage.m37.N(r10)
            return r10
        L3c:
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            defpackage.m37.N(r10)
            goto L54
        L44:
            defpackage.m37.N(r10)
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r10 = r8.primaryFetcher
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r10 = r10.fetchProductDetails(r9, r0)
            if (r10 != r6) goto L54
            goto L7d
        L54:
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r10 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r10
            boolean r1 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success
            if (r1 == 0) goto L5b
            return r10
        L5b:
            boolean r1 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.NotFound
            if (r1 == 0) goto L6d
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r8 = r8.secondaryFetcher
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r8.fetchProductDetails(r9, r0)
            if (r8 != r6) goto L6c
            goto L7d
        L6c:
            return r8
        L6d:
            boolean r1 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure
            if (r1 == 0) goto L89
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r8 = r8.secondaryFetcher
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r8 = r8.fetchProductDetails(r9, r0)
            if (r8 != r6) goto L7e
        L7d:
            return r6
        L7e:
            r7 = r10
            r10 = r8
            r8 = r7
        L81:
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r10 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r10
            boolean r9 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success
            if (r9 == 0) goto L88
            return r10
        L88:
            return r8
        L89:
            defpackage.ze0.l()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.fetchProductDetails(java.lang.String, vz0):java.lang.Object");
    }
}
