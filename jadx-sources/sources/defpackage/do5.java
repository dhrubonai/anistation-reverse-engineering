package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class do5 {
    public final boolean a;
    public final ub2 b;
    public final boolean c;
    public j32 d;
    public final d9 e;
    public j32 f;
    public j32 g;

    /* JADX WARN: Type inference failed for: r7v4, types: [j32, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [j32, java.lang.Object] */
    public do5(boolean z, sb2 sb2Var, sb2 sb2Var2, eo5 eo5Var, ub2 ub2Var, boolean z2) {
        this.a = z;
        this.b = ub2Var;
        this.c = z2;
        if (z && eo5Var == eo5.z) {
            ze0.k("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        if (z2 && eo5Var == eo5.x) {
            ze0.k("The initial value must not be set to Hidden if skipHiddenState is set to true.");
            throw null;
        }
        this.d = zn5.a;
        this.e = new d9(eo5Var, new mm(sb2Var, (byte) 11), sb2Var2, new nj4(this, (byte) 23), ub2Var);
        this.f = new Object();
        this.g = new Object();
    }

    public static Object a(do5 do5Var, eo5 eo5Var, j32 j32Var, t36 t36Var) {
        float h = do5Var.e.j.h();
        Object b = do5Var.e.b(eo5Var, c54.x, new co5(do5Var, h, j32Var, null), t36Var);
        if (b == w11.x) {
            return b;
        }
        return pn6.a;
    }

    public final Object b(t36 t36Var) {
        Object a;
        ub2 ub2Var = this.b;
        eo5 eo5Var = eo5.y;
        if (((Boolean) ub2Var.invoke(eo5Var)).booleanValue() && (a = a(this, eo5Var, this.f, t36Var)) == w11.x) {
            return a;
        }
        return pn6.a;
    }

    public final eo5 c() {
        return (eo5) this.e.g.getValue();
    }

    public final Object d(t36 t36Var) {
        Object a;
        if (!this.c) {
            ub2 ub2Var = this.b;
            eo5 eo5Var = eo5.x;
            if (((Boolean) ub2Var.invoke(eo5Var)).booleanValue() && (a = a(this, eo5Var, this.g, t36Var)) == w11.x) {
                return a;
            }
            return pn6.a;
        }
        ze0.m("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        return null;
    }

    public final boolean e() {
        if (this.e.g.getValue() != eo5.x) {
            return true;
        }
        return false;
    }

    public final Object f(t36 t36Var) {
        Object a;
        if (!this.a) {
            ub2 ub2Var = this.b;
            eo5 eo5Var = eo5.z;
            if (((Boolean) ub2Var.invoke(eo5Var)).booleanValue() && (a = a(this, eo5Var, this.g, t36Var)) == w11.x) {
                return a;
            }
            return pn6.a;
        }
        ze0.m("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        return null;
    }

    public final Object g(t36 t36Var) {
        Object a;
        Map map = this.e.d().a;
        eo5 eo5Var = eo5.z;
        if (!map.containsKey(eo5Var)) {
            eo5Var = eo5.y;
        }
        if (((Boolean) this.b.invoke(eo5Var)).booleanValue() && (a = a(this, eo5Var, this.f, t36Var)) == w11.x) {
            return a;
        }
        return pn6.a;
    }
}
