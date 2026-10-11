package defpackage;

import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class er2 extends t36 implements jc2 {
    public final /* synthetic */ Charset A;
    public /* synthetic */ or2 x;
    public /* synthetic */ Object y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er2(String str, Charset charset, vz0 vz0Var) {
        super(3, vz0Var);
        this.z = str;
        this.A = charset;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        er2 er2Var = new er2(this.z, this.A, (vz0) obj3);
        er2Var.x = (or2) obj;
        er2Var.y = obj2;
        return er2Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        jz0 jz0Var;
        Charset charset;
        or2 or2Var = this.x;
        Object obj2 = this.y;
        m37.N(obj);
        yk3 yk3Var = gr2.a;
        String str = this.z;
        if (str != null && or2Var.c.r("Accept-Charset") == null) {
            yk3 yk3Var2 = gr2.a;
            if (nx7.N(yk3Var2)) {
                StringBuilder n = h11.n("Adding Accept-Charset=", str, " to ");
                n.append(or2Var.a);
                yk3Var2.h(n.toString());
            }
            kk2 kk2Var = or2Var.c;
            kk2Var.F(str);
            List q = kk2Var.q("Accept-Charset");
            q.clear();
            q.add(str);
        }
        if (obj2 instanceof String) {
            jz0 B = n77.B(or2Var);
            if (B != null && !a34.i(B.c, iz0.a.c)) {
                return null;
            }
            String str2 = (String) obj2;
            if (B == null) {
                jz0Var = iz0.a;
            } else {
                jz0Var = B;
            }
            if (B == null || (charset = mz0.a(B)) == null) {
                charset = this.A;
            }
            yk3 yk3Var3 = gr2.a;
            if (nx7.N(yk3Var3)) {
                yk3Var3.h("Sending request body to " + or2Var.a + " as text/plain with charset " + charset);
            }
            int i = mz0.a;
            jz0Var.getClass();
            charset.getClass();
            String name = charset.name();
            name.getClass();
            return new m86(str2, jz0Var.c(name));
        }
        return null;
    }
}
