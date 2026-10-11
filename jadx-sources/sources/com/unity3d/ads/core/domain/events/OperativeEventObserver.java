package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
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
public final class OperativeEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final x44 isRunning;
    private final OperativeEventRepository operativeEventRepository;
    private final GetRequestPolicy operativeRequestPolicy;
    private final v11 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final UniversalRequestDataSource universalRequestDataSource;
    private final UniversalRequestEventSender universalRequestEventSender;

    public OperativeEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, n11 n11Var, OperativeEventRepository operativeEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker, UniversalRequestEventSender universalRequestEventSender, GetRequestPolicy getRequestPolicy, SendDiagnosticEvent sendDiagnosticEvent) {
        getUniversalRequestForPayLoad.getClass();
        n11Var.getClass();
        operativeEventRepository.getClass();
        universalRequestDataSource.getClass();
        backgroundWorker.getClass();
        universalRequestEventSender.getClass();
        getRequestPolicy.getClass();
        sendDiagnosticEvent.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.operativeRequestPolicy = getRequestPolicy;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.isRunning = tx5.a(Boolean.FALSE);
        this.scope = db.b(n11Var.plus(new OperativeEventObserver$special$$inlined$CoroutineExceptionHandler$1(o11.x)));
    }

    public final Object invoke(vz0 vz0Var) {
        Object V = tl7.V(this.scope.getCoroutineContext(), new OperativeEventObserver$invoke$2(this, null), vz0Var);
        if (V == w11.x) {
            return V;
        }
        return pn6.a;
    }
}
