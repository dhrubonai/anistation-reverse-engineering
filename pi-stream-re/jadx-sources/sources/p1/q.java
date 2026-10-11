package p1;

import f.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8490b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f8489a = i10;
        this.f8490b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8489a;
        Object obj = this.f8490b;
        switch (i10) {
            case 0:
                ((t) obj).D();
                return;
            case 1:
                t tVar = (t) obj;
                tVar.T = true;
                tVar.D();
                return;
            default:
                ((p0) obj).G();
                return;
        }
    }
}
