package d2;

import c1.p0;
import java.util.Collections;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f3195a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3196b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3197c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3198d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3199e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3200f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3201g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3202h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3203i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3204j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.appcompat.widget.a0 f3205k;

    /* renamed from: l, reason: collision with root package name */
    public final p0 f3206l;

    public v(byte[] bArr, int i10) {
        f1.s sVar = new f1.s(bArr, 0, (Object) null);
        sVar.o(i10 * 8);
        this.f3195a = sVar.i(16);
        this.f3196b = sVar.i(16);
        this.f3197c = sVar.i(24);
        this.f3198d = sVar.i(24);
        int i11 = sVar.i(20);
        this.f3199e = i11;
        this.f3200f = d(i11);
        this.f3201g = sVar.i(3) + 1;
        int i12 = sVar.i(5) + 1;
        this.f3202h = i12;
        this.f3203i = a(i12);
        int i13 = sVar.i(4);
        int i14 = sVar.i(32);
        int i15 = f1.b0.f3799a;
        this.f3204j = ((i13 & 4294967295L) << 32) | (i14 & 4294967295L);
        this.f3205k = null;
        this.f3206l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j4 = this.f3204j;
        if (j4 == 0) {
            return -9223372036854775807L;
        }
        return (j4 * 1000000) / this.f3199e;
    }

    public final c1.v c(byte[] bArr, p0 p0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f3198d;
        if (i10 <= 0) {
            i10 = -1;
        }
        p0 p0Var2 = this.f3206l;
        if (p0Var2 != null) {
            p0Var = p0Var2.e(p0Var);
        }
        c1.u k10 = a3.g.k("audio/flac");
        k10.f1909m = i10;
        k10.f1920y = this.f3201g;
        k10.f1921z = this.f3199e;
        k10.A = f1.b0.y(this.f3202h);
        k10.f1910n = Collections.singletonList(bArr);
        k10.f1906j = p0Var;
        return new c1.v(k10);
    }

    public v(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j4, androidx.appcompat.widget.a0 a0Var, p0 p0Var) {
        this.f3195a = i10;
        this.f3196b = i11;
        this.f3197c = i12;
        this.f3198d = i13;
        this.f3199e = i14;
        this.f3200f = d(i14);
        this.f3201g = i15;
        this.f3202h = i16;
        this.f3203i = a(i16);
        this.f3204j = j4;
        this.f3205k = a0Var;
        this.f3206l = p0Var;
    }
}
