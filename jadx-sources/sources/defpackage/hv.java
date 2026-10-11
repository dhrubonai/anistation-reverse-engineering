package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hv implements bi2 {
    public final vv a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final ConcurrentLinkedQueue d;
    public final AtomicLong e;
    public final qo5 f;
    public uv g;
    public uv h;
    public boolean i;
    public boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r3v8, types: [qo5, java.lang.Object] */
    public hv(vv vvVar, qr1 qr1Var, ea2 ea2Var) {
        boolean z;
        vv vvVar2 = new vv(ea2Var);
        if (vvVar2.c == -1 || vvVar2.a == -1 || vvVar2.b == -1) {
            z = false;
        } else {
            z = true;
        }
        io3.m(vvVar2, z);
        this.b = new ConcurrentLinkedQueue();
        ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            q61 q61Var = new q61(2);
            q61Var.B = order;
            this.b.add(q61Var);
        }
        this.c = new ConcurrentLinkedQueue();
        this.d = new ConcurrentLinkedQueue();
        ?? obj = new Object();
        vv vvVar3 = vv.e;
        obj.d = vvVar3;
        obj.e = vvVar3;
        obj.b = -9223372036854775807L;
        obj.c = -9223372036854775807L;
        ByteBuffer byteBuffer = zv.a;
        obj.f = byteBuffer;
        obj.g = byteBuffer;
        obj.h = byteBuffer;
        this.f = obj;
        uv uvVar = new uv(qr1Var.h);
        this.g = uvVar;
        vv a = uvVar.a(vvVar2);
        uv uvVar2 = this.g;
        xv xvVar = xv.d;
        uvVar2.b(xvVar);
        uv i2 = i(qr1Var, ea2Var.m, a, vvVar, obj);
        this.h = i2;
        i2.b(xvVar);
        vv vvVar4 = this.h.d;
        this.a = vvVar4;
        io3.m(vvVar4, vvVar4.c == 2);
        this.e = new AtomicLong(-9223372036854775807L);
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [ew2, jw2] */
    public static uv i(qr1 qr1Var, fy3 fy3Var, vv vvVar, vv vvVar2, qo5 qo5Var) {
        int i;
        ?? ew2Var = new ew2(4);
        ew2Var.c(qo5Var);
        qr1Var.getClass();
        ew2Var.d(qr1Var.f.a);
        int i2 = vvVar2.a;
        int i3 = vvVar2.b;
        if (i2 != -1) {
            boolean z = false;
            xu5 xu5Var = new xu5(false);
            if (i2 == -1 || i2 > 0) {
                z = true;
            }
            io3.n(z);
            xu5Var.c = i2;
            ew2Var.c(xu5Var);
        }
        if (i3 == 1 || i3 == 2) {
            zj0 zj0Var = new zj0();
            ak0 a = ak0.a(1, i3);
            int i4 = a.a;
            SparseArray sparseArray = zj0Var.i;
            sparseArray.put(i4, a);
            ak0 a2 = ak0.a(2, i3);
            sparseArray.put(a2.a, a2);
            ew2Var.c(zj0Var);
        }
        uv uvVar = new uv(ew2Var.g());
        vv a3 = uvVar.a(vvVar);
        if ((i2 != -1 && i2 != a3.a) || ((i3 != -1 && i3 != a3.b) || ((i = vvVar2.c) != -1 && i != a3.c))) {
            throw new yv("Audio can not be modified to match downstream format", vvVar);
        }
        return uvVar;
    }

    @Override // defpackage.b95
    public final q61 b() {
        io3.B(!this.m);
        if (!this.d.isEmpty()) {
            return null;
        }
        return (q61) this.b.peek();
    }

    @Override // defpackage.ge4
    public final void c(qr1 qr1Var, long j, ea2 ea2Var, boolean z) {
        boolean z2 = true;
        io3.B(!this.m);
        if (ea2Var == null) {
            if (j == -9223372036854775807L) {
                z2 = false;
            }
            io3.A("Could not generate silent audio because duration is unknown.", z2);
        } else {
            io3.B(qy3.i(ea2Var.p));
            vv vvVar = new vv(ea2Var);
            if (vvVar.c == -1 || vvVar.a == -1 || vvVar.b == -1) {
                z2 = false;
            }
            io3.A(vvVar, z2);
        }
        this.d.add(new gv(qr1Var, j, ea2Var, z));
    }

    @Override // defpackage.b95
    public final boolean g() {
        io3.B(!this.m);
        io3.B(this.d.isEmpty());
        q61 q61Var = (q61) this.b.remove();
        this.c.add(q61Var);
        this.e.compareAndSet(-9223372036854775807L, q61Var.D);
        Integer.toHexString(hashCode());
        LinkedHashMap linkedHashMap = a61.a;
        synchronized (a61.class) {
        }
        return true;
    }

    public final ByteBuffer j() {
        boolean n;
        ByteBuffer d;
        fy3 fy3Var;
        boolean z;
        vv vvVar;
        boolean z2;
        io3.B(!this.m);
        if (!this.i) {
            d = zv.a;
        } else {
            if (this.g.f()) {
                uv uvVar = this.g;
                while (true) {
                    ByteBuffer l = l();
                    if (!l.hasRemaining()) {
                        if (n()) {
                            uvVar.h();
                        }
                    } else {
                        uvVar.i(l);
                        if (l.hasRemaining()) {
                            break;
                        }
                    }
                }
            }
            if (!this.h.f()) {
                d = k();
            } else {
                uv uvVar2 = this.h;
                while (true) {
                    ByteBuffer k = k();
                    if (!k.hasRemaining()) {
                        if (this.g.f()) {
                            n = this.g.e();
                        } else {
                            n = n();
                        }
                        if (n) {
                            uvVar2.h();
                        }
                    } else {
                        uvVar2.i(k);
                        if (k.hasRemaining()) {
                            break;
                        }
                    }
                }
                d = this.h.d();
            }
        }
        if (d.hasRemaining()) {
            Integer.toHexString(hashCode());
            d.remaining();
            LinkedHashMap linkedHashMap = a61.a;
            synchronized (a61.class) {
            }
            return d;
        }
        if (!m() && !this.d.isEmpty()) {
            qo5 qo5Var = this.f;
            vv vvVar2 = this.a;
            gv gvVar = (gv) this.d.poll();
            gvVar.getClass();
            long j = gvVar.b;
            qr1 qr1Var = gvVar.a;
            this.l = gvVar.d;
            ea2 ea2Var = gvVar.c;
            if (ea2Var != null) {
                this.k = j;
                vvVar = new vv(ea2Var);
                fy3Var = ea2Var.m;
                z = false;
            } else {
                if (qr1Var.f.a.isEmpty()) {
                    this.k = qr1Var.b(j);
                } else {
                    this.k = j;
                }
                this.e.compareAndSet(-9223372036854775807L, 0L);
                fy3Var = null;
                z = true;
                vvVar = vvVar2;
            }
            long j2 = this.k;
            if (j2 < 0 && j2 != -9223372036854775807L) {
                z2 = false;
            } else {
                z2 = true;
            }
            io3.n(z2);
            qo5Var.c = j2;
            if (this.i) {
                uv uvVar3 = new uv(qr1Var.h);
                this.g = uvVar3;
                this.h = i(qr1Var, fy3Var, uvVar3.a(vvVar), vvVar2, qo5Var);
            }
            wv wvVar = new wv((byte) 0);
            wvVar.a = 0L;
            xv b = wvVar.b();
            this.g.b(b);
            this.h.b(b);
            this.j = false;
            this.i = true;
            if (z) {
                this.g.j();
                this.h.h();
            }
        }
        if (!this.n && o()) {
            Integer.toHexString(hashCode());
            LinkedHashMap linkedHashMap2 = a61.a;
            synchronized (a61.class) {
            }
            this.n = true;
        }
        return zv.a;
    }

    public final ByteBuffer k() {
        if (this.g.f()) {
            return this.g.d();
        }
        return l();
    }

    public final ByteBuffer l() {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            q61 q61Var = (q61) concurrentLinkedQueue.peek();
            if (q61Var != null) {
                boolean d = q61Var.d(4);
                this.j = d;
                ConcurrentLinkedQueue concurrentLinkedQueue2 = this.b;
                if (d) {
                    q61 q61Var2 = (q61) concurrentLinkedQueue.remove();
                    q61Var2.f();
                    q61Var2.D = 0L;
                    concurrentLinkedQueue2.add(q61Var2);
                    return zv.a;
                }
                ByteBuffer byteBuffer = q61Var.B;
                byteBuffer.getClass();
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer;
                }
                q61 q61Var3 = (q61) concurrentLinkedQueue.remove();
                q61Var3.f();
                q61Var3.D = 0L;
                concurrentLinkedQueue2.add(q61Var3);
            } else {
                return zv.a;
            }
        }
    }

    public final boolean m() {
        if (this.i) {
            if (this.c.isEmpty()) {
                if (!this.h.f() || this.h.e()) {
                    if (this.g.f() && !this.g.e()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.j && this.d.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean o() {
        if (this.m) {
            return true;
        }
        if (m() || !this.d.isEmpty()) {
            return false;
        }
        if (this.k != -9223372036854775807L) {
            return this.l;
        }
        return this.j;
    }
}
