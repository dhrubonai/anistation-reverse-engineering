package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class n0 implements x73 {
    public Object a() {
        return new ArrayList();
    }

    public int b(Object obj) {
        ut4 ut4Var = (ut4) obj;
        ut4Var.getClass();
        return ut4Var.d();
    }

    public void c(Object obj) {
        ut4 ut4Var = (ut4) obj;
        ut4Var.getClass();
        ut4Var.b(-1);
    }

    public Iterator d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.ne1
    public Object deserialize(l61 l61Var) {
        return merge(l61Var, null);
    }

    public int e(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    public void f(int i, gu0 gu0Var, Object obj) {
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
    }

    public abstract void g(int i, gu0 gu0Var, Object obj);

    /* JADX WARN: Type inference failed for: r0v1, types: [j70, java.lang.Object] */
    public Object h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        ?? obj2 = new Object();
        obj2.a = zArr;
        obj2.b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    public Object i(Object obj) {
        ut4 ut4Var = (ut4) obj;
        ut4Var.getClass();
        return ut4Var.a();
    }

    public final Object merge(l61 l61Var, Object obj) {
        Object a;
        l61Var.getClass();
        if (obj != null) {
            a = h(obj);
        } else {
            a = a();
        }
        int b = b(a);
        gu0 c = l61Var.c(getDescriptor());
        if (!c.decodeSequentially()) {
            while (true) {
                int i = c.i(getDescriptor());
                if (i == -1) {
                    break;
                }
                g(i + b, c, a);
            }
        } else {
            getDescriptor().getClass();
            c(a);
            f(b, c, a);
        }
        c.a(getDescriptor());
        return i(a);
    }
}
