package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hu implements kp3 {
    public static final ArrayDeque D = new ArrayDeque();
    public static final Object E = new Object();
    public final AtomicReference A;
    public final nv0 B;
    public boolean C;
    public final MediaCodec x;
    public final HandlerThread y;
    public fu z;

    public hu(MediaCodec mediaCodec, HandlerThread handlerThread) {
        nv0 nv0Var = new nv0();
        this.x = mediaCodec;
        this.y = handlerThread;
        this.B = nv0Var;
        this.A = new AtomicReference();
    }

    public static gu a() {
        ArrayDeque arrayDeque = D;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new gu();
                }
                return (gu) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kp3
    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.A.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }

    @Override // defpackage.kp3
    public final void c(int i, x21 x21Var, long j, int i2) {
        b();
        gu a = a();
        a.a = i;
        a.b = 0;
        a.d = j;
        a.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = a.c;
        cryptoInfo.numSubSamples = x21Var.f;
        int[] iArr = x21Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = x21Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = x21Var.b;
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
        byte[] bArr3 = x21Var.a;
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
        cryptoInfo.mode = x21Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(x21Var.g, x21Var.h));
        fu fuVar = this.z;
        String str = eq6.a;
        fuVar.obtainMessage(2, a).sendToTarget();
    }

    @Override // defpackage.kp3
    public final void d(int i, int i2, int i3, long j) {
        b();
        gu a = a();
        a.a = i;
        a.b = i2;
        a.d = j;
        a.e = i3;
        fu fuVar = this.z;
        String str = eq6.a;
        fuVar.obtainMessage(1, a).sendToTarget();
    }

    @Override // defpackage.kp3
    public final void flush() {
        if (this.C) {
            try {
                fu fuVar = this.z;
                fuVar.getClass();
                fuVar.removeCallbacksAndMessages(null);
                nv0 nv0Var = this.B;
                nv0Var.d();
                fu fuVar2 = this.z;
                fuVar2.getClass();
                fuVar2.obtainMessage(3).sendToTarget();
                nv0Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.kp3
    public final void setParameters(Bundle bundle) {
        b();
        fu fuVar = this.z;
        String str = eq6.a;
        fuVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.kp3
    public final void shutdown() {
        if (this.C) {
            flush();
            this.y.quit();
        }
        this.C = false;
    }

    @Override // defpackage.kp3
    public final void start() {
        if (!this.C) {
            HandlerThread handlerThread = this.y;
            handlerThread.start();
            this.z = new fu(this, handlerThread.getLooper(), (byte) 0);
            this.C = true;
        }
    }
}
