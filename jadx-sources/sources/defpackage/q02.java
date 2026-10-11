package defpackage;

import android.view.textclassifier.TextClassifier;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q02 extends t36 implements ic2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q02(bn4 bn4Var, CharSequence charSequence, long j, cc6 cc6Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 3;
        this.A = bn4Var;
        this.B = charSequence;
        this.z = j;
        this.C = cc6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.C;
        Object obj3 = this.B;
        switch (b) {
            case 0:
                return new q02(obj3, obj2, this.z, vz0Var, (byte) 0);
            case 1:
                q02 q02Var = new q02(obj3, obj2, this.z, vz0Var, (byte) 1);
                q02Var.A = obj;
                return q02Var;
            case 2:
                q02 q02Var2 = new q02((rd5) obj3, this.z, (t05) obj2, vz0Var);
                q02Var2.A = obj;
                return q02Var2;
            default:
                return new q02((bn4) this.A, (CharSequence) obj3, this.z, (cc6) obj2, vz0Var);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((q02) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((q02) create((TextClassifier) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((q02) create((pd5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((q02) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q02.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q02(rd5 rd5Var, long j, t05 t05Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 2;
        this.B = rd5Var;
        this.z = j;
        this.C = t05Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q02(Object obj, Object obj2, long j, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.B = obj;
        this.C = obj2;
        this.z = j;
    }
}
