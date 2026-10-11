package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class od5 extends t36 implements ic2 {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ rd5 C;
    public final /* synthetic */ v05 D;
    public final /* synthetic */ long E;
    public rd5 x;
    public v05 y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od5(rd5 rd5Var, v05 v05Var, long j, vz0 vz0Var) {
        super(2, vz0Var);
        this.C = rd5Var;
        this.D = v05Var;
        this.E = j;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        od5 od5Var = new od5(this.C, this.D, this.E, vz0Var);
        od5Var.B = obj;
        return od5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((od5) create((pd5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        rd5 rd5Var;
        float c;
        v05 v05Var;
        rd5 rd5Var2;
        long j;
        long a;
        boolean z = this.A;
        byte b = 2;
        rg4 rg4Var = rg4.y;
        if (z) {
            if (z) {
                j = this.z;
                v05Var = this.y;
                rd5Var = this.x;
                rd5Var2 = (rd5) this.B;
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            pd5 pd5Var = (pd5) this.B;
            rd5Var = this.C;
            o8 o8Var = new o8(rd5Var, pd5Var, b);
            i42 i42Var = rd5Var.c;
            v05 v05Var2 = this.D;
            long j2 = v05Var2.x;
            rg4 rg4Var2 = rd5Var.d;
            long j3 = this.E;
            if (rg4Var2 == rg4Var) {
                c = ur6.b(j3);
            } else {
                c = ur6.c(j3);
            }
            float e = rd5Var.e(c);
            this.B = rd5Var;
            this.x = rd5Var;
            this.y = v05Var2;
            this.z = j2;
            this.A = true;
            obj = i42Var.a(o8Var, e, this);
            w11 w11Var = w11.x;
            if (obj == w11Var) {
                return w11Var;
            }
            v05Var = v05Var2;
            rd5Var2 = rd5Var;
            j = j2;
        }
        float e2 = rd5Var2.e(((Number) obj).floatValue());
        if (rd5Var.d == rg4Var) {
            a = ur6.a(j, e2, 0.0f, 2);
        } else {
            a = ur6.a(j, 0.0f, e2, 1);
        }
        v05Var.x = a;
        return pn6.a;
    }
}
