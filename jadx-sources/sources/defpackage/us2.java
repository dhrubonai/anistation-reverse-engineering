package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class us2 extends t36 implements jc2 {
    public final /* synthetic */ Long A;
    public final /* synthetic */ Long B;
    public final /* synthetic */ Long C;
    public boolean x;
    public /* synthetic */ ji5 y;
    public /* synthetic */ or2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us2(Long l, Long l2, Long l3, vz0 vz0Var) {
        super(3, vz0Var);
        this.A = l;
        this.B = l2;
        this.C = l3;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Long l = this.B;
        Long l2 = this.C;
        us2 us2Var = new us2(this.A, l, l2, (vz0) obj3);
        us2Var.y = (ji5) obj;
        us2Var.z = (or2) obj2;
        return us2Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        Long l;
        ji5 ji5Var = this.y;
        or2 or2Var = this.z;
        boolean z2 = this.x;
        if (z2) {
            if (z2) {
                m37.N(obj);
                return obj;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m37.N(obj);
        yk3 yk3Var = vs2.a;
        hm6 hm6Var = or2Var.a;
        mv0 mv0Var = or2Var.f;
        jm6 d = hm6Var.d();
        d.getClass();
        String str = d.x;
        if (!str.equals("ws") && !str.equals("wss")) {
            z = false;
        } else {
            z = true;
        }
        ou ouVar = fq2.a;
        Map map = (Map) mv0Var.d(ouVar);
        vz0 vz0Var = null;
        rs2 rs2Var = rs2.a;
        if (map != null) {
            obj2 = map.get(rs2Var);
        } else {
            obj2 = null;
        }
        ss2 ss2Var = (ss2) obj2;
        Long l2 = this.C;
        Long l3 = this.B;
        Long l4 = this.A;
        if (ss2Var == null && ((!z && l4 != null) || l3 != null || l2 != null)) {
            ss2Var = new ss2();
            ((Map) mv0Var.a(ouVar, new co2((byte) 5))).put(rs2Var, ss2Var);
        }
        if (ss2Var != null) {
            Long l5 = ss2Var.b;
            if (l5 != null) {
                l3 = l5;
            }
            ss2.a(l3);
            ss2Var.b = l3;
            Long l6 = ss2Var.c;
            if (l6 != null) {
                l2 = l6;
            }
            ss2.a(l2);
            ss2Var.c = l2;
            if (!z) {
                Long l7 = ss2Var.a;
                if (l7 == null) {
                    l = l4;
                } else {
                    l = l7;
                }
                ss2.a(l);
                ss2Var.a = l;
                if (l != null && l.longValue() != Long.MAX_VALUE) {
                    or2Var.e.l0(new om0(tl7.z(ji5Var, new r11("request-timeout"), null, new e0((Object) l, (Object) or2Var, (Object) or2Var.e, vz0Var, (byte) 22), 2), (byte) 2));
                }
            }
        }
        this.y = null;
        this.z = null;
        this.x = true;
        Object a = ji5Var.x.a(or2Var, this);
        w11 w11Var = w11.x;
        if (a == w11Var) {
            return w11Var;
        }
        return a;
    }
}
