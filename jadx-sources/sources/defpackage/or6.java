package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class or6 {
    public final q42 a;
    public rl b;
    public rl c;
    public rl d;
    public final float e;

    public or6(q42 q42Var) {
        this.a = q42Var;
        this.e = q42Var.f();
    }

    public final rl a(long j, rl rlVar, rl rlVar2) {
        rl rlVar3 = this.c;
        if (rlVar3 == null) {
            rlVar3 = rlVar.c();
            this.c = rlVar3;
        }
        int b = rlVar3.b();
        int i = 0;
        while (true) {
            rl rlVar4 = this.c;
            if (i < b) {
                if (rlVar4 != null) {
                    rlVar.getClass();
                    rlVar4.e(i, this.a.l(rlVar2.a(i), j));
                    i++;
                } else {
                    a34.s0("velocityVector");
                    throw null;
                }
            } else {
                if (rlVar4 != null) {
                    return rlVar4;
                }
                a34.s0("velocityVector");
                throw null;
            }
        }
    }
}
