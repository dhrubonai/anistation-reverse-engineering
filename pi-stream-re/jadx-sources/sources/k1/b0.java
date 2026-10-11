package k1;

import c1.e1;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6332a;

    /* renamed from: b, reason: collision with root package name */
    public int f6333b;

    /* renamed from: c, reason: collision with root package name */
    public long f6334c;

    /* renamed from: d, reason: collision with root package name */
    public final v1.w f6335d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6336e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f6338g;

    public b0(c0 c0Var, String str, int i10, v1.w wVar) {
        long j4;
        this.f6338g = c0Var;
        this.f6332a = str;
        this.f6333b = i10;
        if (wVar == null) {
            j4 = -1;
        } else {
            j4 = wVar.f10562d;
        }
        this.f6334c = j4;
        if (wVar != null && wVar.b()) {
            this.f6335d = wVar;
        }
    }

    public final boolean a(b bVar) {
        v1.w wVar = bVar.f6325d;
        if (wVar == null) {
            if (this.f6333b != bVar.f6324c) {
                return true;
            }
            return false;
        }
        long j4 = this.f6334c;
        if (j4 == -1) {
            return false;
        }
        if (wVar.f10562d > j4) {
            return true;
        }
        v1.w wVar2 = this.f6335d;
        if (wVar2 == null) {
            return false;
        }
        e1 e1Var = bVar.f6323b;
        int b10 = e1Var.b(wVar.f10559a);
        int b11 = e1Var.b(wVar2.f10559a);
        if (wVar.f10562d < wVar2.f10562d || b10 < b11) {
            return false;
        }
        if (b10 > b11) {
            return true;
        }
        boolean b12 = wVar.b();
        int i10 = wVar2.f10560b;
        if (b12) {
            int i11 = wVar.f10560b;
            if (i11 > i10) {
                return true;
            }
            if (i11 == i10) {
                if (wVar.f10561c > wVar2.f10561c) {
                    return true;
                }
            }
            return false;
        }
        int i12 = wVar.f10563e;
        if (i12 == -1 || i12 > i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.p()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(c1.e1 r7, c1.e1 r8) {
        /*
            r6 = this;
            int r0 = r6.f6333b
            int r1 = r7.p()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.p()
            if (r0 >= r7) goto L11
            goto L38
        L11:
            r0 = r3
            goto L38
        L13:
            k1.c0 r1 = r6.f6338g
            c1.d1 r4 = r1.f6341a
            r7.n(r0, r4)
            c1.d1 r0 = r1.f6341a
            int r4 = r0.o
        L1e:
            int r5 = r0.f1669p
            if (r4 > r5) goto L11
            java.lang.Object r5 = r7.m(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L35
            c1.c1 r7 = r1.f6342b
            c1.c1 r7 = r8.g(r5, r7, r2)
            int r0 = r7.f1643c
            goto L38
        L35:
            int r4 = r4 + 1
            goto L1e
        L38:
            r6.f6333b = r0
            if (r0 != r3) goto L3d
            return r2
        L3d:
            r7 = 1
            v1.w r0 = r6.f6335d
            if (r0 != 0) goto L43
            return r7
        L43:
            java.lang.Object r0 = r0.f10559a
            int r8 = r8.b(r0)
            if (r8 == r3) goto L4c
            r2 = r7
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.b0.b(c1.e1, c1.e1):boolean");
    }
}
