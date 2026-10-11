package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vd implements vo3 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ vd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vo3
    public final wo3 b(xo3 xo3Var, List list, long j) {
        ArrayList arrayList;
        int i;
        int i2;
        ai4 ai4Var;
        byte b = this.a;
        ot1 ot1Var = ot1.x;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((vr4) obj).setParentLayoutDirection((ia3) obj2);
                return xo3Var.L(0, 0, ot1Var, new b3((byte) 17));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj3 = list.get(i3);
                    if (!(((ro3) obj3).w() instanceof od6)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((sb2) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        n05 n05Var = (n05) list2.get(i4);
                        if (n05Var != null) {
                            float f = n05Var.b;
                            float f2 = n05Var.a;
                            ro3 ro3Var = (ro3) arrayList2.get(i4);
                            int floor = (int) Math.floor(n05Var.c - f2);
                            float f3 = n05Var.d - f;
                            i = size2;
                            i2 = i4;
                            ai4Var = new ai4(ro3Var.p(sx0.b(0, floor, 0, (int) Math.floor(f3), 5)), new c13((Math.round(f) & 4294967295L) | (Math.round(f2) << 32)));
                        } else {
                            i = size2;
                            i2 = i4;
                            ai4Var = null;
                        }
                        if (ai4Var != null) {
                            arrayList3.add(ai4Var);
                        }
                        i4 = i2 + 1;
                        size2 = i;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    Object obj4 = list.get(i5);
                    if (((ro3) obj4).w() instanceof od6) {
                        arrayList4.add(obj4);
                    }
                }
                return xo3Var.L(rx0.h(j), rx0.g(j), ot1Var, new ll5((Object) arrayList, (Object) a34.j0(arrayList4, (sb2) obj), (byte) 9));
        }
    }
}
