package e9;

import java.io.IOException;
import k9.k;
import k9.w;
import k9.y;
import r6.h0;

/* loaded from: classes.dex */
public abstract class b implements w {

    /* renamed from: a, reason: collision with root package name */
    public final k f3599a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3601c;

    public b(h hVar) {
        this.f3601c = hVar;
        this.f3599a = new k(hVar.f3617c.c());
    }

    public final void a() {
        h hVar = this.f3601c;
        int i10 = hVar.f3619e;
        if (i10 == 6) {
            return;
        }
        if (i10 == 5) {
            k kVar = this.f3599a;
            y yVar = kVar.f6526e;
            kVar.f6526e = y.f6558d;
            yVar.a();
            yVar.b();
            hVar.f3619e = 6;
            return;
        }
        throw new IllegalStateException("state: " + hVar.f3619e);
    }

    @Override // k9.w
    public final y c() {
        return this.f3599a;
    }

    @Override // k9.w
    public long z(k9.g gVar, long j4) {
        h hVar = this.f3601c;
        h0.u(gVar, "sink");
        try {
            return hVar.f3617c.z(gVar, j4);
        } catch (IOException e10) {
            hVar.f3616b.l();
            a();
            throw e10;
        }
    }
}
