package r1;

import i1.k;
import j1.l;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: m, reason: collision with root package name */
    public final l f9304m;

    public b(l lVar) {
        super(new i1.h[1], new a[1]);
        this.f9304m = lVar;
    }

    @Override // i1.k
    public final i1.h f() {
        return new i1.h(1);
    }

    @Override // i1.k
    public final i1.i g() {
        return new a(this);
    }

    @Override // i1.k
    public final i1.f h(Throwable th) {
        return new d(th);
    }

    @Override // i1.k
    public final i1.f i(i1.h hVar, i1.i iVar, boolean z9) {
        boolean z10;
        a aVar = (a) iVar;
        try {
            ByteBuffer byteBuffer = hVar.f5262e;
            byteBuffer.getClass();
            w7.b.u(byteBuffer.hasArray());
            if (byteBuffer.arrayOffset() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w7.b.g(z10);
            l lVar = this.f9304m;
            byte[] array = byteBuffer.array();
            int remaining = byteBuffer.remaining();
            lVar.getClass();
            aVar.f9302d = l.f(array, remaining);
            aVar.f5267c = hVar.f5264x;
            return null;
        } catch (d e10) {
            return e10;
        }
    }
}
