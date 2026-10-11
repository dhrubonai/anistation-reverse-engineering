package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class s8 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ d9 y;

    public /* synthetic */ s8(d9 d9Var, byte b) {
        this.x = b;
        this.y = d9Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        d9 d9Var = this.y;
        switch (b) {
            case 0:
                Object value = d9Var.k.getValue();
                if (value == null) {
                    float h = d9Var.i.h();
                    boolean isNaN = Float.isNaN(h);
                    ti4 ti4Var = d9Var.g;
                    if (!isNaN) {
                        return d9Var.c(h, 0.0f, ti4Var.getValue());
                    }
                    return ti4Var.getValue();
                }
                return value;
            case 1:
                Object value2 = d9Var.k.getValue();
                if (value2 == null) {
                    float h2 = d9Var.i.h();
                    boolean isNaN2 = Float.isNaN(h2);
                    ti4 ti4Var2 = d9Var.g;
                    if (!isNaN2) {
                        Object value3 = ti4Var2.getValue();
                        cn3 d = d9Var.d();
                        float d2 = d.d(value3);
                        if (d2 != h2 && !Float.isNaN(d2)) {
                            if (d2 < h2) {
                                Object b2 = d.b(h2, true);
                                if (b2 != null) {
                                    return b2;
                                }
                            } else {
                                Object b3 = d.b(h2, false);
                                if (b3 != null) {
                                    return b3;
                                }
                            }
                        }
                        return value3;
                    }
                    return ti4Var2.getValue();
                }
                return value2;
            case 2:
                return d9Var.d();
            default:
                return new ai4(d9Var.d(), d9Var.h.getValue());
        }
    }
}
