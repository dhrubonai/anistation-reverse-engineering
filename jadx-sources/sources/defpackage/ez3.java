package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ez3 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ sb2 z;

    public /* synthetic */ ez3(String str, sb2 sb2Var, byte b) {
        this.x = b;
        this.y = str;
        this.z = sb2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        sb2 sb2Var = this.z;
        String str = this.y;
        switch (b) {
            case 0:
                bi5 bi5Var = (bi5) obj;
                w73[] w73VarArr = zh5.a;
                ai5 ai5Var = yh5.u;
                w73 w73Var = zh5.a[11];
                Float valueOf = Float.valueOf(1.0f);
                ai5Var.getClass();
                bi5Var.b(ai5Var, valueOf);
                zh5.c(bi5Var, str);
                bi5Var.b(oh5.b, new o3(null, new kz3(sb2Var, (byte) 0)));
                return pn6Var;
            default:
                String str2 = (String) obj;
                si siVar = si.a;
                if (str2 != null) {
                    str = str2;
                }
                si.a(str);
                sb2Var.invoke();
                return pn6Var;
        }
    }
}
