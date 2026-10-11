package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import defpackage.a34;
import defpackage.hz5;
import defpackage.ko7;
import defpackage.q32;
import defpackage.rx7;
import defpackage.sp7;
import defpackage.to7;
import defpackage.wo7;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final sp7 a;

    public FirebaseAnalytics(sp7 sp7Var) {
        a34.x(sp7Var);
        this.a = sp7Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(sp7.c(context, null));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public static rx7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        sp7 c = sp7.c(context, bundle);
        if (c == null) {
            return null;
        }
        return new ko7(c);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) hz5.c(q32.c().b());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        to7 c = to7.c(activity);
        sp7 sp7Var = this.a;
        sp7Var.getClass();
        sp7Var.a(new wo7(sp7Var, c, str, str2));
    }
}
