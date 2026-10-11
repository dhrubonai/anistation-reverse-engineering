package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kl7 implements Comparator {
    public final /* synthetic */ ti7 x;
    public final /* synthetic */ vs7 y;

    public kl7(ti7 ti7Var, vs7 vs7Var) {
        this.x = ti7Var;
        this.y = vs7Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ik7 ik7Var = (ik7) obj;
        ik7 ik7Var2 = (ik7) obj2;
        if (ik7Var instanceof xk7) {
            if (ik7Var2 instanceof xk7) {
                return 0;
            }
            return 1;
        }
        if (ik7Var2 instanceof xk7) {
            return -1;
        }
        ti7 ti7Var = this.x;
        if (ti7Var == null) {
            return ik7Var.d().compareTo(ik7Var2.d());
        }
        return (int) fy5.r(ti7Var.a(this.y, Arrays.asList(ik7Var, ik7Var2)).h().doubleValue());
    }
}
