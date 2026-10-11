package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jw7 implements Runnable {
    public final /* synthetic */ boolean x;
    public final /* synthetic */ qx7 y;

    public jw7(qx7 qx7Var, boolean z) {
        this.x = z;
        Objects.requireNonNull(qx7Var);
        this.y = qx7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r3 != r4) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            qx7 r0 = r8.y
            java.lang.Object r1 = r0.x
            gu7 r1 = (defpackage.gu7) r1
            boolean r2 = r1.a()
            java.lang.Boolean r3 = r1.V
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1a
            java.lang.Boolean r3 = r1.V
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1a
            r3 = r5
            goto L1b
        L1a:
            r3 = r4
        L1b:
            boolean r8 = r8.x
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r8)
            r1.V = r6
            if (r3 != r8) goto L35
            es7 r3 = r1.C
            defpackage.gu7.l(r3)
            bs7 r3 = r3.K
            java.lang.String r6 = "Default data collection state already set to"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r3.b(r7, r6)
        L35:
            boolean r3 = r1.a()
            if (r3 == r2) goto L4e
            boolean r3 = r1.a()
            java.lang.Boolean r6 = r1.V
            if (r6 == 0) goto L4c
            java.lang.Boolean r6 = r1.V
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4c
            r4 = r5
        L4c:
            if (r3 == r4) goto L62
        L4e:
            es7 r1 = r1.C
            defpackage.gu7.l(r1)
            bs7 r1 = r1.H
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "Default data collection is different than actual status"
            r1.c(r3, r8, r2)
        L62:
            r0.d0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw7.run():void");
    }
}
