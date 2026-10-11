package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class le0 extends t36 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ nc0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le0(nc0 nc0Var, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.y = nc0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        nc0 nc0Var = this.y;
        switch (b) {
            case 0:
                return new le0(nc0Var, vz0Var, (byte) 0);
            default:
                return new le0(nc0Var, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                ((le0) create(vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((le0) create(vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        nc0 nc0Var = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                nc0Var.a(new SocketTimeoutException());
                return pn6Var;
            default:
                m37.N(obj);
                nc0Var.a(new SocketTimeoutException());
                return pn6Var;
        }
    }
}
