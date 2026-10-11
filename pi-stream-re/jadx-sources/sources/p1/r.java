package p1;

import d2.f0;
import d2.g0;
import f1.b0;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r implements g0 {

    /* renamed from: g, reason: collision with root package name */
    public static final c1.v f8491g = new c1.v(a3.g.k("application/id3"));

    /* renamed from: h, reason: collision with root package name */
    public static final c1.v f8492h = new c1.v(a3.g.k("application/x-emsg"));

    /* renamed from: a, reason: collision with root package name */
    public final m2.b f8493a = new m2.b(1);

    /* renamed from: b, reason: collision with root package name */
    public final g0 f8494b;

    /* renamed from: c, reason: collision with root package name */
    public final c1.v f8495c;

    /* renamed from: d, reason: collision with root package name */
    public c1.v f8496d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f8497e;

    /* renamed from: f, reason: collision with root package name */
    public int f8498f;

    public r(g0 g0Var, int i10) {
        this.f8494b = g0Var;
        if (i10 != 1) {
            if (i10 == 3) {
                this.f8495c = f8492h;
            } else {
                throw new IllegalArgumentException(a3.g.n("Unknown metadataType: ", i10));
            }
        } else {
            this.f8495c = f8491g;
        }
        this.f8497e = new byte[0];
        this.f8498f = 0;
    }

    @Override // d2.g0
    public final int a(c1.l lVar, int i10, boolean z9) {
        int i11 = this.f8498f + i10;
        byte[] bArr = this.f8497e;
        if (bArr.length < i11) {
            this.f8497e = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int p3 = lVar.p(this.f8497e, this.f8498f, i10);
        if (p3 == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        this.f8498f += p3;
        return p3;
    }

    @Override // d2.g0
    public final void b(c1.v vVar) {
        this.f8496d = vVar;
        this.f8494b.b(this.f8495c);
    }

    @Override // d2.g0
    public final int c(c1.l lVar, int i10, boolean z9) {
        return a(lVar, i10, z9);
    }

    @Override // d2.g0
    public final void d(long j4, int i10, int i11, int i12, f0 f0Var) {
        boolean z9;
        this.f8496d.getClass();
        int i13 = this.f8498f - i12;
        f1.t tVar = new f1.t(Arrays.copyOfRange(this.f8497e, i13 - i11, i13));
        byte[] bArr = this.f8497e;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.f8498f = i12;
        String str = this.f8496d.f1935m;
        c1.v vVar = this.f8495c;
        if (!b0.a(str, vVar.f1935m)) {
            if ("application/x-emsg".equals(this.f8496d.f1935m)) {
                this.f8493a.getClass();
                n2.a g12 = m2.b.g1(tVar);
                c1.v b10 = g12.b();
                String str2 = vVar.f1935m;
                if (b10 != null && b0.a(str2, b10.f1935m)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    f1.o.f("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", str2, g12.b()));
                    return;
                } else {
                    byte[] c6 = g12.c();
                    c6.getClass();
                    tVar = new f1.t(c6);
                }
            } else {
                f1.o.f("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f8496d.f1935m);
                return;
            }
        }
        int i14 = tVar.f3860c - tVar.f3859b;
        this.f8494b.f(i14, tVar);
        this.f8494b.d(j4, i10, i14, i12, f0Var);
    }

    @Override // d2.g0
    public final void e(int i10, int i11, f1.t tVar) {
        int i12 = this.f8498f + i10;
        byte[] bArr = this.f8497e;
        if (bArr.length < i12) {
            this.f8497e = Arrays.copyOf(bArr, (i12 / 2) + i12);
        }
        tVar.d(this.f8497e, this.f8498f, i10);
        this.f8498f += i10;
    }

    @Override // d2.g0
    public final void f(int i10, f1.t tVar) {
        e(i10, 0, tVar);
    }
}
