package y8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f11744e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f11745f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11746a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11747b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f11748c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f11749d;

    static {
        g gVar = g.f11726r;
        g gVar2 = g.f11727s;
        g gVar3 = g.f11728t;
        g gVar4 = g.f11721l;
        g gVar5 = g.f11723n;
        g gVar6 = g.f11722m;
        g gVar7 = g.o;
        g gVar8 = g.f11725q;
        g gVar9 = g.f11724p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f11719j, g.f11720k, g.f11717h, g.f11718i, g.f11715f, g.f11716g, g.f11714e};
        h hVar = new h();
        hVar.c((g[]) Arrays.copyOf(gVarArr, 9));
        h0 h0Var = h0.TLS_1_3;
        h0 h0Var2 = h0.TLS_1_2;
        hVar.f(h0Var, h0Var2);
        hVar.d();
        hVar.a();
        h hVar2 = new h();
        hVar2.c((g[]) Arrays.copyOf(gVarArr2, 16));
        hVar2.f(h0Var, h0Var2);
        hVar2.d();
        f11744e = hVar2.a();
        h hVar3 = new h();
        hVar3.c((g[]) Arrays.copyOf(gVarArr2, 16));
        hVar3.f(h0Var, h0Var2, h0.TLS_1_1, h0.TLS_1_0);
        hVar3.d();
        hVar3.a();
        f11745f = new i(false, false, null, null);
    }

    public i(boolean z9, boolean z10, String[] strArr, String[] strArr2) {
        this.f11746a = z9;
        this.f11747b = z10;
        this.f11748c = strArr;
        this.f11749d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f11748c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(g.f11711b.x(str));
            }
            return x6.m.x0(arrayList);
        }
        return null;
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f11746a) {
            return false;
        }
        String[] strArr = this.f11749d;
        if (strArr != null && !z8.b.i(strArr, sSLSocket.getEnabledProtocols(), y6.a.f11633a)) {
            return false;
        }
        String[] strArr2 = this.f11748c;
        if (strArr2 != null && !z8.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), g.f11712c)) {
            return false;
        }
        return true;
    }

    public final List c() {
        String[] strArr = this.f11749d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(j.i(str));
            }
            return x6.m.x0(arrayList);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z9 = iVar.f11746a;
        boolean z10 = this.f11746a;
        if (z10 != z9) {
            return false;
        }
        if (z10 && (!Arrays.equals(this.f11748c, iVar.f11748c) || !Arrays.equals(this.f11749d, iVar.f11749d) || this.f11747b != iVar.f11747b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        if (this.f11746a) {
            int i11 = 0;
            String[] strArr = this.f11748c;
            if (strArr != null) {
                i10 = Arrays.hashCode(strArr);
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String[] strArr2 = this.f11749d;
            if (strArr2 != null) {
                i11 = Arrays.hashCode(strArr2);
            }
            return ((i12 + i11) * 31) + (!this.f11747b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f11746a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f11747b + ')';
    }
}
