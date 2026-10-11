package com.google.android.material.chip;

import a0.h;
import a0.i;
import a6.c;
import a6.e;
import a6.f;
import a6.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.t;
import e0.m;
import e0.n;
import g0.h0;
import g0.i0;
import g0.n0;
import g0.y0;
import g6.d;
import j6.k;
import j6.v;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p7.a0;
import s5.a;
import w7.b;
import x.j;

/* loaded from: classes.dex */
public class Chip extends t implements f, v, Checkable {
    public static final Rect N = new Rect();
    public static final int[] O = {R.attr.state_selected};
    public static final int[] P = {R.attr.state_checkable};
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public CharSequence H;
    public final e I;
    public boolean J;
    public final Rect K;
    public final RectF L;
    public final c M;

    /* renamed from: e, reason: collision with root package name */
    public g f2696e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f2697f;

    /* renamed from: x, reason: collision with root package name */
    public RippleDrawable f2698x;

    /* renamed from: y, reason: collision with root package name */
    public View.OnClickListener f2699y;

    /* renamed from: z, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f2700z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(b.Z(context, attributeSet, msr.pistream.app.R.attr.chipStyle, msr.pistream.app.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, msr.pistream.app.R.attr.chipStyle);
        d dVar;
        t5.b bVar;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.K = new Rect();
        this.L = new RectF();
        int i10 = 0;
        this.M = new c(this, i10);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        g gVar = new g(context2, attributeSet);
        Context context3 = gVar.f151v0;
        int[] iArr = a.f9901b;
        TypedArray N2 = b.N(context3, attributeSet, iArr, msr.pistream.app.R.attr.chipStyle, msr.pistream.app.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        gVar.W0 = N2.hasValue(37);
        Context context4 = gVar.f151v0;
        ColorStateList u9 = a0.u(context4, N2, 24);
        if (gVar.O != u9) {
            gVar.O = u9;
            gVar.onStateChange(gVar.getState());
        }
        ColorStateList u10 = a0.u(context4, N2, 11);
        if (gVar.P != u10) {
            gVar.P = u10;
            gVar.onStateChange(gVar.getState());
        }
        float dimension = N2.getDimension(19, 0.0f);
        if (gVar.Q != dimension) {
            gVar.Q = dimension;
            gVar.invalidateSelf();
            gVar.u();
        }
        if (N2.hasValue(12)) {
            gVar.A(N2.getDimension(12, 0.0f));
        }
        gVar.F(a0.u(context4, N2, 22));
        gVar.G(N2.getDimension(23, 0.0f));
        gVar.P(a0.u(context4, N2, 36));
        String text = N2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(gVar.V, text)) {
            gVar.V = text;
            gVar.B0.f3590d = true;
            gVar.invalidateSelf();
            gVar.u();
        }
        t5.b bVar2 = null;
        if (N2.hasValue(0) && (resourceId3 = N2.getResourceId(0, 0)) != 0) {
            dVar = new d(context4, resourceId3);
        } else {
            dVar = null;
        }
        dVar.f4480k = N2.getDimension(1, dVar.f4480k);
        gVar.Q(dVar);
        int i11 = N2.getInt(3, 0);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    gVar.T0 = TextUtils.TruncateAt.END;
                }
            } else {
                gVar.T0 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            gVar.T0 = TextUtils.TruncateAt.START;
        }
        gVar.E(N2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            gVar.E(N2.getBoolean(15, false));
        }
        gVar.B(a0.x(context4, N2, 14));
        if (N2.hasValue(17)) {
            gVar.D(a0.u(context4, N2, 17));
        }
        gVar.C(N2.getDimension(16, -1.0f));
        gVar.M(N2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            gVar.M(N2.getBoolean(26, false));
        }
        gVar.H(a0.x(context4, N2, 25));
        gVar.L(a0.u(context4, N2, 30));
        gVar.J(N2.getDimension(28, 0.0f));
        gVar.w(N2.getBoolean(6, false));
        gVar.z(N2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            gVar.z(N2.getBoolean(8, false));
        }
        gVar.x(a0.x(context4, N2, 7));
        if (N2.hasValue(9)) {
            gVar.y(a0.u(context4, N2, 9));
        }
        if (N2.hasValue(39) && (resourceId2 = N2.getResourceId(39, 0)) != 0) {
            bVar = t5.b.a(context4, resourceId2);
        } else {
            bVar = null;
        }
        gVar.f141l0 = bVar;
        if (N2.hasValue(33) && (resourceId = N2.getResourceId(33, 0)) != 0) {
            bVar2 = t5.b.a(context4, resourceId);
        }
        gVar.f142m0 = bVar2;
        float dimension2 = N2.getDimension(21, 0.0f);
        if (gVar.f143n0 != dimension2) {
            gVar.f143n0 = dimension2;
            gVar.invalidateSelf();
            gVar.u();
        }
        gVar.O(N2.getDimension(35, 0.0f));
        gVar.N(N2.getDimension(34, 0.0f));
        float dimension3 = N2.getDimension(41, 0.0f);
        if (gVar.f146q0 != dimension3) {
            gVar.f146q0 = dimension3;
            gVar.invalidateSelf();
            gVar.u();
        }
        float dimension4 = N2.getDimension(40, 0.0f);
        if (gVar.f147r0 != dimension4) {
            gVar.f147r0 = dimension4;
            gVar.invalidateSelf();
            gVar.u();
        }
        gVar.K(N2.getDimension(29, 0.0f));
        gVar.I(N2.getDimension(27, 0.0f));
        float dimension5 = N2.getDimension(13, 0.0f);
        if (gVar.f150u0 != dimension5) {
            gVar.f150u0 = dimension5;
            gVar.invalidateSelf();
            gVar.u();
        }
        gVar.V0 = N2.getDimensionPixelSize(4, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        N2.recycle();
        TypedArray N3 = b.N(context2, attributeSet, iArr, msr.pistream.app.R.attr.chipStyle, msr.pistream.app.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.E = N3.getBoolean(32, false);
        this.G = (int) Math.ceil(N3.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        N3.recycle();
        setChipDrawable(gVar);
        gVar.i(n0.i(this));
        TypedArray N4 = b.N(context2, attributeSet, iArr, msr.pistream.app.R.attr.chipStyle, msr.pistream.app.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        boolean hasValue = N4.hasValue(37);
        N4.recycle();
        this.I = new e(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new a6.d(this, i10));
        }
        setChecked(this.A);
        setText(gVar.V);
        setEllipsize(gVar.T0);
        g();
        if (!this.f2696e.U0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.E) {
            setMinHeight(this.G);
        }
        this.F = i0.d(this);
        super.setOnCheckedChangeListener(new a6.b(this, i10));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.L;
        rectF.setEmpty();
        if (c() && this.f2699y != null) {
            g gVar = this.f2696e;
            Rect bounds = gVar.getBounds();
            rectF.setEmpty();
            if (gVar.T()) {
                float f10 = gVar.f150u0 + gVar.f149t0 + gVar.f135f0 + gVar.f148s0 + gVar.f147r0;
                if (a0.c.a(gVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.K;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private d getTextAppearance() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.B0.f3592f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z9) {
        if (this.C != z9) {
            this.C = z9;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z9) {
        if (this.B != z9) {
            this.B = z9;
            refreshDrawableState();
        }
    }

    public final void b(int i10) {
        int i11;
        this.G = i10;
        int i12 = 0;
        if (!this.E) {
            InsetDrawable insetDrawable = this.f2697f;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f2697f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = h6.a.f5008a;
                    e();
                    return;
                }
                return;
            }
            int[] iArr2 = h6.a.f5008a;
            e();
            return;
        }
        int max = Math.max(0, i10 - ((int) this.f2696e.Q));
        int max2 = Math.max(0, i10 - this.f2696e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f2697f;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f2697f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = h6.a.f5008a;
                    e();
                    return;
                }
                return;
            }
            int[] iArr4 = h6.a.f5008a;
            e();
            return;
        }
        if (max2 > 0) {
            i11 = max2 / 2;
        } else {
            i11 = 0;
        }
        if (max > 0) {
            i12 = max / 2;
        }
        int i13 = i12;
        if (this.f2697f != null) {
            Rect rect = new Rect();
            this.f2697f.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = h6.a.f5008a;
                e();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f2697f = new InsetDrawable((Drawable) this.f2696e, i11, i13, i11, i13);
        int[] iArr6 = h6.a.f5008a;
        e();
    }

    public final boolean c() {
        g gVar = this.f2696e;
        if (gVar != null) {
            Object obj = gVar.f132c0;
            if (obj != null) {
                if (obj instanceof h) {
                    ((i) ((h) obj)).getClass();
                    obj = null;
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        boolean z9;
        if (c()) {
            g gVar = this.f2696e;
            if (gVar != null && gVar.f131b0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && this.f2699y != null) {
                y0.l(this, this.I);
                this.J = true;
                return;
            }
        }
        y0.l(this, null);
        this.J = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.J
            if (r0 != 0) goto L9
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L9:
            a6.e r0 = r10.I
            android.view.accessibility.AccessibilityManager r1 = r0.f123h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L70
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L70
        L1c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.8E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L42
            r6 = 9
            if (r1 == r6) goto L42
            r6 = 10
            if (r1 == r6) goto L32
            goto L70
        L32:
            int r1 = r0.f128m
            if (r1 == r7) goto L70
            if (r1 != r7) goto L39
            goto L6e
        L39:
            r0.f128m = r7
            r0.q(r7, r5)
            r0.q(r1, r2)
            goto L6e
        L42:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = r0.f129n
            boolean r9 = r8.c()
            if (r9 == 0) goto L5e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L5e
            r1 = r3
            goto L5f
        L5e:
            r1 = r4
        L5f:
            int r6 = r0.f128m
            if (r6 != r1) goto L64
            goto L6c
        L64:
            r0.f128m = r1
            r0.q(r1, r5)
            r0.q(r6, r2)
        L6c:
            if (r1 == r7) goto L70
        L6e:
            r0 = r3
            goto L71
        L70:
            r0 = r4
        L71:
            if (r0 != 0) goto L7b
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L7a
            goto L7b
        L7a:
            r3 = r4
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.J) {
            return super.dispatchKeyEvent(keyEvent);
        }
        e eVar = this.I;
        eVar.getClass();
        boolean z9 = false;
        int i10 = 0;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i11 = 130;
                                        }
                                    } else {
                                        i11 = 17;
                                    }
                                } else {
                                    i11 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && eVar.m(i11, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                z9 = z10;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i12 = eVar.f127l;
                    if (i12 != Integer.MIN_VALUE) {
                        Chip chip = eVar.f129n;
                        if (i12 == 0) {
                            chip.performClick();
                        } else if (i12 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f2699y;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.J) {
                                chip.I.q(1, 1);
                            }
                        }
                    }
                    z9 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z9 = eVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z9 = eVar.m(1, null);
            }
        }
        if (z9 && eVar.f127l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // androidx.appcompat.widget.t, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        g gVar = this.f2696e;
        boolean z9 = false;
        if (gVar != null && g.t(gVar.f132c0)) {
            g gVar2 = this.f2696e;
            ?? isEnabled = isEnabled();
            int i11 = isEnabled;
            if (this.D) {
                i11 = isEnabled + 1;
            }
            int i12 = i11;
            if (this.C) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.B) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.D) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.C) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.B) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(gVar2.P0, iArr)) {
                gVar2.P0 = iArr;
                if (gVar2.T()) {
                    z9 = gVar2.v(gVar2.getState(), iArr);
                }
            }
        }
        if (z9) {
            invalidate();
        }
    }

    public final void e() {
        this.f2698x = new RippleDrawable(h6.a.a(this.f2696e.U), getBackgroundDrawable(), null);
        g gVar = this.f2696e;
        if (gVar.Q0) {
            gVar.Q0 = false;
            gVar.R0 = null;
            gVar.onStateChange(gVar.getState());
        }
        RippleDrawable rippleDrawable = this.f2698x;
        WeakHashMap weakHashMap = y0.f4277a;
        h0.q(this, rippleDrawable);
        f();
    }

    public final void f() {
        g gVar;
        if (!TextUtils.isEmpty(getText()) && (gVar = this.f2696e) != null) {
            int q9 = (int) (gVar.q() + gVar.f150u0 + gVar.f147r0);
            g gVar2 = this.f2696e;
            int p3 = (int) (gVar2.p() + gVar2.f143n0 + gVar2.f146q0);
            if (this.f2697f != null) {
                Rect rect = new Rect();
                this.f2697f.getPadding(rect);
                p3 += rect.left;
                q9 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = y0.f4277a;
            i0.k(this, p3, paddingTop, q9, paddingBottom);
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        g gVar = this.f2696e;
        if (gVar != null) {
            paint.drawableState = gVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.M);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z9;
        if (!TextUtils.isEmpty(this.H)) {
            return this.H;
        }
        g gVar = this.f2696e;
        if (gVar != null && gVar.f137h0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            getParent();
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2697f;
        if (insetDrawable == null) {
            return this.f2696e;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f139j0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f140k0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.P;
        }
        return null;
    }

    public float getChipCornerRadius() {
        g gVar = this.f2696e;
        if (gVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, gVar.r());
    }

    public Drawable getChipDrawable() {
        return this.f2696e;
    }

    public float getChipEndPadding() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f150u0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        g gVar = this.f2696e;
        if (gVar == null || (drawable = gVar.X) == 0) {
            return null;
        }
        if (drawable instanceof h) {
            ((i) ((h) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.Z;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.Y;
        }
        return null;
    }

    public float getChipMinHeight() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.Q;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f143n0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.S;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.T;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        g gVar = this.f2696e;
        if (gVar == null || (drawable = gVar.f132c0) == 0) {
            return null;
        }
        if (drawable instanceof h) {
            ((i) ((h) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f136g0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f149t0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f135f0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f148s0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f134e0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.T0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.J) {
            e eVar = this.I;
            if (eVar.f127l == 1 || eVar.f126k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public t5.b getHideMotionSpec() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f142m0;
        }
        return null;
    }

    public float getIconEndPadding() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f145p0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f144o0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.U;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f2696e.f6194a.f6174a;
    }

    public t5.b getShowMotionSpec() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f141l0;
        }
        return null;
    }

    public float getTextEndPadding() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f147r0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        g gVar = this.f2696e;
        if (gVar != null) {
            return gVar.f146q0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a0.V(this, this.f2696e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z9;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, O);
        }
        g gVar = this.f2696e;
        if (gVar != null && gVar.f137h0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            View.mergeDrawableStates(onCreateDrawableState, P);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z9, int i10, Rect rect) {
        super.onFocusChanged(z9, i10, rect);
        if (this.J) {
            e eVar = this.I;
            int i11 = eVar.f127l;
            if (i11 != Integer.MIN_VALUE) {
                eVar.j(i11);
            }
            if (z9) {
                eVar.m(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        g gVar = this.f2696e;
        if (gVar != null && gVar.f137h0) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        PointerIcon systemIcon;
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            return systemIcon;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.F != i10) {
            this.F = i10;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.B
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r3)
            goto L4e
        L2b:
            boolean r0 = r5.B
            if (r0 == 0) goto L44
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f2699y
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.J
            if (r0 == 0) goto L42
            a6.e r0 = r5.I
            r0.q(r2, r2)
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            r5.setCloseIconPressed(r3)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
        L4e:
            r0 = r2
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f2698x) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.t, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f2698x) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.t, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z9) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.w(z9);
        }
    }

    public void setCheckableResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.w(gVar.f151v0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        g gVar = this.f2696e;
        if (gVar == null) {
            this.A = z9;
        } else if (gVar.f137h0) {
            super.setChecked(z9);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z9) {
        setCheckedIconVisible(z9);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.x(b.G(gVar.f151v0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.y(j.getColorStateList(gVar.f151v0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.z(gVar.f151v0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        g gVar = this.f2696e;
        if (gVar != null && gVar.P != colorStateList) {
            gVar.P = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateList;
        g gVar = this.f2696e;
        if (gVar != null && gVar.P != (colorStateList = j.getColorStateList(gVar.f151v0, i10))) {
            gVar.P = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.A(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.A(gVar.f151v0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(g gVar) {
        g gVar2 = this.f2696e;
        if (gVar2 != gVar) {
            if (gVar2 != null) {
                gVar2.S0 = new WeakReference(null);
            }
            this.f2696e = gVar;
            gVar.U0 = false;
            gVar.S0 = new WeakReference(this);
            b(this.G);
        }
    }

    public void setChipEndPadding(float f10) {
        g gVar = this.f2696e;
        if (gVar != null && gVar.f150u0 != f10) {
            gVar.f150u0 = f10;
            gVar.invalidateSelf();
            gVar.u();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            float dimension = gVar.f151v0.getResources().getDimension(i10);
            if (gVar.f150u0 != dimension) {
                gVar.f150u0 = dimension;
                gVar.invalidateSelf();
                gVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z9) {
        setChipIconVisible(z9);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.B(b.G(gVar.f151v0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.C(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.C(gVar.f151v0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.D(j.getColorStateList(gVar.f151v0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.E(gVar.f151v0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f10) {
        g gVar = this.f2696e;
        if (gVar != null && gVar.Q != f10) {
            gVar.Q = f10;
            gVar.invalidateSelf();
            gVar.u();
        }
    }

    public void setChipMinHeightResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            float dimension = gVar.f151v0.getResources().getDimension(i10);
            if (gVar.Q != dimension) {
                gVar.Q = dimension;
                gVar.invalidateSelf();
                gVar.u();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        g gVar = this.f2696e;
        if (gVar != null && gVar.f143n0 != f10) {
            gVar.f143n0 = f10;
            gVar.invalidateSelf();
            gVar.u();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            float dimension = gVar.f151v0.getResources().getDimension(i10);
            if (gVar.f143n0 != dimension) {
                gVar.f143n0 = dimension;
                gVar.invalidateSelf();
                gVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.F(j.getColorStateList(gVar.f151v0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.G(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.G(gVar.f151v0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e0.c cVar;
        g gVar = this.f2696e;
        if (gVar != null && gVar.f136g0 != charSequence) {
            String str = e0.c.f3303d;
            Locale locale = Locale.getDefault();
            int i10 = n.f3321a;
            boolean z9 = true;
            if (m.a(locale) != 1) {
                z9 = false;
            }
            if (z9) {
                cVar = e0.c.f3306g;
            } else {
                cVar = e0.c.f3305f;
            }
            gVar.f136g0 = cVar.c(charSequence, cVar.f3309c);
            gVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z9) {
        setCloseIconVisible(z9);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.I(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.I(gVar.f151v0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.H(b.G(gVar.f151v0, i10));
        }
        d();
    }

    public void setCloseIconSize(float f10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.J(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.J(gVar.f151v0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.K(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.K(gVar.f151v0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.L(j.getColorStateList(gVar.f151v0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.t, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.t, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.i(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2696e == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            g gVar = this.f2696e;
            if (gVar != null) {
                gVar.T0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z9) {
        this.E = z9;
        b(this.G);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(t5.b bVar) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.f142m0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.f142m0 = t5.b.a(gVar.f151v0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.N(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.N(gVar.f151v0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.O(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.O(gVar.f151v0.getResources().getDimension(i10));
        }
    }

    public void setInternalOnCheckedChangeListener(e6.e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f2696e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.V0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2700z = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2699y = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.P(colorStateList);
        }
        if (!this.f2696e.Q0) {
            e();
        }
    }

    public void setRippleColorResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.P(j.getColorStateList(gVar.f151v0, i10));
            if (!this.f2696e.Q0) {
                e();
            }
        }
    }

    @Override // j6.v
    public void setShapeAppearanceModel(k kVar) {
        this.f2696e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(t5.b bVar) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.f141l0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.f141l0 = t5.b.a(gVar.f151v0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z9) {
        if (z9) {
            super.setSingleLine(z9);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        g gVar = this.f2696e;
        if (gVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (gVar.U0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        g gVar2 = this.f2696e;
        if (gVar2 != null && !TextUtils.equals(gVar2.V, charSequence)) {
            gVar2.V = charSequence;
            gVar2.B0.f3590d = true;
            gVar2.invalidateSelf();
            gVar2.u();
        }
    }

    public void setTextAppearance(d dVar) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.Q(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        g gVar = this.f2696e;
        if (gVar != null && gVar.f147r0 != f10) {
            gVar.f147r0 = f10;
            gVar.invalidateSelf();
            gVar.u();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            float dimension = gVar.f151v0.getResources().getDimension(i10);
            if (gVar.f147r0 != dimension) {
                gVar.f147r0 = dimension;
                gVar.invalidateSelf();
                gVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        g gVar = this.f2696e;
        if (gVar != null) {
            float applyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            e6.i iVar = gVar.B0;
            d dVar = iVar.f3592f;
            if (dVar != null) {
                dVar.f4480k = applyDimension;
                iVar.f3587a.setTextSize(applyDimension);
                gVar.u();
                gVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f10) {
        g gVar = this.f2696e;
        if (gVar != null && gVar.f146q0 != f10) {
            gVar.f146q0 = f10;
            gVar.invalidateSelf();
            gVar.u();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        g gVar = this.f2696e;
        if (gVar != null) {
            float dimension = gVar.f151v0.getResources().getDimension(i10);
            if (gVar.f146q0 != dimension) {
                gVar.f146q0 = dimension;
                gVar.invalidateSelf();
                gVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z9) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.M(z9);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z9) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.z(z9);
        }
    }

    public void setChipIconVisible(boolean z9) {
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.E(z9);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.Q(new d(gVar.f151v0, i10));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        g gVar = this.f2696e;
        if (gVar != null) {
            gVar.Q(new d(gVar.f151v0, i10));
        }
        g();
    }
}
