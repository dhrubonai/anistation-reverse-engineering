package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fl7 extends j18 {
    public static final String[] C = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] D = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] E = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] F = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] G = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] H = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] I = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] J = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] K = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] L = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] M = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final cl7 A;
    public final d42 B;

    public fl7(z18 z18Var) {
        super(z18Var);
        this.B = new d42(((gu7) this.x).H);
        ak7 ak7Var = ((gu7) this.x).A;
        this.A = new cl7(this, ((gu7) this.x).x);
    }

    public static final String q0(List list) {
        if (list.isEmpty()) {
            return "";
        }
        return qx1.m(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void y0(ContentValues contentValues, Object obj) {
        a34.u("value");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            ze0.k("Invalid value type");
        }
    }

    public final void A0() {
        M();
        C0().setTransactionSuccessful();
    }

    public final void B0() {
        M();
        C0().endTransaction();
    }

    public final SQLiteDatabase C0() {
        L();
        try {
            return this.A.getWritableDatabase();
        } catch (SQLiteException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.F.b(e, "Error opening database");
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r2.moveToNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r2.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r1 = r2.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        r1 = l0("events", r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        m0("events_snapshot", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "events_snapshot"
            r12.n0(r0, r13)
            java.lang.String r1 = "name"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.C0()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.String r4 = "events"
            r11 = 0
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.Object[] r1 = r1.toArray(r5)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            r5 = r1
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L61
        L2f:
            java.lang.String r1 = r2.getString(r11)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L46
            java.lang.String r3 = "events"
            dm7 r1 = r12.l0(r3, r13, r1)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L46
            r12.m0(r0, r1)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            goto L46
        L41:
            r0 = move-exception
            r12 = r0
            goto L67
        L44:
            r0 = move-exception
            goto L4d
        L46:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 != 0) goto L2f
            goto L61
        L4d:
            java.lang.Object r12 = r12.x     // Catch: java.lang.Throwable -> L41
            gu7 r12 = (defpackage.gu7) r12     // Catch: java.lang.Throwable -> L41
            es7 r12 = r12.C     // Catch: java.lang.Throwable -> L41
            defpackage.gu7.l(r12)     // Catch: java.lang.Throwable -> L41
            bs7 r12 = r12.C     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Error creating snapshot. appId"
            cs7 r13 = defpackage.es7.P(r13)     // Catch: java.lang.Throwable -> L41
            r12.c(r1, r13, r0)     // Catch: java.lang.Throwable -> L41
        L61:
            if (r2 == 0) goto L66
            r2.close()
        L66:
            return
        L67:
            if (r2 == 0) goto L6c
            r2.close()
        L6c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.D0(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        m0("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.E0(java.lang.String):void");
    }

    public final void F0(String str, String str2) {
        a34.u(str);
        a34.u(str2);
        L();
        M();
        try {
            C0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            gu7 gu7Var = (gu7) this.x;
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.d("Error deleting user property. appId", es7.P(str), gu7Var.G.c(str2), e);
        }
    }

    public final boolean G0(g28 g28Var) {
        gu7 gu7Var = (gu7) this.x;
        String str = g28Var.b;
        L();
        M();
        String str2 = g28Var.a;
        String str3 = g28Var.c;
        if (H0(str2, str3) == null) {
            if (i28.L0(str3)) {
                if (h0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(gu7Var.A.U(str2, tq7.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long h0 = h0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                ak7 ak7Var = gu7Var.A;
                if (h0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put(MediationMetaData.KEY_NAME, str3);
        contentValues.put("set_timestamp", Long.valueOf(g28Var.d));
        y0(contentValues, g28Var.e);
        try {
            if (C0().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.C.b(es7.P(str2), "Failed to insert/update user property (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.C.c("Error storing user property. appId", es7.P(str2), e);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.g28 H0(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.x
            r1 = r0
            gu7 r1 = (defpackage.gu7) r1
            defpackage.a34.u(r12)
            defpackage.a34.u(r13)
            r11.L()
            r11.M()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.C0()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.Y(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r11 = 2
            java.lang.String r6 = r3.getString(r11)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            g28 r4 = new g28     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r11 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r11 == 0) goto L6d
            es7 r11 = r1.C     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            defpackage.gu7.l(r11)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            bs7 r11 = r11.C     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            cs7 r13 = defpackage.es7.P(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r11.b(r13, r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r11 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r11 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r11 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r11 = r0
            r3 = r2
        L7f:
            es7 r12 = r1.C     // Catch: java.lang.Throwable -> L67
            defpackage.gu7.l(r12)     // Catch: java.lang.Throwable -> L67
            bs7 r12 = r12.C     // Catch: java.lang.Throwable -> L67
            java.lang.String r13 = "Error querying user property. appId"
            cs7 r0 = defpackage.es7.P(r5)     // Catch: java.lang.Throwable -> L67
            vr7 r1 = r1.G     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.c(r7)     // Catch: java.lang.Throwable -> L67
            r12.d(r13, r0, r1, r11)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.H0(java.lang.String, java.lang.String):g28");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List I0(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.x
            r1 = r0
            gu7 r1 = (defpackage.gu7) r1
            defpackage.a34.u(r13)
            r12.L()
            r12.M()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1000"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r12.C0()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            java.lang.String r9 = "rowid"
            ak7 r7 = r1.A     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            if (r2 == 0) goto L9d
        L3e:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            r2 = 1
            java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            if (r2 != 0) goto L4c
            java.lang.String r2 = ""
        L4c:
            r5 = r2
            goto L52
        L4e:
            r0 = move-exception
            r12 = r0
            r4 = r13
            goto L8b
        L52:
            r2 = 2
            long r7 = r11.getLong(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            r2 = 3
            java.lang.Object r9 = r12.Y(r11, r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            if (r9 != 0) goto L73
            es7 r2 = r1.C     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L70
            defpackage.gu7.l(r2)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L70
            bs7 r2 = r2.C     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L70
            java.lang.String r3 = "Read invalid user property value, ignoring it. appId"
            cs7 r4 = defpackage.es7.P(r13)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L70
            r2.b(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L70
            r4 = r13
            goto L7c
        L70:
            r0 = move-exception
            r12 = r0
            goto La3
        L73:
            g28 r3 = new g28     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L88
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            r0.add(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
        L7c:
            boolean r13 = r11.moveToNext()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            if (r13 != 0) goto L83
            goto L9d
        L83:
            r13 = r4
            goto L3e
        L85:
            r0 = move-exception
        L86:
            r12 = r0
            goto L8b
        L88:
            r0 = move-exception
            r4 = r13
            goto L86
        L8b:
            es7 r13 = r1.C     // Catch: java.lang.Throwable -> L70
            defpackage.gu7.l(r13)     // Catch: java.lang.Throwable -> L70
            bs7 r13 = r13.C     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "Error querying user properties. appId"
            cs7 r1 = defpackage.es7.P(r4)     // Catch: java.lang.Throwable -> L70
            r13.c(r0, r1, r12)     // Catch: java.lang.Throwable -> L70
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L70
        L9d:
            if (r11 == 0) goto La2
            r11.close()
        La2:
            return r0
        La3:
            if (r11 == 0) goto La8
            r11.close()
        La8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.I0(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        defpackage.gu7.l(r13);
        r13.C.b(java.lang.Integer.valueOf(com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT), "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List J0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.J0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean K0(yh7 yh7Var) {
        gu7 gu7Var = (gu7) this.x;
        L();
        M();
        String str = yh7Var.x;
        a34.x(str);
        if (H0(str, yh7Var.z.y) == null) {
            long h0 = h0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            ak7 ak7Var = gu7Var.A;
            if (h0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", yh7Var.y);
        contentValues.put(MediationMetaData.KEY_NAME, yh7Var.z.y);
        Object c = yh7Var.z.c();
        a34.x(c);
        y0(contentValues, c);
        contentValues.put("active", Boolean.valueOf(yh7Var.B));
        contentValues.put("trigger_event_name", yh7Var.C);
        contentValues.put("trigger_timeout", Long.valueOf(yh7Var.E));
        mm7 mm7Var = yh7Var.D;
        i28 i28Var = gu7Var.F;
        es7 es7Var = gu7Var.C;
        gu7.j(i28Var);
        contentValues.put("timed_out_event", i28.u0(mm7Var));
        contentValues.put("creation_timestamp", Long.valueOf(yh7Var.A));
        gu7.j(i28Var);
        contentValues.put("triggered_event", i28.u0(yh7Var.F));
        contentValues.put("triggered_timestamp", Long.valueOf(yh7Var.z.z));
        contentValues.put("time_to_live", Long.valueOf(yh7Var.G));
        contentValues.put("expired_event", i28.u0(yh7Var.H));
        try {
            if (C0().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                gu7.l(es7Var);
                es7Var.C.b(es7.P(str), "Failed to insert/update conditional user property (got -1)");
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            gu7.l(es7Var);
            es7Var.C.c("Error storing conditional user property", es7.P(str), e);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:37:0x00f0 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yh7 L0(java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.L0(java.lang.String, java.lang.String):yh7");
    }

    public final void M0(String str, String str2) {
        a34.u(str);
        a34.u(str2);
        L();
        M();
        try {
            C0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            gu7 gu7Var = (gu7) this.x;
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.d("Error deleting conditional property", es7.P(str), gu7Var.G.c(str2), e);
        }
    }

    public final List N0(String str, String str2, String str3) {
        a34.u(str);
        L();
        M();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return O0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // defpackage.j18
    public final void O() {
        gu7 gu7Var = (gu7) this.x;
        if (gu7Var.A.W(null, tq7.e1)) {
            au7 au7Var = gu7Var.D;
            gu7.l(au7Var);
            au7Var.U(new la((Object) this, (byte) 14));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008c, code lost:
    
        r20 = r12.getString(5);
        r22 = r12.getLong(6);
        r3 = r28.y.D;
        defpackage.z18.T(r3);
        r4 = r12.getBlob(7);
        r5 = defpackage.mm7.CREATOR;
        r21 = (defpackage.mm7) r3.o0(r4, r5);
        r17 = r12.getLong(8);
        defpackage.z18.T(r3);
        r24 = (defpackage.mm7) r3.o0(r12.getBlob(9), r5);
        r6 = r12.getLong(10);
        r25 = r12.getLong(11);
        defpackage.z18.T(r3);
        r2.add(new defpackage.yh7(r14, r15, new defpackage.e28(r6, r8, r9, r15), r17, r19, r20, r21, r22, r24, r25, (defpackage.mm7) r3.o0(r12.getBlob(12), r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f7, code lost:
    
        if (r12.moveToNext() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r0 = r1.C;
        defpackage.gu7.l(r0);
        r0.C.b(java.lang.Integer.valueOf(com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT), "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004a, code lost:
    
        if (r12.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        if (r2.size() < 1000) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006c, code lost:
    
        r14 = r12.getString(0);
        r15 = r12.getString(1);
        r9 = r12.getString(2);
        r8 = Y(r12, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0085, code lost:
    
        if (r12.getInt(4) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0087, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List O0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.O0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final long P(String str, eu7 eu7Var, String str2, Map map, cy7 cy7Var, Long l) {
        int delete;
        gu7 gu7Var = (gu7) this.x;
        L();
        M();
        a34.x(eu7Var);
        a34.u(str);
        L();
        M();
        if (w0()) {
            z18 z18Var = this.y;
            long g = z18Var.F.C.g();
            pk2 pk2Var = gu7Var.H;
            es7 es7Var = gu7Var.C;
            pk2Var.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - g) > ((Long) tq7.M.a(null)).longValue()) {
                z18Var.F.C.h(elapsedRealtime);
                L();
                M();
                if (w0() && (delete = C0().delete("upload_queue", p0(), new String[0])) > 0) {
                    gu7.l(es7Var);
                    es7Var.K.b(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                a34.u(str);
                L();
                M();
                try {
                    int U = gu7Var.A.U(str, tq7.A);
                    if (U > 0) {
                        C0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(U)});
                    }
                } catch (SQLiteException e) {
                    gu7.l(es7Var);
                    es7Var.C.c("Error deleting over the limit queued batches. appId", es7.P(str), e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] a = eu7Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", a);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(cy7Var.x));
        pk2 pk2Var2 = gu7Var.H;
        es7 es7Var2 = gu7Var.C;
        pk2Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long insert = C0().insert("upload_queue", null, contentValues);
            if (insert == -1) {
                gu7.l(es7Var2);
                es7Var2.C.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
                return -1L;
            }
            return insert;
        } catch (SQLiteException e2) {
            gu7.l(es7Var2);
            es7Var2.C.c("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0401  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ns7 P0(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.P0(java.lang.String):ns7");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List Q(String str, e18 e18Var, int i) {
        ?? r0;
        String str2;
        a34.u(str);
        L();
        M();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase C0 = C0();
                String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
                String q0 = q0(e18Var.x);
                String p0 = p0();
                StringBuilder sb = new StringBuilder(q0.length() + 17 + p0.length());
                sb.append("app_id=?");
                sb.append(q0);
                sb.append(" AND NOT ");
                sb.append(p0);
                String sb2 = sb.toString();
                String[] strArr2 = {str};
                if (i > 0) {
                    str2 = String.valueOf(i);
                } else {
                    str2 = null;
                }
                cursor = C0.query("upload_queue", strArr, sb2, strArr2, null, null, "creation_timestamp ASC", str2);
                r0 = new ArrayList();
                while (cursor.moveToNext()) {
                    b28 o0 = o0(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                    if (o0 != null) {
                        r0.add(o0);
                    }
                }
            } catch (SQLiteException e) {
                es7 es7Var = ((gu7) this.x).C;
                gu7.l(es7Var);
                es7Var.C.c("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                r0 = Collections.EMPTY_LIST;
            }
            return r0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final void Q0(ns7 ns7Var, boolean z) {
        gu7 gu7Var = (gu7) this.x;
        gu7 gu7Var2 = ns7Var.a;
        L();
        M();
        String E2 = ns7Var.E();
        a34.x(E2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", E2);
        wv7 wv7Var = wv7.ANALYTICS_STORAGE;
        z18 z18Var = this.y;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (z18Var.a(E2).i(wv7Var)) {
            contentValues.put("app_instance_id", ns7Var.F());
        }
        contentValues.put("gmp_app_id", ns7Var.H());
        if (z18Var.a(E2).i(wv7.AD_STORAGE)) {
            au7 au7Var = gu7Var2.D;
            gu7.l(au7Var);
            au7Var.L();
            contentValues.put("resettable_device_id_hash", ns7Var.e);
        }
        au7 au7Var2 = gu7Var2.D;
        gu7.l(au7Var2);
        au7Var2.L();
        contentValues.put("last_bundle_index", Long.valueOf(ns7Var.g));
        au7 au7Var3 = gu7Var2.D;
        gu7.l(au7Var3);
        au7Var3.L();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(ns7Var.h));
        au7 au7Var4 = gu7Var2.D;
        gu7.l(au7Var4);
        au7Var4.L();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(ns7Var.i));
        contentValues.put("app_version", ns7Var.O());
        au7 au7Var5 = gu7Var2.D;
        gu7.l(au7Var5);
        au7Var5.L();
        contentValues.put("app_store", ns7Var.l);
        au7 au7Var6 = gu7Var2.D;
        gu7.l(au7Var6);
        au7Var6.L();
        contentValues.put("gmp_version", Long.valueOf(ns7Var.m));
        au7 au7Var7 = gu7Var2.D;
        gu7.l(au7Var7);
        au7Var7.L();
        contentValues.put("dev_cert_hash", Long.valueOf(ns7Var.n));
        au7 au7Var8 = gu7Var2.D;
        gu7.l(au7Var8);
        au7Var8.L();
        contentValues.put("measurement_enabled", Boolean.valueOf(ns7Var.o));
        au7 au7Var9 = gu7Var2.D;
        au7 au7Var10 = gu7Var2.D;
        gu7.l(au7Var9);
        au7Var9.L();
        contentValues.put("day", Long.valueOf(ns7Var.K));
        gu7.l(au7Var10);
        au7Var10.L();
        contentValues.put("daily_public_events_count", Long.valueOf(ns7Var.L));
        gu7.l(au7Var10);
        au7Var10.L();
        contentValues.put("daily_events_count", Long.valueOf(ns7Var.M));
        gu7.l(au7Var10);
        au7Var10.L();
        contentValues.put("daily_conversions_count", Long.valueOf(ns7Var.N));
        au7 au7Var11 = gu7Var2.D;
        gu7.l(au7Var11);
        au7Var11.L();
        contentValues.put("config_fetched_time", Long.valueOf(ns7Var.S));
        au7 au7Var12 = gu7Var2.D;
        gu7.l(au7Var12);
        au7Var12.L();
        contentValues.put("failed_config_fetch_time", Long.valueOf(ns7Var.T));
        contentValues.put("app_version_int", Long.valueOf(ns7Var.Q()));
        contentValues.put("firebase_instance_id", ns7Var.K());
        gu7.l(au7Var10);
        au7Var10.L();
        contentValues.put("daily_error_events_count", Long.valueOf(ns7Var.O));
        gu7.l(au7Var10);
        au7Var10.L();
        contentValues.put("daily_realtime_events_count", Long.valueOf(ns7Var.P));
        gu7.l(au7Var10);
        au7Var10.L();
        contentValues.put("health_monitor_sample", ns7Var.Q);
        contentValues.put("android_id", (Long) 0L);
        au7 au7Var13 = gu7Var2.D;
        gu7.l(au7Var13);
        au7Var13.L();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(ns7Var.p));
        contentValues.put("dynamite_version", Long.valueOf(ns7Var.b()));
        if (z18Var.a(E2).i(wv7Var)) {
            au7 au7Var14 = gu7Var2.D;
            gu7.l(au7Var14);
            au7Var14.L();
            contentValues.put("session_stitching_token", ns7Var.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(ns7Var.z()));
        au7 au7Var15 = gu7Var2.D;
        gu7.l(au7Var15);
        au7Var15.L();
        contentValues.put("target_os_version", Long.valueOf(ns7Var.v));
        au7 au7Var16 = gu7Var2.D;
        gu7.l(au7Var16);
        au7Var16.L();
        contentValues.put("session_stitching_token_hash", Long.valueOf(ns7Var.w));
        yi7.a();
        ak7 ak7Var = gu7Var.A;
        es7 es7Var = gu7Var.C;
        if (ak7Var.W(E2, tq7.O0)) {
            au7 au7Var17 = gu7Var2.D;
            gu7.l(au7Var17);
            au7Var17.L();
            contentValues.put("ad_services_version", Integer.valueOf(ns7Var.x));
            au7 au7Var18 = gu7Var2.D;
            gu7.l(au7Var18);
            au7Var18.L();
            contentValues.put("attribution_eligibility_status", Long.valueOf(ns7Var.B));
        }
        au7 au7Var19 = gu7Var2.D;
        gu7.l(au7Var19);
        au7Var19.L();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(ns7Var.y));
        contentValues.put("npa_metadata_value", ns7Var.x());
        au7 au7Var20 = gu7Var2.D;
        gu7.l(au7Var20);
        au7Var20.L();
        contentValues.put("bundle_delivery_index", Long.valueOf(ns7Var.F));
        contentValues.put("sgtm_preview_key", ns7Var.D());
        gu7.l(au7Var10);
        au7Var10.L();
        contentValues.put("dma_consent_state", Integer.valueOf(ns7Var.D));
        gu7.l(au7Var10);
        au7Var10.L();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(ns7Var.E));
        contentValues.put("serialized_npa_metadata", ns7Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(ns7Var.t()));
        au7 au7Var21 = gu7Var2.D;
        gu7.l(au7Var21);
        au7Var21.L();
        ArrayList arrayList = ns7Var.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                gu7.l(es7Var);
                es7Var.F.b(E2, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (ak7Var.W(null, tq7.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        au7 au7Var22 = gu7Var2.D;
        gu7.l(au7Var22);
        au7Var22.L();
        contentValues.put("unmatched_pfo", ns7Var.z);
        au7 au7Var23 = gu7Var2.D;
        gu7.l(au7Var23);
        au7Var23.L();
        contentValues.put("unmatched_uwa", ns7Var.A);
        au7 au7Var24 = gu7Var2.D;
        gu7.l(au7Var24);
        au7Var24.L();
        contentValues.put("ad_campaign_info", ns7Var.H);
        if (ak7Var.W(E2, tq7.j1)) {
            au7 au7Var25 = gu7Var2.D;
            gu7.l(au7Var25);
            au7Var25.L();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(ns7Var.J));
        }
        try {
            SQLiteDatabase C0 = C0();
            if (C0.update("apps", contentValues, "app_id = ?", new String[]{E2}) == 0 && C0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                gu7.l(es7Var);
                es7Var.C.b(es7.P(E2), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            gu7.l(es7Var);
            es7Var.C.c("Error storing app. appId", es7.P(E2), e);
        }
    }

    public final boolean R(String str) {
        cy7[] cy7VarArr = {cy7.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(cy7VarArr[0].x));
        String q0 = q0(arrayList);
        String p0 = p0();
        if (h0(h11.l(new StringBuilder(q0.length() + 61 + p0.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", q0, " AND NOT ", p0), new String[]{str}) != 0) {
            return true;
        }
        return false;
    }

    public final rk7 R0(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return S0(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final void S(Long l) {
        gu7 gu7Var = (gu7) this.x;
        L();
        M();
        try {
            if (C0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.F.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.C.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rk7] */
    public final rk7 S0(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        gu7 gu7Var = (gu7) this.x;
        a34.u(str);
        L();
        M();
        String[] strArr = {str};
        ?? obj = new Object();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase C0 = C0();
                cursor = C0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    es7 es7Var = gu7Var.C;
                    gu7.l(es7Var);
                    es7Var.F.b(es7.P(str), "Not updating daily counts, app is not known. appId");
                } else {
                    if (cursor.getLong(0) == j) {
                        obj.b = cursor.getLong(1);
                        obj.a = cursor.getLong(2);
                        obj.c = cursor.getLong(3);
                        obj.d = cursor.getLong(4);
                        obj.e = cursor.getLong(5);
                        obj.f = cursor.getLong(6);
                        obj.g = cursor.getLong(7);
                    }
                    if (z) {
                        obj.b += j2;
                    }
                    if (z2) {
                        obj.a += j2;
                    }
                    if (z3) {
                        obj.c += j2;
                    }
                    if (z4) {
                        obj.d += j2;
                    }
                    if (z5) {
                        obj.e += j2;
                    }
                    if (z6) {
                        obj.f += j2;
                    }
                    if (z7) {
                        obj.g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(obj.a));
                    contentValues.put("daily_events_count", Long.valueOf(obj.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(obj.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(obj.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(obj.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(obj.g));
                    C0.update("apps", contentValues, "app_id=?", strArr);
                }
            } catch (SQLiteException e) {
                es7 es7Var2 = gu7Var.C;
                gu7.l(es7Var2);
                es7Var2.C.c("Error updating daily counts. appId", es7.P(str), e);
            }
            if (cursor != null) {
                cursor.close();
            }
            return obj;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String T() {
        /*
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.C0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L35
            r2 = 0
            java.lang.String r4 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r4
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L25
        L1e:
            r1 = r0
            goto L3b
        L20:
            r4 = move-exception
            goto L3b
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            java.lang.Object r4 = r4.x     // Catch: java.lang.Throwable -> L1a
            gu7 r4 = (defpackage.gu7) r4     // Catch: java.lang.Throwable -> L1a
            es7 r4 = r4.C     // Catch: java.lang.Throwable -> L1a
            defpackage.gu7.l(r4)     // Catch: java.lang.Throwable -> L1a
            bs7 r4 = r4.C     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "Database error getting next bundle app id"
            r4.b(r2, r3)     // Catch: java.lang.Throwable -> L1a
        L35:
            if (r0 == 0) goto L3a
            r0.close()
        L3a:
            return r1
        L3b:
            if (r1 == 0) goto L40
            r1.close()
        L40:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.T():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l87 T0(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.x
            r1 = r0
            gu7 r1 = (defpackage.gu7) r1
            defpackage.a34.u(r12)
            r11.L()
            r11.M()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.C0()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L70
            java.lang.String r4 = "apps"
            java.lang.String r11 = "remote_config"
            java.lang.String r0 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r11, r0, r5}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L70
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L70
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r11 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L70
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L83
        L33:
            r0 = 0
            byte[] r0 = r11.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3 = 1
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 2
            java.lang.String r5 = r11.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r11.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            es7 r6 = r1.C     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            defpackage.gu7.l(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            bs7 r6 = r6.C     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            cs7 r8 = defpackage.es7.P(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.b(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6a
        L5c:
            r0 = move-exception
            goto L73
        L5e:
            if (r0 != 0) goto L61
            goto L83
        L61:
            l87 r6 = new l87     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.<init>(r0, r3, r5, r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r11.close()
            return r6
        L6a:
            r2 = r11
            goto L89
        L6c:
            r0 = move-exception
            r11 = r0
            r12 = r11
            goto L89
        L70:
            r0 = move-exception
            r11 = r0
            r11 = r2
        L73:
            es7 r1 = r1.C     // Catch: java.lang.Throwable -> L59
            defpackage.gu7.l(r1)     // Catch: java.lang.Throwable -> L59
            bs7 r1 = r1.C     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "Error querying remote config. appId"
            cs7 r12 = defpackage.es7.P(r12)     // Catch: java.lang.Throwable -> L59
            r1.c(r3, r12, r0)     // Catch: java.lang.Throwable -> L59
        L83:
            if (r11 == 0) goto L88
            r11.close()
        L88:
            return r2
        L89:
            if (r2 == 0) goto L8e
            r2.close()
        L8e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.T0(java.lang.String):l87");
    }

    public final void U(long j) {
        L();
        M();
        try {
            if (C0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.C.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void U0(iu7 iu7Var, boolean z) {
        L();
        M();
        a34.u(iu7Var.r());
        if (iu7Var.e2()) {
            V();
            gu7 gu7Var = (gu7) this.x;
            pk2 pk2Var = gu7Var.H;
            es7 es7Var = gu7Var.C;
            pk2Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long f2 = iu7Var.f2();
            sq7 sq7Var = tq7.R;
            if (f2 < currentTimeMillis - ((Long) sq7Var.a(null)).longValue() || iu7Var.f2() > ((Long) sq7Var.a(null)).longValue() + currentTimeMillis) {
                gu7.l(es7Var);
                es7Var.F.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", es7.P(iu7Var.r()), Long.valueOf(currentTimeMillis), Long.valueOf(iu7Var.f2()));
            }
            byte[] a = iu7Var.a();
            try {
                c28 c28Var = this.y.D;
                z18.T(c28Var);
                byte[] v0 = c28Var.v0(a);
                gu7.l(es7Var);
                es7Var.K.b(Integer.valueOf(v0.length), "Saving bundle, size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", iu7Var.r());
                contentValues.put("bundle_end_timestamp", Long.valueOf(iu7Var.f2()));
                contentValues.put("data", v0);
                contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
                if (iu7Var.r0()) {
                    contentValues.put("retry_count", Integer.valueOf(iu7Var.s0()));
                }
                try {
                    if (C0().insert("queue", null, contentValues) == -1) {
                        gu7.l(es7Var);
                        es7Var.C.b(es7.P(iu7Var.r()), "Failed to insert bundle (got -1). appId");
                        return;
                    }
                    return;
                } catch (SQLiteException e) {
                    gu7.l(es7Var);
                    es7Var.C.c("Error storing bundle. appId", es7.P(iu7Var.r()), e);
                    return;
                }
            } catch (IOException e2) {
                gu7.l(es7Var);
                es7Var.C.c("Data loss. Failed to serialize bundle. appId", es7.P(iu7Var.r()), e2);
                return;
            }
        }
        p65.l();
    }

    public final void V() {
        L();
        M();
        if (w0()) {
            z18 z18Var = this.y;
            long g = z18Var.F.B.g();
            gu7 gu7Var = (gu7) this.x;
            gu7Var.H.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - g) > ((Long) tq7.M.a(null)).longValue()) {
                z18Var.F.B.h(elapsedRealtime);
                L();
                M();
                if (w0()) {
                    SQLiteDatabase C0 = C0();
                    gu7Var.H.getClass();
                    int delete = C0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) tq7.R.a(null)).longValue())});
                    if (delete > 0) {
                        es7 es7Var = gu7Var.C;
                        gu7.l(es7Var);
                        es7Var.K.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void W(ArrayList arrayList) {
        gu7 gu7Var = (gu7) this.x;
        L();
        M();
        a34.x(arrayList);
        if (arrayList.size() != 0) {
            if (!w0()) {
                return;
            }
            String join = TextUtils.join(",", arrayList);
            String q = qx1.q(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (h0(qx1.q(new StringBuilder(q.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", q, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.F.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase C0 = C0();
                StringBuilder sb = new StringBuilder(q.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(q);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                C0.execSQL(sb.toString());
                return;
            } catch (SQLiteException e) {
                es7 es7Var2 = gu7Var.C;
                gu7.l(es7Var2);
                es7Var2.C.b(e, "Error incrementing retry count. error");
                return;
            }
        }
        ze0.k("Given Integer is zero");
    }

    public final void X(Long l) {
        gu7 gu7Var = (gu7) this.x;
        L();
        M();
        if (!w0()) {
            return;
        }
        StringBuilder sb = new StringBuilder(l.toString().length() + 86);
        sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
        sb.append(l);
        sb.append(" AND retry_count =  2147483647 LIMIT 1");
        if (h0(sb.toString(), null) > 0) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.F.a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            SQLiteDatabase C0 = C0();
            gu7Var.H.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
            sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
            sb2.append(currentTimeMillis);
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l.toString().length() + 29);
            sb4.append("UPDATE upload_queue");
            sb4.append(sb3);
            sb4.append(" WHERE rowid = ");
            sb4.append(l);
            sb4.append(" AND retry_count < 2147483647");
            C0.execSQL(sb4.toString());
        } catch (SQLiteException e) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.C.b(e, "Error incrementing retry count. error");
        }
    }

    public final Object Y(Cursor cursor, int i) {
        gu7 gu7Var = (gu7) this.x;
        int type = cursor.getType(i);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            es7 es7Var = gu7Var.C;
                            gu7.l(es7Var);
                            es7Var.C.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        es7 es7Var2 = gu7Var.C;
                        gu7.l(es7Var2);
                        es7Var2.C.a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i);
                }
                return Double.valueOf(cursor.getDouble(i));
            }
            return Long.valueOf(cursor.getLong(i));
        }
        es7 es7Var3 = gu7Var.C;
        gu7.l(es7Var3);
        es7Var3.C.a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r0 = r0.C;
        defpackage.gu7.l(r0);
        r0.C.d("Error inserting column. appId", defpackage.es7.P(r14), "first_open_count", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Z(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.x
            gu7 r0 = (defpackage.gu7) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            defpackage.a34.u(r14)
            java.lang.String r2 = "first_open_count"
            defpackage.a34.u(r2)
            r13.L()
            r13.M()
            android.database.sqlite.SQLiteDatabase r3 = r13.C0()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.i0(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r1 = "app2"
            java.lang.String r6 = "app_id"
            if (r13 != 0) goto L72
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r13.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r13.put(r6, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r13.put(r2, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r10 = "previous_install_count"
            r13.put(r10, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r1, r9, r13, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 != 0) goto L71
            es7 r13 = r0.C     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            defpackage.gu7.l(r13)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            bs7 r13 = r13.C     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = "Failed to insert column (got -1). appId"
            cs7 r6 = defpackage.es7.P(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r13.c(r1, r6, r2)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r13 = move-exception
            goto Lc1
        L6f:
            r13 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r13.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r13.put(r6, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r13.put(r2, r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r11 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r13 = r3.update(r1, r13, r6, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r13     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 != 0) goto La6
            es7 r13 = r0.C     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            defpackage.gu7.l(r13)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            bs7 r13 = r13.C     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r1 = "Failed to update column (got 0). appId"
            cs7 r4 = defpackage.es7.P(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r13.c(r1, r4, r2)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            goto Lbd
        La4:
            r13 = move-exception
            goto Lab
        La6:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r7 = r9
            goto Lbd
        Lab:
            r4 = r9
        Lac:
            es7 r0 = r0.C     // Catch: java.lang.Throwable -> L6d
            defpackage.gu7.l(r0)     // Catch: java.lang.Throwable -> L6d
            bs7 r0 = r0.C     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "Error inserting column. appId"
            cs7 r14 = defpackage.es7.P(r14)     // Catch: java.lang.Throwable -> L6d
            r0.d(r1, r14, r2, r13)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.Z(java.lang.String):long");
    }

    public final boolean a0(String str, String str2) {
        if (h0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0) {
            return true;
        }
        return false;
    }

    public final void b0(List list) {
        a34.x(list);
        L();
        M();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int delete = C0().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.C.c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public final long c0(String str) {
        a34.u(str);
        return i0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void d0(String str, Long l, long j, mt7 mt7Var) {
        L();
        M();
        a34.x(mt7Var);
        a34.u(str);
        gu7 gu7Var = (gu7) this.x;
        byte[] a = mt7Var.a();
        es7 es7Var = gu7Var.C;
        es7 es7Var2 = gu7Var.C;
        gu7.l(es7Var);
        es7Var.K.c("Saving complex main event, appId, data size", gu7Var.G.a(str), Integer.valueOf(a.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", a);
        try {
            if (C0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                gu7.l(es7Var2);
                es7Var2.C.b(es7.P(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            gu7.l(es7Var2);
            es7Var2.C.c("Error storing complex main event. appId", es7.P(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c5 A[Catch: SQLiteException -> 0x02e1, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x02e1, blocks: (B:78:0x02aa, B:80:0x02c5), top: B:77:0x02aa }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fd  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wv] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, wv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(java.lang.String r27, java.lang.Long r28, java.lang.String r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.e0(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r3 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v0, types: [fl7, j18, qt0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xv7 f0(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.x
            gu7 r0 = (defpackage.gu7) r0
            defpackage.a34.x(r4)
            r3.L()
            r3.M()
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r3.C0()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r3 = r3.rawQuery(r1, r4)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r4 != 0) goto L36
            es7 r4 = r0.C     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            defpackage.gu7.l(r4)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            bs7 r4 = r4.K     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r1 = "No data found"
            r4.a(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r3.close()
            goto L5c
        L32:
            r4 = move-exception
            goto L45
        L34:
            r4 = move-exception
            goto L4d
        L36:
            r4 = 0
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r1 = 1
            int r1 = r3.getInt(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            xv7 r2 = defpackage.xv7.c(r1, r4)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r3
            goto L62
        L47:
            r3 = move-exception
            r4 = r3
            goto L62
        L4a:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L4d:
            es7 r0 = r0.C     // Catch: java.lang.Throwable -> L32
            defpackage.gu7.l(r0)     // Catch: java.lang.Throwable -> L32
            bs7 r0 = r0.C     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Error querying database."
            r0.b(r4, r1)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            xv7 r3 = defpackage.xv7.c
            return r3
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.f0(java.lang.String):xv7");
    }

    public final void g0(String str, x08 x08Var) {
        L();
        M();
        a34.u(str);
        gu7 gu7Var = (gu7) this.x;
        pk2 pk2Var = gu7Var.H;
        es7 es7Var = gu7Var.C;
        pk2Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        sq7 sq7Var = tq7.u0;
        long longValue = currentTimeMillis - ((Long) sq7Var.a(null)).longValue();
        long j = x08Var.y;
        if (j < longValue || j > ((Long) sq7Var.a(null)).longValue() + currentTimeMillis) {
            gu7.l(es7Var);
            es7Var.F.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", es7.P(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        gu7.l(es7Var);
        es7Var.K.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", x08Var.x);
        contentValues.put("source", Integer.valueOf(x08Var.z));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (C0().insert("trigger_uris", null, contentValues) == -1) {
                gu7.l(es7Var);
                es7Var.C.b(es7.P(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            gu7.l(es7Var);
            es7Var.C.c("Error storing trigger URI. appId", es7.P(str), e);
        }
    }

    public final long h0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = C0().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                es7 es7Var = ((gu7) this.x).C;
                gu7.l(es7Var);
                es7Var.C.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long i0(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = C0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                es7 es7Var = ((gu7) this.x).C;
                gu7.l(es7Var);
                es7Var.C.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String j0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = C0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return "";
            } catch (SQLiteException e) {
                es7 es7Var = ((gu7) this.x).C;
                gu7.l(es7Var);
                es7Var.C.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void k0(ContentValues contentValues) {
        gu7 gu7Var = (gu7) this.x;
        try {
            SQLiteDatabase C0 = C0();
            if (contentValues.getAsString("app_id") == null) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.E.b(es7.P("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (C0.update("consent_settings", contentValues, r5.toString(), new String[]{r4}) == 0 && C0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                es7 es7Var2 = gu7Var.C;
                gu7.l(es7Var2);
                es7Var2.C.c("Failed to insert/update table (got -1). key", es7.P("consent_settings"), es7.P("app_id"));
            }
        } catch (SQLiteException e) {
            es7 es7Var3 = gu7Var.C;
            gu7.l(es7Var3);
            es7Var3.C.d("Error storing into table. key", es7.P("consent_settings"), es7.P("app_id"), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0123  */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dm7 l0(java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.l0(java.lang.String, java.lang.String, java.lang.String):dm7");
    }

    public final void m0(String str, dm7 dm7Var) {
        Long l;
        gu7 gu7Var = (gu7) this.x;
        a34.x(dm7Var);
        L();
        M();
        ContentValues contentValues = new ContentValues();
        String str2 = dm7Var.a;
        contentValues.put("app_id", str2);
        contentValues.put(MediationMetaData.KEY_NAME, dm7Var.b);
        contentValues.put("lifetime_count", Long.valueOf(dm7Var.c));
        contentValues.put("current_bundle_count", Long.valueOf(dm7Var.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(dm7Var.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(dm7Var.g));
        contentValues.put("last_bundled_day", dm7Var.h);
        contentValues.put("last_sampled_complex_event_id", dm7Var.i);
        contentValues.put("last_sampling_rate", dm7Var.j);
        contentValues.put("current_session_count", Long.valueOf(dm7Var.e));
        Boolean bool = dm7Var.k;
        if (bool != null && bool.booleanValue()) {
            l = 1L;
        } else {
            l = null;
        }
        contentValues.put("last_exempt_from_sampling", l);
        try {
            if (C0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.C.b(es7.P(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.C.c("Error storing event aggregates. appId", es7.P(str2), e);
        }
    }

    public final void n0(String str, String str2) {
        a34.u(str2);
        L();
        M();
        try {
            C0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.C.c("Error deleting snapshot. appId", es7.P(str2), e);
        }
    }

    public final b28 o0(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        cy7 cy7Var;
        gu7 gu7Var = (gu7) this.x;
        if (TextUtils.isEmpty(str2)) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.J.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            zt7 zt7Var = (zt7) c28.w0(eu7.y(), bArr);
            cy7[] values = cy7.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    cy7Var = values[i3];
                    if (cy7Var.x == i) {
                        break;
                    }
                    i3++;
                } else {
                    cy7Var = cy7.UNKNOWN;
                    break;
                }
            }
            if (cy7Var != cy7.GOOGLE_SIGNAL && cy7Var != cy7.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((eu7) zt7Var.y).r()).iterator();
                while (it.hasNext()) {
                    fu7 fu7Var = (fu7) ((iu7) it.next()).i();
                    fu7Var.c();
                    ((iu7) fu7Var.y).V0(i2);
                    arrayList.add((iu7) fu7Var.e());
                }
                zt7Var.c();
                ((eu7) zt7Var.y).D();
                zt7Var.c();
                ((eu7) zt7Var.y).C(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    String str4 = split[i4];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        es7 es7Var2 = gu7Var.C;
                        gu7.l(es7Var2);
                        es7Var2.C.b(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i4++;
                }
            }
            return new b28(j, (eu7) zt7Var.e(), str2, hashMap, cy7Var, j2, j3, j4, i2);
        } catch (IOException e) {
            es7 es7Var3 = gu7Var.C;
            gu7.l(es7Var3);
            es7Var3.C.c("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    public final String p0() {
        ((gu7) this.x).H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) tq7.S.a(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l + ")";
        String k = qx1.k(((Long) tq7.R.a(null)).longValue(), ")", zo5.n(currentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "));
        StringBuilder sb = new StringBuilder(str.length() + 5 + k.length() + 1);
        qx1.x(sb, "(", str, " OR ", k);
        sb.append(")");
        return sb.toString();
    }

    public final void r0(String str, xv7 xv7Var) {
        a34.x(str);
        a34.x(xv7Var);
        L();
        M();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", xv7Var.g());
        contentValues.put("consent_source", Integer.valueOf(xv7Var.b));
        k0(contentValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List s0(String str) {
        ArrayList arrayList;
        String string;
        gu7 gu7Var = (gu7) this.x;
        L();
        M();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase C0 = C0();
            C0.beginTransaction();
            Cursor cursor = null;
            try {
                try {
                    cursor = C0.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (!cursor.moveToFirst()) {
                        C0.setTransactionSuccessful();
                        arrayList = arrayList2;
                    } else {
                        boolean isEmpty = str.isEmpty();
                        do {
                            String string2 = cursor.getString(0);
                            if (cursor.isNull(1)) {
                                string = "";
                            } else {
                                string = cursor.getString(1);
                                a34.x(string);
                            }
                            if (string2 == null) {
                                es7 es7Var = gu7Var.C;
                                gu7.l(es7Var);
                                es7Var.C.b(es7.P(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursor.getLong(2);
                                xp7 r = yp7.r();
                                r.c();
                                ((yp7) r.y).s(string2);
                                r.c();
                                ((yp7) r.y).v(j);
                                r.c();
                                ((yp7) r.y).u(string);
                                if (isEmpty) {
                                    r.c();
                                    ((yp7) r.y).t();
                                }
                                arrayList2.add((yp7) r.e());
                            }
                        } while (cursor.moveToNext());
                        C0.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        C0.setTransactionSuccessful();
                        arrayList = arrayList2;
                    }
                } catch (SQLiteException e) {
                    es7 es7Var2 = gu7Var.C;
                    gu7.l(es7Var2);
                    es7Var2.C.c("Error querying or deleting diagnostic signals. appId", es7.P(str), e);
                    arrayList = Collections.EMPTY_LIST;
                }
                if (cursor != null) {
                    cursor.close();
                }
                C0.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                C0.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            es7 es7Var3 = gu7Var.C;
            gu7.l(es7Var3);
            es7Var3.C.c("Error opening database for diagnostic signals. appId", es7.P(str), e2);
            return Collections.EMPTY_LIST;
        }
    }

    public final void t0(String str, xv7 xv7Var) {
        a34.x(str);
        L();
        M();
        r0(str, f0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", xv7Var.g());
        k0(contentValues);
    }

    public final xv7 u0(String str) {
        a34.x(str);
        L();
        M();
        return xv7.c(100, j0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final dm7 v0(String str, mt7 mt7Var, String str2) {
        dm7 l0 = l0("events", str, mt7Var.w());
        if (l0 == null) {
            gu7 gu7Var = (gu7) this.x;
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.F.c("Event aggregate wasn't created during raw event logging. appId, event", es7.P(str), gu7Var.G.a(str2));
            return new dm7(str, mt7Var.w(), 1L, 1L, 1L, mt7Var.y(), 0L, null, null, null, null);
        }
        long j = l0.e + 1;
        long j2 = l0.d + 1;
        return new dm7(l0.a, l0.b, l0.c + 1, j2, j, l0.f, l0.g, l0.h, l0.i, l0.j, l0.k);
    }

    public final boolean w0() {
        return ((gu7) this.x).x.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0220 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:11:0x0049, B:13:0x0065, B:21:0x006d, B:24:0x0071, B:25:0x00c9, B:27:0x00ef, B:28:0x0101, B:30:0x0105, B:31:0x0115, B:33:0x011b, B:34:0x012b, B:43:0x0159, B:44:0x0161, B:46:0x016c, B:48:0x018c, B:50:0x019a, B:51:0x01a4, B:53:0x01e2, B:62:0x01d2, B:63:0x01e9, B:66:0x0146, B:70:0x01fb, B:72:0x020e, B:75:0x003d, B:79:0x0088, B:81:0x008e, B:84:0x009d, B:87:0x00c1, B:90:0x0093), top: B:2:0x0017 }] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(java.lang.String r21, long r22, long r24, defpackage.uu3 r26) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.x0(java.lang.String, long, long, uu3):void");
    }

    public final void z0() {
        M();
        C0().beginTransaction();
    }
}
