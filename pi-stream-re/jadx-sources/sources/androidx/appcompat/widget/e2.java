package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class e2 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f455a;

    /* renamed from: b, reason: collision with root package name */
    public final int f456b;

    /* renamed from: c, reason: collision with root package name */
    public final int f457c;

    /* renamed from: d, reason: collision with root package name */
    public final View f458d;

    /* renamed from: e, reason: collision with root package name */
    public d2 f459e;

    /* renamed from: f, reason: collision with root package name */
    public d2 f460f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f461x;

    /* renamed from: y, reason: collision with root package name */
    public int f462y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f463z = new int[2];

    public e2(View view) {
        this.f458d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f455a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f456b = tapTimeout;
        this.f457c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        d2 d2Var = this.f460f;
        View view = this.f458d;
        if (d2Var != null) {
            view.removeCallbacks(d2Var);
        }
        d2 d2Var2 = this.f459e;
        if (d2Var2 != null) {
            view.removeCallbacks(d2Var2);
        }
    }

    public abstract j.g0 b();

    public abstract boolean c();

    public boolean d() {
        j.g0 b10 = b();
        if (b10 != null && b10.b()) {
            b10.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        if (r4 != 3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f461x = false;
        this.f462y = -1;
        d2 d2Var = this.f459e;
        if (d2Var != null) {
            this.f458d.removeCallbacks(d2Var);
        }
    }
}
