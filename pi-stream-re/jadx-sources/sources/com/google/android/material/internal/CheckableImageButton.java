package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.c0;
import g0.y0;
import u5.a;

/* loaded from: classes.dex */
public class CheckableImageButton extends c0 implements Checkable {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2770x = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f2771d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2772e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2773f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, msr.pistream.app.R.attr.imageButtonStyle);
        this.f2772e = true;
        this.f2773f = true;
        y0.l(this, new a(this, 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2771d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f2771d) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f2770x);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e6.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e6.a aVar = (e6.a) parcelable;
        super.onRestoreInstanceState(aVar.f7897a);
        setChecked(aVar.f3541c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e6.a aVar = new e6.a(super.onSaveInstanceState());
        aVar.f3541c = this.f2771d;
        return aVar;
    }

    public void setCheckable(boolean z9) {
        if (this.f2772e != z9) {
            this.f2772e = z9;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        if (this.f2772e && this.f2771d != z9) {
            this.f2771d = z9;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z9) {
        this.f2773f = z9;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        if (this.f2773f) {
            super.setPressed(z9);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2771d);
    }
}
