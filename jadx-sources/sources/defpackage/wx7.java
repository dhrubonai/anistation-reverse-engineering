package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wx7 implements r26 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ wx7(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.r26
    public final Object get() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                Object obj2 = sx7.j;
                return new u48((ArrayList) obj);
            default:
                g48 g48Var = (g48) obj;
                p04 p04Var = (p04) g48Var.c.get();
                p04Var.getClass();
                fz7 fz7Var = (fz7) g48Var.b.get();
                fz7Var.getClass();
                ww7 ww7Var = fz7Var.a;
                o76 b2 = o76.b();
                b2.d = new uw7(ww7Var);
                b2.a = new q12[]{w65.q};
                b2.b = false;
                x b3 = fz7.b(ww7Var.d(0, b2.a()));
                z zVar = new z(b3, cz7.class, nh7.e);
                b3.a(zVar, kb0.I(p04Var, zVar));
                g3 q = h3.q(zVar, new qn3(g48Var, (byte) 2), p04Var);
                q.a(new d48(q, (byte) 0), p04Var);
                return q;
        }
    }
}
