package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n50 implements gx0 {
    public final o50 a;
    public final /* synthetic */ byte b;

    public n50(o50 o50Var, byte b) {
        this.b = b;
        this.a = o50Var;
    }

    @Override // defpackage.gx0
    public final boolean a(z77 z77Var) {
        if (c(z77Var) && d(this.a.b())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gx0
    public final vf0 b(qx0 qx0Var) {
        qx0Var.getClass();
        return new vf0(new c0((Object) this, (vz0) null, (byte) 11), it1.x, -2, ta0.x);
    }

    @Override // defpackage.gx0
    public final boolean c(z77 z77Var) {
        byte b = this.b;
        z77Var.getClass();
        switch (b) {
            case 0:
                return z77Var.j.c;
            case 1:
                return z77Var.j.e;
            default:
                return z77Var.j.f;
        }
    }

    public final boolean d(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
