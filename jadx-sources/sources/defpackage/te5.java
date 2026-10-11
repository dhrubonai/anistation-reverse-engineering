package defpackage;

import com.anistation.model.Page;
import com.anistation.model.Resource;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class te5 extends t36 implements ic2 {
    public final /* synthetic */ Page A;
    public /* synthetic */ Object x;
    public final /* synthetic */ af5 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te5(af5 af5Var, String str, Page page, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = af5Var;
        this.z = str;
        this.A = page;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        te5 te5Var = new te5(this.y, this.z, this.A, vz0Var);
        te5Var.x = obj;
        return te5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        te5 te5Var = (te5) create((Resource) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        te5Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        if ((r1 instanceof com.anistation.model.Resource.Idle) != false) goto L38;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
