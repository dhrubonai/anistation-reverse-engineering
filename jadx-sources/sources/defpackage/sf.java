package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sf extends n11 {
    public static final d46 I = new d46(new t(12));
    public static final qf J = new qf((byte) 0);
    public boolean E;
    public boolean F;
    public final uf H;
    public final Choreographer y;
    public final Handler z;
    public final Object A = new Object();
    public final bs B = new bs();
    public ArrayList C = new ArrayList();
    public ArrayList D = new ArrayList();
    public final rf G = new rf(this);

    public sf(Choreographer choreographer, Handler handler) {
        this.y = choreographer;
        this.z = handler;
        this.H = new uf(choreographer, this);
    }

    @Override // defpackage.n11
    public final void u0(l11 l11Var, Runnable runnable) {
        synchronized (this.A) {
            this.B.addLast(runnable);
            if (!this.E) {
                this.E = true;
                this.z.post(this.G);
                if (!this.F) {
                    this.F = true;
                    this.y.postFrameCallback(this.G);
                }
            }
        }
    }

    public final void y0() {
        Object removeFirst;
        Runnable runnable;
        boolean z;
        Object removeFirst2;
        do {
            synchronized (this.A) {
                bs bsVar = this.B;
                if (bsVar.isEmpty()) {
                    removeFirst = null;
                } else {
                    removeFirst = bsVar.removeFirst();
                }
                runnable = (Runnable) removeFirst;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.A) {
                    bs bsVar2 = this.B;
                    if (bsVar2.isEmpty()) {
                        removeFirst2 = null;
                    } else {
                        removeFirst2 = bsVar2.removeFirst();
                    }
                    runnable = (Runnable) removeFirst2;
                }
            }
            synchronized (this.A) {
                if (this.B.isEmpty()) {
                    z = false;
                    this.E = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
