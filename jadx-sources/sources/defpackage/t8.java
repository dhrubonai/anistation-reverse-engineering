package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class t8 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ e9 y;

    public /* synthetic */ t8(e9 e9Var, byte b) {
        this.x = b;
        this.y = e9Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        boolean z = false;
        e9 e9Var = this.y;
        switch (b) {
            case 0:
                Object value = e9Var.h.getValue();
                if (value == null) {
                    float h = e9Var.f.h();
                    ti4 ti4Var = e9Var.c;
                    if (!Float.isNaN(h)) {
                        float c = e9Var.b().c(ti4Var.getValue());
                        if (!Float.isNaN(c) && h != c) {
                            Object a = e9Var.b().a(h);
                            if (a == null) {
                                return ti4Var.getValue();
                            }
                            return a;
                        }
                        return ti4Var.getValue();
                    }
                    return ti4Var.getValue();
                }
                return value;
            case 1:
                return e9Var.b();
            case 2:
                return new ai4(e9Var.b(), e9Var.e.getValue());
            case 3:
                if (e9Var.e.getValue() != xx6.z) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                if (e9Var.h.getValue() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return (xx6) e9Var.d.getValue();
        }
    }
}
