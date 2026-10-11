package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b8 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ z8 y;
    public final /* synthetic */ t05 z;

    public /* synthetic */ b8(z8 z8Var, t05 t05Var, byte b) {
        this.x = b;
        this.y = z8Var;
        this.z = t05Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        t05 t05Var = this.z;
        z8 z8Var = this.y;
        float floatValue = ((Float) obj).floatValue();
        float floatValue2 = ((Float) obj2).floatValue();
        switch (b) {
            case 0:
                d9 d9Var = z8Var.a;
                d9Var.i.i(floatValue);
                d9Var.j.i(floatValue2);
                t05Var.x = floatValue;
                return pn6Var;
            default:
                d9 d9Var2 = z8Var.a;
                d9Var2.i.i(floatValue);
                d9Var2.j.i(floatValue2);
                t05Var.x = floatValue;
                return pn6Var;
        }
    }
}
