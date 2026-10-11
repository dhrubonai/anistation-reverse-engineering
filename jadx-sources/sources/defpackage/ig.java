package defpackage;

import com.anistation.android.presence.DiscordPresenceNativeBridge;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ig extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(boolean z, long j, pi4 pi4Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 2;
        this.y = z;
        this.z = j;
        this.A = pi4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.A;
        switch (b) {
            case 0:
                return new ig(obj2, this.z, vz0Var, (byte) 0);
            case 1:
                return new ig(obj2, this.z, vz0Var, (byte) 1);
            case 2:
                return new ig(this.y, this.z, (pi4) obj2, vz0Var);
            default:
                return new ig(obj2, this.z, vz0Var, (byte) 3);
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
                return ((ig) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((ig) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                ((ig) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                return ((ig) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        long j = this.z;
        Object obj2 = this.A;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                g84 g84Var = ((jg) obj2).x;
                this.y = true;
                if (g84Var.b(j, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                u64 u64Var = (u64) obj2;
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    if (u64Var.d) {
                        DiscordPresenceNativeBridge.a.a();
                        m18 m18Var = fq1.y;
                        long W = w65.W(1000L, jq1.MILLISECONDS);
                        this.y = true;
                        if (x97.v(W, this) == w11Var) {
                            return w11Var;
                        }
                    } else {
                        return pn6Var;
                    }
                }
                if (u64Var.b.get() == j) {
                    bx5 bx5Var = u64Var.c;
                    if (bx5Var != null) {
                        bx5Var.l(null);
                    }
                    u64Var.c = null;
                    DiscordPresenceNativeBridge.a.d();
                    u64Var.d = false;
                    return pn6Var;
                }
                return pn6Var;
            case 2:
                m37.N(obj);
                if (!this.y) {
                    ((pi4) obj2).i((float) j);
                }
                return pn6Var;
            default:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                wj wjVar = ((va6) obj2).S;
                xc4 xc4Var = new xc4(j);
                tw5 tw5Var = kh5.d;
                this.y = true;
                if (wj.a(wjVar, xc4Var, tw5Var, null, this, 12) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig(Object obj, long j, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.z = j;
    }
}
