package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o77 implements q76 {
    public final ej5 a;
    public final n11 b;
    public final ke0 c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final lj2 e = new lj2(this, (byte) 2);

    public o77(Executor executor) {
        ej5 ej5Var = new ej5(executor);
        this.a = ej5Var;
        n11 B = q23.B(ej5Var);
        this.b = B;
        q23.B(new ej5(executor));
        this.c = db.b(B);
    }
}
