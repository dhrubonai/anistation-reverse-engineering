package x1;

import i1.h;
import i1.k;
import java.nio.ByteBuffer;
import y2.i;
import y2.j;
import y2.l;

/* loaded from: classes.dex */
public final class b extends k implements y2.e {

    /* renamed from: m, reason: collision with root package name */
    public final l f11078m;

    public b(l lVar) {
        super(new i[2], new j[2]);
        boolean z9;
        int i10 = this.f5276g;
        h[] hVarArr = this.f5274e;
        if (i10 == hVarArr.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        for (h hVar : hVarArr) {
            hVar.j(1024);
        }
        this.f11078m = lVar;
    }

    @Override // y2.e
    public final /* bridge */ /* synthetic */ void c(long j4) {
    }

    @Override // i1.k
    public final h f() {
        return new i();
    }

    @Override // i1.k
    public final i1.i g() {
        return new y2.c(this);
    }

    @Override // i1.k
    public final i1.f h(Throwable th) {
        return new y2.f(th);
    }

    @Override // i1.k
    public final i1.f i(h hVar, i1.i iVar, boolean z9) {
        i iVar2 = (i) hVar;
        j jVar = (j) iVar;
        try {
            ByteBuffer byteBuffer = iVar2.f5262e;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            l lVar = this.f11078m;
            if (z9) {
                lVar.f();
            }
            jVar.j(iVar2.f5264x, lVar.r(array, 0, limit), iVar2.B);
            jVar.f5247b &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            return null;
        } catch (y2.f e10) {
            return e10;
        }
    }
}
