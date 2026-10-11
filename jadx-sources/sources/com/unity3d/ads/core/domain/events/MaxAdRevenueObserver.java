package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.reflection.AppLovinCommunicatorBridge;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MaxAdRevenueObserver {
    private static final String COMMUNICATOR_ID = "ilrd_observer";
    public static final Companion Companion = new Companion(null);
    private static final String MAX_REVENUE_EVENTS_TOPIC = "max_revenue_events";
    private final AppLovinCommunicatorBridge communicatorBridge;
    private final MaxAdRevenueCommunicatorProxyFactory communicatorProxyFactory;
    private Object communicatorSubscriber;
    private boolean isStarted;
    private final Logger logger;
    private final MaxAdRevenueListener revenueListener;
    private final SessionRepository sessionRepository;

    public MaxAdRevenueObserver(SessionRepository sessionRepository, Logger logger, AppLovinCommunicatorBridge appLovinCommunicatorBridge, MaxAdRevenueListener maxAdRevenueListener, MaxAdRevenueCommunicatorProxyFactory maxAdRevenueCommunicatorProxyFactory) {
        sessionRepository.getClass();
        logger.getClass();
        appLovinCommunicatorBridge.getClass();
        maxAdRevenueListener.getClass();
        maxAdRevenueCommunicatorProxyFactory.getClass();
        this.sessionRepository = sessionRepository;
        this.logger = logger;
        this.communicatorBridge = appLovinCommunicatorBridge;
        this.revenueListener = maxAdRevenueListener;
        this.communicatorProxyFactory = maxAdRevenueCommunicatorProxyFactory;
    }

    public final void invoke() {
        synchronized (this) {
            try {
                boolean collectIlrData = this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectIlrData();
                if (this.isStarted) {
                    Logger logger = this.logger;
                    if (!collectIlrData) {
                        Logger.DefaultImpls.trace$default(logger, "ILRD collection feature flag changed to disabled, stopping", null, 2, null);
                        stop();
                    } else {
                        Logger.DefaultImpls.trace$default(logger, "ILRD observer already started", null, 2, null);
                    }
                    return;
                }
                if (!collectIlrData) {
                    Logger.DefaultImpls.trace$default(this.logger, "ILRD collection feature flag is disabled", null, 2, null);
                    return;
                }
                try {
                    try {
                        Object subscribe = this.communicatorBridge.subscribe(this.communicatorProxyFactory.create(COMMUNICATOR_ID, MAX_REVENUE_EVENTS_TOPIC, new MaxAdRevenueObserver$invoke$1$proxy$1(this.revenueListener)), MAX_REVENUE_EVENTS_TOPIC);
                        if (subscribe != null) {
                            this.communicatorSubscriber = subscribe;
                            this.isStarted = true;
                            Logger.DefaultImpls.trace$default(this.logger, "Successfully started ad revenue automatic collection", null, 2, null);
                        } else {
                            Logger.DefaultImpls.trace$default(this.logger, "Mediation SDK not available, automatic collection not started", null, 2, null);
                        }
                    } catch (ClassNotFoundException unused) {
                        Logger.DefaultImpls.trace$default(this.logger, "Mediation SDK not found, skipping automatic collection", null, 2, null);
                    }
                } catch (NoSuchMethodException e) {
                    this.logger.trace("Communicator method not found, SDK version may be incompatible", e);
                } catch (Exception e2) {
                    this.logger.trace("Failed to start ad revenue collection", e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void stop() {
        synchronized (this) {
            if (!this.isStarted) {
                return;
            }
            Object obj = this.communicatorSubscriber;
            if (obj != null) {
                try {
                    this.communicatorBridge.unsubscribe(obj, MAX_REVENUE_EVENTS_TOPIC);
                    Logger.DefaultImpls.trace$default(this.logger, "Unsubscribed from revenue events", null, 2, null);
                } catch (Exception e) {
                    this.logger.trace("Failed to unsubscribe from revenue events", e);
                }
                this.communicatorSubscriber = null;
            }
            this.isStarted = false;
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
