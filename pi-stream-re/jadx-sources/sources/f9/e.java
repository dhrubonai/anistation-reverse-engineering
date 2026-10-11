package f9;

import java.util.Arrays;
import r6.h0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public final k9.g f4024b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4026d;

    /* renamed from: h, reason: collision with root package name */
    public int f4030h;

    /* renamed from: i, reason: collision with root package name */
    public int f4031i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4023a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f4025c = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: e, reason: collision with root package name */
    public int f4027e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public c[] f4028f = new c[8];

    /* renamed from: g, reason: collision with root package name */
    public int f4029g = 7;

    public e(k9.g gVar) {
        this.f4024b = gVar;
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f4028f.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f4029g;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                c cVar = this.f4028f[length];
                h0.q(cVar);
                i10 -= cVar.f4004c;
                int i13 = this.f4031i;
                c cVar2 = this.f4028f[length];
                h0.q(cVar2);
                this.f4031i = i13 - cVar2.f4004c;
                this.f4030h--;
                i12++;
                length--;
            }
            c[] cVarArr = this.f4028f;
            int i14 = i11 + 1;
            System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f4030h);
            c[] cVarArr2 = this.f4028f;
            int i15 = this.f4029g + 1;
            Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
            this.f4029g += i12;
        }
    }

    public final void b(c cVar) {
        int i10 = this.f4027e;
        int i11 = cVar.f4004c;
        if (i11 > i10) {
            c[] cVarArr = this.f4028f;
            Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
            this.f4029g = this.f4028f.length - 1;
            this.f4030h = 0;
            this.f4031i = 0;
            return;
        }
        a((this.f4031i + i11) - i10);
        int i12 = this.f4030h + 1;
        c[] cVarArr2 = this.f4028f;
        if (i12 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f4029g = this.f4028f.length - 1;
            this.f4028f = cVarArr3;
        }
        int i13 = this.f4029g;
        this.f4029g = i13 - 1;
        this.f4028f[i13] = cVar;
        this.f4030h++;
        this.f4031i += i11;
    }

    public final void c(k9.j jVar) {
        h0.u(jVar, "data");
        boolean z9 = this.f4023a;
        k9.g gVar = this.f4024b;
        if (z9) {
            int[] iArr = d0.f4020a;
            int c6 = jVar.c();
            long j4 = 0;
            for (int i10 = 0; i10 < c6; i10++) {
                byte f10 = jVar.f(i10);
                byte[] bArr = z8.b.f12133a;
                j4 += d0.f4021b[f10 & 255];
            }
            if (((int) ((j4 + 7) >> 3)) < jVar.c()) {
                k9.g gVar2 = new k9.g();
                int[] iArr2 = d0.f4020a;
                int c10 = jVar.c();
                long j10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < c10; i12++) {
                    byte f11 = jVar.f(i12);
                    byte[] bArr2 = z8.b.f12133a;
                    int i13 = f11 & 255;
                    int i14 = d0.f4020a[i13];
                    byte b10 = d0.f4021b[i13];
                    j10 = (j10 << b10) | i14;
                    i11 += b10;
                    while (i11 >= 8) {
                        i11 -= 8;
                        gVar2.K((int) (j10 >> i11));
                    }
                }
                if (i11 > 0) {
                    gVar2.K((int) ((255 >>> i11) | (j10 << (8 - i11))));
                }
                k9.j h10 = gVar2.h(gVar2.f6521b);
                e(h10.c(), 127, 128);
                gVar.I(h10);
                return;
            }
        }
        e(jVar.c(), 127, 0);
        gVar.I(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.e.d(java.util.ArrayList):void");
    }

    public final void e(int i10, int i11, int i12) {
        k9.g gVar = this.f4024b;
        if (i10 < i11) {
            gVar.K(i10 | i12);
            return;
        }
        gVar.K(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            gVar.K(128 | (i13 & 127));
            i13 >>>= 7;
        }
        gVar.K(i13);
    }
}
