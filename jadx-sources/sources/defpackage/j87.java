package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class j87 {
    public final pi3 a(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(pi3.class);
            asSubclass.getClass();
            try {
                Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                newInstance.getClass();
                pi3 pi3Var = (pi3) newInstance;
                if (!pi3Var.isUsed()) {
                    return pi3Var;
                }
                ze0.m(qx1.n("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
                return null;
            } catch (Throwable th) {
                xk3.d().c(k87.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            xk3.d().c(k87.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }
}
