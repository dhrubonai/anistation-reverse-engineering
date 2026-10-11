package defpackage;

import android.os.Looper;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d75 extends g33 {
    public final /* synthetic */ x65 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d75(String[] strArr, x65 x65Var) {
        super(strArr);
        this.b = x65Var;
    }

    @Override // defpackage.g33
    public final void a(Set set) {
        boolean z;
        set.getClass();
        rr n = rr.n();
        a92 a92Var = new a92(this.b, (byte) 15);
        n.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a92Var.run();
        } else {
            n.o(a92Var);
        }
    }
}
