package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hk extends x93 implements ub2 {
    public final /* synthetic */ byte y;
    public final /* synthetic */ ik z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk(ik ikVar, byte b) {
        super(1);
        this.y = b;
        this.z = ikVar;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        em4[] em4VarArr;
        int i;
        pn6 pn6Var;
        int i2;
        byte b = this.y;
        pn6 pn6Var2 = pn6.a;
        int i3 = 0;
        ik ikVar = this.z;
        switch (b) {
            case 0:
                dm4 dm4Var = (dm4) obj;
                em4[] em4VarArr2 = ikVar.c;
                em4VarArr2.getClass();
                int i4 = ikVar.e;
                int i5 = ikVar.g;
                int length = em4VarArr2.length;
                while (i3 < length) {
                    em4 em4Var = em4VarArr2[i3];
                    if (em4Var != null) {
                        em4VarArr = em4VarArr2;
                        i = i3;
                        long a = ikVar.a.b.a((em4Var.x << 32) | (em4Var.y & 4294967295L), (i4 << 32) | (i5 & 4294967295L), ia3.x);
                        dm4Var.f(em4Var, (int) (a >> 32), (int) (a & 4294967295L), 0.0f);
                    } else {
                        em4VarArr = em4VarArr2;
                        i = i3;
                    }
                    i3 = i + 1;
                    em4VarArr2 = em4VarArr;
                }
                return pn6Var2;
            default:
                dm4 dm4Var2 = (dm4) obj;
                em4[] em4VarArr3 = ikVar.b;
                em4VarArr3.getClass();
                int i6 = ikVar.d;
                int i7 = ikVar.f;
                int length2 = em4VarArr3.length;
                while (i3 < length2) {
                    em4 em4Var2 = em4VarArr3[i3];
                    if (em4Var2 != null) {
                        e7 e7Var = ikVar.a.b;
                        long j = (em4Var2.y & 4294967295L) | (em4Var2.x << 32);
                        pn6Var = pn6Var2;
                        i2 = i3;
                        long a2 = e7Var.a(j, (i6 << 32) | (i7 & 4294967295L), ia3.x);
                        dm4Var2.f(em4Var2, (int) (a2 >> 32), (int) (a2 & 4294967295L), 0.0f);
                    } else {
                        pn6Var = pn6Var2;
                        i2 = i3;
                    }
                    i3 = i2 + 1;
                    pn6Var2 = pn6Var;
                }
                return pn6Var2;
        }
    }
}
