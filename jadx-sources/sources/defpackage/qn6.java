package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class qn6 implements x73 {
    public static final qn6 b = new qn6();
    public final /* synthetic */ hc4 a = new hc4(pn6.a, "kotlin.Unit");

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        this.a.deserialize(l61Var);
        return pn6.a;
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        pn6 pn6Var = (pn6) obj;
        pn6Var.getClass();
        this.a.serialize(wt1Var, pn6Var);
    }
}
