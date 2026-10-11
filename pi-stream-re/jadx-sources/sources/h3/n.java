package h3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f4841f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f4842a;

    /* renamed from: b, reason: collision with root package name */
    public int f4843b;

    /* renamed from: c, reason: collision with root package name */
    public int f4844c;

    /* renamed from: d, reason: collision with root package name */
    public int f4845d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f4846e = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f4842a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f4846e;
        int length = bArr2.length;
        int i13 = this.f4844c;
        if (length < i13 + i12) {
            this.f4846e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.f4846e, this.f4844c, i12);
        this.f4844c += i12;
    }
}
