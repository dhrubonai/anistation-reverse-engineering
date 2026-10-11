package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class tj5 {
    public static final x73 a(e73 e73Var, List list, sb2 sb2Var) {
        x73 dsVar;
        x73 dk6Var;
        if (!e73Var.equals(z05.a(Collection.class)) && !e73Var.equals(z05.a(List.class)) && !e73Var.equals(z05.a(List.class)) && !e73Var.equals(z05.a(ArrayList.class))) {
            if (e73Var.equals(z05.a(HashSet.class))) {
                dsVar = new ds((x73) list.get(0), (byte) 1);
            } else if (!e73Var.equals(z05.a(Set.class)) && !e73Var.equals(z05.a(Set.class)) && !e73Var.equals(z05.a(LinkedHashSet.class))) {
                if (e73Var.equals(z05.a(HashMap.class))) {
                    dsVar = new yj2((x73) list.get(0), (x73) list.get(1), (byte) 0);
                } else if (!e73Var.equals(z05.a(Map.class)) && !e73Var.equals(z05.a(Map.class)) && !e73Var.equals(z05.a(LinkedHashMap.class))) {
                    if (e73Var.equals(z05.a(Map.Entry.class))) {
                        x73 x73Var = (x73) list.get(0);
                        x73 x73Var2 = (x73) list.get(1);
                        x73Var.getClass();
                        x73Var2.getClass();
                        dsVar = new gn3(x73Var, x73Var2, (byte) 0);
                    } else {
                        if (e73Var.equals(z05.a(ai4.class))) {
                            x73 x73Var3 = (x73) list.get(0);
                            x73 x73Var4 = (x73) list.get(1);
                            x73Var3.getClass();
                            x73Var4.getClass();
                            dk6Var = new gn3(x73Var3, x73Var4, (byte) 1);
                        } else if (e73Var.equals(z05.a(ck6.class))) {
                            x73 x73Var5 = (x73) list.get(0);
                            x73 x73Var6 = (x73) list.get(1);
                            x73 x73Var7 = (x73) list.get(2);
                            x73Var5.getClass();
                            x73Var6.getClass();
                            x73Var7.getClass();
                            dk6Var = new dk6(x73Var5, x73Var6, x73Var7);
                        } else if (t80.M(e73Var).isArray()) {
                            Object invoke = sb2Var.invoke();
                            invoke.getClass();
                            dsVar = jb0.ArraySerializer((e73) invoke, (x73) list.get(0));
                        } else {
                            dsVar = null;
                        }
                        dsVar = dk6Var;
                    }
                } else {
                    dsVar = new yj2((x73) list.get(0), (x73) list.get(1), (byte) 1);
                }
            } else {
                dsVar = new ds((x73) list.get(0), (byte) 2);
            }
        } else {
            dsVar = new ds((x73) list.get(0), (byte) 0);
        }
        if (dsVar == null) {
            x73[] x73VarArr = (x73[]) list.toArray(new x73[0]);
            return tl7.n(e73Var, (x73[]) Arrays.copyOf(x73VarArr, x73VarArr.length));
        }
        return dsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.x73 b(defpackage.uj5 r5, defpackage.y73 r6, boolean r7) {
        /*
            e73 r0 = defpackage.db.a0(r6)
            boolean r1 = r6.a()
            java.util.List r6 = r6.b()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.zo0.V(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L1b:
            boolean r3 = r6.hasNext()
            r4 = 0
            if (r3 == 0) goto L39
            java.lang.Object r3 = r6.next()
            a83 r3 = (defpackage.a83) r3
            r3.getClass()
            y73 r3 = r3.b
            if (r3 == 0) goto L33
            r2.add(r3)
            goto L1b
        L33:
            java.lang.String r5 = "Star projections in type arguments are not allowed, but had "
            defpackage.p65.g(r3, r5)
            return r4
        L39:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L62
            java.lang.Class r6 = defpackage.t80.M(r0)
            boolean r6 = r6.isInterface()
            if (r6 == 0) goto L4c
            defpackage.uj5.a(r5, r0)
        L4c:
            rt3 r6 = defpackage.qj5.a
            if (r1 != 0) goto L5b
            rt3 r6 = defpackage.qj5.a
            x73 r6 = r6.k(r0)
            if (r6 == 0) goto L59
            goto L80
        L59:
            r6 = r4
            goto L80
        L5b:
            rt3 r6 = defpackage.qj5.b
            x73 r6 = r6.k(r0)
            goto L80
        L62:
            r6 = r5
            ij5 r6 = (defpackage.ij5) r6
            r6.getClass()
            rt3 r6 = defpackage.qj5.a
            if (r1 != 0) goto L73
            pz2 r6 = defpackage.qj5.c
            java.lang.Object r6 = r6.r(r0, r2)
            goto L79
        L73:
            pz2 r6 = defpackage.qj5.d
            java.lang.Object r6 = r6.r(r0, r2)
        L79:
            boolean r3 = r6 instanceof defpackage.y45
            if (r3 == 0) goto L7e
            r6 = r4
        L7e:
            x73 r6 = (defpackage.x73) r6
        L80:
            if (r6 == 0) goto L83
            return r6
        L83:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto La5
            x73 r6 = defpackage.rj5.serializerOrNull(r0)
            if (r6 != 0) goto Lc8
            defpackage.uj5.a(r5, r0)
            java.lang.Class r5 = defpackage.t80.M(r0)
            boolean r5 = r5.isInterface()
            if (r5 == 0) goto La3
            fr4 r5 = new fr4
            r5.<init>(r0)
        La1:
            r6 = r5
            goto Lc8
        La3:
            r6 = r4
            goto Lc8
        La5:
            java.util.ArrayList r5 = c(r5, r2, r7)
            if (r5 != 0) goto Lac
            goto Ld2
        Lac:
            sj5 r6 = new sj5
            r7 = 0
            r6.<init>(r2, r7)
            x73 r6 = a(r0, r5, r6)
            if (r6 != 0) goto Lc8
            java.lang.Class r5 = defpackage.t80.M(r0)
            boolean r5 = r5.isInterface()
            if (r5 == 0) goto La3
            fr4 r5 = new fr4
            r5.<init>(r0)
            goto La1
        Lc8:
            if (r6 == 0) goto Ld2
            if (r1 == 0) goto Ld1
            x73 r5 = defpackage.jb0.a(r6)
            return r5
        Ld1:
            return r6
        Ld2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj5.b(uj5, y73, boolean):x73");
    }

    public static final ArrayList c(uj5 uj5Var, List list, boolean z) {
        uj5Var.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(zo0.V(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                y73 y73Var = (y73) it.next();
                y73Var.getClass();
                x73 b = b(uj5Var, y73Var, true);
                if (b != null) {
                    arrayList.add(b);
                } else {
                    db.m0(db.a0(y73Var));
                    throw null;
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(zo0.V(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            y73 y73Var2 = (y73) it2.next();
            uj5Var.getClass();
            y73Var2.getClass();
            x73 b2 = b(uj5Var, y73Var2, false);
            if (b2 == null) {
                return null;
            }
            arrayList2.add(b2);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.x73 serializer(defpackage.uj5 r2, defpackage.e73 r3, java.util.List<? extends defpackage.x73> r4, boolean r5) {
        /*
            r2.getClass()
            r3.getClass()
            r4.getClass()
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L1b
            x73 r4 = defpackage.rj5.serializerOrNull(r3)
            if (r4 != 0) goto L2a
            defpackage.uj5.a(r2, r3)
        L19:
            r4 = r1
            goto L2a
        L1b:
            r75 r2 = new r75     // Catch: java.lang.IndexOutOfBoundsException -> L3b
            r0 = 21
            r2.<init>(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L3b
            x73 r2 = a(r3, r4, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L3b
            if (r2 != 0) goto L29
            goto L19
        L29:
            r4 = r2
        L2a:
            if (r4 == 0) goto L33
            if (r5 == 0) goto L34
            x73 r4 = defpackage.jb0.a(r4)
            goto L34
        L33:
            r4 = r1
        L34:
            if (r4 == 0) goto L37
            return r4
        L37:
            defpackage.db.m0(r3)
            throw r1
        L3b:
            r2 = move-exception
            lj5 r3 = new lj5
            java.lang.String r4 = "Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters"
            r3.<init>(r4, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj5.serializer(uj5, e73, java.util.List, boolean):x73");
    }

    public static final <T> x73 serializerOrNull(e73 e73Var) {
        e73Var.getClass();
        x73 n = tl7.n(e73Var, new x73[0]);
        if (n == null) {
            return (x73) bu4.a.get(e73Var);
        }
        return n;
    }

    public static final x73 serializer(e73 e73Var, List<? extends x73> list, boolean z) {
        e73Var.getClass();
        list.getClass();
        return rj5.serializer(db.k, e73Var, list, z);
    }

    public static final <T> x73 serializer(e73 e73Var) {
        e73Var.getClass();
        x73 serializerOrNull = rj5.serializerOrNull(e73Var);
        if (serializerOrNull != null) {
            return serializerOrNull;
        }
        db.m0(e73Var);
        throw null;
    }
}
