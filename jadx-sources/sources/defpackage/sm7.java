package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sm7 extends ph2 {
    public static final zk3 G = new zk3("CastClient", null);
    public static final rt3 H = new rt3("Cast.API_CXLESS", new qa7(3), yj7.a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final m25 D;
    public final List E;
    public byte F;
    public final pm7 k;
    public h15 l;
    public boolean m;
    public boolean n;
    public p76 o;
    public p76 p;
    public final AtomicLong q;
    public final Object r;
    public final Object s;
    public mr t;
    public String u;
    public double v;
    public boolean w;
    public int x;
    public int y;
    public kk7 z;

    public sm7(Context context, ih0 ih0Var) {
        super(context, H, ih0Var, oh2.c);
        this.k = new pm7(this);
        this.r = new Object();
        this.s = new Object();
        this.E = Collections.synchronizedList(new ArrayList());
        this.D = ih0Var.c;
        this.A = ih0Var.b;
        this.B = new HashMap();
        this.C = new HashMap();
        this.q = new AtomicLong(0L);
        this.F = (byte) 1;
        m();
    }

    public final void e(int i) {
        synchronized (this.s) {
            try {
                p76 p76Var = this.p;
                if (p76Var == null) {
                    return;
                }
                if (i == 0) {
                    p76Var.b(new Status(0, null, null, null));
                } else {
                    p76Var.a(new bp(new Status(i, null, null, null)));
                }
                this.p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(int i, long j) {
        p76 p76Var;
        HashMap hashMap = this.B;
        synchronized (hashMap) {
            Long valueOf = Long.valueOf(j);
            p76Var = (p76) hashMap.get(valueOf);
            hashMap.remove(valueOf);
        }
        if (p76Var != null) {
            if (i == 0) {
                p76Var.b(null);
            } else {
                p76Var.a(new bp(new Status(i, null, null, null)));
            }
        }
    }

    public final Handler g() {
        h15 h15Var = this.l;
        if (h15Var == null) {
            h15 h15Var2 = new h15(this.g, (byte) 4);
            this.l = h15Var2;
            return h15Var2;
        }
        return h15Var;
    }

    public final void h(ig7 ig7Var) {
        qi3 qi3Var = (qi3) c(ig7Var, "castDeviceControllerListenerKey").c;
        a34.y(qi3Var, "Key must not be null");
        uh2 uh2Var = this.j;
        uh2Var.getClass();
        p76 p76Var = new p76();
        uh2Var.b(p76Var, 8415, this);
        fb7 fb7Var = new fb7(new nb7(qi3Var, p76Var), uh2Var.F.get(), this);
        h15 h15Var = uh2Var.J;
        h15Var.sendMessage(h15Var.obtainMessage(13, fb7Var));
    }

    public final void i() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap hashMap = this.C;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }

    public final void j() {
        a34.A("Not connected to device", k());
    }

    public final boolean k() {
        if (this.F == 3) {
            return true;
        }
        return false;
    }

    public final void l(int i) {
        synchronized (this.r) {
            try {
                p76 p76Var = this.o;
                if (p76Var != null) {
                    p76Var.a(new bp(new Status(i, null, null, null)));
                }
                this.o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        CastDevice castDevice = this.A;
        mm5 mm5Var = castDevice.F;
        if (!mm5Var.a(2048) && mm5Var.a(4) && !mm5Var.a(1)) {
            "Chromecast Audio".equals(castDevice.B);
        }
    }
}
