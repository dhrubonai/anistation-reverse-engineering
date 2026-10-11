package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class vy0 extends t36 implements lc2 {
    public final /* synthetic */ ArrayList A;
    public final /* synthetic */ cn0 B;
    public final /* synthetic */ Set C;
    public boolean x;
    public /* synthetic */ or2 y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(cn0 cn0Var, vz0 vz0Var, ArrayList arrayList, Set set) {
        super(5, vz0Var);
        this.A = arrayList;
        this.B = cn0Var;
        this.C = set;
    }

    @Override // defpackage.lc2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vy0 vy0Var = new vy0(this.B, (vz0) obj5, this.A, this.C);
        vy0Var.y = (or2) obj2;
        vy0Var.z = obj3;
        return vy0Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        or2 or2Var = this.y;
        Object obj2 = this.z;
        boolean z = this.x;
        if (z) {
            if (z) {
                m37.N(obj);
                return obj;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m37.N(obj);
        this.y = null;
        this.z = null;
        this.x = true;
        Object a = zy0.a(this.A, this.B, this.C, or2Var, obj2, this);
        w11 w11Var = w11.x;
        if (a == w11Var) {
            return w11Var;
        }
        return a;
    }
}
