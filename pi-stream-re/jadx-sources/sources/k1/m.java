package k1;

import c1.e1;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements f1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f6389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1.s f6390c;

    public /* synthetic */ m(b bVar, v1.s sVar, int i10) {
        this.f6388a = i10;
        this.f6389b = bVar;
        this.f6390c = sVar;
    }

    @Override // f1.l
    public final void invoke(Object obj) {
        String str;
        switch (this.f6388a) {
            case 0:
                ((c) obj).getClass();
                return;
            default:
                f0 f0Var = (f0) ((c) obj);
                f0Var.getClass();
                b bVar = this.f6389b;
                if (bVar.f6325d != null) {
                    v1.s sVar = this.f6390c;
                    c1.v vVar = sVar.f10527c;
                    vVar.getClass();
                    c0 c0Var = f0Var.f6355b;
                    v1.w wVar = bVar.f6325d;
                    wVar.getClass();
                    e1 e1Var = bVar.f6323b;
                    synchronized (c0Var) {
                        str = c0Var.c(e1Var.h(wVar.f10559a, c0Var.f6342b).f1643c, wVar).f6332a;
                    }
                    y.c cVar = new y.c(vVar, sVar.f10528d, str);
                    int i10 = sVar.f10526b;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    f0Var.f6369q = cVar;
                                    return;
                                }
                                return;
                            }
                        } else {
                            f0Var.f6368p = cVar;
                            return;
                        }
                    }
                    f0Var.o = cVar;
                    return;
                }
                return;
        }
    }
}
