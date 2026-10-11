package h3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f4787a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4788b;

    public h(int i10, List list) {
        this.f4787a = i10;
        this.f4788b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x002f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h3.j0 a(int r6, f1.f r7) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.h.a(int, f1.f):h3.j0");
    }

    public final List b(f1.f fVar) {
        boolean z9;
        String str;
        int i10;
        List list;
        boolean z10;
        byte[] bArr;
        boolean c6 = c(32);
        List list2 = this.f4788b;
        if (c6) {
            return list2;
        }
        f1.t tVar = new f1.t((byte[]) fVar.f3828d);
        while (tVar.f3860c - tVar.f3859b > 0) {
            int v9 = tVar.v();
            int v10 = tVar.f3859b + tVar.v();
            if (v9 == 134) {
                ArrayList arrayList = new ArrayList();
                int v11 = tVar.v() & 31;
                for (int i11 = 0; i11 < v11; i11++) {
                    String s9 = tVar.s(3);
                    int v12 = tVar.v();
                    if ((v12 & 128) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i10 = v12 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte v13 = (byte) tVar.v();
                    tVar.H(1);
                    if (z9) {
                        if ((v13 & 64) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    c1.u k10 = a3.g.k(str);
                    k10.f1900d = s9;
                    k10.D = i10;
                    k10.f1910n = list;
                    arrayList.add(new c1.v(k10));
                }
                list2 = arrayList;
            }
            tVar.G(v10);
        }
        return list2;
    }

    public final boolean c(int i10) {
        if ((i10 & this.f4787a) != 0) {
            return true;
        }
        return false;
    }
}
