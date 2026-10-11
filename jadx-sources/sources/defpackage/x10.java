package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x10 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(w44 w44Var, long j, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 2;
        this.y = w44Var;
        this.z = j;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                x10 x10Var = new x10(this.z, vz0Var, (byte) 0);
                x10Var.y = obj;
                return x10Var;
            case 1:
                x10 x10Var2 = new x10(this.z, vz0Var, (byte) 1);
                x10Var2.y = obj;
                return x10Var2;
            default:
                return new x10((w44) this.y, this.z, vz0Var);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((x10) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((x10) create((pd5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((x10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        long j = this.z;
        switch (b) {
            case 0:
                j44 j44Var = (j44) this.y;
                m37.N(obj);
                ts4 ts4Var = i20.e;
                j44Var.e(i20.f, new Long(j));
                return pn6Var;
            case 1:
                m37.N(obj);
                rd5 rd5Var = ((pd5) this.y).a;
                rd5Var.d(rd5Var.k, j, 1);
                return pn6Var;
            default:
                w44 w44Var = (w44) this.y;
                m37.N(obj);
                if (((qt4) w44Var.getValue()) != null) {
                    w44Var.setValue(null);
                }
                w44Var.setValue(new qt4(j));
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x10(long j, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = j;
    }
}
