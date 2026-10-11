package e4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;
import r6.h0;

/* loaded from: classes.dex */
public final class a implements v3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3465a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3466b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3467c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f3465a = i10;
        this.f3466b = obj;
        this.f3467c = obj2;
    }

    @Override // v3.n
    public final x3.e0 a(Object obj, int i10, int i11, v3.l lVar) {
        boolean z9;
        v vVar;
        p4.e eVar;
        switch (this.f3465a) {
            case 0:
                x3.e0 a10 = ((v3.n) this.f3466b).a(obj, i10, i11, lVar);
                Resources resources = (Resources) this.f3467c;
                if (a10 == null) {
                    return null;
                }
                return new d(resources, a10);
            case 1:
                x3.e0 c6 = ((f4.f) this.f3466b).c((Uri) obj, lVar);
                if (c6 == null) {
                    return null;
                }
                return h0.C((y3.d) this.f3467c, (Drawable) ((f4.c) c6).get(), i10, i11);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof v) {
                    vVar = (v) inputStream;
                    z9 = false;
                } else {
                    z9 = true;
                    vVar = new v(inputStream, (y3.h) this.f3467c);
                }
                ArrayDeque arrayDeque = p4.e.f8560c;
                synchronized (arrayDeque) {
                    eVar = (p4.e) arrayDeque.poll();
                }
                if (eVar == null) {
                    eVar = new p4.e();
                }
                eVar.f8561a = vVar;
                p4.j jVar = new p4.j(eVar);
                z3.e eVar2 = new z3.e(4, vVar, eVar);
                try {
                    p pVar = (p) this.f3466b;
                    return pVar.a(new f.c(pVar.f3512c, jVar, pVar.f3513d), i10, i11, lVar, eVar2);
                } finally {
                    eVar.a();
                    if (z9) {
                        vVar.f();
                    }
                }
        }
    }

    @Override // v3.n
    public final boolean b(Object obj, v3.l lVar) {
        int i10 = this.f3465a;
        Object obj2 = this.f3466b;
        switch (i10) {
            case 0:
                return ((v3.n) obj2).b(obj, lVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((p) obj2).getClass();
                return true;
        }
    }

    public a(Resources resources, v3.n nVar) {
        this.f3465a = 0;
        this.f3467c = resources;
        this.f3466b = nVar;
    }
}
