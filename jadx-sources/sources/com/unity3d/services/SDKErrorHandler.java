package com.unity3d.services;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import defpackage.an3;
import defpackage.db;
import defpackage.ic2;
import defpackage.j11;
import defpackage.k11;
import defpackage.ke0;
import defpackage.l11;
import defpackage.n11;
import defpackage.o11;
import defpackage.p11;
import defpackage.q71;
import defpackage.r11;
import defpackage.tl7;
import defpackage.v11;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class SDKErrorHandler implements p11 {
    public static final Companion Companion = new Companion(null);
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final o11 key;
    private final v11 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public SDKErrorHandler(n11 n11Var, SendDiagnosticEvent sendDiagnosticEvent) {
        n11Var.getClass();
        sendDiagnosticEvent.getClass();
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        ke0 g0 = db.g0(db.b(n11Var), new r11("SDKErrorHandler"));
        o11 o11Var = o11.x;
        this.scope = db.g0(g0, new SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(o11Var));
        this.key = o11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String retrieveCoroutineName(l11 l11Var) {
        r11 r11Var = (r11) l11Var.get(r11.y);
        if (r11Var != null) {
            return r11Var.x;
        }
        return "unknown";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ByteString retrieveOpportunityId(l11 l11Var) {
        CoroutineOpportunity coroutineOpportunity = (CoroutineOpportunity) l11Var.get(CoroutineOpportunity.Key);
        if (coroutineOpportunity != null) {
            return coroutineOpportunity.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDiagnostic(String str, String str2, String str3, String str4, ByteString byteString) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        an3 an3Var = new an3();
        an3Var.put("reason", str2);
        an3Var.put("reason_debug", str4);
        an3Var.put("coroutine_name", str3);
        if (byteString != null) {
            String uuid = ProtobufExtensionsKt.toUUID(byteString).toString();
            uuid.getClass();
            an3Var.put("impressionOpportunityId", uuid);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, (Double) null, an3Var.b(), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
    }

    @Override // defpackage.l11
    public <R> R fold(R r, ic2 ic2Var) {
        return (R) tl7.t(this, r, ic2Var);
    }

    @Override // defpackage.l11
    public <E extends j11> E get(k11 k11Var) {
        return (E) tl7.u(this, k11Var);
    }

    @Override // defpackage.p11
    public void handleException(l11 l11Var, Throwable th) {
        l11Var.getClass();
        th.getClass();
        tl7.z(this.scope, null, null, new SDKErrorHandler$handleException$1(this, l11Var, th, null), 3);
    }

    @Override // defpackage.l11
    public l11 minusKey(k11 k11Var) {
        return tl7.B(this, k11Var);
    }

    @Override // defpackage.l11
    public l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
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

    @Override // defpackage.j11
    public o11 getKey() {
        return this.key;
    }
}
