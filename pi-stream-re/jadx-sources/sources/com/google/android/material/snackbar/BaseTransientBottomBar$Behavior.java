package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import i.g;
import k3.d;
import l6.b;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i, reason: collision with root package name */
    public final d f2795i = new d(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, u.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar = this.f2795i;
        dVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (g.f5194f == null) {
                    g.f5194f = new g(9);
                }
                g gVar = g.f5194f;
                a3.g.z(dVar.f6453b);
                synchronized (gVar.f5196b) {
                    a3.g.z(gVar.f5198d);
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (g.f5194f == null) {
                g.f5194f = new g(9);
            }
            g gVar2 = g.f5194f;
            a3.g.z(dVar.f6453b);
            gVar2.K();
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f2795i.getClass();
        return view instanceof b;
    }
}
