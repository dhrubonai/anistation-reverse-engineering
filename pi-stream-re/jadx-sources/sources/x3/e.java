package x3;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements h, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f11162a;

    /* renamed from: b, reason: collision with root package name */
    public final i f11163b;

    /* renamed from: c, reason: collision with root package name */
    public final g f11164c;

    /* renamed from: d, reason: collision with root package name */
    public int f11165d = -1;

    /* renamed from: e, reason: collision with root package name */
    public v3.i f11166e;

    /* renamed from: f, reason: collision with root package name */
    public List f11167f;

    /* renamed from: x, reason: collision with root package name */
    public int f11168x;

    /* renamed from: y, reason: collision with root package name */
    public volatile b4.w f11169y;

    /* renamed from: z, reason: collision with root package name */
    public File f11170z;

    public e(List list, i iVar, g gVar) {
        this.f11162a = list;
        this.f11163b = iVar;
        this.f11164c = gVar;
    }

    @Override // x3.h
    public final boolean c() {
        boolean z9;
        boolean z10;
        boolean z11;
        while (true) {
            List list = this.f11167f;
            if (list != null) {
                if (this.f11168x < list.size()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    this.f11169y = null;
                    boolean z12 = false;
                    while (!z12) {
                        if (this.f11168x < this.f11167f.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            break;
                        }
                        List list2 = this.f11167f;
                        int i10 = this.f11168x;
                        this.f11168x = i10 + 1;
                        b4.x xVar = (b4.x) list2.get(i10);
                        File file = this.f11170z;
                        i iVar = this.f11163b;
                        this.f11169y = xVar.a(file, iVar.f11196e, iVar.f11197f, iVar.f11200i);
                        if (this.f11169y != null) {
                            if (this.f11163b.c(this.f11169y.f1503c.a()) != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.f11169y.f1503c.e(this.f11163b.o, this);
                                z12 = true;
                            }
                        }
                    }
                    return z12;
                }
            }
            int i11 = this.f11165d + 1;
            this.f11165d = i11;
            if (i11 >= this.f11162a.size()) {
                return false;
            }
            v3.i iVar2 = (v3.i) this.f11162a.get(this.f11165d);
            i iVar3 = this.f11163b;
            File n9 = iVar3.f11199h.a().n(new f(iVar2, iVar3.f11205n));
            this.f11170z = n9;
            if (n9 != null) {
                this.f11166e = iVar2;
                this.f11167f = this.f11163b.f11194c.b().g(n9);
                this.f11168x = 0;
            }
        }
    }

    @Override // x3.h
    public final void cancel() {
        b4.w wVar = this.f11169y;
        if (wVar != null) {
            wVar.f1503c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void n(Exception exc) {
        this.f11164c.d(this.f11166e, exc, this.f11169y.f1503c, v3.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void s(Object obj) {
        this.f11164c.b(this.f11166e, obj, this.f11169y.f1503c, v3.a.DATA_DISK_CACHE, this.f11166e);
    }
}
