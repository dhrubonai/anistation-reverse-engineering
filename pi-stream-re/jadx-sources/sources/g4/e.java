package g4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes.dex */
public final class e extends m4.c {

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4410d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4411e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4412f;

    /* renamed from: x, reason: collision with root package name */
    public Bitmap f4413x;

    public e(Handler handler, int i10, long j4) {
        this.f4410d = handler;
        this.f4411e = i10;
        this.f4412f = j4;
    }

    @Override // m4.i
    public final void e(Object obj, n4.d dVar) {
        this.f4413x = (Bitmap) obj;
        Handler handler = this.f4410d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f4412f);
    }

    @Override // m4.i
    public final void g(Drawable drawable) {
        this.f4413x = null;
    }
}
