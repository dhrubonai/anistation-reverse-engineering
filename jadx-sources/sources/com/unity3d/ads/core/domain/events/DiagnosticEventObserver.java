package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import defpackage.db;
import defpackage.n11;
import defpackage.o11;
import defpackage.pn6;
import defpackage.tl7;
import defpackage.tx5;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.x44;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DiagnosticEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetRequestPolicy diagnosticRequestPolicy;
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final x44 isRunning;
    private final v11 scope;
    private final UniversalRequestDataSource universalRequestDataSource;
    private final UniversalRequestEventSender universalRequestEventSender;

    public DiagnosticEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest, n11 n11Var, DiagnosticEventRepository diagnosticEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker, UniversalRequestEventSender universalRequestEventSender, GetRequestPolicy getRequestPolicy) {
        getUniversalRequestForPayLoad.getClass();
        getDiagnosticEventBatchRequest.getClass();
        n11Var.getClass();
        diagnosticEventRepository.getClass();
        universalRequestDataSource.getClass();
        backgroundWorker.getClass();
        universalRequestEventSender.getClass();
        getRequestPolicy.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.diagnosticRequestPolicy = getRequestPolicy;
        this.isRunning = tx5.a(Boolean.FALSE);
        this.scope = db.b(n11Var.plus(new DiagnosticEventObserver$special$$inlined$CoroutineExceptionHandler$1(o11.x)));
    }

    public final Object invoke(vz0 vz0Var) {
        Object V = tl7.V(this.scope.getCoroutineContext(), new DiagnosticEventObserver$invoke$2(this, null), vz0Var);
        if (V == w11.x) {
            return V;
        }
        return pn6.a;
    }
}
