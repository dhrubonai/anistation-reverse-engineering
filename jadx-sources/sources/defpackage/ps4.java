package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ps4 extends t36 implements ic2 {
    public final /* synthetic */ ic2 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps4(ic2 ic2Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = ic2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        ic2 ic2Var = this.A;
        switch (b) {
            case 0:
                ps4 ps4Var = new ps4(ic2Var, vz0Var, (byte) 0);
                ps4Var.z = obj;
                return ps4Var;
            case 1:
                ps4 ps4Var2 = new ps4(ic2Var, vz0Var, (byte) 1);
                ps4Var2.z = obj;
                return ps4Var2;
            default:
                ps4 ps4Var3 = new ps4(ic2Var, vz0Var, (byte) 2);
                ps4Var3.z = obj;
                return ps4Var3;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((ps4) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((ps4) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((ps4) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        ic2 ic2Var = this.A;
        w11 w11Var = w11.x;
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
                    j44 j44Var = (j44) this.z;
                    this.y = true;
                    obj = ic2Var.invoke(j44Var, this);
                    if (obj == w11Var) {
                        return w11Var;
                    }
                }
                j44 j44Var2 = (j44) obj;
                j44Var2.getClass();
                ((AtomicBoolean) j44Var2.b.y).set(true);
                return j44Var2;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        j44 j44Var3 = (j44) this.z;
                        m37.N(obj);
                        return j44Var3;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                j44 j44Var4 = new j44(new LinkedHashMap(((j44) this.z).a()), false);
                this.z = j44Var4;
                this.y = true;
                if (ic2Var.invoke(j44Var4, this) == w11Var) {
                    return w11Var;
                }
                return j44Var4;
            default:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    v11 v11Var = (v11) this.z;
                    this.y = true;
                    if (ic2Var.invoke(v11Var, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6.a;
        }
    }
}
