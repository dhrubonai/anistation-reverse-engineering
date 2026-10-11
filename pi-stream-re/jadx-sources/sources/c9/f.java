package c9;

import androidx.lifecycle.q0;
import java.io.IOException;
import r6.h0;
import y8.g0;
import y8.q;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final l f2116a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.a f2117b;

    /* renamed from: c, reason: collision with root package name */
    public final i f2118c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f2119d;

    /* renamed from: e, reason: collision with root package name */
    public d0.h f2120e;

    /* renamed from: f, reason: collision with root package name */
    public n f2121f;

    /* renamed from: g, reason: collision with root package name */
    public int f2122g;

    /* renamed from: h, reason: collision with root package name */
    public int f2123h;

    /* renamed from: i, reason: collision with root package name */
    public int f2124i;

    /* renamed from: j, reason: collision with root package name */
    public g0 f2125j;

    public f(l lVar, y8.a aVar, i iVar, q0 q0Var) {
        h0.u(lVar, "connectionPool");
        h0.u(q0Var, "eventListener");
        this.f2116a = lVar;
        this.f2117b = aVar;
        this.f2118c = iVar;
        this.f2119d = q0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c9.k a(int r15, int r16, int r17, int r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.f.a(int, int, int, int, boolean, boolean):c9.k");
    }

    public final boolean b(q qVar) {
        h0.u(qVar, "url");
        q qVar2 = this.f2117b.f11655i;
        if (qVar.f11784e == qVar2.f11784e && h0.g(qVar.f11783d, qVar2.f11783d)) {
            return true;
        }
        return false;
    }

    public final void c(IOException iOException) {
        h0.u(iOException, "e");
        this.f2125j = null;
        if (iOException instanceof f9.g0) {
            if (((f9.g0) iOException).f4041a == f9.b.REFUSED_STREAM) {
                this.f2122g++;
                return;
            }
        }
        if (iOException instanceof f9.a) {
            this.f2123h++;
        } else {
            this.f2124i++;
        }
    }
}
