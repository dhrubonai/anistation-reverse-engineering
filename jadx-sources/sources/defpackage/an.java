package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class an extends t36 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public byte y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an(Object obj, Object obj2, Object obj3, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.B;
        switch (b) {
            case 0:
                return new an((bn) this.A, (Context) obj2, vz0Var, (byte) 0);
            case 1:
                return new an((qt) this.A, (kt) obj2, vz0Var, (byte) 1);
            case 2:
                return new an((x44) this.A, (ng6) obj2, vz0Var, (byte) 2);
            case 3:
                an anVar = new an((p51) obj2, vz0Var, (byte) 3);
                anVar.A = obj;
                return anVar;
            case 4:
                return new an((fl1) this.A, (String) obj2, vz0Var, (byte) 4);
            case 5:
                return new an((l11) this.z, (w42) this.A, (ru4) obj2, vz0Var, (byte) 5);
            case 6:
                an anVar2 = new an((yd0) this.A, (g21) obj2, vz0Var, (byte) 6);
                anVar2.z = obj;
                return anVar2;
            case 7:
                return new an((af5) this.z, (String) this.A, (String) obj2, vz0Var, (byte) 7);
            case 8:
                an anVar3 = new an((h43) this.A, (ic2) obj2, vz0Var, (byte) 8);
                anVar3.z = obj;
                return anVar3;
            case 9:
                return new an((f96) this.A, (y86) obj2, vz0Var, (byte) 9);
            case 10:
                an anVar4 = new an((ak6) obj2, vz0Var, (byte) 10);
                anVar4.A = obj;
                return anVar4;
            default:
                return new an((v87) this.z, (pi3) this.A, (h77) obj2, vz0Var, (byte) 11);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((an) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((an) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((an) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((an) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((an) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((an) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                return ((an) create((l97) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((an) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((an) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                return ((an) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((an) create((vh6) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((an) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00d9, code lost:
    
        if (r4 == r2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d2, code lost:
    
        if (r0.invoke(r26) == r3) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c5, code lost:
    
        if (r0.a(r2, r26) == r3) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0229, code lost:
    
        if (r3.invoke(r2, r26) == r0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0219, code lost:
    
        if (r3.G(r26) == r0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0292, code lost:
    
        if (defpackage.iv.q((defpackage.w42) r3, r4, r26) == r2) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x027d, code lost:
    
        if (r3 == r2) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02e4, code lost:
    
        if (r0.f(r26) == r2) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02d6, code lost:
    
        if (new defpackage.sc0(r5, r6, r7, 8193).d(true, r26) == r2) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0324, code lost:
    
        if (r2.collect(r3, r26) == r4) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0335, code lost:
    
        if (defpackage.tl7.V(r3, r5, r26) == r4) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x045b, code lost:
    
        if (r6.n(r26) == r7) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r4 == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0525, code lost:
    
        if (r1 == r3) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x04bc, code lost:
    
        if (r8 == r3) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x05ae, code lost:
    
        if (defpackage.iv.q(r2, r0, r26) == r4) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x05cb, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0599, code lost:
    
        if (r3.c(r0, r26) == r4) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x060d, code lost:
    
        if (r0 == r3) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0699, code lost:
    
        if (r5 == r4) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0137, code lost:
    
        if (r15 != false) goto L66;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06cf A[LOOP:2: B:422:0x06c9->B:424:0x06cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0716 A[LOOP:4: B:441:0x0714->B:442:0x0716, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x096f  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 2448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.B = obj;
    }
}
