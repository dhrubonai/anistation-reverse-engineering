package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class f30 implements zv {
    public vv b;
    public vv c;
    public vv d;
    public vv e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public f30() {
        ByteBuffer byteBuffer = zv.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        vv vvVar = vv.e;
        this.d = vvVar;
        this.e = vvVar;
        this.b = vvVar;
        this.c = vvVar;
    }

    public vv a(vv vvVar) {
        if (vvVar.c == 2) {
            if (vvVar.a == -1) {
                return vv.e;
            }
            return vvVar;
        }
        throw new yv(vvVar);
    }

    @Override // defpackage.zv
    public boolean d() {
        if (this.h && this.g == zv.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zv
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.g;
        this.g = zv.a;
        return byteBuffer;
    }

    @Override // defpackage.zv
    public final void f(xv xvVar) {
        this.g = zv.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        b();
    }

    @Override // defpackage.zv
    public final vv h(vv vvVar) {
        this.d = vvVar;
        this.e = a(vvVar);
        if (isActive()) {
            return this.e;
        }
        return vv.e;
    }

    @Override // defpackage.zv
    public final void i() {
        this.h = true;
        c();
    }

    @Override // defpackage.zv
    public boolean isActive() {
        if (this.e != vv.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.zv
    public final void reset() {
        ByteBuffer byteBuffer = zv.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        vv vvVar = vv.e;
        this.d = vvVar;
        this.e = vvVar;
        this.b = vvVar;
        this.c = vvVar;
        k();
    }

    public void b() {
    }

    public void c() {
    }

    public void k() {
    }
}
