package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import defpackage.q71;
import defpackage.sb2;
import defpackage.t;
import defpackage.yo0;
import gatewayprotocol.v1.AccelerometerSampleKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AccelerometerRepository {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_MAX_SAMPLES = 50;
    public static final int DEFAULT_SAMPLING_INTERVAL_MS = 100;
    private static final long NANOS_PER_MS = 1000000;
    private final ArrayDeque<DynamicDeviceInfoOuterClass.AccelerometerSample> buffer;
    private final Context context;
    private Long lastAcceptedNanos;
    private final Logger logger;
    private int maxSamples;
    private final sb2 nanoTimeProvider;
    private final AtomicBoolean running;
    private long samplingIntervalNanos;
    private final AccelerometerRepository$sensorListener$1 sensorListener;
    private final SessionRepository sessionRepository;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.unity3d.ads.core.data.repository.AccelerometerRepository$sensorListener$1] */
    public AccelerometerRepository(Context context, SessionRepository sessionRepository, Logger logger, sb2 sb2Var) {
        context.getClass();
        sessionRepository.getClass();
        logger.getClass();
        sb2Var.getClass();
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.logger = logger;
        this.nanoTimeProvider = sb2Var;
        this.running = new AtomicBoolean(false);
        this.maxSamples = 50;
        this.buffer = new ArrayDeque<>(50);
        this.samplingIntervalNanos = 100000000L;
        this.sensorListener = new SensorEventListener() { // from class: com.unity3d.ads.core.data.repository.AccelerometerRepository$sensorListener$1
            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                sb2 sb2Var2;
                boolean shouldAccept;
                if (sensorEvent != null) {
                    AccelerometerRepository accelerometerRepository = AccelerometerRepository.this;
                    sb2Var2 = accelerometerRepository.nanoTimeProvider;
                    shouldAccept = accelerometerRepository.shouldAccept(((Number) sb2Var2.invoke()).longValue());
                    if (!shouldAccept) {
                        return;
                    }
                    AccelerometerRepository accelerometerRepository2 = AccelerometerRepository.this;
                    AccelerometerSampleKt.Dsl.Companion companion = AccelerometerSampleKt.Dsl.Companion;
                    DynamicDeviceInfoOuterClass.AccelerometerSample.Builder newBuilder = DynamicDeviceInfoOuterClass.AccelerometerSample.newBuilder();
                    newBuilder.getClass();
                    AccelerometerSampleKt.Dsl _create = companion._create(newBuilder);
                    _create.setClientTimestamp(TimestampExtensionsKt.fromMillis(System.currentTimeMillis()));
                    _create.setX(sensorEvent.values[0]);
                    _create.setY(sensorEvent.values[1]);
                    _create.setZ(sensorEvent.values[2]);
                    accelerometerRepository2.record(_create._build());
                }
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }
        };
    }

    public static final long _init_$lambda$0() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public final void record(DynamicDeviceInfoOuterClass.AccelerometerSample accelerometerSample) {
        synchronized (this.buffer) {
            while (true) {
                try {
                    int size = this.buffer.size();
                    int i = this.maxSamples;
                    ArrayDeque<DynamicDeviceInfoOuterClass.AccelerometerSample> arrayDeque = this.buffer;
                    if (size >= i) {
                        arrayDeque.pollFirst();
                    } else {
                        arrayDeque.addLast(accelerometerSample);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean shouldAccept(long j) {
        synchronized (this.buffer) {
            Long l = this.lastAcceptedNanos;
            if (l != null && j - l.longValue() < this.samplingIntervalNanos) {
                return false;
            }
            this.lastAcceptedNanos = Long.valueOf(j);
            return true;
        }
    }

    public final List<DynamicDeviceInfoOuterClass.AccelerometerSample> drainSamples() {
        List<DynamicDeviceInfoOuterClass.AccelerometerSample> I0;
        synchronized (this.buffer) {
            I0 = yo0.I0(this.buffer);
            this.buffer.clear();
        }
        return I0;
    }

    public final void recordSampleForTest$unity_ads_defaultRelease(DynamicDeviceInfoOuterClass.AccelerometerSample accelerometerSample) {
        accelerometerSample.getClass();
        record(accelerometerSample);
    }

    public final void recordThrottledSampleForTest$unity_ads_defaultRelease(DynamicDeviceInfoOuterClass.AccelerometerSample accelerometerSample) {
        accelerometerSample.getClass();
        if (shouldAccept(((Number) this.nanoTimeProvider.invoke()).longValue())) {
            record(accelerometerSample);
        }
    }

    public final void start() {
        int i;
        int i2;
        SensorManager sensorManager;
        if (!this.running.get()) {
            synchronized (this.buffer) {
                this.buffer.clear();
                this.lastAcceptedNanos = null;
            }
            if (this.sessionRepository.isNativeConfigReady()) {
                NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this.sessionRepository.getNativeConfiguration();
                if (nativeConfiguration.getFeatureFlags().getCollectAccelerometer()) {
                    NativeConfigurationOuterClass.AccelerometerCollectionConfiguration accelerometerCollection = nativeConfiguration.getAccelerometerCollection();
                    Integer valueOf = Integer.valueOf(accelerometerCollection.getSamplingIntervalMs());
                    if (valueOf.intValue() <= 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        i = valueOf.intValue();
                    } else {
                        i = 100;
                    }
                    Integer valueOf2 = Integer.valueOf(accelerometerCollection.getMaxSamples());
                    if (valueOf2.intValue() <= 0) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        i2 = valueOf2.intValue();
                    } else {
                        i2 = 50;
                    }
                    synchronized (this.buffer) {
                        this.maxSamples = i2;
                        this.samplingIntervalNanos = i * NANOS_PER_MS;
                    }
                    Object systemService = this.context.getSystemService("sensor");
                    if (systemService instanceof SensorManager) {
                        sensorManager = (SensorManager) systemService;
                    } else {
                        sensorManager = null;
                    }
                    if (sensorManager == null) {
                        Logger.DefaultImpls.error$default(this.logger, "AccelerometerRepository: SENSOR_SERVICE unavailable", null, 2, null);
                        return;
                    }
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    if (defaultSensor == null) {
                        Logger.DefaultImpls.error$default(this.logger, "AccelerometerRepository: TYPE_ACCELEROMETER sensor unavailable", null, 2, null);
                        return;
                    }
                    boolean z = false;
                    try {
                        z = sensorManager.registerListener(this.sensorListener, defaultSensor, i * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
                    } catch (IllegalArgumentException e) {
                        this.logger.error("AccelerometerRepository: registerListener rejected arguments", e);
                    } catch (SecurityException e2) {
                        this.logger.error("AccelerometerRepository: registerListener denied", e2);
                    }
                    this.running.set(z);
                    if (!z) {
                        Logger.DefaultImpls.error$default(this.logger, "AccelerometerRepository: registerListener failed", null, 2, null);
                    }
                }
            }
        }
    }

    public final void stop() {
        SensorManager sensorManager;
        if (this.running.getAndSet(false)) {
            Object systemService = this.context.getSystemService("sensor");
            if (systemService instanceof SensorManager) {
                sensorManager = (SensorManager) systemService;
            } else {
                sensorManager = null;
            }
            if (sensorManager == null) {
                return;
            }
            try {
                sensorManager.unregisterListener(this.sensorListener);
            } catch (IllegalArgumentException e) {
                this.logger.error("AccelerometerRepository: unregisterListener rejected arguments", e);
            }
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

    public /* synthetic */ AccelerometerRepository(Context context, SessionRepository sessionRepository, Logger logger, sb2 sb2Var, int i, q71 q71Var) {
        this(context, sessionRepository, logger, (i & 8) != 0 ? new t((byte) 1) : sb2Var);
    }
}
