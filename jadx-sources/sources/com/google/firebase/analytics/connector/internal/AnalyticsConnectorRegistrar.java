package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a34;
import defpackage.as0;
import defpackage.bb4;
import defpackage.f16;
import defpackage.g41;
import defpackage.jr0;
import defpackage.kr0;
import defpackage.lw1;
import defpackage.n32;
import defpackage.o7;
import defpackage.p7;
import defpackage.qc5;
import defpackage.sp7;
import defpackage.zd1;
import defpackage.ze0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static o7 lambda$getComponents$0(as0 as0Var) {
        boolean z;
        n32 n32Var = (n32) as0Var.b(n32.class);
        Context context = (Context) as0Var.b(Context.class);
        f16 f16Var = (f16) as0Var.b(f16.class);
        a34.x(n32Var);
        a34.x(context);
        a34.x(f16Var);
        a34.x(context.getApplicationContext());
        if (p7.y == null) {
            synchronized (p7.class) {
                if (p7.y == null) {
                    Bundle bundle = new Bundle(1);
                    n32Var.a();
                    if ("[DEFAULT]".equals(n32Var.b)) {
                        ((lw1) f16Var).a();
                        n32Var.a();
                        g41 g41Var = (g41) n32Var.g.get();
                        synchronized (g41Var) {
                            z = g41Var.a;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z);
                    }
                    AppMeasurementSdk appMeasurementSdk = sp7.c(context, bundle).b;
                    p7 p7Var = new p7((byte) 0);
                    a34.x(appMeasurementSdk);
                    new ConcurrentHashMap();
                    p7.y = p7Var;
                }
            }
        }
        return p7.y;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kr0> getComponents() {
        boolean z = false;
        jr0 jr0Var = new jr0(o7.class, new Class[0]);
        jr0Var.a(zd1.a(n32.class));
        jr0Var.a(zd1.a(Context.class));
        jr0Var.a(zd1.a(f16.class));
        jr0Var.f = qc5.z;
        if (jr0Var.d == 0) {
            z = true;
        }
        if (z) {
            jr0Var.d = (byte) 2;
            return Arrays.asList(jr0Var.b(), bb4.t("fire-analytics", "23.2.0"));
        }
        ze0.m("Instantiation type has already been set.");
        return null;
    }
}
