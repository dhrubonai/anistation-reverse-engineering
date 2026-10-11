package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class g34 implements xe2 {
    public final /* synthetic */ l34 x;

    public /* synthetic */ g34(l34 l34Var) {
        this.x = l34Var;
    }

    @Override // defpackage.xe2
    public void a(ye2 ye2Var, we2 we2Var, long j) {
        l34 l34Var = this.x;
        io3.B(!l34Var.q);
        a61.a();
        l34Var.i.add(new ef6(we2Var, j));
        l34Var.j.put(we2Var.a, new k34(ye2Var, j));
        l34Var.b();
    }
}
