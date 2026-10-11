package defpackage;

import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sv6 extends jg {
    public final View b0;
    public final g84 c0;
    public m95 d0;
    public ub2 e0;
    public ub2 f0;
    public ub2 g0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sv6(android.content.Context r8, defpackage.ub2 r9, defpackage.id2 r10, defpackage.n95 r11, int r12, defpackage.kh4 r13) {
        /*
            r7 = this;
            java.lang.Object r9 = r9.invoke(r8)
            r5 = r9
            android.view.View r5 = (android.view.View) r5
            g84 r4 = new g84
            r4.<init>()
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.b0 = r5
            r0.c0 = r4
            r7 = 0
            r0.setClipChildren(r7)
            java.lang.String r7 = java.lang.String.valueOf(r3)
            r8 = 0
            if (r11 == 0) goto L28
            java.lang.Object r9 = r11.d(r7)
            goto L29
        L28:
            r9 = r8
        L29:
            boolean r10 = r9 instanceof android.util.SparseArray
            if (r10 == 0) goto L30
            r8 = r9
            android.util.SparseArray r8 = (android.util.SparseArray) r8
        L30:
            if (r8 == 0) goto L35
            r5.restoreHierarchyState(r8)
        L35:
            if (r11 == 0) goto L44
            eg r8 = new eg
            r9 = 2
            r8.<init>(r0, r9)
            m95 r7 = r11.a(r7, r8)
            r0.setSavableRegistryEntry(r7)
        L44:
            b3 r7 = defpackage.a34.a
            r0.e0 = r7
            r0.f0 = r7
            r0.g0 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv6.<init>(android.content.Context, ub2, id2, n95, int, kh4):void");
    }

    public static final void n(sv6 sv6Var) {
        sv6Var.g0.invoke(sv6Var.b0);
        sv6Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(m95 m95Var) {
        m95 m95Var2 = this.d0;
        if (m95Var2 != null) {
            ((st3) m95Var2).L();
        }
        this.d0 = m95Var;
    }

    public final g84 getDispatcher() {
        return this.c0;
    }

    public final ub2 getReleaseBlock() {
        return this.g0;
    }

    public final ub2 getResetBlock() {
        return this.f0;
    }

    public /* bridge */ /* synthetic */ q0 getSubCompositionView() {
        return null;
    }

    public final ub2 getUpdateBlock() {
        return this.e0;
    }

    public final void setReleaseBlock(ub2 ub2Var) {
        this.g0 = ub2Var;
        setRelease(new eg(this, (byte) 3));
    }

    public final void setResetBlock(ub2 ub2Var) {
        this.f0 = ub2Var;
        setReset(new eg(this, (byte) 4));
    }

    public final void setUpdateBlock(ub2 ub2Var) {
        this.e0 = ub2Var;
        setUpdate(new eg(this, (byte) 5));
    }

    public View getViewRoot() {
        return this;
    }
}
