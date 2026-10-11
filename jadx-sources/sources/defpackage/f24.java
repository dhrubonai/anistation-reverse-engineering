package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface f24 {
    default int a(j23 j23Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new i91((ro3) list2.get(i3), k23.y, o23.x, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new x23(j23Var, j23Var.getLayoutDirection()), arrayList2, sx0.b(0, 0, 0, i, 7)).getWidth();
    }

    wo3 b(xo3 xo3Var, List list, long j);

    default int c(j23 j23Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new i91((ro3) list2.get(i3), k23.x, o23.x, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new x23(j23Var, j23Var.getLayoutDirection()), arrayList2, sx0.b(0, 0, 0, i, 7)).getWidth();
    }

    default int d(j23 j23Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new i91((ro3) list2.get(i3), k23.y, o23.y, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new x23(j23Var, j23Var.getLayoutDirection()), arrayList2, sx0.b(0, i, 0, 0, 13)).getHeight();
    }

    default int e(j23 j23Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new i91((ro3) list2.get(i3), k23.x, o23.y, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new x23(j23Var, j23Var.getLayoutDirection()), arrayList2, sx0.b(0, i, 0, 0, 13)).getHeight();
    }
}
