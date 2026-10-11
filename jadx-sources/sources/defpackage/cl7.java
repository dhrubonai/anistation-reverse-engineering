package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cl7 extends SQLiteOpenHelper {
    public final /* synthetic */ byte x;
    public final /* synthetic */ qt0 y;

    public cl7(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        byte b = this.x;
        qt0 qt0Var = this.y;
        switch (b) {
            case 0:
                fl7 fl7Var = (fl7) qt0Var;
                gu7 gu7Var = (gu7) fl7Var.x;
                ak7 ak7Var = gu7Var.A;
                d42 d42Var = fl7Var.B;
                if (d42Var.a == 0 || SystemClock.elapsedRealtime() - d42Var.a >= 3600000) {
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException unused) {
                        d42Var.getClass();
                        d42Var.a = SystemClock.elapsedRealtime();
                        es7 es7Var = gu7Var.C;
                        gu7.l(es7Var);
                        es7Var.C.a("Opening the database failed, dropping and recreating it");
                        if (!gu7Var.x.getDatabasePath("google_app_measurement.db").delete()) {
                            es7 es7Var2 = gu7Var.C;
                            gu7.l(es7Var2);
                            es7Var2.C.b("google_app_measurement.db", "Failed to delete corrupted db file");
                        }
                        try {
                            SQLiteDatabase writableDatabase = super.getWritableDatabase();
                            d42Var.a = 0L;
                            return writableDatabase;
                        } catch (SQLiteException e) {
                            es7 es7Var3 = gu7Var.C;
                            gu7.l(es7Var3);
                            es7Var3.C.b(e, "Failed to open freshly created database");
                            throw e;
                        }
                    }
                }
                throw new SQLiteException("Database open failed");
            default:
                gu7 gu7Var2 = (gu7) ((sr7) qt0Var).x;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    es7 es7Var4 = gu7Var2.C;
                    gu7.l(es7Var4);
                    es7Var4.C.a("Opening the local database failed, dropping and recreating it");
                    if (!gu7Var2.x.getDatabasePath("google_app_measurement_local.db").delete()) {
                        es7 es7Var5 = gu7Var2.C;
                        gu7.l(es7Var5);
                        es7Var5.C.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        es7 es7Var6 = gu7Var2.C;
                        gu7.l(es7Var6);
                        es7Var6.C.b(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        byte b = this.x;
        qt0 qt0Var = this.y;
        switch (b) {
            case 0:
                es7 es7Var = ((gu7) ((fl7) qt0Var).x).C;
                gu7.l(es7Var);
                yu5.o(es7Var, sQLiteDatabase);
                return;
            default:
                es7 es7Var2 = ((gu7) ((sr7) qt0Var).x).C;
                gu7.l(es7Var2);
                yu5.o(es7Var2, sQLiteDatabase);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        byte b = this.x;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        byte b = this.x;
        qt0 qt0Var = this.y;
        switch (b) {
            case 0:
                gu7 gu7Var = (gu7) ((fl7) qt0Var).x;
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                yu5.m(es7Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", fl7.C);
                es7 es7Var2 = gu7Var.C;
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", fl7.E);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", fl7.F);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", fl7.H);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", fl7.G);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", fl7.I);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", fl7.J);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", fl7.K);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", fl7.L);
                yi7.a();
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", fl7.M);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", fl7.D);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                gu7.l(es7Var2);
                yu5.m(es7Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                return;
            default:
                es7 es7Var3 = ((gu7) ((sr7) qt0Var).x).C;
                gu7.l(es7Var3);
                yu5.m(es7Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", sr7.B);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        byte b = this.x;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cl7(sr7 sr7Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.x = (byte) 1;
        this.y = sr7Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cl7(fl7 fl7Var, Context context) {
        this(context, "google_app_measurement.db");
        this.x = (byte) 0;
        this.y = fl7Var;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void l(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void p(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void q(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
