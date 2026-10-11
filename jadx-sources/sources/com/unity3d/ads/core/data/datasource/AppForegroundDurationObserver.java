package com.unity3d.ads.core.data.datasource;

import android.os.SystemClock;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.db;
import defpackage.iv;
import defpackage.k52;
import defpackage.n11;
import defpackage.o11;
import defpackage.q71;
import defpackage.sb2;
import defpackage.sx5;
import defpackage.t;
import defpackage.tx5;
import defpackage.v11;
import defpackage.x44;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AppForegroundDurationObserver implements ForegroundDurationReader {
    private final AtomicLong accumulatedBackgroundMs;
    private final AtomicLong backgroundStartMs;
    private final n11 defaultDispatcher;
    private final sb2 elapsedRealtimeProvider;
    private final sb2 initTimeProvider;
    private final AtomicBoolean isInBackground;
    private final x44 isRunning;
    private final LifecycleDataSource lifecycleDataSource;
    private final v11 scope;

    public AppForegroundDurationObserver(LifecycleDataSource lifecycleDataSource, n11 n11Var, sb2 sb2Var, sb2 sb2Var2) {
        lifecycleDataSource.getClass();
        n11Var.getClass();
        sb2Var.getClass();
        sb2Var2.getClass();
        this.lifecycleDataSource = lifecycleDataSource;
        this.defaultDispatcher = n11Var;
        this.elapsedRealtimeProvider = sb2Var;
        this.initTimeProvider = sb2Var2;
        this.isRunning = tx5.a(Boolean.FALSE);
        this.accumulatedBackgroundMs = new AtomicLong(0L);
        this.backgroundStartMs = new AtomicLong(0L);
        this.isInBackground = new AtomicBoolean(false);
        this.scope = db.b(n11Var.plus(new AppForegroundDurationObserver$special$$inlined$CoroutineExceptionHandler$1(o11.x)));
    }

    public static final long _init_$lambda$0() {
        return SystemClock.elapsedRealtime();
    }

    public static final long _init_$lambda$1() {
        return SdkProperties.getInitializationTime();
    }

    private final long currentAccumulatedBackgroundMs(long j, long j2) {
        long j3 = this.accumulatedBackgroundMs.get();
        if (!this.isInBackground.get()) {
            return j3;
        }
        return Math.max(0L, j2 - Math.max(this.backgroundStartMs.get(), j)) + j3;
    }

    public final void onBackground() {
        if (this.isInBackground.compareAndSet(false, true)) {
            this.backgroundStartMs.set(((Number) this.elapsedRealtimeProvider.invoke()).longValue());
        }
    }

    public final void onForeground() {
        if (this.isInBackground.compareAndSet(true, false)) {
            long longValue = ((Number) this.initTimeProvider.invoke()).longValue();
            if (longValue != 0) {
                long max = Math.max(this.backgroundStartMs.get(), longValue);
                this.accumulatedBackgroundMs.addAndGet(Math.max(0L, ((Number) this.elapsedRealtimeProvider.invoke()).longValue() - max));
            }
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.ForegroundDurationReader
    public long getSessionDurationInForegroundMs() {
        long longValue = ((Number) this.initTimeProvider.invoke()).longValue();
        if (longValue == 0) {
            return 0L;
        }
        long longValue2 = ((Number) this.elapsedRealtimeProvider.invoke()).longValue();
        return Math.max(0L, (longValue2 - longValue) - currentAccumulatedBackgroundMs(longValue, longValue2));
    }

    public final void invoke() {
        sx5 sx5Var;
        Object value;
        Boolean bool;
        x44 x44Var = this.isRunning;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!sx5Var.j(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        if (!this.lifecycleDataSource.appIsForeground()) {
            this.isInBackground.set(true);
            long longValue = ((Number) this.initTimeProvider.invoke()).longValue();
            AtomicLong atomicLong = this.backgroundStartMs;
            if (longValue == 0) {
                longValue = ((Number) this.elapsedRealtimeProvider.invoke()).longValue();
            }
            atomicLong.set(longValue);
        }
        iv.G(new k52(this.lifecycleDataSource.getAppActive(), new AppForegroundDurationObserver$invoke$2(this, null), (byte) 2), this.scope);
    }

    public /* synthetic */ AppForegroundDurationObserver(LifecycleDataSource lifecycleDataSource, n11 n11Var, sb2 sb2Var, sb2 sb2Var2, int i, q71 q71Var) {
        this(lifecycleDataSource, n11Var, (i & 4) != 0 ? new t((byte) 26) : sb2Var, (i & 8) != 0 ? new t((byte) 27) : sb2Var2);
    }
}
