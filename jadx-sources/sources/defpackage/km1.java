package defpackage;

import com.anistation.model.Recent;
import com.anistation.model.download.DownloadAnimeGroup;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class km1 implements kc2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ ub2 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ List y;
    public final /* synthetic */ int z;

    public km1(List list, int i, pm1 pm1Var, ub2 ub2Var, ub2 ub2Var2) {
        this.y = list;
        this.z = i;
        this.C = pm1Var;
        this.A = ub2Var;
        this.B = ub2Var2;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        float f2;
        float f3;
        float f4;
        boolean z8;
        kd2 kd2Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj5 = au0.a;
        List list = this.y;
        int i3 = 16;
        int i4 = 4;
        Object obj6 = this.C;
        switch (b) {
            case 0:
                fc3 fc3Var = (fc3) obj;
                int intValue = ((Number) obj2).intValue();
                kd2 kd2Var2 = (kd2) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (!kd2Var2.f(fc3Var)) {
                        i4 = 2;
                    }
                    i = i4 | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (kd2Var2.d(intValue)) {
                        i3 = 32;
                    }
                    i |= i3;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var2.V(i & 1, z)) {
                    DownloadAnimeGroup downloadAnimeGroup = (DownloadAnimeGroup) list.get(intValue);
                    kd2Var2.e0(-2127064295);
                    int i5 = this.z;
                    int i6 = intValue % i5;
                    if (i6 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i6 == i5 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    float f5 = 15.0f;
                    if (z2) {
                        f = 15.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (!z3) {
                        f5 = 0.0f;
                    }
                    vh4 k = n77.k(f, 0.0f, f5, 0.0f, 10);
                    pm1 pm1Var = (pm1) obj6;
                    boolean z9 = pm1Var.c;
                    boolean contains = pm1Var.d.contains(downloadAnimeGroup.getAnimeId());
                    ub2 ub2Var = this.A;
                    boolean f6 = kd2Var2.f(ub2Var) | kd2Var2.h(downloadAnimeGroup);
                    Object Q = kd2Var2.Q();
                    if (f6 || Q == obj5) {
                        Q = new jm1(ub2Var, downloadAnimeGroup, (byte) 0);
                        kd2Var2.n0(Q);
                    }
                    sb2 sb2Var = (sb2) Q;
                    ub2 ub2Var2 = this.B;
                    boolean f7 = kd2Var2.f(ub2Var2) | kd2Var2.h(downloadAnimeGroup);
                    Object Q2 = kd2Var2.Q();
                    if (f7 || Q2 == obj5) {
                        Q2 = new jm1(ub2Var2, downloadAnimeGroup, (byte) 1);
                        kd2Var2.n0(Q2);
                    }
                    io3.b(downloadAnimeGroup, z9, contains, sb2Var, (sb2) Q2, fc3.a(fc3Var, n77.Q(vz3.x, k)), kd2Var2, 0);
                    kd2Var2.q(false);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            default:
                fc3 fc3Var2 = (fc3) obj;
                int intValue3 = ((Number) obj2).intValue();
                kd2 kd2Var3 = (kd2) obj3;
                int intValue4 = ((Number) obj4).intValue();
                List list2 = (List) obj6;
                if ((intValue4 & 6) == 0) {
                    if (!kd2Var3.f(fc3Var2)) {
                        i4 = 2;
                    }
                    i2 = intValue4 | i4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (kd2Var3.d(intValue3)) {
                        i3 = 32;
                    }
                    i2 |= i3;
                }
                if ((i2 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var3.V(i2 & 1, z4)) {
                    Recent recent = (Recent) list.get(intValue3);
                    kd2Var3.e0(-1124662280);
                    int size = list2.size();
                    int i7 = this.z;
                    int i8 = intValue3 % i7;
                    if (i8 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i8 == i7 - 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (intValue3 / i7 == (size - 1) / i7) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z5) {
                        f2 = 12.0f;
                    } else {
                        f2 = 6.0f;
                    }
                    if (z6) {
                        f3 = 12.0f;
                    } else {
                        f3 = 6.0f;
                    }
                    if (z7) {
                        f4 = 0.0f;
                    } else {
                        f4 = 12.0f;
                    }
                    vh4 k2 = n77.k(f2, 0.0f, f3, f4, 2);
                    ub2 ub2Var3 = this.B;
                    boolean f8 = kd2Var3.f(ub2Var3) | kd2Var3.h(list2) | kd2Var3.d(i7);
                    if ((((i2 & 112) ^ 48) > 32 && kd2Var3.d(intValue3)) || (i2 & 48) == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z10 = f8 | z8;
                    Object Q3 = kd2Var3.Q();
                    if (!z10 && Q3 != obj5) {
                        kd2Var = kd2Var3;
                    } else {
                        kd2Var = kd2Var3;
                        Object gn2Var = new gn2(i7, intValue3, ub2Var3, list2, (byte) 1);
                        kd2Var.n0(gn2Var);
                        Q3 = gn2Var;
                    }
                    iv.m(recent, k2, null, this.A, (ub2) Q3, kd2Var, 0);
                    kd2Var.q(false);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
        }
    }

    public km1(List list, List list2, int i, ub2 ub2Var, ub2 ub2Var2) {
        this.y = list;
        this.C = list2;
        this.z = i;
        this.A = ub2Var;
        this.B = ub2Var2;
    }
}
