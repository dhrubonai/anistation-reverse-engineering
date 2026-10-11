package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface vo3 {
    default int a(j23 j23Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new i91((ro3) list.get(i2), k23.y, o23.x, b));
        }
        return b(new x23(j23Var, j23Var.getLayoutDirection()), arrayList, sx0.b(0, 0, 0, i, 7)).getWidth();
    }

    wo3 b(xo3 xo3Var, List list, long j);

    default int c(j23 j23Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new i91((ro3) list.get(i2), k23.x, o23.x, b));
        }
        return b(new x23(j23Var, j23Var.getLayoutDirection()), arrayList, sx0.b(0, 0, 0, i, 7)).getWidth();
    }

    default int d(j23 j23Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new i91((ro3) list.get(i2), k23.y, o23.y, b));
        }
        return b(new x23(j23Var, j23Var.getLayoutDirection()), arrayList, sx0.b(0, i, 0, 0, 13)).getHeight();
    }

    default int e(j23 j23Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new i91((ro3) list.get(i2), k23.x, o23.y, b));
        }
        return b(new x23(j23Var, j23Var.getLayoutDirection()), arrayList, sx0.b(0, i, 0, 0, 13)).getHeight();
    }
}
