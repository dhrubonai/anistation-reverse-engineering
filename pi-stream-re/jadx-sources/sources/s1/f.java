package s1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f9779b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f9780c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f9785h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f9786i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f9787j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f9788k;

    /* renamed from: l, reason: collision with root package name */
    public long f9789l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9790m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f9791n;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9778a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final n.g f9781d = new n.g(0);

    /* renamed from: e, reason: collision with root package name */
    public final n.g f9782e = new n.g(0);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f9783f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f9784g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f9779b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f9784g;
        if (!arrayDeque.isEmpty()) {
            this.f9786i = (MediaFormat) arrayDeque.getLast();
        }
        n.g gVar = this.f9781d;
        gVar.f7874b = gVar.f7873a;
        n.g gVar2 = this.f9782e;
        gVar2.f7874b = gVar2.f7873a;
        this.f9783f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f9778a) {
            this.f9791n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f9778a) {
            this.f9788k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f9778a) {
            this.f9787j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f9778a) {
            this.f9781d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f9778a) {
            MediaFormat mediaFormat = this.f9786i;
            if (mediaFormat != null) {
                this.f9782e.a(-2);
                this.f9784g.add(mediaFormat);
                this.f9786i = null;
            }
            this.f9782e.a(i10);
            this.f9783f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f9778a) {
            this.f9782e.a(-2);
            this.f9784g.add(mediaFormat);
            this.f9786i = null;
        }
    }
}
