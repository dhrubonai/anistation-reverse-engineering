package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k41 extends t36 implements ic2 {
    public /* synthetic */ Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ byte x;
    public Object y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k41(String str, String str2, String str3, hm5 hm5Var, lb5 lb5Var, ez3 ez3Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 3;
        this.B = str;
        this.C = str2;
        this.y = str3;
        this.A = hm5Var;
        this.D = lb5Var;
        this.E = ez3Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.E;
        Object obj3 = this.D;
        switch (b) {
            case 0:
                k41 k41Var = new k41((List) obj3, (ArrayList) obj2, vz0Var, (byte) 0);
                k41Var.A = obj;
                return k41Var;
            case 1:
                k41 k41Var2 = new k41((j54) obj3, (ub2) obj2, vz0Var, (byte) 1);
                k41Var2.A = obj;
                return k41Var2;
            case 2:
                k41 k41Var3 = new k41((w05) this.C, (z84) this.A, (w05) obj3, (e94) obj2, vz0Var);
                k41Var3.y = obj;
                return k41Var3;
            default:
                return new k41((String) this.B, (String) this.C, (String) this.y, (hm5) this.A, (lb5) obj3, (ez3) obj2, vz0Var);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((k41) create(obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((k41) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((k41) create((h94) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((k41) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cc  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [vz0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x033b -> B:114:0x0318). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0353 -> B:114:0x0318). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k41.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k41(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.D = obj;
        this.E = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k41(w05 w05Var, z84 z84Var, w05 w05Var2, e94 e94Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 2;
        this.C = w05Var;
        this.A = z84Var;
        this.D = w05Var2;
        this.E = e94Var;
    }
}
