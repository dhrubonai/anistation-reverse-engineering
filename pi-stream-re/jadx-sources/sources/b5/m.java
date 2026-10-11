package b5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1532b;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f1532b = bArr;
    }

    @Override // b5.l
    public final byte[] b() {
        return this.f1532b;
    }
}
