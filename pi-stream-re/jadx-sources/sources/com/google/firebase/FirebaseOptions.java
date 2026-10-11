package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import p7.a0;
import z3.e;

/* loaded from: classes.dex */
public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    /* loaded from: classes.dex */
    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        public Builder() {
        }

        public Builder(FirebaseOptions firebaseOptions) {
            this.applicationId = firebaseOptions.applicationId;
            this.apiKey = firebaseOptions.apiKey;
            this.databaseUrl = firebaseOptions.databaseUrl;
            this.gaTrackingId = firebaseOptions.gaTrackingId;
            this.gcmSenderId = firebaseOptions.gcmSenderId;
            this.storageBucket = firebaseOptions.storageBucket;
            this.projectId = firebaseOptions.projectId;
        }

        public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
        }

        public Builder setApiKey(String str) {
            w7.b.n("ApiKey must be set.", str);
            this.apiKey = str;
            return this;
        }

        public Builder setApplicationId(String str) {
            w7.b.n("ApplicationId must be set.", str);
            this.applicationId = str;
            return this;
        }

        public Builder setDatabaseUrl(String str) {
            this.databaseUrl = str;
            return this;
        }

        public Builder setGaTrackingId(String str) {
            this.gaTrackingId = str;
            return this;
        }

        public Builder setGcmSenderId(String str) {
            this.gcmSenderId = str;
            return this;
        }

        public Builder setProjectId(String str) {
            this.projectId = str;
            return this;
        }

        public Builder setStorageBucket(String str) {
            this.storageBucket = str;
            return this;
        }
    }

    public static FirebaseOptions fromResource(Context context) {
        e eVar = new e(context);
        String x9 = eVar.x(APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(x9)) {
            return null;
        }
        return new FirebaseOptions(x9, eVar.x(API_KEY_RESOURCE_NAME), eVar.x(DATABASE_URL_RESOURCE_NAME), eVar.x(GA_TRACKING_ID_RESOURCE_NAME), eVar.x(GCM_SENDER_ID_RESOURCE_NAME), eVar.x(STORAGE_BUCKET_RESOURCE_NAME), eVar.x(PROJECT_ID_RESOURCE_NAME));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        if (!a0.q(this.applicationId, firebaseOptions.applicationId) || !a0.q(this.apiKey, firebaseOptions.apiKey) || !a0.q(this.databaseUrl, firebaseOptions.databaseUrl) || !a0.q(this.gaTrackingId, firebaseOptions.gaTrackingId) || !a0.q(this.gcmSenderId, firebaseOptions.gcmSenderId) || !a0.q(this.storageBucket, firebaseOptions.storageBucket) || !a0.q(this.projectId, firebaseOptions.projectId)) {
            return false;
        }
        return true;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    public String getGaTrackingId() {
        return this.gaTrackingId;
    }

    public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getStorageBucket() {
        return this.storageBucket;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId});
    }

    public String toString() {
        e eVar = new e(this);
        eVar.f(this.applicationId, "applicationId");
        eVar.f(this.apiKey, "apiKey");
        eVar.f(this.databaseUrl, "databaseUrl");
        eVar.f(this.gcmSenderId, "gcmSenderId");
        eVar.f(this.storageBucket, "storageBucket");
        eVar.f(this.projectId, "projectId");
        return eVar.toString();
    }

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = i5.b.f5385a;
        w7.b.v("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.applicationId = str;
        this.apiKey = str2;
        this.databaseUrl = str3;
        this.gaTrackingId = str4;
        this.gcmSenderId = str5;
        this.storageBucket = str6;
        this.projectId = str7;
    }
}
