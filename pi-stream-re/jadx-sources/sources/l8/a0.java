package l8;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ScrollView;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final class a0 extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    public float f6892a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(MainActivity mainActivity, Context context) {
        super(context);
        this.f6894c = mainActivity;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6892a = motionEvent.getRawY();
            this.f6893b = false;
        }
        if (motionEvent.getAction() == 2 && getScrollY() == 0) {
            MainActivity mainActivity = this.f6894c;
            if (!mainActivity.M && "home".equals(mainActivity.P) && motionEvent.getRawY() - this.f6892a > w8.i.e(mainActivity, 10)) {
                this.f6893b = true;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        if (r12.equals("schedule") == false) goto L51;
     */
    @Override // android.widget.ScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.a0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
