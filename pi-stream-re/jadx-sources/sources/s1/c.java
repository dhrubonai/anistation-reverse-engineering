package s1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import f1.b0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f9759a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9760b;

    /* renamed from: c, reason: collision with root package name */
    public final l f9761c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9762d;

    /* renamed from: e, reason: collision with root package name */
    public int f9763e = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, l lVar) {
        this.f9759a = mediaCodec;
        this.f9760b = new f(handlerThread);
        this.f9761c = lVar;
    }

    public static void p(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        boolean z9;
        f fVar = cVar.f9760b;
        if (fVar.f9780c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        HandlerThread handlerThread = fVar.f9779b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = cVar.f9759a;
        mediaCodec.setCallback(fVar, handler);
        fVar.f9780c = handler;
        com.bumptech.glide.d.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        com.bumptech.glide.d.s();
        cVar.f9761c.start();
        com.bumptech.glide.d.c("startCodec");
        mediaCodec.start();
        com.bumptech.glide.d.s();
        cVar.f9763e = 1;
    }

    public static String q(int i10, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            sb.append("Audio");
        } else if (i10 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // s1.k
    public final void a() {
        try {
            if (this.f9763e == 1) {
                this.f9761c.shutdown();
                f fVar = this.f9760b;
                synchronized (fVar.f9778a) {
                    fVar.f9790m = true;
                    fVar.f9779b.quit();
                    fVar.a();
                }
            }
            this.f9763e = 2;
        } finally {
            if (!this.f9762d) {
                this.f9759a.release();
                this.f9762d = true;
            }
        }
    }

    @Override // s1.k
    public final void b(int i10, i1.d dVar, long j4, int i11) {
        this.f9761c.b(i10, dVar, j4, i11);
    }

    @Override // s1.k
    public final void c(Bundle bundle) {
        this.f9761c.c(bundle);
    }

    @Override // s1.k
    public final void d(int i10, int i11, long j4, int i12) {
        this.f9761c.d(i10, i11, j4, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[Catch: all -> 0x0084, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:17:0x002b, B:22:0x002d, B:26:0x0038, B:28:0x003d, B:30:0x0049, B:31:0x0070, B:36:0x0066, B:37:0x0073, B:38:0x0078, B:40:0x0079, B:41:0x007b, B:42:0x007c, B:43:0x007e, B:44:0x007f, B:45:0x0081), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:17:0x002b, B:22:0x002d, B:26:0x0038, B:28:0x003d, B:30:0x0049, B:31:0x0070, B:36:0x0066, B:37:0x0073, B:38:0x0078, B:40:0x0079, B:41:0x007b, B:42:0x007c, B:43:0x007e, B:44:0x007f, B:45:0x0081), top: B:3:0x000a }] */
    @Override // s1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            s1.l r0 = r10.f9761c
            r0.l()
            s1.f r0 = r10.f9760b
            java.lang.Object r1 = r0.f9778a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f9791n     // Catch: java.lang.Throwable -> L84
            r3 = 0
            if (r2 != 0) goto L7f
            android.media.MediaCodec$CodecException r2 = r0.f9787j     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L7c
            android.media.MediaCodec$CryptoException r2 = r0.f9788k     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L79
            long r2 = r0.f9789l     // Catch: java.lang.Throwable -> L84
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L28
            boolean r2 = r0.f9790m     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L26
            goto L28
        L26:
            r2 = r3
            goto L29
        L28:
            r2 = r4
        L29:
            if (r2 == 0) goto L2d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L84
            goto L39
        L2d:
            n.g r2 = r0.f9782e     // Catch: java.lang.Throwable -> L84
            int r5 = r2.f7873a     // Catch: java.lang.Throwable -> L84
            int r6 = r2.f7874b     // Catch: java.lang.Throwable -> L84
            if (r5 != r6) goto L36
            r3 = r4
        L36:
            if (r3 == 0) goto L3b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L84
        L39:
            r11 = -1
            goto L72
        L3b:
            if (r5 == r6) goto L73
            int[] r3 = r2.f7875c     // Catch: java.lang.Throwable -> L84
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L84
            int r5 = r5 + r4
            int r4 = r2.f7876d     // Catch: java.lang.Throwable -> L84
            r4 = r4 & r5
            r2.f7873a = r4     // Catch: java.lang.Throwable -> L84
            if (r3 < 0) goto L63
            android.media.MediaFormat r2 = r0.f9785h     // Catch: java.lang.Throwable -> L84
            w7.b.w(r2)     // Catch: java.lang.Throwable -> L84
            java.util.ArrayDeque r0 = r0.f9783f     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L84
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L84
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L84
            int r6 = r0.size     // Catch: java.lang.Throwable -> L84
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L84
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L84
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L84
            goto L70
        L63:
            r11 = -2
            if (r3 != r11) goto L70
            java.util.ArrayDeque r11 = r0.f9784g     // Catch: java.lang.Throwable -> L84
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L84
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L84
            r0.f9785h = r11     // Catch: java.lang.Throwable -> L84
        L70:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L84
            r11 = r3
        L72:
            return r11
        L73:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L84
            r11.<init>()     // Catch: java.lang.Throwable -> L84
            throw r11     // Catch: java.lang.Throwable -> L84
        L79:
            r0.f9788k = r3     // Catch: java.lang.Throwable -> L84
            throw r2     // Catch: java.lang.Throwable -> L84
        L7c:
            r0.f9787j = r3     // Catch: java.lang.Throwable -> L84
            throw r2     // Catch: java.lang.Throwable -> L84
        L7f:
            r0.f9791n = r3     // Catch: java.lang.Throwable -> L84
            throw r2     // Catch: java.lang.Throwable -> L84
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L84
            throw r11
        L84:
            r11 = move-exception
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.c.e(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // s1.k
    public final void f() {
    }

    @Override // s1.k
    public final void flush() {
        this.f9761c.flush();
        this.f9759a.flush();
        f fVar = this.f9760b;
        synchronized (fVar.f9778a) {
            fVar.f9789l++;
            Handler handler = fVar.f9780c;
            int i10 = b0.f3799a;
            handler.post(new androidx.activity.b(fVar, 10));
        }
        this.f9759a.start();
    }

    @Override // s1.k
    public final void g(int i10, boolean z9) {
        this.f9759a.releaseOutputBuffer(i10, z9);
    }

    @Override // s1.k
    public final void h(b2.k kVar, Handler handler) {
        this.f9759a.setOnFrameRenderedListener(new a(this, kVar, 0), handler);
    }

    @Override // s1.k
    public final void i(int i10) {
        this.f9759a.setVideoScalingMode(i10);
    }

    @Override // s1.k
    public final MediaFormat j() {
        MediaFormat mediaFormat;
        f fVar = this.f9760b;
        synchronized (fVar.f9778a) {
            mediaFormat = fVar.f9785h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // s1.k
    public final ByteBuffer k(int i10) {
        return this.f9759a.getInputBuffer(i10);
    }

    @Override // s1.k
    public final void l(Surface surface) {
        this.f9759a.setOutputSurface(surface);
    }

    @Override // s1.k
    public final ByteBuffer m(int i10) {
        return this.f9759a.getOutputBuffer(i10);
    }

    @Override // s1.k
    public final void n(int i10, long j4) {
        this.f9759a.releaseOutputBuffer(i10, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[Catch: all -> 0x0059, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:22:0x002e, B:27:0x0046, B:29:0x003c, B:30:0x0048, B:31:0x004d, B:33:0x004e, B:34:0x0050, B:35:0x0051, B:36:0x0053, B:37:0x0054, B:38:0x0056), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e A[Catch: all -> 0x0059, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:22:0x002e, B:27:0x0046, B:29:0x003c, B:30:0x0048, B:31:0x004d, B:33:0x004e, B:34:0x0050, B:35:0x0051, B:36:0x0053, B:37:0x0054, B:38:0x0056), top: B:3:0x000a }] */
    @Override // s1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o() {
        /*
            r7 = this;
            s1.l r0 = r7.f9761c
            r0.l()
            s1.f r0 = r7.f9760b
            java.lang.Object r1 = r0.f9778a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f9791n     // Catch: java.lang.Throwable -> L59
            r3 = 0
            if (r2 != 0) goto L54
            android.media.MediaCodec$CodecException r2 = r0.f9787j     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto L51
            android.media.MediaCodec$CryptoException r2 = r0.f9788k     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto L4e
            long r2 = r0.f9789l     // Catch: java.lang.Throwable -> L59
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L28
            boolean r2 = r0.f9790m     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L26
            goto L28
        L26:
            r2 = r3
            goto L29
        L28:
            r2 = r4
        L29:
            r5 = -1
            if (r2 == 0) goto L2e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            goto L47
        L2e:
            n.g r0 = r0.f9781d     // Catch: java.lang.Throwable -> L59
            int r2 = r0.f7873a     // Catch: java.lang.Throwable -> L59
            int r6 = r0.f7874b     // Catch: java.lang.Throwable -> L59
            if (r2 != r6) goto L37
            r3 = r4
        L37:
            if (r3 == 0) goto L3a
            goto L46
        L3a:
            if (r2 == r6) goto L48
            int[] r3 = r0.f7875c     // Catch: java.lang.Throwable -> L59
            r5 = r3[r2]     // Catch: java.lang.Throwable -> L59
            int r2 = r2 + r4
            int r3 = r0.f7876d     // Catch: java.lang.Throwable -> L59
            r2 = r2 & r3
            r0.f7873a = r2     // Catch: java.lang.Throwable -> L59
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
        L47:
            return r5
        L48:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L59
            r0.<init>()     // Catch: java.lang.Throwable -> L59
            throw r0     // Catch: java.lang.Throwable -> L59
        L4e:
            r0.f9788k = r3     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L51:
            r0.f9787j = r3     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L54:
            r0.f9791n = r3     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L57:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            throw r0
        L59:
            r0 = move-exception
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.c.o():int");
    }
}
