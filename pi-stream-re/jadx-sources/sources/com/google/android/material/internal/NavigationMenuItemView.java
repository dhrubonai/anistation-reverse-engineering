package com.google.android.material.internal;

import a0.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.f2;
import e6.d;
import g0.h0;
import g0.y0;
import j.d0;
import j.q;
import java.util.WeakHashMap;
import p7.a0;
import u5.a;
import y.i;
import y.p;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements d0 {
    public static final int[] W = {R.attr.state_checked};
    public int M;
    public boolean N;
    public boolean O;
    public final CheckedTextView P;
    public FrameLayout Q;
    public q R;
    public ColorStateList S;
    public boolean T;
    public Drawable U;
    public final a V;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this, 3);
        this.V = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(msr.pistream.app.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(msr.pistream.app.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(msr.pistream.app.R.id.design_menu_item_text);
        this.P = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        y0.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.Q == null) {
                this.Q = (FrameLayout) ((ViewStub) findViewById(msr.pistream.app.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.Q.removeAllViews();
            this.Q.addView(view);
        }
    }

    @Override // j.d0
    public final void c(q qVar) {
        int i10;
        StateListDrawable stateListDrawable;
        this.R = qVar;
        int i11 = qVar.f5572a;
        if (i11 > 0) {
            setId(i11);
        }
        if (qVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        boolean z9 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(msr.pistream.app.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(W, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = y0.f4277a;
            h0.q(this, stateListDrawable);
        }
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setTitle(qVar.f5576e);
        setIcon(qVar.getIcon());
        setActionView(qVar.getActionView());
        setContentDescription(qVar.f5587q);
        a0.W(this, qVar.f5588r);
        q qVar2 = this.R;
        if (qVar2.f5576e != null || qVar2.getIcon() != null || this.R.getActionView() == null) {
            z9 = false;
        }
        CheckedTextView checkedTextView = this.P;
        if (z9) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                f2 f2Var = (f2) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) f2Var).width = -1;
                this.Q.setLayoutParams(f2Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.Q;
        if (frameLayout2 != null) {
            f2 f2Var2 = (f2) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) f2Var2).width = -2;
            this.Q.setLayoutParams(f2Var2);
        }
    }

    @Override // j.d0
    public q getItemData() {
        return this.R;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        q qVar = this.R;
        if (qVar != null && qVar.isCheckable() && this.R.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, W);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z9) {
        refreshDrawableState();
        if (this.O != z9) {
            this.O = z9;
            this.V.h(this.P, 2048);
        }
    }

    public void setChecked(boolean z9) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.P;
        checkedTextView.setChecked(z9);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z9 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.T) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                b.h(drawable, this.S);
            }
            int i10 = this.M;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.N) {
            if (this.U == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = p.f11448a;
                Drawable a10 = i.a(resources, msr.pistream.app.R.drawable.navigation_empty_icon, theme);
                this.U = a10;
                if (a10 != null) {
                    int i11 = this.M;
                    a10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.U;
        }
        k0.p.e(this.P, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.P.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.M = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z9;
        this.S = colorStateList;
        if (colorStateList != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.T = z9;
        q qVar = this.R;
        if (qVar != null) {
            setIcon(qVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.P.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z9) {
        this.N = z9;
    }

    public void setTextAppearance(int i10) {
        this.P.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.P.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.P.setText(charSequence);
    }
}
