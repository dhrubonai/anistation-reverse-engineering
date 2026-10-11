package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cj5 implements aj5, kf0 {
    public final String a;
    public final hj5 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final aj5[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final aj5[] k;
    public final d46 l;

    public cj5(String str, hj5 hj5Var, int i, List list, jm0 jm0Var) {
        this.a = str;
        this.b = hj5Var;
        this.c = i;
        this.d = jm0Var.b;
        ArrayList arrayList = jm0Var.c;
        HashSet hashSet = new HashSet(vn3.S(zo0.V(arrayList, 12)));
        yo0.G0(arrayList, hashSet);
        this.e = hashSet;
        int i2 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = db.H(jm0Var.e);
        this.h = (List[]) jm0Var.f.toArray(new List[0]);
        ArrayList arrayList2 = jm0Var.g;
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            zArr[i2] = ((Boolean) obj).booleanValue();
            i2++;
        }
        this.i = zArr;
        String[] strArr = this.f;
        strArr.getClass();
        ns nsVar = new ns(new y7(strArr, (byte) 19), (byte) 1);
        ArrayList arrayList3 = new ArrayList(zo0.V(nsVar, 10));
        Iterator it = nsVar.iterator();
        while (true) {
            yp1 yp1Var = (yp1) it;
            if (yp1Var.y.hasNext()) {
                xx2 xx2Var = (xx2) yp1Var.next();
                arrayList3.add(new ai4(xx2Var.b, Integer.valueOf(xx2Var.a)));
            } else {
                this.j = vn3.Y(arrayList3);
                this.k = db.H(list);
                this.l = new d46(new nj4(this, (byte) 18));
                return;
            }
        }
    }

    @Override // defpackage.aj5
    public final String a() {
        return this.a;
    }

    @Override // defpackage.kf0
    public final Set b() {
        return this.e;
    }

    @Override // defpackage.aj5
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.aj5
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cj5) {
                aj5 aj5Var = (aj5) obj;
                if (this.a.equals(aj5Var.a()) && Arrays.equals(this.k, ((cj5) obj).k)) {
                    int e = aj5Var.e();
                    int i = this.c;
                    if (i == e) {
                        for (int i2 = 0; i2 < i; i2++) {
                            aj5[] aj5VarArr = this.g;
                            if (a34.i(aj5VarArr[i2].a(), aj5Var.h(i2).a()) && a34.i(aj5VarArr[i2].getKind(), aj5Var.h(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.aj5
    public final String f(int i) {
        return this.f[i];
    }

    @Override // defpackage.aj5
    public final List g(int i) {
        return this.h[i];
    }

    @Override // defpackage.aj5
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.aj5
    public final hj5 getKind() {
        return this.b;
    }

    @Override // defpackage.aj5
    public final aj5 h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.aj5
    public final boolean i(int i) {
        return this.i[i];
    }

    public final String toString() {
        return o80.L(this);
    }
}
