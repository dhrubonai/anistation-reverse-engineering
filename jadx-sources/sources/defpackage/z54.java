package defpackage;

import com.anistation.model.library.AnimeWithProgress;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z54 implements kc2 {
    public final /* synthetic */ List x;
    public final /* synthetic */ int y;
    public final /* synthetic */ ub2 z;

    public z54(List list, int i, ub2 ub2Var) {
        this.x = list;
        this.y = i;
        this.z = ub2Var;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        float f;
        int i2;
        int i3;
        fc3 fc3Var = (fc3) obj;
        int intValue = ((Number) obj2).intValue();
        kd2 kd2Var = (kd2) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (kd2Var.f(fc3Var)) {
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
        boolean z3 = true;
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            AnimeWithProgress animeWithProgress = (AnimeWithProgress) this.x.get(intValue);
            kd2Var.e0(-725643538);
            int i4 = this.y;
            int i5 = intValue % i4;
            if (i5 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i5 != i4 - 1) {
                z3 = false;
            }
            float f2 = 15.0f;
            if (z2) {
                f = 15.0f;
            } else {
                f = 0.0f;
            }
            if (!z3) {
                f2 = 0.0f;
            }
            wk6.a(animeWithProgress, fc3.a(fc3Var, n77.Q(vz3.x, n77.k(f, 0.0f, f2, 0.0f, 10))), this.z, kd2Var, 0);
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
