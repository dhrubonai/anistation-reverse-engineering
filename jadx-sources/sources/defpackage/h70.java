package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h70 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h70(int i, vz0 vz0Var, byte b) {
        super(i, vz0Var);
        this.x = b;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                h70 h70Var = new h70(2, vz0Var, (byte) 0);
                h70Var.y = obj;
                return h70Var;
            case 1:
                h70 h70Var2 = new h70(2, vz0Var, (byte) 1);
                h70Var2.y = obj;
                return h70Var2;
            case 2:
                h70 h70Var3 = new h70(2, vz0Var, (byte) 2);
                h70Var3.y = obj;
                return h70Var3;
            case 3:
                h70 h70Var4 = new h70(2, vz0Var, (byte) 3);
                h70Var4.y = obj;
                return h70Var4;
            case 4:
                h70 h70Var5 = new h70(2, vz0Var, (byte) 4);
                h70Var5.y = obj;
                return h70Var5;
            case 5:
                h70 h70Var6 = new h70(2, vz0Var, (byte) 5);
                h70Var6.y = obj;
                return h70Var6;
            default:
                h70 h70Var7 = new h70(2, vz0Var, (byte) 6);
                h70Var7.y = obj;
                return h70Var7;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((h70) create((f91) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return null;
            case 1:
                return ((h70) create((ox5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                ((h70) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 3:
                return ((h70) create((yg4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((h70) create((d05) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                ((h70) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                return ((h70) create((tn5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z = false;
        switch (b) {
            case 0:
                f91 f91Var = (f91) this.y;
                m37.N(obj);
                if (f91Var.d0().c().getAttributes().d(i70.b) != null) {
                    ov3.d();
                    return null;
                }
                return null;
            case 1:
                m37.N(obj);
                return Boolean.valueOf(!(((ox5) this.y) instanceof e32));
            case 2:
                j44 j44Var = (j44) this.y;
                m37.N(obj);
                j44Var.d(zl1.d);
                j44Var.d(zl1.e);
                return pn6Var;
            case 3:
                yg4 yg4Var = (yg4) this.y;
                m37.N(obj);
                if (yg4Var != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                m37.N(obj);
                if (((d05) this.y) == d05.x) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                j44 j44Var2 = (j44) this.y;
                m37.N(obj);
                j44Var2.d(ee5.c);
                return pn6Var;
            default:
                tn5 tn5Var = (tn5) this.y;
                m37.N(obj);
                if (tn5Var != tn5.x) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
