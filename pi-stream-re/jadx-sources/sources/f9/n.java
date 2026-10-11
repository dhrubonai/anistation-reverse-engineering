package f9;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n implements h7.a {

    /* renamed from: a, reason: collision with root package name */
    public final w f4061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f4062b;

    public n(t tVar, w wVar) {
        this.f4062b = tVar;
        this.f4061a = wVar;
    }

    @Override // h7.a
    public final Object a() {
        Throwable th;
        b bVar;
        t tVar = this.f4062b;
        w wVar = this.f4061a;
        b bVar2 = b.INTERNAL_ERROR;
        IOException e10 = null;
        try {
            wVar.f(this);
            do {
            } while (wVar.a(false, this));
            bVar = b.NO_ERROR;
            try {
                try {
                    tVar.a(bVar, b.CANCEL, null);
                } catch (IOException e11) {
                    e10 = e11;
                    b bVar3 = b.PROTOCOL_ERROR;
                    tVar.a(bVar3, bVar3, e10);
                    z8.b.c(wVar);
                    return w6.f.f11019a;
                }
            } catch (Throwable th2) {
                th = th2;
                tVar.a(bVar, bVar2, e10);
                z8.b.c(wVar);
                throw th;
            }
        } catch (IOException e12) {
            e10 = e12;
            bVar = bVar2;
        } catch (Throwable th3) {
            th = th3;
            bVar = bVar2;
            tVar.a(bVar, bVar2, e10);
            z8.b.c(wVar);
            throw th;
        }
        z8.b.c(wVar);
        return w6.f.f11019a;
    }
}
