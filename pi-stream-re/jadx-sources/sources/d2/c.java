package d2;

import c1.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f3100a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3101b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3102c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3103d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3104e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3105f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3106g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3107h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3108i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3109j;

    /* renamed from: k, reason: collision with root package name */
    public final String f3110k;

    public /* synthetic */ c(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.f3100a = list;
        this.f3101b = i10;
        this.f3102c = i11;
        this.f3103d = i12;
        this.f3104e = i13;
        this.f3105f = i14;
        this.f3106g = i15;
        this.f3107h = i16;
        this.f3108i = i17;
        this.f3109j = f10;
        this.f3110k = str;
    }

    public static c a(f1.t tVar) {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        String str;
        try {
            tVar.H(4);
            int v9 = (tVar.v() & 3) + 1;
            if (v9 != 3) {
                ArrayList arrayList = new ArrayList();
                int v10 = tVar.v() & 31;
                int i17 = 0;
                while (true) {
                    bArr = com.bumptech.glide.d.f2190e;
                    if (i17 >= v10) {
                        break;
                    }
                    int A = tVar.A();
                    int i18 = tVar.f3859b;
                    tVar.H(A);
                    byte[] bArr2 = tVar.f3858a;
                    byte[] bArr3 = new byte[A + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i18, bArr3, 4, A);
                    arrayList.add(bArr3);
                    i17++;
                }
                int v11 = tVar.v();
                for (int i19 = 0; i19 < v11; i19++) {
                    int A2 = tVar.A();
                    int i20 = tVar.f3859b;
                    tVar.H(A2);
                    byte[] bArr4 = tVar.f3858a;
                    byte[] bArr5 = new byte[A2 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i20, bArr5, 4, A2);
                    arrayList.add(bArr5);
                }
                if (v10 > 0) {
                    g1.f d10 = g1.g.d((byte[]) arrayList.get(0), v9, ((byte[]) arrayList.get(0)).length);
                    int i21 = d10.f4322e;
                    int i22 = d10.f4323f;
                    int i23 = d10.f4325h + 8;
                    int i24 = d10.f4326i + 8;
                    int i25 = d10.f4332p;
                    int i26 = d10.f4333q;
                    int i27 = d10.f4334r;
                    float f11 = d10.f4324g;
                    str = com.bumptech.glide.d.d(d10.f4318a, d10.f4319b, d10.f4320c);
                    i14 = i25;
                    i15 = i26;
                    i16 = i27;
                    f10 = f11;
                    i10 = i21;
                    i11 = i22;
                    i12 = i23;
                    i13 = i24;
                } else {
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    i15 = -1;
                    i16 = -1;
                    f10 = 1.0f;
                    str = null;
                }
                return new c(arrayList, v9, i10, i11, i12, i13, i14, i15, i16, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw r0.a("Error parsing AVC config", e10);
        }
    }

    public static c b(f1.t tVar) {
        List singletonList;
        int i10;
        int i11;
        try {
            tVar.H(21);
            int v9 = tVar.v() & 3;
            int v10 = tVar.v();
            int i12 = tVar.f3859b;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < v10; i15++) {
                tVar.H(1);
                int A = tVar.A();
                for (int i16 = 0; i16 < A; i16++) {
                    int A2 = tVar.A();
                    i14 += A2 + 4;
                    tVar.H(A2);
                }
            }
            tVar.G(i12);
            byte[] bArr = new byte[i14];
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            float f10 = 1.0f;
            String str = null;
            int i24 = 0;
            int i25 = 0;
            while (i24 < v10) {
                int v11 = tVar.v() & 63;
                int A3 = tVar.A();
                int i26 = i13;
                while (i26 < A3) {
                    int A4 = tVar.A();
                    int i27 = v10;
                    System.arraycopy(g1.g.f4335a, i13, bArr, i25, 4);
                    int i28 = i25 + 4;
                    System.arraycopy(tVar.f3858a, tVar.f3859b, bArr, i28, A4);
                    if (v11 == 33 && i26 == 0) {
                        g1.d c6 = g1.g.c(bArr, i28, i28 + A4);
                        int i29 = c6.f4310i;
                        i18 = c6.f4311j;
                        i19 = c6.f4306e + 8;
                        i20 = c6.f4307f + 8;
                        int i30 = c6.f4313l;
                        int i31 = c6.f4314m;
                        int i32 = c6.f4315n;
                        float f11 = c6.f4312k;
                        i10 = v11;
                        i11 = A3;
                        i17 = i29;
                        str = com.bumptech.glide.d.f(c6.f4302a, c6.f4303b, c6.f4304c, c6.f4305d, c6.f4308g, c6.f4309h);
                        i22 = i31;
                        i21 = i30;
                        f10 = f11;
                        i23 = i32;
                    } else {
                        i10 = v11;
                        i11 = A3;
                    }
                    i25 = i28 + A4;
                    tVar.H(A4);
                    i26++;
                    v10 = i27;
                    v11 = i10;
                    A3 = i11;
                    i13 = 0;
                }
                i24++;
                i13 = 0;
            }
            if (i14 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new c(singletonList, v9 + 1, i17, i18, i19, i20, i21, i22, i23, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw r0.a("Error parsing HEVC config", e10);
        }
    }
}
