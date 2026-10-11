package g0;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d1 implements n7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4178b;

    public /* synthetic */ d1(Object obj, int i10) {
        this.f4177a = i10;
        this.f4178b = obj;
    }

    @Override // n7.c
    public final Iterator iterator() {
        int i10 = this.f4177a;
        Object obj = this.f4178b;
        switch (i10) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj;
                r6.h0.u(viewGroup, "<this>");
                return new f1(viewGroup, 0);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                h7.p pVar = (h7.p) obj;
                r6.h0.u(pVar, "block");
                n7.d dVar = new n7.d();
                dVar.f8017d = com.bumptech.glide.d.o(dVar, dVar, pVar);
                return dVar;
            default:
                return (Iterator) obj;
        }
    }
}
