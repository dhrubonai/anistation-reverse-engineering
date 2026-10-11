package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.bx7;
import defpackage.jf3;
import defpackage.rb3;
import defpackage.sb2;
import defpackage.z05;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {
    private final rb3 getOperativeRequestPolicy$delegate;
    private final rb3 sendDiagnosticEvent$delegate;
    private final rb3 universalRequestEventSender$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        final String str = ServiceProvider.NAMED_OPERATIVE_REQ;
        sb2 sb2Var = new sb2() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.ads.core.domain.GetRequestPolicy] */
            @Override // defpackage.sb2
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, z05.a(GetRequestPolicy.class));
            }
        };
        jf3 jf3Var = jf3.z;
        this.getOperativeRequestPolicy$delegate = bx7.B(jf3Var, sb2Var);
        final String str2 = "";
        this.sendDiagnosticEvent$delegate = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // defpackage.sb2
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, z05.a(SendDiagnosticEvent.class));
            }
        });
        final String str3 = ServiceProvider.OPERATIVE_EVENT_SENDER;
        this.universalRequestEventSender$delegate = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.ads.core.domain.events.UniversalRequestEventSender] */
            @Override // defpackage.sb2
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, z05.a(UniversalRequestEventSender.class));
            }
        });
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(defpackage.vz0 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1
            if (r0 == 0) goto L13
            r0 = r15
            com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            long r1 = r0.J$0
            defpackage.m37.N(r15)     // Catch: java.lang.Throwable -> L27
            goto L54
        L27:
            r0 = move-exception
            r15 = r0
            goto L7e
        L2a:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r14)
            r14 = 0
            return r14
        L31:
            defpackage.m37.N(r15)
            r14.ensureApplicationContextSet()
            long r3 = defpackage.j04.b()
            com.unity3d.ads.core.domain.GetRequestPolicy r15 = r14.getGetOperativeRequestPolicy()     // Catch: java.lang.Throwable -> L7b
            com.unity3d.ads.gatewayclient.RequestPolicy r15 = r15.invoke()     // Catch: java.lang.Throwable -> L7b
            r14.setRequestPolicy(r15)     // Catch: java.lang.Throwable -> L7b
            r0.J$0 = r3     // Catch: java.lang.Throwable -> L7b
            r0.label = r2     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r15 = super.doWork(r0)     // Catch: java.lang.Throwable -> L7b
            w11 r0 = defpackage.w11.x
            if (r15 != r0) goto L53
            return r0
        L53:
            r1 = r3
        L54:
            r0 = r15
            oi3 r0 = (defpackage.oi3) r0     // Catch: java.lang.Throwable -> L27
            com.unity3d.ads.core.domain.SendDiagnosticEvent r3 = r14.getSendDiagnosticEvent()     // Catch: java.lang.Throwable -> L27
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType r4 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT     // Catch: java.lang.Throwable -> L27
            bf6 r0 = new bf6     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            double r5 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r0)     // Catch: java.lang.Throwable -> L27
            r6 = r5
            java.lang.Double r5 = new java.lang.Double     // Catch: java.lang.Throwable -> L27
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27
            r12 = 252(0xfc, float:3.53E-43)
            r13 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L27
            oi3 r15 = (defpackage.oi3) r15     // Catch: java.lang.Throwable -> L27
            return r15
        L7b:
            r0 = move-exception
            r15 = r0
            r1 = r3
        L7e:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r3 = r14.getSendDiagnosticEvent()
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType r4 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE
            double r0 = defpackage.h11.c(r1)
            java.lang.Double r5 = new java.lang.Double
            r5.<init>(r0)
            java.lang.Class r0 = r15.getClass()
            java.lang.String r0 = r0.getSimpleName()
            ai4 r1 = new ai4
            java.lang.String r2 = "reason"
            r1.<init>(r2, r0)
            java.lang.String r0 = r15.getMessage()
            if (r0 != 0) goto Laa
            java.lang.Class r0 = r15.getClass()
            java.lang.String r0 = r0.getSimpleName()
        Laa:
            ai4 r2 = new ai4
            java.lang.String r6 = "reason_debug"
            r2.<init>(r6, r0)
            ai4[] r0 = new defpackage.ai4[]{r1, r2}
            java.util.Map r6 = defpackage.vn3.T(r0)
            r12 = 248(0xf8, float:3.48E-43)
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.unity3d.ads.core.log.Logger r14 = r14.getLogger()
            java.lang.String r0 = "OperativeEventJob failed to process work"
            r14.trace(r0, r15)
            mi3 r14 = new mi3
            r14.<init>()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.OperativeEventJob.doWork(vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    public UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }
}
