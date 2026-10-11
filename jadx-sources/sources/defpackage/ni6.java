package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ni6 {
    public int A;
    public boolean B;
    public final Context a;
    public final ou0 b;
    public final boolean c;
    public final dn0 d;
    public final ki6 e;
    public final k46 f;
    public final long g;
    public final HandlerThread h;
    public final k46 i;
    public final ArrayList j;
    public final Object k;
    public final zp2 l;
    public final ArrayList m;
    public final t54 n;
    public final nv0 o;
    public final Object p;
    public final Object q;
    public final mm5 r;
    public final Object s;
    public final nw2 t;
    public final boolean u;
    public boolean v;
    public long w;
    public int x;
    public RuntimeException y;
    public int z;

    /* JADX WARN: Type inference failed for: r0v6, types: [mm5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, zp2] */
    public ni6(Context context, ou0 ou0Var, bi6 bi6Var, ys ysVar, i18 i18Var, fc1 fc1Var, ho0 ho0Var, nw2 nw2Var, t54 t54Var, ki6 ki6Var, kz kzVar, k46 k46Var, long j, LogSessionId logSessionId, boolean z, boolean z2) {
        LogSessionId logSessionId2;
        ys tpVar;
        this.a = context;
        this.b = ou0Var;
        this.d = new dn0((Object) ho0Var, (byte) 8);
        this.t = nw2Var;
        this.e = ki6Var;
        this.f = k46Var;
        this.g = j;
        this.n = t54Var;
        this.u = z;
        StringBuilder n = h11.n("Init ", Integer.toHexString(System.identityHashCode(this)), " [AndroidXMedia3/1.11.1] [");
        n.append(eq6.a);
        n.append("]");
        kb0.B("TransformerInternal", n.toString());
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        this.h = handlerThread;
        handlerThread.start();
        this.j = new ArrayList();
        Looper looper = handlerThread.getLooper();
        this.k = new Object();
        ?? obj = new Object();
        obj.x = new ArrayList();
        for (int i = 0; i < ou0Var.b.size(); i++) {
            ((ArrayList) obj.x).add(new ji6());
        }
        obj.y = new SparseArray();
        obj.z = new SparseBooleanArray();
        obj.A = new SparseIntArray();
        nw2 nw2Var2 = ou0Var.b;
        this.l = obj;
        if (!z2 && ysVar != null) {
            tpVar = ysVar;
            logSessionId2 = logSessionId;
        } else {
            logSessionId2 = logSessionId;
            tpVar = new tp(context, new c41(new rt3(context, (byte) 15)), logSessionId2);
        }
        int i2 = 0;
        while (i2 < nw2Var2.size()) {
            ys ysVar2 = tpVar;
            this.j.add(new qi5((rr1) nw2Var2.get(i2), ysVar2, new ex1(bi6Var.d, ou0Var.f), new mi6(this, i2, ou0Var, bi6Var, i18Var, fc1Var, kzVar, logSessionId2), looper));
            this.x++;
            i2++;
            logSessionId2 = logSessionId;
            tpVar = ysVar2;
        }
        this.c = this.x != nw2Var2.size();
        this.p = new Object();
        this.o = new nv0();
        this.q = new Object();
        this.r = new Object();
        this.s = new Object();
        this.m = new ArrayList();
        this.i = new k46(new Handler(looper, new jj1(this, (byte) 4)));
    }

    public final void a() {
        synchronized (this.s) {
            try {
                if (this.B) {
                    return;
                }
                g();
                this.i.d(null, 4, 1, 0).b();
                this.o.b();
                this.o.d();
                RuntimeException runtimeException = this.y;
                if (runtimeException == null) {
                } else {
                    throw runtimeException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni6.b():void");
    }

    public final void c(int i, oz1 oz1Var) {
        boolean z;
        t54 t54Var;
        ew2 ew2Var = new ew2(4);
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            qi5 qi5Var = (qi5) this.j.get(i2);
            qi5Var.h();
            ew2Var.d(qi5Var.i.g());
        }
        int i3 = 1;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.B;
        oz1 oz1Var2 = null;
        if (!z2) {
            synchronized (this.s) {
                this.B = true;
            }
            kb0.B("TransformerInternal", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + eq6.a + "] [" + cr3.b() + "]");
            for (int i4 = 0; i4 < this.m.size(); i4++) {
                try {
                    ((c95) this.m.get(i4)).o();
                } catch (RuntimeException e) {
                    if (oz1Var2 == null) {
                        oz1Var2 = oz1.d(e);
                        this.y = e;
                    }
                }
            }
            for (int i5 = 0; i5 < this.j.size(); i5++) {
                try {
                    ((qi5) this.j.get(i5)).release();
                } catch (RuntimeException e2) {
                    if (oz1Var2 == null) {
                        oz1Var2 = oz1.d(e2);
                        this.y = e2;
                    }
                }
            }
            try {
                t54Var = this.n;
            } catch (RuntimeException e3) {
                if (oz1Var2 == null) {
                    oz1 d = oz1.d(e3);
                    this.y = e3;
                    oz1Var2 = d;
                }
            } catch (p54 e4) {
                if (oz1Var2 == null) {
                    oz1Var2 = new oz1("Muxer error", e4, 7001, 0);
                }
            }
            if (i != 0) {
                if (i != 1) {
                    i3 = 2;
                    if (i != 2) {
                        ze0.m(qx1.h(i, "Unexpected end reason "));
                    }
                }
                t54Var.b(i3);
                k46 k46Var = this.i;
                HandlerThread handlerThread = this.h;
                Objects.requireNonNull(handlerThread);
                k46Var.f(new a92(handlerThread, (byte) 27));
            }
            i3 = 0;
            t54Var.b(i3);
            k46 k46Var2 = this.i;
            HandlerThread handlerThread2 = this.h;
            Objects.requireNonNull(handlerThread2);
            k46Var2.f(new a92(handlerThread2, (byte) 27));
        }
        if (z) {
            this.o.f();
            return;
        }
        if (oz1Var == null) {
            oz1Var = oz1Var2;
        }
        if (oz1Var != null) {
            if (z2) {
                kb0.P("TransformerInternal", "Export error after export ended", oz1Var);
                return;
            }
            io3.B(this.f.a.post(new ze((Object) this, (Object) ew2Var, (Object) oz1Var, (byte) 21)));
            return;
        }
        if (!z2) {
            io3.B(this.f.a.post(new sp5(this, ew2Var, (byte) 5)));
        }
    }

    public final void d(oz1 oz1Var) {
        synchronized (this.s) {
            try {
                if (this.B) {
                    kb0.P("TransformerInternal", "Export error after export ended", oz1Var);
                } else {
                    g();
                    this.i.d(oz1Var, 4, 2, 0).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int e(mm5 mm5Var) {
        int i;
        synchronized (this.q) {
            try {
                i = this.z;
                if (i == 2) {
                    mm5Var.x = this.A;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final void f() {
        g();
        this.i.j(1);
        synchronized (this.q) {
            this.z = 1;
            this.A = 0;
        }
        String str = eq6.a;
        LinkedHashMap linkedHashMap = a61.a;
        synchronized (a61.class) {
        }
    }

    public final void g() {
        io3.A("Internal thread is dead.", this.h.isAlive());
    }
}
