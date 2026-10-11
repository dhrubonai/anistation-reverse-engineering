package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class pa7 implements ja7 {
    public static pa7 d;
    public float a;
    public ma7 b;
    public ia7 c;

    /* JADX WARN: Type inference failed for: r0v3, types: [pa7, java.lang.Object] */
    public static pa7 b() {
        pa7 pa7Var = d;
        if (pa7Var == null) {
            new xb5((byte) 9);
            new qc5((byte) 9);
            ?? obj = new Object();
            obj.a = 0.0f;
            d = obj;
            return obj;
        }
        return pa7Var;
    }

    @Override // defpackage.ja7
    public final void a(boolean z) {
        if (z) {
            mj6.f.getClass();
            mj6.b();
            return;
        }
        mj6.f.getClass();
        Handler handler = mj6.h;
        if (handler != null) {
            handler.removeCallbacks(mj6.j);
            mj6.h = null;
        }
    }
}
