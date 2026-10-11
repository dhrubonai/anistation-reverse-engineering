package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class c01 implements sb2 {
    public final /* synthetic */ w44 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ w44 z;

    public /* synthetic */ c01(ub2 ub2Var, w44 w44Var, w44 w44Var2, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = w44Var;
        this.A = w44Var2;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w44 w44Var = this.A;
        w44 w44Var2 = this.z;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                ub2Var.invoke(yo0.I0((Set) w44Var2.getValue()));
                w44Var.setValue(Boolean.FALSE);
                w44Var2.setValue(tt1.x);
                return pn6Var;
            default:
                String str = (String) w44Var2.getValue();
                if (str != null) {
                    ub2Var.invoke(str);
                }
                w44Var.setValue(Boolean.FALSE);
                return pn6Var;
        }
    }
}
