package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import i4.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class l extends l4.a {
    public final Context R;
    public final o S;
    public final Class T;
    public final f U;
    public p V;
    public Object W;
    public ArrayList X;
    public l Y;
    public l Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f2242a0 = true;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2243b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2244c0;

    static {
    }

    public l(b bVar, o oVar, Class cls, Context context) {
        l4.f fVar;
        this.S = oVar;
        this.T = cls;
        this.R = context;
        Map map = oVar.f2277a.f2172c.f2220f;
        p pVar = (p) map.get(cls);
        if (pVar == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    pVar = (p) entry.getValue();
                }
            }
        }
        this.V = pVar == null ? f.f2214k : pVar;
        this.U = bVar.f2172c;
        Iterator it = oVar.f2285z.iterator();
        while (it.hasNext()) {
            s((l4.e) it.next());
        }
        synchronized (oVar) {
            fVar = oVar.A;
        }
        t(fVar);
    }

    public final l A(Object obj) {
        if (this.M) {
            return b().A(obj);
        }
        this.W = obj;
        this.f2243b0 = true;
        l();
        return this;
    }

    public final l4.h B(int i10, int i11, g gVar, p pVar, l4.a aVar, l4.d dVar, m4.i iVar, Object obj) {
        Context context = this.R;
        Object obj2 = this.W;
        Class cls = this.T;
        ArrayList arrayList = this.X;
        f fVar = this.U;
        return new l4.h(context, fVar, obj, obj2, cls, aVar, i10, i11, gVar, iVar, arrayList, dVar, fVar.f2221g, pVar.f2286a);
    }

    public final l C(f4.d dVar) {
        if (this.M) {
            return b().C(dVar);
        }
        this.V = dVar;
        this.f2242a0 = false;
        l();
        return this;
    }

    @Override // l4.a
    public final l4.a a(l4.a aVar) {
        w7.b.q(aVar);
        return (l) super.a(aVar);
    }

    @Override // l4.a
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (super.equals(lVar)) {
                if (Objects.equals(this.T, lVar.T) && this.V.equals(lVar.V) && Objects.equals(this.W, lVar.W) && Objects.equals(this.X, lVar.X) && Objects.equals(this.Y, lVar.Y) && Objects.equals(this.Z, lVar.Z) && this.f2242a0 == lVar.f2242a0 && this.f2243b0 == lVar.f2243b0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l4.a
    public final int hashCode() {
        return p4.m.g(p4.m.g(p4.m.f(p4.m.f(p4.m.f(p4.m.f(p4.m.f(p4.m.f(p4.m.f(super.hashCode(), this.T), this.V), this.W), this.X), this.Y), this.Z), null), this.f2242a0), this.f2243b0);
    }

    public final l s(l4.e eVar) {
        if (this.M) {
            return b().s(eVar);
        }
        if (eVar != null) {
            if (this.X == null) {
                this.X = new ArrayList();
            }
            this.X.add(eVar);
        }
        l();
        return this;
    }

    public final l t(l4.a aVar) {
        w7.b.q(aVar);
        return (l) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l4.c u(int i10, int i11, g gVar, p pVar, l4.a aVar, l4.d dVar, m4.i iVar, Object obj) {
        l4.b bVar;
        l4.d dVar2;
        l4.h B;
        int i12;
        p pVar2;
        g gVar2;
        int i13;
        int i14;
        if (this.Z != null) {
            dVar2 = new l4.b(obj, dVar);
            bVar = dVar2;
        } else {
            bVar = 0;
            dVar2 = dVar;
        }
        l lVar = this.Y;
        if (lVar != null) {
            if (!this.f2244c0) {
                p pVar3 = lVar.V;
                if (lVar.f2242a0) {
                    pVar2 = pVar;
                } else {
                    pVar2 = pVar3;
                }
                if (l4.a.g(lVar.f6818a, 8)) {
                    gVar2 = this.Y.f6821d;
                } else {
                    int ordinal = gVar.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                gVar2 = g.NORMAL;
                            } else {
                                throw new IllegalArgumentException("unknown priority: " + this.f6821d);
                            }
                        } else {
                            gVar2 = g.HIGH;
                        }
                    } else {
                        gVar2 = g.IMMEDIATE;
                    }
                }
                g gVar3 = gVar2;
                l lVar2 = this.Y;
                int i15 = lVar2.B;
                int i16 = lVar2.A;
                if (p4.m.h(i10, i11)) {
                    l lVar3 = this.Y;
                    if (!p4.m.h(lVar3.B, lVar3.A)) {
                        i14 = aVar.B;
                        i13 = aVar.A;
                        l4.i iVar2 = new l4.i(obj, dVar2);
                        l4.h B2 = B(i10, i11, gVar, pVar, aVar, iVar2, iVar, obj);
                        this.f2244c0 = true;
                        l lVar4 = this.Y;
                        l4.c u9 = lVar4.u(i14, i13, gVar3, pVar2, lVar4, iVar2, iVar, obj);
                        this.f2244c0 = false;
                        iVar2.f6860c = B2;
                        iVar2.f6861d = u9;
                        B = iVar2;
                    }
                }
                i13 = i16;
                i14 = i15;
                l4.i iVar22 = new l4.i(obj, dVar2);
                l4.h B22 = B(i10, i11, gVar, pVar, aVar, iVar22, iVar, obj);
                this.f2244c0 = true;
                l lVar42 = this.Y;
                l4.c u92 = lVar42.u(i14, i13, gVar3, pVar2, lVar42, iVar22, iVar, obj);
                this.f2244c0 = false;
                iVar22.f6860c = B22;
                iVar22.f6861d = u92;
                B = iVar22;
            } else {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            B = B(i10, i11, gVar, pVar, aVar, dVar2, iVar, obj);
        }
        if (bVar == 0) {
            return B;
        }
        l lVar5 = this.Z;
        int i17 = lVar5.B;
        int i18 = lVar5.A;
        if (p4.m.h(i10, i11)) {
            l lVar6 = this.Z;
            if (!p4.m.h(lVar6.B, lVar6.A)) {
                int i19 = aVar.B;
                i12 = aVar.A;
                i17 = i19;
                l lVar7 = this.Z;
                l4.c u10 = lVar7.u(i17, i12, lVar7.f6821d, lVar7.V, lVar7, bVar, iVar, obj);
                bVar.f6829c = B;
                bVar.f6830d = u10;
                return bVar;
            }
        }
        i12 = i18;
        l lVar72 = this.Z;
        l4.c u102 = lVar72.u(i17, i12, lVar72.f6821d, lVar72.V, lVar72, bVar, iVar, obj);
        bVar.f6829c = B;
        bVar.f6830d = u102;
        return bVar;
    }

    @Override // l4.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final l clone() {
        l lVar = (l) super.clone();
        lVar.V = lVar.V.clone();
        if (lVar.X != null) {
            lVar.X = new ArrayList(lVar.X);
        }
        l lVar2 = lVar.Y;
        if (lVar2 != null) {
            lVar.Y = lVar2.b();
        }
        l lVar3 = lVar.Z;
        if (lVar3 != null) {
            lVar.Z = lVar3.b();
        }
        return lVar;
    }

    public final l w(l lVar) {
        if (this.M) {
            return b().w(lVar);
        }
        this.Z = lVar;
        l();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(android.widget.ImageView r5) {
        /*
            r4 = this;
            p4.m.a()
            w7.b.q(r5)
            int r0 = r4.f6818a
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = l4.a.g(r0, r1)
            r1 = 1
            if (r0 != 0) goto L71
            boolean r0 = r4.E
            if (r0 == 0) goto L71
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L71
            int[] r0 = com.bumptech.glide.k.f2240a
            android.widget.ImageView$ScaleType r2 = r5.getScaleType()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L61;
                case 2: goto L4f;
                case 3: goto L3d;
                case 4: goto L3d;
                case 5: goto L3d;
                case 6: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L71
        L2b:
            com.bumptech.glide.l r0 = r4.b()
            e4.m r2 = e4.n.f3497b
            e4.i r3 = new e4.i
            r3.<init>()
            l4.a r0 = r0.h(r2, r3)
            r0.P = r1
            goto L72
        L3d:
            com.bumptech.glide.l r0 = r4.b()
            e4.m r2 = e4.n.f3496a
            e4.t r3 = new e4.t
            r3.<init>()
            l4.a r0 = r0.h(r2, r3)
            r0.P = r1
            goto L72
        L4f:
            com.bumptech.glide.l r0 = r4.b()
            e4.m r2 = e4.n.f3497b
            e4.i r3 = new e4.i
            r3.<init>()
            l4.a r0 = r0.h(r2, r3)
            r0.P = r1
            goto L72
        L61:
            com.bumptech.glide.l r0 = r4.b()
            e4.m r2 = e4.n.f3498c
            e4.h r3 = new e4.h
            r3.<init>()
            l4.a r0 = r0.h(r2, r3)
            goto L72
        L71:
            r0 = r4
        L72:
            com.bumptech.glide.f r2 = r4.U
            f9.x r2 = r2.f2217c
            r2.getClass()
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.Class r3 = r4.T
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8a
            m4.b r1 = new m4.b
            r2 = 0
            r1.<init>(r5, r2)
            goto L98
        L8a:
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L9c
            m4.b r2 = new m4.b
            r2.<init>(r5, r1)
            r1 = r2
        L98:
            r4.y(r1, r0)
            return
        L9c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.l.x(android.widget.ImageView):void");
    }

    public final void y(m4.i iVar, l4.a aVar) {
        boolean z9;
        w7.b.q(iVar);
        if (this.f2243b0) {
            Object obj = new Object();
            p pVar = this.V;
            l4.c u9 = u(aVar.B, aVar.A, aVar.f6821d, pVar, aVar, null, iVar, obj);
            l4.c f10 = iVar.f();
            if (u9.c(f10)) {
                if (!aVar.f6826z && f10.i()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    w7.b.q(f10);
                    if (!f10.isRunning()) {
                        f10.f();
                        return;
                    }
                    return;
                }
            }
            this.S.l(iVar);
            iVar.a(u9);
            o oVar = this.S;
            synchronized (oVar) {
                oVar.f2282f.f5383a.add(iVar);
                v vVar = oVar.f2280d;
                ((Set) vVar.f5382d).add(u9);
                if (!vVar.f5380b) {
                    u9.f();
                } else {
                    u9.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ((Set) vVar.f5381c).add(u9);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final l z(h8.a aVar) {
        if (this.M) {
            return b().z(aVar);
        }
        this.X = null;
        return s(aVar);
    }
}
