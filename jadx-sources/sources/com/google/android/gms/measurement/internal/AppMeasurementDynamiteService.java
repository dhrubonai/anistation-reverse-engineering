package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a34;
import defpackage.ak7;
import defpackage.au7;
import defpackage.bo7;
import defpackage.bs7;
import defpackage.by7;
import defpackage.c18;
import defpackage.cu7;
import defpackage.dy7;
import defpackage.eo7;
import defpackage.es7;
import defpackage.fo7;
import defpackage.go7;
import defpackage.gu7;
import defpackage.h18;
import defpackage.ht7;
import defpackage.i28;
import defpackage.ic4;
import defpackage.im7;
import defpackage.io7;
import defpackage.js;
import defpackage.js7;
import defpackage.jw7;
import defpackage.l87;
import defpackage.mm7;
import defpackage.nr7;
import defpackage.og5;
import defpackage.pw7;
import defpackage.py7;
import defpackage.q28;
import defpackage.qx7;
import defpackage.ro7;
import defpackage.rp7;
import defpackage.rw7;
import defpackage.so5;
import defpackage.so7;
import defpackage.to7;
import defpackage.tq7;
import defpackage.tt2;
import defpackage.tw7;
import defpackage.vn7;
import defpackage.vw7;
import defpackage.w47;
import defpackage.xx7;
import defpackage.yc2;
import defpackage.ze0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends vn7 {
    public gu7 e;
    public final js f;

    /* JADX WARN: Type inference failed for: r0v2, types: [so5, js] */
    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.e = null;
        this.f = new so5(0);
    }

    public final void K(String str, bo7 bo7Var) {
        b();
        i28 i28Var = this.e.F;
        gu7.j(i28Var);
        i28Var.y0(str, bo7Var);
    }

    public final void b() {
        if (this.e != null) {
            return;
        }
        ze0.m("Attempting to perform action before initialize.");
    }

    @Override // defpackage.wn7
    public void beginAdUnitExposure(String str, long j) {
        b();
        io7 io7Var = this.e.K;
        gu7.i(io7Var);
        io7Var.M(j, str);
    }

    @Override // defpackage.wn7
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.Z(str, str2, bundle);
    }

    @Override // defpackage.wn7
    public void clearMeasurementEnabled(long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.M();
        au7 au7Var = ((gu7) qx7Var.x).D;
        gu7.l(au7Var);
        au7Var.U(new yc2((byte) 25, qx7Var, null, false));
    }

    @Override // defpackage.wn7
    public void endAdUnitExposure(String str, long j) {
        b();
        io7 io7Var = this.e.K;
        gu7.i(io7Var);
        io7Var.N(j, str);
    }

    @Override // defpackage.wn7
    public void generateEventId(bo7 bo7Var) {
        b();
        i28 i28Var = this.e.F;
        gu7.j(i28Var);
        long J0 = i28Var.J0();
        b();
        i28 i28Var2 = this.e.F;
        gu7.j(i28Var2);
        i28Var2.z0(bo7Var, J0);
    }

    @Override // defpackage.wn7
    public void getAppInstanceId(bo7 bo7Var) {
        b();
        au7 au7Var = this.e.D;
        gu7.l(au7Var);
        au7Var.U(new cu7(this, bo7Var, (byte) 0));
    }

    @Override // defpackage.wn7
    public void getCachedAppInstanceId(bo7 bo7Var) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        K((String) qx7Var.D.get(), bo7Var);
    }

    @Override // defpackage.wn7
    public void getConditionalUserProperties(String str, String str2, bo7 bo7Var) {
        b();
        au7 au7Var = this.e.D;
        gu7.l(au7Var);
        au7Var.U(new w47((byte) 7, this, bo7Var, str, str2, false));
    }

    @Override // defpackage.wn7
    public void getCurrentScreenClass(bo7 bo7Var) {
        String str;
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        py7 py7Var = ((gu7) qx7Var.x).I;
        gu7.k(py7Var);
        dy7 dy7Var = py7Var.z;
        if (dy7Var != null) {
            str = dy7Var.b;
        } else {
            str = null;
        }
        K(str, bo7Var);
    }

    @Override // defpackage.wn7
    public void getCurrentScreenName(bo7 bo7Var) {
        String str;
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        py7 py7Var = ((gu7) qx7Var.x).I;
        gu7.k(py7Var);
        dy7 dy7Var = py7Var.z;
        if (dy7Var != null) {
            str = dy7Var.a;
        } else {
            str = null;
        }
        K(str, bo7Var);
    }

    @Override // defpackage.wn7
    public void getGmpAppId(bo7 bo7Var) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        K(qx7Var.a0(), bo7Var);
    }

    @Override // defpackage.wn7
    public void getMaxUserProperties(String str, bo7 bo7Var) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        a34.u(str);
        ak7 ak7Var = ((gu7) qx7Var.x).A;
        b();
        i28 i28Var = this.e.F;
        gu7.j(i28Var);
        i28Var.A0(bo7Var, 25);
    }

    @Override // defpackage.wn7
    public void getSessionId(bo7 bo7Var) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        au7 au7Var = ((gu7) qx7Var.x).D;
        gu7.l(au7Var);
        au7Var.U(new yc2(qx7Var, bo7Var));
    }

    @Override // defpackage.wn7
    public void getTestFlag(bo7 bo7Var, int i) {
        b();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        i28 i28Var = this.e.F;
                        gu7.j(i28Var);
                        qx7 qx7Var = this.e.J;
                        gu7.k(qx7Var);
                        AtomicReference atomicReference = new AtomicReference();
                        au7 au7Var = ((gu7) qx7Var.x).D;
                        gu7.l(au7Var);
                        i28Var.C0(bo7Var, ((Boolean) au7Var.V(atomicReference, 15000L, "boolean test flag value", new tw7(qx7Var, atomicReference, (byte) 0))).booleanValue());
                        return;
                    }
                    i28 i28Var2 = this.e.F;
                    gu7.j(i28Var2);
                    qx7 qx7Var2 = this.e.J;
                    gu7.k(qx7Var2);
                    AtomicReference atomicReference2 = new AtomicReference();
                    au7 au7Var2 = ((gu7) qx7Var2.x).D;
                    gu7.l(au7Var2);
                    i28Var2.A0(bo7Var, ((Integer) au7Var2.V(atomicReference2, 15000L, "int test flag value", new tw7(qx7Var2, atomicReference2, (byte) 3))).intValue());
                    return;
                }
                i28 i28Var3 = this.e.F;
                gu7.j(i28Var3);
                qx7 qx7Var3 = this.e.J;
                gu7.k(qx7Var3);
                AtomicReference atomicReference3 = new AtomicReference();
                au7 au7Var3 = ((gu7) qx7Var3.x).D;
                gu7.l(au7Var3);
                double doubleValue = ((Double) au7Var3.V(atomicReference3, 15000L, "double test flag value", new tw7(qx7Var3, atomicReference3, (byte) 4))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, doubleValue);
                try {
                    bo7Var.z(bundle);
                    return;
                } catch (RemoteException e) {
                    es7 es7Var = ((gu7) i28Var3.x).C;
                    gu7.l(es7Var);
                    es7Var.F.b(e, "Error returning double value to wrapper");
                    return;
                }
            }
            i28 i28Var4 = this.e.F;
            gu7.j(i28Var4);
            qx7 qx7Var4 = this.e.J;
            gu7.k(qx7Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            au7 au7Var4 = ((gu7) qx7Var4.x).D;
            gu7.l(au7Var4);
            i28Var4.z0(bo7Var, ((Long) au7Var4.V(atomicReference4, 15000L, "long test flag value", new tw7(qx7Var4, atomicReference4, (byte) 2))).longValue());
            return;
        }
        i28 i28Var5 = this.e.F;
        gu7.j(i28Var5);
        qx7 qx7Var5 = this.e.J;
        gu7.k(qx7Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        au7 au7Var5 = ((gu7) qx7Var5.x).D;
        gu7.l(au7Var5);
        i28Var5.y0((String) au7Var5.V(atomicReference5, 15000L, "String test flag value", new tw7(qx7Var5, atomicReference5, (byte) 1)), bo7Var);
    }

    @Override // defpackage.wn7
    public void getUserProperties(String str, String str2, boolean z, bo7 bo7Var) {
        b();
        au7 au7Var = this.e.D;
        gu7.l(au7Var);
        au7Var.U(new pw7(this, bo7Var, str, str2, z));
    }

    @Override // defpackage.wn7
    public void initForTests(Map map) {
        b();
    }

    @Override // defpackage.wn7
    public void initialize(tt2 tt2Var, so7 so7Var, long j) {
        gu7 gu7Var = this.e;
        if (gu7Var == null) {
            Context context = (Context) ic4.M(tt2Var);
            a34.x(context);
            this.e = gu7.q(context, so7Var, Long.valueOf(j), null);
        } else {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.F.a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.wn7
    public void initializeWithElapsedTime(tt2 tt2Var, so7 so7Var, long j, long j2) {
        gu7 gu7Var = this.e;
        if (gu7Var == null) {
            Context context = (Context) ic4.M(tt2Var);
            a34.x(context);
            this.e = gu7.q(context, so7Var, Long.valueOf(j), Long.valueOf(j2));
        } else {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.F.a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.wn7
    public void isDataCollectionEnabled(bo7 bo7Var) {
        b();
        au7 au7Var = this.e.D;
        gu7.l(au7Var);
        au7Var.U(new cu7(this, bo7Var, (byte) 1));
    }

    @Override // defpackage.wn7
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.Q(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // defpackage.wn7
    public void logEventAndBundle(String str, String str2, Bundle bundle, bo7 bo7Var, long j) {
        String str3;
        Bundle bundle2;
        b();
        a34.u(str2);
        if (true != this.e.A.W(null, tq7.f1)) {
            str3 = "app";
        } else {
            str3 = "auto";
        }
        String str4 = str3;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", str4);
        mm7 mm7Var = new mm7(str2, new im7(bundle), str4, j, 0L);
        au7 au7Var = this.e.D;
        gu7.l(au7Var);
        au7Var.U(new w47((byte) 2, this, bo7Var, mm7Var, str, false));
    }

    @Override // defpackage.wn7
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.Q(str, str2, bundle, z, z2, j, j2);
    }

    @Override // defpackage.wn7
    public void logHealthData(int i, String str, tt2 tt2Var, tt2 tt2Var2, tt2 tt2Var3) {
        Object M;
        Object M2;
        b();
        Object obj = null;
        if (tt2Var == null) {
            M = null;
        } else {
            M = ic4.M(tt2Var);
        }
        if (tt2Var2 == null) {
            M2 = null;
        } else {
            M2 = ic4.M(tt2Var2);
        }
        if (tt2Var3 != null) {
            obj = ic4.M(tt2Var3);
        }
        Object obj2 = obj;
        es7 es7Var = this.e.C;
        gu7.l(es7Var);
        es7Var.Q(i, true, false, str, M, M2, obj2);
    }

    @Override // defpackage.wn7
    public void onActivityCreated(tt2 tt2Var, Bundle bundle, long j) {
        b();
        Activity activity = (Activity) ic4.M(tt2Var);
        a34.x(activity);
        onActivityCreatedByScionActivityInfo(to7.c(activity), bundle, j);
    }

    @Override // defpackage.wn7
    public void onActivityCreatedByScionActivityInfo(to7 to7Var, Bundle bundle, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        rp7 rp7Var = qx7Var.z;
        if (rp7Var != null) {
            qx7 qx7Var2 = this.e.J;
            gu7.k(qx7Var2);
            qx7Var2.e0();
            rp7Var.c(to7Var, bundle);
        }
    }

    @Override // defpackage.wn7
    public void onActivityDestroyed(tt2 tt2Var, long j) {
        b();
        Activity activity = (Activity) ic4.M(tt2Var);
        a34.x(activity);
        onActivityDestroyedByScionActivityInfo(to7.c(activity), j);
    }

    @Override // defpackage.wn7
    public void onActivityDestroyedByScionActivityInfo(to7 to7Var, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        rp7 rp7Var = qx7Var.z;
        if (rp7Var != null) {
            qx7 qx7Var2 = this.e.J;
            gu7.k(qx7Var2);
            qx7Var2.e0();
            rp7Var.d(to7Var);
        }
    }

    @Override // defpackage.wn7
    public void onActivityPaused(tt2 tt2Var, long j) {
        b();
        Activity activity = (Activity) ic4.M(tt2Var);
        a34.x(activity);
        onActivityPausedByScionActivityInfo(to7.c(activity), j);
    }

    @Override // defpackage.wn7
    public void onActivityPausedByScionActivityInfo(to7 to7Var, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        rp7 rp7Var = qx7Var.z;
        if (rp7Var != null) {
            qx7 qx7Var2 = this.e.J;
            gu7.k(qx7Var2);
            qx7Var2.e0();
            rp7Var.e(to7Var);
        }
    }

    @Override // defpackage.wn7
    public void onActivityResumed(tt2 tt2Var, long j) {
        b();
        Activity activity = (Activity) ic4.M(tt2Var);
        a34.x(activity);
        onActivityResumedByScionActivityInfo(to7.c(activity), j);
    }

    @Override // defpackage.wn7
    public void onActivityResumedByScionActivityInfo(to7 to7Var, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        rp7 rp7Var = qx7Var.z;
        if (rp7Var != null) {
            qx7 qx7Var2 = this.e.J;
            gu7.k(qx7Var2);
            qx7Var2.e0();
            rp7Var.f(to7Var);
        }
    }

    @Override // defpackage.wn7
    public void onActivitySaveInstanceState(tt2 tt2Var, bo7 bo7Var, long j) {
        b();
        Activity activity = (Activity) ic4.M(tt2Var);
        a34.x(activity);
        onActivitySaveInstanceStateByScionActivityInfo(to7.c(activity), bo7Var, j);
    }

    @Override // defpackage.wn7
    public void onActivitySaveInstanceStateByScionActivityInfo(to7 to7Var, bo7 bo7Var, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        rp7 rp7Var = qx7Var.z;
        Bundle bundle = new Bundle();
        if (rp7Var != null) {
            qx7 qx7Var2 = this.e.J;
            gu7.k(qx7Var2);
            qx7Var2.e0();
            rp7Var.g(to7Var, bundle);
        }
        try {
            bo7Var.z(bundle);
        } catch (RemoteException e) {
            es7 es7Var = this.e.C;
            gu7.l(es7Var);
            es7Var.F.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // defpackage.wn7
    public void onActivityStarted(tt2 tt2Var, long j) {
        b();
        Activity activity = (Activity) ic4.M(tt2Var);
        a34.x(activity);
        onActivityStartedByScionActivityInfo(to7.c(activity), j);
    }

    @Override // defpackage.wn7
    public void onActivityStartedByScionActivityInfo(to7 to7Var, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        if (qx7Var.z != null) {
            qx7 qx7Var2 = this.e.J;
            gu7.k(qx7Var2);
            qx7Var2.e0();
        }
    }

    @Override // defpackage.wn7
    public void onActivityStopped(tt2 tt2Var, long j) {
        b();
        Activity activity = (Activity) ic4.M(tt2Var);
        a34.x(activity);
        onActivityStoppedByScionActivityInfo(to7.c(activity), j);
    }

    @Override // defpackage.wn7
    public void onActivityStoppedByScionActivityInfo(to7 to7Var, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        if (qx7Var.z != null) {
            qx7 qx7Var2 = this.e.J;
            gu7.k(qx7Var2);
            qx7Var2.e0();
        }
    }

    @Override // defpackage.wn7
    public void performAction(Bundle bundle, bo7 bo7Var, long j) {
        b();
        bo7Var.z(null);
    }

    @Override // defpackage.wn7
    public void registerOnMeasurementEventListener(go7 go7Var) {
        q28 q28Var;
        b();
        js jsVar = this.f;
        synchronized (jsVar) {
            try {
                fo7 fo7Var = (fo7) go7Var;
                Parcel b = fo7Var.b(fo7Var.K(), 2);
                int readInt = b.readInt();
                b.recycle();
                q28Var = (q28) jsVar.get(Integer.valueOf(readInt));
                if (q28Var == null) {
                    q28Var = new q28(this, fo7Var);
                    Parcel b2 = fo7Var.b(fo7Var.K(), 2);
                    int readInt2 = b2.readInt();
                    b2.recycle();
                    jsVar.put(Integer.valueOf(readInt2), q28Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.M();
        if (!qx7Var.B.add(q28Var)) {
            es7 es7Var = ((gu7) qx7Var.x).C;
            gu7.l(es7Var);
            es7Var.F.a("OnEventListener already registered");
        }
    }

    @Override // defpackage.wn7
    @Deprecated
    public void resetAnalyticsData(long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.D.set(null);
        au7 au7Var = ((gu7) qx7Var.x).D;
        gu7.l(au7Var);
        au7Var.U(new rw7(qx7Var, j, (byte) 1));
    }

    @Override // defpackage.wn7
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.D.set(null);
        au7 au7Var = ((gu7) qx7Var.x).D;
        gu7.l(au7Var);
        au7Var.U(new rw7(qx7Var, j, (byte) 1));
    }

    @Override // defpackage.wn7
    public void retrieveAndUploadBatches(eo7 eo7Var) {
        by7 by7Var;
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.M();
        gu7 gu7Var = (gu7) qx7Var.x;
        au7 au7Var = gu7Var.D;
        gu7.l(au7Var);
        if (!au7Var.R()) {
            au7 au7Var2 = gu7Var.D;
            gu7.l(au7Var2);
            if (Thread.currentThread() == au7Var2.A) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.C.a("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            boolean b = og5.b();
            es7 es7Var2 = gu7Var.C;
            if (!b) {
                gu7.l(es7Var2);
                es7Var2.K.a("[sgtm] Started client-side batch upload work.");
                boolean z = false;
                boolean z2 = false;
                int i = 0;
                int i2 = 0;
                loop0: while (!z2) {
                    es7 es7Var3 = gu7Var.C;
                    gu7.l(es7Var3);
                    es7Var3.K.a("[sgtm] Getting upload batches from service (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    au7 au7Var3 = gu7Var.D;
                    gu7.l(au7Var3);
                    au7Var3.V(atomicReference, 10000L, "[sgtm] Getting upload batches", new tw7(qx7Var, atomicReference, (byte) 6, z));
                    h18 h18Var = (h18) atomicReference.get();
                    if (h18Var == null) {
                        break;
                    }
                    List list = h18Var.x;
                    if (list.isEmpty()) {
                        break;
                    }
                    es7 es7Var4 = gu7Var.C;
                    gu7.l(es7Var4);
                    es7Var4.K.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
                    i += list.size();
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c18 c18Var = (c18) it.next();
                            try {
                                URL url = new URI(c18Var.z).toURL();
                                AtomicReference atomicReference2 = new AtomicReference();
                                nr7 p = ((gu7) qx7Var.x).p();
                                p.M();
                                a34.x(p.D);
                                String str = p.D;
                                gu7 gu7Var2 = (gu7) qx7Var.x;
                                es7 es7Var5 = gu7Var2.C;
                                gu7.l(es7Var5);
                                bs7 bs7Var = es7Var5.K;
                                Long valueOf = Long.valueOf(c18Var.x);
                                bs7Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, c18Var.z, Integer.valueOf(c18Var.y.length));
                                if (!TextUtils.isEmpty(c18Var.D)) {
                                    es7 es7Var6 = gu7Var2.C;
                                    gu7.l(es7Var6);
                                    es7Var6.K.c("[sgtm] Uploading data from app. row_id", valueOf, c18Var.D);
                                }
                                HashMap hashMap = new HashMap();
                                Bundle bundle = c18Var.A;
                                for (String str2 : bundle.keySet()) {
                                    String string = bundle.getString(str2);
                                    if (!TextUtils.isEmpty(string)) {
                                        hashMap.put(str2, string);
                                    }
                                }
                                xx7 xx7Var = gu7Var2.L;
                                gu7.l(xx7Var);
                                byte[] bArr = c18Var.y;
                                l87 l87Var = new l87(qx7Var, atomicReference2, c18Var, (byte) 7);
                                xx7Var.N();
                                a34.x(url);
                                a34.x(bArr);
                                au7 au7Var4 = ((gu7) xx7Var.x).D;
                                gu7.l(au7Var4);
                                au7Var4.X(new js7(xx7Var, str, url, bArr, hashMap, l87Var));
                                try {
                                    i28 i28Var = gu7Var2.F;
                                    gu7.j(i28Var);
                                    gu7 gu7Var3 = (gu7) i28Var.x;
                                    gu7Var3.H.getClass();
                                    long currentTimeMillis = System.currentTimeMillis() + 60000;
                                    synchronized (atomicReference2) {
                                        for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                            try {
                                                atomicReference2.wait(j);
                                                gu7Var3.H.getClass();
                                            } catch (Throwable th) {
                                                throw th;
                                                break loop0;
                                            }
                                        }
                                    }
                                } catch (InterruptedException unused) {
                                    es7 es7Var7 = ((gu7) qx7Var.x).C;
                                    gu7.l(es7Var7);
                                    es7Var7.F.a("[sgtm] Interrupted waiting for uploading batch");
                                }
                                if (atomicReference2.get() == null) {
                                    by7Var = by7.UNKNOWN;
                                } else {
                                    by7Var = (by7) atomicReference2.get();
                                }
                            } catch (MalformedURLException | URISyntaxException e) {
                                es7 es7Var8 = ((gu7) qx7Var.x).C;
                                gu7.l(es7Var8);
                                es7Var8.C.d("[sgtm] Bad upload url for row_id", c18Var.z, Long.valueOf(c18Var.x), e);
                                by7Var = by7.FAILURE;
                            }
                            if (by7Var == by7.SUCCESS) {
                                i2++;
                            } else if (by7Var == by7.BACKOFF) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    z = false;
                }
                es7 es7Var9 = gu7Var.C;
                gu7.l(es7Var9);
                es7Var9.K.c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i), Integer.valueOf(i2));
                try {
                    eo7Var.c();
                    return;
                } catch (RemoteException e2) {
                    gu7 gu7Var4 = this.e;
                    a34.x(gu7Var4);
                    es7 es7Var10 = gu7Var4.C;
                    gu7.l(es7Var10);
                    es7Var10.F.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
                    return;
                }
            }
            gu7.l(es7Var2);
            es7Var2.C.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        es7 es7Var11 = gu7Var.C;
        gu7.l(es7Var11);
        es7Var11.C.a("Cannot retrieve and upload batches from analytics worker thread");
    }

    @Override // defpackage.wn7
    public void setConditionalUserProperty(Bundle bundle, long j) {
        b();
        gu7 gu7Var = this.e;
        if (bundle == null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.a("Conditional user property must not be null");
        } else {
            qx7 qx7Var = gu7Var.J;
            gu7.k(qx7Var);
            qx7Var.Y(bundle, j);
        }
    }

    @Override // defpackage.wn7
    public void setConsentThirdParty(Bundle bundle, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.f0(bundle, -20, j);
    }

    @Override // defpackage.wn7
    public void setCurrentScreen(tt2 tt2Var, String str, String str2, long j) {
        b();
        Activity activity = (Activity) ic4.M(tt2Var);
        a34.x(activity);
        setCurrentScreenByScionActivityInfo(to7.c(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // defpackage.wn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(defpackage.to7 r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
            r4 = this;
            r4.b()
            gu7 r4 = r4.e
            py7 r4 = r4.I
            defpackage.gu7.k(r4)
            java.lang.Object r8 = r4.x
            gu7 r8 = (defpackage.gu7) r8
            ak7 r9 = r8.A
            boolean r9 = r9.a0()
            if (r9 != 0) goto L23
            es7 r4 = r8.C
            defpackage.gu7.l(r4)
            bs7 r4 = r4.H
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.a(r5)
            return
        L23:
            dy7 r9 = r4.z
            if (r9 != 0) goto L34
            es7 r4 = r8.C
            defpackage.gu7.l(r4)
            bs7 r4 = r4.H
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.a(r5)
            return
        L34:
            java.util.concurrent.ConcurrentHashMap r0 = r4.C
            int r1 = r5.x
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L4f
            es7 r4 = r8.C
            defpackage.gu7.l(r4)
            bs7 r4 = r4.H
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.a(r5)
            return
        L4f:
            if (r7 != 0) goto L57
            java.lang.String r7 = r5.y
            java.lang.String r7 = r4.Q(r7)
        L57:
            java.lang.String r2 = r9.b
            java.lang.String r9 = r9.a
            boolean r2 = java.util.Objects.equals(r2, r7)
            boolean r9 = java.util.Objects.equals(r9, r6)
            if (r2 == 0) goto L74
            if (r9 == 0) goto L74
            es7 r4 = r8.C
            defpackage.gu7.l(r4)
            bs7 r4 = r4.H
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.a(r5)
            return
        L74:
            r9 = 500(0x1f4, float:7.0E-43)
            if (r6 == 0) goto L9e
            int r2 = r6.length()
            if (r2 <= 0) goto L89
            int r2 = r6.length()
            ak7 r3 = r8.A
            r3.getClass()
            if (r2 <= r9) goto L9e
        L89:
            es7 r4 = r8.C
            defpackage.gu7.l(r4)
            bs7 r4 = r4.H
            int r5 = r6.length()
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.b(r5, r6)
            return
        L9e:
            int r2 = r7.length()
            if (r2 <= 0) goto Lda
            int r2 = r7.length()
            ak7 r3 = r8.A
            r3.getClass()
            if (r2 <= r9) goto Lb0
            goto Lda
        Lb0:
            es7 r9 = r8.C
            defpackage.gu7.l(r9)
            bs7 r9 = r9.K
            if (r6 != 0) goto Lbc
            java.lang.String r2 = "null"
            goto Lbd
        Lbc:
            r2 = r6
        Lbd:
            java.lang.String r3 = "Setting current screen to name, class"
            r9.c(r3, r2, r7)
            dy7 r9 = new dy7
            i28 r8 = r8.F
            defpackage.gu7.j(r8)
            long r2 = r8.J0()
            r9.<init>(r2, r6, r7)
            r0.put(r1, r9)
            java.lang.String r5 = r5.y
            r6 = 1
            r4.T(r5, r9, r6)
            return
        Lda:
            es7 r4 = r8.C
            defpackage.gu7.l(r4)
            bs7 r4 = r4.H
            int r5 = r7.length()
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(to7, java.lang.String, java.lang.String, long):void");
    }

    @Override // defpackage.wn7
    public void setDataCollectionEnabled(boolean z) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.M();
        au7 au7Var = ((gu7) qx7Var.x).D;
        gu7.l(au7Var);
        au7Var.U(new jw7(qx7Var, z));
    }

    @Override // defpackage.wn7
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        au7 au7Var = ((gu7) qx7Var.x).D;
        gu7.l(au7Var);
        au7Var.U(new vw7(qx7Var, bundle2, (byte) 2));
    }

    @Override // defpackage.wn7
    public void setEventInterceptor(go7 go7Var) {
        b();
        ht7 ht7Var = new ht7(this, go7Var);
        au7 au7Var = this.e.D;
        gu7.l(au7Var);
        boolean R = au7Var.R();
        gu7 gu7Var = this.e;
        boolean z = false;
        if (R) {
            qx7 qx7Var = gu7Var.J;
            gu7.k(qx7Var);
            qx7Var.L();
            qx7Var.M();
            ht7 ht7Var2 = qx7Var.A;
            if (ht7Var != ht7Var2) {
                if (ht7Var2 == null) {
                    z = true;
                }
                a34.A("EventInterceptor already set.", z);
            }
            qx7Var.A = ht7Var;
            return;
        }
        au7 au7Var2 = gu7Var.D;
        gu7.l(au7Var2);
        au7Var2.U(new yc2((byte) 27, this, ht7Var, z));
    }

    @Override // defpackage.wn7
    public void setInstanceIdProvider(ro7 ro7Var) {
        b();
    }

    @Override // defpackage.wn7
    public void setMeasurementEnabled(boolean z, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        Boolean valueOf = Boolean.valueOf(z);
        qx7Var.M();
        au7 au7Var = ((gu7) qx7Var.x).D;
        gu7.l(au7Var);
        au7Var.U(new yc2((byte) 25, qx7Var, valueOf, false));
    }

    @Override // defpackage.wn7
    public void setMinimumSessionDuration(long j) {
        b();
    }

    @Override // defpackage.wn7
    public void setSessionTimeoutDuration(long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        au7 au7Var = ((gu7) qx7Var.x).D;
        gu7.l(au7Var);
        au7Var.U(new rw7(qx7Var, j, (byte) 0));
    }

    @Override // defpackage.wn7
    public void setSgtmDebugInfo(Intent intent) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        gu7 gu7Var = (gu7) qx7Var.x;
        Uri data = intent.getData();
        if (data == null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.I.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter != null && queryParameter.equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                es7 es7Var2 = gu7Var.C;
                gu7.l(es7Var2);
                es7Var2.I.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
                gu7Var.A.z = queryParameter2;
                return;
            }
            return;
        }
        es7 es7Var3 = gu7Var.C;
        gu7.l(es7Var3);
        es7Var3.I.a("[sgtm] Preview Mode was not enabled.");
        gu7Var.A.z = null;
    }

    @Override // defpackage.wn7
    public void setUserId(String str, long j) {
        b();
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        gu7 gu7Var = (gu7) qx7Var.x;
        if (str != null && TextUtils.isEmpty(str)) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.F.a("User ID must be non-empty or null");
        } else {
            au7 au7Var = gu7Var.D;
            gu7.l(au7Var);
            au7Var.U(new yc2((Object) qx7Var, (Object) str, (byte) 29));
            qx7Var.V(null, "_id", str, true, j);
        }
    }

    @Override // defpackage.wn7
    public void setUserProperty(String str, String str2, tt2 tt2Var, boolean z, long j) {
        b();
        Object M = ic4.M(tt2Var);
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.V(str, str2, M, z, j);
    }

    @Override // defpackage.wn7
    public void unregisterOnMeasurementEventListener(go7 go7Var) {
        fo7 fo7Var;
        q28 q28Var;
        b();
        js jsVar = this.f;
        synchronized (jsVar) {
            fo7Var = (fo7) go7Var;
            Parcel b = fo7Var.b(fo7Var.K(), 2);
            int readInt = b.readInt();
            b.recycle();
            q28Var = (q28) jsVar.remove(Integer.valueOf(readInt));
        }
        if (q28Var == null) {
            q28Var = new q28(this, fo7Var);
        }
        qx7 qx7Var = this.e.J;
        gu7.k(qx7Var);
        qx7Var.M();
        if (!qx7Var.B.remove(q28Var)) {
            es7 es7Var = ((gu7) qx7Var.x).C;
            gu7.l(es7Var);
            es7Var.F.a("OnEventListener had not been registered");
        }
    }

    @Override // defpackage.wn7
    public void setConsent(Bundle bundle, long j) {
    }
}
