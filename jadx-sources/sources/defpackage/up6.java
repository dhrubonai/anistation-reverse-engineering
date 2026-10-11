package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class up6 extends t36 implements kc2 {
    public /* synthetic */ or2 x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up6(String str, vz0 vz0Var) {
        super(4, vz0Var);
        this.y = str;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        up6 up6Var = new up6(this.y, (vz0) obj4);
        up6Var.x = (or2) obj2;
        pn6 pn6Var = pn6.a;
        up6Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        or2 or2Var = this.x;
        m37.N(obj);
        if (!((Map) or2Var.c.x).containsKey("User-Agent")) {
            yk3 yk3Var = vp6.a;
            if (nx7.N(yk3Var)) {
                yk3Var.h("Adding User-Agent header: agent for " + or2Var.a);
            }
            or2Var.c.h("User-Agent", this.y.toString());
        }
        return pn6.a;
    }
}
