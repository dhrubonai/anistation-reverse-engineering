package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class qt0 implements qz5, rv7 {
    public Object x;

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, gh0] */
    public qt0(byte b) {
        switch (b) {
            case 1:
                s34 s34Var = b13.a;
                this.x = new s34();
                return;
            case 2:
            case 5:
            case 7:
            case 8:
            default:
                this.x = new ArrayList();
                return;
            case 3:
                this.x = new Object();
                return;
            case 4:
                ?? obj = new Object();
                obj.x = gh0.F;
                obj.y = gh0.G;
                obj.A = gh0.H;
                this.x = obj;
                return;
            case 6:
                this.x = xt5.g(Boolean.FALSE);
                return;
            case 9:
                this.x = new ConcurrentHashMap();
                return;
        }
    }

    public abstract void A(lj0 lj0Var);

    public abstract void B(Object obj);

    public void E(String str) {
        str.getClass();
    }

    public void F(String str) {
        str.getClass();
    }

    public abstract Object G();

    public Object H(aa8 aa8Var, rv5 rv5Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.x;
        Object obj = concurrentHashMap.get(aa8Var);
        if (obj != null) {
            return obj;
        }
        Object G = G();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(aa8Var, G);
        if (putIfAbsent == null) {
            int h = rv5Var.h();
            for (int i = 0; i < h; i++) {
                if (p98.f.equals(rv5Var.j(i))) {
                    rv5Var.k(i);
                }
            }
            return G;
        }
        return putIfAbsent;
    }

    public boolean I(Level level) {
        return true;
    }

    public abstract void J(l98 l98Var);

    public void K(RuntimeException runtimeException, l98 l98Var) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public void L() {
        au7 au7Var = ((gu7) this.x).D;
        gu7.l(au7Var);
        au7Var.L();
    }

    @Override // defpackage.qz5
    public Set a() {
        Set entrySet = ((Map) this.x).entrySet();
        entrySet.getClass();
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    @Override // defpackage.rv7
    public og5 b() {
        throw null;
    }

    @Override // defpackage.rv7
    public es7 c() {
        throw null;
    }

    @Override // defpackage.rv7
    public pk2 d() {
        throw null;
    }

    @Override // defpackage.rv7
    public au7 f() {
        throw null;
    }

    @Override // defpackage.rv7
    public Context g() {
        throw null;
    }

    public void h(String str, String str2) {
        str.getClass();
        str2.getClass();
        F(str2);
        q(str).add(str2);
    }

    public void i(pz5 pz5Var) {
        pz5Var.getClass();
        pz5Var.b(new cu5(this, (byte) 1));
    }

    @Override // defpackage.qz5
    public void j(String str, Iterable iterable) {
        str.getClass();
        iterable.getClass();
        List q = q(str);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            F((String) it.next());
        }
        dp0.Y(iterable, q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(int r8, defpackage.md2 r9, java.lang.Object r10) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r9.a
            r1 = 1
            if (r0 != 0) goto La
            r10 = 0
            r7.l(r8, r9, r10)
            return r1
        La:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L3a
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof defpackage.ed2
            if (r6 == 0) goto L21
            if (r5 == r10) goto L1d
            goto L32
        L1d:
            r7.l(r3, r9, r5)
            return r1
        L21:
            boolean r6 = r5 instanceof defpackage.md2
            if (r6 == 0) goto L35
            r6 = r5
            md2 r6 = (defpackage.md2) r6
            boolean r6 = r7.k(r8, r6, r10)
            if (r6 == 0) goto L32
            r7.l(r3, r9, r5)
            return r1
        L32:
            int r4 = r4 + 1
            goto L10
        L35:
            java.lang.String r7 = "Unexpected child source info "
            defpackage.v71.g(r5, r7)
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt0.k(int, md2, java.lang.Object):boolean");
    }

    public void l(int i, md2 md2Var, Object obj) {
        ((ArrayList) this.x).add(new rt0(i, null, null));
    }

    public abstract void m(dn0 dn0Var);

    public abstract void n(ki5 ki5Var);

    public abstract void o();

    public abstract void p();

    public List q(String str) {
        Map map = (Map) this.x;
        List list = (List) map.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            E(str);
            map.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    public String r(String str) {
        List s = s(str);
        if (s != null) {
            return (String) yo0.m0(s);
        }
        return null;
    }

    public List s(String str) {
        str.getClass();
        return (List) ((Map) this.x).get(str);
    }

    public abstract vd3 t(int i, int i2, int i3, long j);

    public String u() {
        return null;
    }

    public abstract Object v();

    public List w(ud3 ud3Var, int i, long j) {
        s34 s34Var = (s34) this.x;
        List list = (List) s34Var.b(i);
        if (list != null) {
            return list;
        }
        rd3 rd3Var = ud3Var.z;
        s34 s34Var2 = ud3Var.A;
        List list2 = (List) s34Var2.b(i);
        if (list2 == null) {
            Object b = rd3Var.b(i);
            list2 = ud3Var.y.H(b, ud3Var.x.a(i, b, rd3Var.c(i)));
            s34Var2.h(i, list2);
        }
        int size = list2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((ro3) list2.get(i2)).p(j));
        }
        s34Var.h(i, arrayList);
        return arrayList;
    }

    public abstract Object x();

    public void y(int i, Object obj, md2 md2Var, Object obj2) {
        if (!a34.i(obj, au0.a)) {
            return;
        }
        l(i, md2Var, null);
    }

    public abstract ub2 z(ki5 ki5Var);

    public void D() {
    }

    public void C(xi6 xi6Var) {
    }

    public qt0(gu7 gu7Var) {
        a34.x(gu7Var);
        this.x = gu7Var;
    }
}
