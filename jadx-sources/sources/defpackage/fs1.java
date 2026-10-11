package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fs1 extends tl7 {
    public final /* synthetic */ gs1 k;

    public fs1(gs1 gs1Var) {
        this.k = gs1Var;
    }

    @Override // defpackage.tl7
    public final void C(Throwable th) {
        ((ks1) this.k.a).f(th);
    }

    @Override // defpackage.tl7
    public final void D(zp2 zp2Var) {
        Set<int[]> x;
        gs1 gs1Var = this.k;
        gs1Var.c = zp2Var;
        zp2 zp2Var2 = (zp2) gs1Var.c;
        ks1 ks1Var = (ks1) gs1Var.a;
        p18 p18Var = ks1Var.g;
        u81 u81Var = ks1Var.i;
        if (Build.VERSION.SDK_INT >= 34) {
            x = qs1.a();
        } else {
            x = bx7.x();
        }
        gs1Var.b = new dn0(zp2Var2, p18Var, u81Var, x);
        ks1 ks1Var2 = (ks1) gs1Var.a;
        ArrayList arrayList = new ArrayList();
        ks1Var2.a.writeLock().lock();
        try {
            ks1Var2.c = (byte) 1;
            arrayList.addAll(ks1Var2.b);
            ks1Var2.b.clear();
            ks1Var2.a.writeLock().unlock();
            ks1Var2.d.post(new is1(arrayList, ks1Var2.c, null));
        } catch (Throwable th) {
            ks1Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
