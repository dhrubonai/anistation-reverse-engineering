package p;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public b f8365d;

    /* renamed from: a, reason: collision with root package name */
    public k f8362a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f8363b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8364c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8366e = false;

    public c() {
    }

    public final void a(e eVar, int i10) {
        this.f8365d.d(eVar.i(i10), 1.0f);
        this.f8365d.d(eVar.i(i10), -1.0f);
    }

    public final void b(k kVar, k kVar2, k kVar3, int i10) {
        boolean z9 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            }
            this.f8363b = i10;
        }
        if (!z9) {
            this.f8365d.d(kVar, -1.0f);
            this.f8365d.d(kVar2, 1.0f);
            this.f8365d.d(kVar3, 1.0f);
        } else {
            this.f8365d.d(kVar, 1.0f);
            this.f8365d.d(kVar2, -1.0f);
            this.f8365d.d(kVar3, -1.0f);
        }
    }

    public final void c(k kVar, k kVar2, k kVar3, int i10) {
        boolean z9 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            }
            this.f8363b = i10;
        }
        if (!z9) {
            this.f8365d.d(kVar, -1.0f);
            this.f8365d.d(kVar2, 1.0f);
            this.f8365d.d(kVar3, -1.0f);
        } else {
            this.f8365d.d(kVar, 1.0f);
            this.f8365d.d(kVar2, -1.0f);
            this.f8365d.d(kVar3, 1.0f);
        }
    }

    public k d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final k e(boolean[] zArr, k kVar) {
        int i10;
        int g10 = this.f8365d.g();
        k kVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < g10; i11++) {
            float a10 = this.f8365d.a(i11);
            if (a10 < 0.0f) {
                k h10 = this.f8365d.h(i11);
                if ((zArr == null || !zArr[h10.f8394b]) && h10 != kVar && (((i10 = h10.f8404l) == 3 || i10 == 4) && a10 < f10)) {
                    f10 = a10;
                    kVar2 = h10;
                }
            }
        }
        return kVar2;
    }

    public final void f(k kVar) {
        k kVar2 = this.f8362a;
        if (kVar2 != null) {
            this.f8365d.d(kVar2, -1.0f);
            this.f8362a = null;
        }
        float c6 = this.f8365d.c(kVar, true) * (-1.0f);
        this.f8362a = kVar;
        if (c6 == 1.0f) {
            return;
        }
        this.f8363b /= c6;
        this.f8365d.j(c6);
    }

    public final void g(k kVar, boolean z9) {
        if (!kVar.f8398f) {
            return;
        }
        float i10 = this.f8365d.i(kVar);
        this.f8363b = (kVar.f8397e * i10) + this.f8363b;
        this.f8365d.c(kVar, z9);
        if (z9) {
            kVar.b(this);
        }
    }

    public void h(c cVar, boolean z9) {
        float b10 = this.f8365d.b(cVar, z9);
        this.f8363b = (cVar.f8363b * b10) + this.f8363b;
        if (z9) {
            cVar.f8362a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            p.k r0 = r9.f8362a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            p.k r1 = r9.f8362a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = a3.g.s(r0, r1)
            float r1 = r9.f8363b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f8363b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            p.b r5 = r9.f8365d
            int r5 = r5.g()
        L40:
            if (r4 >= r5) goto L9f
            p.b r6 = r9.f8365d
            p.k r6 = r6.h(r4)
            if (r6 != 0) goto L4b
            goto L9c
        L4b:
            p.b r7 = r9.f8365d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9c
        L56:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L67
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L79
            java.lang.String r1 = "- "
            java.lang.String r0 = a3.g.s(r0, r1)
            goto L76
        L67:
            if (r8 <= 0) goto L70
            java.lang.String r1 = " + "
            java.lang.String r0 = a3.g.s(r0, r1)
            goto L79
        L70:
            java.lang.String r1 = " - "
            java.lang.String r0 = a3.g.s(r0, r1)
        L76:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L79:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L84
            java.lang.String r0 = a3.g.s(r0, r6)
            goto L9b
        L84:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9b:
            r1 = r3
        L9c:
            int r4 = r4 + 1
            goto L40
        L9f:
            if (r1 != 0) goto La7
            java.lang.String r1 = "0.0"
            java.lang.String r0 = a3.g.s(r0, r1)
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c.toString():java.lang.String");
    }

    public c(i.g gVar) {
        this.f8365d = new a(this, gVar);
    }
}
