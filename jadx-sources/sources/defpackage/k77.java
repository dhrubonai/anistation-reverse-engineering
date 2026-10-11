package defpackage;

import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class k77 {
    public final void a(qe4 qe4Var) {
        qe4Var.getClass();
        List H = te4.H(qe4Var);
        l77 l77Var = (l77) this;
        if (!H.isEmpty()) {
            px1 px1Var = px1.y;
            c77 c77Var = new c77(l77Var, null, px1Var, H, 0);
            if (!c77Var.g) {
                sw0.A(l77Var.b.f, "EnqueueRunnable_" + px1Var.name(), ((o77) l77Var.d).a, new e96(c77Var, (byte) 10));
                return;
            }
            xk3.d().g(c77.h, "Already enqueued work ids (" + TextUtils.join(", ", c77Var.e) + ")");
            return;
        }
        ze0.k("enqueue needs at least one WorkRequest.");
    }
}
