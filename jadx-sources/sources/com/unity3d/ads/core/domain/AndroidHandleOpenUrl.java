package com.unity3d.ads.core.domain;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    private final Context context;
    private final IntentCreation intentCreation;

    public AndroidHandleOpenUrl(Context context, IntentCreation intentCreation) {
        context.getClass();
        intentCreation.getClass();
        this.context = context;
        this.intentCreation = intentCreation;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(final com.unity3d.ads.core.data.model.AdObject r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, boolean r10, defpackage.vz0 r11) {
        /*
            r4 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1
            r0.<init>(r4, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r11)
            goto L75
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r11)
            com.unity3d.ads.core.domain.IntentCreation r11 = r4.intentCreation
            android.content.Intent r6 = r11.invoke(r6, r7, r8, r9)
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r7 = r5.getAdType()
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r8 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER
            if (r7 != r8) goto L55
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r6.setFlags(r5)
            android.content.Context r4 = r4.context     // Catch: java.lang.Throwable -> L4a
            r4.startActivity(r6)     // Catch: java.lang.Throwable -> L4a
            pn6 r4 = defpackage.pn6.a     // Catch: java.lang.Throwable -> L4a
            goto L51
        L4a:
            r4 = move-exception
            y45 r5 = new y45
            r5.<init>(r4)
            r4 = r5
        L51:
            boolean r4 = r4 instanceof defpackage.y45
            r4 = r4 ^ r3
            goto L7e
        L55:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion
            t44 r4 = r4.getDisplayMessages()
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1 r7 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1
            r7.<init>(r5, r6, r10, r2)
            e16 r6 = new e16
            r6.<init>(r4, r7)
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1 r4 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1
            r4.<init>()
            r0.label = r3
            java.lang.Object r11 = defpackage.sw0.p(r4, r0)
            w11 r4 = defpackage.w11.x
            if (r11 != r4) goto L75
            return r4
        L75:
            r11.getClass()
            com.unity3d.ads.adplayer.DisplayMessage$OpenUrlResult r11 = (com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult) r11
            boolean r4 = r11.getSuccess()
        L7e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleOpenUrl.invoke(com.unity3d.ads.core.data.model.AdObject, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, vz0):java.lang.Object");
    }
}
