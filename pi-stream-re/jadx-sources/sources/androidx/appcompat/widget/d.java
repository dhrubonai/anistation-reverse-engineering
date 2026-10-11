package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f439b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f438a = i10;
        this.f439b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f438a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f439b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.B = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f438a;
        Object obj = this.f439b;
        switch (i10) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.B = false;
                return;
            case 1:
                ((q3.s) obj).n();
                animator.removeListener(this);
                return;
            case 2:
                r3.d dVar = (r3.d) obj;
                ArrayList arrayList = new ArrayList(dVar.f9335e);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ColorStateList colorStateList = ((z5.a) arrayList.get(i11)).f12059b.F;
                    if (colorStateList != null) {
                        a0.b.h(dVar, colorStateList);
                    }
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).f2642h = null;
                return;
            case 4:
            default:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
            case 5:
                a3.g.z(obj);
                throw null;
            case 6:
                m6.k kVar = (m6.k) obj;
                kVar.q();
                kVar.f7484r.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f438a;
        Object obj = this.f439b;
        switch (i10) {
            case 2:
                r3.d dVar = (r3.d) obj;
                ArrayList arrayList = new ArrayList(dVar.f9335e);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    z5.c cVar = ((z5.a) arrayList.get(i11)).f12059b;
                    ColorStateList colorStateList = cVar.F;
                    if (colorStateList != null) {
                        a0.b.g(dVar, colorStateList.getColorForState(cVar.J, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case 5:
                a3.g.z(obj);
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
