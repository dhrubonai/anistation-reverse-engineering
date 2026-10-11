package defpackage;

import com.anistation.model.Resource;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dm5 extends t36 implements ic2 {
    public final /* synthetic */ ez3 A;
    public /* synthetic */ Object x;
    public final /* synthetic */ hm5 y;
    public final /* synthetic */ lb5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm5(hm5 hm5Var, lb5 lb5Var, ez3 ez3Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = hm5Var;
        this.z = lb5Var;
        this.A = ez3Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        dm5 dm5Var = new dm5(this.y, this.z, this.A, vz0Var);
        dm5Var.x = obj;
        return dm5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        dm5 dm5Var = (dm5) create((Resource) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        dm5Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if ((r2 instanceof com.anistation.model.Resource.Error) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r3 = r1.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        if (r1.j(r3, defpackage.xm6.a((defpackage.xm6) r3, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 134217727)) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        r33.A.invoke(((com.anistation.model.Resource.Error) r2).getMessage());
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            r33 = this;
            r0 = r33
            hm5 r1 = r0.y
            sx5 r1 = r1.j
            java.lang.Object r2 = r0.x
            com.anistation.model.Resource r2 = (com.anistation.model.Resource) r2
            defpackage.m37.N(r34)
            if (r2 != 0) goto L11
            goto La7
        L11:
            boolean r3 = r2 instanceof com.anistation.model.Resource.Success
            if (r3 == 0) goto L59
        L15:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            xm6 r3 = (defpackage.xm6) r3
            r30 = 0
            r31 = 134217727(0x7ffffff, float:3.8518597E-34)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            xm6 r3 = defpackage.xm6.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r2 = r1.j(r2, r3)
            if (r2 == 0) goto L15
            lb5 r0 = r0.z
            r0.invoke()
            goto La7
        L59:
            boolean r3 = r2 instanceof com.anistation.model.Resource.Error
            if (r3 == 0) goto La7
        L5d:
            java.lang.Object r3 = r1.getValue()
            r4 = r3
            xm6 r4 = (defpackage.xm6) r4
            r31 = 0
            r32 = 134217727(0x7ffffff, float:3.8518597E-34)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            xm6 r4 = defpackage.xm6.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r3 = r1.j(r3, r4)
            if (r3 == 0) goto L5d
            com.anistation.model.Resource$Error r2 = (com.anistation.model.Resource.Error) r2
            java.lang.String r1 = r2.getMessage()
            ez3 r0 = r0.A
            r0.invoke(r1)
        La7:
            pn6 r0 = defpackage.pn6.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
