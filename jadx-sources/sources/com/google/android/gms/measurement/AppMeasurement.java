package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.a34;
import defpackage.cc7;
import defpackage.gu7;
import defpackage.in7;
import defpackage.nl7;
import defpackage.qs5;
import defpackage.rx7;
import defpackage.so7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {
    public static volatile AppMeasurement b;
    public final in7 a;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(gu7 gu7Var) {
        this.a = new cc7(gu7Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (b == null) {
            synchronized (AppMeasurement.class) {
                if (b == null) {
                    rx7 rx7Var = (rx7) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (rx7Var != null) {
                        b = new AppMeasurement(rx7Var);
                    } else {
                        b = new AppMeasurement(gu7.q(context, new so7(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return b;
    }

    public void beginAdUnitExposure(String str) {
        this.a.f(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.h(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.a.d(str);
    }

    public long generateEventId() {
        return this.a.g();
    }

    public String getAppInstanceId() {
        return this.a.k();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty, java.lang.Object] */
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List<Bundle> i = this.a.i(str, str2);
        if (i == null) {
            size = 0;
        } else {
            size = i.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : i) {
            ?? obj = new Object();
            a34.x(bundle);
            obj.mAppId = (String) qs5.j(bundle, "app_id", String.class, null);
            obj.mOrigin = (String) qs5.j(bundle, "origin", String.class, null);
            obj.mName = (String) qs5.j(bundle, MediationMetaData.KEY_NAME, String.class, null);
            obj.mValue = qs5.j(bundle, "value", Object.class, null);
            obj.mTriggerEventName = (String) qs5.j(bundle, "trigger_event_name", String.class, null);
            obj.mTriggerTimeout = ((Long) qs5.j(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.mTimedOutEventName = (String) qs5.j(bundle, "timed_out_event_name", String.class, null);
            obj.mTimedOutEventParams = (Bundle) qs5.j(bundle, "timed_out_event_params", Bundle.class, null);
            obj.mTriggeredEventName = (String) qs5.j(bundle, "triggered_event_name", String.class, null);
            obj.mTriggeredEventParams = (Bundle) qs5.j(bundle, "triggered_event_params", Bundle.class, null);
            obj.mTimeToLive = ((Long) qs5.j(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.mExpiredEventName = (String) qs5.j(bundle, "expired_event_name", String.class, null);
            obj.mExpiredEventParams = (Bundle) qs5.j(bundle, "expired_event_params", Bundle.class, null);
            obj.mActive = ((Boolean) qs5.j(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mCreationTimestamp = ((Long) qs5.j(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.mTriggeredTimestamp = ((Long) qs5.j(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.a.b();
    }

    public String getCurrentScreenName() {
        return this.a.a();
    }

    public String getGmpAppId() {
        return this.a.l();
    }

    public int getMaxUserProperties(String str) {
        return this.a.j(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.a.m(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.a.e(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        a34.x(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(MediationMetaData.KEY_NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            qs5.i(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.a.c(bundle);
    }

    public AppMeasurement(rx7 rx7Var) {
        this.a = new nl7(rx7Var);
    }
}
