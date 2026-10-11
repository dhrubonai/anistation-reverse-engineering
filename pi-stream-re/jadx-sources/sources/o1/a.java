package o1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.lifecycle.q0;

/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f8101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Looper looper) {
        super(looper);
        this.f8101b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.os.Message r8, o1.f0 r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.obj
            o1.b r0 = (o1.b) r0
            boolean r1 = r0.f8105b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r0.f8107d
            r3 = 1
            int r1 = r1 + r3
            r0.f8107d = r1
            o1.d r4 = r7.f8101b
            androidx.lifecycle.q0 r4 = r4.f8122j
            r5 = 3
            int r4 = r4.z(r5)
            if (r1 <= r4) goto L1c
            return r2
        L1c:
            v1.n r1 = new v1.n
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = r1 instanceof java.io.IOException
            if (r1 == 0) goto L33
            java.lang.Throwable r9 = r9.getCause()
            java.io.IOException r9 = (java.io.IOException) r9
            goto L3d
        L33:
            m1.b r1 = new m1.b
            java.lang.Throwable r9 = r9.getCause()
            r1.<init>(r9)
            r9 = r1
        L3d:
            o1.d r1 = r7.f8101b
            androidx.lifecycle.q0 r1 = r1.f8122j
            int r0 = r0.f8107d
            r1.getClass()
            boolean r1 = r9 instanceof c1.r0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof h1.v
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof z1.n
            if (r1 != 0) goto L82
            int r1 = h1.i.f4582b
        L5d:
            if (r9 == 0) goto L73
            boolean r1 = r9 instanceof h1.i
            if (r1 == 0) goto L6e
            r1 = r9
            h1.i r1 = (h1.i) r1
            int r1 = r1.f4583a
            r6 = 2008(0x7d8, float:2.814E-42)
            if (r1 != r6) goto L6e
            r9 = r3
            goto L74
        L6e:
            java.lang.Throwable r9 = r9.getCause()
            goto L5d
        L73:
            r9 = r2
        L74:
            if (r9 == 0) goto L77
            goto L82
        L77:
            int r0 = r0 - r3
            int r0 = r0 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r0, r9)
            long r0 = (long) r9
            goto L83
        L82:
            r0 = r4
        L83:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 != 0) goto L88
            return r2
        L88:
            monitor-enter(r7)
            boolean r9 = r7.f8100a     // Catch: java.lang.Throwable -> L98
            if (r9 != 0) goto L96
            android.os.Message r8 = android.os.Message.obtain(r8)     // Catch: java.lang.Throwable -> L98
            r7.sendMessageDelayed(r8, r0)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L98
            return r3
        L96:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L98
            return r2
        L98:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L98
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.a.a(android.os.Message, o1.f0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Throwable th;
        b bVar = (b) message.obj;
        try {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 == 1) {
                    d dVar = this.f8101b;
                    th = dVar.f8124l.g(dVar.f8125m, (w) bVar.f8106c);
                } else {
                    throw new RuntimeException();
                }
            } else {
                th = this.f8101b.f8124l.i((x) bVar.f8106c);
            }
        } catch (f0 e10) {
            boolean a10 = a(message, e10);
            th = e10;
            if (a10) {
                return;
            }
        } catch (Exception e11) {
            f1.o.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
            th = e11;
        }
        q0 q0Var = this.f8101b.f8122j;
        long j4 = bVar.f8104a;
        q0Var.getClass();
        synchronized (this) {
            if (!this.f8100a) {
                this.f8101b.o.obtainMessage(message.what, Pair.create(bVar.f8106c, th)).sendToTarget();
            }
        }
    }
}
