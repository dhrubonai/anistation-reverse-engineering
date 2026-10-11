package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bp7 extends kp7 {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ sn7 E;
    public final /* synthetic */ sp7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp7(sp7 sp7Var, String str, String str2, boolean z, sn7 sn7Var) {
        super(sp7Var, true);
        this.B = str;
        this.C = str2;
        this.D = z;
        this.E = sn7Var;
        this.F = sp7Var;
    }

    @Override // defpackage.kp7
    public final void a() {
        wn7 wn7Var = this.F.e;
        a34.x(wn7Var);
        wn7Var.getUserProperties(this.B, this.C, this.D, this.E);
    }

    @Override // defpackage.kp7
    public final void b() {
        this.E.z(null);
    }
}
