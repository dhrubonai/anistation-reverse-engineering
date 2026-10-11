package androidx.lifecycle;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class r0 extends i7.h implements h7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, int i10) {
        super(0);
        this.f1138a = i10;
        this.f1139b = obj;
    }

    @Override // h7.a
    public final Object a() {
        switch (this.f1138a) {
            case 0:
                c1 c1Var = (c1) this.f1139b;
                r6.h0.u(c1Var, "<this>");
                return (t0) new a1(c1Var, new androidx.fragment.app.v0(1)).b(t0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
            case 1:
                return b();
            case 2:
                return b();
            default:
                return b();
        }
    }

    public final List b() {
        int i10 = this.f1138a;
        Object obj = this.f1139b;
        switch (i10) {
            case 1:
                return (List) obj;
            case 2:
                try {
                    return (List) ((h7.a) obj).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return x6.o.f11318a;
                }
            default:
                y8.n nVar = ((c9.k) obj).f2141e;
                r6.h0.q(nVar);
                List<Certificate> a10 = nVar.a();
                ArrayList arrayList = new ArrayList(x6.j.o0(a10));
                for (Certificate certificate : a10) {
                    r6.h0.r(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
        }
    }
}
