package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class iq4 {
    public static final void throwArrayMissingFieldException(int[] iArr, int[] iArr2, aj5 aj5Var) {
        iArr.getClass();
        iArr2.getClass();
        aj5Var.getClass();
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(aj5Var.f((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new xy3(aj5Var.a(), arrayList);
    }

    public static final void throwMissingFieldException(int i, int i2, aj5 aj5Var) {
        aj5Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(aj5Var.f(i4));
            }
            i3 >>>= 1;
        }
        throw new xy3(aj5Var.a(), arrayList);
    }
}
