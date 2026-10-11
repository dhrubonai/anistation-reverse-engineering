package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.AndroidGetIsModulesInitEnabled;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qx7 extends zq7 {
    public ht7 A;
    public final CopyOnWriteArraySet B;
    public boolean C;
    public final AtomicReference D;
    public final Object E;
    public boolean F;
    public int G;
    public gw7 H;
    public gw7 I;
    public PriorityQueue J;
    public xv7 K;
    public final AtomicLong L;
    public long M;
    public final cw7 N;
    public boolean O;
    public gw7 P;
    public lx7 Q;
    public gw7 R;
    public final ub7 S;
    public rp7 z;

    public qx7(gu7 gu7Var) {
        super(gu7Var);
        this.B = new CopyOnWriteArraySet();
        this.E = new Object();
        this.F = false;
        this.G = 1;
        this.O = true;
        this.S = new ub7(this, (byte) 5);
        this.D = new AtomicReference();
        this.K = xv7.c;
        this.M = -1L;
        this.L = new AtomicLong(0L);
        this.N = new cw7(gu7Var);
    }

    @Override // defpackage.zq7
    public final boolean O() {
        return false;
    }

    public final void P(String str, String str2, Bundle bundle) {
        long j;
        gu7 gu7Var = (gu7) this.x;
        gu7Var.H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (gu7Var.A.W(null, tq7.e1)) {
            gu7Var.H.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        Q(str, str2, bundle, true, true, currentTimeMillis, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r5 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx7.Q(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0410  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx7.R():void");
    }

    public final void S(String str, String str2, Bundle bundle) {
        long j;
        L();
        gu7 gu7Var = (gu7) this.x;
        gu7Var.H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (gu7Var.A.W(null, tq7.e1)) {
            gu7Var.H.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        T(currentTimeMillis, j, bundle, str, str2);
    }

    public final void T(long j, long j2, Bundle bundle, String str, String str2) {
        L();
        boolean z = true;
        if (this.A != null && !i28.p0(str2)) {
            z = false;
        }
        U(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x052d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(java.lang.String r30, java.lang.String r31, long r32, long r34, android.os.Bundle r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx7.U(java.lang.String, java.lang.String, long, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    public final void V(String str, String str2, Object obj, boolean z, long j) {
        int i;
        String str3;
        gu7 gu7Var = (gu7) this.x;
        int i2 = 0;
        if (z) {
            i28 i28Var = gu7Var.F;
            gu7.j(i28Var);
            i = i28Var.U0(str2);
        } else {
            i28 i28Var2 = gu7Var.F;
            gu7.j(i28Var2);
            if (i28Var2.O0("user property", str2)) {
                if (!i28Var2.Q0("user property", wk6.d, null, str2)) {
                    i = 15;
                } else {
                    ak7 ak7Var = ((gu7) i28Var2.x).A;
                    if (i28Var2.R0(24, "user property", str2)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        ub7 ub7Var = this.S;
        if (i != 0) {
            gu7.j(gu7Var.F);
            String S = i28.S(24, str2, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            gu7.j(gu7Var.F);
            i28.d0(ub7Var, null, i, "_ev", S, i2);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            i28 i28Var3 = gu7Var.F;
            i28 i28Var4 = gu7Var.F;
            gu7.j(i28Var3);
            int a0 = i28Var3.a0(obj, str2);
            if (a0 != 0) {
                gu7.j(i28Var4);
                String S2 = i28.S(24, str2, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = obj.toString().length();
                }
                gu7.j(i28Var4);
                i28.d0(ub7Var, null, a0, "_ev", S2, i2);
                return;
            }
            gu7.j(i28Var4);
            Object b0 = i28Var4.b0(obj, str2);
            if (b0 != null) {
                au7 au7Var = gu7Var.D;
                gu7.l(au7Var);
                au7Var.U(new pu7(this, str3, str2, b0, j, (byte) 1));
                return;
            }
            return;
        }
        au7 au7Var2 = gu7Var.D;
        gu7.l(au7Var2);
        au7Var2.U(new pu7(this, str3, str2, null, j, (byte) 1));
    }

    public final void W(long j, Object obj, String str, String str2) {
        String str3;
        boolean S;
        long j2;
        Object obj2 = obj;
        gu7 gu7Var = (gu7) this.x;
        a34.u(str);
        a34.u(str2);
        L();
        M();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    String lowerCase = str5.toLowerCase(Locale.ENGLISH);
                    String str6 = "false";
                    if (true != "false".equals(lowerCase)) {
                        j2 = 0;
                    } else {
                        j2 = 1;
                    }
                    obj2 = Long.valueOf(j2);
                    bt7 bt7Var = gu7Var.B;
                    gu7.j(bt7Var);
                    tu tuVar = bt7Var.J;
                    if (j2 == 1) {
                        str6 = AndroidGetIsModulesInitEnabled.ENABLE_MODULES_INIT_VALUE;
                    }
                    tuVar.h(str6);
                    es7 es7Var = gu7Var.C;
                    gu7.l(es7Var);
                    es7Var.K.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj2);
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                bt7 bt7Var2 = gu7Var.B;
                gu7.j(bt7Var2);
                bt7Var2.J.h("unset");
            } else {
                str4 = str2;
            }
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.K.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj2);
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!gu7Var.a()) {
            es7 es7Var3 = gu7Var.C;
            gu7.l(es7Var3);
            es7Var3.K.a("User property not set since app measurement is disabled");
            return;
        }
        if (!gu7Var.h()) {
            return;
        }
        e28 e28Var = new e28(j, obj3, str3, str);
        zz7 n = gu7Var.n();
        n.L();
        n.M();
        n.X();
        sr7 m = ((gu7) n.x).m();
        m.getClass();
        Parcel obtain = Parcel.obtain();
        aw7.b(e28Var, obtain);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            es7 es7Var4 = ((gu7) m.x).C;
            gu7.l(es7Var4);
            es7Var4.D.a("User property too long for local database. Sending directly to service");
            S = false;
        } else {
            S = m.S(1, marshall);
        }
        n.Z(new xy7(n, n.b0(true), S, e28Var, (byte) 0));
    }

    public final void X() {
        L();
        M();
        gu7 gu7Var = (gu7) this.x;
        if (gu7Var.h()) {
            ak7 ak7Var = gu7Var.A;
            ((gu7) ak7Var.x).getClass();
            Boolean Y = ak7Var.Y("google_analytics_deferred_deep_link_enabled");
            if (Y != null && Y.booleanValue()) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.J.a("Deferred Deep Link feature enabled.");
                au7 au7Var = gu7Var.D;
                gu7.l(au7Var);
                au7Var.U(new fw7(this, (byte) 2));
            }
            zz7 n = gu7Var.n();
            n.L();
            n.M();
            b48 b0 = n.b0(true);
            n.X();
            gu7 gu7Var2 = (gu7) n.x;
            gu7Var2.A.W(null, tq7.W0);
            gu7Var2.m().S(3, new byte[0]);
            n.Z(new az7(n, b0, (byte) 1));
            this.O = false;
            bt7 bt7Var = gu7Var.B;
            gu7.j(bt7Var);
            bt7Var.L();
            String string = bt7Var.P().getString("previous_os_version", null);
            ((gu7) bt7Var.x).o().N();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = bt7Var.P().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                gu7Var.o().N();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    S("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void Y(Bundle bundle, long j) {
        gu7 gu7Var = (gu7) this.x;
        a34.x(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.F.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        qs5.j(bundle2, "app_id", String.class, null);
        qs5.j(bundle2, "origin", String.class, null);
        qs5.j(bundle2, MediationMetaData.KEY_NAME, String.class, null);
        qs5.j(bundle2, "value", Object.class, null);
        qs5.j(bundle2, "trigger_event_name", String.class, null);
        qs5.j(bundle2, "trigger_timeout", Long.class, 0L);
        qs5.j(bundle2, "timed_out_event_name", String.class, null);
        qs5.j(bundle2, "timed_out_event_params", Bundle.class, null);
        qs5.j(bundle2, "triggered_event_name", String.class, null);
        qs5.j(bundle2, "triggered_event_params", Bundle.class, null);
        qs5.j(bundle2, "time_to_live", Long.class, 0L);
        qs5.j(bundle2, "expired_event_name", String.class, null);
        qs5.j(bundle2, "expired_event_params", Bundle.class, null);
        a34.u(bundle2.getString(MediationMetaData.KEY_NAME));
        a34.u(bundle2.getString("origin"));
        a34.x(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(MediationMetaData.KEY_NAME);
        Object obj = bundle2.get("value");
        i28 i28Var = gu7Var.F;
        vr7 vr7Var = gu7Var.G;
        es7 es7Var2 = gu7Var.C;
        gu7.j(i28Var);
        if (i28Var.U0(string) == 0) {
            gu7.j(i28Var);
            if (i28Var.a0(obj, string) == 0) {
                Object b0 = i28Var.b0(obj, string);
                if (b0 == null) {
                    gu7.l(es7Var2);
                    es7Var2.C.c("Unable to normalize conditional user property value", vr7Var.c(string), obj);
                    return;
                }
                qs5.i(bundle2, b0);
                long j2 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
                    gu7.l(es7Var2);
                    es7Var2.C.c("Invalid conditional user property timeout", vr7Var.c(string), Long.valueOf(j2));
                    return;
                }
                long j3 = bundle2.getLong("time_to_live");
                if (j3 <= 15552000000L && j3 >= 1) {
                    au7 au7Var = gu7Var.D;
                    gu7.l(au7Var);
                    au7Var.U(new vw7(this, bundle2, (byte) 0));
                    return;
                } else {
                    gu7.l(es7Var2);
                    es7Var2.C.c("Invalid conditional user property time to live", vr7Var.c(string), Long.valueOf(j3));
                    return;
                }
            }
            gu7.l(es7Var2);
            es7Var2.C.c("Invalid conditional user property value", vr7Var.c(string), obj);
            return;
        }
        gu7.l(es7Var2);
        es7Var2.C.b(vr7Var.c(string), "Invalid conditional user property name");
    }

    public final void Z(String str, String str2, Bundle bundle) {
        gu7 gu7Var = (gu7) this.x;
        gu7Var.H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        a34.u(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        au7 au7Var = gu7Var.D;
        gu7.l(au7Var);
        au7Var.U(new vw7(this, bundle2, (byte) 1));
    }

    public final String a0() {
        gu7 gu7Var = (gu7) this.x;
        try {
            return ct5.q(gu7Var.x, gu7Var.M);
        } catch (IllegalStateException e) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void b0(xv7 xv7Var, long j, boolean z) {
        int i = xv7Var.b;
        L();
        M();
        gu7 gu7Var = (gu7) this.x;
        bt7 bt7Var = gu7Var.B;
        es7 es7Var = gu7Var.C;
        gu7.j(bt7Var);
        xv7 S = bt7Var.S();
        if (j <= this.M && xv7.l(S.b, i)) {
            gu7.l(es7Var);
            es7Var.I.b(xv7Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        bt7 bt7Var2 = gu7Var.B;
        gu7.j(bt7Var2);
        bt7Var2.L();
        if (xv7.l(i, bt7Var2.P().getInt("consent_source", 100))) {
            SharedPreferences.Editor edit = bt7Var2.P().edit();
            edit.putString("consent_settings", xv7Var.g());
            edit.putInt("consent_source", i);
            edit.apply();
            gu7.l(es7Var);
            es7Var.K.b(xv7Var, "Setting storage consent(FE)");
            this.M = j;
            if (gu7Var.n().V()) {
                zz7 n = gu7Var.n();
                n.L();
                n.M();
                n.Z(new tz7(n, (byte) 2));
            } else {
                zz7 n2 = gu7Var.n();
                n2.L();
                n2.M();
                if (n2.U()) {
                    n2.Z(new az7(n2, n2.b0(false)));
                }
            }
            if (z) {
                gu7Var.n().P(new AtomicReference());
                return;
            }
            return;
        }
        gu7.l(es7Var);
        es7Var.I.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
    }

    public final void c0(Boolean bool, boolean z) {
        L();
        M();
        gu7 gu7Var = (gu7) this.x;
        es7 es7Var = gu7Var.C;
        gu7.l(es7Var);
        es7Var.J.b(bool, "Setting app measurement enabled (FE)");
        bt7 bt7Var = gu7Var.B;
        gu7.j(bt7Var);
        bt7Var.L();
        SharedPreferences.Editor edit = bt7Var.P().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z) {
            bt7Var.L();
            SharedPreferences.Editor edit2 = bt7Var.P().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        au7 au7Var = gu7Var.D;
        gu7.l(au7Var);
        au7Var.L();
        if (!gu7Var.W && (bool == null || bool.booleanValue())) {
            return;
        }
        d0();
    }

    public final void d0() {
        long j;
        L();
        gu7 gu7Var = (gu7) this.x;
        bt7 bt7Var = gu7Var.B;
        es7 es7Var = gu7Var.C;
        pk2 pk2Var = gu7Var.H;
        gu7.j(bt7Var);
        String g = bt7Var.J.g();
        byte b = 1;
        if (g != null) {
            if ("unset".equals(g)) {
                pk2Var.getClass();
                W(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                if (true != AndroidGetIsModulesInitEnabled.ENABLE_MODULES_INIT_VALUE.equals(g)) {
                    j = 0;
                } else {
                    j = 1;
                }
                Long valueOf = Long.valueOf(j);
                pk2Var.getClass();
                W(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (gu7Var.a() && this.O) {
            gu7.l(es7Var);
            es7Var.J.a("Recording app launch after enabling measurement for the first time (FE)");
            X();
            r08 r08Var = gu7Var.E;
            gu7.k(r08Var);
            r08Var.B.c();
            au7 au7Var = gu7Var.D;
            gu7.l(au7Var);
            au7Var.U(new fw7(this, b));
            return;
        }
        gu7.l(es7Var);
        es7Var.J.a("Updating Scion state (FE)");
        zz7 n = gu7Var.n();
        n.L();
        n.M();
        n.Z(new az7(n, n.b0(true), (byte) 3));
    }

    public final void e0() {
        gu7 gu7Var = (gu7) this.x;
        if ((gu7Var.x.getApplicationContext() instanceof Application) && this.z != null) {
            ((Application) gu7Var.x.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.z);
        }
    }

    public final void f0(Bundle bundle, int i, long j) {
        Boolean bool;
        String str;
        tv7 tv7Var;
        String str2;
        Boolean bool2;
        gu7 gu7Var = (gu7) this.x;
        M();
        xv7 xv7Var = xv7.c;
        wv7[] wv7VarArr = uv7.STORAGE.x;
        int length = wv7VarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 < length) {
                String str3 = wv7VarArr[i2].x;
                if (bundle.containsKey(str3) && (str = bundle.getString(str3)) != null) {
                    if (str.equals("granted")) {
                        bool2 = Boolean.TRUE;
                    } else if (str.equals("denied")) {
                        bool2 = Boolean.FALSE;
                    } else {
                        bool2 = null;
                    }
                    if (bool2 == null) {
                        break;
                    }
                }
                i2++;
            } else {
                str = null;
                break;
            }
        }
        if (str != null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.H.b(str, "Ignoring invalid consent setting");
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.H.a("Valid consent values are 'granted', 'denied'");
        }
        au7 au7Var = gu7Var.D;
        gu7.l(au7Var);
        boolean R = au7Var.R();
        xv7 b = xv7.b(i, bundle);
        Iterator it = b.a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            tv7Var = tv7.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((tv7) it.next()) != tv7Var) {
                h0(b, R);
                break;
            }
        }
        wl7 c = wl7.c(i, bundle);
        Iterator it2 = c.e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((tv7) it2.next()) != tv7Var) {
                g0(c, R);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = xv7.d(bundle.getString("ad_personalization")).ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    bool = Boolean.TRUE;
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (bool != null) {
            if (i == -30) {
                str2 = "tcf";
            } else {
                str2 = "app";
            }
            if (R) {
                W(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                V(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void g0(wl7 wl7Var, boolean z) {
        yc2 yc2Var = new yc2((byte) 26, this, wl7Var, false);
        if (z) {
            L();
            yc2Var.run();
        } else {
            au7 au7Var = ((gu7) this.x).D;
            gu7.l(au7Var);
            au7Var.U(yc2Var);
        }
    }

    public final void h0(xv7 xv7Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        xv7 xv7Var2;
        M();
        int i = xv7Var.b;
        if (i != -10) {
            tv7 tv7Var = (tv7) xv7Var.a.get(wv7.AD_STORAGE);
            if (tv7Var == null) {
                tv7Var = tv7.UNINITIALIZED;
            }
            tv7 tv7Var2 = tv7.UNINITIALIZED;
            if (tv7Var == tv7Var2) {
                tv7 tv7Var3 = (tv7) xv7Var.a.get(wv7.ANALYTICS_STORAGE);
                if (tv7Var3 == null) {
                    tv7Var3 = tv7Var2;
                }
                if (tv7Var3 == tv7Var2) {
                    es7 es7Var = ((gu7) this.x).C;
                    gu7.l(es7Var);
                    es7Var.H.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.E) {
            try {
                z2 = false;
                if (xv7.l(i, this.K.b)) {
                    xv7 xv7Var3 = this.K;
                    EnumMap enumMap = xv7Var.a;
                    wv7[] wv7VarArr = (wv7[]) enumMap.keySet().toArray(new wv7[0]);
                    int length = wv7VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            wv7 wv7Var = wv7VarArr[i2];
                            tv7 tv7Var4 = (tv7) enumMap.get(wv7Var);
                            tv7 tv7Var5 = (tv7) xv7Var3.a.get(wv7Var);
                            tv7 tv7Var6 = tv7.DENIED;
                            if (tv7Var4 == tv7Var6 && tv7Var5 != tv7Var6) {
                                z3 = true;
                                break;
                            }
                            i2++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    wv7 wv7Var2 = wv7.ANALYTICS_STORAGE;
                    if (xv7Var.i(wv7Var2) && !this.K.i(wv7Var2)) {
                        z2 = true;
                    }
                    xv7Var = xv7Var.k(this.K);
                    this.K = xv7Var;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                xv7Var2 = xv7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            es7 es7Var2 = ((gu7) this.x).C;
            gu7.l(es7Var2);
            es7Var2.I.b(xv7Var2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.L.getAndIncrement();
        if (z3) {
            this.D.set(null);
            zw7 zw7Var = new zw7(this, xv7Var2, andIncrement, z4, (byte) 0);
            if (z) {
                L();
                zw7Var.run();
                return;
            } else {
                au7 au7Var = ((gu7) this.x).D;
                gu7.l(au7Var);
                au7Var.W(zw7Var);
                return;
            }
        }
        zw7 zw7Var2 = new zw7(this, xv7Var2, andIncrement, z4, (byte) 1);
        if (z) {
            L();
            zw7Var2.run();
        } else if (i != 30 && i != -10) {
            au7 au7Var2 = ((gu7) this.x).D;
            gu7.l(au7Var2);
            au7Var2.U(zw7Var2);
        } else {
            au7 au7Var3 = ((gu7) this.x).D;
            gu7.l(au7Var3);
            au7Var3.W(zw7Var2);
        }
    }

    public final void i0() {
        yi7.a();
        gu7 gu7Var = (gu7) this.x;
        ak7 ak7Var = gu7Var.A;
        au7 au7Var = gu7Var.D;
        es7 es7Var = gu7Var.C;
        if (ak7Var.W(null, tq7.P0)) {
            gu7.l(au7Var);
            if (!au7Var.R()) {
                if (!og5.b()) {
                    M();
                    gu7.l(es7Var);
                    es7Var.K.a("Getting trigger URIs (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    gu7.l(au7Var);
                    au7Var.V(atomicReference, 10000L, "get trigger URIs", new tw7(this, atomicReference, (byte) 5, false));
                    List list = (List) atomicReference.get();
                    if (list == null) {
                        gu7.l(es7Var);
                        es7Var.E.a("Timed out waiting for get trigger URIs");
                        return;
                    } else {
                        gu7.l(au7Var);
                        au7Var.U(new yc2((Object) this, (Object) list, (byte) 28));
                        return;
                    }
                }
                gu7.l(es7Var);
                es7Var.C.a("Cannot get trigger URIs from main thread");
                return;
            }
            gu7.l(es7Var);
            es7Var.C.a("Cannot get trigger URIs from analytics worker thread");
        }
    }

    public final PriorityQueue j0() {
        PriorityQueue priorityQueue = this.J;
        if (priorityQueue == null) {
            PriorityQueue priorityQueue2 = new PriorityQueue(Comparator.comparing(ix7.a, w66.y));
            this.J = priorityQueue2;
            return priorityQueue2;
        }
        return priorityQueue;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [fk7, java.lang.Object] */
    public final void k0() {
        x08 x08Var;
        L();
        if (!j0().isEmpty() && !this.F && (x08Var = (x08) j0().poll()) != null) {
            gu7 gu7Var = (gu7) this.x;
            i28 i28Var = gu7Var.F;
            gu7.j(i28Var);
            ap3 h0 = i28Var.h0();
            if (h0 != null) {
                this.F = true;
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                bs7 bs7Var = es7Var.K;
                String str = x08Var.x;
                bs7Var.b(str, "Registering trigger URI");
                ii3 e = h0.e(Uri.parse(str));
                byte b = 0;
                if (e == null) {
                    this.F = false;
                    j0().add(x08Var);
                    return;
                }
                lj2 lj2Var = new lj2(this, (byte) 3);
                ?? obj = new Object();
                obj.x = x08Var;
                obj.y = this;
                e.a(new yc2(e, (Object) obj, b), lj2Var);
            }
        }
    }

    public final void l0(xv7 xv7Var) {
        boolean z;
        Boolean bool;
        L();
        if ((xv7Var.i(wv7.ANALYTICS_STORAGE) && xv7Var.i(wv7.AD_STORAGE)) || ((gu7) this.x).n().U()) {
            z = true;
        } else {
            z = false;
        }
        gu7 gu7Var = (gu7) this.x;
        au7 au7Var = gu7Var.D;
        gu7.l(au7Var);
        au7Var.L();
        if (z != gu7Var.W) {
            au7 au7Var2 = gu7Var.D;
            gu7.l(au7Var2);
            au7Var2.L();
            gu7Var.W = z;
            bt7 bt7Var = ((gu7) this.x).B;
            gu7.j(bt7Var);
            bt7Var.L();
            if (bt7Var.P().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(bt7Var.P().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z || bool == null || bool.booleanValue()) {
                c0(Boolean.valueOf(z), false);
            }
        }
    }
}
