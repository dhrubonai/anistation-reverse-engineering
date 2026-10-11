package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ob1 extends yg4 {
    public final /* synthetic */ byte a = 1;
    public final Long b;
    public final jz0 c;
    public final /* synthetic */ Object d;

    public ob1(yl4 yl4Var, jz0 jz0Var, Object obj) {
        Long l;
        this.d = obj;
        String r = ((or2) yl4Var.x).c.r("Content-Length");
        if (r != null) {
            l = Long.valueOf(Long.parseLong(r));
        } else {
            l = null;
        }
        this.b = l;
        this.c = jz0Var == null ? fz0.b : jz0Var;
    }

    @Override // defpackage.yg4
    public final Long a() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.yg4
    public final jz0 b() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public ob1(or2 or2Var, jz0 jz0Var, Object obj) {
        this.d = obj;
        String r = or2Var.c.r("Content-Length");
        this.b = r != null ? Long.valueOf(Long.parseLong(r)) : null;
        this.c = jz0Var == null ? fz0.b : jz0Var;
    }
}
