package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b37 extends g33 {
    public final i33 b;
    public final WeakReference c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b37(i33 i33Var, d75 d75Var) {
        super(d75Var.a);
        d75Var.getClass();
        this.b = i33Var;
        this.c = new WeakReference(d75Var);
    }

    @Override // defpackage.g33
    public final void a(Set set) {
        set.getClass();
        g33 g33Var = (g33) this.c.get();
        if (g33Var == null) {
            this.b.d(this);
        } else {
            g33Var.a(set);
        }
    }
}
