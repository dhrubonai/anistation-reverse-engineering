package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidOmImpressionOccurred implements OmImpressionOccurred {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmImpressionOccurred(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        openMeasurementRepository.getClass();
        sendDiagnosticEvent.getClass();
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.om.OmImpressionOccurred
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject r17, boolean r18, defpackage.vz0 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1 r2 = (com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1 r2 = new com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L35
            if (r3 != r5) goto L2f
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.data.model.AdObject r2 = (com.unity3d.ads.core.data.model.AdObject) r2
            defpackage.m37.N(r1)
            r10 = r2
            goto L50
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r4
        L35:
            defpackage.m37.N(r1)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r1 = r0.openMeasurementRepository
            com.google.protobuf.ByteString r3 = r17.getOpportunityId()
            r6 = r17
            r2.L$0 = r6
            r2.label = r5
            r5 = r18
            java.lang.Object r1 = r1.impressionOccurred(r3, r5, r2)
            w11 r2 = defpackage.w11.x
            if (r1 != r2) goto L4f
            return r2
        L4f:
            r10 = r6
        L50:
            com.unity3d.ads.core.data.model.OMResult r1 = (com.unity3d.ads.core.data.model.OMResult) r1
            boolean r2 = r1 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r2 == 0) goto L67
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r0.sendDiagnosticEvent
            r14 = 238(0xee, float:3.34E-43)
            r15 = 0
            java.lang.String r6 = "om_impression_occurred_success"
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L9d
        L67:
            boolean r2 = r1 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r2 == 0) goto La0
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r0.sendDiagnosticEvent
            an3 r0 = new an3
            r0.<init>()
            com.unity3d.ads.core.data.model.OMResult$Failure r1 = (com.unity3d.ads.core.data.model.OMResult.Failure) r1
            java.lang.String r2 = r1.getReason()
            java.lang.String r3 = "reason"
            r0.put(r3, r2)
            java.lang.String r2 = r1.getReasonDebug()
            if (r2 == 0) goto L8c
            java.lang.String r2 = "reason_debug"
            java.lang.String r1 = r1.getReasonDebug()
            r0.put(r2, r1)
        L8c:
            an3 r8 = r0.b()
            r14 = 234(0xea, float:3.28E-43)
            r15 = 0
            java.lang.String r6 = "om_impression_occurred_failure"
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L9d:
            pn6 r0 = defpackage.pn6.a
            return r0
        La0:
            defpackage.ze0.l()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.invoke(com.unity3d.ads.core.data.model.AdObject, boolean, vz0):java.lang.Object");
    }
}
