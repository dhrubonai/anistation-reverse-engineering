package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ce implements ft4, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long E;
    public boolean C;
    public long D;
    public final View x;
    public boolean z;
    public final PriorityQueue y = new PriorityQueue(11, new be((byte) 0));
    public final Choreographer A = Choreographer.getInstance();
    public final x16 B = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, x16] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ce(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.x = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            be r1 = new be
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.y = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.A = r0
            x16 r0 = new x16
            r0.<init>()
            r4.B = r0
            long r0 = defpackage.ce.E
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            long r0 = (long) r1
            defpackage.ce.E = r0
        L49:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L55
            r5 = 1
            r4.C = r5
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.<init>(android.view.View):void");
    }

    @Override // defpackage.ft4
    public final void a(et4 et4Var) {
        this.y.add(new eu4(1, et4Var));
        if (!this.z) {
            this.z = true;
            this.x.post(this);
        }
    }

    public final boolean b() {
        x16 x16Var = this.B;
        long a = x16Var.a();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", a);
        boolean z = true;
        if (a > 0) {
            PriorityQueue priorityQueue = this.y;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((eu4) peek).b.c(x16Var)) {
                priorityQueue.poll();
                z = false;
            }
            x16Var.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.C) {
            this.D = j;
            this.x.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.C = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.C = false;
        this.x.removeCallbacks(this);
        this.A.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        PriorityQueue priorityQueue = this.y;
        if (!priorityQueue.isEmpty() && this.z && this.C) {
            View view = this.x;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                if (System.nanoTime() > (2 * E) + nanos) {
                    z = true;
                } else {
                    z = false;
                }
                x16 x16Var = this.B;
                x16Var.a = z;
                x16Var.b = Math.max(this.D, nanos) + E;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (x16Var.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = b();
                    }
                }
                if (z2) {
                    this.A.postFrameCallback(this);
                } else {
                    this.z = false;
                }
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.z = false;
    }
}
