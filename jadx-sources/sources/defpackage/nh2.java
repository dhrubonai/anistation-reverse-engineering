package defpackage;

import android.accounts.Account;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class nh2 extends r30 {
    public final Set A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nh2(android.content.Context r10, android.os.Looper r11, int r12, defpackage.tp r13, defpackage.sh2 r14, defpackage.th2 r15) {
        /*
            r9 = this;
            o28 r3 = defpackage.o28.a(r10)
            qh2 r4 = defpackage.qh2.d
            defpackage.a34.x(r14)
            defpackage.a34.x(r15)
            qb7 r6 = new qb7
            r0 = 0
            r6.<init>(r14, r0)
            fq3 r7 = new fq3
            r14 = 22
            r7.<init>(r15, r14)
            java.lang.Object r14 = r13.B
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r9 = r13.z
            java.util.Set r9 = (java.util.Set) r9
            java.util.Iterator r10 = r9.iterator()
        L2d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L47
            java.lang.Object r11 = r10.next()
            com.google.android.gms.common.api.Scope r11 = (com.google.android.gms.common.api.Scope) r11
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto L40
            goto L2d
        L40:
            java.lang.String r9 = "Expanding scopes is not permitted, use implied scopes instead"
            defpackage.ze0.m(r9)
            r9 = 0
            throw r9
        L47:
            r0.A = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh2.<init>(android.content.Context, android.os.Looper, int, tp, sh2, th2):void");
    }

    @Override // defpackage.r30
    public final Account e() {
        return null;
    }

    @Override // defpackage.r30
    public final Executor g() {
        return null;
    }

    @Override // defpackage.r30
    public final Set l() {
        return this.A;
    }
}
