package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e1 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f872c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f873d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f876g;

    public e1(g1 g1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f876g = g1Var;
        this.f870a = obj;
        this.f871b = arrayList;
        this.f874e = obj2;
        this.f875f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        g1 g1Var = this.f876g;
        Object obj = this.f870a;
        if (obj != null) {
            g1Var.t(obj, this.f871b, null);
        }
        Object obj2 = this.f872c;
        if (obj2 != null) {
            g1Var.t(obj2, this.f873d, null);
        }
        Object obj3 = this.f874e;
        if (obj3 != null) {
            g1Var.t(obj3, this.f875f, null);
        }
    }
}
