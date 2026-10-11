package x3;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11228a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11229b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.a f11230c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.c f11231d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11232e;

    public m(Class cls, Class cls2, Class cls3, List list, h4.a aVar, f.c cVar) {
        this.f11228a = cls;
        this.f11229b = list;
        this.f11230c = aVar;
        this.f11231d = cVar;
        this.f11232e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final e0 a(int i10, int i11, androidx.appcompat.widget.a0 a0Var, v3.l lVar, com.bumptech.glide.load.data.g gVar) {
        e0 e0Var;
        v3.p pVar;
        boolean z9;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        Object fVar;
        f0.c cVar = this.f11231d;
        Object j4 = cVar.j();
        w7.b.q(j4);
        List list = (List) j4;
        try {
            e0 b10 = b(gVar, i10, i11, lVar, list);
            cVar.b(list);
            l lVar2 = (l) a0Var.f404c;
            v3.a aVar = (v3.a) a0Var.f403b;
            lVar2.getClass();
            Class<?> cls = b10.get().getClass();
            v3.a aVar2 = v3.a.RESOURCE_DISK_CACHE;
            i iVar = lVar2.f11219a;
            v3.o oVar = null;
            if (aVar != aVar2) {
                v3.p f10 = iVar.f(cls);
                e0Var = f10.b(lVar2.f11226y, b10, lVar2.C, lVar2.D);
                pVar = f10;
            } else {
                e0Var = b10;
                pVar = null;
            }
            if (!b10.equals(e0Var)) {
                b10.e();
            }
            if (iVar.f11194c.b().f2233d.d(e0Var.d()) != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                com.bumptech.glide.j b11 = iVar.f11194c.b();
                b11.getClass();
                oVar = b11.f2233d.d(e0Var.d());
                if (oVar != null) {
                    i12 = oVar.q(lVar2.F);
                } else {
                    throw new com.bumptech.glide.i(2, e0Var.d());
                }
            } else {
                i12 = 3;
            }
            v3.i iVar2 = lVar2.M;
            ArrayList b12 = iVar.b();
            int size = b12.size();
            int i13 = 0;
            while (true) {
                if (i13 < size) {
                    if (((b4.w) b12.get(i13)).f1501a.equals(iVar2)) {
                        z10 = true;
                        break;
                    }
                    i13++;
                } else {
                    z10 = false;
                    break;
                }
            }
            boolean z13 = !z10;
            switch (((n) lVar2.E).f11233d) {
                default:
                    if (((z13 && aVar == v3.a.DATA_DISK_CACHE) || aVar == v3.a.LOCAL) && i12 == 2) {
                        z11 = true;
                        break;
                    }
                    break;
                case 1:
                case 2:
                    z11 = false;
                    break;
            }
            if (z11) {
                if (oVar != null) {
                    int b13 = p.j.b(i12);
                    if (b13 != 0) {
                        if (b13 == 1) {
                            z12 = false;
                            fVar = new g0(iVar.f11194c.f2215a, lVar2.M, lVar2.f11227z, lVar2.C, lVar2.D, pVar, cls, lVar2.F);
                        } else {
                            throw new IllegalArgumentException("Unknown strategy: ".concat(r.f.n(i12)));
                        }
                    } else {
                        z12 = false;
                        fVar = new f(lVar2.M, lVar2.f11227z);
                    }
                    d0 d0Var = (d0) d0.f11157e.j();
                    w7.b.q(d0Var);
                    d0Var.f11161d = z12;
                    d0Var.f11160c = true;
                    d0Var.f11159b = e0Var;
                    k kVar = lVar2.f11224f;
                    kVar.f11216a = fVar;
                    kVar.f11217b = oVar;
                    kVar.f11218c = d0Var;
                    e0Var = d0Var;
                } else {
                    throw new com.bumptech.glide.i(2, e0Var.get().getClass());
                }
            }
            return this.f11230c.f(e0Var, lVar);
        } catch (Throwable th) {
            cVar.b(list);
            throw th;
        }
    }

    public final e0 b(com.bumptech.glide.load.data.g gVar, int i10, int i11, v3.l lVar, List list) {
        List list2 = this.f11229b;
        int size = list2.size();
        e0 e0Var = null;
        for (int i12 = 0; i12 < size; i12++) {
            v3.n nVar = (v3.n) list2.get(i12);
            try {
                if (nVar.b(gVar.a(), lVar)) {
                    e0Var = nVar.a(gVar.a(), i10, i11, lVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + nVar, e10);
                }
                list.add(e10);
            }
            if (e0Var != null) {
                break;
            }
        }
        if (e0Var != null) {
            return e0Var;
        }
        throw new a0(this.f11232e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f11228a + ", decoders=" + this.f11229b + ", transcoder=" + this.f11230c + '}';
    }
}
