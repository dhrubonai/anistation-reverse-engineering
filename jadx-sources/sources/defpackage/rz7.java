package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rz7 extends ti7 {
    public final /* synthetic */ byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz7(String str, byte b) {
        super(str);
        this.z = b;
    }

    @Override // defpackage.ti7
    public final ik7 a(vs7 vs7Var, List list) {
        byte b = this.z;
        xk7 xk7Var = ik7.p;
        switch (b) {
            case 0:
                return xk7Var;
            case 1:
            case 2:
                return this;
            case 3:
                return new xh7(Double.valueOf(0.0d));
            default:
                return xk7Var;
        }
    }
}
