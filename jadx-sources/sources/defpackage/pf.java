package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pf extends t36 implements ic2 {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf(int i, vz0 vz0Var, byte b) {
        super(i, vz0Var);
        this.x = b;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new pf(2, vz0Var, (byte) 0);
            case 1:
                return new pf(2, vz0Var, (byte) 1);
            default:
                return new pf(2, vz0Var, (byte) 2);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((pf) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                ((pf) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((pf) create((wc5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                m37.N(obj);
                return Choreographer.getInstance();
            case 1:
                m37.N(obj);
                return pn6Var;
            default:
                m37.N(obj);
                return pn6Var;
        }
    }
}
