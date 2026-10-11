package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z10 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z10(String str, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                z10 z10Var = new z10(this.z, vz0Var, (byte) 0);
                z10Var.y = obj;
                return z10Var;
            case 1:
                z10 z10Var2 = new z10(this.z, vz0Var, (byte) 1);
                z10Var2.y = obj;
                return z10Var2;
            case 2:
                z10 z10Var3 = new z10(this.z, vz0Var, (byte) 2);
                z10Var3.y = obj;
                return z10Var3;
            case 3:
                z10 z10Var4 = new z10(this.z, vz0Var, (byte) 3);
                z10Var4.y = obj;
                return z10Var4;
            case 4:
                z10 z10Var5 = new z10(this.z, vz0Var, (byte) 4);
                z10Var5.y = obj;
                return z10Var5;
            case 5:
                z10 z10Var6 = new z10(this.z, vz0Var, (byte) 5);
                z10Var6.y = obj;
                return z10Var6;
            case 6:
                z10 z10Var7 = new z10(this.z, vz0Var, (byte) 6);
                z10Var7.y = obj;
                return z10Var7;
            default:
                z10 z10Var8 = new z10(this.z, vz0Var, (byte) 7);
                z10Var8.y = obj;
                return z10Var8;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        j44 j44Var = (j44) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                ((z10) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((z10) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 2:
                ((z10) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 3:
                ((z10) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 4:
                ((z10) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 5:
                ((z10) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 6:
                ((z10) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((z10) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        String str = this.z;
        j44 j44Var = (j44) this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                ts4 ts4Var = i20.e;
                j44Var.e(i20.e, str);
                return pn6Var;
            case 1:
                m37.N(obj);
                hh2.d.getClass();
                j44Var.e(hh2.q, str);
                return pn6Var;
            case 2:
                m37.N(obj);
                hh2.d.getClass();
                j44Var.e(hh2.r, str);
                return pn6Var;
            case 3:
                m37.N(obj);
                j44Var.e(av6.h, str);
                j44Var.e(av6.b, Boolean.valueOf(uz5.p0(str, '-').equalsIgnoreCase("en")));
                return pn6Var;
            case 4:
                m37.N(obj);
                ts4 ts4Var2 = av6.b;
                j44Var.e(av6.j, str);
                return pn6Var;
            case 5:
                m37.N(obj);
                ts4 ts4Var3 = av6.b;
                j44Var.e(av6.k, str);
                return pn6Var;
            case 6:
                m37.N(obj);
                ts4 ts4Var4 = av6.b;
                j44Var.e(av6.i, str);
                return pn6Var;
            default:
                m37.N(obj);
                ts4 ts4Var5 = av6.b;
                j44Var.e(av6.g, str);
                return pn6Var;
        }
    }
}
