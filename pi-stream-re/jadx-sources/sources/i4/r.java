package i4;

import o1.d0;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5366c;

    public /* synthetic */ r(int i10, Object obj, boolean z9) {
        this.f5364a = i10;
        this.f5366c = obj;
        this.f5365b = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5364a;
        boolean z9 = this.f5365b;
        Object obj = this.f5366c;
        switch (i10) {
            case 0:
                s sVar = (s) obj;
                sVar.getClass();
                p4.m.a();
                d0 d0Var = (d0) sVar.f5368b;
                boolean z10 = d0Var.f8137a;
                d0Var.f8137a = z9;
                if (z10 != z9) {
                    ((a) d0Var.f8138b).a(z9);
                    return;
                }
                return;
            default:
                ((u) obj).f5373b.a(z9);
                return;
        }
    }
}
