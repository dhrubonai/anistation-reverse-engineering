package p;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: f, reason: collision with root package name */
    public k[] f8389f;

    /* renamed from: g, reason: collision with root package name */
    public k[] f8390g;

    /* renamed from: h, reason: collision with root package name */
    public int f8391h;

    /* renamed from: i, reason: collision with root package name */
    public final h f8392i;

    public i(i.g gVar) {
        super(gVar);
        this.f8389f = new k[128];
        this.f8390g = new k[128];
        this.f8391h = 0;
        this.f8392i = new h(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        if (r9 < r8) goto L30;
     */
    @Override // p.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p.k d(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.f8391h
            if (r2 >= r4) goto L57
            p.k[] r4 = r11.f8389f
            r5 = r4[r2]
            int r6 = r5.f8394b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L54
        L13:
            p.h r6 = r11.f8392i
            r6.f8387a = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L36
        L1c:
            if (r7 < 0) goto L32
            p.k r4 = r6.f8387a
            float[] r4 = r4.f8400h
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2a
            goto L32
        L2a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L33
        L2f:
            int r7 = r7 + (-1)
            goto L1c
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L54
            goto L53
        L36:
            r4 = r4[r3]
        L38:
            if (r7 < 0) goto L50
            float[] r8 = r4.f8400h
            r8 = r8[r7]
            p.k r9 = r6.f8387a
            float[] r9 = r9.f8400h
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r7 = r7 + (-1)
            goto L38
        L4b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L50
            goto L51
        L50:
            r5 = r1
        L51:
            if (r5 == 0) goto L54
        L53:
            r3 = r2
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != r0) goto L5b
            r12 = 0
            return r12
        L5b:
            p.k[] r12 = r11.f8389f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i.d(boolean[]):p.k");
    }

    @Override // p.c
    public final void h(c cVar, boolean z9) {
        boolean z10;
        k kVar = cVar.f8362a;
        if (kVar == null) {
            return;
        }
        b bVar = cVar.f8365d;
        int g10 = bVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            k h10 = bVar.h(i10);
            float a10 = bVar.a(i10);
            h hVar = this.f8392i;
            hVar.f8387a = h10;
            boolean z11 = h10.f8393a;
            float[] fArr = kVar.f8400h;
            if (z11) {
                boolean z12 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = hVar.f8387a.f8400h;
                    float f10 = (fArr[i11] * a10) + fArr2[i11];
                    fArr2[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        hVar.f8387a.f8400h[i11] = 0.0f;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    hVar.f8388b.j(hVar.f8387a);
                }
                z10 = false;
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * a10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        hVar.f8387a.f8400h[i12] = f12;
                    } else {
                        hVar.f8387a.f8400h[i12] = 0.0f;
                    }
                }
                z10 = true;
            }
            if (z10) {
                i(h10);
            }
            this.f8363b = (cVar.f8363b * a10) + this.f8363b;
        }
        j(kVar);
    }

    public final void i(k kVar) {
        int i10;
        int i11 = this.f8391h + 1;
        k[] kVarArr = this.f8389f;
        if (i11 > kVarArr.length) {
            k[] kVarArr2 = (k[]) Arrays.copyOf(kVarArr, kVarArr.length * 2);
            this.f8389f = kVarArr2;
            this.f8390g = (k[]) Arrays.copyOf(kVarArr2, kVarArr2.length * 2);
        }
        k[] kVarArr3 = this.f8389f;
        int i12 = this.f8391h;
        kVarArr3[i12] = kVar;
        int i13 = i12 + 1;
        this.f8391h = i13;
        if (i13 > 1 && kVarArr3[i13 - 1].f8394b > kVar.f8394b) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                i10 = this.f8391h;
                if (i15 >= i10) {
                    break;
                }
                this.f8390g[i15] = this.f8389f[i15];
                i15++;
            }
            Arrays.sort(this.f8390g, 0, i10, new g(this, i14));
            while (i14 < this.f8391h) {
                this.f8389f[i14] = this.f8390g[i14];
                i14++;
            }
        }
        kVar.f8393a = true;
        kVar.a(this);
    }

    public final void j(k kVar) {
        int i10 = 0;
        while (i10 < this.f8391h) {
            if (this.f8389f[i10] == kVar) {
                while (true) {
                    int i11 = this.f8391h;
                    if (i10 < i11 - 1) {
                        k[] kVarArr = this.f8389f;
                        int i12 = i10 + 1;
                        kVarArr[i10] = kVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f8391h = i11 - 1;
                        kVar.f8393a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // p.c
    public final String toString() {
        String str = " goal -> (" + this.f8363b + ") : ";
        for (int i10 = 0; i10 < this.f8391h; i10++) {
            k kVar = this.f8389f[i10];
            h hVar = this.f8392i;
            hVar.f8387a = kVar;
            str = str + hVar + " ";
        }
        return str;
    }
}
