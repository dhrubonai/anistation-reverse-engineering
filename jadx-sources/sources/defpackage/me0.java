package defpackage;

import java.nio.channels.ReadableByteChannel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class me0 extends t36 implements ic2 {
    public ReadableByteChannel A;
    public rg5 B;
    public p5 C;
    public int D;
    public int E;
    public int F;
    public byte G;
    public /* synthetic */ Object H;
    public final /* synthetic */ lu5 I;
    public final /* synthetic */ mu5 J;
    public final /* synthetic */ nc0 K;
    public final /* synthetic */ ReadableByteChannel L;
    public final /* synthetic */ p5 M;
    public pf6 x;
    public pf6 y;
    public nc0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me0(lu5 lu5Var, mu5 mu5Var, nc0 nc0Var, ReadableByteChannel readableByteChannel, p5 p5Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.I = lu5Var;
        this.J = mu5Var;
        this.K = nc0Var;
        this.L = readableByteChannel;
        this.M = p5Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        me0 me0Var = new me0(this.I, this.J, this.K, this.L, this.M, vz0Var);
        me0Var.H = obj;
        return me0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((me0) create((l97) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0014. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0130 A[Catch: all -> 0x00ba, TryCatch #3 {all -> 0x00ba, blocks: (B:14:0x02b7, B:16:0x012a, B:18:0x0130, B:20:0x0134, B:25:0x0159, B:27:0x0162, B:30:0x0169, B:34:0x018e, B:39:0x01b8, B:42:0x01d7, B:47:0x01e6, B:73:0x02c3, B:75:0x02c7, B:76:0x02cb, B:78:0x02d1, B:90:0x02ec, B:94:0x02bd, B:95:0x02c0, B:109:0x00b3, B:112:0x00cd, B:114:0x00e3, B:116:0x00f6, B:119:0x0105, B:122:0x010e, B:124:0x0119), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0162 A[Catch: all -> 0x00ba, TryCatch #3 {all -> 0x00ba, blocks: (B:14:0x02b7, B:16:0x012a, B:18:0x0130, B:20:0x0134, B:25:0x0159, B:27:0x0162, B:30:0x0169, B:34:0x018e, B:39:0x01b8, B:42:0x01d7, B:47:0x01e6, B:73:0x02c3, B:75:0x02c7, B:76:0x02cb, B:78:0x02d1, B:90:0x02ec, B:94:0x02bd, B:95:0x02c0, B:109:0x00b3, B:112:0x00cd, B:114:0x00e3, B:116:0x00f6, B:119:0x0105, B:122:0x010e, B:124:0x0119), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0218 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:9:0x002f, B:49:0x01ea, B:53:0x020f, B:55:0x0218, B:57:0x021f, B:62:0x0249), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b4  */
    /* JADX WARN: Type inference failed for: r5v6, types: [rg5] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01df -> B:15:0x01e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01e1 -> B:34:0x018e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0218 -> B:14:0x02b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x021d -> B:14:0x02b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x02a1 -> B:11:0x02aa). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
