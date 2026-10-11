package p;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final c f8353b;

    /* renamed from: c, reason: collision with root package name */
    public final i.g f8354c;

    /* renamed from: a, reason: collision with root package name */
    public int f8352a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8355d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f8356e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f8357f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f8358g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f8359h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f8360i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8361j = false;

    public a(c cVar, i.g gVar) {
        this.f8353b = cVar;
        this.f8354c = gVar;
    }

    @Override // p.b
    public final float a(int i10) {
        int i11 = this.f8359h;
        for (int i12 = 0; i11 != -1 && i12 < this.f8352a; i12++) {
            if (i12 == i10) {
                return this.f8358g[i11];
            }
            i11 = this.f8357f[i11];
        }
        return 0.0f;
    }

    @Override // p.b
    public final float b(c cVar, boolean z9) {
        float i10 = i(cVar.f8362a);
        c(cVar.f8362a, z9);
        b bVar = cVar.f8365d;
        int g10 = bVar.g();
        for (int i11 = 0; i11 < g10; i11++) {
            k h10 = bVar.h(i11);
            f(h10, bVar.i(h10) * i10, z9);
        }
        return i10;
    }

    @Override // p.b
    public final float c(k kVar, boolean z9) {
        int i10 = this.f8359h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f8352a) {
            if (this.f8356e[i10] == kVar.f8394b) {
                if (i10 == this.f8359h) {
                    this.f8359h = this.f8357f[i10];
                } else {
                    int[] iArr = this.f8357f;
                    iArr[i12] = iArr[i10];
                }
                if (z9) {
                    kVar.b(this.f8353b);
                }
                kVar.f8403k--;
                this.f8352a--;
                this.f8356e[i10] = -1;
                if (this.f8361j) {
                    this.f8360i = i10;
                }
                return this.f8358g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f8357f[i10];
        }
        return 0.0f;
    }

    @Override // p.b
    public final void clear() {
        int i10 = this.f8359h;
        for (int i11 = 0; i10 != -1 && i11 < this.f8352a; i11++) {
            k kVar = ((k[]) this.f8354c.f5199e)[this.f8356e[i10]];
            if (kVar != null) {
                kVar.b(this.f8353b);
            }
            i10 = this.f8357f[i10];
        }
        this.f8359h = -1;
        this.f8360i = -1;
        this.f8361j = false;
        this.f8352a = 0;
    }

    @Override // p.b
    public final void d(k kVar, float f10) {
        if (f10 == 0.0f) {
            c(kVar, true);
            return;
        }
        int i10 = this.f8359h;
        c cVar = this.f8353b;
        if (i10 == -1) {
            this.f8359h = 0;
            this.f8358g[0] = f10;
            this.f8356e[0] = kVar.f8394b;
            this.f8357f[0] = -1;
            kVar.f8403k++;
            kVar.a(cVar);
            this.f8352a++;
            if (!this.f8361j) {
                int i11 = this.f8360i + 1;
                this.f8360i = i11;
                int[] iArr = this.f8356e;
                if (i11 >= iArr.length) {
                    this.f8361j = true;
                    this.f8360i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f8352a; i13++) {
            int i14 = this.f8356e[i10];
            int i15 = kVar.f8394b;
            if (i14 == i15) {
                this.f8358g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f8357f[i10];
        }
        int i16 = this.f8360i;
        int i17 = i16 + 1;
        if (this.f8361j) {
            int[] iArr2 = this.f8356e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f8356e;
        if (i16 >= iArr3.length && this.f8352a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f8356e;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f8356e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f8355d * 2;
            this.f8355d = i19;
            this.f8361j = false;
            this.f8360i = i16 - 1;
            this.f8358g = Arrays.copyOf(this.f8358g, i19);
            this.f8356e = Arrays.copyOf(this.f8356e, this.f8355d);
            this.f8357f = Arrays.copyOf(this.f8357f, this.f8355d);
        }
        this.f8356e[i16] = kVar.f8394b;
        this.f8358g[i16] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f8357f;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.f8357f[i16] = this.f8359h;
            this.f8359h = i16;
        }
        kVar.f8403k++;
        kVar.a(cVar);
        int i20 = this.f8352a + 1;
        this.f8352a = i20;
        if (!this.f8361j) {
            this.f8360i++;
        }
        int[] iArr7 = this.f8356e;
        if (i20 >= iArr7.length) {
            this.f8361j = true;
        }
        if (this.f8360i >= iArr7.length) {
            this.f8361j = true;
            this.f8360i = iArr7.length - 1;
        }
    }

    @Override // p.b
    public final boolean e(k kVar) {
        int i10 = this.f8359h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f8352a; i11++) {
            if (this.f8356e[i10] == kVar.f8394b) {
                return true;
            }
            i10 = this.f8357f[i10];
        }
        return false;
    }

    @Override // p.b
    public final void f(k kVar, float f10, boolean z9) {
        if (f10 > -0.001f && f10 < 0.001f) {
            return;
        }
        int i10 = this.f8359h;
        c cVar = this.f8353b;
        if (i10 == -1) {
            this.f8359h = 0;
            this.f8358g[0] = f10;
            this.f8356e[0] = kVar.f8394b;
            this.f8357f[0] = -1;
            kVar.f8403k++;
            kVar.a(cVar);
            this.f8352a++;
            if (!this.f8361j) {
                int i11 = this.f8360i + 1;
                this.f8360i = i11;
                int[] iArr = this.f8356e;
                if (i11 >= iArr.length) {
                    this.f8361j = true;
                    this.f8360i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f8352a; i13++) {
            int i14 = this.f8356e[i10];
            int i15 = kVar.f8394b;
            if (i14 == i15) {
                float[] fArr = this.f8358g;
                float f11 = fArr[i10] + f10;
                if (f11 > -0.001f && f11 < 0.001f) {
                    f11 = 0.0f;
                }
                fArr[i10] = f11;
                if (f11 == 0.0f) {
                    if (i10 == this.f8359h) {
                        this.f8359h = this.f8357f[i10];
                    } else {
                        int[] iArr2 = this.f8357f;
                        iArr2[i12] = iArr2[i10];
                    }
                    if (z9) {
                        kVar.b(cVar);
                    }
                    if (this.f8361j) {
                        this.f8360i = i10;
                    }
                    kVar.f8403k--;
                    this.f8352a--;
                    return;
                }
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f8357f[i10];
        }
        int i16 = this.f8360i;
        int i17 = i16 + 1;
        if (this.f8361j) {
            int[] iArr3 = this.f8356e;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f8356e;
        if (i16 >= iArr4.length && this.f8352a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f8356e;
                if (i18 >= iArr5.length) {
                    break;
                }
                if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr6 = this.f8356e;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f8355d * 2;
            this.f8355d = i19;
            this.f8361j = false;
            this.f8360i = i16 - 1;
            this.f8358g = Arrays.copyOf(this.f8358g, i19);
            this.f8356e = Arrays.copyOf(this.f8356e, this.f8355d);
            this.f8357f = Arrays.copyOf(this.f8357f, this.f8355d);
        }
        this.f8356e[i16] = kVar.f8394b;
        this.f8358g[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f8357f;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f8357f[i16] = this.f8359h;
            this.f8359h = i16;
        }
        kVar.f8403k++;
        kVar.a(cVar);
        this.f8352a++;
        if (!this.f8361j) {
            this.f8360i++;
        }
        int i20 = this.f8360i;
        int[] iArr8 = this.f8356e;
        if (i20 >= iArr8.length) {
            this.f8361j = true;
            this.f8360i = iArr8.length - 1;
        }
    }

    @Override // p.b
    public final int g() {
        return this.f8352a;
    }

    @Override // p.b
    public final k h(int i10) {
        int i11 = this.f8359h;
        for (int i12 = 0; i11 != -1 && i12 < this.f8352a; i12++) {
            if (i12 == i10) {
                return ((k[]) this.f8354c.f5199e)[this.f8356e[i11]];
            }
            i11 = this.f8357f[i11];
        }
        return null;
    }

    @Override // p.b
    public final float i(k kVar) {
        int i10 = this.f8359h;
        for (int i11 = 0; i10 != -1 && i11 < this.f8352a; i11++) {
            if (this.f8356e[i10] == kVar.f8394b) {
                return this.f8358g[i10];
            }
            i10 = this.f8357f[i10];
        }
        return 0.0f;
    }

    @Override // p.b
    public final void j(float f10) {
        int i10 = this.f8359h;
        for (int i11 = 0; i10 != -1 && i11 < this.f8352a; i11++) {
            float[] fArr = this.f8358g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f8357f[i10];
        }
    }

    @Override // p.b
    public final void k() {
        int i10 = this.f8359h;
        for (int i11 = 0; i10 != -1 && i11 < this.f8352a; i11++) {
            float[] fArr = this.f8358g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f8357f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f8359h;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f8352a; i11++) {
            str = (a3.g.s(str, " -> ") + this.f8358g[i10] + " : ") + ((k[]) this.f8354c.f5199e)[this.f8356e[i10]];
            i10 = this.f8357f[i10];
        }
        return str;
    }
}
