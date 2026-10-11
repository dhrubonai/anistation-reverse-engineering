package p1;

import android.net.Uri;
import f1.y;
import h3.g0;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k1.i0;
import r6.m0;
import r6.n1;
import r6.o0;

/* loaded from: classes.dex */
public final class l extends w1.n {

    /* renamed from: d0, reason: collision with root package name */
    public static final AtomicInteger f8460d0 = new AtomicInteger();
    public final int B;
    public final int C;
    public final Uri D;
    public final boolean E;
    public final int F;
    public final h1.h G;
    public final h1.l H;
    public final m I;
    public final boolean J;
    public final boolean K;
    public final y L;
    public final k M;
    public final List N;
    public final c1.p O;
    public final q2.j P;
    public final f1.t Q;
    public final boolean R;
    public final boolean S;
    public final long T;
    public m U;
    public t V;
    public int W;
    public boolean X;
    public volatile boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public o0 f8461a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f8462b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f8463c0;

    public l(k kVar, h1.h hVar, h1.l lVar, c1.v vVar, boolean z9, h1.h hVar2, h1.l lVar2, boolean z10, Uri uri, List list, int i10, Object obj, long j4, long j10, long j11, int i11, boolean z11, int i12, boolean z12, boolean z13, y yVar, long j12, c1.p pVar, m mVar, q2.j jVar, f1.t tVar, boolean z14, i0 i0Var) {
        super(hVar, lVar, vVar, i10, obj, j4, j10, j11);
        this.R = z9;
        this.F = i11;
        this.f8463c0 = z11;
        this.C = i12;
        this.H = lVar2;
        this.G = hVar2;
        this.X = lVar2 != null;
        this.S = z10;
        this.D = uri;
        this.J = z13;
        this.L = yVar;
        this.T = j12;
        this.K = z12;
        this.M = kVar;
        this.N = list;
        this.O = pVar;
        this.I = mVar;
        this.P = jVar;
        this.Q = tVar;
        this.E = z14;
        m0 m0Var = o0.f9505b;
        this.f8461a0 = n1.f9497e;
        this.B = f8460d0.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i10;
        if (j5.a.g0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i10 = byteArray.length - 16;
        } else {
            i10 = 0;
        }
        System.arraycopy(byteArray, i10, bArr, (16 - byteArray.length) + i10, byteArray.length - i10);
        return bArr;
    }

    @Override // w1.n
    public final boolean b() {
        throw null;
    }

    @Override // z1.l
    public final void c() {
        m mVar;
        boolean z9;
        this.V.getClass();
        if (this.U == null && (mVar = this.I) != null) {
            d2.p c6 = ((b) mVar).f8424a.c();
            if (!(c6 instanceof g0) && !(c6 instanceof w2.k)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                this.U = this.I;
                this.X = false;
            }
        }
        if (this.X) {
            h1.h hVar = this.G;
            hVar.getClass();
            h1.l lVar = this.H;
            lVar.getClass();
            d(hVar, lVar, this.S, false);
            this.W = 0;
            this.X = false;
        }
        if (!this.Y) {
            if (!this.K) {
                d(this.f10774z, this.f10767b, this.R, true);
            }
            this.Z = !this.Y;
        }
    }

    public final void d(h1.h hVar, h1.l lVar, boolean z9, boolean z10) {
        h1.l a10;
        boolean z11;
        long j4;
        long j10;
        boolean z12;
        boolean z13;
        if (z9) {
            if (this.W != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            z11 = z13;
            a10 = lVar;
        } else {
            a10 = lVar.a(this.W);
            z11 = false;
        }
        try {
            d2.l g10 = g(hVar, a10, z10);
            if (z11) {
                g10.h(this.W);
            }
            while (!this.Y) {
                try {
                    try {
                        if (((b) this.U).f8424a.i(g10, b.f8423f) == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            break;
                        }
                    } catch (EOFException e10) {
                        if ((this.f10769d.f1928f & 16384) != 0) {
                            ((b) this.U).f8424a.e(0L, 0L);
                            j4 = g10.f3180d;
                            j10 = lVar.f4602f;
                        } else {
                            throw e10;
                        }
                    }
                } catch (Throwable th) {
                    this.W = (int) (g10.f3180d - lVar.f4602f);
                    throw th;
                }
            }
            j4 = g10.f3180d;
            j10 = lVar.f4602f;
            this.W = (int) (j4 - j10);
        } finally {
            w7.b.C(hVar);
        }
    }

    public final int f(int i10) {
        w7.b.u(!this.E);
        if (i10 >= this.f8461a0.size()) {
            return 0;
        }
        return ((Integer) this.f8461a0.get(i10)).intValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:99|(1:(3:102|(2:104|(2:106|(3:108|(2:110|(6:112|113|114|115|116|(2:129|130)(2:(2:126|127)|125))(1:136))(4:(1:140)(1:157)|141|(6:143|(1:145)(1:155)|(1:147)|148|(1:150)(1:154)|(1:152))(1:156)|153)|137)(7:158|(2:160|(2:161|(2:163|(2:166|167)(1:165))(1:175)))(0)|176|(1:169)(1:174)|170|(1:172)|173))(1:177))(1:179)|178)(1:180))(1:181)|138|113|114|115|116|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02e7, code lost:
    
        r3 = false;
        r8.f3182f = 0;
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02e2, code lost:
    
        r8.f3182f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ee A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d2.l g(h1.h r24, h1.l r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.l.g(h1.h, h1.l, boolean):d2.l");
    }

    @Override // z1.l
    public final void m() {
        this.Y = true;
    }
}
