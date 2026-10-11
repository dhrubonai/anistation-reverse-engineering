package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ie0 extends dq2 {
    public final je0 B;
    public final Set C = ms.U0(new eq2[]{rs2.a, j37.a, l37.a, n85.a, co6.a});
    public final lv0 D = new lv0();
    public final dn0 E;
    public final l11 F;
    public final l11 G;

    public ie0(je0 je0Var) {
        this.B = je0Var;
        n11 n11Var = (n11) this.x.getValue();
        n11Var.getClass();
        p5 p5Var = new p5(n11Var);
        this.E = new dn0(p5Var, je0Var.c);
        if (System.getProperty("kotlinx.io.pool.size.bytes") == null && a34.i(System.getProperty("java.vm.name"), "Dalvik") && Runtime.getRuntime().maxMemory() > 10000000) {
            System.setProperty("kotlinx.io.pool.size.bytes", "2097152");
        }
        l11 coroutineContext = super.getCoroutineContext();
        h95 h95Var = h95.F;
        j11 j11Var = coroutineContext.get(h95Var);
        j11Var.getClass();
        l11 L = tl7.L(new j43((h43) j11Var), new c21(o11.x, (byte) 0));
        this.F = L;
        this.G = coroutineContext.plus(L);
        j11 j11Var2 = L.get(h95Var);
        j11Var2.getClass();
        tl7.y(jf2.x, coroutineContext, y11.z, new c0((h43) j11Var2, p5Var, null, (byte) 15));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:49:0x0165
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.dq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ls0 r17, defpackage.xz0 r18) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie0.a(ls0, xz0):java.lang.Object");
    }

    @Override // defpackage.dq2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        Iterator it = this.D.entrySet().iterator();
        while (it.hasNext()) {
            ((iu1) ((Map.Entry) it.next()).getValue()).close();
        }
        j11 j11Var = this.F.get(h95.F);
        j11Var.getClass();
        ((j43) ((ar0) j11Var)).g0();
    }

    @Override // defpackage.dq2, defpackage.v11
    public final l11 getCoroutineContext() {
        return this.G;
    }

    @Override // defpackage.dq2
    public final je0 p() {
        return this.B;
    }
}
