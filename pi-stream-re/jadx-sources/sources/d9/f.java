package d9;

import androidx.appcompat.widget.w;
import c9.i;
import java.util.List;
import r6.h0;
import y8.d0;
import y8.q;
import y8.r;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i f3256a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3257b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3258c;

    /* renamed from: d, reason: collision with root package name */
    public final c9.e f3259d;

    /* renamed from: e, reason: collision with root package name */
    public final w f3260e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3261f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3262g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3263h;

    /* renamed from: i, reason: collision with root package name */
    public int f3264i;

    public f(i iVar, List list, int i10, c9.e eVar, w wVar, int i11, int i12, int i13) {
        h0.u(iVar, "call");
        h0.u(list, "interceptors");
        h0.u(wVar, "request");
        this.f3256a = iVar;
        this.f3257b = list;
        this.f3258c = i10;
        this.f3259d = eVar;
        this.f3260e = wVar;
        this.f3261f = i11;
        this.f3262g = i12;
        this.f3263h = i13;
    }

    public static f a(f fVar, int i10, c9.e eVar, w wVar, int i11) {
        int i12;
        int i13;
        int i14;
        if ((i11 & 1) != 0) {
            i10 = fVar.f3258c;
        }
        int i15 = i10;
        if ((i11 & 2) != 0) {
            eVar = fVar.f3259d;
        }
        c9.e eVar2 = eVar;
        if ((i11 & 4) != 0) {
            wVar = fVar.f3260e;
        }
        w wVar2 = wVar;
        if ((i11 & 8) != 0) {
            i12 = fVar.f3261f;
        } else {
            i12 = 0;
        }
        if ((i11 & 16) != 0) {
            i13 = fVar.f3262g;
        } else {
            i13 = 0;
        }
        if ((i11 & 32) != 0) {
            i14 = fVar.f3263h;
        } else {
            i14 = 0;
        }
        fVar.getClass();
        h0.u(wVar2, "request");
        return new f(fVar.f3256a, fVar.f3257b, i15, eVar2, wVar2, i12, i13, i14);
    }

    public final d0 b(w wVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        h0.u(wVar, "request");
        List list = this.f3257b;
        int size = list.size();
        boolean z12 = false;
        int i10 = this.f3258c;
        if (i10 < size) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f3264i++;
            c9.e eVar = this.f3259d;
            if (eVar != null) {
                if (eVar.f2111c.b((q) wVar.f681b)) {
                    if (this.f3264i == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must retain the same host and port").toString());
                }
            }
            int i11 = i10 + 1;
            f a10 = a(this, i11, null, wVar, 58);
            r rVar = (r) list.get(i10);
            d0 a11 = rVar.a(a10);
            if (a11 != null) {
                if (eVar != null) {
                    if (i11 < list.size() && a10.f3264i != 1) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        throw new IllegalStateException(("network interceptor " + rVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a11.f11697x != null) {
                    z12 = true;
                }
                if (z12) {
                    return a11;
                }
                throw new IllegalStateException(("interceptor " + rVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + rVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
