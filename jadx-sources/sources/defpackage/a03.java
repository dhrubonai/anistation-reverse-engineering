package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class a03 extends xz3 implements jj6 {
    public t47 L;
    public t47 M;

    public a03() {
        w32 w32Var = sw0.L;
        this.L = w32Var;
        this.M = w32Var;
    }

    @Override // defpackage.xz3
    public void S0() {
        iv5.i(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new zz2(this, (byte) 1));
        b1();
    }

    @Override // defpackage.xz3
    public void T0() {
        this.M = this.L;
        iv5.k(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new zz2(this, (byte) 0));
    }

    @Override // defpackage.xz3
    public final void U0() {
        this.L = sw0.L;
    }

    public abstract t47 a1(t47 t47Var);

    public void b1() {
        this.M = a1(this.L);
        iv5.k(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new zz2(this, (byte) 0));
    }

    @Override // defpackage.jj6
    public final Object p() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
