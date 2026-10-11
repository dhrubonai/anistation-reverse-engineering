package defpackage;

import android.os.Looper;
import android.view.View;
import androidx.work.impl.model.WorkTagDao_Impl;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class i87 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i87(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        pn6 insert$lambda$0;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                insert$lambda$0 = WorkTagDao_Impl.insert$lambda$0((WorkTagDao_Impl) obj3, (g87) obj2, (g85) obj);
                return insert$lambda$0;
            case 1:
                b97 b97Var = (b97) obj3;
                os0 os0Var = (os0) obj2;
                yt0 yt0Var = (yt0) obj;
                if (!b97Var.z) {
                    og3 d = yt0Var.d();
                    View view = yt0Var.a;
                    fg3 lifecycle = d.getLifecycle();
                    b97Var.B = os0Var;
                    if (b97Var.A == null) {
                        if (!a34.i(Looper.myLooper(), view.getHandler().getLooper())) {
                            view.post(new sp5(b97Var, lifecycle, (byte) 18));
                        } else {
                            b97Var.A = lifecycle;
                            lifecycle.a(b97Var);
                        }
                    } else if (((rg3) lifecycle).i.compareTo(eg3.z) >= 0) {
                        b97Var.y.B(new os0(-1723985096, true, new df(b97Var, yt0Var, os0Var, (byte) 16)));
                    }
                }
                return pn6Var;
            default:
                ((dm4) obj).f((em4) obj3, 0, 0, ((s97) obj2).L);
                return pn6Var;
        }
    }
}
