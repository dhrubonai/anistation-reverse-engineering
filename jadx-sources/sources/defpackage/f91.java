package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class f91 implements wq2, v11 {
    public final dd2 A;
    public final dd2 B;
    public final l11 C;
    public final yp2 D;
    public final Object E;
    public final jk2 F;
    public final /* synthetic */ byte x = 1;
    public final qs2 y;
    public final hr2 z;

    public f91(s95 s95Var, byte[] bArr, f91 f91Var) {
        hr2 hr2Var;
        dd2 dd2Var;
        dd2 dd2Var2;
        this.D = s95Var;
        this.E = bArr;
        this.y = f91Var.c();
        switch (f91Var.x) {
            case 0:
                hr2Var = f91Var.z;
                break;
            default:
                hr2Var = f91Var.z;
                break;
        }
        this.z = hr2Var;
        switch (f91Var.x) {
            case 0:
                dd2Var = f91Var.A;
                break;
            default:
                dd2Var = f91Var.A;
                break;
        }
        this.A = dd2Var;
        switch (f91Var.x) {
            case 0:
                dd2Var2 = f91Var.B;
                break;
            default:
                dd2Var2 = f91Var.B;
                break;
        }
        this.B = dd2Var2;
        this.F = f91Var.a();
        this.C = f91Var.getCoroutineContext();
    }

    @Override // defpackage.wq2
    public final jk2 a() {
        byte b = this.x;
        jk2 jk2Var = this.F;
        switch (b) {
            case 0:
                return (nk2) jk2Var;
            default:
                return jk2Var;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [cv5, java.lang.Object, oa0] */
    public final wc0 b() {
        byte b = this.x;
        Object obj = this.E;
        switch (b) {
            case 0:
                return (wc0) obj;
            default:
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                ?? obj2 = new Object();
                obj2.write(bArr, 0, length);
                return new dv5(obj2);
        }
    }

    public final qs2 c() {
        byte b = this.x;
        return this.y;
    }

    public final yp2 d0() {
        byte b = this.x;
        yp2 yp2Var = this.D;
        switch (b) {
            case 0:
                return yp2Var;
            default:
                return (s95) yp2Var;
        }
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        switch (this.x) {
            case 0:
                return this.C;
            default:
                return this.C;
        }
    }

    public final String toString() {
        return "HttpResponse[" + d0().c().getUrl() + ", " + c() + ']';
    }

    public f91(yp2 yp2Var, bs2 bs2Var) {
        this.D = yp2Var;
        this.C = bs2Var.f;
        this.y = bs2Var.a;
        this.z = bs2Var.d;
        this.A = bs2Var.b;
        this.B = bs2Var.g;
        Object obj = bs2Var.e;
        wc0 wc0Var = obj instanceof wc0 ? (wc0) obj : null;
        if (wc0Var == null) {
            wc0.a.getClass();
            wc0Var = vc0.b;
        }
        this.E = wc0Var;
        this.F = bs2Var.c;
    }
}
