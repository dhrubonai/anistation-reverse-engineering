package defpackage;

import com.anistation.model.Info;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class a30 implements ic2 {
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ float y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a30(do5 do5Var, float f) {
        this.z = do5Var;
        this.y = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r3.containsKey(r2) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r3.containsKey(r2) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        if (r3.containsKey(r2) != false) goto L27;
     */
    @Override // defpackage.ic2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            byte r0 = r7.x
            r1 = 1
            float r2 = r7.y
            java.lang.Object r7 = r7.z
            switch(r0) {
                case 0: goto Lb0;
                default: goto La;
            }
        La:
            do5 r7 = (defpackage.do5) r7
            k13 r8 = (defpackage.k13) r8
            rx0 r9 = (defpackage.rx0) r9
            long r3 = r9.a
            int r9 = defpackage.rx0.g(r3)
            float r9 = (float) r9
            long r3 = r8.a
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r8 = (int) r3
            float r8 = (float) r8
            cn3 r0 = new cn3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            boolean r4 = r7.a
            eo5 r5 = defpackage.eo5.z
            if (r4 != 0) goto L37
            float r4 = r9 - r2
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.put(r5, r4)
        L37:
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            eo5 r4 = defpackage.eo5.y
            if (r2 != 0) goto L3e
            goto L4c
        L3e:
            float r8 = r9 - r8
            r2 = 0
            float r8 = java.lang.Math.max(r8, r2)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r3.put(r4, r8)
        L4c:
            boolean r8 = r7.c
            eo5 r2 = defpackage.eo5.x
            if (r8 != 0) goto L59
            java.lang.Float r8 = java.lang.Float.valueOf(r9)
            r3.put(r2, r8)
        L59:
            r0.<init>(r3)
            d9 r7 = r7.e
            he1 r7 = r7.h
            java.lang.Object r7 = r7.getValue()
            eo5 r7 = (defpackage.eo5) r7
            int r8 = r7.ordinal()
            if (r8 == 0) goto La2
            if (r8 == r1) goto L8d
            r9 = 2
            if (r8 != r9) goto L88
            boolean r8 = r3.containsKey(r5)
            if (r8 == 0) goto L78
            goto Laa
        L78:
            boolean r8 = r3.containsKey(r4)
            if (r8 == 0) goto L80
        L7e:
            r5 = r4
            goto Laa
        L80:
            boolean r8 = r3.containsKey(r2)
            if (r8 == 0) goto La9
        L86:
            r5 = r2
            goto Laa
        L88:
            defpackage.ze0.l()
            r7 = 0
            goto Laf
        L8d:
            boolean r8 = r3.containsKey(r4)
            if (r8 == 0) goto L94
            goto L7e
        L94:
            boolean r8 = r3.containsKey(r5)
            if (r8 == 0) goto L9b
            goto Laa
        L9b:
            boolean r8 = r3.containsKey(r2)
            if (r8 == 0) goto La9
            goto L86
        La2:
            boolean r8 = r3.containsKey(r2)
            if (r8 == 0) goto La9
            goto L86
        La9:
            r5 = r7
        Laa:
            ai4 r7 = new ai4
            r7.<init>(r0, r5)
        Laf:
            return r7
        Lb0:
            com.anistation.model.Info r7 = (com.anistation.model.Info) r7
            kd2 r8 = (defpackage.kd2) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            int r9 = defpackage.kb0.N(r1)
            defpackage.iv.c(r7, r2, r8, r9)
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a30.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a30(Info info, float f, int i) {
        this.z = info;
        this.y = f;
    }
}
