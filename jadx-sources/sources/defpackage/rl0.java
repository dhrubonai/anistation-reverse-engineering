package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rl0 {
    public final LinkedHashMap a;

    public rl0(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap(0, 0.75f, true);
                return;
            case 2:
                this.a = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap();
                return;
        }
    }

    public void a(ql0 ql0Var) {
        long[] jArr = ql0Var.e;
        if (jArr.length > 0) {
            Long valueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.a;
            if (!linkedHashMap.containsKey(valueOf)) {
                linkedHashMap.put(Long.valueOf(ql0Var.e[0]), ql0Var);
            }
        }
    }

    public ql0 b() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ql0 ql0Var : this.a.values()) {
            arrayList.add(ql0Var.b);
            arrayList2.add(ql0Var.c);
            arrayList3.add(ql0Var.d);
            arrayList4.add(ql0Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        if (j == i) {
            z = true;
        } else {
            z = false;
        }
        io3.l(j, "the total number of elements (%s) in the arrays must fit in an int", z);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new ql0(iArr3, zz.r((long[][]) arrayList2.toArray(new long[arrayList2.size()])), zz.r((long[][]) arrayList3.toArray(new long[arrayList3.size()])), zz.r((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    public ix5 c(i77 i77Var) {
        i77Var.getClass();
        return (ix5) this.a.remove(i77Var);
    }

    public List d(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (a34.i(((i77) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((i77) it.next());
        }
        return yo0.I0(linkedHashMap.values());
    }

    public ix5 e(i77 i77Var) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(i77Var);
        if (obj == null) {
            obj = new ix5(i77Var);
            linkedHashMap.put(i77Var, obj);
        }
        return (ix5) obj;
    }
}
