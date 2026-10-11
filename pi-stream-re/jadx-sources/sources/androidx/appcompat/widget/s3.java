package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class s3 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f641a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f642b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f643c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f644d;

    /* renamed from: e, reason: collision with root package name */
    public final int f645e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f646f;

    public s3(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f645e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f642b = rect3;
        Rect rect4 = new Rect();
        this.f644d = rect4;
        Rect rect5 = new Rect();
        this.f643c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f641a = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        int x9 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z10 = this.f646f;
                    this.f646f = false;
                }
                z9 = true;
                z11 = false;
            } else {
                z10 = this.f646f;
                if (z10 && !this.f644d.contains(x9, y9)) {
                    z11 = z10;
                    z9 = false;
                }
            }
            z11 = z10;
            z9 = true;
        } else {
            if (this.f642b.contains(x9, y9)) {
                this.f646f = true;
                z9 = true;
            }
            z9 = true;
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        Rect rect = this.f643c;
        View view = this.f641a;
        if (z9 && !rect.contains(x9, y9)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x9 - rect.left, y9 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
