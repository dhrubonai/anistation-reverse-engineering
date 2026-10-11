package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gy3 {
    public final l33 a;
    public final st3 b;
    public final HashMap c;

    public gy3(Context context, st3 st3Var) {
        l33 l33Var = new l33(context);
        this.c = new HashMap();
        this.a = l33Var;
        this.b = st3Var;
    }

    public final synchronized gj6 a(String str) {
        if (this.c.containsKey(str)) {
            return (gj6) this.c.get(str);
        }
        CctBackendFactory g = this.a.g(str);
        if (g == null) {
            return null;
        }
        st3 st3Var = this.b;
        gj6 create = g.create(new vx((Context) st3Var.x, (un0) st3Var.y, (un0) st3Var.z, str));
        this.c.put(str, create);
        return create;
    }
}
