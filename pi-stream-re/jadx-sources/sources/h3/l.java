package h3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4820e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f4821a;

    /* renamed from: b, reason: collision with root package name */
    public int f4822b;

    /* renamed from: c, reason: collision with root package name */
    public int f4823c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4824d = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f4821a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f4824d;
        int length = bArr2.length;
        int i13 = this.f4822b;
        if (length < i13 + i12) {
            this.f4824d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.f4824d, this.f4822b, i12);
        this.f4822b += i12;
    }
}
