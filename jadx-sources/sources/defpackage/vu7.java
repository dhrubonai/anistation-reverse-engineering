package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vu7 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ nv7 e;

    public /* synthetic */ vu7(nv7 nv7Var, String str, String str2, String str3, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = nv7Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        nv7 nv7Var = this.e;
        switch (b) {
            case 0:
                z18 z18Var = nv7Var.e;
                z18Var.V();
                fl7 fl7Var = z18Var.z;
                z18.T(fl7Var);
                return fl7Var.J0(str3, str2, str);
            case 1:
                z18 z18Var2 = nv7Var.e;
                z18Var2.V();
                fl7 fl7Var2 = z18Var2.z;
                z18.T(fl7Var2);
                return fl7Var2.J0(str3, str2, str);
            case 2:
                z18 z18Var3 = nv7Var.e;
                z18Var3.V();
                fl7 fl7Var3 = z18Var3.z;
                z18.T(fl7Var3);
                return fl7Var3.N0(str3, str2, str);
            default:
                z18 z18Var4 = nv7Var.e;
                z18Var4.V();
                fl7 fl7Var4 = z18Var4.z;
                z18.T(fl7Var4);
                return fl7Var4.N0(str3, str2, str);
        }
    }
}
