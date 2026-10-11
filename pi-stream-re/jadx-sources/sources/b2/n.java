package b2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes.dex */
public final class n extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f1381d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f1382e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1383a;

    /* renamed from: b, reason: collision with root package name */
    public final m f1384b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1385c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z9) {
        super(surfaceTexture);
        this.f1384b = mVar;
        this.f1383a = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean d(android.content.Context r7) {
        /*
            java.lang.Class<b2.n> r0 = b2.n.class
            monitor-enter(r0)
            boolean r1 = b2.n.f1382e     // Catch: java.lang.Throwable -> L62
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L5b
            int r1 = f1.b0.f3799a     // Catch: java.lang.Throwable -> L62
            r4 = 24
            if (r1 >= r4) goto L10
            goto L37
        L10:
            r4 = 26
            if (r1 >= r4) goto L29
            java.lang.String r5 = "samsung"
            java.lang.String r6 = f1.b0.f3801c     // Catch: java.lang.Throwable -> L62
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L37
            java.lang.String r5 = "XT1650"
            java.lang.String r6 = f1.b0.f3802d     // Catch: java.lang.Throwable -> L62
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L29
            goto L37
        L29:
            if (r1 >= r4) goto L39
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r4)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L39
        L37:
            r7 = r2
            goto L3f
        L39:
            java.lang.String r7 = "EGL_EXT_protected_content"
            boolean r7 = f1.g.l(r7)     // Catch: java.lang.Throwable -> L62
        L3f:
            if (r7 == 0) goto L56
            r7 = 17
            if (r1 < r7) goto L4f
            java.lang.String r7 = "EGL_KHR_surfaceless_context"
            boolean r7 = f1.g.l(r7)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L4f
            r7 = r3
            goto L50
        L4f:
            r7 = r2
        L50:
            if (r7 == 0) goto L54
            r7 = r3
            goto L57
        L54:
            r7 = 2
            goto L57
        L56:
            r7 = r2
        L57:
            b2.n.f1381d = r7     // Catch: java.lang.Throwable -> L62
            b2.n.f1382e = r3     // Catch: java.lang.Throwable -> L62
        L5b:
            int r7 = b2.n.f1381d     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L60
            r2 = r3
        L60:
            monitor-exit(r0)
            return r2
        L62:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.n.d(android.content.Context):boolean");
    }

    public static n e(Context context, boolean z9) {
        boolean z10;
        int i10;
        boolean z11 = false;
        if (z9 && !d(context)) {
            z10 = false;
        } else {
            z10 = true;
        }
        w7.b.u(z10);
        m mVar = new m();
        if (z9) {
            i10 = f1381d;
        } else {
            i10 = 0;
        }
        mVar.start();
        Handler handler = new Handler(mVar.getLooper(), mVar);
        mVar.f1377b = handler;
        mVar.f1376a = new f1.e(handler);
        synchronized (mVar) {
            mVar.f1377b.obtainMessage(1, i10, 0).sendToTarget();
            while (mVar.f1380e == null && mVar.f1379d == null && mVar.f1378c == null) {
                try {
                    mVar.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = mVar.f1379d;
        if (runtimeException == null) {
            Error error = mVar.f1378c;
            if (error == null) {
                n nVar = mVar.f1380e;
                nVar.getClass();
                return nVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f1384b) {
            if (!this.f1385c) {
                m mVar = this.f1384b;
                mVar.f1377b.getClass();
                mVar.f1377b.sendEmptyMessage(2);
                this.f1385c = true;
            }
        }
    }
}
