package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w81 implements qk2, rk2 {
    public final qb3 a;
    public final Context b;
    public final ow4 c;
    public final Set d;
    public final Executor e;

    public w81(Context context, String str, Set set, ow4 ow4Var, Executor executor) {
        this.a = new qb3(new ks0(context, str, (byte) 1));
        this.d = set;
        this.e = executor;
        this.c = ow4Var;
        this.b = context;
    }

    public final v78 a() {
        if (!lt5.o(this.b)) {
            return hz5.e("");
        }
        return hz5.d(this.e, new v81(this, (byte) 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            hz5.e(null);
        } else if (!lt5.o(this.b)) {
            hz5.e(null);
        } else {
            hz5.d(this.e, new v81(this, (byte) 1));
        }
    }
}
