package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p51 implements w41 {
    public final i22 a;
    public final e21 b;
    public final v11 c;
    public final mx0 d;
    public int f;
    public bx5 g;
    public final zp2 i;
    public final d46 j;
    public final d46 k;
    public final zp2 l;
    public final m54 e = new m54();
    public final af2 h = new af2((byte) 14);

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, zp2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, zp2] */
    public p51(i22 i22Var, List list, e21 e21Var, v11 v11Var) {
        this.a = i22Var;
        this.b = e21Var;
        this.c = v11Var;
        vz0 vz0Var = null;
        this.d = new mx0(new an(this, vz0Var, (byte) 3), (byte) 5);
        ?? obj = new Object();
        obj.A = this;
        obj.x = new m54();
        obj.y = tl7.c();
        obj.z = yo0.I0(list);
        this.i = obj;
        final byte b = 0;
        this.j = new d46(new sb2(this) { // from class: x41
            public final /* synthetic */ p51 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b2 = b;
                p51 p51Var = this.y;
                switch (b2) {
                    case 0:
                        i22 i22Var2 = p51Var.a;
                        File canonicalFile = ((File) i22Var2.c.invoke()).getCanonicalFile();
                        synchronized (i22.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = i22.d;
                            if (!linkedHashSet.contains(absolutePath)) {
                                absolutePath.getClass();
                                linkedHashSet.add(absolutePath);
                            } else {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                        }
                        return new l22(canonicalFile, i22Var2.a, (bq5) i22Var2.b.invoke(canonicalFile), new vt0(canonicalFile, (byte) 8));
                    default:
                        return ((l22) p51Var.j.getValue()).c;
                }
            }
        });
        final byte b2 = 1;
        this.k = new d46(new sb2(this) { // from class: x41
            public final /* synthetic */ p51 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b22 = b2;
                p51 p51Var = this.y;
                switch (b22) {
                    case 0:
                        i22 i22Var2 = p51Var.a;
                        File canonicalFile = ((File) i22Var2.c.invoke()).getCanonicalFile();
                        synchronized (i22.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = i22.d;
                            if (!linkedHashSet.contains(absolutePath)) {
                                absolutePath.getClass();
                                linkedHashSet.add(absolutePath);
                            } else {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                        }
                        return new l22(canonicalFile, i22Var2.a, (bq5) i22Var2.b.invoke(canonicalFile), new vt0(canonicalFile, (byte) 8));
                    default:
                        return ((l22) p51Var.j.getValue()).c;
                }
            }
        });
        lz0 lz0Var = new lz0(this, b2);
        st0 st0Var = new st0((byte) 8);
        c0 c0Var = new c0((Object) this, vz0Var, (byte) 28);
        ?? obj2 = new Object();
        obj2.x = v11Var;
        obj2.y = c0Var;
        obj2.z = iv.d(Integer.MAX_VALUE, 6, null);
        obj2.A = new af2((byte) 8);
        h43 h43Var = (h43) v11Var.getCoroutineContext().get(h95.F);
        if (h43Var != null) {
            h43Var.l0(new bg((Object) lz0Var, (Object) obj2, (Object) st0Var, (byte) 25));
        }
        this.l = obj2;
    }

    @Override // defpackage.w41
    public final Object a(ic2 ic2Var, vz0 vz0Var) {
        ep6 ep6Var = (ep6) vz0Var.getContext().get(h95.O);
        if (ep6Var != null) {
            ep6Var.a(this);
        }
        return tl7.V(new ep6(ep6Var, this), new e0(this, ic2Var, null, (byte) 12), vz0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:11:0x0041, B:13:0x0049, B:15:0x004d, B:16:0x0053), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.xz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.e51
            if (r0 == 0) goto L13
            r0 = r5
            e51 r0 = (defpackage.e51) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            e51 r0 = new e51
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.y
            int r1 = r0.A
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            m54 r0 = r0.x
            defpackage.m37.N(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r3
        L2e:
            defpackage.m37.N(r5)
            m54 r5 = r4.e
            r0.x = r5
            r0.A = r2
            java.lang.Object r0 = r5.a(r0)
            w11 r1 = defpackage.w11.x
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            int r5 = r4.f     // Catch: java.lang.Throwable -> L51
            int r5 = r5 + (-1)
            r4.f = r5     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L55
            bx5 r5 = r4.g     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L53
            r5.l(r3)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r4 = move-exception
            goto L5b
        L53:
            r4.g = r3     // Catch: java.lang.Throwable -> L51
        L55:
            r0.l(r3)
            pn6 r4 = defpackage.pn6.a
            return r4
        L5b:
            r0.l(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p51.b(xz0):java.lang.Object");
    }

    public final bq5 c() {
        return (bq5) this.k.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.xx3 r8, defpackage.xz0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.f51
            if (r0 == 0) goto L13
            r0 = r9
            f51 r0 = (defpackage.f51) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            f51 r0 = new f51
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.y
            int r1 = r0.A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            zq0 r7 = r0.x
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L28
            goto L5d
        L28:
            r8 = move-exception
            goto L58
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r2
        L30:
            defpackage.m37.N(r9)
            zq0 r9 = r8.b
            l11 r1 = r8.d     // Catch: java.lang.Throwable -> L56
            l11 r4 = r0.getContext()     // Catch: java.lang.Throwable -> L56
            l11 r1 = r1.plus(r4)     // Catch: java.lang.Throwable -> L56
            q8 r4 = new q8     // Catch: java.lang.Throwable -> L56
            r5 = 4
            r4.<init>(r7, r8, r2, r5)     // Catch: java.lang.Throwable -> L56
            r0.x = r9     // Catch: java.lang.Throwable -> L56
            r0.A = r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r7 = defpackage.tl7.V(r1, r4, r0)     // Catch: java.lang.Throwable -> L56
            w11 r8 = defpackage.w11.x
            if (r7 != r8) goto L52
            return r8
        L52:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5d
        L56:
            r8 = move-exception
            r7 = r9
        L58:
            y45 r9 = new y45
            r9.<init>(r8)
        L5d:
            java.lang.Throwable r8 = defpackage.z45.b(r9)
            if (r8 != 0) goto L67
            r7.Q(r9)
            goto L6a
        L67:
            r7.g0(r8)
        L6a:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p51.d(xx3, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:11:0x0041, B:13:0x0048), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.xz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.g51
            if (r0 == 0) goto L13
            r0 = r5
            g51 r0 = (defpackage.g51) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            g51 r0 = new g51
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.y
            int r1 = r0.A
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            m54 r0 = r0.x
            defpackage.m37.N(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r3
        L2e:
            defpackage.m37.N(r5)
            m54 r5 = r4.e
            r0.x = r5
            r0.A = r2
            java.lang.Object r0 = r5.a(r0)
            w11 r1 = defpackage.w11.x
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            int r5 = r4.f     // Catch: java.lang.Throwable -> L58
            int r5 = r5 + r2
            r4.f = r5     // Catch: java.lang.Throwable -> L58
            if (r5 != r2) goto L5a
            v11 r5 = r4.c     // Catch: java.lang.Throwable -> L58
            h51 r1 = new h51     // Catch: java.lang.Throwable -> L58
            r2 = 0
            r1.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> L58
            r2 = 3
            bx5 r5 = defpackage.tl7.z(r5, r3, r3, r1, r2)     // Catch: java.lang.Throwable -> L58
            r4.g = r5     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L60
        L5a:
            r0.l(r3)
            pn6 r4 = defpackage.pn6.a
            return r4
        L60:
            r0.l(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p51.e(xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r1.G(r0) != r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (r7 == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.xz0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.i51
            if (r0 == 0) goto L13
            r0 = r7
            i51 r0 = (defpackage.i51) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            i51 r0 = new i51
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.A
            r2 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r0 = r0.x
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L35:
            defpackage.m37.N(r7)
            goto L49
        L39:
            defpackage.m37.N(r7)
            bq5 r7 = r6.c()
            r0.A = r3
            java.lang.Integer r7 = r7.a()
            if (r7 != r4) goto L49
            goto L5b
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            zp2 r1 = r6.i     // Catch: java.lang.Throwable -> L5f
            r0.x = r7     // Catch: java.lang.Throwable -> L5f
            r0.A = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r1.G(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            pn6 r6 = defpackage.pn6.a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            ny4 r1 = new ny4
            r1.<init>(r7, r0)
            af2 r6 = r6.h
            r6.t(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p51.f(xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r12 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r12 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        if (r12 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r11, defpackage.vz0 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.j51
            if (r0 == 0) goto L13
            r0 = r12
            j51 r0 = (defpackage.j51) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            j51 r0 = new j51
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.z
            int r1 = r0.B
            af2 r2 = r10.h
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            w11 r7 = defpackage.w11.x
            if (r1 == 0) goto L43
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.m37.N(r12)
            goto La3
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            return r6
        L37:
            defpackage.m37.N(r12)
            goto L8b
        L3b:
            boolean r11 = r0.x
            ox5 r1 = r0.y
            defpackage.m37.N(r12)
            goto L5f
        L43:
            defpackage.m37.N(r12)
            ox5 r1 = r2.f()
            boolean r12 = r1 instanceof defpackage.cn6
            if (r12 != 0) goto Lb7
            bq5 r12 = r10.c()
            r0.y = r1
            r0.x = r11
            r0.B = r5
            java.lang.Integer r12 = r12.a()
            if (r12 != r7) goto L5f
            goto La2
        L5f:
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            boolean r8 = r1 instanceof defpackage.f41
            if (r8 == 0) goto L6f
            r9 = r1
            f41 r9 = (defpackage.f41) r9
            int r9 = r9.a
            goto L70
        L6f:
            r9 = -1
        L70:
            if (r8 == 0) goto L75
            if (r12 != r9) goto L75
            return r1
        L75:
            if (r11 == 0) goto L8e
            bq5 r11 = r10.c()
            i10 r12 = new i10
            r12.<init>(r10, r6, r5)
            r0.y = r6
            r0.B = r4
            java.lang.Object r12 = r11.b(r12, r0)
            if (r12 != r7) goto L8b
            goto La2
        L8b:
            ai4 r12 = (defpackage.ai4) r12
            goto La5
        L8e:
            bq5 r11 = r10.c()
            k51 r12 = new k51
            r1 = 0
            r12.<init>(r10, r9, r6, r1)
            r0.y = r6
            r0.B = r3
            java.lang.Object r12 = r11.c(r12, r0)
            if (r12 != r7) goto La3
        La2:
            return r7
        La3:
            ai4 r12 = (defpackage.ai4) r12
        La5:
            java.lang.Object r10 = r12.x
            ox5 r10 = (defpackage.ox5) r10
            java.lang.Object r11 = r12.y
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lb6
            r2.t(r10)
        Lb6:
            return r10
        Lb7:
            java.lang.String r10 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.ze0.m(r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p51.g(boolean, vz0):java.lang.Object");
    }

    @Override // defpackage.w41
    public final w42 getData() {
        return this.d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|73|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0058, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123 A[Catch: all -> 0x014c, TryCatch #3 {all -> 0x014c, blocks: (B:27:0x0113, B:29:0x0123, B:33:0x0128), top: B:26:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0128 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #3 {all -> 0x014c, blocks: (B:27:0x0113, B:29:0x0123, B:33:0x0128), top: B:26:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097 A[Catch: d21 -> 0x0058, TryCatch #1 {d21 -> 0x0058, blocks: (B:37:0x0053, B:38:0x00ed, B:41:0x005d, B:42:0x00d2, B:57:0x0072, B:59:0x0097, B:60:0x009d, B:66:0x007c, B:69:0x00c3), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, u05, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, w05, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r11, defpackage.xz0 r12) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p51.h(boolean, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, u05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r10, boolean r11, defpackage.xz0 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.n51
            if (r0 == 0) goto L13
            r0 = r12
            n51 r0 = (defpackage.n51) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            n51 r0 = new n51
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            u05 r9 = r0.x
            defpackage.m37.N(r12)
            goto L55
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.m37.N(r12)
            u05 r4 = new u05
            r4.<init>()
            d46 r12 = r9.j
            java.lang.Object r12 = r12.getValue()
            l22 r12 = (defpackage.l22) r12
            o51 r3 = new o51
            r8 = 0
            r5 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.x = r4
            r0.A = r2
            java.lang.Object r9 = r12.b(r3, r0)
            w11 r10 = defpackage.w11.x
            if (r9 != r10) goto L54
            return r10
        L54:
            r9 = r4
        L55:
            int r9 = r9.x
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p51.i(java.lang.Object, boolean, xz0):java.lang.Object");
    }
}
