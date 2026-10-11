package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class mm6 extends ut4 {
    public short[] a;
    public int b;

    @Override // defpackage.ut4
    public final Object a() {
        return new lm6(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.ut4
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.ut4
    public final int d() {
        return this.b;
    }
}
