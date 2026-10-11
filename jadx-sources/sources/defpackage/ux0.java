package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ux0 implements cr5, pa3 {
    public long x;
    public ArrayList y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, w05] */
    @Override // defpackage.cr5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vz0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.tx0
            if (r0 == 0) goto L13
            r0 = r7
            tx0 r0 = (defpackage.tx0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            tx0 r0 = new tx0
            xz0 r7 = (defpackage.xz0) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            w05 r0 = r0.x
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r7 = move-exception
            goto L72
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L32:
            defpackage.m37.N(r7)
            long r3 = r6.x
            boolean r7 = defpackage.rx0.k(r3)
            if (r7 == 0) goto L7d
            w05 r7 = new w05
            r7.<init>()
            r0.x = r7     // Catch: java.lang.Throwable -> L6e
            r0.A = r2     // Catch: java.lang.Throwable -> L6e
            qg0 r1 = new qg0     // Catch: java.lang.Throwable -> L6e
            vz0 r0 = defpackage.wc7.z(r0)     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6e
            r1.t()     // Catch: java.lang.Throwable -> L6e
            r7.x = r1     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayList r0 = r6.y     // Catch: java.lang.Throwable -> L6e
            r0.add(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r1.r()     // Catch: java.lang.Throwable -> L6e
            w11 r1 = defpackage.w11.x
            if (r0 != r1) goto L62
            return r1
        L62:
            r0 = r7
        L63:
            java.util.ArrayList r7 = r6.y
            java.lang.Object r0 = r0.x
            defpackage.wk6.h(r7)
            r7.remove(r0)
            goto L7d
        L6e:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L72:
            java.util.ArrayList r6 = r6.y
            java.lang.Object r0 = r0.x
            defpackage.wk6.h(r6)
            r6.remove(r0)
            throw r7
        L7d:
            long r6 = r6.x
            tq5 r0 = new tq5
            int r1 = defpackage.rx0.h(r6)
            lg1 r2 = defpackage.lg1.a
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r3) goto L95
            defpackage.kg1.a(r1)
            kg1 r4 = new kg1
            r4.<init>(r1)
            goto L96
        L95:
            r4 = r2
        L96:
            int r6 = defpackage.rx0.g(r6)
            if (r6 == r3) goto La4
            defpackage.kg1.a(r6)
            kg1 r2 = new kg1
            r2.<init>(r6)
        La4:
            r0.<init>(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux0.a(vz0):java.lang.Object");
    }

    public final void b(long j) {
        this.x = j;
        if (!rx0.k(j)) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                this.y = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((vz0) obj).resumeWith(pn6.a);
                }
            }
        }
    }

    @Override // defpackage.pa3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        b(j);
        em4 p = ro3Var.p(j);
        return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 5));
    }
}
