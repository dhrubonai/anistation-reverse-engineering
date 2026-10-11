package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class em4 {
    public int x;
    public int y;
    public long z = 0;
    public long A = fm4.b;
    public long B = 0;

    public abstract int P(f7 f7Var);

    public int R() {
        return (int) (this.z & 4294967295L);
    }

    public int S() {
        return (int) (this.z >> 32);
    }

    public final void U() {
        this.x = db.C((int) (this.z >> 32), rx0.j(this.A), rx0.h(this.A));
        this.y = db.C((int) (this.z & 4294967295L), rx0.i(this.A), rx0.g(this.A));
        int i = this.x;
        long j = this.z;
        this.B = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void V(long j, float f, ub2 ub2Var);

    public void Y(long j, float f, di2 di2Var) {
        V(j, f, null);
    }

    public final void Z(long j) {
        if (!k13.a(this.z, j)) {
            this.z = j;
            U();
        }
    }

    public final void b0(long j) {
        if (!rx0.b(this.A, j)) {
            this.A = j;
            U();
        }
    }

    public Object w() {
        return null;
    }
}
