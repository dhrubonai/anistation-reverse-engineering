package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class aa implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ w05 y;

    public /* synthetic */ aa(w05 w05Var, byte b) {
        this.x = b;
        this.y = w05Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        boolean z = true;
        w05 w05Var = this.y;
        switch (b) {
            case 0:
                w05Var.x = (h82) obj;
                return Boolean.TRUE;
            case 1:
                be2 be2Var = (be2) obj;
                if (a34.i(be2Var.S(), "waiting")) {
                    w05Var.x = be2Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                eo2 eo2Var = (eo2) obj;
                Object obj2 = w05Var.x;
                if (obj2 == null && eo2Var.N) {
                    w05Var.x = eo2Var;
                } else if (obj2 != null) {
                    eo2Var.getClass();
                }
                return Boolean.TRUE;
            case 3:
                yc1 yc1Var = (jj6) obj;
                if (((xz3) yc1Var).x.K) {
                    w05Var.x = yc1Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                jj6 jj6Var = (jj6) obj;
                jj6Var.getClass();
                be3 be3Var = ((lj6) jj6Var).L;
                List list = (List) w05Var.x;
                if (list != null) {
                    list.add(be3Var);
                } else {
                    list = te4.J(be3Var);
                }
                w05Var.x = list;
                return ij6.y;
        }
    }
}
