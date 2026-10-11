package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class oe0 extends t36 implements ic2 {
    public bg A;
    public boolean B;
    public byte C;
    public /* synthetic */ Object D;
    public final /* synthetic */ lu5 E;
    public final /* synthetic */ mu5 F;
    public final /* synthetic */ nc0 G;
    public final /* synthetic */ p5 H;
    public final /* synthetic */ WritableByteChannel I;
    public pf6 x;
    public u05 y;
    public nc0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe0(lu5 lu5Var, mu5 mu5Var, nc0 nc0Var, p5 p5Var, WritableByteChannel writableByteChannel, vz0 vz0Var) {
        super(2, vz0Var);
        this.E = lu5Var;
        this.F = mu5Var;
        this.G = nc0Var;
        this.H = p5Var;
        this.I = writableByteChannel;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        oe0 oe0Var = new oe0(this.E, this.F, this.G, this.H, this.I, vz0Var);
        oe0Var.D = obj;
        return oe0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((oe0) create((ry4) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        if (r2.k0(r9, r1, r17) == r12) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:9:0x0022, B:12:0x008e, B:14:0x0094, B:16:0x009a, B:24:0x00ad, B:28:0x00d1, B:30:0x00d9, B:31:0x00e3, B:33:0x00e7, B:35:0x0101, B:36:0x0128, B:39:0x012b, B:41:0x012f, B:57:0x0038, B:59:0x0045, B:62:0x0059, B:67:0x0073, B:69:0x007e), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:9:0x0022, B:12:0x008e, B:14:0x0094, B:16:0x009a, B:24:0x00ad, B:28:0x00d1, B:30:0x00d9, B:31:0x00e3, B:33:0x00e7, B:35:0x0101, B:36:0x0128, B:39:0x012b, B:41:0x012f, B:57:0x0038, B:59:0x0045, B:62:0x0059, B:67:0x0073, B:69:0x007e), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:9:0x0022, B:12:0x008e, B:14:0x0094, B:16:0x009a, B:24:0x00ad, B:28:0x00d1, B:30:0x00d9, B:31:0x00e3, B:33:0x00e7, B:35:0x0101, B:36:0x0128, B:39:0x012b, B:41:0x012f, B:57:0x0038, B:59:0x0045, B:62:0x0059, B:67:0x0073, B:69:0x007e), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:9:0x0022, B:12:0x008e, B:14:0x0094, B:16:0x009a, B:24:0x00ad, B:28:0x00d1, B:30:0x00d9, B:31:0x00e3, B:33:0x00e7, B:35:0x0101, B:36:0x0128, B:39:0x012b, B:41:0x012f, B:57:0x0038, B:59:0x0045, B:62:0x0059, B:67:0x0073, B:69:0x007e), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, u05] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00e5 -> B:11:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00fe -> B:11:0x008e). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
