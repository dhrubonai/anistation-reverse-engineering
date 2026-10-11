package s1;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import f1.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2.k f9752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f9753c;

    public /* synthetic */ a(k kVar, b2.k kVar2, int i10) {
        this.f9751a = i10;
        this.f9753c = kVar;
        this.f9752b = kVar2;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j4, long j10) {
        b2.k kVar = this.f9752b;
        int i10 = this.f9751a;
        k kVar2 = this.f9753c;
        switch (i10) {
            case 0:
                ((c) kVar2).getClass();
                kVar.getClass();
                if (b0.f3799a < 30) {
                    Handler handler = kVar.f1348a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j4 >> 32), (int) j4));
                    return;
                } else {
                    kVar.a(j4);
                    return;
                }
            default:
                ((a0) kVar2).getClass();
                kVar.getClass();
                if (b0.f3799a < 30) {
                    Handler handler2 = kVar.f1348a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j4 >> 32), (int) j4));
                    return;
                } else {
                    kVar.a(j4);
                    return;
                }
        }
    }
}
