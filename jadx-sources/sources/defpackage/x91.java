package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class x91 implements r26 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ x91(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    @Override // defpackage.r26
    public final Object get() {
        byte b = this.x;
        Object obj = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return new pv4((o41) obj, (e12) ((tp) obj2).y);
            default:
                jp5 jp5Var = (jp5) obj;
                ip5 a = jp5Var.a();
                a.d = 1;
                a.N = hp5.l;
                a.L = new tw(fi0.q1(jp5Var.H.get(), jp5Var, ((fi0) obj2).a));
                a.M = jp5Var.I;
                a.i = false;
                return new jp5(a);
        }
    }
}
