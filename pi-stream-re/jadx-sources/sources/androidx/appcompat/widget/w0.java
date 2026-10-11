package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public final class w0 extends Spinner {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f687z = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final r f688a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f689b;

    /* renamed from: c, reason: collision with root package name */
    public final k f690c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f691d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f692e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f693f;

    /* renamed from: x, reason: collision with root package name */
    public int f694x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f695y;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w0(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 2130969552(0x7f0403d0, float:1.754779E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.f695y = r1
            android.content.Context r1 = r11.getContext()
            androidx.appcompat.widget.v3.a(r1, r11)
            int[] r1 = e.a.f3290v
            r2 = 0
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r1, r0, r2)
            androidx.appcompat.widget.r r4 = new androidx.appcompat.widget.r
            r4.<init>(r11)
            r11.f688a = r4
            r4 = 4
            int r4 = r3.getResourceId(r4, r2)
            if (r4 == 0) goto L31
            i.e r5 = new i.e
            r5.<init>(r12, r4)
            r11.f689b = r5
            goto L33
        L31:
            r11.f689b = r12
        L33:
            r4 = -1
            r5 = 0
            int[] r6 = androidx.appcompat.widget.w0.f687z     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r0, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            boolean r7 = r6.hasValue(r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            if (r7 == 0) goto L5b
            int r4 = r6.getInt(r2, r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            goto L5b
        L46:
            r12 = move-exception
            r5 = r6
            goto Ld0
        L4a:
            r7 = move-exception
            goto L52
        L4c:
            r12 = move-exception
            goto Ld0
        L4f:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L52:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L5e
        L5b:
            r6.recycle()
        L5e:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L98
            if (r4 == r7) goto L65
            goto La5
        L65:
            androidx.appcompat.widget.t0 r4 = new androidx.appcompat.widget.t0
            android.content.Context r8 = r11.f689b
            r4.<init>(r11, r8, r13)
            android.content.Context r8 = r11.f689b
            androidx.appcompat.widget.o3 r1 = androidx.appcompat.widget.o3.m(r8, r13, r1, r0)
            java.lang.Object r8 = r1.f598b
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.f694x = r8
            android.graphics.drawable.Drawable r8 = r1.e(r7)
            r4.i(r8)
            java.lang.String r6 = r3.getString(r6)
            r4.U = r6
            r1.p()
            r11.f693f = r4
            androidx.appcompat.widget.k r1 = new androidx.appcompat.widget.k
            r1.<init>(r11, r11, r4, r7)
            r11.f690c = r1
            goto La5
        L98:
            androidx.appcompat.widget.q0 r1 = new androidx.appcompat.widget.q0
            r1.<init>(r11)
            r11.f693f = r1
            java.lang.String r4 = r3.getString(r6)
            r1.f607c = r4
        La5:
            java.lang.CharSequence[] r1 = r3.getTextArray(r2)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r12, r4, r1)
            r12 = 2131558525(0x7f0d007d, float:1.8742368E38)
            r2.setDropDownViewResource(r12)
            r11.setAdapter(r2)
        Lbc:
            r3.recycle()
            r11.f692e = r7
            android.widget.SpinnerAdapter r12 = r11.f691d
            if (r12 == 0) goto Lca
            r11.setAdapter(r12)
            r11.f691d = r5
        Lca:
            androidx.appcompat.widget.r r12 = r11.f688a
            r12.e(r13, r0)
            return
        Ld0:
            if (r5 == 0) goto Ld5
            r5.recycle()
        Ld5:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f695y;
            drawable.getPadding(rect);
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f688a;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        v0 v0Var = this.f693f;
        if (v0Var != null) {
            return v0Var.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        v0 v0Var = this.f693f;
        if (v0Var != null) {
            return v0Var.o();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f693f != null) {
            return this.f694x;
        }
        return super.getDropDownWidth();
    }

    public final v0 getInternalPopup() {
        return this.f693f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        v0 v0Var = this.f693f;
        if (v0Var != null) {
            return v0Var.e();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f689b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        v0 v0Var = this.f693f;
        if (v0Var != null) {
            return v0Var.p();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f688a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f688a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v0 v0Var = this.f693f;
        if (v0Var != null && v0Var.b()) {
            v0Var.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f693f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        u0 u0Var = (u0) parcelable;
        super.onRestoreInstanceState(u0Var.getSuperState());
        if (u0Var.f660a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new j.e(this, 2));
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z9;
        u0 u0Var = new u0(super.onSaveInstanceState());
        v0 v0Var = this.f693f;
        if (v0Var != null && v0Var.b()) {
            z9 = true;
        } else {
            z9 = false;
        }
        u0Var.f660a = z9;
        return u0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k kVar = this.f690c;
        if (kVar != null && kVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        v0 v0Var = this.f693f;
        if (v0Var != null) {
            if (!v0Var.b()) {
                v0Var.m(o0.b(this), o0.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f688a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f688a;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        v0 v0Var = this.f693f;
        if (v0Var != null) {
            v0Var.k(i10);
            v0Var.l(i10);
        } else {
            super.setDropDownHorizontalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        v0 v0Var = this.f693f;
        if (v0Var != null) {
            v0Var.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f693f != null) {
            this.f694x = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        v0 v0Var = this.f693f;
        if (v0Var != null) {
            v0Var.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(w7.b.G(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        v0 v0Var = this.f693f;
        if (v0Var != null) {
            v0Var.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f688a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f688a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f692e) {
            this.f691d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        v0 v0Var = this.f693f;
        if (v0Var != null) {
            Context context = this.f689b;
            if (context == null) {
                context = getContext();
            }
            v0Var.q(new r0(spinnerAdapter, context.getTheme()));
        }
    }
}
