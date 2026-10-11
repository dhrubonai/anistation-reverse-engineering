package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j10 extends t36 implements ic2 {
    public Object A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public byte y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j10(Object obj, Object obj2, Object obj3, Object obj4, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r8 == defpackage.o56.F) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        r8 = r0.A;
        r8.getClass();
        r9 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (r9 == r14) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        r14 = new java.lang.Object();
        defpackage.w65.c0(r14, r9, (int) defpackage.sw0.w(r3.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (defpackage.sw0.w(r3.b) <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        defpackage.db.w0(r14, r3.b.l());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
    
        if (r14.D() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        defpackage.db.w0(r8, r14.l());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
    
        defpackage.ze0.m("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
    
        r14 = (defpackage.su4) r1;
        r14.getClass();
        r13.B = r1;
        r13.z = r7;
        r13.A = r3;
        r13.y = 2;
        r14 = r14.B.b(r13, r3);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        if (r14 != r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x003f, code lost:
    
        if (r14 == r2) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Type inference failed for: r14v13, types: [qq5, java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, n56] */
    /* JADX WARN: Type inference failed for: r9v4, types: [qq5, java.lang.Object, oa0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004d -> B:8:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00f3 -> B:6:0x00f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j10.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006a -> B:9:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.C
            oh6 r0 = (defpackage.oh6) r0
            byte r1 = r8.y
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L32
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r8.B
            v11 r1 = (defpackage.v11) r1
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L1a
            r9 = r1
            goto L39
        L1a:
            r8 = move-exception
            goto L71
        L1c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r4
        L22:
            java.lang.Object r1 = r8.A
            rd5 r1 = (defpackage.rd5) r1
            java.lang.Object r6 = r8.z
            oh6 r6 = (defpackage.oh6) r6
            java.lang.Object r7 = r8.B
            v11 r7 = (defpackage.v11) r7
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L1a
            goto L59
        L32:
            defpackage.m37.N(r9)
            java.lang.Object r9 = r8.B
            v11 r9 = (defpackage.v11) r9
        L39:
            l11 r1 = r9.getCoroutineContext()     // Catch: java.lang.Throwable -> L1a
            boolean r1 = defpackage.h98.B(r1)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L6c
            rd5 r1 = r0.a     // Catch: java.lang.Throwable -> L1a
            za0 r6 = r0.f     // Catch: java.lang.Throwable -> L1a
            r8.B = r9     // Catch: java.lang.Throwable -> L1a
            r8.z = r0     // Catch: java.lang.Throwable -> L1a
            r8.A = r1     // Catch: java.lang.Throwable -> L1a
            r8.y = r3     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r6 = r6.g(r8)     // Catch: java.lang.Throwable -> L1a
            if (r6 != r5) goto L56
            goto L69
        L56:
            r7 = r9
            r9 = r6
            r6 = r0
        L59:
            mh6 r9 = (defpackage.mh6) r9     // Catch: java.lang.Throwable -> L1a
            r8.B = r7     // Catch: java.lang.Throwable -> L1a
            r8.z = r4     // Catch: java.lang.Throwable -> L1a
            r8.A = r4     // Catch: java.lang.Throwable -> L1a
            r8.y = r2     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r9 = r6.c(r1, r9, r8)     // Catch: java.lang.Throwable -> L1a
            if (r9 != r5) goto L6a
        L69:
            return r5
        L6a:
            r9 = r7
            goto L39
        L6c:
            r0.g = r4
            pn6 r8 = defpackage.pn6.a
            return r8
        L71:
            r0.g = r4
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j10.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (defpackage.tl7.V((defpackage.l11) r11, r6, r10) == r7) goto L23;
     */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.B
            int[] r0 = (int[]) r0
            java.lang.Object r1 = r10.A
            ak6 r1 = (defpackage.ak6) r1
            byte r2 = r10.y
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            w11 r7 = defpackage.w11.x
            if (r2 == 0) goto L39
            if (r2 == r6) goto L31
            if (r2 == r5) goto L29
            if (r2 == r4) goto L1e
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            return r3
        L1e:
            defpackage.m37.N(r11)     // Catch: java.lang.Throwable -> L27
            er0 r10 = new er0     // Catch: java.lang.Throwable -> L27
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L27
            throw r10     // Catch: java.lang.Throwable -> L27
        L27:
            r10 = move-exception
            goto L8a
        L29:
            java.lang.Object r2 = r10.z
            x42 r2 = (defpackage.x42) r2
            defpackage.m37.N(r11)
            goto L6f
        L31:
            java.lang.Object r2 = r10.z
            x42 r2 = (defpackage.x42) r2
            defpackage.m37.N(r11)
            goto L5d
        L39:
            defpackage.m37.N(r11)
            java.lang.Object r11 = r10.z
            x42 r11 = (defpackage.x42) r11
            java.lang.Object r2 = r1.h
            kc4 r2 = (defpackage.kc4) r2
            boolean r2 = r2.a(r0)
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.b
            v65 r2 = (defpackage.v65) r2
            r10.z = r11
            r10.y = r6
            r6 = 0
            l11 r2 = defpackage.q23.C(r2, r6, r10)
            if (r2 != r7) goto L5a
            goto L6e
        L5a:
            r9 = r2
            r2 = r11
            r11 = r9
        L5d:
            l11 r11 = (defpackage.l11) r11
            fd6 r6 = new fd6
            r6.<init>(r1, r3, r5)
            r10.z = r2
            r10.y = r5
            java.lang.Object r11 = defpackage.tl7.V(r11, r6, r10)
            if (r11 != r7) goto L6f
        L6e:
            return r7
        L6f:
            r11 = r2
        L70:
            w05 r2 = new w05     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r1.i     // Catch: java.lang.Throwable -> L27
            sn3 r5 = (defpackage.sn3) r5     // Catch: java.lang.Throwable -> L27
            vj0 r6 = new vj0     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = r10.C     // Catch: java.lang.Throwable -> L27
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: java.lang.Throwable -> L27
            r6.<init>(r2, r11, r8, r0)     // Catch: java.lang.Throwable -> L27
            r10.z = r3     // Catch: java.lang.Throwable -> L27
            r10.y = r4     // Catch: java.lang.Throwable -> L27
            r5.F(r6, r10)     // Catch: java.lang.Throwable -> L27
            return r7
        L8a:
            java.lang.Object r11 = r1.h
            kc4 r11 = (defpackage.kc4) r11
            r11.b(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j10.l(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.C;
        switch (b) {
            case 0:
                return new j10((m10) this.B, (Uri) obj2, vz0Var, (byte) 0);
            case 1:
                j10 j10Var = new j10((ho1) obj2, vz0Var, (byte) 1);
                j10Var.B = obj;
                return j10Var;
            case 2:
                return new j10((vn5) this.z, (w42) this.A, (t44) this.B, this.C, vz0Var, (byte) 2);
            case 3:
                j10 j10Var2 = new j10((w44) this.B, (ry2) obj2, vz0Var, (byte) 3);
                j10Var2.A = obj;
                return j10Var2;
            case 4:
                j10 j10Var3 = new j10((sf5) this.A, (wp5) this.B, (xi6) obj2, vz0Var, (byte) 4);
                j10Var3.z = obj;
                return j10Var3;
            case 5:
                return new j10((bn4) this.B, (ic2) obj2, vz0Var, (byte) 5);
            case 6:
                return new j10((m54) this.B, (an) obj2, vz0Var, (byte) 6);
            case 7:
                j10 j10Var4 = new j10((ub2) this.A, (AtomicReference) this.B, (ic2) obj2, vz0Var, (byte) 7);
                j10Var4.z = obj;
                return j10Var4;
            case 8:
                j10 j10Var5 = new j10((g56) obj2, vz0Var, (byte) 8);
                j10Var5.B = obj;
                return j10Var5;
            case 9:
                j10 j10Var6 = new j10((g56) this.B, (ae0) obj2, vz0Var, (byte) 9);
                j10Var6.A = obj;
                return j10Var6;
            case 10:
                j10 j10Var7 = new j10((oh6) obj2, vz0Var, (byte) 10);
                j10Var7.B = obj;
                return j10Var7;
            case 11:
                j10 j10Var8 = new j10((ak6) this.A, (int[]) this.B, (String[]) obj2, vz0Var, (byte) 11);
                j10Var8.z = obj;
                return j10Var8;
            default:
                return new j10((pi3) this.z, (z77) this.A, (h77) this.B, (Context) obj2, vz0Var, (byte) 12);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((j10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((j10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((j10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                ((j10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            case 4:
                return ((j10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((j10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                return ((j10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((j10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((j10) create((tu4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                return ((j10) create((k5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((j10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                ((j10) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            default:
                return ((j10) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0221, code lost:
    
        if (defpackage.db.K(r2, r59) == r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0272, code lost:
    
        if (r2.a(r59) == r11) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0480, code lost:
    
        if (defpackage.sw0.q(r2, r3, r59) == r11) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r2 == r11) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0566, code lost:
    
        if (r9.e1(r3, r59) != r11) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x058e, code lost:
    
        if (r9.l1(r59) == r11) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x059b, code lost:
    
        if (r9.l1(r59) != r11) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0b5e, code lost:
    
        if (r3 == r14) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0b3d, code lost:
    
        if (r0.e(r3, r59) != r14) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0b17, code lost:
    
        if (r1.a(r3, r59) == r14) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0b04, code lost:
    
        if (r1.c(r3, r59) == r14) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fc, code lost:
    
        if (r2 == r11) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x07ab, code lost:
    
        defpackage.ze0.k("The backup contains an invalid anime ID");
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x08a4, code lost:
    
        defpackage.ze0.k("The backup contains invalid anime progress");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (defpackage.w65.b0((defpackage.ae0) r9, r5, r59) == r11) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0af1, code lost:
    
        if (defpackage.w65.Y(r59, new defpackage.a41(1, r6, r3, r1), r1) == r14) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:242:0x04bc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:297:0x05ab. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:269:0x0580, B:266:0x056f], limit reached: 555 */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [w42, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v46, types: [t44, x42, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [t05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v60, types: [k54] */
    /* JADX WARN: Type inference failed for: r1v65, types: [k54] */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r3v60, types: [t36, ic2] */
    /* JADX WARN: Type inference failed for: r5v62, types: [t36, ic2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x040c -> B:170:0x03db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x0428 -> B:170:0x03db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:235:0x057b -> B:215:0x0514). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x0582 -> B:215:0x0514). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:240:0x058e -> B:215:0x0514). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:244:0x059b -> B:214:0x0513). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x059f -> B:215:0x0514). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0134 -> B:33:0x00f2). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r60) {
        /*
            Method dump skipped, instructions count: 3122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j10.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j10(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.B = obj;
        this.C = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j10(Object obj, Object obj2, Object obj3, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j10(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.C = obj;
    }
}
