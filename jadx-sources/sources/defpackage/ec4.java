package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ec4 {
    public static final Object[] a = new Object[0];
    public static final f44 b = new f44(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        ze0.g(qx1.l("Index ", i, " is out of bounds. The list has ", size, " elements."));
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
            }
            ze0.g(qx1.i(i, "fromIndex (", ") is less than 0."));
            return;
        }
        ze0.k(qx1.l("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
    }
}
