package g4;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import v3.p;
import x3.e0;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: b, reason: collision with root package name */
    public final p f4409b;

    public d(p pVar) {
        w7.b.q(pVar);
        this.f4409b = pVar;
    }

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        this.f4409b.a(messageDigest);
    }

    @Override // v3.p
    public final e0 b(com.bumptech.glide.f fVar, e0 e0Var, int i10, int i11) {
        c cVar = (c) e0Var.get();
        e0 dVar = new e4.d(cVar.f4400a.f4399a.f4427l, com.bumptech.glide.b.a(fVar).f2170a);
        p pVar = this.f4409b;
        e0 b10 = pVar.b(fVar, dVar, i10, i11);
        if (!dVar.equals(b10)) {
            dVar.e();
        }
        cVar.f4400a.f4399a.c(pVar, (Bitmap) b10.get());
        return e0Var;
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f4409b.equals(((d) obj).f4409b);
        }
        return false;
    }

    @Override // v3.i
    public final int hashCode() {
        return this.f4409b.hashCode();
    }
}
