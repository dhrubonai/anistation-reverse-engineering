package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gk7 extends ti7 {
    public final ArrayList A;
    public final vs7 B;
    public final ArrayList z;

    public gk7(String str, ArrayList arrayList, List list, vs7 vs7Var) {
        super(str);
        this.z = new ArrayList();
        this.B = vs7Var;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.z.add(((ik7) obj).d());
            }
        }
        this.A = new ArrayList(list);
    }

    @Override // defpackage.ti7
    public final ik7 a(vs7 vs7Var, List list) {
        xk7 xk7Var;
        vs7 e = this.B.e();
        y23 y23Var = (y23) e.b;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.z;
            int size = arrayList.size();
            xk7Var = ik7.p;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                e.h((String) arrayList.get(i2), ((y23) vs7Var.b).f0(vs7Var, (ik7) list.get(i2)));
            } else {
                e.h((String) arrayList.get(i2), xk7Var);
            }
            i2++;
        }
        ArrayList arrayList2 = this.A;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            ik7 ik7Var = (ik7) obj;
            ik7 f0 = y23Var.f0(e, ik7Var);
            if (f0 instanceof mk7) {
                f0 = y23Var.f0(e, ik7Var);
            }
            if (f0 instanceof eh7) {
                return ((eh7) f0).x;
            }
        }
        return xk7Var;
    }

    @Override // defpackage.ti7, defpackage.ik7
    public final ik7 m() {
        return new gk7(this);
    }

    public gk7(gk7 gk7Var) {
        super(gk7Var.x);
        ArrayList arrayList = new ArrayList(gk7Var.z.size());
        this.z = arrayList;
        arrayList.addAll(gk7Var.z);
        ArrayList arrayList2 = new ArrayList(gk7Var.A.size());
        this.A = arrayList2;
        arrayList2.addAll(gk7Var.A);
        this.B = gk7Var.B;
    }
}
