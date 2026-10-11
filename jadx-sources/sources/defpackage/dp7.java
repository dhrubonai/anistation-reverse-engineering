package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class dp7 implements Callable {
    public static final /* synthetic */ dp7 b = new dp7(0);
    public static final /* synthetic */ dp7 c = new dp7(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ dp7(byte b2) {
        this.a = b2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                rz7 rz7Var = new rz7("internal.platform", (byte) 4);
                rz7Var.y.put("getVersion", new rz7("getVersion", (byte) 3));
                return rz7Var;
            default:
                return null;
        }
    }
}
