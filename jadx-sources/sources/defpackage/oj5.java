package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class oj5 {
    public static final x73 a(Collection collection, uj5 uj5Var) {
        Collection collection2 = collection;
        collection2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection2) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(zo0.V(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(b(obj2, uj5Var));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            if (hashSet.add(((x73) obj3).getDescriptor().a())) {
                arrayList3.add(obj3);
            }
        }
        if (arrayList3.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList4 = new ArrayList(zo0.V(arrayList3, 10));
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj4 = arrayList3.get(i);
                i++;
                arrayList4.add(((x73) obj4).getDescriptor().a());
            }
            sb.append(arrayList4);
            throw new IllegalStateException(sb.toString().toString());
        }
        x73 x73Var = (x73) yo0.A0(arrayList3);
        if (x73Var == null) {
            x73Var = mz5.a;
        }
        if (!x73Var.getDescriptor().c() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    return jb0.a(x73Var);
                }
            }
        }
        return x73Var;
    }

    public static final x73 b(Object obj, uj5 uj5Var) {
        x73 serializer;
        x73 yj2Var;
        uj5Var.getClass();
        if (obj == null) {
            serializer = jb0.a(mz5.a);
        } else {
            if (obj instanceof List) {
                yj2Var = new ds(a((Collection) obj, uj5Var), (byte) 0);
            } else if (obj instanceof Object[]) {
                Object J0 = ms.J0((Object[]) obj);
                if (J0 != null) {
                    serializer = b(J0, uj5Var);
                } else {
                    yj2Var = new ds(mz5.a, (byte) 0);
                }
            } else if (obj instanceof Set) {
                yj2Var = new ds(a((Collection) obj, uj5Var), (byte) 2);
            } else if (obj instanceof Map) {
                Map map = (Map) obj;
                yj2Var = new yj2(a(map.keySet(), uj5Var), a(map.values(), uj5Var), (byte) 1);
            } else {
                uj5.a(uj5Var, z05.a(obj.getClass()));
                serializer = rj5.serializer(z05.a(obj.getClass()));
            }
            serializer = yj2Var;
        }
        serializer.getClass();
        return serializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        if (r3 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.x73 serializerForTypeInfo(defpackage.uj5 r10, defpackage.vk6 r11) {
        /*
            r10.getClass()
            r11.getClass()
            e73 r0 = r11.a
            y73 r1 = r11.c
            if (r1 == 0) goto Lc4
            java.util.List r2 = r1.b()
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto L19
            goto Lc1
        L19:
            r2 = 0
            x73 r4 = defpackage.tj5.b(r10, r1, r2)
            if (r4 != 0) goto Lc0
            java.util.List r1 = r1.b()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r1.next()
            a83 r5 = (defpackage.a83) r5
            y73 r5 = r5.b     // Catch: java.lang.Exception -> Lc1
            if (r5 == 0) goto L44
            x73 r6 = defpackage.tj5.b(r10, r5, r2)     // Catch: java.lang.Exception -> Lc1
            if (r6 != 0) goto L44
            goto L45
        L44:
            r5 = r3
        L45:
            if (r5 == 0) goto L2d
            r4.add(r5)
            goto L2d
        L4b:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L52
            goto Lc1
        L52:
            tg5 r8 = new tg5
            r10 = 5
            r8.<init>(r10)
            r9 = 31
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = defpackage.yo0.q0(r4, r5, r6, r7, r8, r9)
            int r11 = r4.size()
            r1 = 1
            if (r11 != r1) goto L72
            ai4 r11 = new ai4
            java.lang.String r1 = ""
            java.lang.String r2 = "is"
            r11.<init>(r1, r2)
            goto L7b
        L72:
            ai4 r11 = new ai4
            java.lang.String r1 = "s"
            java.lang.String r2 = "are"
            r11.<init>(r1, r2)
        L7b:
            java.lang.Object r1 = r11.x
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r11 = r11.y
            java.lang.String r11 = (java.lang.String) r11
            lj5 r2 = new lj5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Serializer for type argument"
            r3.<init>(r4)
            r3.append(r1)
            r4 = 32
            r3.append(r4)
            r3.append(r10)
            r3.append(r4)
            r3.append(r11)
            java.lang.String r10 = " not found for '"
            r3.append(r10)
            im0 r0 = (defpackage.im0) r0
            java.lang.String r10 = r0.f()
            r3.append(r10)
            java.lang.String r10 = "'. Ensure that the listed type"
            r3.append(r10)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r10 = " marked as '@Serializable'."
            java.lang.String r10 = defpackage.h11.k(r3, r11, r10)
            r2.<init>(r10)
            throw r2
        Lc0:
            r3 = r4
        Lc1:
            if (r3 == 0) goto Lc4
            goto Lcb
        Lc4:
            defpackage.uj5.a(r10, r0)
            x73 r3 = defpackage.rj5.serializer(r0)
        Lcb:
            boolean r10 = r11.b
            if (r10 == 0) goto Ld6
            r3.getClass()
            x73 r3 = defpackage.jb0.a(r3)
        Ld6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj5.serializerForTypeInfo(uj5, vk6):x73");
    }
}
