package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jt0 extends x45 implements ic2 {
    public int A;
    public boolean B;
    public /* synthetic */ Object C;
    public final /* synthetic */ kt0 D;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt0(kt0 kt0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.D = kt0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        jt0 jt0Var = new jt0(this.D, vz0Var);
        jt0Var.C = obj;
        return jt0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((jt0) create((ri5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        ri5 ri5Var;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        kt0 kt0Var = this.D;
        f44 f44Var = kt0Var.x;
        r34 r34Var = kt0Var.z;
        boolean z = this.B;
        if (z) {
            if (z) {
                i = this.A;
                i2 = this.z;
                i3 = this.y;
                ri5Var = (ri5) this.C;
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            ri5Var = (ri5) this.C;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (i3 < Math.min(kt0Var.A + 10, r34Var.b)) {
            int i6 = i3 + 1;
            int c = r34Var.c(i3);
            switch (c) {
                case 0:
                    str = "up";
                    break;
                case 1:
                    Object g = f44Var.g(i2);
                    i2++;
                    str = "down " + g;
                    break;
                case 2:
                    str = zo5.m("remove ", " ", r34Var.c(i6), r34Var.c(i3 + 2));
                    i6 = i3 + 3;
                    break;
                case 3:
                    int c2 = r34Var.c(i6);
                    int c3 = r34Var.c(i3 + 2);
                    int c4 = r34Var.c(i3 + 3);
                    StringBuilder u = qx1.u("move ", c2, " ", c3, " ");
                    u.append(c4);
                    str = u.toString();
                    i6 = i3 + 4;
                    break;
                case 4:
                    str = "clear";
                    break;
                case 5:
                    i4 = i3 + 2;
                    int c5 = r34Var.c(i6);
                    i5 = i2 + 1;
                    str2 = "insertBottomUp " + c5 + " " + f44Var.g(i2);
                    int i7 = i4;
                    str = str2;
                    i6 = i7;
                    i2 = i5;
                    break;
                case 6:
                    i4 = i3 + 2;
                    int c6 = r34Var.c(i6);
                    i5 = i2 + 1;
                    str2 = "insertTopDown " + c6 + " " + f44Var.g(i2);
                    int i72 = i4;
                    str = str2;
                    i6 = i72;
                    i2 = i5;
                    break;
                case 7:
                    Object g2 = f44Var.g(i2);
                    g2.getClass();
                    wk6.j(2, g2);
                    i2 += 2;
                    str = "apply " + ((ic2) g2);
                    break;
                case 8:
                    str = "reuse " + kt0Var.y.g(i);
                    i++;
                    break;
                case 9:
                    str = "recompose pending";
                    break;
                default:
                    str = qx1.h(c, "unknown op: ");
                    break;
            }
            this.C = ri5Var;
            this.y = i6;
            this.z = i2;
            this.A = i;
            this.B = true;
            ri5Var.d(this, i3 + ": " + str);
            return w11.x;
        }
        return pn6.a;
    }
}
