package x6;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import r6.h0;

/* loaded from: classes.dex */
public abstract class m extends l {
    public static final void q0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, h7.l lVar) {
        h0.u(iterable, "<this>");
        h0.u(charSequence, "separator");
        h0.u(charSequence2, "prefix");
        h0.u(charSequence3, "postfix");
        h0.u(charSequence4, "truncated");
        sb.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                sb.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            } else {
                h0.f(sb, obj, lVar);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String r0(Iterable iterable, String str, String str2, String str3, h7.l lVar, int i10) {
        String str4;
        String str5;
        int i11;
        CharSequence charSequence;
        h7.l lVar2;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i10 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i10 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11;
        if ((i10 & 16) != 0) {
            charSequence = "...";
        } else {
            charSequence = null;
        }
        if ((i10 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        h0.u(iterable, "<this>");
        h0.u(str6, "separator");
        h0.u(str4, "prefix");
        h0.u(str5, "postfix");
        h0.u(charSequence, "truncated");
        StringBuilder sb = new StringBuilder();
        q0(iterable, sb, str6, str4, str5, i12, charSequence, lVar2);
        String sb2 = sb.toString();
        h0.s(sb2, "toString(...)");
        return sb2;
    }

    public static final ArrayList s0(List list, List list2) {
        h0.u(list2, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list2);
        arrayList.addAll(list);
        return arrayList;
    }

    public static final List t0(List list, int i10) {
        boolean z9;
        h0.u(list, "<this>");
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            o oVar = o.f11318a;
            if (i10 == 0) {
                return oVar;
            }
            if (i10 >= list.size()) {
                return x0(list);
            }
            if (i10 == 1) {
                if (!list.isEmpty()) {
                    return com.bumptech.glide.c.L(list.get(0));
                }
                throw new NoSuchElementException("List is empty.");
            }
            ArrayList arrayList = new ArrayList(i10);
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                if (size != 1) {
                    return arrayList;
                }
                return com.bumptech.glide.c.L(arrayList.get(0));
            }
            return oVar;
        }
        throw new IllegalArgumentException(a3.g.o("Requested element count ", i10, " is less than zero.").toString());
    }

    public static final byte[] u0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final void v0(Iterable iterable, AbstractCollection abstractCollection) {
        h0.u(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static final int[] w0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static final List x0(Iterable iterable) {
        ArrayList arrayList;
        Object next;
        h0.u(iterable, "<this>");
        boolean z9 = iterable instanceof Collection;
        o oVar = o.f11318a;
        if (z9) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return com.bumptech.glide.c.L(next);
            }
            return oVar;
        }
        if (z9) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            v0(iterable, arrayList);
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return arrayList;
            }
            return com.bumptech.glide.c.L(arrayList.get(0));
        }
        return oVar;
    }

    public static final long[] y0(Collection collection) {
        h0.u(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static final Set z0(List list) {
        h0.u(list, "<this>");
        q qVar = q.f11320a;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(h0.m0(list.size()));
                v0(list, linkedHashSet);
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(list.get(0));
            h0.s(singleton, "singleton(...)");
            return singleton;
        }
        return qVar;
    }
}
