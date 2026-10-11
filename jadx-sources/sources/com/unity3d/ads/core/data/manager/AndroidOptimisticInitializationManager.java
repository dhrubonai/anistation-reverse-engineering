package com.unity3d.ads.core.data.manager;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.log.Logger;
import defpackage.h43;
import defpackage.n11;
import defpackage.q71;
import defpackage.te4;
import defpackage.tl7;
import defpackage.v11;
import defpackage.yo0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidOptimisticInitializationManager implements OptimisticInitializationManager {
    public static final Companion Companion = new Companion(null);
    private static final String DIAGNOSTIC_EVENT = "native_initialize_success_optimistically";
    private static final String KEY_LAST_SUCCESS = "last_init_success";
    private static final String PREFERENCES_FILE = "unityads-optimistic-init";
    private final n11 ioDispatcher;
    private final Logger logger;
    private final v11 optimisticScope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StaticDeviceInfoDataSource staticDeviceInfoDataSource;
    private final AtomicBoolean terminal;
    private volatile h43 timerJob;
    private final TriggerInitializeListener triggerInitializeListener;

    public AndroidOptimisticInitializationManager(SessionRepository sessionRepository, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, v11 v11Var, StaticDeviceInfoDataSource staticDeviceInfoDataSource, Logger logger, n11 n11Var) {
        sessionRepository.getClass();
        triggerInitializeListener.getClass();
        sendDiagnosticEvent.getClass();
        v11Var.getClass();
        staticDeviceInfoDataSource.getClass();
        logger.getClass();
        n11Var.getClass();
        this.sessionRepository = sessionRepository;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.optimisticScope = v11Var;
        this.staticDeviceInfoDataSource = staticDeviceInfoDataSource;
        this.logger = logger;
        this.ioDispatcher = n11Var;
        this.terminal = new AtomicBoolean(false);
    }

    private final String computeKey() {
        String gameId = this.sessionRepository.getGameId();
        if (gameId == null) {
            gameId = "";
        }
        return yo0.q0(te4.I(gameId, "4.21.0", this.staticDeviceInfoDataSource.getBundleVersion()), "|", null, null, null, 62);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendOptimistic() {
        if (!this.terminal.compareAndSet(false, true)) {
            return;
        }
        try {
            Logger.DefaultImpls.trace$default(this.logger, "Optimistic init: timer fired, sending success callback", null, 2, null);
            this.triggerInitializeListener.success();
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DIAGNOSTIC_EVENT, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 254, (Object) null);
        } catch (Throwable th) {
            this.logger.trace("Optimistic init: failed to send success callback: " + th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(r5.logger, "Optimistic init: failed to store key: " + r6.getMessage(), null, 2, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object storeKey(defpackage.vz0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager$storeKey$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager$storeKey$1 r0 = (com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager$storeKey$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager$storeKey$1 r0 = new com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager$storeKey$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            defpackage.m37.N(r6)     // Catch: java.lang.Exception -> L26
            goto L5f
        L26:
            r6 = move-exception
            goto L47
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r3
        L2e:
            defpackage.m37.N(r6)
            java.lang.String r6 = r5.computeKey()     // Catch: java.lang.Exception -> L26
            n11 r1 = r5.ioDispatcher     // Catch: java.lang.Exception -> L26
            com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager$storeKey$2 r4 = new com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager$storeKey$2     // Catch: java.lang.Exception -> L26
            r4.<init>(r6, r3)     // Catch: java.lang.Exception -> L26
            r0.label = r2     // Catch: java.lang.Exception -> L26
            java.lang.Object r5 = defpackage.tl7.V(r1, r4, r0)     // Catch: java.lang.Exception -> L26
            w11 r6 = defpackage.w11.x
            if (r5 != r6) goto L5f
            return r6
        L47:
            com.unity3d.ads.core.log.Logger r5 = r5.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Optimistic init: failed to store key: "
            r0.<init>(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r0 = 2
            com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(r5, r6, r3, r0, r3)
        L5f:
            pn6 r5 = defpackage.pn6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager.storeKey(vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.OptimisticInitializationManager
    public void onInitializationFinished(boolean z) {
        this.terminal.set(true);
        h43 h43Var = this.timerJob;
        if (h43Var != null) {
            h43Var.l(null);
        }
        if (z) {
            tl7.z(this.optimisticScope, null, null, new AndroidOptimisticInitializationManager$onInitializationFinished$1(this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.unity3d.ads.core.data.manager.OptimisticInitializationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object tryOptimisticCompletion(defpackage.vz0 r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager.tryOptimisticCompletion(vz0):java.lang.Object");
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
