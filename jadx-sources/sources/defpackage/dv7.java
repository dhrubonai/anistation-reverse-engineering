package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dv7 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b48 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ nv7 d;

    public /* synthetic */ dv7(nv7 nv7Var, b48 b48Var, Bundle bundle, byte b) {
        this.a = b;
        this.b = b48Var;
        this.c = bundle;
        this.d = nv7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        byte b = this.a;
        Bundle bundle = this.c;
        b48 b48Var = this.b;
        nv7 nv7Var = this.d;
        switch (b) {
            case 0:
                z18 z18Var = nv7Var.e;
                z18Var.V();
                return z18Var.d0(bundle, b48Var);
            default:
                z18 z18Var2 = nv7Var.e;
                z18Var2.V();
                return z18Var2.d0(bundle, b48Var);
        }
    }
}
