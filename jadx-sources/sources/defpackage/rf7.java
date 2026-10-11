package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rf7 implements Iterable, ik7, uj7 {
    public final TreeMap x;
    public final TreeMap y;

    public rf7(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                r(i, (ik7) list.get(i));
            }
        }
    }

    @Override // defpackage.uj7
    public final ik7 b(String str) {
        ik7 ik7Var;
        if ("length".equals(str)) {
            return new xh7(Double.valueOf(p()));
        }
        if (k(str) && (ik7Var = (ik7) this.y.get(str)) != null) {
            return ik7Var;
        }
        return ik7.p;
    }

    @Override // defpackage.ik7
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ik7
    public final String d() {
        return u(",");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof rf7) {
                rf7 rf7Var = (rf7) obj;
                if (p() == rf7Var.p()) {
                    TreeMap treeMap = this.x;
                    if (treeMap.isEmpty()) {
                        return rf7Var.x.isEmpty();
                    }
                    for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
                        if (!q(intValue).equals(rf7Var.q(intValue))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ik7
    public final Iterator f() {
        return new oe7(this, this.x.keySet().iterator(), this.y.keySet().iterator());
    }

    @Override // defpackage.uj7
    public final void g(String str, ik7 ik7Var) {
        TreeMap treeMap = this.y;
        if (ik7Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, ik7Var);
        }
    }

    @Override // defpackage.ik7
    public final Double h() {
        TreeMap treeMap = this.x;
        if (treeMap.size() == 1) {
            return q(0).h();
        }
        if (treeMap.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.x.hashCode() * 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02dc, code lost:
    
        if (defpackage.iv5.p(r7, r2, (defpackage.gk7) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).p() == r7.p()) goto L168;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0123. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    @Override // defpackage.ik7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ik7 i(java.lang.String r37, defpackage.vs7 r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instructions count: 2164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf7.i(java.lang.String, vs7, java.util.ArrayList):ik7");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ok7(this, (byte) 2);
    }

    @Override // defpackage.uj7
    public final boolean k(String str) {
        if (!"length".equals(str) && !this.y.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ik7
    public final ik7 m() {
        rf7 rf7Var = new rf7();
        for (Map.Entry entry : this.x.entrySet()) {
            boolean z = entry.getValue() instanceof uj7;
            TreeMap treeMap = rf7Var.x;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (ik7) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((ik7) entry.getValue()).m());
            }
        }
        return rf7Var;
    }

    public final List n() {
        ArrayList arrayList = new ArrayList(p());
        for (int i = 0; i < p(); i++) {
            arrayList.add(q(i));
        }
        return arrayList;
    }

    public final Iterator o() {
        return this.x.keySet().iterator();
    }

    public final int p() {
        TreeMap treeMap = this.x;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final ik7 q(int i) {
        ik7 ik7Var;
        if (i < p()) {
            if (s(i) && (ik7Var = (ik7) this.x.get(Integer.valueOf(i))) != null) {
                return ik7Var;
            }
            return ik7.p;
        }
        ze0.g("Attempting to get element outside of current array");
        return null;
    }

    public final void r(int i, ik7 ik7Var) {
        if (i <= 32468) {
            if (i >= 0) {
                TreeMap treeMap = this.x;
                if (ik7Var == null) {
                    treeMap.remove(Integer.valueOf(i));
                    return;
                } else {
                    treeMap.put(Integer.valueOf(i), ik7Var);
                    return;
                }
            }
            ze0.g(h11.g(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            return;
        }
        ze0.m("Array too large");
    }

    public final boolean s(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.x;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        ze0.g(h11.g(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        return false;
    }

    public final void t(int i) {
        TreeMap treeMap = this.x;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            treeMap.remove(Integer.valueOf(i));
            if (i == intValue) {
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!treeMap.containsKey(valueOf) && i2 >= 0) {
                    treeMap.put(valueOf, ik7.p);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i);
                    ik7 ik7Var = (ik7) treeMap.get(valueOf2);
                    if (ik7Var != null) {
                        treeMap.put(Integer.valueOf(i - 1), ik7Var);
                        treeMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return u(",");
    }

    public final String u(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.x.isEmpty()) {
            int i = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i >= p()) {
                    break;
                }
                ik7 q = q(i);
                sb.append(str2);
                if (!(q instanceof xk7) && !(q instanceof bk7)) {
                    sb.append(q.d());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public rf7() {
        this.x = new TreeMap();
        this.y = new TreeMap();
    }
}
