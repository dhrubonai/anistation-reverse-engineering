package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rf implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ sf x;

    public rf(sf sfVar) {
        this.x = sfVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.x.z.removeCallbacks(this);
        this.x.y0();
        sf sfVar = this.x;
        synchronized (sfVar.A) {
            if (!sfVar.F) {
                return;
            }
            sfVar.F = false;
            ArrayList arrayList = sfVar.C;
            sfVar.C = sfVar.D;
            sfVar.D = arrayList;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
            }
            arrayList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.y0();
        sf sfVar = this.x;
        synchronized (sfVar.A) {
            if (sfVar.C.isEmpty()) {
                sfVar.y.removeFrameCallback(this);
                sfVar.F = false;
            }
        }
    }
}
