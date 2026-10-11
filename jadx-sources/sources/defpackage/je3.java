package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class je3 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ le3 y;

    public /* synthetic */ je3(le3 le3Var, byte b) {
        this.x = b;
        this.y = le3Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        le3 le3Var = this.y;
        switch (b) {
            case 0:
                rd3 rd3Var = (rd3) le3Var.L.invoke();
                int a = rd3Var.a();
                int i = 0;
                while (true) {
                    if (i < a) {
                        if (!rd3Var.b(i).equals(obj)) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                return Integer.valueOf(i);
            default:
                int intValue = ((Integer) obj).intValue();
                rd3 rd3Var2 = (rd3) le3Var.L.invoke();
                if (intValue < 0 || intValue >= rd3Var2.a()) {
                    hz2.a("Can't scroll to index " + intValue + ", it is out of bounds [0, " + rd3Var2.a() + ")");
                }
                tl7.z(le3Var.O0(), null, null, new jr(le3Var, intValue, null, (byte) 1), 3);
                return Boolean.TRUE;
        }
    }
}
