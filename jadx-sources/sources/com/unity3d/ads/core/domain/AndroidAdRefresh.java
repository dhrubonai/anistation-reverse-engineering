package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.repository.AdRepository;
import defpackage.db;
import defpackage.iv;
import defpackage.k52;
import defpackage.ke0;
import defpackage.ms;
import defpackage.pn6;
import defpackage.q71;
import defpackage.r11;
import defpackage.t44;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.xz0;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidAdRefresh implements AdRefresh {
    private static final Companion Companion = new Companion(null);
    private static final Set<AdObjectState> NON_UPDATABLE_STATES = ms.U0(new AdObjectState[]{AdObjectState.SHOWING, AdObjectState.COMPLETED, AdObjectState.EXPIRED});
    private final AdRepository adRepository;
    private final CacheAssets cacheAssets;
    private final Refresh refresh;

    public AndroidAdRefresh(AdRepository adRepository, CacheAssets cacheAssets, Refresh refresh) {
        adRepository.getClass();
        cacheAssets.getClass();
        refresh.getClass();
        this.adRepository = adRepository;
        this.cacheAssets = cacheAssets;
        this.refresh = refresh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUpdateRefreshData(AdObjectState adObjectState) {
        return !NON_UPDATABLE_STATES.contains(adObjectState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performRefresh(com.google.protobuf.ByteString r14, defpackage.vz0 r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidAdRefresh.performRefresh(com.google.protobuf.ByteString, vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.domain.AdRefresh
    public Object invoke(AdObject adObject, vz0 vz0Var) {
        ke0 b = db.b(adObject.getAdScope().getCoroutineContext().plus(new r11("Ad_Refresh")));
        final t44 broadcastEventChannel = AdPlayer.Companion.getBroadcastEventChannel();
        final String str = "AD_REFRESH";
        iv.G(new k52(new w42() { // from class: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;
                final /* synthetic */ String receiver$inlined;

                @w51(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2", f = "AndroidAdRefresh.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(vz0 vz0Var) {
                        super(vz0Var);
                    }

                    @Override // defpackage.h30
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(x42 x42Var, String str) {
                    this.$this_unsafeFlow = x42Var;
                    this.receiver$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.vz0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L44
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r6 = r4.$this_unsafeFlow
                        java.lang.String r4 = r4.receiver$inlined
                        boolean r4 = r4.equals(r5)
                        if (r4 == 0) goto L44
                        r0.label = r2
                        java.lang.Object r4 = r6.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L44
                        return r5
                    L44:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                }
            }

            @Override // defpackage.w42
            public Object collect(x42 x42Var, vz0 vz0Var2) {
                Object collect = w42.this.collect(new AnonymousClass2(x42Var, str), vz0Var2);
                if (collect == w11.x) {
                    return collect;
                }
                return pn6.a;
            }
        }, new AndroidAdRefresh$invoke$3(b, adObject, this, null), (byte) 2), b);
        return pn6.a;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final Set<AdObjectState> getNON_UPDATABLE_STATES() {
            return AndroidAdRefresh.NON_UPDATABLE_STATES;
        }

        private Companion() {
        }
    }
}
