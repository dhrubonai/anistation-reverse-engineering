package defpackage;

import com.anistation.model.Resource;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bm5 extends t36 implements ic2 {
    public final /* synthetic */ xm6 A;
    public final /* synthetic */ tg5 B;
    public final /* synthetic */ tg5 C;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ hm5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm5(hm5 hm5Var, xm6 xm6Var, tg5 tg5Var, tg5 tg5Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = hm5Var;
        this.A = xm6Var;
        this.B = tg5Var;
        this.C = tg5Var2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        bm5 bm5Var = new bm5(this.z, this.A, this.B, this.C, vz0Var);
        bm5Var.y = obj;
        return bm5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((bm5) create((Resource) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Resource resource = (Resource) this.y;
        boolean z = this.x;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            if (resource != null) {
                if (resource instanceof Resource.Success) {
                    List list = (List) ((Resource.Success) resource).getData();
                    if (list == null) {
                        list = nt1.x;
                    }
                    cn cnVar = this.z.b;
                    boolean z2 = this.A.o;
                    this.y = null;
                    this.x = true;
                    obj = ((on) cnVar).d(list, z2, this);
                    w11 w11Var = w11.x;
                    if (obj == w11Var) {
                        return w11Var;
                    }
                } else if (resource instanceof Resource.Error) {
                    String message = ((Resource.Error) resource).getMessage();
                    if (message == null) {
                        message = "Anime list import failed";
                    }
                    this.C.invoke(message);
                }
            }
            return pn6.a;
        }
        this.B.invoke(new Integer(((Number) obj).intValue()));
        return pn6.a;
    }
}
