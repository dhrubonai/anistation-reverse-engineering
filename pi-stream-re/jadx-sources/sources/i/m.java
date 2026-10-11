package i;

import android.view.View;
import android.view.animation.Interpolator;
import g0.l1;
import g0.m1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f5242c;

    /* renamed from: d, reason: collision with root package name */
    public m1 f5243d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5244e;

    /* renamed from: b, reason: collision with root package name */
    public long f5241b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final l f5245f = new l(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5240a = new ArrayList();

    public final void a() {
        if (!this.f5244e) {
            return;
        }
        Iterator it = this.f5240a.iterator();
        while (it.hasNext()) {
            ((l1) it.next()).b();
        }
        this.f5244e = false;
    }

    public final void b() {
        View view;
        if (this.f5244e) {
            return;
        }
        Iterator it = this.f5240a.iterator();
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            long j4 = this.f5241b;
            if (j4 >= 0) {
                l1Var.c(j4);
            }
            Interpolator interpolator = this.f5242c;
            if (interpolator != null && (view = (View) l1Var.f4228a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f5243d != null) {
                l1Var.d(this.f5245f);
            }
            View view2 = (View) l1Var.f4228a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f5244e = true;
    }
}
