package x1;

import a3.g;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.appcompat.widget.a0;
import c1.q0;
import c1.v;
import f.p0;
import i1.h;
import j1.d0;
import j1.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import r6.h0;
import r6.m0;
import r6.n1;
import r6.o0;
import w1.o;
import y2.i;
import y2.j;

/* loaded from: classes.dex */
public final class f extends j1.e implements Handler.Callback {
    public final o I;
    public final h J;
    public a K;
    public final d L;
    public boolean M;
    public int N;
    public y2.e O;
    public i P;
    public j Q;
    public j R;
    public int S;
    public final Handler T;
    public final e U;
    public final a0 V;
    public boolean W;
    public boolean X;
    public v Y;
    public long Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f11082a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f11083b0;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f11084c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, Looper looper) {
        super(3);
        Handler handler;
        p0 p0Var = d.f11081r;
        eVar.getClass();
        this.U = eVar;
        Object obj = null;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.T = handler;
        this.L = p0Var;
        this.I = new o(5);
        this.J = new h(1);
        this.V = new a0(7, obj);
        this.f11083b0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
        this.f11082a0 = -9223372036854775807L;
        this.f11084c0 = true;
    }

    @Override // j1.e
    public final int B(v vVar) {
        int i10;
        boolean z9;
        if (!Objects.equals(vVar.f1935m, "application/x-media3-cues")) {
            p0 p0Var = (p0) this.L;
            p0Var.getClass();
            boolean w9 = ((o) p0Var.f3762b).w(vVar);
            String str = vVar.f1935m;
            if (!w9 && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9) {
                if (q0.m(str)) {
                    return g.e(1, 0, 0, 0);
                }
                return g.e(0, 0, 0, 0);
            }
        }
        if (vVar.I == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return g.e(i10, 0, 0, 0);
    }

    public final void D() {
        boolean z9;
        if (!this.f11084c0 && !Objects.equals(this.Y.f1935m, "application/cea-608") && !Objects.equals(this.Y.f1935m, "application/x-mp4-cea-608") && !Objects.equals(this.Y.f1935m, "application/cea-708")) {
            z9 = false;
        } else {
            z9 = true;
        }
        w7.b.t("Legacy decoding is disabled, can't handle " + this.Y.f1935m + " samples (expected application/x-media3-cues).", z9);
    }

    public final void E() {
        n1 n1Var = n1.f9497e;
        G(this.f11082a0);
        K(new e1.c(n1Var));
    }

    public final long F() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.d()) {
            return Long.MAX_VALUE;
        }
        return this.Q.b(this.S);
    }

    public final long G(long j4) {
        boolean z9;
        boolean z10 = true;
        if (j4 != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        if (this.Z == -9223372036854775807L) {
            z10 = false;
        }
        w7.b.u(z10);
        return j4 - this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() {
        /*
            r7 = this;
            r0 = 1
            r7.M = r0
            c1.v r1 = r7.Y
            r1.getClass()
            x1.d r2 = r7.L
            f.p0 r2 = (f.p0) r2
            r2.getClass()
            java.lang.String r3 = r1.f1935m
            if (r3 == 0) goto L60
            int r4 = r3.hashCode()
            r5 = 930165504(0x37713300, float:1.4376594E-5)
            r6 = 2
            if (r4 == r5) goto L3e
            r5 = 1566015601(0x5d578071, float:9.705335E17)
            if (r4 == r5) goto L33
            r5 = 1566016562(0x5d578432, float:9.705995E17)
            if (r4 == r5) goto L28
            goto L46
        L28:
            java.lang.String r4 = "application/cea-708"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L31
            goto L46
        L31:
            r4 = r6
            goto L49
        L33:
            java.lang.String r4 = "application/cea-608"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L3c
            goto L46
        L3c:
            r4 = r0
            goto L49
        L3e:
            java.lang.String r4 = "application/x-mp4-cea-608"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L48
        L46:
            r4 = -1
            goto L49
        L48:
            r4 = 0
        L49:
            int r5 = r1.E
            if (r4 == 0) goto L5a
            if (r4 == r0) goto L5a
            if (r4 == r6) goto L52
            goto L60
        L52:
            z2.f r0 = new z2.f
            java.util.List r1 = r1.o
            r0.<init>(r5, r1)
            goto L85
        L5a:
            z2.c r0 = new z2.c
            r0.<init>(r3, r5)
            goto L85
        L60:
            java.lang.Object r0 = r2.f3762b
            w1.o r0 = (w1.o) r0
            boolean r0 = r0.w(r1)
            if (r0 == 0) goto L88
            java.lang.Object r0 = r2.f3762b
            w1.o r0 = (w1.o) r0
            y2.l r0 = r0.r(r1)
            x1.b r1 = new x1.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L85:
            r7.O = r0
            return
        L88:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = r.f.d(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.f.H():void");
    }

    public final void I(e1.c cVar) {
        o0 o0Var = cVar.f3364a;
        e eVar = this.U;
        ((z) eVar).f5932a.f5683l.l(27, new w.f(o0Var, 4));
        d0 d0Var = ((z) eVar).f5932a;
        d0Var.f5665a0 = cVar;
        d0Var.f5683l.l(27, new w.f(cVar, 7));
    }

    public final void J() {
        this.P = null;
        this.S = -1;
        j jVar = this.Q;
        if (jVar != null) {
            jVar.i();
            this.Q = null;
        }
        j jVar2 = this.R;
        if (jVar2 != null) {
            jVar2.i();
            this.R = null;
        }
    }

    public final void K(e1.c cVar) {
        Handler handler = this.T;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            I(cVar);
        }
    }

    @Override // j1.g1
    public final boolean a() {
        return true;
    }

    @Override // j1.e, j1.g1
    public final boolean b() {
        return this.X;
    }

    @Override // j1.g1
    public final void d(long j4, long j10) {
        boolean z9;
        boolean z10;
        long j11;
        boolean z11;
        if (this.E) {
            long j12 = this.f11083b0;
            if (j12 != -9223372036854775807L && j4 >= j12) {
                J();
                this.X = true;
            }
        }
        if (this.X) {
            return;
        }
        v vVar = this.Y;
        vVar.getClass();
        boolean equals = Objects.equals(vVar.f1935m, "application/x-media3-cues");
        boolean z12 = false;
        z12 = false;
        int i10 = 0;
        z12 = false;
        a0 a0Var = this.V;
        if (equals) {
            this.K.getClass();
            if (!this.W) {
                h hVar = this.J;
                if (y(a0Var, hVar, 0) == -4) {
                    if (hVar.g(4)) {
                        this.W = true;
                    } else {
                        hVar.k();
                        ByteBuffer byteBuffer = hVar.f5262e;
                        byteBuffer.getClass();
                        o oVar = this.I;
                        long j13 = hVar.f5264x;
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        oVar.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        h3.e eVar = new h3.e(8);
                        m0 m0Var = o0.f9505b;
                        h0.p(4, "initialCapacity");
                        Object[] objArr = new Object[4];
                        int i11 = 0;
                        while (i10 < parcelableArrayList.size()) {
                            Bundle bundle = (Bundle) parcelableArrayList.get(i10);
                            bundle.getClass();
                            Object apply = eVar.apply(bundle);
                            apply.getClass();
                            int i12 = i11 + 1;
                            if (objArr.length < i12) {
                                objArr = Arrays.copyOf(objArr, q6.g.y(objArr.length, i12));
                            }
                            objArr[i11] = apply;
                            i10++;
                            i11 = i12;
                        }
                        y2.a aVar = new y2.a(o0.h(i11, objArr), j13, readBundle.getLong("d"));
                        hVar.h();
                        z12 = this.K.e(aVar, j4);
                    }
                }
            }
            long k10 = this.K.k(this.f11082a0);
            if (k10 == Long.MIN_VALUE && this.W && !z12) {
                this.X = true;
            }
            if (k10 != Long.MIN_VALUE && k10 <= j4) {
                z11 = true;
            } else {
                z11 = z12;
            }
            if (z11) {
                o0 f10 = this.K.f(j4);
                long u9 = this.K.u(j4);
                G(u9);
                K(new e1.c(f10));
                this.K.x(u9);
            }
            this.f11082a0 = j4;
            return;
        }
        D();
        this.f11082a0 = j4;
        if (this.R == null) {
            y2.e eVar2 = this.O;
            eVar2.getClass();
            eVar2.c(j4);
            try {
                y2.e eVar3 = this.O;
                eVar3.getClass();
                this.R = (j) eVar3.d();
            } catch (y2.f e10) {
                f1.o.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e10);
                E();
                J();
                y2.e eVar4 = this.O;
                eVar4.getClass();
                eVar4.a();
                this.O = null;
                this.N = 0;
                H();
                return;
            }
        }
        if (this.f5713y == 2) {
            if (this.Q != null) {
                long F = F();
                z9 = false;
                while (F <= j4) {
                    this.S++;
                    F = F();
                    z9 = true;
                }
            } else {
                z9 = false;
            }
            j jVar = this.R;
            if (jVar != null) {
                if (jVar.g(4)) {
                    if (!z9 && F() == Long.MAX_VALUE) {
                        if (this.N == 2) {
                            J();
                            y2.e eVar5 = this.O;
                            eVar5.getClass();
                            eVar5.a();
                            this.O = null;
                            this.N = 0;
                            H();
                        } else {
                            J();
                            this.X = true;
                        }
                    }
                } else if (jVar.f5267c <= j4) {
                    j jVar2 = this.Q;
                    if (jVar2 != null) {
                        jVar2.i();
                    }
                    this.S = jVar.a(j4);
                    this.Q = jVar;
                    this.R = null;
                    z9 = true;
                }
            }
            if (z9) {
                this.Q.getClass();
                int a10 = this.Q.a(j4);
                if (a10 != 0 && this.Q.d() != 0) {
                    if (a10 == -1) {
                        j11 = this.Q.b(r0.d() - 1);
                    } else {
                        j11 = this.Q.b(a10 - 1);
                    }
                } else {
                    j11 = this.Q.f5267c;
                }
                G(j11);
                K(new e1.c(this.Q.c(j4)));
            }
            if (this.N != 2) {
                while (!this.W) {
                    try {
                        i iVar = this.P;
                        if (iVar == null) {
                            y2.e eVar6 = this.O;
                            eVar6.getClass();
                            iVar = (i) eVar6.e();
                            if (iVar != null) {
                                this.P = iVar;
                            } else {
                                return;
                            }
                        }
                        if (this.N == 1) {
                            iVar.f5247b = 4;
                            y2.e eVar7 = this.O;
                            eVar7.getClass();
                            eVar7.b(iVar);
                            this.P = null;
                            this.N = 2;
                            return;
                        }
                        int y9 = y(a0Var, iVar, 0);
                        if (y9 == -4) {
                            if (iVar.g(4)) {
                                this.W = true;
                                this.M = false;
                            } else {
                                v vVar2 = (v) a0Var.f404c;
                                if (vVar2 != null) {
                                    iVar.B = vVar2.f1938q;
                                    iVar.k();
                                    boolean z13 = this.M;
                                    if (!iVar.g(1)) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    this.M = z13 & z10;
                                } else {
                                    return;
                                }
                            }
                            if (!this.M) {
                                if (iVar.f5264x < this.C) {
                                    iVar.e(Integer.MIN_VALUE);
                                }
                                y2.e eVar8 = this.O;
                                eVar8.getClass();
                                eVar8.b(iVar);
                                this.P = null;
                            }
                        } else if (y9 == -3) {
                            return;
                        }
                    } catch (y2.f e11) {
                        f1.o.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y, e11);
                        E();
                        J();
                        y2.e eVar9 = this.O;
                        eVar9.getClass();
                        eVar9.a();
                        this.O = null;
                        this.N = 0;
                        H();
                        return;
                    }
                }
            }
        }
    }

    @Override // j1.g1
    public final String f() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            I((e1.c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // j1.e
    public final void p() {
        this.Y = null;
        this.f11083b0 = -9223372036854775807L;
        E();
        this.Z = -9223372036854775807L;
        this.f11082a0 = -9223372036854775807L;
        if (this.O != null) {
            J();
            y2.e eVar = this.O;
            eVar.getClass();
            eVar.a();
            this.O = null;
            this.N = 0;
        }
    }

    @Override // j1.e
    public final void s(long j4, boolean z9) {
        this.f11082a0 = j4;
        a aVar = this.K;
        if (aVar != null) {
            aVar.clear();
        }
        E();
        this.W = false;
        this.X = false;
        this.f11083b0 = -9223372036854775807L;
        v vVar = this.Y;
        if (vVar != null && !Objects.equals(vVar.f1935m, "application/x-media3-cues")) {
            if (this.N != 0) {
                J();
                y2.e eVar = this.O;
                eVar.getClass();
                eVar.a();
                this.O = null;
                this.N = 0;
                H();
                return;
            }
            J();
            y2.e eVar2 = this.O;
            eVar2.getClass();
            eVar2.flush();
        }
    }

    @Override // j1.e
    public final void x(v[] vVarArr, long j4, long j10) {
        a p0Var;
        this.Z = j10;
        v vVar = vVarArr[0];
        this.Y = vVar;
        if (!Objects.equals(vVar.f1935m, "application/x-media3-cues")) {
            D();
            if (this.O != null) {
                this.N = 1;
                return;
            } else {
                H();
                return;
            }
        }
        if (this.Y.F == 1) {
            p0Var = new c();
        } else {
            p0Var = new p0(25, 0);
        }
        this.K = p0Var;
    }
}
