package p;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public int f8405a = 16;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8406b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f8407c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f8408d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public float[] f8409e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f8410f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public int[] f8411g = new int[16];

    /* renamed from: h, reason: collision with root package name */
    public int f8412h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f8413i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final c f8414j;

    /* renamed from: k, reason: collision with root package name */
    public final i.g f8415k;

    public l(c cVar, i.g gVar) {
        this.f8414j = cVar;
        this.f8415k = gVar;
        clear();
    }

    @Override // p.b
    public final float a(int i10) {
        int i11 = this.f8412h;
        int i12 = this.f8413i;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f8409e[i12];
            }
            i12 = this.f8411g[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p.b
    public final float b(c cVar, boolean z9) {
        float i10 = i(cVar.f8362a);
        c(cVar.f8362a, z9);
        l lVar = (l) cVar.f8365d;
        int i11 = lVar.f8412h;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = lVar.f8408d[i13];
            if (i14 != -1) {
                f(((k[]) this.f8415k.f5199e)[i14], lVar.f8409e[i13] * i10, z9);
                i12++;
            }
            i13++;
        }
        return i10;
    }

    @Override // p.b
    public final float c(k kVar, boolean z9) {
        int[] iArr;
        int i10;
        int n9 = n(kVar);
        if (n9 == -1) {
            return 0.0f;
        }
        int i11 = kVar.f8394b;
        int i12 = i11 % 16;
        int[] iArr2 = this.f8406b;
        int i13 = iArr2[i12];
        if (i13 != -1) {
            if (this.f8408d[i13] == i11) {
                int[] iArr3 = this.f8407c;
                iArr2[i12] = iArr3[i13];
                iArr3[i13] = -1;
            } else {
                while (true) {
                    iArr = this.f8407c;
                    i10 = iArr[i13];
                    if (i10 == -1 || this.f8408d[i10] == i11) {
                        break;
                    }
                    i13 = i10;
                }
                if (i10 != -1 && this.f8408d[i10] == i11) {
                    iArr[i13] = iArr[i10];
                    iArr[i10] = -1;
                }
            }
        }
        float f10 = this.f8409e[n9];
        if (this.f8413i == n9) {
            this.f8413i = this.f8411g[n9];
        }
        this.f8408d[n9] = -1;
        int[] iArr4 = this.f8410f;
        int i14 = iArr4[n9];
        if (i14 != -1) {
            int[] iArr5 = this.f8411g;
            iArr5[i14] = iArr5[n9];
        }
        int i15 = this.f8411g[n9];
        if (i15 != -1) {
            iArr4[i15] = iArr4[n9];
        }
        this.f8412h--;
        kVar.f8403k--;
        if (z9) {
            kVar.b(this.f8414j);
        }
        return f10;
    }

    @Override // p.b
    public final void clear() {
        int i10 = this.f8412h;
        for (int i11 = 0; i11 < i10; i11++) {
            k h10 = h(i11);
            if (h10 != null) {
                h10.b(this.f8414j);
            }
        }
        for (int i12 = 0; i12 < this.f8405a; i12++) {
            this.f8408d[i12] = -1;
            this.f8407c[i12] = -1;
        }
        for (int i13 = 0; i13 < 16; i13++) {
            this.f8406b[i13] = -1;
        }
        this.f8412h = 0;
        this.f8413i = -1;
    }

    @Override // p.b
    public final void d(k kVar, float f10) {
        if (f10 > -0.001f && f10 < 0.001f) {
            c(kVar, true);
            return;
        }
        int i10 = 0;
        if (this.f8412h == 0) {
            m(0, kVar, f10);
            l(kVar, 0);
            this.f8413i = 0;
            return;
        }
        int n9 = n(kVar);
        if (n9 != -1) {
            this.f8409e[n9] = f10;
            return;
        }
        int i11 = this.f8412h + 1;
        int i12 = this.f8405a;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.f8408d = Arrays.copyOf(this.f8408d, i13);
            this.f8409e = Arrays.copyOf(this.f8409e, i13);
            this.f8410f = Arrays.copyOf(this.f8410f, i13);
            this.f8411g = Arrays.copyOf(this.f8411g, i13);
            this.f8407c = Arrays.copyOf(this.f8407c, i13);
            for (int i14 = this.f8405a; i14 < i13; i14++) {
                this.f8408d[i14] = -1;
                this.f8407c[i14] = -1;
            }
            this.f8405a = i13;
        }
        int i15 = this.f8412h;
        int i16 = this.f8413i;
        int i17 = -1;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = this.f8408d[i16];
            int i20 = kVar.f8394b;
            if (i19 == i20) {
                this.f8409e[i16] = f10;
                return;
            }
            if (i19 < i20) {
                i17 = i16;
            }
            i16 = this.f8411g[i16];
            if (i16 == -1) {
                break;
            }
        }
        while (true) {
            if (i10 < this.f8405a) {
                if (this.f8408d[i10] == -1) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        m(i10, kVar, f10);
        if (i17 != -1) {
            this.f8410f[i10] = i17;
            int[] iArr = this.f8411g;
            iArr[i10] = iArr[i17];
            iArr[i17] = i10;
        } else {
            this.f8410f[i10] = -1;
            if (this.f8412h > 0) {
                this.f8411g[i10] = this.f8413i;
                this.f8413i = i10;
            } else {
                this.f8411g[i10] = -1;
            }
        }
        int i21 = this.f8411g[i10];
        if (i21 != -1) {
            this.f8410f[i21] = i10;
        }
        l(kVar, i10);
    }

    @Override // p.b
    public final boolean e(k kVar) {
        if (n(kVar) != -1) {
            return true;
        }
        return false;
    }

    @Override // p.b
    public final void f(k kVar, float f10, boolean z9) {
        if (f10 > -0.001f && f10 < 0.001f) {
            return;
        }
        int n9 = n(kVar);
        if (n9 == -1) {
            d(kVar, f10);
            return;
        }
        float[] fArr = this.f8409e;
        float f11 = fArr[n9] + f10;
        fArr[n9] = f11;
        if (f11 > -0.001f && f11 < 0.001f) {
            fArr[n9] = 0.0f;
            c(kVar, z9);
        }
    }

    @Override // p.b
    public final int g() {
        return this.f8412h;
    }

    @Override // p.b
    public final k h(int i10) {
        int i11 = this.f8412h;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f8413i;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return ((k[]) this.f8415k.f5199e)[this.f8408d[i12]];
            }
            i12 = this.f8411g[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p.b
    public final float i(k kVar) {
        int n9 = n(kVar);
        if (n9 != -1) {
            return this.f8409e[n9];
        }
        return 0.0f;
    }

    @Override // p.b
    public final void j(float f10) {
        int i10 = this.f8412h;
        int i11 = this.f8413i;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f8409e;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f8411g[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // p.b
    public final void k() {
        int i10 = this.f8412h;
        int i11 = this.f8413i;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f8409e;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f8411g[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public final void l(k kVar, int i10) {
        int[] iArr;
        int i11 = kVar.f8394b % 16;
        int[] iArr2 = this.f8406b;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f8407c;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f8407c[i10] = -1;
    }

    public final void m(int i10, k kVar, float f10) {
        this.f8408d[i10] = kVar.f8394b;
        this.f8409e[i10] = f10;
        this.f8410f[i10] = -1;
        this.f8411g[i10] = -1;
        kVar.a(this.f8414j);
        kVar.f8403k++;
        this.f8412h++;
    }

    public final int n(k kVar) {
        if (this.f8412h == 0) {
            return -1;
        }
        int i10 = kVar.f8394b;
        int i11 = this.f8406b[i10 % 16];
        if (i11 == -1) {
            return -1;
        }
        if (this.f8408d[i11] == i10) {
            return i11;
        }
        do {
            i11 = this.f8407c[i11];
            if (i11 == -1) {
                break;
            }
        } while (this.f8408d[i11] != i10);
        if (i11 == -1 || this.f8408d[i11] != i10) {
            return -1;
        }
        return i11;
    }

    public final String toString() {
        String s9;
        String s10;
        String str = hashCode() + " { ";
        int i10 = this.f8412h;
        for (int i11 = 0; i11 < i10; i11++) {
            k h10 = h(i11);
            if (h10 != null) {
                String str2 = str + h10 + " = " + a(i11) + " ";
                int n9 = n(h10);
                String s11 = a3.g.s(str2, "[p: ");
                int i12 = this.f8410f[n9];
                i.g gVar = this.f8415k;
                if (i12 != -1) {
                    s9 = s11 + ((k[]) gVar.f5199e)[this.f8408d[this.f8410f[n9]]];
                } else {
                    s9 = a3.g.s(s11, "none");
                }
                String s12 = a3.g.s(s9, ", n: ");
                if (this.f8411g[n9] != -1) {
                    s10 = s12 + ((k[]) gVar.f5199e)[this.f8408d[this.f8411g[n9]]];
                } else {
                    s10 = a3.g.s(s12, "none");
                }
                str = a3.g.s(s10, "]");
            }
        }
        return a3.g.s(str, " }");
    }
}
