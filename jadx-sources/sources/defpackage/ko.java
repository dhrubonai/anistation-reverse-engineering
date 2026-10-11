package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ko implements CharSequence {
    public final ArrayList A;
    public final List x;
    public final String y;
    public final ArrayList z;

    static {
        y23 y23Var = na5.a;
    }

    public ko(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.x = list;
        this.y = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                jo joVar = (jo) list.get(i);
                Object obj = joVar.a;
                if (obj instanceof pv5) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(joVar);
                } else if (obj instanceof hi4) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(joVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.z = arrayList;
        this.A = arrayList2;
        List C0 = arrayList2 != null ? yo0.C0(arrayList2, new k82((byte) 5)) : null;
        if (C0 != null && !C0.isEmpty()) {
            int i2 = ((jo) yo0.k0(C0)).c;
            r34 r34Var = y03.a;
            r34 r34Var2 = new r34(1);
            r34Var2.a(i2);
            int size2 = C0.size();
            for (int i3 = 1; i3 < size2; i3++) {
                jo joVar2 = (jo) C0.get(i3);
                while (true) {
                    if (r34Var2.b == 0) {
                        break;
                    }
                    int d = r34Var2.d();
                    if (joVar2.b >= d) {
                        r34Var2.e(r34Var2.b - 1);
                    } else {
                        int i4 = joVar2.c;
                        if (i4 > d) {
                            fz2.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + d);
                        }
                    }
                }
                r34Var2.a(joVar2.c);
            }
        }
    }

    public final List a(int i) {
        List list = this.x;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                jo joVar = (jo) obj;
                if ((joVar.a instanceof vh3) && lo.b(0, i, joVar.b, joVar.c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return nt1.x;
    }

    public final ko b(ub2 ub2Var) {
        io ioVar = new io(this);
        ArrayList arrayList = ioVar.z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jo joVar = (jo) ub2Var.invoke(((ho) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new ho(joVar.a, joVar.b, joVar.c, joVar.d));
        }
        return ioVar.e();
    }

    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ko subSequence(int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fz2.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.y;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        ko koVar = lo.a;
        if (i > i2) {
            fz2.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.x;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                jo joVar = (jo) list.get(i3);
                int i4 = joVar.b;
                int i5 = joVar.c;
                if (lo.b(i, i2, i4, i5)) {
                    arrayList2.add(new jo(joVar.a, Math.max(i, joVar.b) - i, Math.min(i2, i5) - i, joVar.d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new ko(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.y.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko)) {
            return false;
        }
        ko koVar = (ko) obj;
        if (a34.i(this.y, koVar.y) && a34.i(this.x, koVar.x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.y.hashCode() * 31;
        List list = this.x;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.y.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.y;
    }

    public /* synthetic */ ko(String str) {
        this(str, nt1.x);
    }

    public ko(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
