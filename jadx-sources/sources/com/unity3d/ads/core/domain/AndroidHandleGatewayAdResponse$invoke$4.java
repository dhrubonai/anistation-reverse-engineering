package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w05;
import defpackage.w51;
import gatewayprotocol.v1.AdResponseOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", l = {301, 302}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse$invoke$4 extends t36 implements ic2 {
    final /* synthetic */ w05 $adPlayer;
    final /* synthetic */ LoadEvent $loadEvent;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ AdResponseOuterClass.AdResponse $response;
    final /* synthetic */ AdObject $tmpAdObject;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$4(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, AdObject adObject, LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, w05 w05Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$tmpAdObject = adObject;
        this.$loadEvent = loadEvent;
        this.$opportunityId = byteString;
        this.$response = adResponse;
        this.$adPlayer = w05Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidHandleGatewayAdResponse$invoke$4(this.this$0, this.$tmpAdObject, this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidHandleGatewayAdResponse$invoke$4) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r10 == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r11.onShowComplete(r0, r10) == r3) goto L15;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 2
            r2 = 1
            w11 r3 = defpackage.w11.x
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.m37.N(r11)
            goto L53
        L10:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            r10 = 0
            return r10
        L17:
            defpackage.m37.N(r11)
            goto L2f
        L1b:
            defpackage.m37.N(r11)
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r11 = r10.this$0
            com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy r11 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getPreShowStrategy$p(r11)
            com.unity3d.ads.core.data.model.AdObject r0 = r10.$tmpAdObject
            r10.label = r2
            java.lang.Object r11 = r11.onShowComplete(r0, r10)
            if (r11 != r3) goto L2f
            goto L52
        L2f:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r4 = r10.this$0
            java.lang.Error r5 = new java.lang.Error
            com.unity3d.ads.adplayer.model.LoadEvent r11 = r10.$loadEvent
            com.unity3d.ads.adplayer.model.LoadEvent$Error r11 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r11
            java.lang.String r11 = r11.getMessage()
            r5.<init>(r11)
            com.google.protobuf.ByteString r6 = r10.$opportunityId
            gatewayprotocol.v1.AdResponseOuterClass$AdResponse r7 = r10.$response
            w05 r11 = r10.$adPlayer
            java.lang.Object r11 = r11.x
            r8 = r11
            com.unity3d.ads.adplayer.AdPlayer r8 = (com.unity3d.ads.adplayer.AdPlayer) r8
            r10.label = r1
            r9 = r10
            java.lang.Object r10 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$cleanup(r4, r5, r6, r7, r8, r9)
            if (r10 != r3) goto L53
        L52:
            return r3
        L53:
            pn6 r10 = defpackage.pn6.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
