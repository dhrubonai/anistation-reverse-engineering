package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tv1 extends r1 implements sv1, RandomAccess, Serializable {
    public final Enum[] x;

    public tv1(Enum[] enumArr) {
        enumArr.getClass();
        this.x = enumArr;
    }

    @Override // defpackage.m0
    public final int b() {
        return this.x.length;
    }

    @Override // defpackage.m0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        if (((Enum) ms.M0(this.x, r3.ordinal())) != r3) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.x;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        ze0.g(zo5.m("index: ", ", size: ", i, length));
        return null;
    }

    @Override // defpackage.r1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) ms.M0(this.x, ordinal)) != r3) {
            return -1;
        }
        return ordinal;
    }

    @Override // defpackage.r1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) ms.M0(this.x, ordinal)) != r3) {
            return -1;
        }
        return ordinal;
    }
}
