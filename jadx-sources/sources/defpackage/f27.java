package defpackage;

import com.anistation.model.Info;
import com.anistation.model.Resource;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f27 extends t36 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ v27 B;
    public v27 x;
    public Info y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f27(v27 v27Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = v27Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        f27 f27Var = new f27(this.B, vz0Var);
        f27Var.A = obj;
        return f27Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((f27) create((Resource) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r0 != r7) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x011e A[LOOP:0: B:7:0x0083->B:9:0x011e, LOOP_END] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f27.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
