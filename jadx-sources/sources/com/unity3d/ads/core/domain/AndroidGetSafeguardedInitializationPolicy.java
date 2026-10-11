package com.unity3d.ads.core.domain;

import com.unity3d.services.UnityAdsConstants;
import defpackage.db;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AndroidGetSafeguardedInitializationPolicy implements GetSafeguardedInitializationPolicy {
    @Override // com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy
    public NativeConfigurationOuterClass.RequestPolicy invoke(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        requestPolicy.getClass();
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder builder = requestPolicy.toBuilder();
        builder.getClass();
        RequestPolicyKt.Dsl _create = companion._create(builder);
        NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = _create.getRetryPolicy();
        RequestRetryPolicyKt.Dsl.Companion companion2 = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder2 = retryPolicy.toBuilder();
        builder2.getClass();
        RequestRetryPolicyKt.Dsl _create2 = companion2._create(builder2);
        int maxDuration = _create2.getMaxDuration();
        if (maxDuration < 5000) {
            maxDuration = 5000;
        }
        _create2.setMaxDuration(maxDuration);
        int retryWaitBase = _create2.getRetryWaitBase();
        int i = 0;
        if (retryWaitBase < 0) {
            retryWaitBase = 0;
        }
        _create2.setRetryWaitBase(retryWaitBase);
        int retryMaxInterval = _create2.getRetryMaxInterval();
        if (retryMaxInterval >= 0) {
            i = retryMaxInterval;
        }
        _create2.setRetryMaxInterval(i);
        float retryScalingFactor = _create2.getRetryScalingFactor();
        if (retryScalingFactor < 0.1f) {
            retryScalingFactor = 0.1f;
        }
        _create2.setRetryScalingFactor(retryScalingFactor);
        _create2.setRetryJitterPct(db.B(_create2.getRetryJitterPct(), 0.0f, 100.0f));
        _create.setRetryPolicy(_create2._build());
        NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = _create.getTimeoutPolicy();
        RequestTimeoutPolicyKt.Dsl.Companion companion3 = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder3 = timeoutPolicy.toBuilder();
        builder3.getClass();
        RequestTimeoutPolicyKt.Dsl _create3 = companion3._create(builder3);
        int connectTimeoutMs = _create3.getConnectTimeoutMs();
        int i2 = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
        if (connectTimeoutMs < 1000) {
            connectTimeoutMs = 1000;
        }
        _create3.setConnectTimeoutMs(connectTimeoutMs);
        int readTimeoutMs = _create3.getReadTimeoutMs();
        if (readTimeoutMs < 1000) {
            readTimeoutMs = 1000;
        }
        _create3.setReadTimeoutMs(readTimeoutMs);
        int writeTimeoutMs = _create3.getWriteTimeoutMs();
        if (writeTimeoutMs < 1000) {
            writeTimeoutMs = 1000;
        }
        _create3.setWriteTimeoutMs(writeTimeoutMs);
        int overallTimeoutMs = _create3.getOverallTimeoutMs();
        if (overallTimeoutMs >= 1000) {
            i2 = overallTimeoutMs;
        }
        _create3.setOverallTimeoutMs(i2);
        _create.setTimeoutPolicy(_create3._build());
        return _create._build();
    }
}
