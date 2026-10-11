package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ax7 extends BroadcastReceiver {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ fl5 c;
    public final /* synthetic */ qb7 d;
    public final /* synthetic */ Executor e;

    public ax7(AtomicBoolean atomicBoolean, Context context, fl5 fl5Var, qb7 qb7Var, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = fl5Var;
        this.d = qb7Var;
        this.e = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [hk6, ii3, java.lang.Object, java.lang.Runnable] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            fl5 fl5Var = this.c;
            qb7 qb7Var = this.d;
            Executor executor = this.e;
            ?? obj = new Object();
            obj.F = new gk6((hk6) obj, qb7Var);
            executor.execute(obj);
            fl5Var.n(obj);
        }
    }
}
