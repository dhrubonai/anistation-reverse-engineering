package x6;

import r6.h0;

/* loaded from: classes.dex */
public final class a extends i7.h implements h7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i10) {
        super(1);
        this.f11305a = i10;
        this.f11306b = obj;
    }

    @Override // h7.l
    public final Object invoke(Object obj) {
        Object obj2;
        int i10 = this.f11305a;
        Object obj3 = this.f11306b;
        switch (i10) {
            case 0:
                if (obj == ((b) obj3)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                String str = (String) obj;
                h0.u(str, "line");
                return a3.g.t(new StringBuilder(), (String) obj3, str);
            case 2:
                l7.f fVar = (l7.f) obj;
                h0.u(fVar, "it");
                return o7.j.D1((CharSequence) obj3, fVar);
            case 3:
                Throwable th = (Throwable) obj;
                Object obj4 = null;
                try {
                    Throwable th2 = (Throwable) ((h7.l) obj3).invoke(th);
                    boolean g10 = h0.g(th.getMessage(), th2.getMessage());
                    obj2 = th2;
                    if (!g10) {
                        boolean g11 = h0.g(th2.getMessage(), th.toString());
                        obj2 = th2;
                        if (!g11) {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th3) {
                    obj2 = h0.F(th3);
                }
                if (!(obj2 instanceof w6.c)) {
                    obj4 = obj2;
                }
                return (Throwable) obj4;
            default:
                ((v7.i) obj3).b();
                return w6.f.f11019a;
        }
    }
}
