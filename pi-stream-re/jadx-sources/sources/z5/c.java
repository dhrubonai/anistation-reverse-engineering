package z5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import msr.pistream.app.R;
import p7.a0;
import q6.g;
import r3.d;

/* loaded from: classes.dex */
public final class c extends t {
    public static final int[] P = {R.attr.state_indeterminate};
    public static final int[] Q = {R.attr.state_error};
    public static final int[][] R = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int S = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean A;
    public CharSequence B;
    public Drawable C;
    public Drawable D;
    public boolean E;
    public ColorStateList F;
    public ColorStateList G;
    public PorterDuff.Mode H;
    public int I;
    public int[] J;
    public boolean K;
    public CharSequence L;
    public CompoundButton.OnCheckedChangeListener M;
    public final d N;
    public final a O;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f12061e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f12062f;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f12063x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12064y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12065z;

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i10 = this.I;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i10 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12063x == null) {
            int B = g.B(this, R.attr.colorControlActivated);
            int B2 = g.B(this, R.attr.colorError);
            int B3 = g.B(this, R.attr.colorSurface);
            int B4 = g.B(this, R.attr.colorOnSurface);
            this.f12063x = new ColorStateList(R, new int[]{g.F(1.0f, B3, B2), g.F(1.0f, B3, B), g.F(0.54f, B3, B4), g.F(0.38f, B3, B4), g.F(0.38f, B3, B4)});
        }
        return this.f12063x;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.F;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        int intrinsicWidth;
        int intrinsicHeight;
        int i10;
        int i11;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        androidx.appcompat.widget.d dVar;
        Drawable drawable = this.C;
        ColorStateList colorStateList3 = this.F;
        PorterDuff.Mode b10 = k0.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b10 != null) {
                a0.b.i(drawable, b10);
            }
        }
        this.C = drawable;
        Drawable drawable2 = this.D;
        ColorStateList colorStateList4 = this.G;
        PorterDuff.Mode mode = this.H;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                a0.b.i(drawable2, mode);
            }
        }
        this.D = drawable2;
        if (this.E) {
            d dVar2 = this.N;
            if (dVar2 != null) {
                Drawable drawable3 = dVar2.f9338a;
                a aVar = this.O;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f12058a == null) {
                        aVar.f12058a = new r3.a(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f12058a);
                }
                ArrayList arrayList = dVar2.f9335e;
                r3.b bVar = dVar2.f9332b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (dVar2.f9335e.size() == 0 && (dVar = dVar2.f9334d) != null) {
                        bVar.f9327b.removeListener(dVar);
                        dVar2.f9334d = null;
                    }
                }
                Drawable drawable4 = dVar2.f9338a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f12058a == null) {
                        aVar.f12058a = new r3.a(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f12058a);
                } else if (aVar != null) {
                    if (dVar2.f9335e == null) {
                        dVar2.f9335e = new ArrayList();
                    }
                    if (!dVar2.f9335e.contains(aVar)) {
                        dVar2.f9335e.add(aVar);
                        if (dVar2.f9334d == null) {
                            dVar2.f9334d = new androidx.appcompat.widget.d(dVar2, 2);
                        }
                        bVar.f9327b.addListener(dVar2.f9334d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable5 = this.C;
                if ((drawable5 instanceof AnimatedStateListDrawable) && dVar2 != null) {
                    ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, dVar2, false);
                    ((AnimatedStateListDrawable) this.C).addTransition(R.id.indeterminate, R.id.unchecked, dVar2, false);
                }
            }
        }
        Drawable drawable6 = this.C;
        if (drawable6 != null && (colorStateList2 = this.F) != null) {
            a0.b.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.D;
        if (drawable7 != null && (colorStateList = this.G) != null) {
            a0.b.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.C;
        Drawable drawable9 = this.D;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            if (drawable9.getIntrinsicWidth() != -1 && drawable9.getIntrinsicHeight() != -1) {
                if (drawable9.getIntrinsicWidth() <= drawable8.getIntrinsicWidth() && drawable9.getIntrinsicHeight() <= drawable8.getIntrinsicHeight()) {
                    i11 = drawable9.getIntrinsicWidth();
                    i10 = drawable9.getIntrinsicHeight();
                } else {
                    float intrinsicWidth2 = drawable9.getIntrinsicWidth() / drawable9.getIntrinsicHeight();
                    if (intrinsicWidth2 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                        i11 = drawable8.getIntrinsicWidth();
                        i10 = (int) (i11 / intrinsicWidth2);
                    } else {
                        intrinsicHeight = drawable8.getIntrinsicHeight();
                        intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
                    }
                }
                layerDrawable.setLayerSize(1, i11, i10);
                layerDrawable.setLayerGravity(1, 17);
                drawable8 = layerDrawable;
            } else {
                intrinsicWidth = drawable8.getIntrinsicWidth();
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            int i12 = intrinsicWidth;
            i10 = intrinsicHeight;
            i11 = i12;
            layerDrawable.setLayerSize(1, i11, i10);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.C;
    }

    public Drawable getButtonIconDrawable() {
        return this.D;
    }

    public ColorStateList getButtonIconTintList() {
        return this.G;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.H;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.F;
    }

    public int getCheckedState() {
        return this.I;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.B;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.I == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12064y && this.F == null && this.G == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, P);
        }
        if (this.A) {
            View.mergeDrawableStates(onCreateDrawableState, Q);
        }
        int i11 = 0;
        while (true) {
            if (i11 < onCreateDrawableState.length) {
                int i12 = onCreateDrawableState[i11];
                if (i12 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i12 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i11] = 16842912;
                    break;
                }
                i11++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.J = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a10;
        int i10;
        if (this.f12065z && TextUtils.isEmpty(getText()) && (a10 = k0.c.a(this)) != null) {
            if (a0.J(this)) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i10;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a10.getBounds();
                a0.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.A) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.B));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f12060a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f12060a = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.t, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(w7.b.G(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.D = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(w7.b.G(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.G == colorStateList) {
            return;
        }
        this.G = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.H == mode) {
            return;
        }
        this.H = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.F == colorStateList) {
            return;
        }
        this.F = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z9) {
        this.f12065z = z9;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        setCheckedState(z9 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z9;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.I != i10) {
            this.I = i10;
            if (i10 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            super.setChecked(z9);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.L == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.K) {
                return;
            }
            this.K = true;
            LinkedHashSet linkedHashSet = this.f12062f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    a3.g.z(it.next());
                    throw null;
                }
            }
            if (this.I != 2 && (onCheckedChangeListener = this.M) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i11 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.K = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.B = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z9) {
        if (this.A == z9) {
            return;
        }
        this.A = z9;
        refreshDrawableState();
        Iterator it = this.f12061e.iterator();
        if (!it.hasNext()) {
            return;
        }
        a3.g.z(it.next());
        throw null;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.M = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.L = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f12064y = z9;
        if (z9) {
            k0.b.c(this, getMaterialThemeColorsTintList());
        } else {
            k0.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.t, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.C = drawable;
        this.E = false;
        a();
    }
}
