package com.unity3d.ads.core.domain.coherence;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.coherence.c;
import com.unity3d.coherence.e;
import defpackage.bf6;
import defpackage.j04;
import defpackage.mm5;
import defpackage.q71;
import defpackage.vo0;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidCoherenceLibraryManager implements CoherenceLibraryManager {
    private static final Companion Companion = new Companion(null);
    private static final int PRODUCT_ID = 2;
    private final Context appContext;
    private vo0 cachedPipeline;
    private final AtomicBoolean initialized;
    private final Logger logger;
    private final Object pipelineLock;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidCoherenceLibraryManager(Context context, Logger logger, SendDiagnosticEvent sendDiagnosticEvent) {
        context.getClass();
        logger.getClass();
        sendDiagnosticEvent.getClass();
        this.logger = logger;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.appContext = context.getApplicationContext();
        this.initialized = new AtomicBoolean(false);
        this.pipelineLock = new Object();
    }

    private final void initializeLibrary() {
        if (this.initialized.get()) {
            return;
        }
        synchronized (this) {
            if (this.initialized.get()) {
                return;
            }
            Context context = this.appContext;
            Objects.requireNonNull(context, "context must not be null");
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            long b = j04.b();
            if (c.d == null) {
                synchronized (c.class) {
                    try {
                        if (c.d == null) {
                            c.d = new c(context);
                        }
                    } finally {
                    }
                }
            }
            this.initialized.set(true);
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_coherence_init_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(new bf6(b))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 252, (Object) null);
        }
    }

    @Override // com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager
    public byte[] executeWasmData() {
        vo0 vo0Var;
        synchronized (this.pipelineLock) {
            vo0Var = this.cachedPipeline;
        }
        if (vo0Var == null) {
            return new byte[0];
        }
        try {
            long b = j04.b();
            byte[] l = ((e) vo0Var).l(new byte[0]);
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_coherence_execute_wasm_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(new bf6(b))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 252, (Object) null);
            return l;
        } catch (Throwable th) {
            this.logger.error("CoherenceLibrary WASM execution failed", th);
            return null;
        }
    }

    @Override // com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager
    public byte[] getCommonAttributes(int i) {
        try {
            initializeLibrary();
            mm5 mm5Var = new mm5(i);
            long b = j04.b();
            c cVar = c.d;
            if (cVar != null) {
                byte[] a = cVar.a.a(mm5Var);
                if (a != null) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_coherence_get_common_attributes_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(new bf6(b))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 252, (Object) null);
                    return a;
                }
                return a;
            }
            throw new IllegalStateException("CoherenceLibrary not initialized — call CoherenceLibrary.init(CoherenceInitConfig) first");
        } catch (Throwable th) {
            this.logger.error("CoherenceLibrary fetching payload failed", th);
            return null;
        }
    }

    @Override // com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager
    public void initialize(byte[] bArr) {
        bArr.getClass();
        try {
            initializeLibrary();
            if (bArr.length == 0) {
                return;
            }
            long b = j04.b();
            synchronized (this.pipelineLock) {
                vo0 vo0Var = this.cachedPipeline;
                if (vo0Var != null) {
                    ((e) vo0Var).p(bArr);
                } else {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    c cVar = c.d;
                    if (cVar != null) {
                        this.cachedPipeline = new e(((c) cVar.b.y).c, bArr2);
                    } else {
                        throw new IllegalStateException("CoherenceLibrary not initialized — call CoherenceLibrary.init(CoherenceInitConfig) first");
                    }
                }
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_coherence_warm_wasm_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(new bf6(b))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 252, (Object) null);
        } catch (Throwable th) {
            this.logger.error("CoherenceLibrary WASM warm-up failed", th);
        }
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
