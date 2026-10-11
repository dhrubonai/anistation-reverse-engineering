package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n07 extends t36 implements ic2 {
    public final /* synthetic */ w44 A;
    public final /* synthetic */ w44 B;
    public final /* synthetic */ w44 C;
    public final /* synthetic */ w44 D;
    public final /* synthetic */ pi4 E;
    public boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n07(boolean z, boolean z2, w44 w44Var, w44 w44Var2, w44 w44Var3, w44 w44Var4, pi4 pi4Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = z;
        this.z = z2;
        this.A = w44Var;
        this.B = w44Var2;
        this.C = w44Var3;
        this.D = w44Var4;
        this.E = pi4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new n07(this.y, this.z, this.A, this.B, this.C, this.D, this.E, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((n07) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        byte b = 1;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            if (s07.o(this.A) || ((dq4) this.B.getValue()).h != null || s07.d(this.C) || this.y || !this.z) {
                h43 h43Var = (h43) this.D.getValue();
                if (h43Var != null) {
                    h43Var.l(null);
                }
                pi4 pi4Var = this.E;
                float h = pi4Var.h();
                tw5 tw5Var = s07.a;
                yz6 yz6Var = new yz6(pi4Var, b);
                this.x = true;
                Object c = nv5.c(h, 0.0f, tw5Var, yz6Var, this, 4);
                w11 w11Var = w11.x;
                if (c == w11Var) {
                    return w11Var;
                }
            }
        }
        return pn6.a;
    }
}
