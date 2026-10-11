package z6;

import androidx.lifecycle.q0;
import h7.p;
import r6.h0;
import t7.b0;

/* loaded from: classes.dex */
public final class c extends i7.h implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final c f12069b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f12070c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f12071d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f12072e = new c(3);

    /* renamed from: f, reason: collision with root package name */
    public static final c f12073f = new c(4);

    /* renamed from: x, reason: collision with root package name */
    public static final c f12074x = new c(5);

    /* renamed from: y, reason: collision with root package name */
    public static final c f12075y = new c(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12076a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(2);
        this.f12076a = i10;
    }

    public final i b(g gVar, i iVar) {
        d dVar;
        switch (this.f12076a) {
            case 1:
                h0.u(iVar, "acc");
                h0.u(gVar, "element");
                i v9 = iVar.v(gVar.getKey());
                j jVar = j.f12080a;
                if (v9 != jVar) {
                    q0 q0Var = q0.A;
                    f fVar = (f) v9.r(q0Var);
                    if (fVar == null) {
                        dVar = new d(gVar, v9);
                    } else {
                        i v10 = v9.v(q0Var);
                        if (v10 == jVar) {
                            return new d(fVar, gVar);
                        }
                        dVar = new d(fVar, new d(gVar, v10));
                    }
                    return dVar;
                }
                return gVar;
            default:
                return iVar.t(gVar);
        }
    }

    @Override // h7.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z9;
        switch (this.f12076a) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                h0.u(str, "acc");
                h0.u(gVar, "element");
                if (str.length() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            case 1:
                return b((g) obj2, (i) obj);
            case 2:
                return b((g) obj2, (i) obj);
            case 3:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 4:
                return obj;
            case 5:
                a3.g.z(obj);
                return null;
            default:
                return (b0) obj;
        }
    }
}
