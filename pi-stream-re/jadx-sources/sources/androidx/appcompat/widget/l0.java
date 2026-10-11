package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class l0 extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f559a;

    public l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        v3.a(getContext(), this);
        m0 m0Var = new m0(this);
        this.f559a = m0Var;
        m0Var.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m0 m0Var = this.f559a;
        Drawable drawable = m0Var.f573e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = m0Var.f572d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f559a.f573e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f559a.d(canvas);
    }
}
