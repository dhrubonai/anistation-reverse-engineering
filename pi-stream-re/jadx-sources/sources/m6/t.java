package m6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.j3;
import androidx.appcompat.widget.o2;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import msr.pistream.app.R;
import p7.a0;

/* loaded from: classes.dex */
public final class t extends androidx.appcompat.widget.q {
    public int A;
    public ColorStateList B;

    /* renamed from: e, reason: collision with root package name */
    public final o2 f7534e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f7535f;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f7536x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7537y;

    /* renamed from: z, reason: collision with root package name */
    public final float f7538z;

    public t(Context context, AttributeSet attributeSet) {
        super(w7.b.Z(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f7536x = new Rect();
        Context context2 = getContext();
        TypedArray N = w7.b.N(context2, attributeSet, s5.a.f9907h, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (N.hasValue(0) && N.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f7537y = N.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.f7538z = N.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.A = N.getColor(3, 0);
        this.B = a0.u(context2, N, 4);
        this.f7535f = (AccessibilityManager) context2.getSystemService("accessibility");
        o2 o2Var = new o2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f7534e = o2Var;
        o2Var.P = true;
        g0 g0Var = o2Var.Q;
        g0Var.setFocusable(true);
        o2Var.F = this;
        g0Var.setInputMethodMode(2);
        o2Var.q(getAdapter());
        o2Var.G = new j3(this, 1);
        if (N.hasValue(5)) {
            setSimpleItems(N.getResourceId(5, 0));
        }
        N.recycle();
    }

    public static void a(t tVar, Object obj) {
        tVar.setText(tVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        boolean z9;
        AccessibilityManager accessibilityManager = this.f7535f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f7534e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 != null && b10.T) {
            return b10.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f7538z;
    }

    public int getSimpleItemSelectedColor() {
        return this.A;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.B;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.T && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7534e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int selectedItemPosition;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i12 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                o2 o2Var = this.f7534e;
                if (!o2Var.b()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = o2Var.f590c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i13 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i12) {
                        view = null;
                        i12 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 = Math.max(i13, view.getMeasuredWidth());
                }
                Drawable e10 = o2Var.e();
                if (e10 != null) {
                    Rect rect = this.f7536x;
                    e10.getPadding(rect);
                    i13 += rect.left + rect.right;
                }
                i12 = b10.getEndIconView().getMeasuredWidth() + i13;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        boolean z10;
        AccessibilityManager accessibilityManager = this.f7535f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        super.onWindowFocusChanged(z9);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t9) {
        super.setAdapter(t9);
        this.f7534e.q(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        o2 o2Var = this.f7534e;
        if (o2Var != null) {
            o2Var.i(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f7534e.H = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.r();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.A = i10;
        if (getAdapter() instanceof s) {
            ((s) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        if (getAdapter() instanceof s) {
            ((s) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        boolean z9;
        AccessibilityManager accessibilityManager = this.f7535f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f7534e.d();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new s(this, getContext(), this.f7537y, strArr));
    }
}
