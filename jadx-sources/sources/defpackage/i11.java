package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i11 extends x93 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i11(Object obj, Object obj2, byte b) {
        super(1);
        this.y = b;
        this.z = obj;
        this.A = obj2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.y;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.z;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                wf0 wf0Var = (wf0) obj2;
                if (th != null) {
                    if (th instanceof CancellationException) {
                        wf0Var.d = true;
                        zf0 zf0Var = wf0Var.b;
                        if (zf0Var != null && zf0Var.y.cancel(true)) {
                            wf0Var.a = null;
                            wf0Var.b = null;
                            wf0Var.c = null;
                        }
                    } else {
                        wf0Var.b(th);
                    }
                } else {
                    wf0Var.a(((oc1) obj3).C());
                }
                return pn6Var;
            default:
                ((dm4) obj).f((em4) obj2, 0, 0, ((r97) obj3).L);
                return pn6Var;
        }
    }
}
