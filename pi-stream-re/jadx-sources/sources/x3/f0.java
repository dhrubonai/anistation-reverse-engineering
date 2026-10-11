package x3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements h, com.bumptech.glide.load.data.d {
    public g0 A;

    /* renamed from: a, reason: collision with root package name */
    public final g f11173a;

    /* renamed from: b, reason: collision with root package name */
    public final i f11174b;

    /* renamed from: c, reason: collision with root package name */
    public int f11175c;

    /* renamed from: d, reason: collision with root package name */
    public int f11176d = -1;

    /* renamed from: e, reason: collision with root package name */
    public v3.i f11177e;

    /* renamed from: f, reason: collision with root package name */
    public List f11178f;

    /* renamed from: x, reason: collision with root package name */
    public int f11179x;

    /* renamed from: y, reason: collision with root package name */
    public volatile b4.w f11180y;

    /* renamed from: z, reason: collision with root package name */
    public File f11181z;

    public f0(i iVar, g gVar) {
        this.f11174b = iVar;
        this.f11173a = gVar;
    }

    @Override // x3.h
    public final boolean c() {
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList a10 = this.f11174b.a();
        if (a10.isEmpty()) {
            return false;
        }
        List d10 = this.f11174b.d();
        if (d10.isEmpty()) {
            if (File.class.equals(this.f11174b.f11202k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f11174b.f11195d.getClass() + " to " + this.f11174b.f11202k);
        }
        while (true) {
            List list = this.f11178f;
            if (list != null) {
                if (this.f11179x < list.size()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    this.f11180y = null;
                    boolean z12 = false;
                    while (!z12) {
                        if (this.f11179x < this.f11178f.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            break;
                        }
                        List list2 = this.f11178f;
                        int i10 = this.f11179x;
                        this.f11179x = i10 + 1;
                        b4.x xVar = (b4.x) list2.get(i10);
                        File file = this.f11181z;
                        i iVar = this.f11174b;
                        this.f11180y = xVar.a(file, iVar.f11196e, iVar.f11197f, iVar.f11200i);
                        if (this.f11180y != null) {
                            if (this.f11174b.c(this.f11180y.f1503c.a()) != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.f11180y.f1503c.e(this.f11174b.o, this);
                                z12 = true;
                            }
                        }
                    }
                    return z12;
                }
            }
            int i11 = this.f11176d + 1;
            this.f11176d = i11;
            if (i11 >= d10.size()) {
                int i12 = this.f11175c + 1;
                this.f11175c = i12;
                if (i12 >= a10.size()) {
                    return false;
                }
                this.f11176d = 0;
            }
            v3.i iVar2 = (v3.i) a10.get(this.f11175c);
            Class cls = (Class) d10.get(this.f11176d);
            v3.p f10 = this.f11174b.f(cls);
            i iVar3 = this.f11174b;
            this.A = new g0(iVar3.f11194c.f2215a, iVar2, iVar3.f11205n, iVar3.f11196e, iVar3.f11197f, f10, cls, iVar3.f11200i);
            File n9 = iVar3.f11199h.a().n(this.A);
            this.f11181z = n9;
            if (n9 != null) {
                this.f11177e = iVar2;
                this.f11178f = this.f11174b.f11194c.b().g(n9);
                this.f11179x = 0;
            }
        }
    }

    @Override // x3.h
    public final void cancel() {
        b4.w wVar = this.f11180y;
        if (wVar != null) {
            wVar.f1503c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void n(Exception exc) {
        this.f11173a.d(this.A, exc, this.f11180y.f1503c, v3.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void s(Object obj) {
        this.f11173a.b(this.f11177e, obj, this.f11180y.f1503c, v3.a.RESOURCE_DISK_CACHE, this.A);
    }
}
