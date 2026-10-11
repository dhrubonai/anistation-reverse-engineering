package d0;

import androidx.appcompat.widget.a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements f0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3019b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f3018a = i10;
        this.f3019b = obj;
    }

    public final void a(f fVar) {
        switch (this.f3018a) {
            case 0:
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((a0) this.f3019b).T(fVar);
                return;
            default:
                synchronized (g.f3024c) {
                    n.k kVar = g.f3025d;
                    ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f3019b, null);
                    if (arrayList != null) {
                        kVar.remove((String) this.f3019b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((f0.a) arrayList.get(i10)).accept(fVar);
                        }
                        return;
                    }
                    return;
                }
        }
    }

    @Override // f0.a
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f3018a) {
            case 0:
                a((f) obj);
                return;
            default:
                a((f) obj);
                return;
        }
    }
}
