package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l08 extends ll7 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l08(Object obj, rv7 rv7Var, byte b) {
        super(rv7Var);
        this.e = b;
        this.f = obj;
    }

    @Override // defpackage.ll7
    public final void a() {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                g90 g90Var = (g90) obj;
                r08 r08Var = (r08) g90Var.A;
                r08Var.L();
                gu7 gu7Var = (gu7) r08Var.x;
                gu7Var.H.getClass();
                g90Var.i(SystemClock.elapsedRealtime(), false, false);
                io7 io7Var = gu7Var.K;
                gu7.i(io7Var);
                gu7Var.H.getClass();
                io7Var.O(SystemClock.elapsedRealtime());
                return;
            case 1:
                z08 z08Var = (z08) obj;
                z08Var.P();
                es7 es7Var = ((gu7) z08Var.x).C;
                gu7.l(es7Var);
                es7Var.K.a("Starting upload from DelayedRunnable");
                z08Var.y.q();
                return;
            default:
                z18 z18Var = (z18) obj;
                z18Var.f().L();
                String str = (String) z18Var.N.pollFirst();
                if (str != null) {
                    z18Var.d().getClass();
                    z18Var.f0 = SystemClock.elapsedRealtime();
                    z18Var.c().K.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = z18Var.I.x;
                    if (Build.VERSION.SDK_INT >= 34) {
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        context.sendBroadcast(intent, null, bundle);
                    } else {
                        context.sendBroadcast(intent);
                    }
                }
                z18Var.H();
                return;
        }
    }
}
