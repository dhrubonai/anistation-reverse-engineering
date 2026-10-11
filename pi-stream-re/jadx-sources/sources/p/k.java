package p;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8393a;

    /* renamed from: e, reason: collision with root package name */
    public float f8397e;

    /* renamed from: l, reason: collision with root package name */
    public int f8404l;

    /* renamed from: b, reason: collision with root package name */
    public int f8394b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f8395c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f8396d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8398f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f8399g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f8400h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public c[] f8401i = new c[16];

    /* renamed from: j, reason: collision with root package name */
    public int f8402j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8403k = 0;

    public k(int i10) {
        this.f8404l = i10;
    }

    public final void a(c cVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f8402j;
            if (i10 < i11) {
                if (this.f8401i[i10] == cVar) {
                    return;
                } else {
                    i10++;
                }
            } else {
                c[] cVarArr = this.f8401i;
                if (i11 >= cVarArr.length) {
                    this.f8401i = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f8401i;
                int i12 = this.f8402j;
                cVarArr2[i12] = cVar;
                this.f8402j = i12 + 1;
                return;
            }
        }
    }

    public final void b(c cVar) {
        int i10 = this.f8402j;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f8401i[i11] == cVar) {
                while (i11 < i10 - 1) {
                    c[] cVarArr = this.f8401i;
                    int i12 = i11 + 1;
                    cVarArr[i11] = cVarArr[i12];
                    i11 = i12;
                }
                this.f8402j--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.f8404l = 5;
        this.f8396d = 0;
        this.f8394b = -1;
        this.f8395c = -1;
        this.f8397e = 0.0f;
        this.f8398f = false;
        int i10 = this.f8402j;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f8401i[i11] = null;
        }
        this.f8402j = 0;
        this.f8403k = 0;
        this.f8393a = false;
        Arrays.fill(this.f8400h, 0.0f);
    }

    public final void d(c cVar) {
        int i10 = this.f8402j;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f8401i[i11].h(cVar, false);
        }
        this.f8402j = 0;
    }

    public final String toString() {
        return "" + this.f8394b;
    }
}
