package h1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4609a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4610b;

    /* renamed from: c, reason: collision with root package name */
    public final h f4611c;

    /* renamed from: d, reason: collision with root package name */
    public u f4612d;

    /* renamed from: e, reason: collision with root package name */
    public b f4613e;

    /* renamed from: f, reason: collision with root package name */
    public e f4614f;

    /* renamed from: g, reason: collision with root package name */
    public h f4615g;

    /* renamed from: h, reason: collision with root package name */
    public g0 f4616h;

    /* renamed from: i, reason: collision with root package name */
    public f f4617i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f4618j;

    /* renamed from: k, reason: collision with root package name */
    public h f4619k;

    public n(Context context, h hVar) {
        this.f4609a = context.getApplicationContext();
        hVar.getClass();
        this.f4611c = hVar;
        this.f4610b = new ArrayList();
    }

    public static void s(h hVar, e0 e0Var) {
        if (hVar != null) {
            hVar.f(e0Var);
        }
    }

    @Override // h1.h
    public final void close() {
        h hVar = this.f4619k;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f4619k = null;
            }
        }
    }

    @Override // h1.h
    public final Map e() {
        h hVar = this.f4619k;
        if (hVar == null) {
            return Collections.emptyMap();
        }
        return hVar.e();
    }

    @Override // h1.h
    public final void f(e0 e0Var) {
        e0Var.getClass();
        this.f4611c.f(e0Var);
        this.f4610b.add(e0Var);
        s(this.f4612d, e0Var);
        s(this.f4613e, e0Var);
        s(this.f4614f, e0Var);
        s(this.f4615g, e0Var);
        s(this.f4616h, e0Var);
        s(this.f4617i, e0Var);
        s(this.f4618j, e0Var);
    }

    @Override // h1.h
    public final Uri j() {
        h hVar = this.f4619k;
        if (hVar == null) {
            return null;
        }
        return hVar.j();
    }

    @Override // h1.h
    public final long m(l lVar) {
        boolean z9;
        boolean z10 = true;
        if (this.f4619k == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        String scheme = lVar.f4597a.getScheme();
        int i10 = f1.b0.f3799a;
        Uri uri = lVar.f4597a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z10 = false;
        }
        Context context = this.f4609a;
        if (z10) {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f4613e == null) {
                    b bVar = new b(context);
                    this.f4613e = bVar;
                    r(bVar);
                }
                this.f4619k = this.f4613e;
            } else {
                if (this.f4612d == null) {
                    u uVar = new u();
                    this.f4612d = uVar;
                    r(uVar);
                }
                this.f4619k = this.f4612d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f4613e == null) {
                b bVar2 = new b(context);
                this.f4613e = bVar2;
                r(bVar2);
            }
            this.f4619k = this.f4613e;
        } else if ("content".equals(scheme)) {
            if (this.f4614f == null) {
                e eVar = new e(context);
                this.f4614f = eVar;
                r(eVar);
            }
            this.f4619k = this.f4614f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            h hVar = this.f4611c;
            if (equals) {
                if (this.f4615g == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f4615g = hVar2;
                        r(hVar2);
                    } catch (ClassNotFoundException unused) {
                        f1.o.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f4615g == null) {
                        this.f4615g = hVar;
                    }
                }
                this.f4619k = this.f4615g;
            } else if ("udp".equals(scheme)) {
                if (this.f4616h == null) {
                    g0 g0Var = new g0();
                    this.f4616h = g0Var;
                    r(g0Var);
                }
                this.f4619k = this.f4616h;
            } else if ("data".equals(scheme)) {
                if (this.f4617i == null) {
                    f fVar = new f();
                    this.f4617i = fVar;
                    r(fVar);
                }
                this.f4619k = this.f4617i;
            } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                this.f4619k = hVar;
            } else {
                if (this.f4618j == null) {
                    c0 c0Var = new c0(context);
                    this.f4618j = c0Var;
                    r(c0Var);
                }
                this.f4619k = this.f4618j;
            }
        }
        return this.f4619k.m(lVar);
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        h hVar = this.f4619k;
        hVar.getClass();
        return hVar.p(bArr, i10, i11);
    }

    public final void r(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f4610b;
            if (i10 < arrayList.size()) {
                hVar.f((e0) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }
}
