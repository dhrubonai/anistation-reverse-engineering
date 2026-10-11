package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jd2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jd2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                kd2Var.A--;
                return;
            default:
                du5 du5Var = (du5) obj;
                du5Var.k--;
                return;
        }
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((kd2) obj).A++;
                return;
            default:
                ((du5) obj).k++;
                return;
        }
    }
}
