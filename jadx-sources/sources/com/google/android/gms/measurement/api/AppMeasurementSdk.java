package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.Bundle;
import defpackage.ap7;
import defpackage.sn7;
import defpackage.sp7;
import defpackage.vo7;
import defpackage.yo7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AppMeasurementSdk {
    public final sp7 a;

    public AppMeasurementSdk(sp7 sp7Var) {
        this.a = sp7Var;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return sp7.c(context, null).b;
    }

    public void beginAdUnitExposure(String str) {
        sp7 sp7Var = this.a;
        sp7Var.a(new yo7(sp7Var, str, (byte) 0));
    }

    public void endAdUnitExposure(String str) {
        sp7 sp7Var = this.a;
        sp7Var.a(new yo7(sp7Var, str, (byte) 1));
    }

    public long generateEventId() {
        return this.a.d();
    }

    public String getAppInstanceId() {
        sn7 sn7Var = new sn7();
        sp7 sp7Var = this.a;
        sp7Var.a(new ap7(sp7Var, sn7Var, (byte) 1));
        return (String) sn7.K(sn7Var.b(50L), String.class);
    }

    public String getGmpAppId() {
        sn7 sn7Var = new sn7();
        sp7 sp7Var = this.a;
        sp7Var.a(new ap7(sp7Var, sn7Var, (byte) 0));
        return (String) sn7.K(sn7Var.b(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        sp7 sp7Var = this.a;
        sp7Var.a(new vo7(sp7Var, str, str2, bundle, (byte) 1));
    }
}
