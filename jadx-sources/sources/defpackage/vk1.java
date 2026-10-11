package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vk1 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ fl1 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk1(fl1 fl1Var, String str, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.y = fl1Var;
        this.z = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        String str = this.z;
        fl1 fl1Var = this.y;
        switch (b) {
            case 0:
                return new vk1(fl1Var, str, vz0Var, (byte) 0);
            case 1:
                return new vk1(fl1Var, str, vz0Var, (byte) 1);
            case 2:
                return new vk1(fl1Var, str, vz0Var, (byte) 2);
            default:
                return new vk1(fl1Var, str, vz0Var, (byte) 3);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((vk1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((vk1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((vk1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((vk1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        String str = this.z;
        fl1 fl1Var = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                return fl1Var.b.e.d(str);
            case 1:
                m37.N(obj);
                return fl1Var.b.e.d(str);
            case 2:
                m37.N(obj);
                return fl1Var.b.e.d(str);
            default:
                m37.N(obj);
                cj1 d = fl1Var.b.e.d(str);
                if (d != null) {
                    return fl1.t(d, ((nk1) fl1Var.e.c.x.getValue()).a());
                }
                return null;
        }
    }
}
