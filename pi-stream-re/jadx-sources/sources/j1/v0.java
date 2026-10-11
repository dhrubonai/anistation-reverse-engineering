package j1;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a0 f5913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f5914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1.n f5915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v1.s f5916e;

    public /* synthetic */ v0(androidx.appcompat.widget.a0 a0Var, Pair pair, v1.n nVar, v1.s sVar, int i10) {
        this.f5912a = i10;
        this.f5913b = a0Var;
        this.f5914c = pair;
        this.f5915d = nVar;
        this.f5916e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5912a;
        v1.s sVar = this.f5916e;
        v1.n nVar = this.f5915d;
        Pair pair = this.f5914c;
        androidx.appcompat.widget.a0 a0Var = this.f5913b;
        switch (i10) {
            case 0:
                ((k1.a0) ((a1) a0Var.f404c).f5626h).F(((Integer) pair.first).intValue(), (v1.w) pair.second, nVar, sVar);
                return;
            case 1:
                ((k1.a0) ((a1) a0Var.f404c).f5626h).q(((Integer) pair.first).intValue(), (v1.w) pair.second, nVar, sVar);
                return;
            default:
                ((k1.a0) ((a1) a0Var.f404c).f5626h).B(((Integer) pair.first).intValue(), (v1.w) pair.second, nVar, sVar);
                return;
        }
    }
}
