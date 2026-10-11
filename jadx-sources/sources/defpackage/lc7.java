package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lc7 {
    public static final zk3 v = new zk3("SessionFlowSummary", null);
    public static final String w = "22.3.1";
    public static long x = System.currentTimeMillis();
    public final kv7 f;
    public final String g;
    public final long i;
    public gi0 j;
    public String k;
    public String l;
    public e60 m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public int u;
    public final cf3 a = new cf3((byte) 1);
    public final List b = Collections.synchronizedList(new ArrayList());
    public final List c = Collections.synchronizedList(new ArrayList());
    public final List d = Collections.synchronizedList(new ArrayList());
    public final Map e = Collections.synchronizedMap(new HashMap());
    public int t = 0;
    public final long h = System.currentTimeMillis();

    public lc7(kv7 kv7Var, String str) {
        this.f = kv7Var;
        this.g = str;
        long j = x;
        x = 1 + j;
        this.i = j;
    }

    public final void a(gi0 gi0Var) {
        if (gi0Var == null) {
            b(2);
            return;
        }
        a34.s();
        CastDevice castDevice = gi0Var.k;
        if (castDevice == null) {
            b(3);
            return;
        }
        this.j = gi0Var;
        String str = this.l;
        String str2 = castDevice.I;
        if (str == null) {
            this.l = str2;
            this.n = castDevice.B;
            this.t = castDevice.f();
            oc7 d = castDevice.d();
            if (d != null) {
                this.o = d.A;
                this.p = d.B;
                this.q = d.C;
                this.r = d.D;
                this.s = d.E;
            }
            gi0Var.c();
            return;
        }
        if (!TextUtils.equals(str, str2)) {
            b(5);
        }
    }

    public final void b(int i) {
        Integer valueOf = Integer.valueOf(i - 1);
        Map map = this.e;
        pf7 pf7Var = (pf7) map.get(valueOf);
        if (pf7Var == null) {
            pf7 pf7Var2 = new pf7(new xk3(i));
            pf7Var2.c = this.h;
            map.put(valueOf, pf7Var2);
        } else {
            pf7Var.d.incrementAndGet();
            pf7Var.b = System.currentTimeMillis();
        }
    }
}
