package defpackage;

import com.anistation.model.Resource;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pn2 extends t36 implements ic2 {
    public /* synthetic */ Object x;
    public final /* synthetic */ rn2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn2(rn2 rn2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = rn2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        pn2 pn2Var = new pn2(this.y, vz0Var);
        pn2Var.x = obj;
        return pn2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        pn2 pn2Var = (pn2) create((Resource) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        pn2Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        tm6 tm6Var;
        List list;
        Resource resource = (Resource) this.x;
        m37.N(obj);
        if (resource instanceof Resource.Success) {
            sx5 sx5Var = this.y.e;
            do {
                value = sx5Var.getValue();
                tm6Var = (tm6) value;
                list = (List) ((Resource.Success) resource).getData();
                if (list == null) {
                    list = nt1.x;
                }
            } while (!sx5Var.j(value, tm6.a(tm6Var, null, list, 0, null, null, false, 61)));
        }
        return pn6.a;
    }
}
