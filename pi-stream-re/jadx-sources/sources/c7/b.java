package c7;

import a3.g;
import java.io.Serializable;
import r6.h0;
import x6.e;

/* loaded from: classes.dex */
public final class b extends e implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f2077a;

    public b(Enum[] enumArr) {
        h0.u(enumArr, "entries");
        this.f2077a = enumArr;
    }

    @Override // x6.b
    public final int b() {
        return this.f2077a.length;
    }

    @Override // x6.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Enum r02;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r52 = (Enum) obj;
        h0.u(r52, "element");
        int ordinal = r52.ordinal();
        Enum[] enumArr = this.f2077a;
        h0.u(enumArr, "<this>");
        if (ordinal >= 0 && ordinal <= enumArr.length - 1) {
            r02 = enumArr[ordinal];
        } else {
            r02 = null;
        }
        if (r02 != r52) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f2077a;
        int length = enumArr.length;
        if (i10 >= 0 && i10 < length) {
            return enumArr[i10];
        }
        throw new IndexOutOfBoundsException(g.p("index: ", i10, ", size: ", length));
    }

    @Override // x6.e, java.util.List
    public final int indexOf(Object obj) {
        Enum r22;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        h0.u(r52, "element");
        int ordinal = r52.ordinal();
        Enum[] enumArr = this.f2077a;
        h0.u(enumArr, "<this>");
        if (ordinal >= 0 && ordinal <= enumArr.length - 1) {
            r22 = enumArr[ordinal];
        } else {
            r22 = null;
        }
        if (r22 != r52) {
            return -1;
        }
        return ordinal;
    }

    @Override // x6.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r22 = (Enum) obj;
        h0.u(r22, "element");
        return indexOf(r22);
    }
}
