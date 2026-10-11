package defpackage;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class jg3 implements lg3 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Serializable z;

    public /* synthetic */ jg3(Object obj, Serializable serializable, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = serializable;
        this.A = obj2;
    }

    @Override // defpackage.lg3
    public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
        byte b = this.x;
        dg3 dg3Var2 = null;
        Object obj = this.A;
        Serializable serializable = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                xg3 xg3Var = (xg3) obj2;
                w05 w05Var = (w05) serializable;
                ub2 ub2Var = (ub2) obj;
                int i = kg3.a[dg3Var.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        rz rzVar = (rz) w05Var.x;
                        if (rzVar != null) {
                            rzVar.a();
                        }
                        w05Var.x = null;
                        return;
                    }
                    return;
                }
                w05Var.x = ub2Var.invoke(xg3Var);
                return;
            default:
                kx3 kx3Var = (kx3) obj2;
                eg3 eg3Var = (eg3) serializable;
                qx3 qx3Var = (qx3) obj;
                kx3Var.getClass();
                lr0 lr0Var = kx3Var.a;
                CopyOnWriteArrayList copyOnWriteArrayList = kx3Var.b;
                dg3.Companion.getClass();
                int ordinal = eg3Var.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            dg3Var2 = dg3.ON_RESUME;
                        }
                    } else {
                        dg3Var2 = dg3.ON_START;
                    }
                } else {
                    dg3Var2 = dg3.ON_CREATE;
                }
                if (dg3Var == dg3Var2) {
                    copyOnWriteArrayList.add(qx3Var);
                    lr0Var.run();
                    return;
                } else if (dg3Var == dg3.ON_DESTROY) {
                    kx3Var.a(qx3Var);
                    return;
                } else {
                    if (dg3Var == bg3.a(eg3Var)) {
                        copyOnWriteArrayList.remove(qx3Var);
                        lr0Var.run();
                        return;
                    }
                    return;
                }
        }
    }
}
