package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class em6 extends ut4 {
    public long[] a;
    public int b;

    @Override // defpackage.ut4
    public final Object a() {
        return new dm6(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.ut4
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.ut4
    public final int d() {
        return this.b;
    }
}
