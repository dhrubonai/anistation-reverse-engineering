package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class yq6 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public boolean a;
    public int b;
    public Object c;

    public yq6() {
        this.c = new byte[8];
    }

    public static long a(int i, boolean z, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public rf1 b() {
        boolean z;
        if (this.b >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        return new rf1(this);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [v61, java.lang.Object, vz0] */
    public q53 c() {
        q53 h63Var;
        String l;
        Object obj;
        m1 m1Var = (m1) this.c;
        byte z = m1Var.z();
        if (z == 1) {
            return g(true);
        }
        if (z == 0) {
            return g(false);
        }
        if (z == 6) {
            int i = this.b + 1;
            this.b = i;
            if (i == 200) {
                u63 u63Var = new u63(this, null);
                ?? obj2 = new Object();
                obj2.x = u63Var;
                obj2.y = obj2;
                w11 w11Var = n77.e;
                obj2.z = w11Var;
                while (true) {
                    obj = obj2.z;
                    vz0 vz0Var = obj2.y;
                    if (vz0Var == null) {
                        break;
                    }
                    if (a34.i(w11Var, obj)) {
                        try {
                            u63 u63Var2 = obj2.x;
                            wk6.j(3, u63Var2);
                            u63 u63Var3 = new u63(u63Var2.A, vz0Var);
                            u63Var3.z = obj2;
                            Object invokeSuspend = u63Var3.invokeSuspend(pn6.a);
                            if (invokeSuspend != w11.x) {
                                vz0Var.resumeWith(invokeSuspend);
                            }
                        } catch (Throwable th) {
                            vz0Var.resumeWith(new y45(th));
                        }
                    } else {
                        obj2.z = w11Var;
                        vz0Var.resumeWith(obj);
                    }
                }
                m37.N(obj);
                h63Var = (q53) obj;
            } else {
                byte i2 = m1Var.i((byte) 6);
                if (m1Var.z() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!m1Var.e()) {
                            break;
                        }
                        if (this.a) {
                            l = m1Var.o();
                        } else {
                            l = m1Var.l();
                        }
                        m1Var.i((byte) 5);
                        linkedHashMap.put(l, c());
                        i2 = m1Var.h();
                        if (i2 != 4) {
                            if (i2 != 7) {
                                m1.u(m1Var, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (i2 == 6) {
                        m1Var.i((byte) 7);
                    } else if (i2 == 4) {
                        iv.D(m1Var, "object");
                        throw null;
                    }
                    h63Var = new h63(linkedHashMap);
                } else {
                    m1.u(m1Var, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.b--;
            return h63Var;
        }
        if (z == 8) {
            return d();
        }
        m1.u(m1Var, "Cannot read Json element because of unexpected ".concat(h98.V(z)), 0, null, 6);
        throw null;
    }

    public a53 d() {
        boolean z;
        m1 m1Var = (m1) this.c;
        byte h = m1Var.h();
        if (m1Var.z() != 4) {
            ArrayList arrayList = new ArrayList();
            while (m1Var.e()) {
                arrayList.add(c());
                h = m1Var.h();
                if (h != 4) {
                    if (h == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = m1Var.y;
                    if (!z) {
                        m1.u(m1Var, "Expected end of the array or comma", i, null, 4);
                        throw null;
                    }
                }
            }
            if (h == 8) {
                m1Var.i((byte) 9);
            } else if (h == 4) {
                iv.D(m1Var, "array");
                throw null;
            }
            return new a53(arrayList);
        }
        m1.u(m1Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.v61 r11, defpackage.h30 r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.c
            m1 r0 = (defpackage.m1) r0
            boolean r1 = r12 instanceof defpackage.v63
            if (r1 == 0) goto L17
            r1 = r12
            v63 r1 = (defpackage.v63) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.E = r2
            goto L1c
        L17:
            v63 r1 = new v63
            r1.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r1.C
            int r2 = r1.E
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5c
            if (r2 != r8) goto L56
            int r10 = r1.B
            java.lang.String r11 = r1.A
            java.util.LinkedHashMap r0 = r1.z
            yq6 r2 = r1.y
            v61 r9 = r1.x
            defpackage.m37.N(r12)
            q53 r12 = (defpackage.q53) r12
            r0.put(r11, r12)
            java.lang.Object r11 = r2.c
            m1 r11 = (defpackage.m1) r11
            byte r11 = r11.h()
            if (r11 == r7) goto L53
            if (r11 != r6) goto L49
            goto La0
        L49:
            java.lang.Object r10 = r2.c
            m1 r10 = (defpackage.m1) r10
            java.lang.String r11 = "Expected end of the object or comma"
            defpackage.m1.u(r10, r11, r5, r3, r4)
            throw r3
        L53:
            r5 = r10
            r10 = r2
            goto L70
        L56:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            return r3
        L5c:
            defpackage.m37.N(r12)
            byte r12 = r0.i(r4)
            byte r2 = r0.z()
            if (r2 == r7) goto Lb8
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9 = r11
            r11 = r12
        L70:
            java.lang.Object r12 = r10.c
            m1 r12 = (defpackage.m1) r12
            boolean r2 = r12.e()
            if (r2 == 0) goto L9f
            boolean r11 = r10.a
            if (r11 == 0) goto L83
            java.lang.String r11 = r12.o()
            goto L87
        L83:
            java.lang.String r11 = r12.l()
        L87:
            r2 = 5
            r12.i(r2)
            r1.x = r9
            r1.y = r10
            r1.z = r0
            r1.A = r11
            r1.B = r5
            r1.E = r8
            r9.getClass()
            r9.y = r1
            w11 r10 = defpackage.w11.x
            return r10
        L9f:
            r2 = r10
        La0:
            java.lang.Object r10 = r2.c
            m1 r10 = (defpackage.m1) r10
            if (r11 != r4) goto Laa
            r10.i(r6)
            goto Lac
        Laa:
            if (r11 == r7) goto Lb2
        Lac:
            h63 r10 = new h63
            r10.<init>(r0)
            return r10
        Lb2:
            java.lang.String r11 = "object"
            defpackage.iv.D(r10, r11)
            throw r3
        Lb8:
            java.lang.String r10 = "Unexpected leading comma"
            defpackage.m1.u(r0, r10, r5, r3, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq6.e(v61, h30):java.lang.Object");
    }

    public long f(c12 c12Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.c;
        if (!this.a) {
            if (!c12Var.g(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 < 8) {
                    if ((d[i4] & i3) != 0) {
                        i2 = i4 + 1;
                        break;
                    }
                    i4++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            this.b = i2;
            if (i2 != -1) {
                this.a = true;
            } else {
                ze0.m("No valid varint length mask found");
                return 0L;
            }
        }
        int i5 = this.b;
        if (i5 > i) {
            this.a = false;
            return -2L;
        }
        if (i5 != 1) {
            c12Var.readFully(bArr, 1, i5 - 1);
        }
        this.a = false;
        return a(this.b, z2, bArr);
    }

    public l63 g(boolean z) {
        String o;
        m1 m1Var = (m1) this.c;
        if (!this.a && z) {
            o = m1Var.l();
        } else {
            o = m1Var.o();
        }
        if (!z && a34.i(o, "null")) {
            return e63.INSTANCE;
        }
        return new b63(o, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yq6(int i) {
        this.a = i;
    }
}
