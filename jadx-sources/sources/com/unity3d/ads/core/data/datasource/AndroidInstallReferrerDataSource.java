package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import defpackage.pg0;
import defpackage.pn6;
import defpackage.q71;
import defpackage.v11;
import defpackage.y45;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidInstallReferrerDataSource implements InstallReferrerDataSource {
    public static final Companion Companion = new Companion(null);
    private static final long TIME_OUT_MS = 500;
    private final Context appContext;
    private final v11 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidInstallReferrerDataSource(Context context, SendDiagnosticEvent sendDiagnosticEvent, v11 v11Var) {
        context.getClass();
        sendDiagnosticEvent.getClass();
        v11Var.getClass();
        this.appContext = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scope = v11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(pg0 pg0Var) {
        Object y45Var;
        try {
            pg0Var.resumeWith(null);
            y45Var = pn6.a;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (!(y45Var instanceof y45)) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "install_referral_fetch_failed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 254, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // com.unity3d.ads.core.data.datasource.InstallReferrerDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(defpackage.vz0 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1
            if (r0 == 0) goto L13
            r0 = r15
            com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r15)     // Catch: defpackage.qf6 -> L63
            goto L58
        L26:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r14)
            return r2
        L2c:
            defpackage.m37.N(r15)
            m18 r15 = defpackage.fq1.y     // Catch: defpackage.qf6 -> L63
            jq1 r15 = defpackage.jq1.MILLISECONDS     // Catch: defpackage.qf6 -> L63
            r4 = 500(0x1f4, double:2.47E-321)
            long r4 = defpackage.w65.W(r4, r15)     // Catch: defpackage.qf6 -> L63
            com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2 r15 = new com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2     // Catch: defpackage.qf6 -> L63
            r15.<init>(r14, r2)     // Catch: defpackage.qf6 -> L63
            r0.label = r3     // Catch: defpackage.qf6 -> L63
            long r3 = defpackage.x97.T(r4)     // Catch: defpackage.qf6 -> L63
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L5b
            rf6 r1 = new rf6     // Catch: defpackage.qf6 -> L63
            r1.<init>(r3, r0)     // Catch: defpackage.qf6 -> L63
            java.lang.Object r15 = defpackage.rz5.d(r1, r15)     // Catch: defpackage.qf6 -> L63
            w11 r0 = defpackage.w11.x
            if (r15 != r0) goto L58
            return r0
        L58:
            gatewayprotocol.v1.InitializationRequestOuterClass$InstallReferrer r15 = (gatewayprotocol.v1.InitializationRequestOuterClass.InstallReferrer) r15     // Catch: defpackage.qf6 -> L63
            return r15
        L5b:
            qf6 r15 = new qf6     // Catch: defpackage.qf6 -> L63
            java.lang.String r0 = "Timed out immediately"
            r15.<init>(r0, r2)     // Catch: defpackage.qf6 -> L63
            throw r15     // Catch: defpackage.qf6 -> L63
        L63:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r3 = r14.sendDiagnosticEvent
            r12 = 254(0xfe, float:3.56E-43)
            r13 = 0
            java.lang.String r4 = "install_referral_fetch_timed_out"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource.invoke(vz0):java.lang.Object");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }
}
