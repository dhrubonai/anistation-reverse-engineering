package androidx.activity;

import androidx.fragment.app.k0;
import androidx.lifecycle.u;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class p implements androidx.lifecycle.s, a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.p f278a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f279b;

    /* renamed from: c, reason: collision with root package name */
    public q f280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f281d;

    public p(r rVar, androidx.lifecycle.p pVar, k0 k0Var) {
        this.f281d = rVar;
        this.f278a = pVar;
        this.f279b = k0Var;
        pVar.a(this);
    }

    @Override // androidx.activity.a
    public final void cancel() {
        this.f278a.b(this);
        this.f279b.f920b.remove(this);
        q qVar = this.f280c;
        if (qVar != null) {
            qVar.cancel();
            this.f280c = null;
        }
    }

    @Override // androidx.lifecycle.s
    public final void onStateChanged(u uVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_START) {
            r rVar = this.f281d;
            ArrayDeque arrayDeque = rVar.f285b;
            k0 k0Var = this.f279b;
            arrayDeque.add(k0Var);
            q qVar = new q(rVar, k0Var);
            k0Var.f920b.add(qVar);
            if (com.bumptech.glide.d.G()) {
                rVar.b();
                k0Var.f921c = rVar.f286c;
            }
            this.f280c = qVar;
            return;
        }
        if (nVar == androidx.lifecycle.n.ON_STOP) {
            q qVar2 = this.f280c;
            if (qVar2 != null) {
                qVar2.cancel();
                return;
            }
            return;
        }
        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
            cancel();
        }
    }
}
