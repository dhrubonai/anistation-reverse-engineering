package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k51 extends t36 implements ic2 {
    public /* synthetic */ Object A;
    public int B;
    public Object C;
    public final /* synthetic */ byte x;
    public byte y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k51(p51 p51Var, int i, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = p51Var;
        this.B = i;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                k51 k51Var = new k51((p51) this.A, this.B, vz0Var, (byte) 0);
                k51Var.z = ((Boolean) obj).booleanValue();
                return k51Var;
            case 1:
                k51 k51Var2 = new k51((p51) this.A, this.B, vz0Var, (byte) 1);
                k51Var2.z = ((Boolean) obj).booleanValue();
                return k51Var2;
            default:
                k51 k51Var3 = new k51(2, vz0Var);
                k51Var3.A = obj;
                return k51Var3;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((k51) create(bool, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((k51) create(bool2, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((k51) create((f91) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(1:(1:(8:7|8|9|10|11|(2:21|(1:(1:29)(1:28))(1:24))(1:14)|15|(2:17|18)(1:20))(2:33|34))(1:35))(4:44|(2:46|(1:48))(2:51|(2:53|(2:55|(1:58)(1:57))))|49|50)|36|37|38|(1:41)(10:40|10|11|(0)|21|(0)|(1:26)|29|15|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018e  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k51.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k51(int i, vz0 vz0Var) {
        super(i, vz0Var);
        this.x = (byte) 2;
    }
}
