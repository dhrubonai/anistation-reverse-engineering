package y8;

import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u extends b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final s f11797f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f11798g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f11799h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f11800i;

    /* renamed from: b, reason: collision with root package name */
    public final k9.j f11801b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11802c;

    /* renamed from: d, reason: collision with root package name */
    public final s f11803d;

    /* renamed from: e, reason: collision with root package name */
    public long f11804e;

    static {
        Pattern pattern = s.f11790d;
        j.k("multipart/mixed");
        j.k("multipart/alternative");
        j.k("multipart/digest");
        j.k("multipart/parallel");
        f11797f = j.k("multipart/form-data");
        f11798g = new byte[]{58, 32};
        f11799h = new byte[]{13, 10};
        f11800i = new byte[]{45, 45};
    }

    public u(k9.j jVar, s sVar, List list) {
        r6.h0.u(jVar, "boundaryByteString");
        r6.h0.u(sVar, "type");
        this.f11801b = jVar;
        this.f11802c = list;
        Pattern pattern = s.f11790d;
        this.f11803d = j.k(sVar + "; boundary=" + jVar.j());
        this.f11804e = -1L;
    }

    @Override // y8.b0
    public final long a() {
        long j4 = this.f11804e;
        if (j4 == -1) {
            long d10 = d(null, true);
            this.f11804e = d10;
            return d10;
        }
        return j4;
    }

    @Override // y8.b0
    public final s b() {
        return this.f11803d;
    }

    @Override // y8.b0
    public final void c(k9.h hVar) {
        d(hVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(k9.h hVar, boolean z9) {
        k9.g gVar;
        k9.h hVar2;
        if (z9) {
            hVar2 = new k9.g();
            gVar = hVar2;
        } else {
            gVar = 0;
            hVar2 = hVar;
        }
        List list = this.f11802c;
        int size = list.size();
        long j4 = 0;
        int i10 = 0;
        while (true) {
            k9.j jVar = this.f11801b;
            byte[] bArr = f11800i;
            byte[] bArr2 = f11799h;
            if (i10 < size) {
                t tVar = (t) list.get(i10);
                o oVar = tVar.f11795a;
                r6.h0.q(hVar2);
                hVar2.p(bArr);
                hVar2.y(jVar);
                hVar2.p(bArr2);
                if (oVar != null) {
                    int length = oVar.f11770a.length / 2;
                    for (int i11 = 0; i11 < length; i11++) {
                        hVar2.B(oVar.c(i11)).p(f11798g).B(oVar.e(i11)).p(bArr2);
                    }
                }
                b0 b0Var = tVar.f11796b;
                s b10 = b0Var.b();
                if (b10 != null) {
                    hVar2.B("Content-Type: ").B(b10.f11792a).p(bArr2);
                }
                long a10 = b0Var.a();
                if (a10 != -1) {
                    hVar2.B("Content-Length: ").C(a10).p(bArr2);
                } else if (z9) {
                    r6.h0.q(gVar);
                    gVar.a();
                    return -1L;
                }
                hVar2.p(bArr2);
                if (z9) {
                    j4 += a10;
                } else {
                    b0Var.c(hVar2);
                }
                hVar2.p(bArr2);
                i10++;
            } else {
                r6.h0.q(hVar2);
                hVar2.p(bArr);
                hVar2.y(jVar);
                hVar2.p(bArr);
                hVar2.p(bArr2);
                if (z9) {
                    r6.h0.q(gVar);
                    long j10 = j4 + gVar.f6521b;
                    gVar.a();
                    return j10;
                }
                return j4;
            }
        }
    }
}
