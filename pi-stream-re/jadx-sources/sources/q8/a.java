package q8;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f9231a;

    public a(b bVar) {
        this.f9231a = bVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        b bVar = this.f9231a;
        if (bVar.f9233b.n()) {
            return true;
        }
        Context context = bVar.f9232a;
        float f10 = context.getResources().getDisplayMetrics().widthPixels / 2.0f;
        float x9 = motionEvent.getX();
        n8.a aVar = bVar.f9233b;
        if (x9 < f10) {
            aVar.f8024b.z(-com.bumptech.glide.c.y(context));
        } else {
            aVar.f8024b.z(com.bumptech.glide.c.y(context));
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        b bVar = this.f9231a;
        if (bVar.f9233b.n()) {
            bVar.f9233b.D();
            return true;
        }
        bVar.f9233b.f8024b.A.H();
        return true;
    }
}
