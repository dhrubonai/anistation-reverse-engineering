package o7;

import h7.l;
import p7.u0;
import p7.w;
import r6.h0;

/* loaded from: classes.dex */
public final class e extends i7.h implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final e f8325b = new e(1);

    /* renamed from: c, reason: collision with root package name */
    public static final e f8326c = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8327a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f8327a = i10;
    }

    @Override // h7.l
    public final Object invoke(Object obj) {
        switch (this.f8327a) {
            case 0:
                String str = (String) obj;
                h0.u(str, "line");
                return str;
            case 1:
                z6.g gVar = (z6.g) obj;
                if (!(gVar instanceof w)) {
                    return null;
                }
                return (w) gVar;
            case 2:
                z6.g gVar2 = (z6.g) obj;
                if (!(gVar2 instanceof u0)) {
                    return null;
                }
                return (u0) gVar2;
            default:
                return null;
        }
    }
}
