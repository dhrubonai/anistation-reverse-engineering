package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class a90 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ byte y;
    public final /* synthetic */ Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a90(Object obj, int i, byte b) {
        this.x = b;
        this.z = obj;
        this.y = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        byte b2 = this.y;
        Object obj3 = this.z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                b90.a((yz3) obj3, (kd2) obj, kb0.N(b2 | 1));
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                qi1.c((sb2) obj3, (kd2) obj, kb0.N(b2 | 1));
                return pn6Var;
        }
    }
}
