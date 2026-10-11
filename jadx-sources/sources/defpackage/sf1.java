package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class sf1 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ byte y;
    public final /* synthetic */ Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sf1(tf1 tf1Var, int i, Object obj) {
        this.x = (byte) 0;
        this.z = tf1Var;
        this.y = i;
        this.A = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        byte b2 = this.y;
        Object obj = this.A;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                ((uu4) ((tf1) obj2).c).p(b2, obj);
                return;
            case 1:
                tp1 tp1Var = (tp1) obj2;
                ((up1) obj).p(tp1Var.a, tp1Var.b, b2);
                return;
            default:
                Pair pair = (Pair) obj;
                ((xw3) obj2).b.i.p(((Integer) pair.first).intValue(), (jw3) pair.second, b2);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sf1(byte b, int i, Object obj, Object obj2) {
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.y = i;
    }
}
