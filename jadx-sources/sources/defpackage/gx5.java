package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gx5 implements kr6 {
    public final kr6 x;
    public final long y;

    public gx5(kr6 kr6Var, long j) {
        this.x = kr6Var;
        this.y = j;
    }

    @Override // defpackage.kr6
    public final boolean b() {
        return this.x.b();
    }

    @Override // defpackage.kr6
    public final long e(rl rlVar, rl rlVar2, rl rlVar3) {
        return this.x.e(rlVar, rlVar2, rlVar3) + this.y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gx5)) {
            return false;
        }
        gx5 gx5Var = (gx5) obj;
        if (gx5Var.y != this.y || !a34.i(gx5Var.x, this.x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.y) + (this.x.hashCode() * 31);
    }

    @Override // defpackage.kr6
    public final rl o(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        long j2 = this.y;
        if (j < j2) {
            return rlVar3;
        }
        return this.x.o(j - j2, rlVar, rlVar2, rlVar3);
    }

    @Override // defpackage.kr6
    public final rl y(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        long j2 = this.y;
        if (j < j2) {
            return rlVar;
        }
        return this.x.y(j - j2, rlVar, rlVar2, rlVar3);
    }
}
