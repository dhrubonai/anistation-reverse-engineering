package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j90 implements h90 {
    public int A;
    public short B;
    public final zi4 x;
    public final int y;
    public final int z;

    public j90(q14 q14Var) {
        zi4 zi4Var = q14Var.z;
        this.x = zi4Var;
        zi4Var.N(12);
        this.z = zi4Var.E() & 255;
        this.y = zi4Var.E();
    }

    @Override // defpackage.h90
    public final int a() {
        return -1;
    }

    @Override // defpackage.h90
    public final int c() {
        return this.y;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [short, int] */
    @Override // defpackage.h90
    public final int d() {
        zi4 zi4Var = this.x;
        int i = this.z;
        if (i == 8) {
            return zi4Var.A();
        }
        if (i == 16) {
            return zi4Var.H();
        }
        int i2 = this.A;
        this.A = i2 + 1;
        if (i2 % 2 == 0) {
            ?? A = zi4Var.A();
            this.B = A;
            return (A & 240) >> 4;
        }
        return this.B & 15;
    }
}
