package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dn1 implements x42 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ w44 z;

    public /* synthetic */ dn1(ArrayList arrayList, w44 w44Var, byte b) {
        this.x = b;
        this.y = arrayList;
        this.z = w44Var;
    }

    @Override // defpackage.x42
    public final Object emit(Object obj, vz0 vz0Var) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w44 w44Var = this.z;
        ArrayList arrayList = this.y;
        switch (b) {
            case 0:
                n13 n13Var = (n13) obj;
                if (n13Var instanceof bn1) {
                    arrayList.add(n13Var);
                } else if (n13Var instanceof cn1) {
                    arrayList.remove(((cn1) n13Var).a);
                }
                w44Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return pn6Var;
            default:
                n13 n13Var2 = (n13) obj;
                if (n13Var2 instanceof k72) {
                    arrayList.add(n13Var2);
                } else if (n13Var2 instanceof l72) {
                    arrayList.remove(((l72) n13Var2).a);
                }
                w44Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return pn6Var;
        }
    }
}
