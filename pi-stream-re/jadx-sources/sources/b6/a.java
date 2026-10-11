package b6;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f1539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1541c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1542d;

    public a(Dialog dialog, Rect rect) {
        this.f1539a = dialog;
        this.f1540b = rect.left;
        this.f1541c = rect.top;
        this.f1542d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f1540b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f1541c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f1542d;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f1539a.onTouchEvent(obtain);
    }
}
