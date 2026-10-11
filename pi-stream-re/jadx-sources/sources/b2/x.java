package b2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class x implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final x f1399e = new x();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f1400a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1401b;

    /* renamed from: c, reason: collision with root package name */
    public Choreographer f1402c;

    /* renamed from: d, reason: collision with root package name */
    public int f1403d;

    public x() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = f1.b0.f3799a;
        Handler handler = new Handler(looper, this);
        this.f1401b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        this.f1400a = j4;
        Choreographer choreographer = this.f1402c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                Choreographer choreographer = this.f1402c;
                if (choreographer != null) {
                    int i11 = this.f1403d - 1;
                    this.f1403d = i11;
                    if (i11 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f1400a = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.f1402c;
            if (choreographer2 != null) {
                int i12 = this.f1403d + 1;
                this.f1403d = i12;
                if (i12 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.f1402c = Choreographer.getInstance();
        } catch (RuntimeException e10) {
            f1.o.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
        }
        return true;
    }
}
