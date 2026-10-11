package defpackage;

import com.anistation.model.Page;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ue5 extends t36 implements ic2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Page B;
    public final /* synthetic */ String C;
    public byte x;
    public final /* synthetic */ af5 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue5(af5 af5Var, String str, int i, Page page, String str2, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = af5Var;
        this.z = str;
        this.A = i;
        this.B = page;
        this.C = str2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new ue5(this.y, this.z, this.A, this.B, this.C, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((ue5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        if (defpackage.iv.q((defpackage.w42) r1, r6, r21) == r8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r1 == r8) goto L21;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            byte r1 = r0.x
            r2 = 0
            com.anistation.model.Page r3 = r0.B
            java.lang.String r4 = r0.C
            r5 = 2
            r6 = 1
            af5 r7 = r0.y
            w11 r8 = defpackage.w11.x
            if (r1 == 0) goto L26
            if (r1 == r6) goto L20
            if (r1 != r5) goto L1a
            defpackage.m37.N(r22)
            goto L95
        L1a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r2
        L20:
            defpackage.m37.N(r22)
            r1 = r22
            goto L85
        L26:
            defpackage.m37.N(r22)
            sx5 r1 = r7.d
        L2b:
            java.lang.Object r9 = r1.getValue()
            r10 = r9
            wm6 r10 = (defpackage.wm6) r10
            java.lang.String r11 = r10.b
            java.lang.String r11 = defpackage.h98.h(r11)
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L51
            r19 = 0
            r20 = 1015(0x3f7, float:1.422E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            wm6 r10 = defpackage.wm6.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L51:
            boolean r9 = r1.j(r9, r10)
            if (r9 == 0) goto L2b
            pn r1 = r7.b
            int r9 = r3.getPerPage()
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r9)
            r0.x = r6
            r12 = r1
            zn r12 = (defpackage.zn) r12
            r12.getClass()
            vn r10 = new vn
            r13 = 0
            int r11 = r0.A
            java.lang.String r15 = r0.z
            r10.<init>(r11, r12, r13, r14, r15)
            mx0 r1 = new mx0
            r6 = 5
            r1.<init>(r10, r6)
            ja1 r6 = defpackage.rh1.a
            j91 r6 = defpackage.j91.y
            w42 r1 = defpackage.zz.D(r1, r6)
            if (r1 != r8) goto L85
            goto L94
        L85:
            w42 r1 = (defpackage.w42) r1
            te5 r6 = new te5
            r6.<init>(r7, r4, r3, r2)
            r0.x = r5
            java.lang.Object r0 = defpackage.iv.q(r1, r6, r0)
            if (r0 != r8) goto L95
        L94:
            return r8
        L95:
            pn6 r0 = defpackage.pn6.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
