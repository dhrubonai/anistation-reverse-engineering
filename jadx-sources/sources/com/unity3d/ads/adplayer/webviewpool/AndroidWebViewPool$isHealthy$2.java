package com.unity3d.ads.adplayer.webviewpool;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.yq0;
import defpackage.ze0;
import defpackage.zq0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2", f = "AndroidWebViewPool.kt", l = {119, 124}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidWebViewPool$isHealthy$2 extends t36 implements ic2 {
    final /* synthetic */ PoolEntry $entry;
    Object L$0;
    int label;
    final /* synthetic */ AndroidWebViewPool this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2$1", f = "AndroidWebViewPool.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        final /* synthetic */ PoolEntry $entry;
        final /* synthetic */ yq0 $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PoolEntry poolEntry, yq0 yq0Var, vz0 vz0Var) {
            super(2, vz0Var);
            this.$entry = poolEntry;
            this.$result = yq0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(yq0 yq0Var, String str) {
            boolean z;
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            ((zq0) yq0Var).Q(Boolean.valueOf(z));
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            return new AnonymousClass1(this.$entry, this.$result, vz0Var);
        }

        @Override // defpackage.ic2
        public final Object invoke(v11 v11Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                m37.N(obj);
                WebView webView = this.$entry.getWebView();
                final yq0 yq0Var = this.$result;
                webView.evaluateJavascript(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, new ValueCallback() { // from class: com.unity3d.ads.adplayer.webviewpool.a
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        AndroidWebViewPool$isHealthy$2.AnonymousClass1.invokeSuspend$lambda$0(yq0.this, (String) obj2);
                    }
                });
                return pn6.a;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewPool$isHealthy$2(AndroidWebViewPool androidWebViewPool, PoolEntry poolEntry, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidWebViewPool;
        this.$entry = poolEntry;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidWebViewPool$isHealthy$2(this.this$0, this.$entry, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidWebViewPool$isHealthy$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (defpackage.tl7.V(r8, r5, r7) == r4) goto L16;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 2
            r2 = 1
            r3 = 0
            w11 r4 = defpackage.w11.x
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L17
            if (r0 != r1) goto L11
            defpackage.m37.N(r8)
            return r8
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r3
        L17:
            java.lang.Object r0 = r7.L$0
            yq0 r0 = (defpackage.yq0) r0
            defpackage.m37.N(r8)
            goto L3e
        L1f:
            defpackage.m37.N(r8)
            zq0 r0 = defpackage.tl7.c()
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r8 = r7.this$0
            n11 r8 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getMainDispatcher$p(r8)
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2$1 r5 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2$1
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r6 = r7.$entry
            r5.<init>(r6, r0, r3)
            r7.L$0 = r0
            r7.label = r2
            java.lang.Object r8 = defpackage.tl7.V(r8, r5, r7)
            if (r8 != r4) goto L3e
            goto L4a
        L3e:
            r7.L$0 = r3
            r7.label = r1
            zq0 r0 = (defpackage.zq0) r0
            java.lang.Object r7 = r0.o(r7)
            if (r7 != r4) goto L4b
        L4a:
            return r4
        L4b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
