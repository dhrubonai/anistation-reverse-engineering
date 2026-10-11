package com.unity3d.ads.adplayer.probe;

import android.content.Context;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import defpackage.n11;
import defpackage.tl7;
import defpackage.v11;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidWebViewProbe implements WebViewProbe {
    private final Context context;
    private final n11 ioDispatcher;
    private final n11 mainDispatcher;
    private final v11 sdkScope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidWebViewProbe(Context context, SendDiagnosticEvent sendDiagnosticEvent, v11 v11Var, n11 n11Var, n11 n11Var2) {
        context.getClass();
        sendDiagnosticEvent.getClass();
        v11Var.getClass();
        n11Var.getClass();
        n11Var2.getClass();
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkScope = v11Var;
        this.mainDispatcher = n11Var;
        this.ioDispatcher = n11Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        if (defpackage.tl7.V(r15, r10, r0) != r7) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:25:0x0047, B:32:0x00ee, B:34:0x00f6, B:37:0x00fe, B:43:0x005d, B:44:0x00b5, B:46:0x00b9, B:47:0x00c5), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9 A[Catch: all -> 0x004c, Exception -> 0x0061, TryCatch #5 {all -> 0x004c, blocks: (B:25:0x0047, B:32:0x00ee, B:34:0x00f6, B:37:0x00fe, B:43:0x005d, B:44:0x00b5, B:46:0x00b9, B:47:0x00c5), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runProbe(defpackage.vz0 r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.probe.AndroidWebViewProbe.runProbe(vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.probe.WebViewProbe
    public void invoke() {
        tl7.z(this.sdkScope, this.mainDispatcher, null, new AndroidWebViewProbe$invoke$1(this, null), 2);
    }
}
