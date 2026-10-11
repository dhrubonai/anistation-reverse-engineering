package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class k93 implements fy0 {
    public final y43 a;
    public final ArrayList b;

    public k93(y43 y43Var) {
        this.a = y43Var;
        List list = c02.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((l93) it.next()).getClass();
            arrayList.add(new q93(y43Var));
        }
        this.b = arrayList;
        new r93(this.a.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.fy0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.jz0 r14, java.nio.charset.Charset r15, defpackage.vk6 r16, java.lang.Object r17, defpackage.vz0 r18) {
        /*
            r13 = this;
            r0 = r18
            y43 r1 = r13.a
            uj5 r2 = r1.b
            boolean r3 = r0 instanceof defpackage.j93
            if (r3 == 0) goto L19
            r3 = r0
            j93 r3 = (defpackage.j93) r3
            int r4 = r3.D
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.D = r4
            goto L20
        L19:
            j93 r3 = new j93
            xz0 r0 = (defpackage.xz0) r0
            r3.<init>(r13, r0)
        L20:
            java.lang.Object r0 = r3.B
            int r4 = r3.D
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L3f
            if (r4 != r6) goto L39
            java.lang.Object r13 = r3.A
            vk6 r14 = r3.z
            java.nio.charset.Charset r4 = r3.y
            jz0 r3 = r3.x
            defpackage.m37.N(r0)
            r11 = r14
            r14 = r3
            r10 = r4
            goto L71
        L39:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r13)
            return r5
        L3f:
            defpackage.m37.N(r0)
            mx0 r8 = new mx0
            r0 = 4
            java.util.ArrayList r13 = r13.b
            r8.<init>(r13, r0)
            i93 r7 = new i93
            r9 = r14
            r10 = r15
            r11 = r16
            r12 = r17
            r7.<init>(r8, r9, r10, r11, r12)
            h70 r13 = new h70
            r0 = 2
            r4 = 3
            r13.<init>(r0, r5, r4)
            r3.x = r14
            r3.y = r15
            r3.z = r11
            r3.A = r12
            r3.D = r6
            java.lang.Object r0 = defpackage.sw0.s(r7, r13, r3)
            w11 r13 = defpackage.w11.x
            if (r0 != r13) goto L6f
            return r13
        L6f:
            r10 = r15
            r13 = r12
        L71:
            yg4 r0 = (defpackage.yg4) r0
            if (r0 == 0) goto L76
            return r0
        L76:
            x73 r0 = defpackage.oj5.serializerForTypeInfo(r2, r11)     // Catch: defpackage.lj5 -> L7b
            goto L7f
        L7b:
            x73 r0 = defpackage.oj5.b(r13, r2)
        L7f:
            r0.getClass()
            mj5 r0 = (defpackage.mj5) r0
            java.lang.String r13 = r1.b(r0, r13)
            m86 r0 = new m86
            jz0 r14 = defpackage.mz0.b(r14, r10)
            r0.<init>(r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k93.a(jz0, java.nio.charset.Charset, vk6, java.lang.Object, vz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r10 == r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r10 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:11:0x0082). Please report as a decompilation issue!!! */
    @Override // defpackage.fy0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.nio.charset.Charset r7, defpackage.vk6 r8, defpackage.wc0 r9, defpackage.xz0 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.f93
            if (r0 == 0) goto L13
            r0 = r10
            f93 r0 = (defpackage.f93) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            f93 r0 = new f93
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.B
            int r1 = r0.D
            r2 = 1
            r3 = 2
            w11 r4 = defpackage.w11.x
            if (r1 == 0) goto L41
            if (r1 == r2) goto L39
            if (r1 != r3) goto L32
            java.util.Iterator r7 = r0.A
            oa0 r8 = r0.z
            vk6 r9 = r0.y
            java.nio.charset.Charset r1 = r0.x
            defpackage.m37.N(r10)
            goto L82
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L39:
            vk6 r8 = r0.y
            java.nio.charset.Charset r7 = r0.x
            defpackage.m37.N(r10)
            goto L51
        L41:
            defpackage.m37.N(r10)
            r0.x = r7
            r0.y = r8
            r0.D = r2
            java.lang.Object r10 = defpackage.zz.V(r9, r0)
            if (r10 != r4) goto L51
            goto L81
        L51:
            oa0 r10 = (defpackage.oa0) r10
            java.util.ArrayList r9 = r6.b
            java.util.Iterator r9 = r9.iterator()
            r1 = r7
            r7 = r9
            r9 = r8
            r8 = r10
        L5d:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.next()
            q93 r10 = (defpackage.q93) r10
            r8.getClass()
            dv5 r5 = new dv5
            r5.<init>(r8)
            r0.x = r1
            r0.y = r9
            r0.z = r8
            r0.A = r7
            r0.D = r3
            java.lang.Object r10 = r10.a(r1, r9, r5, r0)
            if (r10 != r4) goto L82
        L81:
            return r4
        L82:
            if (r10 != 0) goto L85
            goto L5d
        L85:
            return r10
        L86:
            y43 r6 = r6.a
            uj5 r7 = r6.b
            x73 r7 = defpackage.oj5.serializerForTypeInfo(r7, r9)
            ne1 r7 = (defpackage.ne1) r7     // Catch: java.lang.Throwable -> L99
            java.lang.String r8 = defpackage.it5.e(r8, r1)     // Catch: java.lang.Throwable -> L99
            java.lang.Object r6 = r6.a(r7, r8)     // Catch: java.lang.Throwable -> L99
            return r6
        L99:
            r6 = move-exception
            h53 r7 = new h53
            java.lang.String r8 = r6.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Illegal input: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8, r6, r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k93.b(java.nio.charset.Charset, vk6, wc0, xz0):java.lang.Object");
    }
}
