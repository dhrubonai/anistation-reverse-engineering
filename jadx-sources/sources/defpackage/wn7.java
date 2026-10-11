package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface wn7 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(bo7 bo7Var);

    void getAppInstanceId(bo7 bo7Var);

    void getCachedAppInstanceId(bo7 bo7Var);

    void getConditionalUserProperties(String str, String str2, bo7 bo7Var);

    void getCurrentScreenClass(bo7 bo7Var);

    void getCurrentScreenName(bo7 bo7Var);

    void getGmpAppId(bo7 bo7Var);

    void getMaxUserProperties(String str, bo7 bo7Var);

    void getSessionId(bo7 bo7Var);

    void getTestFlag(bo7 bo7Var, int i);

    void getUserProperties(String str, String str2, boolean z, bo7 bo7Var);

    void initForTests(Map map);

    void initialize(tt2 tt2Var, so7 so7Var, long j);

    void initializeWithElapsedTime(tt2 tt2Var, so7 so7Var, long j, long j2);

    void isDataCollectionEnabled(bo7 bo7Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, bo7 bo7Var, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, tt2 tt2Var, tt2 tt2Var2, tt2 tt2Var3);

    void onActivityCreated(tt2 tt2Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(to7 to7Var, Bundle bundle, long j);

    void onActivityDestroyed(tt2 tt2Var, long j);

    void onActivityDestroyedByScionActivityInfo(to7 to7Var, long j);

    void onActivityPaused(tt2 tt2Var, long j);

    void onActivityPausedByScionActivityInfo(to7 to7Var, long j);

    void onActivityResumed(tt2 tt2Var, long j);

    void onActivityResumedByScionActivityInfo(to7 to7Var, long j);

    void onActivitySaveInstanceState(tt2 tt2Var, bo7 bo7Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(to7 to7Var, bo7 bo7Var, long j);

    void onActivityStarted(tt2 tt2Var, long j);

    void onActivityStartedByScionActivityInfo(to7 to7Var, long j);

    void onActivityStopped(tt2 tt2Var, long j);

    void onActivityStoppedByScionActivityInfo(to7 to7Var, long j);

    void performAction(Bundle bundle, bo7 bo7Var, long j);

    void registerOnMeasurementEventListener(go7 go7Var);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(eo7 eo7Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(tt2 tt2Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(to7 to7Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(go7 go7Var);

    void setInstanceIdProvider(ro7 ro7Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, tt2 tt2Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(go7 go7Var);
}
