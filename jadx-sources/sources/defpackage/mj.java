package defpackage;

import com.anistation.model.connectivity.NetworkState;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mj extends t36 implements ic2 {
    public final /* synthetic */ w44 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ w44 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj(w44 w44Var, w44 w44Var2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = w44Var;
        this.A = w44Var2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        w44 w44Var = this.A;
        w44 w44Var2 = this.z;
        switch (b) {
            case 0:
                return new mj(w44Var2, w44Var, vz0Var, (byte) 0);
            default:
                return new mj(w44Var2, w44Var, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((mj) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((mj) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        jq1 jq1Var = jq1.MILLISECONDS;
        w44 w44Var = this.z;
        w11 w11Var = w11.x;
        w44 w44Var2 = this.A;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    List list = sj.a;
                    if (((i46) w44Var.getValue()) != null && !((Boolean) w44Var2.getValue()).booleanValue()) {
                        m18 m18Var = fq1.y;
                        long W = w65.W(700L, jq1Var);
                        this.y = true;
                        if (x97.v(W, this) == w11Var) {
                            return w11Var;
                        }
                    } else {
                        return pn6Var;
                    }
                }
                List list2 = sj.a;
                if (!((Boolean) w44Var2.getValue()).booleanValue()) {
                    w44Var.setValue(null);
                    return pn6Var;
                }
                return pn6Var;
            default:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        w44Var2.setValue(NetworkState.Hidden);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                int ordinal = ((fy4) w44Var.getValue()).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        w44Var2.setValue(NetworkState.Offline);
                        return pn6Var;
                    }
                    ze0.l();
                    return null;
                }
                if (((NetworkState) w44Var2.getValue()) == NetworkState.Offline) {
                    w44Var2.setValue(NetworkState.BackOnline);
                    m18 m18Var2 = fq1.y;
                    long V = w65.V(3000, jq1Var);
                    this.y = true;
                    if (x97.v(V, this) == w11Var) {
                        return w11Var;
                    }
                    w44Var2.setValue(NetworkState.Hidden);
                    return pn6Var;
                }
                w44Var2.setValue(NetworkState.Hidden);
                return pn6Var;
        }
    }
}
