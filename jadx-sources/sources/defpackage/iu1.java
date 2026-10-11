package defpackage;

import java.io.Closeable;
import java.net.Proxy;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class iu1 implements v11, Closeable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater I = AtomicIntegerFieldUpdater.newUpdater(iu1.class, "connections");
    public final boolean A;
    public final je0 B;
    public final dn0 C;
    public final l11 D;
    public final n E;
    public final za0 F;
    public final short G;
    public final bx5 H;
    private volatile /* synthetic */ int connections;
    volatile /* synthetic */ long lastActivity;
    public final String x;
    public final int y;
    public final Proxy z;

    public iu1(String str, int i, Proxy proxy, boolean z, je0 je0Var, dn0 dn0Var, l11 l11Var, n nVar) {
        str.getClass();
        je0Var.getClass();
        dn0Var.getClass();
        l11Var.getClass();
        this.x = str;
        this.y = i;
        this.z = proxy;
        this.A = z;
        this.B = je0Var;
        this.C = dn0Var;
        this.D = l11Var;
        this.E = nVar;
        int[] iArr = s51.a;
        this.lastActivity = System.currentTimeMillis();
        this.connections = 0;
        this.F = iv.d(0, 7, null);
        this.G = (short) 10000;
        this.H = tl7.z(this, l11Var.plus(new r11("cio-endpoint-timeout")), null, new hu1(this, null, (byte) 0), 2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(2:152|(1:(1:(7:(1:(6:158|159|160|161|63|64)(2:165|166))(12:167|168|169|170|79|(3:53|(1:55)(1:69)|(1:57)(2:67|68))(1:70)|(1:59)(1:66)|60|61|(1:65)|63|64)|85|86|87|(1:89)|90|91)(6:174|175|176|127|128|(4:130|131|21|(10:23|(2:136|137)(1:25)|26|27|28|29|30|(2:32|(8:37|38|39|40|41|42|43|(2:45|46)(3:47|(5:103|104|(1:106)(1:114)|107|(2:109|(1:111)(1:112))(1:113))(1:49)|(7:71|72|73|74|75|76|(1:80)(9:78|79|(0)(0)|(0)(0)|60|61|(0)|63|64))(8:51|(0)(0)|(0)(0)|60|61|(0)|63|64))))(2:123|(1:125)(4:126|127|128|(7:132|39|40|41|42|43|(0)(0))(0)))|34|35)(2:141|(4:143|(1:149)|147|148)(2:150|151)))(0)))(10:177|178|179|38|39|40|41|42|43|(0)(0)))(3:180|181|(1:183)(2:184|185)))(3:9|(5:11|(1:13)(1:18)|14|(1:16)|17)|19)|20|21|(0)(0)))|189|6|7|(0)(0)|20|21|(0)(0)|(2:(1:92)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x036f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022c A[Catch: all -> 0x01fd, TRY_LEAVE, TryCatch #11 {all -> 0x01fd, blocks: (B:87:0x037b, B:89:0x0391, B:90:0x0394, B:91:0x039b, B:128:0x0228, B:130:0x022c, B:30:0x01be, B:32:0x01c5, B:38:0x01ec, B:123:0x0202), top: B:127:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0267 A[Catch: all -> 0x036f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x036f, blocks: (B:63:0x034e, B:61:0x0322, B:45:0x0267), top: B:7:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ed A[Catch: all -> 0x02ff, TRY_ENTER, TryCatch #12 {all -> 0x02ff, blocks: (B:53:0x02ed, B:66:0x0318, B:67:0x02f7, B:68:0x02fe, B:70:0x0301, B:104:0x0271, B:111:0x028d, B:113:0x0292, B:114:0x027f), top: B:103:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0318 A[Catch: all -> 0x02ff, TRY_LEAVE, TryCatch #12 {all -> 0x02ff, blocks: (B:53:0x02ed, B:66:0x0318, B:67:0x02f7, B:68:0x02fe, B:70:0x0301, B:104:0x0271, B:111:0x028d, B:113:0x0292, B:114:0x027f), top: B:103:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0301 A[Catch: all -> 0x02ff, TryCatch #12 {all -> 0x02ff, blocks: (B:53:0x02ed, B:66:0x0318, B:67:0x02f7, B:68:0x02fe, B:70:0x0301, B:104:0x0271, B:111:0x028d, B:113:0x0292, B:114:0x027f), top: B:103:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0391 A[Catch: all -> 0x01fd, TryCatch #11 {all -> 0x01fd, blocks: (B:87:0x037b, B:89:0x0391, B:90:0x0394, B:91:0x039b, B:128:0x0228, B:130:0x022c, B:30:0x01be, B:32:0x01c5, B:38:0x01ec, B:123:0x0202), top: B:127:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0126  */
    /* JADX WARN: Type inference failed for: r2v10, types: [ny2] */
    /* JADX WARN: Type inference failed for: r2v17, types: [ny2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [du1] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v10, types: [gu5] */
    /* JADX WARN: Type inference failed for: r3v15, types: [d, e, gu5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0231 -> B:21:0x0190). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(defpackage.ls0 r29, defpackage.xz0 r30) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu1.a(ls0, xz0):java.io.Serializable");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.H.l(null);
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ls0 r7, defpackage.l11 r8, defpackage.xz0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.eu1
            if (r0 == 0) goto L13
            r0 = r9
            eu1 r0 = (defpackage.eu1) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            eu1 r0 = new eu1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.x
            w11 r1 = defpackage.w11.x
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L3b
            r6 = 2
            r7 = 0
            r8 = 3
            if (r2 == r6) goto L34
            if (r2 != r8) goto L2e
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L3a
            return r9
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r7
        L34:
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L3a
            r0.z = r8     // Catch: java.lang.Throwable -> L3a
            throw r7     // Catch: java.lang.Throwable -> L3a
        L3a:
            throw r7
        L3b:
            defpackage.m37.N(r9)
            return r9
        L3f:
            defpackage.m37.N(r9)
            int[] r9 = defpackage.s51.a
            long r4 = java.lang.System.currentTimeMillis()
            r6.lastActivity = r4
            je0 r9 = r6.B
            r9.getClass()
            r0.z = r3
            java.lang.Object r6 = r6.p(r7, r8, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu1.l(ls0, l11, xz0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:1|(2:3|(29:5|6|7|8|(5:(1:(1:(1:(4:14|15|16|17)(2:19|20))(15:21|22|23|24|25|26|27|28|29|30|31|32|(3:34|16|17)|35|36))(4:69|70|71|72))(4:73|74|75|76)|40|(2:(1:42)(1:56)|(1:44)(1:45))|46|(4:48|(1:54)|52|53)(1:55))(4:140|141|(1:143)|36)|77|78|79|80|81|82|83|84|(12:89|90|(1:131)(1:93)|94|(1:130)(5:98|99|100|101|102)|103|(1:105)(1:128)|106|(1:127)(1:110)|(6:112|113|114|115|116|(3:118|71|72))(7:119|120|121|122|123|124|(10:126|25|26|27|28|29|30|31|32|(0)))|35|36)|132|90|(0)|131|94|(1:96)|130|103|(0)(0)|106|(1:108)|127|(0)(0)|35|36))|146|6|7|8|(0)(0)|77|78|79|80|81|82|83|84|(16:86|89|90|(0)|131|94|(0)|130|103|(0)(0)|106|(0)|127|(0)(0)|35|36)|132|90|(0)|131|94|(0)|130|103|(0)(0)|106|(0)|127|(0)(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0174, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x021e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x021f, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0040, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0041, code lost:
    
        r3 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0222, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0223, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016f A[Catch: all -> 0x0174, TryCatch #3 {all -> 0x0174, blocks: (B:84:0x00ef, B:86:0x0102, B:90:0x010e, B:93:0x011b, B:98:0x012f, B:102:0x0143, B:103:0x0154, B:106:0x015f, B:108:0x016f, B:112:0x017a, B:116:0x01a1, B:120:0x01b3, B:124:0x01d5), top: B:83:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017a A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #3 {all -> 0x0174, blocks: (B:84:0x00ef, B:86:0x0102, B:90:0x010e, B:93:0x011b, B:98:0x012f, B:102:0x0143, B:103:0x0154, B:106:0x015f, B:108:0x016f, B:112:0x017a, B:116:0x01a1, B:120:0x01b3, B:124:0x01d5), top: B:83:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0233 A[LOOP:0: B:41:0x0229->B:44:0x0233, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0238 A[EDGE_INSN: B:45:0x0238->B:46:0x0238 BREAK  A[LOOP:0: B:41:0x0229->B:44:0x0233], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.ls0 r29, defpackage.l11 r30, defpackage.xz0 r31) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu1.p(ls0, l11, xz0):java.lang.Object");
    }
}
