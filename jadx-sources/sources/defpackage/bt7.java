package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bt7 extends pv7 {
    public static final Pair W = new Pair("", 0L);
    public SharedPreferences A;
    public ok2 B;
    public final sb6 C;
    public final tu D;
    public String E;
    public boolean F;
    public long G;
    public final sb6 H;
    public final ss7 I;
    public final tu J;
    public final vs7 K;
    public final ss7 L;
    public final sb6 M;
    public final sb6 N;
    public boolean O;
    public final ss7 P;
    public final ss7 Q;
    public final sb6 R;
    public final tu S;
    public final tu T;
    public final sb6 U;
    public final vs7 V;
    public SharedPreferences z;

    public bt7(gu7 gu7Var) {
        super(gu7Var);
        this.H = new sb6(this, "session_timeout", 1800000L);
        this.I = new ss7(this, "start_new_session", true);
        this.M = new sb6(this, "last_pause_time", 0L);
        this.N = new sb6(this, "session_id", 0L);
        this.J = new tu(this, "non_personalized_ads");
        this.K = new vs7(this, "last_received_uri_timestamps_by_source");
        this.L = new ss7(this, "allow_remote_dynamite", false);
        this.C = new sb6(this, "first_open_time", 0L);
        new sb6(this, "app_install_time", 0L);
        this.D = new tu(this, "app_instance_id");
        this.P = new ss7(this, "app_backgrounded", false);
        this.Q = new ss7(this, "deep_link_retrieval_complete", false);
        this.R = new sb6(this, "deep_link_retrieval_attempts", 0L);
        this.S = new tu(this, "firebase_feature_rollouts");
        this.T = new tu(this, "deferred_attribution_cache");
        this.U = new sb6(this, "deferred_attribution_cache_timestamp", 0L);
        this.V = new vs7(this, "default_event_parameters");
    }

    @Override // defpackage.pv7
    public final boolean M() {
        return true;
    }

    public final SharedPreferences P() {
        L();
        N();
        a34.x(this.z);
        return this.z;
    }

    public final SharedPreferences Q() {
        L();
        N();
        SharedPreferences sharedPreferences = this.A;
        if (sharedPreferences == null) {
            gu7 gu7Var = (gu7) this.x;
            String valueOf = String.valueOf(gu7Var.x.getPackageName());
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            bs7 bs7Var = es7Var.K;
            String concat = valueOf.concat("_preferences");
            bs7Var.b(concat, "Default prefs file");
            SharedPreferences sharedPreferences2 = gu7Var.x.getSharedPreferences(concat, 0);
            this.A = sharedPreferences2;
            return sharedPreferences2;
        }
        return sharedPreferences;
    }

    public final SparseArray R() {
        Bundle a = this.K.a();
        int[] intArray = a.getIntArray("uriSources");
        long[] longArray = a.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                es7 es7Var = ((gu7) this.x).C;
                gu7.l(es7Var);
                es7Var.C.a("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i = 0; i < intArray.length; i++) {
                sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    public final xv7 S() {
        L();
        return xv7.c(P().getInt("consent_source", 100), P().getString("consent_settings", "G1"));
    }

    public final void T(boolean z) {
        L();
        es7 es7Var = ((gu7) this.x).C;
        gu7.l(es7Var);
        es7Var.K.b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = P().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean U(long j) {
        if (j - this.H.g() > this.M.g()) {
            return true;
        }
        return false;
    }
}
