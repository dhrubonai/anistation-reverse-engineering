package defpackage;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class dq2 implements v11, Closeable {
    public static final /* synthetic */ long A = qs.a.objectFieldOffset(dq2.class.getDeclaredField("closed"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(dq2.class, "clientRefCount$internal");
    public final d46 x;
    public final d46 y;
    private volatile /* synthetic */ int closed = 0;
    public volatile /* synthetic */ int clientRefCount$internal = 0;

    public dq2() {
        final byte b = 0;
        this.x = new d46(new sb2(this) { // from class: cq2
            public final /* synthetic */ dq2 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b2 = b;
                dq2 dq2Var = this.y;
                switch (b2) {
                    case 0:
                        dq2Var.p().getClass();
                        ja1 ja1Var = rh1.a;
                        return j91.y;
                    default:
                        return tl7.L(new j43(null), new c21(o11.x, (byte) 0)).plus((n11) dq2Var.x.getValue()).plus(new r11("ktor-cio-context"));
                }
            }
        });
        final byte b2 = 1;
        this.y = new d46(new sb2(this) { // from class: cq2
            public final /* synthetic */ dq2 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b22 = b2;
                dq2 dq2Var = this.y;
                switch (b22) {
                    case 0:
                        dq2Var.p().getClass();
                        ja1 ja1Var = rh1.a;
                        return j91.y;
                    default:
                        return tl7.L(new j43(null), new c21(o11.x, (byte) 0)).plus((n11) dq2Var.x.getValue()).plus(new r11("ktor-cio-context"));
                }
            }
        });
    }

    public abstract Object a(ls0 ls0Var, xz0 xz0Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ar0 ar0Var;
        if (qs.a.compareAndSwapInt(this, A, 0, 1)) {
            j11 j11Var = getCoroutineContext().get(h95.F);
            if (j11Var instanceof ar0) {
                ar0Var = (ar0) j11Var;
            } else {
                ar0Var = null;
            }
            if (ar0Var == null) {
                return;
            }
            ((j43) ar0Var).g0();
        }
    }

    @Override // defpackage.v11
    public l11 getCoroutineContext() {
        return (l11) this.y.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ls0 r10, defpackage.xz0 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.aq2
            if (r0 == 0) goto L13
            r0 = r11
            aq2 r0 = (defpackage.aq2) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            aq2 r0 = new aq2
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.y
            int r1 = r0.A
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.m37.N(r11)
            return r11
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            return r4
        L31:
            ls0 r10 = r0.x
            defpackage.m37.N(r11)
            goto L7e
        L37:
            defpackage.m37.N(r11)
            java.lang.Object r11 = r10.C
            q26 r11 = (defpackage.q26) r11
            r0.x = r10
            r0.A = r3
            r11 r1 = defpackage.hq2.a
            j43 r1 = new j43
            r1.<init>(r11)
            l11 r11 = r9.getCoroutineContext()
            l11 r11 = r11.plus(r1)
            r11 r6 = defpackage.hq2.a
            l11 r11 = r11.plus(r6)
            l11 r6 = r0.getContext()
            h95 r7 = defpackage.h95.F
            j11 r6 = r6.get(r7)
            h43 r6 = (defpackage.h43) r6
            if (r6 != 0) goto L66
            goto L7b
        L66:
            yd r7 = new yd
            r8 = 9
            r7.<init>(r1, r8)
            ei1 r3 = r6.t(r3, r3, r7)
            yd r6 = new yd
            r7 = 8
            r6.<init>(r3, r7)
            r1.l0(r6)
        L7b:
            if (r11 != r5) goto L7e
            goto L9c
        L7e:
            l11 r11 = (defpackage.l11) r11
            s93 r1 = new s93
            r1.<init>(r11)
            l11 r11 = r11.plus(r1)
            e52 r1 = new e52
            r1.<init>(r9, r10, r4, r2)
            oc1 r9 = defpackage.tl7.i(r9, r11, r1, r2)
            r0.x = r4
            r0.A = r2
            java.lang.Object r9 = r9.o(r0)
            if (r9 != r5) goto L9d
        L9c:
            return r5
        L9d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq2.l(ls0, xz0):java.lang.Object");
    }

    public abstract je0 p();
}
