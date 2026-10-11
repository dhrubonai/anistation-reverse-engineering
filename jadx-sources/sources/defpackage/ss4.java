package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ss4 {
    public final String a;
    public final ap1 b;
    public final ub2 c;
    public final v11 d;
    public final Object e = new Object();
    public volatile qs4 f;

    public ss4(String str, ap1 ap1Var, ub2 ub2Var, v11 v11Var) {
        this.a = str;
        this.b = ap1Var;
        this.c = ub2Var;
        this.d = v11Var;
    }

    public final Object a(Object obj, w73 w73Var) {
        qs4 qs4Var;
        Context context = (Context) obj;
        context.getClass();
        w73Var.getClass();
        qs4 qs4Var2 = this.f;
        if (qs4Var2 == null) {
            synchronized (this.e) {
                try {
                    if (this.f == null) {
                        Context applicationContext = context.getApplicationContext();
                        e21 e21Var = this.b;
                        ub2 ub2Var = this.c;
                        applicationContext.getClass();
                        List list = (List) ub2Var.invoke(applicationContext);
                        v11 v11Var = this.d;
                        va1 va1Var = new va1(applicationContext, this, (byte) 24);
                        list.getClass();
                        i22 i22Var = new i22(l68.I, new nj4(va1Var, (byte) 3));
                        if (e21Var == null) {
                            e21Var = new r18((byte) 25);
                        }
                        this.f = new qs4(new qs4(new p51(i22Var, te4.H(new c0((Object) list, (vz0) null, (byte) 26)), e21Var, v11Var)));
                    }
                    qs4Var = this.f;
                    qs4Var.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return qs4Var;
        }
        return qs4Var2;
    }
}
