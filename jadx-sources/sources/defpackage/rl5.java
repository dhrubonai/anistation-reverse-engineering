package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rl5 extends t36 implements ic2 {
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ tl5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl5(tl5 tl5Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = tl5Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        rl5 rl5Var = new rl5(this.z, vz0Var);
        rl5Var.y = obj;
        return rl5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((rl5) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r0.emit(r1, r8) != r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r0.emit(r9, r8) != r7) goto L28;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.y
            x42 r0 = (defpackage.x42) r0
            byte r1 = r8.x
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            w11 r7 = defpackage.w11.x
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L1b
            defpackage.m37.N(r9)
            goto L74
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r6
        L21:
            defpackage.m37.N(r9)     // Catch: java.lang.Exception -> L60
            goto L74
        L25:
            defpackage.m37.N(r9)     // Catch: java.lang.Exception -> L60
            goto L4e
        L29:
            defpackage.m37.N(r9)     // Catch: java.lang.Exception -> L60
            goto L3d
        L2d:
            defpackage.m37.N(r9)
            com.anistation.model.Resource$Loading r9 = com.anistation.model.Resource.Loading.INSTANCE     // Catch: java.lang.Exception -> L60
            r8.y = r0     // Catch: java.lang.Exception -> L60
            r8.x = r5     // Catch: java.lang.Exception -> L60
            java.lang.Object r9 = r0.emit(r9, r8)     // Catch: java.lang.Exception -> L60
            if (r9 != r7) goto L3d
            goto L73
        L3d:
            tl5 r9 = r8.z     // Catch: java.lang.Exception -> L60
            le2 r9 = r9.b     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "prasidhanchan"
            r8.y = r0     // Catch: java.lang.Exception -> L60
            r8.x = r4     // Catch: java.lang.Exception -> L60
            java.lang.Object r9 = r9.a(r1, r8)     // Catch: java.lang.Exception -> L60
            if (r9 != r7) goto L4e
            goto L73
        L4e:
            com.anistation.model.github.DevProfile r9 = (com.anistation.model.github.DevProfile) r9     // Catch: java.lang.Exception -> L60
            com.anistation.model.Resource$Success r1 = new com.anistation.model.Resource$Success     // Catch: java.lang.Exception -> L60
            r1.<init>(r9)     // Catch: java.lang.Exception -> L60
            r8.y = r0     // Catch: java.lang.Exception -> L60
            r8.x = r3     // Catch: java.lang.Exception -> L60
            java.lang.Object r8 = r0.emit(r1, r8)     // Catch: java.lang.Exception -> L60
            if (r8 != r7) goto L74
            goto L73
        L60:
            com.anistation.model.Resource$Error r9 = new com.anistation.model.Resource$Error
            java.lang.String r1 = "Couldn't not load dev profile."
            com.anistation.model.Status r3 = com.anistation.model.Status.SERVER_ERROR
            r9.<init>(r1, r3)
            r8.y = r6
            r8.x = r2
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r7) goto L74
        L73:
            return r7
        L74:
            pn6 r8 = defpackage.pn6.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
