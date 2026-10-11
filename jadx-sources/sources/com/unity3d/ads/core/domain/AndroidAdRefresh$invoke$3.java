package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ic2;
import defpackage.lg5;
import defpackage.m37;
import defpackage.ng5;
import defpackage.oc1;
import defpackage.pn6;
import defpackage.qs;
import defpackage.t36;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidAdRefresh$invoke$3 extends t36 implements ic2 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ v11 $refreshScope;
    int label;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1", f = "AndroidAdRefresh.kt", l = {126}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        final /* synthetic */ AdObject $adObject;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidAdRefresh this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, AndroidAdRefresh androidAdRefresh, vz0 vz0Var) {
            super(2, vz0Var);
            this.$adObject = adObject;
            this.this$0 = androidAdRefresh;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, vz0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ic2
        public final Object invoke(v11 v11Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            Object d;
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
                v11 v11Var = (v11) this.L$0;
                oc1 i2 = tl7.i(v11Var, null, new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, null), 3);
                oc1 i3 = tl7.i(v11Var, null, new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, null), 3);
                AdObject adObject = this.$adObject;
                ng5 ng5Var = new ng5(getContext());
                ng5Var.f(i2.F(), new AndroidAdRefresh$invoke$3$1$1$1(i3, adObject, null));
                ng5Var.f(i3.F(), new AndroidAdRefresh$invoke$3$1$1$2(i2, null));
                this.label = 1;
                if (qs.a.getObjectVolatile(ng5Var, ng5.C) instanceof lg5) {
                    d = ng5Var.c(this);
                } else {
                    d = ng5Var.d(this);
                }
                w11 w11Var = w11.x;
                if (d == w11Var) {
                    return w11Var;
                }
            }
            return pn6.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3(v11 v11Var, AdObject adObject, AndroidAdRefresh androidAdRefresh, vz0 vz0Var) {
        super(2, vz0Var);
        this.$refreshScope = v11Var;
        this.$adObject = adObject;
        this.this$0 = androidAdRefresh;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidAdRefresh$invoke$3(this.$refreshScope, this.$adObject, this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(String str, vz0 vz0Var) {
        return ((AndroidAdRefresh$invoke$3) create(str, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            tl7.z(this.$refreshScope, null, null, new AnonymousClass1(this.$adObject, this.this$0, null), 3);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
