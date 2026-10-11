package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tw implements ri3, ay0, hp5 {
    public final /* synthetic */ long x;

    @Override // defpackage.ay0
    public void accept(Object obj) {
        ((fq4) obj).Q(this.x);
    }

    @Override // defpackage.hp5
    public long get() {
        return this.x;
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        af2 af2Var;
        h71 h71Var = (h71) obj;
        l71 l71Var = h71Var.a;
        if (h71Var == l71Var.j && (af2Var = l71Var.n) != null) {
            jp3 jp3Var = (jp3) af2Var.y;
            jp3Var.r1 = true;
            pz2 pz2Var = jp3Var.f1;
            Handler handler = (Handler) pz2Var.y;
            if (handler != null) {
                handler.post(new fw(pz2Var, this.x, (byte) 0));
            }
        }
    }
}
