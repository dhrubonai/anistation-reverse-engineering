package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nt0 implements ScrollCaptureCallback {
    public final uh5 a;
    public final g13 b;
    public final jc5 c;
    public final oa d;
    public final ke0 e;
    public final wn2 f;

    public nt0(uh5 uh5Var, g13 g13Var, ke0 ke0Var, jc5 jc5Var, oa oaVar) {
        this.a = uh5Var;
        this.b = g13Var;
        this.c = jc5Var;
        this.d = oaVar;
        this.e = db.g0(ke0Var, ug1.y);
        this.f = new wn2(g13Var.b(), new z7(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r4 == r6) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r9, defpackage.g13 r10, defpackage.xz0 r11) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt0.a(android.view.ScrollCaptureSession, g13, xz0):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        tl7.z(this.e, la4.x, null, new c0(this, runnable, null, (byte) 20), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        bx5 z = tl7.z(this.e, null, null, new l5(this, scrollCaptureSession, rect, consumer, null, (byte) 3), 3);
        z.l0(new l0(cancellationSignal, (byte) 27));
        cancellationSignal.setOnCancelListener(new ot0(z, (byte) 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(z51.Q(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
