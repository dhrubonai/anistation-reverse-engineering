package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wl1 extends t36 implements jc2 {
    public /* synthetic */ Throwable A;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ x42 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl1(int i, vz0 vz0Var, byte b) {
        super(i, vz0Var);
        this.x = b;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = 3;
        x42 x42Var = (x42) obj;
        Throwable th = (Throwable) obj2;
        vz0 vz0Var = (vz0) obj3;
        switch (b) {
            case 0:
                wl1 wl1Var = new wl1(i, vz0Var, (byte) 0);
                wl1Var.z = x42Var;
                wl1Var.A = th;
                return wl1Var.invokeSuspend(pn6Var);
            default:
                wl1 wl1Var2 = new wl1(i, vz0Var, (byte) 1);
                wl1Var2.z = x42Var;
                wl1Var2.A = th;
                return wl1Var2.invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        boolean z = true;
        switch (b) {
            case 0:
                x42 x42Var = this.z;
                Throwable th = this.A;
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                if (th instanceof IOException) {
                    j44 j44Var = new j44(z);
                    this.z = null;
                    this.A = null;
                    this.y = true;
                    if (x42Var.emit(j44Var, this) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                throw th;
            default:
                x42 x42Var2 = this.z;
                Throwable th2 = this.A;
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
                if (th2 instanceof IOException) {
                    j44 j44Var2 = new j44(z);
                    this.z = null;
                    this.A = null;
                    this.y = true;
                    if (x42Var2.emit(j44Var2, this) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                throw th2;
        }
    }
}
