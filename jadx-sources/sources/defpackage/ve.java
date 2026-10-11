package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ve implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ af y;
    public final /* synthetic */ q86 z;

    public /* synthetic */ ve(af afVar, q86 q86Var, byte b) {
        this.x = b;
        this.y = afVar;
        this.z = q86Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, w05] */
    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        byte b2 = 4;
        Object obj = null;
        q86 q86Var = this.z;
        af afVar = this.y;
        switch (b) {
            case 0:
                ue ueVar = afVar.f;
                y7 y7Var = new y7(q86Var, (byte) 16);
                ?? obj2 = new Object();
                afVar.e.d("dataBuilder", ueVar, new n(obj2, y7Var, b2));
                Object obj3 = obj2.x;
                if (obj3 != null) {
                    return (p86) obj3;
                }
                a34.s0("result");
                throw null;
            case 1:
                ue ueVar2 = afVar.g;
                ve veVar = new ve(afVar, q86Var, (byte) 2);
                ?? obj4 = new Object();
                afVar.e.d("positioner", ueVar2, new n(obj4, veVar, b2));
                Object obj5 = obj4.x;
                if (obj5 != null) {
                    return (n05) obj5;
                }
                a34.s0("result");
                throw null;
            default:
                Object invoke = afVar.c.invoke();
                if (((ha3) invoke).m()) {
                    obj = invoke;
                }
                ha3 ha3Var = (ha3) obj;
                if (ha3Var == null) {
                    return n05.e;
                }
                return q86Var.n(ha3Var).k(ha3Var.J(0L));
        }
    }
}
