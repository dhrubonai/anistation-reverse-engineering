package s1;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import f1.b0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: x, reason: collision with root package name */
    public static final ArrayDeque f9770x = new ArrayDeque();

    /* renamed from: y, reason: collision with root package name */
    public static final Object f9771y = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f9772a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f9773b;

    /* renamed from: c, reason: collision with root package name */
    public f.f f9774c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f9775d;

    /* renamed from: e, reason: collision with root package name */
    public final c1.r f9776e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9777f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        c1.r rVar = new c1.r(1);
        this.f9772a = mediaCodec;
        this.f9773b = handlerThread;
        this.f9776e = rVar;
        this.f9775d = new AtomicReference();
    }

    public static void a(d dVar) {
        ArrayDeque arrayDeque = f9770x;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override // s1.l
    public final void b(int i10, i1.d dVar, long j4, int i11) {
        d dVar2;
        l();
        ArrayDeque arrayDeque = f9770x;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                dVar2 = new d();
            } else {
                dVar2 = (d) arrayDeque.removeFirst();
            }
        }
        dVar2.f9764a = i10;
        dVar2.f9765b = 0;
        dVar2.f9766c = 0;
        dVar2.f9768e = j4;
        dVar2.f9769f = i11;
        int i12 = dVar.f5255f;
        MediaCodec.CryptoInfo cryptoInfo = dVar2.f9767d;
        cryptoInfo.numSubSamples = i12;
        int[] iArr = dVar.f5253d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = dVar.f5254e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = dVar.f5251b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = dVar.f5250a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = dVar.f5252c;
        if (b0.f3799a >= 24) {
            f1.z.k();
            cryptoInfo.setPattern(f1.z.e(dVar.f5256g, dVar.f5257h));
        }
        this.f9774c.obtainMessage(1, dVar2).sendToTarget();
    }

    @Override // s1.l
    public final void c(Bundle bundle) {
        l();
        f.f fVar = this.f9774c;
        int i10 = b0.f3799a;
        fVar.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // s1.l
    public final void d(int i10, int i11, long j4, int i12) {
        d dVar;
        l();
        ArrayDeque arrayDeque = f9770x;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                dVar = new d();
            } else {
                dVar = (d) arrayDeque.removeFirst();
            }
        }
        dVar.f9764a = i10;
        dVar.f9765b = 0;
        dVar.f9766c = i11;
        dVar.f9768e = j4;
        dVar.f9769f = i12;
        f.f fVar = this.f9774c;
        int i13 = b0.f3799a;
        fVar.obtainMessage(0, dVar).sendToTarget();
    }

    @Override // s1.l
    public final void flush() {
        if (this.f9777f) {
            try {
                f.f fVar = this.f9774c;
                fVar.getClass();
                fVar.removeCallbacksAndMessages(null);
                c1.r rVar = this.f9776e;
                rVar.c();
                f.f fVar2 = this.f9774c;
                fVar2.getClass();
                fVar2.obtainMessage(2).sendToTarget();
                synchronized (rVar) {
                    while (!rVar.f1885a) {
                        rVar.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // s1.l
    public final void l() {
        RuntimeException runtimeException = (RuntimeException) this.f9775d.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }

    @Override // s1.l
    public final void shutdown() {
        if (this.f9777f) {
            flush();
            this.f9773b.quit();
        }
        this.f9777f = false;
    }

    @Override // s1.l
    public final void start() {
        if (!this.f9777f) {
            HandlerThread handlerThread = this.f9773b;
            handlerThread.start();
            this.f9774c = new f.f(this, handlerThread.getLooper(), 2);
            this.f9777f = true;
        }
    }
}
