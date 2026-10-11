package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xb implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ArrayList y;

    public /* synthetic */ xb(ArrayList arrayList, byte b) {
        this.x = b;
        this.y = arrayList;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ArrayList arrayList = this.y;
        switch (b) {
            case 0:
                dm4 dm4Var = (dm4) obj;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    dm4.j(dm4Var, (em4) arrayList.get(i), 0, 0);
                }
                return pn6Var;
            case 1:
                dm4 dm4Var2 = (dm4) obj;
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dm4.j(dm4Var2, (em4) arrayList.get(i2), 0, 0);
                }
                return pn6Var;
            case 2:
                String str = (String) obj;
                str.getClass();
                arrayList.add(str);
                return pn6Var;
            case 3:
                dm4 dm4Var3 = (dm4) obj;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    dm4.k(dm4Var3, (em4) arrayList.get(i3), 0, 0);
                }
                return pn6Var;
            default:
                dm4 dm4Var4 = (dm4) obj;
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    dm4Var4.f((em4) arrayList.get(i4), 0, 0, 0.0f);
                }
                return pn6Var;
        }
    }
}
