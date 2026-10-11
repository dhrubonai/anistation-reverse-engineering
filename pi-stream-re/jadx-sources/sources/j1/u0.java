package j1;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a0 f5908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f5909c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1.s f5910d;

    public /* synthetic */ u0(androidx.appcompat.widget.a0 a0Var, Pair pair, v1.s sVar, int i10) {
        this.f5907a = i10;
        this.f5908b = a0Var;
        this.f5909c = pair;
        this.f5910d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5907a;
        v1.s sVar = this.f5910d;
        Pair pair = this.f5909c;
        androidx.appcompat.widget.a0 a0Var = this.f5908b;
        switch (i10) {
            case 0:
                k1.a aVar = ((a1) a0Var.f404c).f5626h;
                int intValue = ((Integer) pair.first).intValue();
                v1.w wVar = (v1.w) pair.second;
                wVar.getClass();
                ((k1.a0) aVar).i(intValue, wVar, sVar);
                return;
            default:
                ((k1.a0) ((a1) a0Var.f404c).f5626h).g(((Integer) pair.first).intValue(), (v1.w) pair.second, sVar);
                return;
        }
    }
}
