package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class gs3 extends hs3 {
    public final Object a = new Object();
    public Executor b;
    public af2 c;
    public cs3 d;
    public ArrayList e;

    public final void j(cs3 cs3Var, ArrayList arrayList) {
        if (cs3Var != null) {
            synchronized (this.a) {
                try {
                    Executor executor = this.b;
                    if (executor != null) {
                        executor.execute(new es3(this, this.c, cs3Var, arrayList, (byte) 0));
                    } else {
                        this.d = cs3Var;
                        this.e = new ArrayList(arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        qi2.m("groupRoute must not be null");
    }
}
