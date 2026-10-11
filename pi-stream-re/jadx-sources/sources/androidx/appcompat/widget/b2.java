package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class b2 extends ListView {
    public boolean A;
    public k0.g B;
    public g.f C;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f418a;

    /* renamed from: b, reason: collision with root package name */
    public int f419b;

    /* renamed from: c, reason: collision with root package name */
    public int f420c;

    /* renamed from: d, reason: collision with root package name */
    public int f421d;

    /* renamed from: e, reason: collision with root package name */
    public int f422e;

    /* renamed from: f, reason: collision with root package name */
    public int f423f;

    /* renamed from: x, reason: collision with root package name */
    public z1 f424x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f425y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f426z;

    public b2(Context context, boolean z9) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f418a = new Rect();
        this.f419b = 0;
        this.f420c = 0;
        this.f421d = 0;
        this.f422e = 0;
        this.f426z = z9;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i12 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i12;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            if (i15 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, makeMeasureSpec);
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0145 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b2.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f418a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.C != null) {
            return;
        }
        super.drawableStateChanged();
        z1 z1Var = this.f424x;
        if (z1Var != null) {
            z1Var.f733b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.A && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f426z && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f426z && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f426z && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f426z && this.f425y) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 1;
        if (actionMasked == 10 && this.C == null) {
            g.f fVar = new g.f(this, i11);
            this.C = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 >= 30 && x1.f703d) {
                        try {
                            x1.f700a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            x1.f701b.invoke(this, Integer.valueOf(pointToPosition));
                            x1.f702c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.A && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f423f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        g.f fVar = this.C;
        if (fVar != null) {
            b2 b2Var = (b2) fVar.f4127b;
            b2Var.C = null;
            b2Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z9) {
        this.f425y = z9;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        z1 z1Var;
        if (drawable != null) {
            z1Var = new z1(drawable);
        } else {
            z1Var = null;
        }
        this.f424x = z1Var;
        super.setSelector(z1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f419b = rect.left;
        this.f420c = rect.top;
        this.f421d = rect.right;
        this.f422e = rect.bottom;
    }
}
