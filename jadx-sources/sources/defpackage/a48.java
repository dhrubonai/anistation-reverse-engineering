package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a48 {
    public static final zk3 i = new zk3("FeatureUsageAnalytics", null);
    public static final String j = "22.3.1";
    public static a48 k;
    public final kv7 a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final h15 e = new h15(Looper.getMainLooper(), (byte) 4);
    public final la d = new la(this, (byte) 29);

    public a48(SharedPreferences sharedPreferences, kv7 kv7Var, String str) {
        this.b = sharedPreferences;
        this.a = kv7Var;
        this.c = str;
    }

    public static void a(f28 f28Var) {
        a48 a48Var;
        if (kv7.k && (a48Var = k) != null) {
            SharedPreferences sharedPreferences = a48Var.b;
            String num = Integer.toString(f28Var.x);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String l = zo5.l("feature_usage_timestamp_reported_feature_", num);
            if (!sharedPreferences.contains(l)) {
                l = zo5.l("feature_usage_timestamp_detected_feature_", num);
            }
            edit.putLong(l, System.currentTimeMillis()).apply();
            a48Var.f.add(f28Var);
            a48Var.e.post(a48Var.d);
        }
    }

    public static f28 c(String str) {
        switch (Integer.parseInt(str)) {
            case 0:
                return f28.DEVELOPER_FEATURE_FLAG_UNKNOWN;
            case 1:
                return f28.CAF_CAST_BUTTON;
            case 2:
                return f28.CAF_EXPANDED_CONTROLLER;
            case 3:
                return f28.CAF_MINI_CONTROLLER;
            case 4:
                return f28.CAF_CONTAINER_CONTROLLER;
            case 5:
                return f28.CAST_CONTEXT;
            case 6:
                return f28.IMAGE_CACHE;
            case 7:
                return f28.IMAGE_PICKER;
            case 8:
                return f28.AD_BREAK_PARSER;
            case 9:
                return f28.UI_STYLE;
            case 10:
                return f28.HARDWARE_VOLUME_BUTTON;
            case 11:
                return f28.NON_CAST_DEVICE_PROVIDER;
            case 12:
                return f28.PAUSE_CONTROLLER;
            case 13:
                return f28.SEEK_CONTROLLER;
            case 14:
                return f28.STREAM_VOLUME;
            case 15:
                return f28.UI_MEDIA_CONTROLLER;
            case 16:
                return f28.PLAYBACK_RATE_CONTROLLER;
            case 17:
                return f28.PRECACHE;
            case 18:
                return f28.INSTRUCTIONS_VIEW;
            case 19:
                return f28.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
            case 20:
                return f28.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
            case 21:
                return f28.OPTION_DISABLE_DISCOVERY_AUTOSTART;
            case 22:
                return f28.OPTION_DISABLE_ANALYTICS_LOGGING;
            case 23:
                return f28.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
            case 24:
                return f28.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
            case 25:
                return f28.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
            case 26:
                return f28.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
            case 27:
                return f28.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
            case 28:
                return f28.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
            case 29:
                return f28.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
            case 30:
                return f28.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
            case 31:
                return f28.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
            case 32:
                return f28.CAST_UNAVAILABLE_BUTTON_VISIBLE;
            case 33:
                return f28.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
            case 34:
                return f28.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                return f28.CAST_OUTPUT_SWITCHER_ENABLED;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                return f28.CAST_TRANSFER_TO_LOCAL_ENABLED;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                return f28.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                return f28.CAST_BUTTON_DELEGATE;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                return f28.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                return f28.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                return f28.CAST_TRANSFER_TO_LOCAL_USED;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                return f28.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                return f28.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                return f28.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                return f28.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                return f28.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                return f28.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                return f28.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                return f28.CAF_NOTIFICATION_SERVICE;
            case 50:
                return f28.HARDWARE_VOLUME_BUTTON_PRESS;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                return f28.CAST_SDK_DEFAULT_DEVICE_DIALOG;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                return f28.CAST_SDK_CUSTOM_DEVICE_DIALOG;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                return f28.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                return f28.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                return f28.CAF_MEDIA_NOTIFICATION_PROXY;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                return f28.REMOTE_CONNECTION_MANAGER_ACQUIRED;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                return f28.REMOTE_CONNECTION_CALLBACK_SET;
            default:
                return null;
        }
    }

    public final void b(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }
}
