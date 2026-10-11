package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ke1 implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ List y;

    public /* synthetic */ ke1(List list, byte b) {
        this.x = b;
        this.y = list;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z = false;
        List list = this.y;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        kd2 kd2Var2 = kd2Var;
                        n03.c((String) it.next(), null, new vh4(10.0f, 6.0f, 10.0f, 6.0f), 0L, null, 0L, null, null, kd2Var2, 384, 250);
                        kd2Var = kd2Var2;
                    }
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var3 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (kd2Var3.V(intValue2 & 1, z)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        yc6.b((String) it2.next(), null, ep0.b(0.7f, ((mp0) kd2Var3.j(op0.a)).o), 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((nl6) kd2Var3.j(pl6.a)).l, kd2Var3, 0, 24960, 110586);
                    }
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var4 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z = true;
                }
                if (kd2Var4.V(intValue3 & 1, z)) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        kd2 kd2Var5 = kd2Var4;
                        n03.c((String) it3.next(), null, new vh4(10.0f, 6.0f, 10.0f, 6.0f), 0L, null, 0L, null, tm5.b, kd2Var5, 384, 122);
                        kd2Var4 = kd2Var5;
                    }
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var6 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z = true;
                }
                if (kd2Var6.V(intValue4 & 1, z)) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        kd2 kd2Var7 = kd2Var6;
                        n03.c((String) it4.next(), null, new vh4(10.0f, 6.0f, 10.0f, 6.0f), 0L, null, 0L, null, tm5.b, kd2Var7, 384, 122);
                        kd2Var6 = kd2Var7;
                    }
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
        }
    }
}
