package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pd implements v11 {
    public final AtomicReference A = new AtomicReference(null);
    public final View x;
    public final sc6 y;
    public final v11 z;

    public pd(View view, sc6 sc6Var, v11 v11Var) {
        this.x = view;
        this.y = sc6Var;
        this.z = v11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.en4 r8, defpackage.xz0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.nd
            if (r0 == 0) goto L13
            r0 = r9
            nd r0 = (defpackage.nd) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            nd r0 = new nd
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.x
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return
        L27:
            defpackage.m37.N(r9)
            goto L4e
        L2b:
            defpackage.m37.N(r9)
            r9 = r2
            b0 r2 = new b0
            r1 = 2
            r2.<init>(r8, r7, r1)
            c0 r4 = new c0
            r5 = 0
            r4.<init>(r7, r5, r1)
            r0.z = r9
            j10 r1 = new j10
            r6 = 7
            java.util.concurrent.atomic.AtomicReference r3 = r7.A
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.db.K(r1, r0)
            w11 r8 = defpackage.w11.x
            if (r7 != r8) goto L4e
            return
        L4e:
            defpackage.v71.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd.a(en4, xz0):void");
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.z.getCoroutineContext();
    }
}
