package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.db;
import defpackage.n11;
import defpackage.nt1;
import defpackage.o11;
import defpackage.pn6;
import defpackage.q71;
import defpackage.rh1;
import defpackage.tl7;
import defpackage.yy2;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdsSdkInitializer implements yy2 {
    private final n11 startupDispatcher;

    public AdsSdkInitializer(n11 n11Var, int i, q71 q71Var) {
        this((i & 1) != 0 ? rh1.a : n11Var);
    }

    /* renamed from: create, reason: collision with other method in class */
    public void m64create(Context context) {
        context.getClass();
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        try {
        } catch (Throwable unused) {
        }
        tl7.z(db.g0(db.b(this.startupDispatcher), new AdsSdkInitializer$create$$inlined$CoroutineExceptionHandler$1(o11.x)), null, null, new AdsSdkInitializer$create$2(context, null), 3);
    }

    @Override // defpackage.yy2
    public List<Class<? extends yy2>> dependencies() {
        return nt1.x;
    }

    public AdsSdkInitializer() {
        this(null, 1, null);
    }

    public AdsSdkInitializer(n11 n11Var) {
        n11Var.getClass();
        this.startupDispatcher = n11Var;
    }

    @Override // defpackage.yy2
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m64create(context);
        return pn6.a;
    }
}
