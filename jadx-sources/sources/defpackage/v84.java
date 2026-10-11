package defpackage;

import android.content.Context;
import com.unity3d.services.core.network.model.HttpRequest;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v84 implements s12 {
    public final d46 a;
    public final d46 b;
    public final l33 c;
    public final d46 d;

    public v84(sb2 sb2Var) {
        t53 t53Var = new t53((byte) 28);
        u84 u84Var = u84.x;
        t53 t53Var2 = new t53((byte) 29);
        this.a = new d46(sb2Var);
        this.b = bx7.C(t53Var);
        l33 l33Var = new l33((byte) 18, false);
        l33Var.y = u84Var;
        l33Var.z = nr1.R;
        this.c = l33Var;
        this.d = bx7.C(t53Var2);
    }

    @Override // defpackage.s12
    public final t12 a(Object obj, mg4 mg4Var, kz4 kz4Var) {
        lp6 lp6Var = (lp6) obj;
        if (!a34.i(lp6Var.c, "http") && !a34.i(lp6Var.c, HttpRequest.DEFAULT_SCHEME)) {
            return null;
        }
        String str = lp6Var.a;
        d46 d46Var = this.a;
        d46 d46Var2 = new d46(new vt0(kz4Var, (byte) 27));
        d46 d46Var3 = this.b;
        l33 l33Var = this.c;
        Context context = mg4Var.a;
        Object obj2 = l33Var.z;
        nr1 nr1Var = nr1.R;
        if (obj2 == nr1Var) {
            synchronized (l33Var) {
                obj2 = l33Var.z;
                if (obj2 == nr1Var) {
                    ub2 ub2Var = (ub2) l33Var.y;
                    ub2Var.getClass();
                    Object invoke = ub2Var.invoke(context);
                    l33Var.z = invoke;
                    l33Var.y = null;
                    obj2 = invoke;
                }
            }
        }
        return new z84(str, mg4Var, d46Var, d46Var2, d46Var3, new xy2(obj2), this.d);
    }
}
