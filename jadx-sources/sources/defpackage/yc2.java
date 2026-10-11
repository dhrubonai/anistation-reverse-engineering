package defpackage;

import android.webkit.WebView;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yc2 implements Runnable {
    public final /* synthetic */ byte x;
    public Object y;
    public final Object z;

    public yc2(qx7 qx7Var, bo7 bo7Var) {
        this.x = (byte) 24;
        this.y = bo7Var;
        Objects.requireNonNull(qx7Var);
        this.z = qx7Var;
    }

    private final void a() {
        z77 z77Var;
        pu4 pu4Var = ((h46) this.z).x.f;
        String str = (String) this.y;
        synchronized (pu4Var.k) {
            try {
                v87 c = pu4Var.c(str);
                if (c != null) {
                    z77Var = c.a;
                } else {
                    z77Var = null;
                }
            } finally {
            }
        }
        if (z77Var != null && !a34.i(qx0.j, z77Var.j)) {
            synchronized (((h46) this.z).z) {
                ((h46) this.z).C.put(fy5.d(z77Var), z77Var);
                h46 h46Var = (h46) this.z;
                ((h46) this.z).D.put(fy5.d(z77Var), b77.a(h46Var.E, z77Var, ((o77) h46Var.y).b, h46Var));
            }
        }
    }

    private final void b() {
        boolean z;
        boolean z2;
        boolean z3;
        gs1 gs1Var = (gs1) this.y;
        qb7 qb7Var = (qb7) this.z;
        Object obj = gs1Var.b;
        if (obj == null) {
            return;
        }
        x28 x28Var = (x28) obj;
        try {
            byte[] bArr = (byte[]) qb7Var.y;
            ff7 ff7Var = ff7.a;
            int i = se7.a;
            d28 s = d28.s(bArr, ff7.b);
            Iterator it = x28Var.b.f.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                o18 o18Var = (o18) it.next();
                List r = s.r();
                o18Var.getClass();
                qb7 qb7Var2 = a28.h;
                qb7Var2.getClass();
                if (r != null && !r.isEmpty()) {
                    Iterator it2 = r.iterator();
                    z = false;
                    while (it2.hasNext()) {
                        f18 f18Var = (f18) ((ConcurrentHashMap) qb7Var2.y).get((String) it2.next());
                        if (f18Var != null) {
                            a28 a28Var = f18Var.a;
                            if (!a28Var.d) {
                                z2 = true;
                            } else {
                                qb0 qb0Var = a28Var.a;
                                if (qb0Var != null && (qb0Var.x || ((gj3) qb0Var.B).a == 3 || a28Var.g.k())) {
                                    synchronized (a28Var) {
                                        try {
                                            qb0 qb0Var2 = a28Var.a;
                                            if (qb0Var2 != null) {
                                                if (!qb0Var2.x) {
                                                    if (((gj3) qb0Var2.B).a == 3) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (!z3) {
                                                        if (a28Var.g.k()) {
                                                        }
                                                    }
                                                }
                                                a28Var.a = null;
                                                ((AtomicInteger) a28Var.f.y).incrementAndGet();
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                z2 = false;
                            }
                            z |= z2;
                        }
                    }
                } else {
                    z = false;
                }
                if (z && !z4) {
                    x28Var.a.a();
                    z4 = true;
                }
            }
        } catch (ag7 unused) {
            x28Var.getClass();
        }
    }

    private final void c() {
        os7 os7Var = (os7) this.z;
        synchronized (os7Var.z) {
            ((zd4) os7Var.A).onComplete((Task) this.y);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:23|(1:25)(7:256|257|258|(1:260)(2:283|(1:285))|261|262|(29:264|(1:266)(1:279)|267|268|269|271|272|273|28|(2:30|(2:32|(2:34|(2:36|(2:38|(2:40|(1:42)(1:249))(1:250))(1:251))(1:252))(1:253))(1:254))(1:255)|43|44|45|(1:47)(1:246)|48|(1:50)(1:245)|51|(1:53)|55|56|(1:58)(2:242|(8:244|(3:235|236|(6:238|(5:63|(1:65)(3:226|(3:229|(1:231)(1:232)|227)|233)|(1:67)(1:225)|68|(37:70|(1:72)(1:222)|73|(1:75)|76|(1:78)(1:221)|79|(1:81)|(3:220|83|(1:85))|86|(3:215|216|(19:218|(1:102)(1:214)|103|104|(1:106)|107|(2:208|(1:213))(1:111)|112|(3:204|(1:206)|207)|116|(1:118)|119|(1:123)|124|(3:126|(7:128|(1:130)(1:160)|131|(1:133)|134|(4:138|(1:140)|141|(1:143))|144)(1:161)|145)(10:162|(4:164|(2:167|(6:169|(1:171)(1:201)|172|(1:174)|175|176))|202|176)(1:203)|177|(1:179)|180|181|182|183|184|(5:186|(1:188)(1:196)|(1:192)|(1:194)|195))|146|(2:148|(5:150|(1:152)|153|(1:155)|156))|157|158))(1:89)|90|(1:99)|100|(0)(0)|103|104|(0)|107|(1:109)|208|(1:213)|112|(1:114)|204|(0)|207|116|(0)|119|(2:121|123)|124|(0)(0)|146|(0)|157|158)(2:223|224))|234|(0)(0)|68|(0)(0)))|61|(0)|234|(0)(0)|68|(0)(0)))|59|(0)|61|(0)|234|(0)(0)|68|(0)(0))(1:280))|26|27|28|(0)(0)|43|44|45|(0)(0)|48|(0)(0)|51|(0)|55|56|(0)(0)|59|(0)|61|(0)|234|(0)(0)|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0281, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0282, code lost:
    
        defpackage.gu7.l(r13);
        r13.C.c("Fetching Google App Id failed with exception. appId", defpackage.es7.P(r2), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0409, code lost:
    
        if (r11.i0() == 1) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x025f A[Catch: IllegalStateException -> 0x0281, TryCatch #1 {IllegalStateException -> 0x0281, blocks: (B:45:0x0256, B:48:0x0265, B:51:0x026d, B:53:0x0271, B:246:0x025f), top: B:44:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0271 A[Catch: IllegalStateException -> 0x0281, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x0281, blocks: (B:45:0x0256, B:48:0x0265, B:51:0x026d, B:53:0x0271, B:246:0x025f), top: B:44:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x034b  */
    /* JADX WARN: Type inference failed for: r0v18, types: [zq7, zx7, qt0] */
    /* JADX WARN: Type inference failed for: r0v26, types: [lx7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pv7, zl7, qt0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d() {
        /*
            Method dump skipped, instructions count: 2121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc2.d():void");
    }

    private final void e() {
        os7 os7Var = (os7) this.z;
        synchronized (os7Var.z) {
            ce4 ce4Var = (ce4) os7Var.A;
            Exception b = ((Task) this.y).b();
            a34.x(b);
            ce4Var.onFailure(b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.y).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        defpackage.zi5.C.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.y), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.z     // Catch: java.lang.Throwable -> L58
            zi5 r2 = (defpackage.zi5) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.y     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.z     // Catch: java.lang.Throwable -> L20
            zi5 r0 = (defpackage.zi5) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.z     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L7d
        L22:
            long r6 = r0.A     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.A = r6     // Catch: java.lang.Throwable -> L20
            r0.z = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.z     // Catch: java.lang.Throwable -> L20
            zi5 r4 = (defpackage.zi5) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.y     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.y = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.z     // Catch: java.lang.Throwable -> L20
            zi5 r10 = (defpackage.zi5) r10     // Catch: java.lang.Throwable -> L20
            r10.z = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.y     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.y = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.zi5.C     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.y     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.y = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L88:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc2.f():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v26, types: [r30] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, at2] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc2.run():void");
    }

    public String toString() {
        String str;
        byte b = this.x;
        Object obj = this.z;
        switch (b) {
            case 0:
                dn0 dn0Var = new dn0(yc2.class.getSimpleName(), (byte) 24);
                l33 l33Var = new l33((byte) 5, false);
                ((l33) dn0Var.A).z = l33Var;
                dn0Var.A = l33Var;
                l33Var.y = (xc2) obj;
                return dn0Var.toString();
            case 6:
                Runnable runnable = (Runnable) this.y;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((zi5) obj).z;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                str = "null";
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ yc2(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    public yc2(l68 l68Var, WebView webView, String str) {
        this.x = (byte) 9;
        this.y = webView;
        this.z = str;
    }

    public yc2(ct7 ct7Var, bn7 bn7Var, ct7 ct7Var2) {
        this.x = (byte) 19;
        this.y = bn7Var;
        this.z = ct7Var;
    }

    public /* synthetic */ yc2(byte b, Object obj, Object obj2, boolean z) {
        this.x = b;
        this.z = obj;
        this.y = obj2;
    }

    public yc2(zi5 zi5Var) {
        this.x = (byte) 6;
        this.z = zi5Var;
    }
}
