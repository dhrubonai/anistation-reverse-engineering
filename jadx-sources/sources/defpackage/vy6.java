package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vy6 implements sb2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ w44 C;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ w44 z;

    public /* synthetic */ vy6(af3 af3Var, boolean z, Integer num, w44 w44Var, qi4 qi4Var) {
        this.A = af3Var;
        this.y = z;
        this.B = num;
        this.z = w44Var;
        this.C = qi4Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        boolean z = false;
        w44 w44Var = this.C;
        w44 w44Var2 = this.z;
        Object obj = this.B;
        Object obj2 = this.A;
        boolean z2 = this.y;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                qi4 qi4Var = (qi4) w44Var;
                List list = ((af3) obj2).j().l;
                if (((Boolean) w44Var2.getValue()).booleanValue() && qi4Var.h() == 0 && z2 && num != null && !list.isEmpty()) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((ve3) it.next()).a == num.intValue()) {
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                v27 v27Var = (v27) obj2;
                ub2 ub2Var = (ub2) obj;
                if (z2 && !((dq4) w44Var2.getValue()).j) {
                    w44Var.setValue(Boolean.TRUE);
                    v27Var.O(false);
                    ub2Var.invoke(gp4.x);
                }
                return pn6.a;
        }
    }

    public /* synthetic */ vy6(boolean z, v27 v27Var, ub2 ub2Var, w44 w44Var, w44 w44Var2) {
        this.y = z;
        this.A = v27Var;
        this.B = ub2Var;
        this.z = w44Var;
        this.C = w44Var2;
    }
}
