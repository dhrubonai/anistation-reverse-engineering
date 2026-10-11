package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class d0 extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f860a;

    /* renamed from: b, reason: collision with root package name */
    public final View f861b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f862c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f863d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f864e;

    public d0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f864e = true;
        this.f860a = viewGroup;
        this.f861b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation) {
        this.f864e = true;
        if (this.f862c) {
            return !this.f863d;
        }
        if (!super.getTransformation(j4, transformation)) {
            this.f862c = true;
            g0.b0.a(this.f860a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9 = this.f862c;
        ViewGroup viewGroup = this.f860a;
        if (!z9 && this.f864e) {
            this.f864e = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f861b);
            this.f863d = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation, float f10) {
        this.f864e = true;
        if (this.f862c) {
            return !this.f863d;
        }
        if (!super.getTransformation(j4, transformation, f10)) {
            this.f862c = true;
            g0.b0.a(this.f860a, this);
        }
        return true;
    }
}
