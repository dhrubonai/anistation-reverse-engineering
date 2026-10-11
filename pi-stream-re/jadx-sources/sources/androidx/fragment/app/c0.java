package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Animation f851a;

    /* renamed from: b, reason: collision with root package name */
    public final Animator f852b;

    public c0(Animation animation) {
        this.f851a = animation;
        this.f852b = null;
    }

    public c0(Animator animator) {
        this.f851a = null;
        this.f852b = animator;
    }
}
