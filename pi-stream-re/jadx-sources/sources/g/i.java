package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class i extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int D = 0;
    public long A;
    public long B;
    public g C;

    /* renamed from: a, reason: collision with root package name */
    public h f4155a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f4156b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f4157c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4158d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4160f;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4162y;

    /* renamed from: z, reason: collision with root package name */
    public f f4163z;

    /* renamed from: e, reason: collision with root package name */
    public int f4159e = 255;

    /* renamed from: x, reason: collision with root package name */
    public int f4161x = -1;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f4160f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f4157c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.A
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f4159e
            r3.setAlpha(r9)
            r13.A = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            g.h r10 = r13.f4155a
            int r10 = r10.f4153y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f4159e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.A = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f4158d
            if (r9 == 0) goto L61
            long r10 = r13.B
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f4158d = r0
            r13.B = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.h r4 = r13.f4155a
            int r4 = r4.f4154z
            int r3 = r3 / r4
            int r4 = r13.f4159e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.B = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            g.f r14 = r13.f4163z
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        h hVar = this.f4155a;
        if (theme != null) {
            hVar.c();
            int i10 = hVar.f4137h;
            Drawable[] drawableArr = hVar.f4136g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && a0.b.b(drawable)) {
                    a0.b.a(drawableArr[i11], theme);
                    hVar.f4134e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                hVar.f4131b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = hVar.f4132c;
                hVar.f4132c = i12;
                if (i13 != i12) {
                    hVar.f4142m = false;
                    hVar.f4139j = false;
                    return;
                }
                return;
            }
            return;
        }
        hVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.C == null) {
            this.C = new g();
        }
        g gVar = this.C;
        gVar.f4129b = drawable.getCallback();
        drawable.setCallback(gVar);
        try {
            if (this.f4155a.f4153y <= 0 && this.f4160f) {
                drawable.setAlpha(this.f4159e);
            }
            h hVar = this.f4155a;
            if (hVar.C) {
                drawable.setColorFilter(hVar.B);
            } else {
                if (hVar.F) {
                    a0.b.h(drawable, hVar.D);
                }
                h hVar2 = this.f4155a;
                if (hVar2.G) {
                    a0.b.i(drawable, hVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f4155a.f4151w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            a0.c.b(drawable, a0.c.a(this));
            a0.a.e(drawable, this.f4155a.A);
            Rect rect = this.f4156b;
            if (rect != null) {
                a0.b.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            g gVar2 = this.C;
            Drawable.Callback callback = (Drawable.Callback) gVar2.f4129b;
            gVar2.f4129b = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.f4161x
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.h r0 = r9.f4155a
            int r0 = r0.f4154z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f4158d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f4157c
            if (r0 == 0) goto L29
            r9.f4158d = r0
            g.h r0 = r9.f4155a
            int r0 = r0.f4154z
            long r7 = (long) r0
            long r7 = r7 + r2
            r9.B = r7
            goto L35
        L29:
            r9.f4158d = r4
            r9.B = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f4157c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.h r0 = r9.f4155a
            int r7 = r0.f4137h
            if (r10 >= r7) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f4157c = r0
            r9.f4161x = r10
            if (r0 == 0) goto L5a
            g.h r10 = r9.f4155a
            int r10 = r10.f4153y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.A = r2
        L51:
            r9.b(r0)
            goto L5a
        L55:
            r9.f4157c = r4
            r10 = -1
            r9.f4161x = r10
        L5a:
            long r2 = r9.A
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r2 = r9.B
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            g.f r10 = r9.f4163z
            if (r10 != 0) goto L73
            g.f r10 = new g.f
            r10.<init>(r9, r1)
            r9.f4163z = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f4155a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4157c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f4158d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4159e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        h hVar = this.f4155a;
        return changingConfigurations | hVar.f4134e | hVar.f4133d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z9;
        h hVar = this.f4155a;
        if (hVar.f4149u) {
            z9 = hVar.f4150v;
        } else {
            hVar.c();
            hVar.f4149u = true;
            int i10 = hVar.f4137h;
            Drawable[] drawableArr = hVar.f4136g;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (drawableArr[i11].getConstantState() == null) {
                        hVar.f4150v = false;
                        z9 = false;
                        break;
                    }
                    i11++;
                } else {
                    hVar.f4150v = true;
                    z9 = true;
                    break;
                }
            }
        }
        if (z9) {
            this.f4155a.f4133d = getChangingConfigurations();
            return this.f4155a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f4157c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f4156b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        h hVar = this.f4155a;
        if (hVar.f4141l) {
            if (!hVar.f4142m) {
                hVar.b();
            }
            return hVar.o;
        }
        Drawable drawable = this.f4157c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        h hVar = this.f4155a;
        if (hVar.f4141l) {
            if (!hVar.f4142m) {
                hVar.b();
            }
            return hVar.f4143n;
        }
        Drawable drawable = this.f4157c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        h hVar = this.f4155a;
        if (hVar.f4141l) {
            if (!hVar.f4142m) {
                hVar.b();
            }
            return hVar.f4145q;
        }
        Drawable drawable = this.f4157c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        h hVar = this.f4155a;
        if (hVar.f4141l) {
            if (!hVar.f4142m) {
                hVar.b();
            }
            return hVar.f4144p;
        }
        Drawable drawable = this.f4157c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4157c;
        int i10 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        h hVar = this.f4155a;
        if (hVar.f4146r) {
            return hVar.f4147s;
        }
        hVar.c();
        int i11 = hVar.f4137h;
        Drawable[] drawableArr = hVar.f4136g;
        if (i11 > 0) {
            i10 = drawableArr[0].getOpacity();
        }
        for (int i12 = 1; i12 < i11; i12++) {
            i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
        }
        hVar.f4147s = i10;
        hVar.f4146r = true;
        return i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f4157c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        h hVar = this.f4155a;
        boolean z9 = false;
        Rect rect2 = null;
        if (!hVar.f4138i) {
            Rect rect3 = hVar.f4140k;
            if (rect3 == null && !hVar.f4139j) {
                hVar.c();
                Rect rect4 = new Rect();
                int i10 = hVar.f4137h;
                Drawable[] drawableArr = hVar.f4136g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                hVar.f4139j = true;
                hVar.f4140k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f4157c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (this.f4155a.A && a0.c.a(this) == 1) {
            z9 = true;
        }
        if (z9) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        h hVar = this.f4155a;
        if (hVar != null) {
            hVar.f4146r = false;
            hVar.f4148t = false;
        }
        if (drawable == this.f4157c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f4155a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z9;
        Drawable drawable = this.f4158d;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f4158d = null;
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable2 = this.f4157c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f4160f) {
                this.f4157c.setAlpha(this.f4159e);
            }
        }
        if (this.B != 0) {
            this.B = 0L;
            z9 = true;
        }
        if (this.A != 0) {
            this.A = 0L;
        } else {
            z10 = z9;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f4162y && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.G, eVar, null);
            bVar.e();
            d(bVar);
            this.f4162y = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4158d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f4157c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        h hVar = this.f4155a;
        int i11 = this.f4161x;
        int i12 = hVar.f4137h;
        Drawable[] drawableArr = hVar.f4136g;
        boolean z9 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean b10 = a0.c.b(drawable, i10);
                if (i13 == i11) {
                    z9 = b10;
                }
            }
        }
        hVar.f4152x = i10;
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f4158d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f4157c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        if (drawable == this.f4157c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (!this.f4160f || this.f4159e != i10) {
            this.f4160f = true;
            this.f4159e = i10;
            Drawable drawable = this.f4157c;
            if (drawable != null) {
                if (this.A == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        h hVar = this.f4155a;
        if (hVar.A != z9) {
            hVar.A = z9;
            Drawable drawable = this.f4157c;
            if (drawable != null) {
                a0.a.e(drawable, z9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        h hVar = this.f4155a;
        hVar.C = true;
        if (hVar.B != colorFilter) {
            hVar.B = colorFilter;
            Drawable drawable = this.f4157c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z9) {
        h hVar = this.f4155a;
        if (hVar.f4151w != z9) {
            hVar.f4151w = z9;
            Drawable drawable = this.f4157c;
            if (drawable != null) {
                drawable.setDither(z9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f4157c;
        if (drawable != null) {
            a0.b.e(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f4156b;
        if (rect == null) {
            this.f4156b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f4157c;
        if (drawable != null) {
            a0.b.f(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        h hVar = this.f4155a;
        hVar.F = true;
        if (hVar.D != colorStateList) {
            hVar.D = colorStateList;
            w7.b.W(this.f4157c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f4155a;
        hVar.G = true;
        if (hVar.E != mode) {
            hVar.E = mode;
            w7.b.X(this.f4157c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        Drawable drawable = this.f4158d;
        if (drawable != null) {
            drawable.setVisible(z9, z10);
        }
        Drawable drawable2 = this.f4157c;
        if (drawable2 != null) {
            drawable2.setVisible(z9, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f4157c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
