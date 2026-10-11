package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ks2 extends t36 implements jc2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ ls2 B;
    public final /* synthetic */ wp2 C;
    public int x;
    public byte y;
    public /* synthetic */ yl4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks2(ls2 ls2Var, wp2 wp2Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.B = ls2Var;
        this.C = wp2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ks2 ks2Var = new ks2(this.B, this.C, (vz0) obj3);
        ks2Var.z = (yl4) obj;
        ks2Var.A = obj2;
        return ks2Var.invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a5, code lost:
    
        if (r0.d(r10, (defpackage.yp2) r11) == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a7, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r11 == r6) goto L30;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            yl4 r0 = r10.z
            java.lang.Object r1 = r10.A
            byte r2 = r10.y
            r3 = 2
            r4 = 1
            r5 = 0
            w11 r6 = defpackage.w11.x
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L16
            defpackage.m37.N(r11)
            goto La8
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            return r5
        L1c:
            int r1 = r10.x
            defpackage.m37.N(r11)
            goto L97
        L23:
            defpackage.m37.N(r11)
            boolean r11 = r1 instanceof defpackage.yg4
            if (r11 == 0) goto Lab
            java.lang.Object r11 = r0.x
            r2 = r11
            or2 r2 = (defpackage.or2) r2
            r2.getClass()
            r2.d = r1
            r2.a(r5)
            or2 r11 = (defpackage.or2) r11
            mv0 r1 = r11.f
            ou r2 = defpackage.yr2.d
            java.lang.Object r1 = r1.d(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 20
            if (r1 == 0) goto L61
            int r7 = r1.intValue()
            if (r7 < r2) goto L61
            int r2 = r1.intValue()
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r7) goto L5c
            int r1 = r1.intValue()
            int r1 = r1 + r4
            goto L62
        L5c:
            int r1 = r1.intValue()
            goto L62
        L61:
            r1 = r2
        L62:
            is2 r2 = new is2
            wp2 r7 = r10.C
            r2.<init>(r1, r7)
            ls2 r7 = r10.B
            java.util.ArrayList r7 = r7.a
            java.util.List r7 = defpackage.yo0.y0(r7)
            java.util.Iterator r7 = r7.iterator()
        L75:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L88
            java.lang.Object r8 = r7.next()
            jc2 r8 = (defpackage.jc2) r8
            js2 r9 = new js2
            r9.<init>(r8, r2)
            r2 = r9
            goto L75
        L88:
            r10.z = r0
            r10.A = r5
            r10.x = r1
            r10.y = r4
            java.lang.Object r11 = r2.a(r11, r10)
            if (r11 != r6) goto L97
            goto La7
        L97:
            yp2 r11 = (defpackage.yp2) r11
            r10.z = r5
            r10.A = r5
            r10.x = r1
            r10.y = r3
            java.lang.Object r10 = r0.d(r10, r11)
            if (r10 != r6) goto La8
        La7:
            return r6
        La8:
            pn6 r10 = defpackage.pn6.a
            return r10
        Lab:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "\n|Fail to prepare request body for sending. \n|The body type is: "
            r10.<init>(r11)
            java.lang.Class r11 = r1.getClass()
            im0 r11 = defpackage.z05.a(r11)
            r10.append(r11)
            java.lang.String r11 = ", with Content-Type: "
            r10.append(r11)
            java.lang.Object r11 = r0.x
            or2 r11 = (defpackage.or2) r11
            jz0 r11 = defpackage.n77.B(r11)
            r10.append(r11)
            java.lang.String r11 = ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = defpackage.vz5.v(r10)
            defpackage.p65.f(r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
