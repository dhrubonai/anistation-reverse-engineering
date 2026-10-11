package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.l11;
import defpackage.ov3;
import defpackage.v11;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface SendDiagnosticEvent {
    public static final String APP_ACTIVE = "app_active";
    public static final String ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT = "attempt_insert_null_diagnostic_event";
    public static final String AVAILABLE = "available";
    public static final String AWAITED_INIT = "awaited_init";
    public static final String BANNER_DESTROYED = "native_banner_destroyed";
    public static final String BRIDGE_SEND_EVENT_FAILED = "bridge_send_event_failed";
    public static final String CACHE_SOURCE = "cache_source";
    public static final String COHERENCE_EXECUTE_WASM_TIME = "native_coherence_execute_wasm_time";
    public static final String COHERENCE_GET_COMMON_ATTRIBUTES_TIME = "native_coherence_get_common_attributes_time";
    public static final String COHERENCE_INIT_TIME = "native_coherence_init_time";
    public static final String COHERENCE_WARM_WASM_TIME = "native_coherence_warm_wasm_time";
    public static final String COMPLETE_STATE = "complete_state";
    public static final String COROUTINE_NAME = "coroutine_name";
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String EAGER_PRESHOW_PRELOAD_FAILURE_TIME = "native_eager_preshow_preload_failure_time";
    public static final String EAGER_PRESHOW_PRELOAD_SUCCESS_TIME = "native_eager_preshow_preload_success_time";
    public static final String GAME_ID = "game_id";
    public static final String IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
    public static final String INIT_DI_RESOLUTION_TIME = "native_init_di_resolution_time";
    public static final String INIT_GAME_ID_CHANGED = "native_initialize_game_id_changed";
    public static final String INIT_GAME_ID_SAME = "native_initialize_game_id_same";
    public static final String INIT_MISSED_NATIVE_PARSING = "native_initialize_missed_native_parsing";
    public static final String INIT_PAYLOAD_BUILD_TIME = "native_init_payload_build_time";
    public static final String INIT_TEST_MODE_CHANGED = "native_initialize_test_mode_changed";
    public static final String INIT_TEST_MODE_SAME = "native_initialize_test_mode_same";
    public static final String INIT_TOTAL_TIME = "native_init_total_time";
    public static final String INSTALL_REFERRAL_FETCH_COMPLETED = "install_referral_fetch_completed";
    public static final String INSTALL_REFERRAL_FETCH_FAILED = "install_referral_fetch_failed";
    public static final String INSTALL_REFERRAL_FETCH_TIMED_OUT = "install_referral_fetch_timed_out";
    public static final String IS_RETRY = "is_retry";
    public static final String KOTLIN_VERSION = "kotlin_version";
    public static final String LOAD_CONFIG_FAILURE_TIME = "native_load_config_failure_time";
    public static final String LOAD_CONFIG_SUCCESS_TIME = "native_load_config_success_time";
    public static final String MEDIATION_ADAPTER_VERSION = "mediation_adapter_version";
    public static final String MEDIATION_PROVIDER = "mediation_provider";
    public static final String MEDIATION_VERSION = "mediation_version";
    public static final String MODULES_INIT_ENABLED = "modules_init_enabled";
    public static final String MODULE_COUNT = "module_count";
    public static final String MODULE_NAME = "module_name";
    public static final String NETWORK_CLIENT = "network_client";
    public static final String NETWORK_FAILURE = "native_network_failure_time";
    public static final String NETWORK_PARSE = "native_network_parse_failure";
    public static final String NEW_API = "new_api";
    public static final String NULL_DIAGNOSTIC_EVENT = "null_diagnostic_event";
    public static final String OM_ACTIVATE_FAILURE = "om_activate_failure_time";
    public static final String OM_ACTIVATE_STARTED = "om_activate_started";
    public static final String OM_ACTIVATE_SUCCESS = "om_activate_success_time";
    public static final String OM_IMPRESSION_OCCURRED_FAILURE = "om_impression_occurred_failure";
    public static final String OM_IMPRESSION_OCCURRED_SUCCESS = "om_impression_occurred_success";
    public static final String OM_SESSION_FINISH_FAILURE = "om_session_finish_failure";
    public static final String OM_SESSION_FINISH_SUCCESS = "om_session_finish_success";
    public static final String OM_SESSION_START_FAILURE = "om_session_start_failure";
    public static final String OM_SESSION_START_SUCCESS = "om_session_start_success";
    public static final String OPERATION = "operation";
    public static final String PREVIOUS_GAME_ID = "previous_game_id";
    public static final String PREVIOUS_TEST_MODE = "previous_test_mode";
    public static final String PROTOCOL = "protocol";
    public static final String REASON = "reason";
    public static final String REASON_AD_MARKUP_PARSE = "invalid_admarkup";
    public static final String REASON_AD_OBJECT_EXPIRED = "ad_object_expired";
    public static final String REASON_AD_OBJECT_NOT_FOUND = "ad_object_not_found";
    public static final String REASON_AD_PLAYER_SCOPE = "ad_player_scope_not_active";
    public static final String REASON_AD_VIEWER = "adviewer";
    public static final String REASON_ALREADY_SHOWING = "already_showing";
    public static final String REASON_BACKGROUND_AGE_EXCEEDED = "background_age_exceeded";
    public static final String REASON_CODE = "reason_code";
    public static final String REASON_CONFIRM_TIMEOUT = "confirm_timeout";
    public static final String REASON_DEBUG = "reason_debug";
    public static final String REASON_FAILED = "failed";
    public static final String REASON_FOREGROUND_TIMEOUT = "foreground_timeout";
    public static final String REASON_GATEWAY = "gateway";
    public static final String REASON_HOST_MISMATCH = "host_mismatch";
    public static final String REASON_INVALID_ENTRY_POINT = "invalid_url";
    public static final String REASON_INVALID_GAME_ID = "invalid_game_id";
    public static final String REASON_LISTENER_NULL = "listener_null";
    public static final String REASON_NETWORK = "network";
    public static final String REASON_NOT_INITIALIZED = "not_initialized";
    public static final String REASON_NO_CONFIG = "no_config";
    public static final String REASON_NO_FILL = "no_fill";
    public static final String REASON_NO_WEBVIEW_ENTRY_POINT = "no_webview_entry_point";
    public static final String REASON_OM_ALREADY_ACTIVE = "om_already_active";
    public static final String REASON_OM_CREATIVE_TYPE_INVALID = "om_creative_type_invalid";
    public static final String REASON_OM_CREATIVE_TYPE_NULL = "om_creative_type_null";
    public static final String REASON_OM_NOT_ACTIVE = "om_not_active";
    public static final String REASON_OM_SESSION_ALREADY_EXISTS = "om_session_already_exists";
    public static final String REASON_OM_SESSION_NOT_FOUND = "om_session_not_found";
    public static final String REASON_OPPORTUNITY_ID = "no_opportunity_id";
    public static final String REASON_OPPORTUNITY_USED = "opportunity_id_used";
    public static final String REASON_PLACEMENT_NOT_LOADED = "placement_not_loaded";
    public static final String REASON_PLACEMENT_NULL = "placement_null";
    public static final String REASON_PLACEMENT_VALIDATION = "placement_validation";
    public static final String REASON_PROTOBUF_PARSING = "protobuf_parsing";
    public static final String REASON_TASK_REMOVED = "task_removed";
    public static final String REASON_TIMEOUT = "timeout";
    public static final String REASON_TIMEOUT_INITIALIZATION = "timeout_initialization";
    public static final String REASON_UNCAUGHT_EXCEPTION = "uncaught_exception";
    public static final String REASON_UNKNOWN = "unknown";
    public static final String REASON_WEBVIEWLESS_AD_NOT_FOUND = "webviewless_ad_not_found";
    public static final String REASON_WEBVIEW_LESS_SHOW_FAIL = "webview_less_show_fail";
    public static final String REASON_WEBVIEW_LESS_UNSUPPORTED = "webview_less_unsupported";
    public static final String REASON_WEBVIEW_RENDER_PROCESS_GONE = "webview_render_process_gone";
    public static final String RETRIES = "retries";
    public static final String SAME_SESSION = "same_session";
    public static final String SHOW_ACTIVITY_MISMATCH = "native_show_activity_mismatch";
    public static final String SHOW_ACTIVITY_NOT_AVAILABLE = "native_show_activity_not_available";
    public static final String SHOW_AD_VIEWER_FULLSCREEN = "native_show_ad_viewer_fullscreen";
    public static final String SHOW_CANCEL_TIMEOUT = "native_show_cancel_timeout";
    public static final String SHOW_CURRENT_ACTIVITY_NULL = "native_show_current_activity_null";
    public static final String SHOW_DISPLAY_EXTERNAL_DESTROY = "native_show_display_external_destroy";
    public static final String SHOW_DISPLAY_RECOVERY_ATTEMPT = "native_show_display_recovery_attempt";
    public static final String SHOW_DISPLAY_RECOVERY_FAILURE = "native_show_display_recovery_failure";
    public static final String SHOW_DISPLAY_RECOVERY_SUCCESS = "native_show_display_recovery_success";
    public static final String SHOW_IS_FILE_CACHED_FAILURE = "native_show_is_file_cached_failure_time";
    public static final String SHOW_IS_FILE_CACHED_SUCCESS = "native_show_is_file_cached_success_time";
    public static final String SHOW_START_ACTIVITY_RETRIED_WITH_CURRENT_ACTIVITY = "native_show_start_activity_retried_with_current_activity";
    public static final String SIZE_KB = "size_kb";
    public static final String SOURCE = "source";
    public static final String SOURCE_GET_TOKEN_API = "get_token";
    public static final String SOURCE_INIT_API = "init";
    public static final String SOURCE_LOAD_API = "load";
    public static final String SOURCE_PUBLIC_API = "api";
    public static final String SOURCE_SHOW_API = "show";
    public static final String STATE = "state";
    public static final String STATIC_DEVICE_INFO_BUILD_TIME = "native_static_device_info_build_time";
    public static final String SYNC = "sync";
    public static final String SYSTEM_CRONET_ENGINE_ERROR = "native_cronet_engine_error";
    public static final String SYSTEM_CRONET_FAILURE = "native_cronet_failure_time";
    public static final String SYSTEM_CRONET_FALLBACK_AVAILABLE = "native_cronet_fallback_available";
    public static final String SYSTEM_CRONET_INSTALL_ERROR = "native_cronet_install_error";
    public static final String SYSTEM_CRONET_SUCCESS = "native_cronet_success_time";
    public static final String SYSTEM_CRONET_TIMEOUT = "native_cronet_timeout";
    public static final String TEST_MODE = "test_mode";
    public static final String URL = "url";
    public static final String WARM_NON_INIT_SIGNALS_FAILURE_TIME = "native_warm_non_init_signals_failure_time";
    public static final String WARM_NON_INIT_SIGNALS_SUCCESS_TIME = "native_warm_non_init_signals_success_time";
    public static final String WEBVIEW_COULD_NOT_HANDLE_INTERCEPTED_URL = "webview_could_not_handle_intercepted_url";
    public static final String WEBVIEW_ERROR = "webview_error";
    public static final String WEBVIEW_ERROR_CODE = "webview_error_code";
    public static final String WEBVIEW_INVOCATION = "webview_invocation";
    public static final String WEBVIEW_INVOCATION_ERROR = "native_webview_invocation_error";
    public static final String WEBVIEW_LESS = "webviewless";
    public static final String WEBVIEW_LESS_AD_ACTIVITY_LAUNCHED = "native_webview_less_ad_activity_launched";
    public static final String WEBVIEW_LESS_AD_DISPLAY_STARTED = "native_webview_less_ad_display_started";
    public static final String WEBVIEW_LESS_ASSET_CACHE_FAIL = "native_webview_less_asset_cache_fail";
    public static final String WEBVIEW_LESS_ASSET_CACHE_TIMEOUT = "native_webview_less_asset_cache_timeout";
    public static final String WEBVIEW_LESS_SHOW_STARTED = "native_webview_less_show_started";
    public static final String WEBVIEW_PROBE_FAILURE = "native_webview_probe_failure";
    public static final String WEBVIEW_PROBE_TIME = "native_webview_probe_time";
    public static final String WEBVIEW_URL = "webview_url";

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String APP_ACTIVE = "app_active";
        public static final String ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT = "attempt_insert_null_diagnostic_event";
        public static final String AVAILABLE = "available";
        public static final String AWAITED_INIT = "awaited_init";
        public static final String BANNER_DESTROYED = "native_banner_destroyed";
        public static final String BRIDGE_SEND_EVENT_FAILED = "bridge_send_event_failed";
        public static final String CACHE_SOURCE = "cache_source";
        public static final String COHERENCE_EXECUTE_WASM_TIME = "native_coherence_execute_wasm_time";
        public static final String COHERENCE_GET_COMMON_ATTRIBUTES_TIME = "native_coherence_get_common_attributes_time";
        public static final String COHERENCE_INIT_TIME = "native_coherence_init_time";
        public static final String COHERENCE_WARM_WASM_TIME = "native_coherence_warm_wasm_time";
        public static final String COMPLETE_STATE = "complete_state";
        public static final String COROUTINE_NAME = "coroutine_name";
        public static final String EAGER_PRESHOW_PRELOAD_FAILURE_TIME = "native_eager_preshow_preload_failure_time";
        public static final String EAGER_PRESHOW_PRELOAD_SUCCESS_TIME = "native_eager_preshow_preload_success_time";
        public static final String GAME_ID = "game_id";
        public static final String IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
        public static final String INIT_DI_RESOLUTION_TIME = "native_init_di_resolution_time";
        public static final String INIT_GAME_ID_CHANGED = "native_initialize_game_id_changed";
        public static final String INIT_GAME_ID_SAME = "native_initialize_game_id_same";
        public static final String INIT_MISSED_NATIVE_PARSING = "native_initialize_missed_native_parsing";
        public static final String INIT_PAYLOAD_BUILD_TIME = "native_init_payload_build_time";
        public static final String INIT_TEST_MODE_CHANGED = "native_initialize_test_mode_changed";
        public static final String INIT_TEST_MODE_SAME = "native_initialize_test_mode_same";
        public static final String INIT_TOTAL_TIME = "native_init_total_time";
        public static final String INSTALL_REFERRAL_FETCH_COMPLETED = "install_referral_fetch_completed";
        public static final String INSTALL_REFERRAL_FETCH_FAILED = "install_referral_fetch_failed";
        public static final String INSTALL_REFERRAL_FETCH_TIMED_OUT = "install_referral_fetch_timed_out";
        public static final String IS_RETRY = "is_retry";
        public static final String KOTLIN_VERSION = "kotlin_version";
        public static final String LOAD_CONFIG_FAILURE_TIME = "native_load_config_failure_time";
        public static final String LOAD_CONFIG_SUCCESS_TIME = "native_load_config_success_time";
        public static final String MEDIATION_ADAPTER_VERSION = "mediation_adapter_version";
        public static final String MEDIATION_PROVIDER = "mediation_provider";
        public static final String MEDIATION_VERSION = "mediation_version";
        public static final String MODULES_INIT_ENABLED = "modules_init_enabled";
        public static final String MODULE_COUNT = "module_count";
        public static final String MODULE_NAME = "module_name";
        public static final String NETWORK_CLIENT = "network_client";
        public static final String NETWORK_FAILURE = "native_network_failure_time";
        public static final String NETWORK_PARSE = "native_network_parse_failure";
        public static final String NEW_API = "new_api";
        public static final String NULL_DIAGNOSTIC_EVENT = "null_diagnostic_event";
        public static final String OM_ACTIVATE_FAILURE = "om_activate_failure_time";
        public static final String OM_ACTIVATE_STARTED = "om_activate_started";
        public static final String OM_ACTIVATE_SUCCESS = "om_activate_success_time";
        public static final String OM_IMPRESSION_OCCURRED_FAILURE = "om_impression_occurred_failure";
        public static final String OM_IMPRESSION_OCCURRED_SUCCESS = "om_impression_occurred_success";
        public static final String OM_SESSION_FINISH_FAILURE = "om_session_finish_failure";
        public static final String OM_SESSION_FINISH_SUCCESS = "om_session_finish_success";
        public static final String OM_SESSION_START_FAILURE = "om_session_start_failure";
        public static final String OM_SESSION_START_SUCCESS = "om_session_start_success";
        public static final String OPERATION = "operation";
        public static final String PREVIOUS_GAME_ID = "previous_game_id";
        public static final String PREVIOUS_TEST_MODE = "previous_test_mode";
        public static final String PROTOCOL = "protocol";
        public static final String REASON = "reason";
        public static final String REASON_AD_MARKUP_PARSE = "invalid_admarkup";
        public static final String REASON_AD_OBJECT_EXPIRED = "ad_object_expired";
        public static final String REASON_AD_OBJECT_NOT_FOUND = "ad_object_not_found";
        public static final String REASON_AD_PLAYER_SCOPE = "ad_player_scope_not_active";
        public static final String REASON_AD_VIEWER = "adviewer";
        public static final String REASON_ALREADY_SHOWING = "already_showing";
        public static final String REASON_BACKGROUND_AGE_EXCEEDED = "background_age_exceeded";
        public static final String REASON_CODE = "reason_code";
        public static final String REASON_CONFIRM_TIMEOUT = "confirm_timeout";
        public static final String REASON_DEBUG = "reason_debug";
        public static final String REASON_FAILED = "failed";
        public static final String REASON_FOREGROUND_TIMEOUT = "foreground_timeout";
        public static final String REASON_GATEWAY = "gateway";
        public static final String REASON_HOST_MISMATCH = "host_mismatch";
        public static final String REASON_INVALID_ENTRY_POINT = "invalid_url";
        public static final String REASON_INVALID_GAME_ID = "invalid_game_id";
        public static final String REASON_LISTENER_NULL = "listener_null";
        public static final String REASON_NETWORK = "network";
        public static final String REASON_NOT_INITIALIZED = "not_initialized";
        public static final String REASON_NO_CONFIG = "no_config";
        public static final String REASON_NO_FILL = "no_fill";
        public static final String REASON_NO_WEBVIEW_ENTRY_POINT = "no_webview_entry_point";
        public static final String REASON_OM_ALREADY_ACTIVE = "om_already_active";
        public static final String REASON_OM_CREATIVE_TYPE_INVALID = "om_creative_type_invalid";
        public static final String REASON_OM_CREATIVE_TYPE_NULL = "om_creative_type_null";
        public static final String REASON_OM_NOT_ACTIVE = "om_not_active";
        public static final String REASON_OM_SESSION_ALREADY_EXISTS = "om_session_already_exists";
        public static final String REASON_OM_SESSION_NOT_FOUND = "om_session_not_found";
        public static final String REASON_OPPORTUNITY_ID = "no_opportunity_id";
        public static final String REASON_OPPORTUNITY_USED = "opportunity_id_used";
        public static final String REASON_PLACEMENT_NOT_LOADED = "placement_not_loaded";
        public static final String REASON_PLACEMENT_NULL = "placement_null";
        public static final String REASON_PLACEMENT_VALIDATION = "placement_validation";
        public static final String REASON_PROTOBUF_PARSING = "protobuf_parsing";
        public static final String REASON_TASK_REMOVED = "task_removed";
        public static final String REASON_TIMEOUT = "timeout";
        public static final String REASON_TIMEOUT_INITIALIZATION = "timeout_initialization";
        public static final String REASON_UNCAUGHT_EXCEPTION = "uncaught_exception";
        public static final String REASON_UNKNOWN = "unknown";
        public static final String REASON_WEBVIEWLESS_AD_NOT_FOUND = "webviewless_ad_not_found";
        public static final String REASON_WEBVIEW_LESS_SHOW_FAIL = "webview_less_show_fail";
        public static final String REASON_WEBVIEW_LESS_UNSUPPORTED = "webview_less_unsupported";
        public static final String REASON_WEBVIEW_RENDER_PROCESS_GONE = "webview_render_process_gone";
        public static final String RETRIES = "retries";
        public static final String SAME_SESSION = "same_session";
        public static final String SHOW_ACTIVITY_MISMATCH = "native_show_activity_mismatch";
        public static final String SHOW_ACTIVITY_NOT_AVAILABLE = "native_show_activity_not_available";
        public static final String SHOW_AD_VIEWER_FULLSCREEN = "native_show_ad_viewer_fullscreen";
        public static final String SHOW_CANCEL_TIMEOUT = "native_show_cancel_timeout";
        public static final String SHOW_CURRENT_ACTIVITY_NULL = "native_show_current_activity_null";
        public static final String SHOW_DISPLAY_EXTERNAL_DESTROY = "native_show_display_external_destroy";
        public static final String SHOW_DISPLAY_RECOVERY_ATTEMPT = "native_show_display_recovery_attempt";
        public static final String SHOW_DISPLAY_RECOVERY_FAILURE = "native_show_display_recovery_failure";
        public static final String SHOW_DISPLAY_RECOVERY_SUCCESS = "native_show_display_recovery_success";
        public static final String SHOW_IS_FILE_CACHED_FAILURE = "native_show_is_file_cached_failure_time";
        public static final String SHOW_IS_FILE_CACHED_SUCCESS = "native_show_is_file_cached_success_time";
        public static final String SHOW_START_ACTIVITY_RETRIED_WITH_CURRENT_ACTIVITY = "native_show_start_activity_retried_with_current_activity";
        public static final String SIZE_KB = "size_kb";
        public static final String SOURCE = "source";
        public static final String SOURCE_GET_TOKEN_API = "get_token";
        public static final String SOURCE_INIT_API = "init";
        public static final String SOURCE_LOAD_API = "load";
        public static final String SOURCE_PUBLIC_API = "api";
        public static final String SOURCE_SHOW_API = "show";
        public static final String STATE = "state";
        public static final String STATIC_DEVICE_INFO_BUILD_TIME = "native_static_device_info_build_time";
        public static final String SYNC = "sync";
        public static final String SYSTEM_CRONET_ENGINE_ERROR = "native_cronet_engine_error";
        public static final String SYSTEM_CRONET_FAILURE = "native_cronet_failure_time";
        public static final String SYSTEM_CRONET_FALLBACK_AVAILABLE = "native_cronet_fallback_available";
        public static final String SYSTEM_CRONET_INSTALL_ERROR = "native_cronet_install_error";
        public static final String SYSTEM_CRONET_SUCCESS = "native_cronet_success_time";
        public static final String SYSTEM_CRONET_TIMEOUT = "native_cronet_timeout";
        public static final String TEST_MODE = "test_mode";
        public static final String URL = "url";
        public static final String WARM_NON_INIT_SIGNALS_FAILURE_TIME = "native_warm_non_init_signals_failure_time";
        public static final String WARM_NON_INIT_SIGNALS_SUCCESS_TIME = "native_warm_non_init_signals_success_time";
        public static final String WEBVIEW_COULD_NOT_HANDLE_INTERCEPTED_URL = "webview_could_not_handle_intercepted_url";
        public static final String WEBVIEW_ERROR = "webview_error";
        public static final String WEBVIEW_ERROR_CODE = "webview_error_code";
        public static final String WEBVIEW_INVOCATION = "webview_invocation";
        public static final String WEBVIEW_INVOCATION_ERROR = "native_webview_invocation_error";
        public static final String WEBVIEW_LESS = "webviewless";
        public static final String WEBVIEW_LESS_AD_ACTIVITY_LAUNCHED = "native_webview_less_ad_activity_launched";
        public static final String WEBVIEW_LESS_AD_DISPLAY_STARTED = "native_webview_less_ad_display_started";
        public static final String WEBVIEW_LESS_ASSET_CACHE_FAIL = "native_webview_less_asset_cache_fail";
        public static final String WEBVIEW_LESS_ASSET_CACHE_TIMEOUT = "native_webview_less_asset_cache_timeout";
        public static final String WEBVIEW_LESS_SHOW_STARTED = "native_webview_less_show_started";
        public static final String WEBVIEW_PROBE_FAILURE = "native_webview_probe_failure";
        public static final String WEBVIEW_PROBE_TIME = "native_webview_probe_time";
        public static final String WEBVIEW_URL = "webview_url";

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes.dex */
        public static final class NoScopeCoroutineScope implements v11 {
            public static final NoScopeCoroutineScope INSTANCE = new NoScopeCoroutineScope();

            private NoScopeCoroutineScope() {
            }

            @Override // defpackage.v11
            public l11 getCoroutineContext() {
                throw new IllegalStateException("Scope access not allowed for temporary diagnostic AdObjects");
            }
        }

        private Companion() {
        }

        public static /* synthetic */ AdObject getTmpAdObjectForEventSending$default(Companion companion, ByteString byteString, String str, boolean z, UnityAdsLoadOptions unityAdsLoadOptions, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                unityAdsLoadOptions = new UnityAdsLoadOptions();
            }
            UnityAdsLoadOptions unityAdsLoadOptions2 = unityAdsLoadOptions;
            if ((i & 16) != 0) {
                diagnosticAdType = DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED;
            }
            return companion.getTmpAdObjectForEventSending(byteString, str, z2, unityAdsLoadOptions2, diagnosticAdType);
        }

        public final AdObject getTmpAdObjectForEventSending(ByteString byteString, String str, boolean z, UnityAdsLoadOptions unityAdsLoadOptions, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
            String str2;
            byteString.getClass();
            unityAdsLoadOptions.getClass();
            diagnosticAdType.getClass();
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            ByteString byteString2 = ByteString.EMPTY;
            byteString2.getClass();
            return new AdObject(NoScopeCoroutineScope.INSTANCE, byteString, str2, byteString2, false, null, null, null, unityAdsLoadOptions, z, diagnosticAdType, null, null, null, null, null, null, 129200, null);
        }
    }

    void invoke(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num, ByteString byteString, MediationInfo mediationInfo);

    void invoke(String str, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num, ByteString byteString, MediationInfo mediationInfo);

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void invoke$default(SendDiagnosticEvent sendDiagnosticEvent, String str, Double d, Map map, Map map2, AdObject adObject, Integer num, ByteString byteString, MediationInfo mediationInfo, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    d = null;
                }
                if ((i & 4) != 0) {
                    map = null;
                }
                if ((i & 8) != 0) {
                    map2 = null;
                }
                if ((i & 16) != 0) {
                    adObject = null;
                }
                if ((i & 32) != 0) {
                    num = null;
                }
                if ((i & 64) != 0) {
                    byteString = null;
                }
                if ((i & 128) != 0) {
                    mediationInfo = null;
                }
                sendDiagnosticEvent.invoke(str, d, (Map<String, String>) map, (Map<String, Integer>) map2, adObject, num, byteString, mediationInfo);
                return;
            }
            ov3.g("Super calls with default arguments not supported in this target, function: invoke");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void invoke$default(SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, Double d, Map map, Map map2, AdObject adObject, Integer num, ByteString byteString, MediationInfo mediationInfo, int i, Object obj) {
            if (obj != null) {
                ov3.g("Super calls with default arguments not supported in this target, function: invoke");
                return;
            }
            if ((i & 2) != 0) {
                d = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                map2 = null;
            }
            if ((i & 16) != 0) {
                adObject = null;
            }
            if ((i & 32) != 0) {
                num = null;
            }
            if ((i & 64) != 0) {
                byteString = null;
            }
            if ((i & 128) != 0) {
                mediationInfo = null;
            }
            sendDiagnosticEvent.invoke(diagnosticEventType, d, (Map<String, String>) map, (Map<String, Integer>) map2, adObject, num, byteString, mediationInfo);
        }
    }
}
