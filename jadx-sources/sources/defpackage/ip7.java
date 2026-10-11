package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ip7 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public ip7(nv7 nv7Var, mm7 mm7Var, String str) {
        this.a = (byte) 2;
        this.b = nv7Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((Context) obj).getSharedPreferences("google_sdk_flags", 0);
            case 1:
                return new ow7(((nt7) obj).I);
            default:
                z18 z18Var = ((nv7) obj).e;
                z18Var.V();
                ls7 ls7Var = z18Var.E;
                z18.T(ls7Var);
                ls7Var.L();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public /* synthetic */ ip7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
