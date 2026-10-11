package y8;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11733a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f11734b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f11735c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11736d;

    public h() {
        this.f11733a = true;
    }

    public final i a() {
        return new i(this.f11733a, this.f11736d, this.f11734b, this.f11735c);
    }

    public final void b(String... strArr) {
        boolean z9;
        r6.h0.u(strArr, "cipherSuites");
        if (this.f11733a) {
            if (strArr.length == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                this.f11734b = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public final void c(g... gVarArr) {
        r6.h0.u(gVarArr, "cipherSuites");
        if (this.f11733a) {
            ArrayList arrayList = new ArrayList(gVarArr.length);
            for (g gVar : gVarArr) {
                arrayList.add(gVar.f11729a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public final void d() {
        if (this.f11733a) {
            this.f11736d = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
    }

    public final void e(String... strArr) {
        boolean z9;
        r6.h0.u(strArr, "tlsVersions");
        if (this.f11733a) {
            if (strArr.length == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                this.f11735c = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public final void f(h0... h0VarArr) {
        if (this.f11733a) {
            ArrayList arrayList = new ArrayList(h0VarArr.length);
            for (h0 h0Var : h0VarArr) {
                arrayList.add(h0Var.f11743a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            e((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public h(i iVar) {
        this.f11733a = iVar.f11746a;
        this.f11734b = iVar.f11748c;
        this.f11735c = iVar.f11749d;
        this.f11736d = iVar.f11747b;
    }
}
