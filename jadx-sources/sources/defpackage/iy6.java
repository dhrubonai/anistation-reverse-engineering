package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class iy6 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public int C;
    public final /* synthetic */ byte x;
    public byte y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy6(ny6 ny6Var, String str, int i, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = ny6Var;
        this.B = str;
        this.C = i;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.B;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                iy6 iy6Var = new iy6((ny6) obj3, (String) obj2, this.C, vz0Var, (byte) 0);
                iy6Var.z = obj;
                return iy6Var;
            case 1:
                iy6 iy6Var2 = new iy6((ny6) obj3, (String) obj2, this.C, vz0Var, (byte) 1);
                iy6Var2.z = obj;
                return iy6Var2;
            default:
                iy6 iy6Var3 = new iy6((wc0) obj3, (g56) obj2, vz0Var);
                iy6Var3.z = obj;
                return iy6Var3;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((iy6) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((iy6) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((iy6) create((tu4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[Catch: all -> 0x0029, fo0 -> 0x0132, TryCatch #1 {all -> 0x0029, blocks: (B:9:0x0024, B:11:0x003c, B:17:0x0050, B:19:0x0054, B:20:0x0060, B:23:0x006c, B:27:0x0087, B:30:0x0096, B:33:0x00a1, B:34:0x00a9, B:37:0x00b6, B:40:0x00c7, B:44:0x00d0, B:45:0x00bf, B:49:0x00fa, B:52:0x0103, B:53:0x011e, B:54:0x011f, B:55:0x0126, B:59:0x0034), top: B:4:0x001c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:10:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0100 -> B:11:0x003c). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy6(wc0 wc0Var, g56 g56Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 2;
        this.A = wc0Var;
        this.B = g56Var;
    }
}
