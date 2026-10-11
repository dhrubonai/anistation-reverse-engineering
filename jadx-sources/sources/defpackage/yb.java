package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yb implements vo3 {
    public static final yb b = new yb(0);
    public static final yb c = new yb(1);
    public static final yb d = new yb(2);
    public static final yb e = new yb(3);
    public static final yb f = new yb(4);
    public static final yb g = new yb(5);
    public static final f01 h = new f01((byte) 14);
    public static final yb i = new yb(6);
    public static final yb j = new yb(7);
    public static final yb k = new yb(8);
    public static final yb l = new yb(9);
    public final /* synthetic */ byte a;

    public /* synthetic */ yb(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo3
    public final wo3 b(xo3 xo3Var, List list, long j2) {
        boolean z;
        int i2;
        byte b2 = this.a;
        boolean z2 = true;
        byte b3 = 0;
        int i3 = 0;
        ot1 ot1Var = ot1.x;
        switch (b2) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    em4 p = ((ro3) list.get(i6)).p(j2);
                    i4 = Math.max(i4, p.x);
                    i5 = Math.max(i5, p.y);
                    arrayList.add(p);
                }
                if (list.isEmpty()) {
                    i4 = rx0.j(j2);
                    i5 = rx0.i(j2);
                }
                return xo3Var.L(i4, i5, ot1Var, new xb(arrayList, (byte) 0));
            case 1:
                int size2 = list.size();
                if (size2 != 0) {
                    if (size2 != 1) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size3 = list.size();
                        int i7 = 0;
                        int i8 = 0;
                        for (int i9 = 0; i9 < size3; i9++) {
                            em4 p2 = ((ro3) list.get(i9)).p(j2);
                            i7 = Math.max(i7, p2.x);
                            i8 = Math.max(i8, p2.y);
                            arrayList2.add(p2);
                        }
                        return xo3Var.L(i7, i8, ot1Var, new zd(arrayList2, (byte) 0));
                    }
                    em4 p3 = ((ro3) list.get(0)).p(j2);
                    return xo3Var.L(p3.x, p3.y, ot1Var, new yd(p3, b3));
                }
                return xo3Var.L(0, 0, ot1Var, xd.y);
            case 2:
                list.getClass();
                ro3 ro3Var = (ro3) list.get(0);
                ro3 ro3Var2 = (ro3) list.get(1);
                final int x0 = xo3Var.x0(90.0f);
                int h2 = rx0.h(j2) - x0;
                if (h2 < 0) {
                    h2 = 0;
                }
                final em4 p4 = ro3Var2.p(rx0.a(j2, h2, h2, 0, 0, 8));
                final int max = Math.max(rx0.i(j2), p4.y);
                if (x0 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (max < 0) {
                    z2 = false;
                }
                if (!(z & z2)) {
                    gz2.a("width and height must be >= 0");
                }
                final em4 p5 = ro3Var.p(sx0.h(x0, x0, max, max));
                return xo3Var.L(rx0.h(j2), max, ot1Var, new ub2() { // from class: om
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj) {
                        dm4 dm4Var = (dm4) obj;
                        dm4Var.getClass();
                        dm4.j(dm4Var, em4.this, 0, 0);
                        dm4.j(dm4Var, p4, x0, Math.round(((max - r0.y) / 2.0f) * 1.0f));
                        return pn6.a;
                    }
                });
            case 3:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                while (b3 < size4) {
                    arrayList3.add(((ro3) list.get(b3)).p(j2));
                    b3++;
                }
                return xo3Var.L(rx0.h(j2), rx0.g(j2), ot1Var, new xb(arrayList3, (byte) 1));
            case 4:
                return xo3Var.L(rx0.j(j2), rx0.i(j2), ot1Var, new ui((byte) 23));
            case 5:
                return xo3Var.L(rx0.h(j2), rx0.g(j2), ot1Var, h);
            case 6:
                return xo3Var.L(rx0.j(j2), rx0.i(j2), ot1Var, new t72((byte) 23));
            case 7:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size5 = list.size();
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < size5; i12++) {
                    em4 p6 = ((ro3) list.get(i12)).p(j2);
                    i10 = Math.max(i10, p6.x);
                    i11 = Math.max(i11, p6.y);
                    arrayList4.add(p6);
                }
                return xo3Var.L(i10, i11, ot1Var, new xb(arrayList4, (byte) 4));
            case 8:
                if (rx0.f(j2)) {
                    i2 = rx0.h(j2);
                } else {
                    i2 = 0;
                }
                if (rx0.e(j2)) {
                    i3 = rx0.g(j2);
                }
                return xo3Var.L(i2, i3, ot1Var, new tg5((byte) 18));
            default:
                return xo3Var.L(rx0.j(j2), rx0.i(j2), ot1Var, new ka6((byte) 19));
        }
    }
}
