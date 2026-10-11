package k1;

import c1.c1;
import c1.d1;
import c1.e1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final h3.e f6339h = new h3.e(1);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f6340i = new Random();

    /* renamed from: d, reason: collision with root package name */
    public g0 f6344d;

    /* renamed from: f, reason: collision with root package name */
    public String f6346f;

    /* renamed from: a, reason: collision with root package name */
    public final d1 f6341a = new d1();

    /* renamed from: b, reason: collision with root package name */
    public final c1 f6342b = new c1();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6343c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public e1 f6345e = e1.f1676a;

    /* renamed from: g, reason: collision with root package name */
    public long f6347g = -1;

    public final void a(b0 b0Var) {
        long j4 = b0Var.f6334c;
        if (j4 != -1) {
            this.f6347g = j4;
        }
        this.f6346f = null;
    }

    public final synchronized void b(b bVar) {
        g0 g0Var;
        String str = this.f6346f;
        if (str != null) {
            b0 b0Var = (b0) this.f6343c.get(str);
            b0Var.getClass();
            a(b0Var);
        }
        Iterator it = this.f6343c.values().iterator();
        while (it.hasNext()) {
            b0 b0Var2 = (b0) it.next();
            it.remove();
            if (b0Var2.f6336e && (g0Var = this.f6344d) != null) {
                ((f0) g0Var).e(bVar, b0Var2.f6332a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r16 == r8.f6333b) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007d, code lost:
    
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k1.b0 c(int r16, v1.w r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.f6343c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La0
            java.lang.Object r8 = r4.next()
            k1.b0 r8 = (k1.b0) r8
            long r9 = r8.f6334c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.f6333b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            k1.c0 r9 = r8.f6338g
            java.util.HashMap r10 = r9.f6343c
            java.lang.String r13 = r9.f6346f
            java.lang.Object r10 = r10.get(r13)
            k1.b0 r10 = (k1.b0) r10
            if (r10 == 0) goto L44
            long r13 = r10.f6334c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.f6347g
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.f10562d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.f6334c = r9
        L51:
            v1.w r9 = r8.f6335d
            if (r2 != 0) goto L5a
            int r10 = r8.f6333b
            if (r1 != r10) goto L7f
            goto L7d
        L5a:
            long r13 = r2.f10562d
            if (r9 != 0) goto L6b
            boolean r10 = r17.b()
            if (r10 != 0) goto L7f
            long r11 = r8.f6334c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L7f
            goto L7d
        L6b:
            long r10 = r9.f10562d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L7f
            int r10 = r2.f10560b
            int r11 = r9.f10560b
            if (r10 != r11) goto L7f
            int r10 = r2.f10561c
            int r11 = r9.f10561c
            if (r10 != r11) goto L7f
        L7d:
            r10 = 1
            goto L80
        L7f:
            r10 = 0
        L80:
            if (r10 == 0) goto L15
            long r10 = r8.f6334c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L9c
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8f
            goto L9c
        L8f:
            if (r12 != 0) goto L15
            int r10 = f1.b0.f3799a
            v1.w r10 = r5.f6335d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L9c:
            r5 = r8
            r6 = r10
            goto L15
        La0:
            if (r5 != 0) goto Lb2
            h3.e r4 = k1.c0.f6339h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            k1.b0 r5 = new k1.b0
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        Lb2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.c0.c(int, v1.w):k1.b0");
    }

    public final void d(b bVar) {
        v1.w wVar;
        boolean q9 = bVar.f6323b.q();
        HashMap hashMap = this.f6343c;
        if (q9) {
            String str = this.f6346f;
            if (str != null) {
                b0 b0Var = (b0) hashMap.get(str);
                b0Var.getClass();
                a(b0Var);
                return;
            }
            return;
        }
        b0 b0Var2 = (b0) hashMap.get(this.f6346f);
        int i10 = bVar.f6324c;
        v1.w wVar2 = bVar.f6325d;
        this.f6346f = c(i10, wVar2).f6332a;
        e(bVar);
        if (wVar2 != null && wVar2.b()) {
            long j4 = wVar2.f10562d;
            if (b0Var2 == null || b0Var2.f6334c != j4 || (wVar = b0Var2.f6335d) == null || wVar.f10560b != wVar2.f10560b || wVar.f10561c != wVar2.f10561c) {
                c(i10, new v1.w(wVar2.f10559a, j4));
                this.f6344d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x00fb, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0050, B:31:0x005c, B:32:0x0060, B:34:0x0065, B:36:0x006b, B:38:0x0082, B:39:0x00b0, B:41:0x00b4, B:42:0x00bb, B:44:0x00c5, B:46:0x00c9, B:48:0x00d8, B:51:0x00df), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(k1.b r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.c0.e(k1.b):void");
    }

    public final synchronized void f(b bVar, int i10) {
        boolean z9;
        this.f6344d.getClass();
        if (i10 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Iterator it = this.f6343c.values().iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (b0Var.a(bVar)) {
                it.remove();
                if (b0Var.f6336e) {
                    boolean equals = b0Var.f6332a.equals(this.f6346f);
                    if (z9 && equals) {
                        boolean z10 = b0Var.f6337f;
                    }
                    if (equals) {
                        a(b0Var);
                    }
                    ((f0) this.f6344d).e(bVar, b0Var.f6332a);
                }
            }
        }
        d(bVar);
    }
}
