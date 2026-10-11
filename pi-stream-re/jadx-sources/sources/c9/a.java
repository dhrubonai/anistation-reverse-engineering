package c9;

import java.io.IOException;
import r6.h0;
import y8.d0;
import y8.r;
import y8.w;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2091a = new a();

    @Override // y8.r
    public final d0 a(d9.f fVar) {
        boolean z9;
        i iVar = fVar.f3256a;
        iVar.getClass();
        synchronized (iVar) {
            if (iVar.F) {
                if (!iVar.E) {
                    if (!(!iVar.D)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        f fVar2 = iVar.f2136z;
        h0.q(fVar2);
        w wVar = iVar.f2128a;
        h0.u(wVar, "client");
        try {
            int i10 = fVar.f3261f;
            int i11 = fVar.f3262g;
            int i12 = fVar.f3263h;
            int i13 = wVar.R;
            boolean z10 = wVar.f11835f;
            if (!h0.g((String) fVar.f3260e.f682c, "GET")) {
                z9 = true;
            } else {
                z9 = false;
            }
            e eVar = new e(iVar, iVar.f2132e, fVar2, fVar2.a(i10, i11, i12, i13, z10, z9).k(wVar, fVar));
            iVar.C = eVar;
            iVar.H = eVar;
            synchronized (iVar) {
                iVar.D = true;
                iVar.E = true;
            }
            if (!iVar.G) {
                return d9.f.a(fVar, 0, eVar, null, 61).b(fVar.f3260e);
            }
            throw new IOException("Canceled");
        } catch (m e10) {
            fVar2.c(e10.f2159b);
            throw e10;
        } catch (IOException e11) {
            fVar2.c(e11);
            throw new m(e11);
        }
    }
}
