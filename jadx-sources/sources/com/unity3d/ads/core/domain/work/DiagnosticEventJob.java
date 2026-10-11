package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.domain.GetRequestPolicy;
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
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {
    private final rb3 diagnosticEventRequestWorkModifier$delegate;
    private final rb3 getDiagnosticRequestPolicy$delegate;
    private final rb3 universalRequestEventSender$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        final String str = ServiceProvider.NAMED_OTHER_REQ;
        sb2 sb2Var = new sb2() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.ads.core.domain.GetRequestPolicy] */
            @Override // defpackage.sb2
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, z05.a(GetRequestPolicy.class));
            }
        };
        jf3 jf3Var = jf3.z;
        this.getDiagnosticRequestPolicy$delegate = bx7.B(jf3Var, sb2Var);
        final String str2 = "";
        this.diagnosticEventRequestWorkModifier$delegate = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier, java.lang.Object] */
            @Override // defpackage.sb2
            public final DiagnosticEventRequestWorkModifier invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, z05.a(DiagnosticEventRequestWorkModifier.class));
            }
        });
        final String str3 = ServiceProvider.DIAGNOSTICS_EVENT_SENDER;
        this.universalRequestEventSender$delegate = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.ads.core.domain.events.UniversalRequestEventSender] */
            @Override // defpackage.sb2
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, z05.a(UniversalRequestEventSender.class));
            }
        });
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier$delegate.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(7:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(2:18|19))(2:22|23))(3:33|34|(2:36|37)(2:38|(2:40|21)))|24|25|(3:27|(2:29|21)|19)(2:30|31)))|7|(0)(0)|24|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        if (r8 != r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0044, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        r8 = new defpackage.y45(r8);
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002a, B:13:0x00bc, B:18:0x0038, B:19:0x00a8, B:25:0x007b, B:27:0x0081, B:30:0x00bf, B:42:0x0075, B:34:0x004c, B:36:0x005a, B:23:0x0040, B:24:0x006e, B:38:0x005f), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002a, B:13:0x00bc, B:18:0x0038, B:19:0x00a8, B:25:0x007b, B:27:0x0081, B:30:0x00bf, B:42:0x0075, B:34:0x004c, B:36:0x005a, B:23:0x0040, B:24:0x006e, B:38:0x005f), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(defpackage.vz0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L46
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            defpackage.m37.N(r8)     // Catch: java.lang.Throwable -> L2f
            goto Lbc
        L2f:
            r8 = move-exception
            goto Lc4
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r2
        L38:
            defpackage.m37.N(r8)     // Catch: java.lang.Throwable -> L2f
            goto La8
        L3c:
            java.lang.Object r1 = r0.L$0
            java.lang.String r1 = (java.lang.String) r1
            defpackage.m37.N(r8)     // Catch: java.lang.Throwable -> L44
            goto L6e
        L44:
            r8 = move-exception
            goto L75
        L46:
            defpackage.m37.N(r8)
            r7.ensureApplicationContextSet()
            androidx.work.WorkerParameters r8 = r7.getWorkerParams()     // Catch: java.lang.Throwable -> L2f
            e41 r8 = r8.b     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "universalRequestId"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L5f
            ni3 r7 = defpackage.oi3.a()     // Catch: java.lang.Throwable -> L2f
            return r7
        L5f:
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r8 = r7.getUniversalRequestDataSource()     // Catch: java.lang.Throwable -> L44
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L44
            r0.label = r5     // Catch: java.lang.Throwable -> L44
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L44
            if (r8 != r6) goto L6e
            goto Lbb
        L6e:
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore r8 = (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) r8     // Catch: java.lang.Throwable -> L44
            com.google.protobuf.ByteString r8 = r8.getUniversalRequestMapOrThrow(r1)     // Catch: java.lang.Throwable -> L44
            goto L7b
        L75:
            y45 r5 = new y45     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            r8 = r5
        L7b:
            java.lang.Throwable r5 = defpackage.z45.b(r8)     // Catch: java.lang.Throwable -> L2f
            if (r5 != 0) goto Lbf
            com.google.protobuf.ByteString r8 = (com.google.protobuf.ByteString) r8     // Catch: java.lang.Throwable -> L2f
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r8 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.parseFrom(r8)     // Catch: java.lang.Throwable -> L2f
            com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier r5 = r7.getDiagnosticEventRequestWorkModifier()     // Catch: java.lang.Throwable -> L2f
            r8.getClass()     // Catch: java.lang.Throwable -> L2f
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r8 = r5.invoke(r8)     // Catch: java.lang.Throwable -> L2f
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r5 = r7.getUniversalRequestDataSource()     // Catch: java.lang.Throwable -> L2f
            com.google.protobuf.ByteString r8 = r8.toByteString()     // Catch: java.lang.Throwable -> L2f
            r8.getClass()     // Catch: java.lang.Throwable -> L2f
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L2f
            r0.label = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r5.set(r1, r8, r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r6) goto La8
            goto Lbb
        La8:
            com.unity3d.ads.core.domain.GetRequestPolicy r8 = r7.getGetDiagnosticRequestPolicy()     // Catch: java.lang.Throwable -> L2f
            com.unity3d.ads.gatewayclient.RequestPolicy r8 = r8.invoke()     // Catch: java.lang.Throwable -> L2f
            r7.setRequestPolicy(r8)     // Catch: java.lang.Throwable -> L2f
            r0.label = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = super.doWork(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r6) goto Lbc
        Lbb:
            return r6
        Lbc:
            oi3 r8 = (defpackage.oi3) r8     // Catch: java.lang.Throwable -> L2f
            return r8
        Lbf:
            ni3 r7 = defpackage.oi3.a()     // Catch: java.lang.Throwable -> L2f
            return r7
        Lc4:
            com.unity3d.ads.core.log.Logger r7 = r7.getLogger()
            java.lang.String r0 = "DiagnosticEventJob failed to process work"
            r7.trace(r0, r8)
            mi3 r7 = new mi3
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork(vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    public UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }
}
