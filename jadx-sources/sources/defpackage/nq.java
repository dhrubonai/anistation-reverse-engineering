package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nq extends t36 implements ic2 {
    public wc0 A;
    public Closeable B;
    public ub2 C;
    public FileOutputStream D;
    public byte[] E;
    public long F;
    public byte G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Context I;
    public final /* synthetic */ String J;
    public final /* synthetic */ b0 K;
    public File x;
    public File y;
    public v05 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq(Context context, String str, b0 b0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.I = context;
        this.J = str;
        this.K = b0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        nq nqVar = new nq(this.I, this.J, this.K, vz0Var);
        nqVar.H = obj;
        return nqVar;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((nq) create((f91) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e3, code lost:
    
        if (r4 == r10) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c1 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:7:0x0029, B:9:0x00e6, B:11:0x00ee, B:13:0x0102, B:15:0x00bb, B:17:0x00c1, B:55:0x00b2), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0139 A[Catch: all -> 0x013e, LOOP:0: B:24:0x0132->B:26:0x0139, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x013e, blocks: (B:23:0x0130, B:24:0x0132, B:26:0x0139), top: B:22:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0141 A[EDGE_INSN: B:27:0x0141->B:28:0x0141 BREAK  A[LOOP:0: B:24:0x0132->B:26:0x0139], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, v05] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e3 -> B:9:0x00e6). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
