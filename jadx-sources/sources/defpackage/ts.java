package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ts {
    public final char a;
    public final List b;
    public final ArrayList c;
    public final ts[] d;

    public ts(char c, List list, ArrayList arrayList) {
        this.a = c;
        this.b = list;
        this.c = arrayList;
        ts[] tsVarArr = new ts[256];
        for (int i = 0; i < 256; i++) {
            ArrayList arrayList2 = this.c;
            int size = arrayList2.size();
            Object obj = null;
            boolean z = false;
            int i2 = 0;
            Object obj2 = null;
            while (true) {
                if (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    if (((ts) obj3).a == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = obj3;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            tsVarArr[i] = obj;
        }
        this.d = tsVarArr;
    }
}
