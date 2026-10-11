package b2;

import android.os.Handler;
import c1.p1;
import f.m0;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1336a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f1337b;

    public e0(Handler handler, f0 f0Var) {
        if (f0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f1336a = handler;
        this.f1337b = f0Var;
    }

    public final void a(j1.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = this.f1336a;
        if (handler != null) {
            handler.post(new d0(this, fVar, 1));
        }
    }

    public final void b(p1 p1Var) {
        Handler handler = this.f1336a;
        if (handler != null) {
            handler.post(new m0(14, this, p1Var));
        }
    }
}
