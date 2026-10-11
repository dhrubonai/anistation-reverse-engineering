package com.unity3d.ads;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import defpackage.ic2;
import defpackage.in;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.x44;
import defpackage.xz0;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.BannerAd$1$1", f = "BannerAd.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_DISCOVERY_STARTED_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BannerAd$1$1 extends t36 implements ic2 {
    int label;
    final /* synthetic */ BannerAd this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.unity3d.ads.BannerAd$1$1$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<T> implements x42 {
        final /* synthetic */ BannerAd this$0;

        public AnonymousClass2(BannerAd bannerAd) {
            this.this$0 = bannerAd;
        }

        public static final pn6 emit$lambda$0(BannerAd bannerAd) {
            AdExpiredListener<BannerAd> onAdExpired = bannerAd.getOnAdExpired();
            if (onAdExpired != null) {
                onAdExpired.onAdExpired(bannerAd);
            }
            return pn6.a;
        }

        @Override // defpackage.x42
        public final Object emit(AdObjectState adObjectState, vz0 vz0Var) {
            SafeCallbackInvoke safeCallbackInvoke;
            safeCallbackInvoke = this.this$0.safeCallbackInvoke;
            safeCallbackInvoke.invoke(new a(this.this$0, (byte) 0));
            return pn6.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAd$1$1(BannerAd bannerAd, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = bannerAd;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new BannerAd$1$1(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((BannerAd$1$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        AdObject adObject;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            adObject = this.this$0.adObject;
            final x44 state = adObject.getState();
            final AdObjectState adObjectState = AdObjectState.EXPIRED;
            in inVar = new in(new w42() { // from class: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1

                /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
                /* renamed from: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2<T> implements x42 {
                    final /* synthetic */ x42 $this_unsafeFlow;
                    final /* synthetic */ AdObjectState receiver$inlined;

                    @w51(c = "com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2", f = "BannerAd.kt", l = {50}, m = "emit")
                    /* renamed from: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(x42 x42Var, AdObjectState adObjectState) {
                        this.$this_unsafeFlow = x42Var;
                        this.receiver$inlined = adObjectState;
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
                            boolean r0 = r6 instanceof com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2$1
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
                            com.unity3d.ads.core.data.model.AdObjectState r4 = r4.receiver$inlined
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
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                    }
                }

                @Override // defpackage.w42
                public Object collect(x42 x42Var, vz0 vz0Var) {
                    Object collect = w42.this.collect(new AnonymousClass2(x42Var, adObjectState), vz0Var);
                    if (collect == w11.x) {
                        return collect;
                    }
                    return pn6.a;
                }
            }, (byte) 7);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            Object collect = inVar.collect(anonymousClass2, this);
            w11 w11Var = w11.x;
            if (collect == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
