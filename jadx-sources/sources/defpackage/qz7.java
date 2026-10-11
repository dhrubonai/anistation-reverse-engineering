package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qz7 {
    public static final zk3 i = new zk3("ApplicationAnalytics", null);
    public final kv7 a;
    public final gl7 b;
    public final u18 c;
    public final SharedPreferences f;
    public p08 g;
    public gi0 h;
    public final h15 e = new h15(Looper.getMainLooper(), (byte) 4);
    public final la d = new la((Object) this, (byte) 20);

    public qz7(SharedPreferences sharedPreferences, kv7 kv7Var, gl7 gl7Var, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = kv7Var;
        this.b = gl7Var;
        this.c = new u18(bundle, str);
    }

    public final void a() {
        p08 p08Var = this.g;
        p08Var.getClass();
        SharedPreferences sharedPreferences = this.f;
        if (sharedPreferences == null) {
            return;
        }
        p08.q.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", p08Var.b);
        edit.putString("receiver_metrics_id", p08Var.c);
        edit.putLong("analytics_session_id", p08Var.d);
        edit.putInt("event_sequence_number", p08Var.e);
        edit.putString("receiver_session_id", p08Var.f);
        edit.putInt("device_capabilities", p08Var.g);
        edit.putString("device_model_name", p08Var.h);
        edit.putString("manufacturer", p08Var.i);
        edit.putString("product_name", p08Var.j);
        edit.putString("build_type", p08Var.k);
        edit.putString("cast_build_version", p08Var.l);
        edit.putString("system_build_number", p08Var.m);
        edit.putInt("device_category", p08Var.n);
        edit.putInt("analytics_session_start_type", p08Var.p);
        edit.putBoolean("is_output_switcher_enabled", p08Var.o);
        edit.apply();
    }

    public final void b(int i2) {
        i.b("log session ended with error = %d", Integer.valueOf(i2));
        e();
        this.a.a(this.c.a(this.g, i2), 228);
        this.e.removeCallbacks(this.d);
        this.g = null;
    }

    public final void c() {
        this.e.postDelayed(this.d, 300000L);
    }

    public final void d() {
        boolean z;
        CastDevice castDevice;
        int i2 = 0;
        i.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        p08 p08Var = new p08(this.b);
        p08.r++;
        this.g = p08Var;
        gi0 gi0Var = this.h;
        if (gi0Var != null && gi0Var.g.M()) {
            z = true;
        } else {
            z = false;
        }
        p08Var.o = z;
        p08 p08Var2 = this.g;
        a34.x(p08Var2);
        zk3 zk3Var = xh0.k;
        a34.s();
        xh0 xh0Var = xh0.m;
        a34.x(xh0Var);
        a34.s();
        p08Var2.b = xh0Var.e.x;
        gi0 gi0Var2 = this.h;
        if (gi0Var2 == null) {
            castDevice = null;
        } else {
            a34.s();
            castDevice = gi0Var2.k;
        }
        if (castDevice != null) {
            f(castDevice);
        }
        p08 p08Var3 = this.g;
        a34.x(p08Var3);
        gi0 gi0Var3 = this.h;
        if (gi0Var3 != null) {
            i2 = gi0Var3.c();
        }
        p08Var3.p = i2;
        a34.x(this.g);
    }

    public final void e() {
        CastDevice castDevice;
        if (g()) {
            gi0 gi0Var = this.h;
            if (gi0Var != null) {
                a34.s();
                castDevice = gi0Var.k;
            } else {
                castDevice = null;
            }
            if (castDevice != null && !TextUtils.equals(this.g.c, castDevice.I)) {
                f(castDevice);
            }
            a34.x(this.g);
            return;
        }
        zk3 zk3Var = i;
        Log.w(zk3Var.a, zk3Var.c("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
        d();
    }

    public final void f(CastDevice castDevice) {
        p08 p08Var = this.g;
        if (p08Var != null) {
            p08Var.c = castDevice.I;
            p08Var.g = castDevice.F.x;
            p08Var.h = castDevice.B;
            p08Var.n = castDevice.f();
            oc7 d = castDevice.d();
            if (d != null) {
                String str = d.A;
                if (str != null) {
                    p08Var.i = str;
                }
                String str2 = d.B;
                if (str2 != null) {
                    p08Var.j = str2;
                }
                String str3 = d.C;
                if (str3 != null) {
                    p08Var.k = str3;
                }
                String str4 = d.D;
                if (str4 != null) {
                    p08Var.l = str4;
                }
                String str5 = d.E;
                if (str5 != null) {
                    p08Var.m = str5;
                }
            }
        }
    }

    public final boolean g() {
        String str;
        zk3 zk3Var = i;
        if (this.g == null) {
            zk3Var.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        zk3 zk3Var2 = xh0.k;
        a34.s();
        xh0 xh0Var = xh0.m;
        a34.x(xh0Var);
        a34.s();
        String str2 = xh0Var.e.x;
        if (str2 != null && (str = this.g.b) != null && TextUtils.equals(str, str2)) {
            a34.x(this.g);
            return true;
        }
        zk3Var.b("The analytics session doesn't match the application ID %s", str2);
        return false;
    }

    public final boolean h(String str) {
        String str2;
        if (!g()) {
            return false;
        }
        a34.x(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        i.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
