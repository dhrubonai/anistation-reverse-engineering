package m4;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.o;
import x3.h0;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final Handler f7447e = new Handler(Looper.getMainLooper(), new h0(1));

    /* renamed from: d, reason: collision with root package name */
    public final o f7448d;

    public g(o oVar) {
        this.f7448d = oVar;
    }

    @Override // m4.i
    public final void e(Object obj, n4.d dVar) {
        l4.c cVar = this.f7437c;
        if (cVar != null && cVar.i()) {
            f7447e.obtainMessage(1, this).sendToTarget();
        }
    }

    @Override // m4.i
    public final void g(Drawable drawable) {
    }
}
