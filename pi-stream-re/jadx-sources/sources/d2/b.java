package d2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f3093a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f3094b;

    /* renamed from: c, reason: collision with root package name */
    public int f3095c;

    /* renamed from: d, reason: collision with root package name */
    public int f3096d;

    /* renamed from: e, reason: collision with root package name */
    public int f3097e;

    /* renamed from: f, reason: collision with root package name */
    public int f3098f;

    /* renamed from: g, reason: collision with root package name */
    public int f3099g;

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.f3093a = i10;
        this.f3095c = i11;
        this.f3096d = i12;
        this.f3097e = i13;
        this.f3098f = i14;
        this.f3099g = i15;
        this.f3094b = bArr;
    }

    public final boolean a(int i10) {
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) == -2097152) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f3093a = i11;
        this.f3094b = p7.a0.f8647l[3 - i12];
        int i17 = p7.a0.f8648m[i14];
        this.f3096d = i17;
        int i18 = 2;
        if (i11 == 2) {
            this.f3096d = i17 / 2;
        } else if (i11 == 0) {
            this.f3096d = i17 / 4;
        }
        int i19 = (i10 >>> 9) & 1;
        int i20 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    i20 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i11 != 3) {
            i20 = 576;
        }
        this.f3099g = i20;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = p7.a0.f8649n[i13 - 1];
            } else {
                i16 = p7.a0.o[i13 - 1];
            }
            this.f3098f = i16;
            this.f3095c = (((i16 * 12) / this.f3096d) + i19) * 4;
        } else {
            int i21 = 144;
            if (i11 == 3) {
                if (i12 == 2) {
                    i15 = p7.a0.f8650p[i13 - 1];
                } else {
                    i15 = p7.a0.f8651q[i13 - 1];
                }
                this.f3098f = i15;
                this.f3095c = ((i15 * 144) / this.f3096d) + i19;
            } else {
                int i22 = p7.a0.f8652r[i13 - 1];
                this.f3098f = i22;
                if (i12 == 1) {
                    i21 = 72;
                }
                this.f3095c = ((i21 * i22) / this.f3096d) + i19;
            }
        }
        if (((i10 >> 6) & 3) == 3) {
            i18 = 1;
        }
        this.f3097e = i18;
        return true;
    }
}
