package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vx3 extends lu0 {
    public static final ar3 s;
    public final lw3[] k;
    public final ArrayList l;
    public final kf6[] m;
    public final ArrayList n;
    public final m18 o;
    public int p;
    public long[][] q;
    public co0 r;

    static {
        nq3 nq3Var = new nq3();
        nq3Var.b = "MergingMediaSource";
        s = nq3Var.a();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, x24] */
    /* JADX WARN: Type inference failed for: r4v4, types: [y24, t1] */
    public vx3(lw3... lw3VarArr) {
        m18 m18Var = new m18((byte) 13);
        this.k = lw3VarArr;
        this.o = m18Var;
        this.n = new ArrayList(Arrays.asList(lw3VarArr));
        this.p = -1;
        this.l = new ArrayList(lw3VarArr.length);
        for (int i = 0; i < lw3VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new kf6[lw3VarArr.length];
        this.q = new long[0];
        new HashMap();
        io3.t(8, "expectedKeys");
        io3.t(2, "expectedValuesPerKey");
        sq0 b = sq0.b(8);
        ?? obj = new Object();
        io3.t(2, "expectedValuesPerKey");
        new t1(b).D = obj;
    }

    @Override // defpackage.lw3
    public final boolean a(ar3 ar3Var) {
        lw3[] lw3VarArr = this.k;
        if (lw3VarArr.length <= 0 || !lw3VarArr[0].a(ar3Var)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.lw3
    public final or3 b(jw3 jw3Var, l7 l7Var, long j) {
        lw3[] lw3VarArr = this.k;
        int length = lw3VarArr.length;
        or3[] or3VarArr = new or3[length];
        kf6[] kf6VarArr = this.m;
        int b = kf6VarArr[0].b(jw3Var.a);
        for (int i = 0; i < length; i++) {
            jw3 a = jw3Var.a(kf6VarArr[i].l(b));
            or3VarArr[i] = lw3VarArr[i].b(a, l7Var, j - this.q[b][i]);
            ((List) this.l.get(i)).add(new ux3(a, or3VarArr[i]));
        }
        return new tx3(this.o, this.q[b], or3VarArr);
    }

    @Override // defpackage.lw3
    public final ar3 c() {
        lw3[] lw3VarArr = this.k;
        if (lw3VarArr.length > 0) {
            return lw3VarArr[0].c();
        }
        return s;
    }

    @Override // defpackage.lu0, defpackage.lw3
    public final void d() {
        co0 co0Var = this.r;
        if (co0Var == null) {
            super.d();
            return;
        }
        throw co0Var;
    }

    @Override // defpackage.lw3
    public final void g(ar3 ar3Var) {
        this.k[0].g(ar3Var);
    }

    @Override // defpackage.lw3
    public final void h(or3 or3Var) {
        or3 or3Var2;
        or3 or3Var3;
        tx3 tx3Var = (tx3) or3Var;
        int i = 0;
        while (true) {
            lw3[] lw3VarArr = this.k;
            if (i < lw3VarArr.length) {
                List list = (List) this.l.get(i);
                boolean[] zArr = tx3Var.y;
                or3[] or3VarArr = tx3Var.x;
                if (zArr[i]) {
                    or3Var2 = ((af6) or3VarArr[i]).x;
                } else {
                    or3Var2 = or3VarArr[i];
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    if (((ux3) list.get(i2)).b.equals(or3Var2)) {
                        list.remove(i2);
                        break;
                    }
                    i2++;
                }
                lw3 lw3Var = lw3VarArr[i];
                if (tx3Var.y[i]) {
                    or3Var3 = ((af6) or3VarArr[i]).x;
                } else {
                    or3Var3 = or3VarArr[i];
                }
                lw3Var.h(or3Var3);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.t30
    public final void n(n71 n71Var) {
        this.j = eq6.p(null);
        int i = 0;
        while (true) {
            lw3[] lw3VarArr = this.k;
            if (i < lw3VarArr.length) {
                x(Integer.valueOf(i), lw3VarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.lu0, defpackage.t30
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.lu0
    public final jw3 t(Object obj, jw3 jw3Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((ux3) list.get(i)).a.equals(jw3Var)) {
                return ((ux3) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [co0, java.io.IOException] */
    @Override // defpackage.lu0
    public final void w(Object obj, t30 t30Var, kf6 kf6Var) {
        int i;
        Integer num = (Integer) obj;
        if (this.r == null) {
            if (this.p == -1) {
                i = kf6Var.h();
                this.p = i;
            } else {
                int h = kf6Var.h();
                int i2 = this.p;
                if (h != i2) {
                    this.r = new IOException();
                    return;
                }
                i = i2;
            }
            int length = this.q.length;
            kf6[] kf6VarArr = this.m;
            if (length == 0) {
                this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, kf6VarArr.length);
            }
            ArrayList arrayList = this.n;
            arrayList.remove(t30Var);
            kf6VarArr[num.intValue()] = kf6Var;
            if (arrayList.isEmpty()) {
                o(kf6VarArr[0]);
            }
        }
    }
}
