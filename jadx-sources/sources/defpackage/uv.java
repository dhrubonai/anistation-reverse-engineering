package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uv {
    public final nw2 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public vv d;
    public vv e;
    public boolean f;

    public uv(nw2 nw2Var) {
        this.a = nw2Var;
        vv vvVar = vv.e;
        this.d = vvVar;
        this.e = vvVar;
        this.f = false;
    }

    public final vv a(vv vvVar) {
        if (!vvVar.equals(vv.e)) {
            int i = 0;
            while (true) {
                nw2 nw2Var = this.a;
                if (i < nw2Var.size()) {
                    zv zvVar = (zv) nw2Var.get(i);
                    vv h = zvVar.h(vvVar);
                    if (zvVar.isActive()) {
                        io3.B(!h.equals(vv.e));
                        vvVar = h;
                    }
                    i++;
                } else {
                    this.e = vvVar;
                    return vvVar;
                }
            }
        } else {
            throw new yv(vvVar);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, wv] */
    public final void b(xv xvVar) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = this.e;
        this.f = false;
        int i = 0;
        while (true) {
            nw2 nw2Var = this.a;
            if (i >= nw2Var.size()) {
                break;
            }
            zv zvVar = (zv) nw2Var.get(i);
            zvVar.f(xvVar);
            if (zvVar.isActive()) {
                ?? obj = new Object();
                long j = xvVar.a;
                obj.a = j;
                obj.b = xvVar.b;
                obj.c = xvVar.c;
                obj.a = zvVar.j(j);
                xvVar = obj.b();
                arrayList.add(zvVar);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = ((zv) arrayList.get(i2)).e();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public final ByteBuffer d() {
        if (!f()) {
            return zv.a;
        }
        ByteBuffer byteBuffer = this.c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(zv.a);
        return this.c[c()];
    }

    public final boolean e() {
        if (this.f && ((zv) this.b.get(c())).d() && !this.c[c()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv)) {
            return false;
        }
        nw2 nw2Var = ((uv) obj).a;
        nw2 nw2Var2 = this.a;
        if (nw2Var2.size() != nw2Var.size()) {
            return false;
        }
        for (int i = 0; i < nw2Var2.size(); i++) {
            if (nw2Var2.get(i) != nw2Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return !this.b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        boolean z2;
        for (boolean z3 = true; z3; z3 = z) {
            z = false;
            for (int i = 0; i <= c(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    zv zvVar = (zv) arrayList.get(i);
                    if (zvVar.d()) {
                        if (!this.c[i].hasRemaining() && i < c()) {
                            ((zv) arrayList.get(i + 1)).i();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.c[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = zv.a;
                        }
                        long remaining = byteBuffer2.remaining();
                        zvVar.g(byteBuffer2);
                        this.c[i] = zvVar.e();
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        z |= z2;
                    }
                }
            }
        }
    }

    public final void h() {
        if (f() && !this.f) {
            this.f = true;
            ((zv) this.b.get(0)).i();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(ByteBuffer byteBuffer) {
        if (f() && !this.f) {
            g(byteBuffer);
        }
    }

    public final void j() {
        int i = 0;
        while (true) {
            nw2 nw2Var = this.a;
            if (i < nw2Var.size()) {
                zv zvVar = (zv) nw2Var.get(i);
                zvVar.f(xv.d);
                zvVar.reset();
                i++;
            } else {
                this.b.clear();
                this.c = new ByteBuffer[0];
                vv vvVar = vv.e;
                this.d = vvVar;
                this.e = vvVar;
                this.f = false;
                return;
            }
        }
    }
}
