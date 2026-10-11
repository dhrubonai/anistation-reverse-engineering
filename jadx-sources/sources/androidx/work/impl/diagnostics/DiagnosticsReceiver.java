package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.l77;
import defpackage.pe4;
import defpackage.qe4;
import defpackage.xk3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = xk3.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        xk3 d = xk3.d();
        String str = a;
        d.a(str, "Requesting diagnostics");
        try {
            context.getClass();
            l77.b(context).a((qe4) new pe4(DiagnosticsWorker.class, (byte) 0).a());
        } catch (IllegalStateException e) {
            xk3.d().c(str, "WorkManager is not initialized", e);
        }
    }
}
