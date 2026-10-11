package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.log.Logger;
import defpackage.n11;
import defpackage.tl7;
import defpackage.v11;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidWarmNonInitSignals implements WarmNonInitSignals {
    private final n11 ioDispatcher;
    private final Logger logger;
    private final PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final AtomicBoolean started;
    private final v11 warmUpScope;

    public AndroidWarmNonInitSignals(v11 v11Var, n11 n11Var, PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        v11Var.getClass();
        n11Var.getClass();
        privacyDeviceInfoDataSource.getClass();
        sendDiagnosticEvent.getClass();
        logger.getClass();
        this.warmUpScope = v11Var;
        this.ioDispatcher = n11Var;
        this.privacyDeviceInfoDataSource = privacyDeviceInfoDataSource;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        this.started = new AtomicBoolean(false);
    }

    @Override // com.unity3d.ads.core.domain.WarmNonInitSignals
    public void invoke() {
        if (!this.started.compareAndSet(false, true)) {
            return;
        }
        tl7.z(this.warmUpScope, null, null, new AndroidWarmNonInitSignals$invoke$1(this, null), 3);
    }
}
