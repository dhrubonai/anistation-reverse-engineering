package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class lc3 implements ub2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ w44 y;
    public final /* synthetic */ ArrayList z;

    public /* synthetic */ lc3(w44 w44Var, ArrayList arrayList, List list, boolean z, byte b) {
        this.x = b;
        this.y = w44Var;
        this.z = arrayList;
        this.A = list;
        this.B = z;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        boolean z = this.B;
        List list = this.A;
        ArrayList arrayList = this.z;
        w44 w44Var = this.y;
        pn6 pn6Var = pn6.a;
        dm4 dm4Var = (dm4) obj;
        switch (b) {
            case 0:
                dm4Var.x = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((nc3) arrayList.get(i)).n(dm4Var, z);
                }
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((nc3) list.get(i2)).n(dm4Var, z);
                }
                dm4Var.x = false;
                w44Var.getValue();
                return pn6Var;
            default:
                dm4Var.x = true;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((ve3) arrayList.get(i3)).n(dm4Var, z);
                }
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((ve3) list.get(i4)).n(dm4Var, z);
                }
                dm4Var.x = false;
                w44Var.getValue();
                return pn6Var;
        }
    }
}
