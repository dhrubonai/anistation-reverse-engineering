package b2;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1349b;

    public k(l lVar, s1.k kVar) {
        this.f1349b = lVar;
        Handler l10 = f1.b0.l(this);
        this.f1348a = l10;
        kVar.h(this, l10);
    }

    public final void a(long j4) {
        boolean z9;
        Surface surface;
        l lVar = this.f1349b;
        if (this == lVar.f1374y1 && lVar.f9819b0 != null) {
            if (j4 == Long.MAX_VALUE) {
                lVar.P0 = true;
                return;
            }
            try {
                lVar.w0(j4);
                lVar.D0(lVar.f1368s1);
                lVar.R0.f5723e++;
                r rVar = lVar.f1351b1;
                if (rVar.f1390e != 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                rVar.f1390e = 3;
                ((f1.v) rVar.f1396k).getClass();
                rVar.f1392g = f1.b0.O(SystemClock.elapsedRealtime());
                if (z9 && (surface = lVar.f1356g1) != null) {
                    e0 e0Var = lVar.Y0;
                    Handler handler = e0Var.f1336a;
                    if (handler != null) {
                        handler.post(new c0(e0Var, surface, SystemClock.elapsedRealtime(), 0));
                    }
                    lVar.f1359j1 = true;
                }
                lVar.d0(j4);
            } catch (j1.m e10) {
                lVar.Q0 = e10;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = f1.b0.f3799a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
