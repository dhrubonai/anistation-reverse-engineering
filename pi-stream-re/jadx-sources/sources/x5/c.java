package x5;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import g0.i0;
import g0.y0;
import j6.f;
import j6.g;
import j6.k;
import j6.v;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f11281a;

    /* renamed from: b, reason: collision with root package name */
    public k f11282b;

    /* renamed from: c, reason: collision with root package name */
    public int f11283c;

    /* renamed from: d, reason: collision with root package name */
    public int f11284d;

    /* renamed from: e, reason: collision with root package name */
    public int f11285e;

    /* renamed from: f, reason: collision with root package name */
    public int f11286f;

    /* renamed from: g, reason: collision with root package name */
    public int f11287g;

    /* renamed from: h, reason: collision with root package name */
    public int f11288h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f11289i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f11290j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f11291k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f11292l;

    /* renamed from: m, reason: collision with root package name */
    public g f11293m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11296q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f11298s;

    /* renamed from: t, reason: collision with root package name */
    public int f11299t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11294n = false;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11295p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11297r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f11281a = materialButton;
        this.f11282b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f11298s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f11298s.getNumberOfLayers() > 2) {
                return (v) this.f11298s.getDrawable(2);
            }
            return (v) this.f11298s.getDrawable(1);
        }
        return null;
    }

    public final g b(boolean z9) {
        RippleDrawable rippleDrawable = this.f11298s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f11298s.getDrawable(0)).getDrawable()).getDrawable(!z9 ? 1 : 0);
        }
        return null;
    }

    public final void c(k kVar) {
        this.f11282b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i10, int i11) {
        WeakHashMap weakHashMap = y0.f4277a;
        MaterialButton materialButton = this.f11281a;
        int f10 = i0.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e10 = i0.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f11285e;
        int i13 = this.f11286f;
        this.f11286f = i11;
        this.f11285e = i10;
        if (!this.o) {
            e();
        }
        i0.k(materialButton, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    public final void e() {
        int i10;
        g gVar = new g(this.f11282b);
        MaterialButton materialButton = this.f11281a;
        gVar.h(materialButton.getContext());
        a0.b.h(gVar, this.f11290j);
        PorterDuff.Mode mode = this.f11289i;
        if (mode != null) {
            a0.b.i(gVar, mode);
        }
        float f10 = this.f11288h;
        ColorStateList colorStateList = this.f11291k;
        gVar.f6194a.f6184k = f10;
        gVar.invalidateSelf();
        f fVar = gVar.f6194a;
        if (fVar.f6177d != colorStateList) {
            fVar.f6177d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f11282b);
        gVar2.setTint(0);
        float f11 = this.f11288h;
        if (this.f11294n) {
            i10 = q6.g.B(materialButton, R.attr.colorSurface);
        } else {
            i10 = 0;
        }
        gVar2.f6194a.f6184k = f11;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        f fVar2 = gVar2.f6194a;
        if (fVar2.f6177d != valueOf) {
            fVar2.f6177d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f11282b);
        this.f11293m = gVar3;
        a0.b.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(h6.a.a(this.f11292l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f11283c, this.f11285e, this.f11284d, this.f11286f), this.f11293m);
        this.f11298s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b10 = b(false);
        if (b10 != null) {
            b10.i(this.f11299t);
            b10.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i10 = 0;
        g b10 = b(false);
        g b11 = b(true);
        if (b10 != null) {
            float f10 = this.f11288h;
            ColorStateList colorStateList = this.f11291k;
            b10.f6194a.f6184k = f10;
            b10.invalidateSelf();
            f fVar = b10.f6194a;
            if (fVar.f6177d != colorStateList) {
                fVar.f6177d = colorStateList;
                b10.onStateChange(b10.getState());
            }
            if (b11 != null) {
                float f11 = this.f11288h;
                if (this.f11294n) {
                    i10 = q6.g.B(this.f11281a, R.attr.colorSurface);
                }
                b11.f6194a.f6184k = f11;
                b11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i10);
                f fVar2 = b11.f6194a;
                if (fVar2.f6177d != valueOf) {
                    fVar2.f6177d = valueOf;
                    b11.onStateChange(b11.getState());
                }
            }
        }
    }
}
