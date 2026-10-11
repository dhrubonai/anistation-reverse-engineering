package defpackage;

import com.anistation.model.library.WatchProgress;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i01 implements kc2 {
    public final /* synthetic */ w44 A;
    public final /* synthetic */ w44 B;
    public final /* synthetic */ List x;
    public final /* synthetic */ float y;
    public final /* synthetic */ ub2 z;

    public i01(List list, float f, ub2 ub2Var, w44 w44Var, w44 w44Var2) {
        this.x = list;
        this.y = f;
        this.z = ub2Var;
        this.A = w44Var;
        this.B = w44Var2;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        zc3 zc3Var = (zc3) obj;
        int intValue = ((Number) obj2).intValue();
        kd2 kd2Var = (kd2) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (kd2Var.f(zc3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (kd2Var.d(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            WatchProgress watchProgress = (WatchProgress) this.x.get(intValue);
            kd2Var.e0(-336995762);
            w44 w44Var = this.A;
            boolean contains = ((Set) w44Var.getValue()).contains(watchProgress.getAnimeId());
            w44 w44Var2 = this.B;
            boolean booleanValue = ((Boolean) w44Var2.getValue()).booleanValue();
            yz3 a = zc3.a(zc3Var, ar5.l(vz3.x, this.y));
            boolean g = kd2Var.g(contains) | kd2Var.h(watchProgress);
            Object Q = kd2Var.Q();
            Object obj5 = au0.a;
            if (g || Q == obj5) {
                Q = new g01(contains, watchProgress, w44Var);
                kd2Var.n0(Q);
            }
            sb2 sb2Var = (sb2) Q;
            Object obj6 = this.z;
            boolean f = kd2Var.f(obj6) | kd2Var.h(watchProgress);
            Object Q2 = kd2Var.Q();
            if (f || Q2 == obj5) {
                Q2 = new od(obj6, watchProgress, (byte) 6);
                kd2Var.n0(Q2);
            }
            ub2 ub2Var = (ub2) Q2;
            boolean h = kd2Var.h(watchProgress);
            Object Q3 = kd2Var.Q();
            if (h || Q3 == obj5) {
                Q3 = new h01(watchProgress, w44Var2, w44Var, (byte) 0);
                kd2Var.n0(Q3);
            }
            oi4.a(watchProgress, a, booleanValue, contains, sb2Var, ub2Var, (sb2) Q3, kd2Var, 0);
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
