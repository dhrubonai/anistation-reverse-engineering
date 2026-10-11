package z1;

import android.net.Uri;
import f1.b0;
import h1.d0;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final long f11945a;

    /* renamed from: b, reason: collision with root package name */
    public final h1.l f11946b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11947c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f11948d;

    /* renamed from: e, reason: collision with root package name */
    public final q f11949e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f11950f;

    public r(h1.h hVar, Uri uri, int i10, q qVar) {
        Map emptyMap = Collections.emptyMap();
        w7.b.x(uri, "The uri must be set.");
        h1.l lVar = new h1.l(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.f11948d = new d0(hVar);
        this.f11946b = lVar;
        this.f11947c = i10;
        this.f11949e = qVar;
        this.f11945a = v1.n.f10478b.getAndIncrement();
    }

    @Override // z1.l
    public final void c() {
        this.f11948d.f4561b = 0L;
        h1.j jVar = new h1.j(this.f11948d, this.f11946b);
        try {
            jVar.a();
            Uri j4 = this.f11948d.j();
            j4.getClass();
            this.f11950f = this.f11949e.h(j4, jVar);
            try {
                jVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i10 = b0.f3799a;
            try {
                jVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // z1.l
    public final void m() {
    }
}
