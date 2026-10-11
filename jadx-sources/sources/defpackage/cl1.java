package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cl1 extends t36 implements ic2 {
    public Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x = 0;
    public byte y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl1(xm6 xm6Var, hm5 hm5Var, String str, tg5 tg5Var, tg5 tg5Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = xm6Var;
        this.A = hm5Var;
        this.B = str;
        this.C = tg5Var;
        this.D = tg5Var2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.D;
        switch (b) {
            case 0:
                return new cl1((List) obj2, (fl1) this.A, vz0Var);
            case 1:
                return new cl1((sf5) this.B, this.C, (xi6) obj2, vz0Var);
            case 2:
                return new cl1((xm6) this.z, (hm5) this.A, (String) this.B, (tg5) this.C, (tg5) obj2, vz0Var);
            default:
                cl1 cl1Var = new cl1((sb2) obj2, vz0Var);
                cl1Var.C = obj;
                return cl1Var;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((cl1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((cl1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((cl1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                ((cl1) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11.x;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x004b, B:14:0x0090, B:16:0x007f, B:20:0x009a, B:26:0x0031, B:28:0x006a), top: B:4:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v38, types: [qt0] */
    /* JADX WARN: Type inference failed for: r2v38, types: [lj0] */
    /* JADX WARN: Type inference failed for: r2v42, types: [lj0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v5, types: [rs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r3v2, types: [rs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [fq3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0098 -> B:16:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:218:0x06b6 -> B:190:0x06b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ab -> B:16:0x007f). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r52) {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl1(sf5 sf5Var, Object obj, xi6 xi6Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = sf5Var;
        this.C = obj;
        this.D = xi6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl1(sb2 sb2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.D = sb2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl1(List list, fl1 fl1Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.D = list;
        this.A = fl1Var;
    }
}
