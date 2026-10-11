package androidx.activity;

import androidx.fragment.app.k0;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class q implements a {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f283b;

    public q(r rVar, k0 k0Var) {
        this.f283b = rVar;
        this.f282a = k0Var;
    }

    @Override // androidx.activity.a
    public final void cancel() {
        r rVar = this.f283b;
        ArrayDeque arrayDeque = rVar.f285b;
        k0 k0Var = this.f282a;
        arrayDeque.remove(k0Var);
        k0Var.f920b.remove(this);
        if (com.bumptech.glide.d.G()) {
            k0Var.f921c = null;
            rVar.b();
        }
    }
}
