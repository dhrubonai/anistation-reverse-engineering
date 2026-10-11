package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ki2 {
    public final int a;

    public ki2(int i) {
        boolean z;
        this.a = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            hz2.a("Provided count should be larger than zero");
        }
    }

    public final ArrayList a(int i, int i2) {
        int i3;
        int i4 = this.a;
        int i5 = i - ((i4 - 1) * i2);
        int i6 = i5 / i4;
        int i7 = i5 % i4;
        ArrayList arrayList = new ArrayList(i4);
        for (int i8 = 0; i8 < i4; i8++) {
            if (i8 < i7) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            arrayList.add(Integer.valueOf(i3 + i6));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ki2) {
            if (this.a == ((ki2) obj).a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
