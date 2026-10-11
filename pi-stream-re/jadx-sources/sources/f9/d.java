package f9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import r6.h0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public final k9.q f4015d;

    /* renamed from: g, reason: collision with root package name */
    public int f4018g;

    /* renamed from: h, reason: collision with root package name */
    public int f4019h;

    /* renamed from: a, reason: collision with root package name */
    public final int f4012a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public int f4013b = 4096;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4014c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public c[] f4016e = new c[8];

    /* renamed from: f, reason: collision with root package name */
    public int f4017f = 7;

    public d(v vVar) {
        this.f4015d = new k9.q(vVar);
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f4016e.length;
            while (true) {
                length--;
                i11 = this.f4017f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                c cVar = this.f4016e[length];
                h0.q(cVar);
                int i13 = cVar.f4004c;
                i10 -= i13;
                this.f4019h -= i13;
                this.f4018g--;
                i12++;
            }
            c[] cVarArr = this.f4016e;
            System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f4018g);
            this.f4017f += i12;
        }
        return i12;
    }

    public final k9.j b(int i10) {
        boolean z9;
        if (i10 >= 0 && i10 <= f.f4033a.length - 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return f.f4033a[i10].f4002a;
        }
        int length = this.f4017f + 1 + (i10 - f.f4033a.length);
        if (length >= 0) {
            c[] cVarArr = this.f4016e;
            if (length < cVarArr.length) {
                c cVar = cVarArr[length];
                h0.q(cVar);
                return cVar.f4002a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    public final void c(c cVar) {
        this.f4014c.add(cVar);
        int i10 = this.f4013b;
        int i11 = cVar.f4004c;
        if (i11 > i10) {
            c[] cVarArr = this.f4016e;
            Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
            this.f4017f = this.f4016e.length - 1;
            this.f4018g = 0;
            this.f4019h = 0;
            return;
        }
        a((this.f4019h + i11) - i10);
        int i12 = this.f4018g + 1;
        c[] cVarArr2 = this.f4016e;
        if (i12 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f4017f = this.f4016e.length - 1;
            this.f4016e = cVarArr3;
        }
        int i13 = this.f4017f;
        this.f4017f = i13 - 1;
        this.f4016e[i13] = cVar;
        this.f4018g++;
        this.f4019h += i11;
    }

    public final k9.j d() {
        boolean z9;
        int i10;
        k9.q qVar = this.f4015d;
        byte readByte = qVar.readByte();
        byte[] bArr = z8.b.f12133a;
        int i11 = readByte & 255;
        int i12 = 0;
        if ((i11 & 128) == 128) {
            z9 = true;
        } else {
            z9 = false;
        }
        long e10 = e(i11, 127);
        if (z9) {
            k9.g gVar = new k9.g();
            int[] iArr = d0.f4020a;
            h0.u(qVar, "source");
            s0.b bVar = d0.f4022c;
            s0.b bVar2 = bVar;
            int i13 = 0;
            for (long j4 = 0; j4 < e10; j4++) {
                byte readByte2 = qVar.readByte();
                byte[] bArr2 = z8.b.f12133a;
                i12 = (i12 << 8) | (readByte2 & 255);
                i13 += 8;
                while (i13 >= 8) {
                    int i14 = i13 - 8;
                    s0.b[] bVarArr = (s0.b[]) bVar2.f9729c;
                    h0.q(bVarArr);
                    bVar2 = bVarArr[(i12 >>> i14) & 255];
                    h0.q(bVar2);
                    if (((s0.b[]) bVar2.f9729c) == null) {
                        gVar.K(bVar2.f9727a);
                        i13 -= bVar2.f9728b;
                        bVar2 = bVar;
                    } else {
                        i13 = i14;
                    }
                }
            }
            while (i13 > 0) {
                s0.b[] bVarArr2 = (s0.b[]) bVar2.f9729c;
                h0.q(bVarArr2);
                s0.b bVar3 = bVarArr2[(i12 << (8 - i13)) & 255];
                h0.q(bVar3);
                if (((s0.b[]) bVar3.f9729c) != null || (i10 = bVar3.f9728b) > i13) {
                    break;
                }
                gVar.K(bVar3.f9727a);
                i13 -= i10;
                bVar2 = bVar;
            }
            return gVar.h(gVar.f6521b);
        }
        return qVar.h(e10);
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte readByte = this.f4015d.readByte();
            byte[] bArr = z8.b.f12133a;
            int i14 = readByte & 255;
            if ((i14 & 128) != 0) {
                i11 += (i14 & 127) << i13;
                i13 += 7;
            } else {
                return i11 + (i14 << i13);
            }
        }
    }
}
