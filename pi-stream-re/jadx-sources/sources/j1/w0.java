package j1;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a0 f5920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f5921c;

    public /* synthetic */ w0(androidx.appcompat.widget.a0 a0Var, Pair pair, int i10) {
        this.f5919a = i10;
        this.f5920b = a0Var;
        this.f5921c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5919a;
        Pair pair = this.f5921c;
        androidx.appcompat.widget.a0 a0Var = this.f5920b;
        switch (i10) {
            case 0:
                ((k1.a0) ((a1) a0Var.f404c).f5626h).l(((Integer) pair.first).intValue(), (v1.w) pair.second);
                return;
            case 1:
                ((k1.a0) ((a1) a0Var.f404c).f5626h).L(((Integer) pair.first).intValue(), (v1.w) pair.second);
                return;
            case 2:
                ((k1.a0) ((a1) a0Var.f404c).f5626h).w(((Integer) pair.first).intValue(), (v1.w) pair.second);
                return;
            default:
                ((k1.a0) ((a1) a0Var.f404c).f5626h).O(((Integer) pair.first).intValue(), (v1.w) pair.second);
                return;
        }
    }
}
