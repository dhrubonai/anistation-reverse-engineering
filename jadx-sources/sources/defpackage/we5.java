package defpackage;

import com.anistation.model.Resource;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class we5 extends t36 implements ic2 {
    public /* synthetic */ Object x;
    public final /* synthetic */ af5 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we5(af5 af5Var, String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = af5Var;
        this.z = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        we5 we5Var = new we5(this.y, this.z, vz0Var);
        we5Var.x = obj;
        return we5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        we5 we5Var = (we5) create((Resource) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        we5Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if ((r0 instanceof com.anistation.model.Resource.Idle) != false) goto L33;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.x
            com.anistation.model.Resource r0 = (com.anistation.model.Resource) r0
            defpackage.m37.N(r15)
            af5 r15 = r14.y
            sx5 r1 = r15.d
            java.lang.Object r2 = r1.getValue()
            wm6 r2 = (defpackage.wm6) r2
            java.lang.String r2 = r2.a
            java.lang.String r2 = defpackage.h98.h(r2)
            java.lang.String r14 = r14.z
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L21
            goto Lc7
        L21:
            if (r0 == 0) goto Lca
            boolean r2 = r0 instanceof com.anistation.model.Resource.Success
            if (r2 == 0) goto L81
            com.anistation.model.Resource$Success r0 = (com.anistation.model.Resource.Success) r0
            java.lang.Object r0 = r0.getData()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L33
            nt1 r0 = defpackage.nt1.x
        L33:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.anistation.model.SearchSuggestion r4 = (com.anistation.model.SearchSuggestion) r4
            java.lang.String r4 = r4.getTitle()
            java.lang.String r4 = defpackage.h98.h(r4)
            boolean r4 = r2.add(r4)
            if (r4 == 0) goto L41
            r9.add(r3)
            goto L41
        L60:
            qb2 r15 = r15.l
            r15.put(r14, r9)
        L65:
            java.lang.Object r14 = r1.getValue()
            r3 = r14
            wm6 r3 = (defpackage.wm6) r3
            r12 = 0
            r13 = 927(0x39f, float:1.299E-42)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            wm6 r15 = defpackage.wm6.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r14 = r1.j(r14, r15)
            if (r14 == 0) goto L65
            goto Lc7
        L81:
            boolean r14 = r0 instanceof com.anistation.model.Resource.Error
            if (r14 == 0) goto La2
        L85:
            java.lang.Object r14 = r1.getValue()
            r2 = r14
            wm6 r2 = (defpackage.wm6) r2
            r11 = 0
            r12 = 959(0x3bf, float:1.344E-42)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            wm6 r15 = defpackage.wm6.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r14 = r1.j(r14, r15)
            if (r14 == 0) goto L85
            goto Lc7
        La2:
            boolean r14 = r0 instanceof com.anistation.model.Resource.Loading
            if (r14 == 0) goto Lc3
        La6:
            java.lang.Object r14 = r1.getValue()
            r2 = r14
            wm6 r2 = (defpackage.wm6) r2
            r11 = 0
            r12 = 959(0x3bf, float:1.344E-42)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            wm6 r15 = defpackage.wm6.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r14 = r1.j(r14, r15)
            if (r14 == 0) goto La6
            goto Lc7
        Lc3:
            boolean r14 = r0 instanceof com.anistation.model.Resource.Idle
            if (r14 == 0) goto Lca
        Lc7:
            pn6 r14 = defpackage.pn6.a
            return r14
        Lca:
            defpackage.ze0.l()
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
