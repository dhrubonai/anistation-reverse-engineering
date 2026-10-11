package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lb7 extends h15 {
    public final Context a;
    public final /* synthetic */ qh2 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lb7(defpackage.qh2 r2, android.content.Context r3) {
        /*
            r1 = this;
            r1.b = r2
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto Ld
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r2 = android.os.Looper.myLooper()
        L11:
            r0 = 1
            r1.<init>(r2, r0)
            android.content.Context r2 = r3.getApplicationContext()
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb7.<init>(qh2, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = rh2.a;
        qh2 qh2Var = this.b;
        Context context = this.a;
        int b = qh2Var.b(context, i2);
        int i3 = xh2.e;
        if (b != 1 && b != 2 && b != 3 && b != 9) {
            return;
        }
        Intent a = qh2Var.a(b, context, "n");
        if (a == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, a, 201326592);
        }
        qh2Var.f(context, b, activity);
    }
}
