package h1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class d0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f4560a;

    /* renamed from: b, reason: collision with root package name */
    public long f4561b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f4562c;

    public d0(h hVar) {
        hVar.getClass();
        this.f4560a = hVar;
        this.f4562c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // h1.h
    public final void close() {
        this.f4560a.close();
    }

    @Override // h1.h
    public final Map e() {
        return this.f4560a.e();
    }

    @Override // h1.h
    public final void f(e0 e0Var) {
        e0Var.getClass();
        this.f4560a.f(e0Var);
    }

    @Override // h1.h
    public final Uri j() {
        return this.f4560a.j();
    }

    @Override // h1.h
    public final long m(l lVar) {
        this.f4562c = lVar.f4597a;
        Collections.emptyMap();
        long m5 = this.f4560a.m(lVar);
        Uri j4 = j();
        j4.getClass();
        this.f4562c = j4;
        e();
        return m5;
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        int p3 = this.f4560a.p(bArr, i10, i11);
        if (p3 != -1) {
            this.f4561b += p3;
        }
        return p3;
    }
}
