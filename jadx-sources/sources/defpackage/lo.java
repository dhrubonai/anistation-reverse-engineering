package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class lo {
    public static final ko a = new ko("");

    public static final List a(ko koVar, int i, int i2, ui uiVar) {
        List list;
        boolean z;
        if (i == i2 || (list = koVar.x) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= koVar.y.length()) {
            if (uiVar == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) uiVar.invoke(((jo) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            jo joVar = (jo) list.get(i3);
            if (uiVar != null) {
                z = ((Boolean) uiVar.invoke(joVar.a)).booleanValue();
            } else {
                z = true;
            }
            if (z) {
                int i4 = joVar.b;
                int i5 = joVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new jo((go) joVar.a, db.C(joVar.b, i, i2) - i, db.C(i5, i, i2) - i, joVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        if (i3 == i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z | z2;
        if (i == i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z6 & z3;
        if (i < i4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i3 < i2) {
            z5 = true;
        }
        return (z4 & z5) | z7;
    }
}
