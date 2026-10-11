package b5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.common.zzd;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j extends zaq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1529b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(b5.d r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f1529b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f1528a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.j.<init>(b5.d, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i10 = message.what;
        boolean z9 = true;
        if (i10 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i10);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        d dVar = this.f1529b;
        Context context = this.f1528a;
        int b10 = dVar.b(context);
        AtomicBoolean atomicBoolean = g.f1521a;
        if (b10 != 1 && b10 != 2 && b10 != 3 && b10 != 9) {
            z9 = false;
        }
        if (z9) {
            Intent a10 = dVar.a(context, "n", b10);
            if (a10 == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(context, 0, a10, zzd.zza | 134217728);
            }
            dVar.g(context, b10, activity);
        }
    }
}
