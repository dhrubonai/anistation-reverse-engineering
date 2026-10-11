package f9;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4035a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4036b = new int[10];

    public final int a() {
        if ((this.f4035a & 128) != 0) {
            return this.f4036b[7];
        }
        return 65535;
    }

    public final void b(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f4036b;
            if (i10 < iArr.length) {
                this.f4035a = (1 << i10) | this.f4035a;
                iArr[i10] = i11;
            }
        }
    }
}
