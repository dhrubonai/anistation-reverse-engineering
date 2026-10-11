package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xu5 implements zv {
    public final boolean b;
    public int c;
    public float d = 1.0f;
    public float e = 1.0f;
    public vv f;
    public vv g;
    public vv h;
    public vv i;
    public boolean j;
    public wu5 k;
    public ByteBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public xu5(boolean z) {
        vv vvVar = vv.e;
        this.f = vvVar;
        this.g = vvVar;
        this.h = vvVar;
        this.i = vvVar;
        ByteBuffer byteBuffer = zv.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        this.c = -1;
        this.b = z;
    }

    @Override // defpackage.zv
    public final boolean d() {
        boolean z;
        if (this.p) {
            wu5 wu5Var = this.k;
            if (wu5Var != null) {
                if (wu5Var.k >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                io3.B(z);
                if (wu5Var.i.o() * wu5Var.k * wu5Var.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.zv
    public final ByteBuffer e() {
        boolean z;
        wu5 wu5Var = this.k;
        if (wu5Var != null) {
            uu5 uu5Var = wu5Var.i;
            int i = wu5Var.b;
            boolean z2 = true;
            if (wu5Var.k >= 0) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
            int o = uu5Var.o() * wu5Var.k * i;
            if (o > 0) {
                if (this.l.capacity() < o) {
                    this.l = ByteBuffer.allocateDirect(o).order(ByteOrder.nativeOrder());
                } else {
                    this.l.clear();
                }
                ByteBuffer byteBuffer = this.l;
                if (wu5Var.k < 0) {
                    z2 = false;
                }
                io3.B(z2);
                int min = Math.min(byteBuffer.remaining() / (uu5Var.o() * i), wu5Var.k);
                uu5Var.c(min, byteBuffer);
                wu5Var.k -= min;
                System.arraycopy(uu5Var.h(), min * i, uu5Var.h(), 0, wu5Var.k * i);
                this.l.flip();
                this.o += o;
                this.m = this.l;
            }
        }
        ByteBuffer byteBuffer2 = this.m;
        this.m = zv.a;
        return byteBuffer2;
    }

    @Override // defpackage.zv
    public final void f(xv xvVar) {
        boolean z;
        if (isActive()) {
            vv vvVar = this.f;
            this.h = vvVar;
            vv vvVar2 = this.g;
            this.i = vvVar2;
            if (this.j) {
                int i = vvVar.a;
                int i2 = vvVar.b;
                float f = this.d;
                float f2 = this.e;
                int i3 = vvVar2.a;
                if (vvVar.c == 4) {
                    z = true;
                } else {
                    z = false;
                }
                this.k = new wu5(i, i2, f, f2, i3, z);
            } else {
                wu5 wu5Var = this.k;
                if (wu5Var != null) {
                    wu5Var.j = 0;
                    wu5Var.k = 0;
                    wu5Var.l = 0;
                    wu5Var.m = 0;
                    wu5Var.n = 0;
                    wu5Var.o = 0;
                    wu5Var.p = 0;
                    wu5Var.q = 0.0d;
                    wu5Var.i.flush();
                }
            }
        }
        this.m = zv.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.zv
    public final void g(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        wu5 wu5Var = this.k;
        wu5Var.getClass();
        this.n += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i = wu5Var.b;
        uu5 uu5Var = wu5Var.i;
        int o = remaining / (uu5Var.o() * i);
        uu5Var.p(o);
        uu5Var.a(remaining, byteBuffer);
        wu5Var.j += o;
        wu5Var.b();
    }

    @Override // defpackage.zv
    public final vv h(vv vvVar) {
        int i = vvVar.c;
        if (i != 2 && i != 4) {
            throw new yv(vvVar);
        }
        int i2 = this.c;
        if (i2 == -1) {
            i2 = vvVar.a;
        }
        this.f = vvVar;
        vv vvVar2 = new vv(i2, vvVar.b, i);
        this.g = vvVar2;
        this.j = true;
        return vvVar2;
    }

    @Override // defpackage.zv
    public final void i() {
        wu5 wu5Var = this.k;
        if (wu5Var != null) {
            int i = wu5Var.j;
            float f = wu5Var.c;
            float f2 = wu5Var.d;
            double d = f / f2;
            int i2 = wu5Var.k + ((int) (((((((i - r6) / d) + wu5Var.o) + wu5Var.q) + wu5Var.l) / (wu5Var.e * f2)) + 0.5d));
            wu5Var.q = 0.0d;
            uu5 uu5Var = wu5Var.i;
            int i3 = wu5Var.h * 2;
            uu5Var.p(i3 + i);
            uu5Var.d(i * wu5Var.b, i3);
            wu5Var.j = i3 + wu5Var.j;
            wu5Var.b();
            if (wu5Var.k > i2) {
                wu5Var.k = Math.max(i2, 0);
            }
            wu5Var.j = 0;
            wu5Var.o = 0;
            wu5Var.l = 0;
        }
        this.p = true;
    }

    @Override // defpackage.zv
    public final boolean isActive() {
        if (this.g.a != -1) {
            if (this.b || Math.abs(this.d - 1.0f) >= 1.0E-4f || Math.abs(this.e - 1.0f) >= 1.0E-4f || this.g.a != this.f.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.zv
    public final long j(long j) {
        if (this.o >= 1024) {
            long j2 = this.n;
            this.k.getClass();
            long o = j2 - (r2.i.o() * (r2.j * r2.b));
            int i = this.i.a;
            int i2 = this.h.a;
            long j3 = this.o;
            if (i == i2) {
                return eq6.e0(j, j3, o, RoundingMode.DOWN);
            }
            return eq6.e0(j, j3 * i2, o * i, RoundingMode.DOWN);
        }
        return (long) (j / this.d);
    }

    @Override // defpackage.zv
    public final void reset() {
        this.d = 1.0f;
        this.e = 1.0f;
        vv vvVar = vv.e;
        this.f = vvVar;
        this.g = vvVar;
        this.h = vvVar;
        this.i = vvVar;
        ByteBuffer byteBuffer = zv.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        this.c = -1;
        this.j = false;
        this.k = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
