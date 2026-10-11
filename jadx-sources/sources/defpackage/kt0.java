package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kt0 extends RuntimeException {
    public final int A;
    public final f44 x;
    public final f44 y;
    public final r34 z;

    public kt0(f44 f44Var, f44 f44Var2, r34 r34Var, int i, Exception exc) {
        super(exc);
        this.x = f44Var;
        this.y = f44Var2;
        this.z = r34Var;
        this.A = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        ri5 V = io3.V(new jt0(this, null));
        if (!V.hasNext()) {
            list = nt1.x;
        } else {
            Object next = V.next();
            if (!V.hasNext()) {
                list = te4.H(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (V.hasNext()) {
                    arrayList.add(V.next());
                }
                list = arrayList;
            }
        }
        return vz5.v("\n            |Failed to execute op number " + this.A + ":\n            |" + yo0.q0(yo0.E0(50, list), "\n", null, null, null, 62) + "\n            ");
    }
}
