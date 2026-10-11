package defpackage;

import com.anistation.model.Info;
import com.anistation.model.Resource;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mf1 extends t36 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ pf1 B;
    public pf1 x;
    public Info y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf1(pf1 pf1Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = pf1Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        mf1 mf1Var = new mf1(this.B, vz0Var);
        mf1Var.A = obj;
        return mf1Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((mf1) create((Resource) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r11 != r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.A
            r2 = r0
            com.anistation.model.Resource r2 = (com.anistation.model.Resource) r2
            byte r0 = r11.z
            pn6 r10 = defpackage.pn6.a
            r1 = 0
            pf1 r3 = r11.B
            r4 = 2
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r0 == 0) goto L2c
            if (r0 == r5) goto L24
            if (r0 != r4) goto L1e
            pf1 r11 = r11.x
            com.anistation.model.Info r11 = (com.anistation.model.Info) r11
            defpackage.m37.N(r12)
            goto L80
        L1e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r11)
            return r1
        L24:
            com.anistation.model.Info r0 = r11.y
            pf1 r5 = r11.x
            defpackage.m37.N(r12)
            goto L5b
        L2c:
            defpackage.m37.N(r12)
            boolean r12 = r2 instanceof com.anistation.model.Resource.Success
            if (r12 == 0) goto L80
            r12 = r2
            com.anistation.model.Resource$Success r12 = (com.anistation.model.Resource.Success) r12
            java.lang.Object r12 = r12.getData()
            r0 = r12
            com.anistation.model.Info r0 = (com.anistation.model.Info) r0
            if (r0 == 0) goto L80
            cn r12 = r3.d
            java.lang.String r7 = r0.getId()
            int r8 = r0.getAnilistId()
            r11.A = r2
            r11.x = r3
            r11.y = r0
            r11.z = r5
            on r12 = (defpackage.on) r12
            java.lang.Object r12 = r12.c(r7, r8, r11)
            if (r12 != r6) goto L5a
            goto L7f
        L5a:
            r5 = r3
        L5b:
            cy6 r12 = r5.c
            java.lang.String r5 = r0.getId()
            int r0 = r0.getAnilistId()
            r11.A = r2
            r11.x = r1
            r11.y = r1
            r11.z = r4
            ny6 r12 = (defpackage.ny6) r12
            zx6 r12 = r12.a
            java.lang.String r1 = defpackage.vc2.a(r0, r5)
            java.lang.Object r11 = r12.promoteLegacyIdentity(r1, r0, r11)
            if (r11 != r6) goto L7c
            goto L7d
        L7c:
            r11 = r10
        L7d:
            if (r11 != r6) goto L80
        L7f:
            return r6
        L80:
            sx5 r11 = r3.f
        L82:
            java.lang.Object r12 = r11.getValue()
            r1 = r12
            zm6 r1 = (defpackage.zm6) r1
            r8 = 0
            r9 = 126(0x7e, float:1.77E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            zm6 r0 = defpackage.zm6.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r12 = r11.j(r12, r0)
            if (r12 == 0) goto L82
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mf1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
