package r6;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x0 extends c2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractList f9568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f9567b = i10;
        this.f9568c = abstractList;
    }

    @Override // r6.b2
    public final Object a(Object obj) {
        int i10 = this.f9567b;
        AbstractList abstractList = this.f9568c;
        switch (i10) {
            case 0:
                return ((y0) abstractList).f9575b.apply(obj);
            default:
                return ((z0) abstractList).f9579b.apply(obj);
        }
    }
}
