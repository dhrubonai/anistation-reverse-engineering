package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fv {
    public final uv c;
    public boolean e;
    public boolean f;
    public boolean h;
    public int i;
    public final ArrayList a = new ArrayList();
    public final f71 b = new f71();
    public vv d = vv.e;
    public ByteBuffer g = zv.a;

    public fv(i18 i18Var, o15 o15Var) {
        this.c = new uv(o15Var);
    }

    public final ByteBuffer a() {
        boolean z;
        ByteBuffer byteBuffer;
        boolean z2;
        boolean z3;
        boolean z4;
        f71 f71Var = this.b;
        boolean z5 = false;
        if (this.f) {
            z = true;
        } else {
            if (!this.e) {
                try {
                    f71Var.d(this.d);
                    this.e = true;
                } catch (yv e) {
                    throw oz1.b(e, "Error while configuring mixer");
                }
            }
            this.f = true;
            ListIterator listIterator = this.a.listIterator();
            while (listIterator.hasNext()) {
                ev evVar = (ev) listIterator.next();
                if (evVar.b == -1) {
                    hv hvVar = evVar.a;
                    if (hvVar.m) {
                        listIterator.remove();
                        this.i--;
                    } else {
                        try {
                            hvVar.j();
                            long j = hvVar.e.get();
                            if (j == -9223372036854775807L) {
                                this.f = false;
                            } else if (j == Long.MIN_VALUE) {
                                evVar.b = Integer.MIN_VALUE;
                                this.i--;
                            } else {
                                evVar.b = f71Var.a(hvVar.a, j);
                            }
                        } catch (yv e2) {
                            throw oz1.b(e2, "Unhandled format while adding source " + evVar.b);
                        }
                    }
                }
            }
            z = this.f;
        }
        if (!z) {
            return zv.a;
        }
        if (!this.b.e()) {
            ListIterator listIterator2 = this.a.listIterator();
            while (listIterator2.hasNext()) {
                ev evVar2 = (ev) listIterator2.next();
                int i = evVar2.b;
                f71 f71Var2 = this.b;
                f71Var2.c();
                if (f71Var2.a.indexOfKey(i) >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hv hvVar2 = evVar2.a;
                if (!z2) {
                    z3 = hvVar2.m;
                } else if (hvVar2.o()) {
                    f71 f71Var3 = this.b;
                    f71Var3.c();
                    long j2 = f71Var3.j;
                    SparseArray sparseArray = f71Var3.a;
                    String str = eq6.a;
                    if (sparseArray.indexOfKey(i) >= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    io3.A("Source not found.", z4);
                    f71Var3.j = Math.max(j2, ((e71) sparseArray.get(i)).a);
                    f71Var3.a.delete(i);
                    LinkedHashMap linkedHashMap = a61.a;
                    synchronized (a61.class) {
                    }
                    if (!f71Var3.k && f71Var3.e()) {
                        a61.a();
                        f71Var3.k = true;
                    }
                    evVar2.b = Integer.MIN_VALUE;
                    this.i--;
                    z3 = hvVar2.m;
                } else {
                    z3 = false;
                }
                if (z3) {
                    listIterator2.remove();
                }
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ev evVar3 = (ev) obj;
                int i3 = evVar3.b;
                try {
                    this.b.f(i3, evVar3.a.j());
                } catch (yv e3) {
                    throw oz1.b(e3, "AudioGraphInput (sourceId=" + i3 + ") reconfiguration");
                }
            }
        }
        if (!this.g.hasRemaining()) {
            f71 f71Var4 = this.b;
            f71Var4.c();
            if (f71Var4.e()) {
                byteBuffer = zv.a;
            } else {
                long j3 = f71Var4.i;
                if (f71Var4.a.size() == 0) {
                    j3 = Math.min(j3, f71Var4.j);
                }
                for (int i4 = 0; i4 < f71Var4.a.size(); i4++) {
                    j3 = Math.min(j3, ((e71) f71Var4.a.valueAt(i4)).a);
                }
                if (j3 <= f71Var4.h) {
                    byteBuffer = zv.a;
                } else {
                    d71 d71Var = f71Var4.e[0];
                    long min = Math.min(j3, d71Var.y);
                    ByteBuffer duplicate = ((ByteBuffer) d71Var.z).duplicate();
                    duplicate.position(((int) (f71Var4.h - d71Var.x)) * f71Var4.c.d).limit(((int) (min - d71Var.x)) * f71Var4.c.d);
                    ByteBuffer order = duplicate.slice().order(ByteOrder.nativeOrder());
                    if (min == d71Var.y) {
                        d71[] d71VarArr = f71Var4.e;
                        d71 d71Var2 = d71VarArr[1];
                        d71VarArr[0] = d71Var2;
                        d71VarArr[1] = f71Var4.b(d71Var2.y);
                    }
                    f71Var4.h = min;
                    f71Var4.g = Math.min(f71Var4.i, min + f71Var4.d);
                    order.remaining();
                    LinkedHashMap linkedHashMap2 = a61.a;
                    synchronized (a61.class) {
                    }
                    if (!f71Var4.k && f71Var4.e()) {
                        a61.a();
                        f71Var4.k = true;
                    }
                    byteBuffer = order;
                }
            }
            this.g = byteBuffer;
        }
        ByteBuffer byteBuffer2 = this.g;
        if (this.c.f()) {
            if (!this.g.hasRemaining() && this.i == 0 && this.b.e()) {
                z5 = true;
            }
            uv uvVar = this.c;
            if (z5) {
                uvVar.h();
            } else {
                uvVar.i(this.g);
            }
            byteBuffer2 = this.c.d();
        }
        byteBuffer2.position();
        byteBuffer2.remaining();
        LinkedHashMap linkedHashMap3 = a61.a;
        synchronized (a61.class) {
        }
        if (b() && !this.h) {
            a61.a();
            this.h = true;
        }
        return byteBuffer2;
    }

    public final boolean b() {
        boolean z;
        if (!this.g.hasRemaining() && this.i == 0 && this.b.e()) {
            z = true;
        } else {
            z = false;
        }
        uv uvVar = this.c;
        if (uvVar.f()) {
            z = uvVar.e();
        }
        if (z && !this.h) {
            a61.a();
            this.h = true;
        }
        return z;
    }

    public final hv c(qr1 qr1Var, ea2 ea2Var) {
        boolean z;
        if (ea2Var.M != -1) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        try {
            hv hvVar = new hv(this.d, qr1Var, ea2Var);
            if (Objects.equals(this.d, vv.e)) {
                vv vvVar = hvVar.a;
                this.d = vvVar;
                this.c.a(vvVar);
                uv uvVar = this.c;
                wv wvVar = new wv((byte) 0);
                wvVar.a = 0L;
                uvVar.b(wvVar.b());
                LinkedHashMap linkedHashMap = a61.a;
                synchronized (a61.class) {
                }
            }
            this.a.add(new ev(hvVar));
            this.i++;
            Integer.toHexString(hvVar.hashCode());
            LinkedHashMap linkedHashMap2 = a61.a;
            synchronized (a61.class) {
            }
            return hvVar;
        } catch (yv e) {
            throw oz1.b(e, "Error while registering input " + this.a.size());
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        dv dvVar = new dv((byte) 0);
        Iterator it = arrayList.iterator();
        it.getClass();
        r33 r33Var = new r33(it, dvVar);
        while (r33Var.hasNext()) {
            hv hvVar = ((ev) r33Var.next()).a;
            io3.B(!hvVar.m);
            hvVar.g.j();
            hvVar.h.j();
            hvVar.d.clear();
            hvVar.b.clear();
            hvVar.c.clear();
            hvVar.m = true;
            Integer.toHexString(hvVar.hashCode());
            LinkedHashMap linkedHashMap = a61.a;
            synchronized (a61.class) {
            }
        }
        this.a.clear();
        f71 f71Var = this.b;
        f71Var.a.clear();
        f71Var.b = 0;
        vv vvVar = vv.e;
        f71Var.c = vvVar;
        f71Var.d = -1;
        f71Var.e = new d71[0];
        f71Var.f = -9223372036854775807L;
        f71Var.g = -1L;
        f71Var.h = 0L;
        f71Var.i = Long.MAX_VALUE;
        f71Var.j = 0L;
        f71Var.k = false;
        a61.a();
        this.c.j();
        this.i = 0;
        this.g = zv.a;
        this.d = vvVar;
        this.h = false;
        a61.a();
    }
}
