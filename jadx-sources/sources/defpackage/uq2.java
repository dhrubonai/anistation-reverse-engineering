package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class uq2 extends ea1 {
    @Override // defpackage.ea1
    public final Object a(Object obj) {
        int[] iArr = (int[]) obj;
        Arrays.fill(iArr, 0, iArr.length, -1);
        return iArr;
    }

    @Override // defpackage.ea1
    public final Object l() {
        int[] iArr = new int[768];
        for (int i = 0; i < 768; i++) {
            iArr[i] = -1;
        }
        return iArr;
    }
}
