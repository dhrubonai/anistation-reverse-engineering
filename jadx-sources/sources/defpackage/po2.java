package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class po2 implements bv5 {
    public final na2 x;
    public boolean y;
    public final /* synthetic */ uo2 z;

    public po2(uo2 uo2Var) {
        this.z = uo2Var;
        this.x = new na2(uo2Var.c.d());
    }

    public final void a() {
        uo2 uo2Var = this.z;
        byte b = uo2Var.e;
        if (b == 6) {
            return;
        }
        if (b == 5) {
            na2 na2Var = this.x;
            of6 of6Var = na2Var.e;
            na2Var.e = of6.d;
            of6Var.a();
            of6Var.b();
            uo2Var.e = (byte) 6;
            return;
        }
        qi2.h(uo2Var.e, "state: ");
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return this.x;
    }

    @Override // defpackage.bv5
    public long j0(long j, pa0 pa0Var) {
        uo2 uo2Var = this.z;
        pa0Var.getClass();
        try {
            return uo2Var.c.j0(j, pa0Var);
        } catch (IOException e) {
            uo2Var.b.k();
            this.a();
            throw e;
        }
    }
}
