package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class td implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ vr4 y;

    public /* synthetic */ td(vr4 vr4Var, byte b) {
        this.x = b;
        this.y = vr4Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        Looper looper;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vr4 vr4Var = this.y;
        switch (b) {
            case 0:
                ha3 x = ((ha3) obj).x();
                x.getClass();
                vr4Var.q(x);
                return pn6Var;
            case 1:
                vr4Var.m166setPopupContentSizefhxjrPA((k13) obj);
                vr4Var.r();
                return pn6Var;
            default:
                sb2 sb2Var = (sb2) obj;
                Handler handler = vr4Var.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    sb2Var.invoke();
                } else {
                    Handler handler2 = vr4Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ca(sb2Var, (byte) 5));
                    }
                }
                return pn6Var;
        }
    }
}
