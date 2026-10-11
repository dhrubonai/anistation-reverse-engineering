package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ji extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return new ji((w44) obj2, vz0Var, (byte) 0);
            case 1:
                return new ji((ng6) obj2, vz0Var, (byte) 1);
            case 2:
                return new ji((z77) obj2, vz0Var, (byte) 2);
            case 3:
                return new ji((hh1) obj2, vz0Var, (byte) 3);
            case 4:
                return new ji((fl1) obj2, vz0Var, (byte) 4);
            case 5:
                return new ji((i33) obj2, vz0Var, (byte) 5);
            case 6:
                return new ji((bn4) obj2, vz0Var, (byte) 6);
            case 7:
                return new ji((w72) obj2, vz0Var, (byte) 7);
            case 8:
                return new ji((x3) obj2, vz0Var, (byte) 8);
            case 9:
                return new ji((sb2) obj2, vz0Var, (byte) 9);
            default:
                return new ji((ow6) obj2, vz0Var, (byte) 10);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((ji) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((ji) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 2:
                ((ji) create((xx0) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 3:
                return ((ji) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                ((ji) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 5:
                ((ji) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 6:
                return ((ji) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                ((ji) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 8:
                ((ji) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 9:
                ((ji) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((ji) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pq5, java.lang.Object] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
