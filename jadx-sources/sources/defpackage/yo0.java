package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class yo0 extends dp0 {
    public static Object A0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List B0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return I0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return ms.q0(array);
        }
        List L0 = L0(iterable);
        cp0.W(L0);
        return L0;
    }

    public static List C0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return I0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            array.getClass();
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        List L0 = L0(iterable);
        cp0.X(L0, comparator);
        return L0;
    }

    public static List D0(Iterable iterable, int i) {
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return nt1.x;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return I0(iterable);
                }
                if (i == 1) {
                    return te4.H(j0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return te4.K(arrayList);
        }
        ze0.e(qx1.i(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List E0(int i, List list) {
        if (i >= 0) {
            if (i == 0) {
                return nt1.x;
            }
            int size = list.size();
            if (i >= size) {
                return I0(list);
            }
            if (i == 1) {
                return te4.H(r0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        ze0.e(qx1.i(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static byte[] F0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void G0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] H0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iArr[i] = ((Number) obj).intValue();
            i++;
        }
        return iArr;
    }

    public static List I0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return te4.H(next);
            }
            return nt1.x;
        }
        return te4.K(L0(iterable));
    }

    public static long[] J0(List list) {
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList K0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List L0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        G0(iterable, arrayList);
        return arrayList;
    }

    public static Set M0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        G0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set N0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(vn3.S(collection.size()));
                    G0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return te4.O(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            G0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return te4.O(linkedHashSet2.iterator().next());
            }
        }
        return tt1.x;
    }

    public static ArrayList d0(int i, List list) {
        Iterator V;
        int i2;
        list.getClass();
        nx7.s(i, i);
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = size / i;
            if (size % i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            ArrayList arrayList = new ArrayList(i3 + i2);
            int i4 = 0;
            while (i4 >= 0 && i4 < size) {
                int i5 = size - i4;
                if (i <= i5) {
                    i5 = i;
                }
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add(list.get(i6 + i4));
                }
                arrayList.add(arrayList2);
                i4 += i;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        it.getClass();
        if (!it.hasNext()) {
            V = mt1.x;
        } else {
            V = io3.V(new wr5(i, i, it, null));
        }
        while (V.hasNext()) {
            arrayList3.add((List) V.next());
        }
        return arrayList3;
    }

    public static boolean e0(Iterable iterable, Object obj) {
        int i;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i2 >= 0) {
                        if (a34.i(obj, next)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        te4.R();
                        throw null;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static List f0(Iterable iterable) {
        iterable.getClass();
        return I0(M0(iterable));
    }

    public static List g0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object obj;
        if (i >= 0) {
            if (i == 0) {
                return I0(iterable);
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i;
                if (size <= 0) {
                    return nt1.x;
                }
                if (size == 1) {
                    if (iterable instanceof List) {
                        obj = r0((List) iterable);
                    } else {
                        Iterator it = iterable.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                            obj = next;
                        } else {
                            p65.h("Collection is empty.");
                            return null;
                        }
                    }
                    return te4.H(obj);
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(list.get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i2 = 0;
            for (Object obj2 : iterable) {
                if (i2 >= i) {
                    arrayList.add(obj2);
                } else {
                    i2++;
                }
            }
            return te4.K(arrayList);
        }
        ze0.e(qx1.i(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List h0(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return D0(list, size);
    }

    public static Object i0(int i, Collection collection) {
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(i);
        }
        da daVar = new da(i, (byte) 2);
        if (z) {
            List list = (List) collection;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            daVar.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i >= 0) {
            int i2 = 0;
            for (Object obj : collection) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return obj;
                }
                i2 = i3;
            }
            daVar.invoke(Integer.valueOf(i));
            throw null;
        }
        daVar.invoke(Integer.valueOf(i));
        throw null;
    }

    public static Object j0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return k0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        p65.h("Collection is empty.");
        return null;
    }

    public static Object k0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        p65.h("List is empty.");
        return null;
    }

    public static Object l0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object m0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object n0(int i, List list) {
        list.getClass();
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public static final void o0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ub2 ub2Var) {
        iterable.getClass();
        charSequence.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            ct5.e(sb, obj, ub2Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void p0(List list, StringBuilder sb, String str, ub2 ub2Var, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str2 = str;
        if ((i & 64) != 0) {
            ub2Var = null;
        }
        o0(list, sb, str2, "", "", "...", ub2Var);
    }

    public static String q0(Iterable iterable, CharSequence charSequence, String str, String str2, ub2 ub2Var, int i) {
        String str3;
        String str4;
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 2) != 0) {
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 32) != 0) {
            ub2Var = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        o0(iterable, sb, charSequence2, str3, str4, "...", ub2Var);
        return sb.toString();
    }

    public static Object r0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        p65.h("List is empty.");
        return null;
    }

    public static Object s0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList t0(Object obj, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(zo0.V(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && a34.i(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList u0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        dp0.Y(iterable, arrayList2);
        return arrayList2;
    }

    public static ArrayList v0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final int w0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder s = qx1.s(i, "Element index ", " must be in range [");
        s.append(new d13(0, list.size() - 1, 1));
        s.append("].");
        throw new IndexOutOfBoundsException(s.toString());
    }

    public static final int x0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder s = qx1.s(i, "Position index ", " must be in range [");
        s.append(new d13(0, list.size(), 1));
        s.append("].");
        throw new IndexOutOfBoundsException(s.toString());
    }

    public static List y0(List list) {
        list.getClass();
        if (list.size() <= 1) {
            return I0(list);
        }
        List L0 = L0(list);
        Collections.reverse(L0);
        return L0;
    }

    public static Object z0(List list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            ze0.k("List has more than one element.");
            return null;
        }
        p65.h("List is empty.");
        return null;
    }
}
