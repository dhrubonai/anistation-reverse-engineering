package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ep6 implements j11 {
    public final ep6 x;
    public final p51 y;

    public ep6(ep6 ep6Var, p51 p51Var) {
        this.x = ep6Var;
        this.y = p51Var;
    }

    public final void a(p51 p51Var) {
        if (this.y != p51Var) {
            ep6 ep6Var = this.x;
            if (ep6Var != null) {
                ep6Var.a(p51Var);
                return;
            }
            return;
        }
        ze0.m("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return ic2Var.invoke(obj, this);
    }

    @Override // defpackage.l11
    public final /* bridge */ j11 get(k11 k11Var) {
        return tl7.u(this, k11Var);
    }

    @Override // defpackage.j11
    public final k11 getKey() {
        return h95.O;
    }

    @Override // defpackage.l11
    public final /* bridge */ l11 minusKey(k11 k11Var) {
        return tl7.B(this, k11Var);
    }

    @Override // defpackage.l11
    public final /* bridge */ l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
    }
}
