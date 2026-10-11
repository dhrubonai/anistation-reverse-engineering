package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class m0 extends h0 {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f572d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f573e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f574f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f575g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f576h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f577i;

    public m0(SeekBar seekBar) {
        super(seekBar);
        this.f574f = null;
        this.f575g = null;
        this.f576h = false;
        this.f577i = false;
        this.f572d = seekBar;
    }

    @Override // androidx.appcompat.widget.h0
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f572d;
        Context context = seekBar.getContext();
        int[] iArr = e.a.f3276g;
        o3 m5 = o3.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        g0.y0.k(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) m5.f598b, R.attr.seekBarStyle);
        Drawable f10 = m5.f(0);
        if (f10 != null) {
            seekBar.setThumb(f10);
        }
        Drawable e10 = m5.e(1);
        Drawable drawable = this.f573e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f573e = e10;
        if (e10 != null) {
            e10.setCallback(seekBar);
            a0.c.b(e10, g0.i0.d(seekBar));
            if (e10.isStateful()) {
                e10.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m5.l(3)) {
            this.f575g = v1.b(m5.h(3, -1), this.f575g);
            this.f577i = true;
        }
        if (m5.l(2)) {
            this.f574f = m5.b(2);
            this.f576h = true;
        }
        m5.p();
        c();
    }

    public final void c() {
        Drawable drawable = this.f573e;
        if (drawable != null) {
            if (this.f576h || this.f577i) {
                Drawable mutate = drawable.mutate();
                this.f573e = mutate;
                if (this.f576h) {
                    a0.b.h(mutate, this.f574f);
                }
                if (this.f577i) {
                    a0.b.i(this.f573e, this.f575g);
                }
                if (this.f573e.isStateful()) {
                    this.f573e.setState(this.f572d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        int i10;
        if (this.f573e != null) {
            int max = this.f572d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f573e.getIntrinsicWidth();
                int intrinsicHeight = this.f573e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f573e.setBounds(-i10, -i11, i10, i11);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f573e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
