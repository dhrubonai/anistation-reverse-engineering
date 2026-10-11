package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ch3 implements t47 {
    public final t47 a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ch3(t47 t47Var, int i) {
        this.a = t47Var;
        this.b = i;
    }

    @Override // defpackage.t47
    public final int a(ud1 ud1Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(ud1Var);
        }
        return 0;
    }

    @Override // defpackage.t47
    public final int b(ud1 ud1Var, ia3 ia3Var) {
        return 0;
    }

    @Override // defpackage.t47
    public final int c(ud1 ud1Var) {
        return this.a.c(ud1Var);
    }

    @Override // defpackage.t47
    public final int d(ud1 ud1Var, ia3 ia3Var) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ch3) {
                ch3 ch3Var = (ch3) obj;
                if (a34.i(this.a, ch3Var.a) && this.b == ch3Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        byte b = this.b;
        int i = nv5.a;
        if ((b & i) == i) {
            nv5.u(sb, "Start");
        }
        int i2 = nv5.c;
        if ((b & i2) == i2) {
            nv5.u(sb, "Left");
        }
        if ((b & 16) == 16) {
            nv5.u(sb, "Top");
        }
        int i3 = nv5.b;
        if ((b & i3) == i3) {
            nv5.u(sb, "End");
        }
        int i4 = nv5.d;
        if ((b & i4) == i4) {
            nv5.u(sb, "Right");
        }
        nv5.u(sb, "Bottom");
        return "(" + this.a + " only " + qx1.m("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
