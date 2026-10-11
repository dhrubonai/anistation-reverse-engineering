package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class be implements Comparator {
    public final /* synthetic */ byte x;

    public /* synthetic */ be(byte b) {
        this.x = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qg4 qg4Var;
        qg4 a;
        byte b = this.x;
        wq0 wq0Var = wq0.a;
        switch (b) {
            case 0:
                return a34.D(((eu4) obj2).a ? 1 : 0, ((eu4) obj).a ? 1 : 0);
            case 1:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 2:
                return Integer.compare(((ea2) obj2).k, ((ea2) obj).k);
            case 3:
                return Integer.compare(((wi0) obj2).b, ((wi0) obj).b);
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                    return -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 5:
                return Integer.compare(((eb1) ((List) obj).get(0)).C, ((eb1) ((List) obj2).get(0)).C);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                byte b2 = 9;
                byte b3 = 10;
                return uq0.g(lb1.c((lb1) Collections.max(list, new be(b2)), (lb1) Collections.max(list2, new be(b2)))).a(list.size(), list2.size()).c((lb1) Collections.max(list, new be(b3)), (lb1) Collections.max(list2, new be(b3)), new be(b3)).f();
            case 7:
                return ((db1) Collections.max((List) obj)).compareTo((db1) Collections.max((List) obj2));
            case 8:
                return ((ib1) ((List) obj).get(0)).compareTo((ib1) ((List) obj2).get(0));
            case 9:
                return lb1.c((lb1) obj, (lb1) obj2);
            case 10:
                lb1 lb1Var = (lb1) obj;
                lb1 lb1Var2 = (lb1) obj2;
                boolean z = lb1Var.B;
                int i = lb1Var.G;
                if (z && lb1Var.E) {
                    a = mb1.k;
                    qg4Var = a;
                } else {
                    qg4 qg4Var2 = mb1.k;
                    qg4Var = qg4Var2;
                    a = qg4Var2.a();
                }
                if (lb1Var.C.F) {
                    wq0Var = wq0Var.c(Integer.valueOf(i), Integer.valueOf(lb1Var2.G), qg4Var.a());
                }
                wq0 c = wq0Var.d(lb1Var.V, lb1Var2.V).c(Integer.valueOf(lb1Var.H), Integer.valueOf(lb1Var2.H), a);
                if (lb1Var.R && lb1Var.T) {
                    c = c.a(lb1Var.U, lb1Var2.U);
                }
                return c.d(lb1Var.S, lb1Var2.S).c(Integer.valueOf(i), Integer.valueOf(lb1Var2.G), a).f();
            case 11:
                return Long.compare(((cj1) obj).c, ((cj1) obj2).c);
            case 12:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b4 = bArr[i2];
                    byte b5 = bArr2[i2];
                    if (b4 != b5) {
                        return b4 - b5;
                    }
                }
                return 0;
            case 13:
                return a34.D(((e33) obj).b, ((e33) obj2).b);
            case 14:
                return ((tl2) obj).a.compareTo(((tl2) obj2).a);
            case 15:
                f13 f13Var = (f13) obj;
                f13 f13Var2 = (f13) obj2;
                return (f13Var.y - f13Var.x) - (f13Var2.y - f13Var2.x);
            case 16:
                za3 za3Var = (za3) obj;
                za3 za3Var2 = (za3) obj2;
                float f = za3Var.d0.p.c0;
                float f2 = za3Var2.d0.p.c0;
                if (f == f2) {
                    return a34.D(za3Var.w(), za3Var2.w());
                }
                return Float.compare(f, f2);
            case 17:
                return a34.D(((vd3) obj).getIndex(), ((vd3) obj2).getIndex());
            case 18:
                ((tg6) obj).getClass();
                ((tg6) obj2).getClass();
                return Integer.compare(1, 1);
            case 19:
                return ((Number) ci5.b.invoke(obj, obj2)).intValue();
            case 20:
                return ((ur5) obj).a - ((ur5) obj2).a;
            case 21:
                return Float.compare(((ur5) obj).c, ((ur5) obj2).c);
            case 22:
                cs5 cs5Var = (cs5) obj;
                cs5 cs5Var2 = (cs5) obj2;
                return wq0Var.b(cs5Var.a, cs5Var2.a).b(cs5Var.b, cs5Var2.b).a(cs5Var.c, cs5Var2.c).f();
            case 23:
                wv5 wv5Var = (wv5) obj;
                wv5 wv5Var2 = (wv5) obj2;
                int compare = Integer.compare(wv5Var2.b, wv5Var.b);
                if (compare == 0) {
                    int compareTo = wv5Var.c.compareTo(wv5Var2.c);
                    if (compareTo == 0) {
                        return wv5Var.d.compareTo(wv5Var2.d);
                    }
                    return compareTo;
                }
                return compare;
            case 24:
                wv5 wv5Var3 = (wv5) obj;
                wv5 wv5Var4 = (wv5) obj2;
                int compare2 = Integer.compare(wv5Var4.a, wv5Var3.a);
                if (compare2 == 0) {
                    int compareTo2 = wv5Var4.c.compareTo(wv5Var3.c);
                    if (compareTo2 == 0) {
                        return wv5Var4.d.compareTo(wv5Var3.d);
                    }
                    return compareTo2;
                }
                return compare2;
            case 25:
                return Integer.compare(((f47) obj).a.b, ((f47) obj2).a.b);
            default:
                return Long.compare(((e47) obj).b, ((e47) obj2).b);
        }
    }
}
