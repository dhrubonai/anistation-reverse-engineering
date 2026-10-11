package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sm2 extends f95 {
    public final Map K;
    public op1 L;

    public sm2(l7 l7Var, xp1 xp1Var, tp1 tp1Var, Map map) {
        super(l7Var, xp1Var, tp1Var);
        this.K = map;
    }

    @Override // defpackage.f95
    public final ea2 m(ea2 ea2Var) {
        op1 op1Var;
        op1 op1Var2 = this.L;
        if (op1Var2 == null) {
            op1Var2 = ea2Var.t;
        }
        if (op1Var2 != null && (op1Var = (op1) this.K.get(op1Var2.z)) != null) {
            op1Var2 = op1Var;
        }
        fy3 fy3Var = ea2Var.m;
        fy3 fy3Var2 = null;
        if (fy3Var != null) {
            ey3[] ey3VarArr = fy3Var.a;
            int length = ey3VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    ey3 ey3Var = ey3VarArr[i];
                    if ((ey3Var instanceof fu4) && "com.apple.streaming.transportStreamTimestamp".equals(((fu4) ey3Var).b)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                if (length != 1) {
                    ey3[] ey3VarArr2 = new ey3[length - 1];
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 != i) {
                            ey3VarArr2[i2 < i ? i2 : i2 - 1] = ey3VarArr[i2];
                        }
                    }
                    fy3Var2 = new fy3(ey3VarArr2);
                }
            }
            if (op1Var2 == ea2Var.t || fy3Var != ea2Var.m) {
                da2 a = ea2Var.a();
                a.s = op1Var2;
                a.l = fy3Var;
                ea2Var = new ea2(a);
            }
            return super.m(ea2Var);
        }
        fy3Var = fy3Var2;
        if (op1Var2 == ea2Var.t) {
        }
        da2 a2 = ea2Var.a();
        a2.s = op1Var2;
        a2.l = fy3Var;
        ea2Var = new ea2(a2);
        return super.m(ea2Var);
    }
}
