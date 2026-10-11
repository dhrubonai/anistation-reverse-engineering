package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import java.net.Proxy;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ng implements sb2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ng(jm6 jm6Var, String str, int i, Proxy proxy, ie0 ie0Var, String str2) {
        this.z = jm6Var;
        this.A = str;
        this.y = i;
        this.B = proxy;
        this.C = ie0Var;
        this.D = str2;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        Object obj = this.D;
        Object obj2 = this.C;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        switch (b) {
            case 0:
                KeyEvent.Callback callback = (View) obj;
                callback.getClass();
                return new sv6((Context) obj5, (ub2) obj4, (id2) obj3, (n95) obj2, this.y, (kh4) callback).getLayoutNode();
            default:
                ie0 ie0Var = (ie0) obj2;
                boolean g = ez5.g((jm6) obj5);
                je0 je0Var = ie0Var.B;
                dn0 dn0Var = ie0Var.E;
                l11 l11Var = ie0Var.G;
                n nVar = new n(ie0Var, (String) obj, (byte) 21);
                return new iu1((String) obj4, this.y, (Proxy) obj3, g, je0Var, dn0Var, l11Var, nVar);
        }
    }

    public /* synthetic */ ng(Context context, ub2 ub2Var, id2 id2Var, n95 n95Var, int i, View view) {
        this.z = context;
        this.A = ub2Var;
        this.B = id2Var;
        this.C = n95Var;
        this.y = i;
        this.D = view;
    }
}
