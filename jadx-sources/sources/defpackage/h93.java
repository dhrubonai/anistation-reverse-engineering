package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class h93 implements x42 {
    public final /* synthetic */ vk6 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ x42 x;
    public final /* synthetic */ jz0 y;
    public final /* synthetic */ Charset z;

    public h93(x42 x42Var, jz0 jz0Var, Charset charset, vk6 vk6Var, Object obj) {
        this.x = x42Var;
        this.y = jz0Var;
        this.z = charset;
        this.A = vk6Var;
        this.B = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (r14.emit(r15, r0) != r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.x42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r14, defpackage.vz0 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.g93
            if (r0 == 0) goto L13
            r0 = r15
            g93 r0 = (defpackage.g93) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            g93 r0 = new g93
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.x
            int r1 = r0.y
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.m37.N(r15)
            goto L9d
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r13)
            return r4
        L32:
            int r13 = r0.A
            x42 r14 = r0.z
            defpackage.m37.N(r15)
            goto L90
        L3a:
            defpackage.m37.N(r15)
            r7 = r14
            q93 r7 = (defpackage.q93) r7
            x42 r14 = r13.x
            r0.z = r14
            r15 = 0
            r0.A = r15
            r0.y = r3
            r7.getClass()
            java.nio.charset.Charset r1 = defpackage.kl0.a
            java.nio.charset.Charset r10 = r13.z
            boolean r1 = defpackage.a34.i(r10, r1)
            if (r1 == 0) goto L8a
            vk6 r1 = r13.A
            e73 r3 = r1.a
            java.lang.Class<w42> r6 = defpackage.w42.class
            im0 r6 = defpackage.z05.a(r6)
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L67
            goto L8a
        L67:
            vk6 r1 = defpackage.v94.j(r1)
            y43 r3 = r7.a
            uj5 r3 = r3.b
            x73 r9 = defpackage.oj5.serializerForTypeInfo(r3, r1)
            fk0 r1 = new fk0
            sc r6 = new sc
            r11 = 0
            r12 = 5
            java.lang.Object r8 = r13.B
            r6.<init>(r7, r8, r9, r10, r11, r12)
            jz0 r13 = r13.y
            jz0 r13 = defpackage.mz0.b(r13, r10)
            r3 = 12
            r1.<init>(r6, r13, r4, r3)
            goto L8b
        L8a:
            r1 = r4
        L8b:
            if (r1 != r5) goto L8e
            goto L9c
        L8e:
            r13 = r15
            r15 = r1
        L90:
            r0.z = r4
            r0.A = r13
            r0.y = r2
            java.lang.Object r13 = r14.emit(r15, r0)
            if (r13 != r5) goto L9d
        L9c:
            return r5
        L9d:
            pn6 r13 = defpackage.pn6.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h93.emit(java.lang.Object, vz0):java.lang.Object");
    }
}
