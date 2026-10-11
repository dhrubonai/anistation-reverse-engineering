package com.unity3d.ads.core.domain;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$warmStaticDeviceInfo$1", f = "AndroidInitializeBoldSDK.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidInitializeBoldSDK$warmStaticDeviceInfo$1 extends t36 implements ic2 {
    long J$0;
    int label;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeBoldSDK$warmStaticDeviceInfo$1(AndroidInitializeBoldSDK androidInitializeBoldSDK, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidInitializeBoldSDK;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidInitializeBoldSDK$warmStaticDeviceInfo$1(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidInitializeBoldSDK$warmStaticDeviceInfo$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            long r1 = r12.J$0
            defpackage.m37.N(r13)     // Catch: java.lang.Throwable -> Ld java.util.concurrent.CancellationException -> L79
            goto L4b
        Ld:
            r0 = move-exception
            r13 = r0
            goto L45
        L10:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r12)
            r12 = 0
            return r12
        L17:
            defpackage.m37.N(r13)
            long r2 = defpackage.j04.b()
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
            com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource r0 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getStaticDeviceInfoDataSource$p(r13)     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L79
            com.unity3d.ads.core.data.repository.SessionRepository r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getSessionRepository$p(r13)     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L79
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r13 = r13.getNativeConfiguration()     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L79
            java.util.List r13 = r13.getAdditionalStorePackagesList()     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L79
            r13.getClass()     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L79
            r12.J$0 = r2     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L79
            r12.label = r1     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L79
            java.lang.Object r13 = r0.fetch(r13, r12)     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L79
            w11 r0 = defpackage.w11.x
            if (r13 != r0) goto L40
            return r0
        L40:
            r1 = r2
            goto L4b
        L42:
            r0 = move-exception
            r13 = r0
            r1 = r2
        L45:
            y45 r0 = new y45
            r0.<init>(r13)
            r13 = r0
        L4b:
            boolean r13 = r13 instanceof defpackage.y45
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r12 = r12.this$0
            pn6 r0 = defpackage.pn6.a
            if (r13 == 0) goto L5c
            java.util.concurrent.atomic.AtomicBoolean r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getWarmStarted$p(r12)
            r13 = 0
            r12.set(r13)
            return r0
        L5c:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getSendDiagnosticEvent$p(r12)
            double r1 = defpackage.h11.c(r1)
            java.lang.Double r3 = new java.lang.Double
            r3.<init>(r1)
            r10 = 252(0xfc, float:3.53E-43)
            r11 = 0
            java.lang.String r2 = "native_static_device_info_build_time"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L79:
            r0 = move-exception
            r12 = r0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$warmStaticDeviceInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
