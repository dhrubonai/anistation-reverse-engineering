package d2;

import c1.p0;
import f.r0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class y implements y2.l {

    /* renamed from: a, reason: collision with root package name */
    public final f1.t f3211a;

    public y(int i10) {
        if (i10 != 1) {
            this.f3211a = new f1.t(10);
        } else {
            this.f3211a = new f1.t();
        }
    }

    public final p0 a(q qVar, j1.l lVar) {
        f1.t tVar = this.f3211a;
        p0 p0Var = null;
        int i10 = 0;
        while (true) {
            try {
                qVar.n(tVar.f3858a, 0, 10);
                tVar.G(0);
                if (tVar.x() != 4801587) {
                    break;
                }
                tVar.H(3);
                int u9 = tVar.u();
                int i11 = u9 + 10;
                if (p0Var == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(tVar.f3858a, 0, bArr, 0, 10);
                    qVar.n(bArr, 10, u9);
                    p0Var = new q2.j(lVar).g1(bArr, i11);
                } else {
                    qVar.o(u9);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        qVar.g();
        qVar.o(i10);
        return p0Var;
    }

    @Override // y2.l
    public final /* synthetic */ void f() {
    }

    @Override // y2.l
    public final /* synthetic */ void k(byte[] bArr, r0 r0Var, w.f fVar) {
        r.f.a(this, bArr, r0Var, fVar);
    }

    @Override // y2.l
    public final void o(byte[] bArr, int i10, int i11, r0 r0Var, f1.c cVar) {
        boolean z9;
        e1.b a10;
        boolean z10;
        f1.t tVar = this.f3211a;
        tVar.E(bArr, i11 + i10);
        tVar.G(i10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i12 = tVar.f3860c - tVar.f3859b;
            if (i12 > 0) {
                if (i12 >= 8) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                w7.b.f("Incomplete Mp4Webvtt Top Level box header found.", z9);
                int f10 = tVar.f();
                if (tVar.f() == 1987343459) {
                    int i13 = f10 - 8;
                    CharSequence charSequence = null;
                    e1.a aVar = null;
                    while (i13 > 0) {
                        if (i13 >= 8) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w7.b.f("Incomplete vtt cue box header found.", z10);
                        int f11 = tVar.f();
                        int f12 = tVar.f();
                        int i14 = f11 - 8;
                        byte[] bArr2 = tVar.f3858a;
                        int i15 = tVar.f3859b;
                        int i16 = f1.b0.f3799a;
                        String str = new String(bArr2, i15, i14, q6.e.f9207c);
                        tVar.H(i14);
                        i13 = (i13 - 8) - i14;
                        if (f12 == 1937011815) {
                            g3.g gVar = new g3.g();
                            g3.h.e(str, gVar);
                            aVar = gVar.a();
                        } else if (f12 == 1885436268) {
                            charSequence = g3.h.f(null, str.trim(), Collections.emptyList());
                        }
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (aVar != null) {
                        aVar.f3322a = charSequence;
                        a10 = aVar.a();
                    } else {
                        Pattern pattern = g3.h.f4384a;
                        g3.g gVar2 = new g3.g();
                        gVar2.f4375c = charSequence;
                        a10 = gVar2.a().a();
                    }
                    arrayList.add(a10);
                } else {
                    tVar.H(f10 - 8);
                }
            } else {
                cVar.accept(new y2.a(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }

    @Override // y2.l
    public final /* synthetic */ y2.d r(byte[] bArr, int i10, int i11) {
        return r.f.b(this, bArr, i10, i11);
    }

    @Override // y2.l
    public final int x() {
        return 2;
    }
}
