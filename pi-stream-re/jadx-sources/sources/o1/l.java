package o1;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f8158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f8159c;

    public /* synthetic */ l(n nVar, o oVar, int i10) {
        this.f8157a = i10;
        this.f8158b = nVar;
        this.f8159c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8157a;
        o oVar = this.f8159c;
        n nVar = this.f8158b;
        switch (i10) {
            case 0:
                oVar.l(nVar.f8162a, nVar.f8163b);
                return;
            case 1:
                oVar.w(nVar.f8162a, nVar.f8163b);
                return;
            case 2:
                oVar.L(nVar.f8162a, nVar.f8163b);
                return;
            default:
                oVar.O(nVar.f8162a, nVar.f8163b);
                return;
        }
    }
}
