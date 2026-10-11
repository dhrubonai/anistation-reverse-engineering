package g;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4128a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f4129b;

    public g() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f4128a) {
            case 0:
                return;
            default:
                ((r3.d) this.f4129b).invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        switch (this.f4128a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f4129b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j4);
                    return;
                }
                return;
            default:
                ((r3.d) this.f4129b).scheduleSelf(runnable, j4);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f4128a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f4129b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((r3.d) this.f4129b).unscheduleSelf(runnable);
                return;
        }
    }

    public g(r3.d dVar) {
        this.f4129b = dVar;
    }
}
