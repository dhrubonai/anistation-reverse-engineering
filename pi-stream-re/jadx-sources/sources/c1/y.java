package c1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public String f1952a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f1953b;

    /* renamed from: c, reason: collision with root package name */
    public String f1954c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.q0 f1955d = new androidx.lifecycle.q0();

    /* renamed from: e, reason: collision with root package name */
    public final b0 f1956e = new b0(0);

    /* renamed from: f, reason: collision with root package name */
    public final List f1957f = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public r6.o0 f1958g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1959h;

    /* renamed from: i, reason: collision with root package name */
    public final long f1960i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f1961j;

    /* renamed from: k, reason: collision with root package name */
    public final g0 f1962k;

    public y() {
        r6.m0 m0Var = r6.o0.f9505b;
        this.f1958g = r6.n1.f9497e;
        this.f1961j = new d0();
        this.f1962k = g0.f1702d;
        this.f1960i = -9223372036854775807L;
    }

    public final k0 a() {
        f0 f0Var;
        b0 b0Var = this.f1956e;
        b0Var.getClass();
        w7.b.u(true);
        Uri uri = this.f1953b;
        if (uri != null) {
            String str = this.f1954c;
            b0Var.getClass();
            f0Var = new f0(uri, str, null, this.f1957f, this.f1958g, this.f1959h, this.f1960i);
        } else {
            f0Var = null;
        }
        String str2 = this.f1952a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        androidx.lifecycle.q0 q0Var = this.f1955d;
        q0Var.getClass();
        a0 a0Var = new a0(q0Var);
        d0 d0Var = this.f1961j;
        d0Var.getClass();
        return new k0(str3, a0Var, f0Var, new e0(d0Var), n0.G, this.f1962k);
    }
}
