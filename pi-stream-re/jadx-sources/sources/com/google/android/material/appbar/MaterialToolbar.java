package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import g0.h0;
import g0.n0;
import g0.y0;
import j.o;
import j6.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import msr.pistream.app.R;
import p7.a0;
import s5.a;
import u.f;
import w7.b;
import z7.c;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: q0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f2629q0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: l0, reason: collision with root package name */
    public Integer f2630l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f2631m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f2632n0;

    /* renamed from: o0, reason: collision with root package name */
    public ImageView.ScaleType f2633o0;

    /* renamed from: p0, reason: collision with root package name */
    public Boolean f2634p0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(b.Z(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray N = b.N(context2, attributeSet, a.f9916r, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (N.hasValue(2)) {
            setNavigationIconTint(N.getColor(2, -1));
        }
        this.f2631m0 = N.getBoolean(4, false);
        this.f2632n0 = N.getBoolean(3, false);
        int i10 = N.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2629q0;
            if (i10 < scaleTypeArr.length) {
                this.f2633o0 = scaleTypeArr[i10];
            }
        }
        if (N.hasValue(0)) {
            this.f2634p0 = Boolean.valueOf(N.getBoolean(0, false));
        }
        N.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.j(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.h(context2);
            WeakHashMap weakHashMap = y0.f4277a;
            gVar.i(n0.i(this));
            h0.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2633o0;
    }

    public Integer getNavigationIconTint() {
        return this.f2630l0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void k(int i10) {
        Menu menu = getMenu();
        boolean z9 = menu instanceof o;
        if (z9) {
            ((o) menu).w();
        }
        super.k(i10);
        if (z9) {
            ((o) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            a0.V(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z9, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.f2631m0 || this.f2632n0) {
            ArrayList o = c.o(this, getTitle());
            boolean isEmpty = o.isEmpty();
            f fVar = c.f12111e;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(o, fVar);
            }
            ArrayList o6 = c.o(this, getSubtitle());
            if (o6.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(o6, fVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2631m0 && textView != null) {
                    t(textView, pair);
                }
                if (this.f2632n0 && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2634p0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2633o0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f10);
        }
    }

    public void setLogoAdjustViewBounds(boolean z9) {
        Boolean bool = this.f2634p0;
        if (bool == null || bool.booleanValue() != z9) {
            this.f2634p0 = Boolean.valueOf(z9);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2633o0 != scaleType) {
            this.f2633o0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f2630l0 != null) {
            drawable = drawable.mutate();
            a0.b.g(drawable, this.f2630l0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f2630l0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z9) {
        if (this.f2632n0 != z9) {
            this.f2632n0 = z9;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z9) {
        if (this.f2631m0 != z9) {
            this.f2631m0 = z9;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
