package defpackage;

import com.anistation.model.Resource;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a27 extends t36 implements ic2 {
    public /* synthetic */ Object x;
    public final /* synthetic */ v27 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a27(v27 v27Var, String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = v27Var;
        this.z = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        a27 a27Var = new a27(this.y, this.z, vz0Var);
        a27Var.x = obj;
        return a27Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        a27 a27Var = (a27) create((Resource) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        a27Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (r0.intValue() != r4) goto L35;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a27.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
