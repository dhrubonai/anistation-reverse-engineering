package defpackage;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jc5 {
    public final ti4 a = xt5.g(Boolean.FALSE);

    public final void a(oa oaVar, xh5 xh5Var, l11 l11Var, Consumer consumer) {
        Object obj;
        z44 z44Var = new z44(new kc5[16], 0);
        wc7.W(xh5Var.a(), 0, new ic5(1, z44Var, z44.class, "add", "add(Ljava/lang/Object;)Z", 8, (byte) 0));
        Arrays.sort(z44Var.x, 0, z44Var.z, jf7.r(new la5((byte) 20), new la5((byte) 21)));
        int i = z44Var.z;
        if (i == 0) {
            obj = null;
        } else {
            obj = z44Var.x[i - 1];
        }
        kc5 kc5Var = (kc5) obj;
        if (kc5Var == null) {
            return;
        }
        g13 g13Var = kc5Var.c;
        nt0 nt0Var = new nt0(kc5Var.a, g13Var, db.b(l11Var), this, oaVar);
        fa4 fa4Var = kc5Var.d;
        n05 G = te4.B(fa4Var).G(fa4Var, true);
        long c = g13Var.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(oaVar, z51.Q(wk6.D(G)), new Point((int) (c >> 32), (int) (c & 4294967295L)), nt0Var);
        scrollCaptureTarget.setScrollBounds(z51.Q(g13Var));
        consumer.accept(scrollCaptureTarget);
    }
}
