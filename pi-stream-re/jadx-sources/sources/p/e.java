package p;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {
    public static int o = 1000;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f8367p = true;

    /* renamed from: b, reason: collision with root package name */
    public final i f8369b;

    /* renamed from: e, reason: collision with root package name */
    public c[] f8372e;

    /* renamed from: k, reason: collision with root package name */
    public final i.g f8378k;

    /* renamed from: n, reason: collision with root package name */
    public c f8381n;

    /* renamed from: a, reason: collision with root package name */
    public int f8368a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f8370c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f8371d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8373f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f8374g = new boolean[32];

    /* renamed from: h, reason: collision with root package name */
    public int f8375h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f8376i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f8377j = 32;

    /* renamed from: l, reason: collision with root package name */
    public k[] f8379l = new k[o];

    /* renamed from: m, reason: collision with root package name */
    public int f8380m = 0;

    public e() {
        this.f8372e = null;
        this.f8372e = new c[32];
        q();
        i.g gVar = new i.g(1);
        this.f8378k = gVar;
        this.f8369b = new i(gVar);
        if (f8367p) {
            this.f8381n = new d(gVar);
        } else {
            this.f8381n = new c(gVar);
        }
    }

    public static int m(q.d dVar) {
        k kVar = dVar.f8818g;
        if (kVar != null) {
            return (int) (kVar.f8397e + 0.5f);
        }
        return 0;
    }

    public final k a(int i10) {
        k kVar = (k) ((f) this.f8378k.f5198d).j();
        if (kVar == null) {
            kVar = new k(i10);
            kVar.f8404l = i10;
        } else {
            kVar.c();
            kVar.f8404l = i10;
        }
        int i11 = this.f8380m;
        int i12 = o;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            o = i13;
            this.f8379l = (k[]) Arrays.copyOf(this.f8379l, i13);
        }
        k[] kVarArr = this.f8379l;
        int i14 = this.f8380m;
        this.f8380m = i14 + 1;
        kVarArr[i14] = kVar;
        return kVar;
    }

    public final void b(k kVar, k kVar2, int i10, float f10, k kVar3, k kVar4, int i11, int i12) {
        c k10 = k();
        if (kVar2 == kVar3) {
            k10.f8365d.d(kVar, 1.0f);
            k10.f8365d.d(kVar4, 1.0f);
            k10.f8365d.d(kVar2, -2.0f);
        } else if (f10 == 0.5f) {
            k10.f8365d.d(kVar, 1.0f);
            k10.f8365d.d(kVar2, -1.0f);
            k10.f8365d.d(kVar3, -1.0f);
            k10.f8365d.d(kVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                k10.f8363b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            k10.f8365d.d(kVar, -1.0f);
            k10.f8365d.d(kVar2, 1.0f);
            k10.f8363b = i10;
        } else if (f10 >= 1.0f) {
            k10.f8365d.d(kVar4, -1.0f);
            k10.f8365d.d(kVar3, 1.0f);
            k10.f8363b = -i11;
        } else {
            float f11 = 1.0f - f10;
            k10.f8365d.d(kVar, f11 * 1.0f);
            k10.f8365d.d(kVar2, f11 * (-1.0f));
            k10.f8365d.d(kVar3, (-1.0f) * f10);
            k10.f8365d.d(kVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                k10.f8363b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            k10.a(this, i12);
        }
        c(k10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
    
        if (r4.f8403k <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ca, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
    
        if (r4.f8403k <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e5, code lost:
    
        if (r4.f8403k <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f1, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ee, code lost:
    
        if (r4.f8403k <= 1) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(p.c r17) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.c(p.c):void");
    }

    public final void d(k kVar, int i10) {
        int i11 = kVar.f8395c;
        if (i11 == -1) {
            kVar.f8397e = i10;
            kVar.f8398f = true;
            int i12 = kVar.f8402j;
            for (int i13 = 0; i13 < i12; i13++) {
                kVar.f8401i[i13].g(kVar, false);
            }
            kVar.f8402j = 0;
            return;
        }
        if (i11 != -1) {
            c cVar = this.f8372e[i11];
            if (cVar.f8366e) {
                cVar.f8363b = i10;
                return;
            }
            if (cVar.f8365d.g() == 0) {
                cVar.f8366e = true;
                cVar.f8363b = i10;
                return;
            }
            c k10 = k();
            if (i10 < 0) {
                k10.f8363b = i10 * (-1);
                k10.f8365d.d(kVar, 1.0f);
            } else {
                k10.f8363b = i10;
                k10.f8365d.d(kVar, -1.0f);
            }
            c(k10);
            return;
        }
        c k11 = k();
        k11.f8362a = kVar;
        float f10 = i10;
        kVar.f8397e = f10;
        k11.f8363b = f10;
        k11.f8366e = true;
        c(k11);
    }

    public final void e(k kVar, k kVar2, int i10, int i11) {
        boolean z9 = false;
        if (i11 == 8 && kVar2.f8398f && kVar.f8395c == -1) {
            kVar.f8397e = kVar2.f8397e + i10;
            kVar.f8398f = true;
            int i12 = kVar.f8402j;
            for (int i13 = 0; i13 < i12; i13++) {
                kVar.f8401i[i13].g(kVar, false);
            }
            kVar.f8402j = 0;
            return;
        }
        c k10 = k();
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            }
            k10.f8363b = i10;
        }
        if (!z9) {
            k10.f8365d.d(kVar, -1.0f);
            k10.f8365d.d(kVar2, 1.0f);
        } else {
            k10.f8365d.d(kVar, 1.0f);
            k10.f8365d.d(kVar2, -1.0f);
        }
        if (i11 != 8) {
            k10.a(this, i11);
        }
        c(k10);
    }

    public final void f(k kVar, k kVar2, int i10, int i11) {
        c k10 = k();
        k l10 = l();
        l10.f8396d = 0;
        k10.b(kVar, kVar2, l10, i10);
        if (i11 != 8) {
            k10.f8365d.d(i(i11), (int) (k10.f8365d.i(l10) * (-1.0f)));
        }
        c(k10);
    }

    public final void g(k kVar, k kVar2, int i10, int i11) {
        c k10 = k();
        k l10 = l();
        l10.f8396d = 0;
        k10.c(kVar, kVar2, l10, i10);
        if (i11 != 8) {
            k10.f8365d.d(i(i11), (int) (k10.f8365d.i(l10) * (-1.0f)));
        }
        c(k10);
    }

    public final void h(c cVar) {
        boolean z9 = f8367p;
        i.g gVar = this.f8378k;
        if (z9) {
            c cVar2 = this.f8372e[this.f8376i];
            if (cVar2 != null) {
                ((f) gVar.f5196b).b(cVar2);
            }
        } else {
            c cVar3 = this.f8372e[this.f8376i];
            if (cVar3 != null) {
                ((f) gVar.f5197c).b(cVar3);
            }
        }
        c[] cVarArr = this.f8372e;
        int i10 = this.f8376i;
        cVarArr[i10] = cVar;
        k kVar = cVar.f8362a;
        kVar.f8395c = i10;
        this.f8376i = i10 + 1;
        kVar.d(cVar);
    }

    public final k i(int i10) {
        if (this.f8375h + 1 >= this.f8371d) {
            n();
        }
        k a10 = a(4);
        int i11 = this.f8368a + 1;
        this.f8368a = i11;
        this.f8375h++;
        a10.f8394b = i11;
        a10.f8396d = i10;
        ((k[]) this.f8378k.f5199e)[i11] = a10;
        i iVar = this.f8369b;
        iVar.f8392i.f8387a = a10;
        float[] fArr = a10.f8400h;
        Arrays.fill(fArr, 0.0f);
        fArr[a10.f8396d] = 1.0f;
        iVar.i(a10);
        return a10;
    }

    public final k j(Object obj) {
        k kVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f8375h + 1 >= this.f8371d) {
            n();
        }
        if (obj instanceof q.d) {
            q.d dVar = (q.d) obj;
            kVar = dVar.f8818g;
            if (kVar == null) {
                dVar.i();
                kVar = dVar.f8818g;
            }
            int i10 = kVar.f8394b;
            i.g gVar = this.f8378k;
            if (i10 == -1 || i10 > this.f8368a || ((k[]) gVar.f5199e)[i10] == null) {
                if (i10 != -1) {
                    kVar.c();
                }
                int i11 = this.f8368a + 1;
                this.f8368a = i11;
                this.f8375h++;
                kVar.f8394b = i11;
                kVar.f8404l = 1;
                ((k[]) gVar.f5199e)[i11] = kVar;
            }
        }
        return kVar;
    }

    public final c k() {
        boolean z9 = f8367p;
        i.g gVar = this.f8378k;
        if (z9) {
            c cVar = (c) ((f) gVar.f5196b).j();
            if (cVar == null) {
                return new d(gVar);
            }
            cVar.f8362a = null;
            cVar.f8365d.clear();
            cVar.f8363b = 0.0f;
            cVar.f8366e = false;
            return cVar;
        }
        c cVar2 = (c) ((f) gVar.f5197c).j();
        if (cVar2 == null) {
            return new c(gVar);
        }
        cVar2.f8362a = null;
        cVar2.f8365d.clear();
        cVar2.f8363b = 0.0f;
        cVar2.f8366e = false;
        return cVar2;
    }

    public final k l() {
        if (this.f8375h + 1 >= this.f8371d) {
            n();
        }
        k a10 = a(3);
        int i10 = this.f8368a + 1;
        this.f8368a = i10;
        this.f8375h++;
        a10.f8394b = i10;
        ((k[]) this.f8378k.f5199e)[i10] = a10;
        return a10;
    }

    public final void n() {
        int i10 = this.f8370c * 2;
        this.f8370c = i10;
        this.f8372e = (c[]) Arrays.copyOf(this.f8372e, i10);
        i.g gVar = this.f8378k;
        gVar.f5199e = (k[]) Arrays.copyOf((k[]) gVar.f5199e, this.f8370c);
        int i11 = this.f8370c;
        this.f8374g = new boolean[i11];
        this.f8371d = i11;
        this.f8377j = i11;
    }

    public final void o(i iVar) {
        float f10;
        int i10;
        boolean z9;
        i.g gVar;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 < this.f8376i) {
                c cVar = this.f8372e[i11];
                if (cVar.f8362a.f8404l != 1 && cVar.f8363b < 0.0f) {
                    z9 = true;
                    break;
                }
                i11++;
            } else {
                z9 = false;
                break;
            }
        }
        if (z9) {
            boolean z10 = false;
            int i12 = 0;
            while (!z10) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    int i17 = this.f8376i;
                    gVar = this.f8378k;
                    if (i15 >= i17) {
                        break;
                    }
                    c cVar2 = this.f8372e[i15];
                    if (cVar2.f8362a.f8404l != i10 && !cVar2.f8366e && cVar2.f8363b < f10) {
                        int i18 = i10;
                        while (i18 < this.f8375h) {
                            k kVar = ((k[]) gVar.f5199e)[i18];
                            float i19 = cVar2.f8365d.i(kVar);
                            if (i19 > f10) {
                                for (int i20 = 0; i20 < 9; i20++) {
                                    float f12 = kVar.f8399g[i20] / i19;
                                    if ((f12 < f11 && i20 == i16) || i20 > i16) {
                                        i16 = i20;
                                        f11 = f12;
                                        i13 = i15;
                                        i14 = i18;
                                    }
                                }
                            }
                            i18++;
                            f10 = 0.0f;
                        }
                    }
                    i15++;
                    f10 = 0.0f;
                    i10 = 1;
                }
                if (i13 != -1) {
                    c cVar3 = this.f8372e[i13];
                    cVar3.f8362a.f8395c = -1;
                    cVar3.f(((k[]) gVar.f5199e)[i14]);
                    k kVar2 = cVar3.f8362a;
                    kVar2.f8395c = i13;
                    kVar2.d(cVar3);
                } else {
                    z10 = true;
                }
                if (i12 > this.f8375h / 2) {
                    z10 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        p(iVar);
        for (int i21 = 0; i21 < this.f8376i; i21++) {
            c cVar4 = this.f8372e[i21];
            cVar4.f8362a.f8397e = cVar4.f8363b;
        }
    }

    public final void p(c cVar) {
        for (int i10 = 0; i10 < this.f8375h; i10++) {
            this.f8374g[i10] = false;
        }
        boolean z9 = false;
        int i11 = 0;
        while (!z9) {
            i11++;
            if (i11 >= this.f8375h * 2) {
                return;
            }
            k kVar = cVar.f8362a;
            if (kVar != null) {
                this.f8374g[kVar.f8394b] = true;
            }
            k d10 = cVar.d(this.f8374g);
            if (d10 != null) {
                boolean[] zArr = this.f8374g;
                int i12 = d10.f8394b;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (d10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f8376i; i14++) {
                    c cVar2 = this.f8372e[i14];
                    if (cVar2.f8362a.f8404l != 1 && !cVar2.f8366e && cVar2.f8365d.e(d10)) {
                        float i15 = cVar2.f8365d.i(d10);
                        if (i15 < 0.0f) {
                            float f11 = (-cVar2.f8363b) / i15;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    c cVar3 = this.f8372e[i13];
                    cVar3.f8362a.f8395c = -1;
                    cVar3.f(d10);
                    k kVar2 = cVar3.f8362a;
                    kVar2.f8395c = i13;
                    kVar2.d(cVar3);
                }
            } else {
                z9 = true;
            }
        }
    }

    public final void q() {
        boolean z9 = f8367p;
        i.g gVar = this.f8378k;
        int i10 = 0;
        if (z9) {
            while (true) {
                c[] cVarArr = this.f8372e;
                if (i10 < cVarArr.length) {
                    c cVar = cVarArr[i10];
                    if (cVar != null) {
                        ((f) gVar.f5196b).b(cVar);
                    }
                    this.f8372e[i10] = null;
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                c[] cVarArr2 = this.f8372e;
                if (i10 < cVarArr2.length) {
                    c cVar2 = cVarArr2[i10];
                    if (cVar2 != null) {
                        ((f) gVar.f5197c).b(cVar2);
                    }
                    this.f8372e[i10] = null;
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void r() {
        i.g gVar;
        int i10 = 0;
        while (true) {
            gVar = this.f8378k;
            k[] kVarArr = (k[]) gVar.f5199e;
            if (i10 >= kVarArr.length) {
                break;
            }
            k kVar = kVarArr[i10];
            if (kVar != null) {
                kVar.c();
            }
            i10++;
        }
        f fVar = (f) gVar.f5198d;
        k[] kVarArr2 = this.f8379l;
        int i11 = this.f8380m;
        fVar.getClass();
        if (i11 > kVarArr2.length) {
            i11 = kVarArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            k kVar2 = kVarArr2[i12];
            int i13 = fVar.f8384c;
            Object[] objArr = fVar.f8383b;
            if (i13 < objArr.length) {
                objArr[i13] = kVar2;
                fVar.f8384c = i13 + 1;
            }
        }
        this.f8380m = 0;
        Arrays.fill((k[]) gVar.f5199e, (Object) null);
        this.f8368a = 0;
        i iVar = this.f8369b;
        iVar.f8391h = 0;
        iVar.f8363b = 0.0f;
        this.f8375h = 1;
        for (int i14 = 0; i14 < this.f8376i; i14++) {
            this.f8372e[i14].getClass();
        }
        q();
        this.f8376i = 0;
        if (f8367p) {
            this.f8381n = new d(gVar);
        } else {
            this.f8381n = new c(gVar);
        }
    }
}
