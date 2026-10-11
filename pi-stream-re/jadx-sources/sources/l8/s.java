package l8;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements androidx.lifecycle.d0, i8.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f7015a;

    public /* synthetic */ s(u uVar) {
        this.f7015a = uVar;
    }

    @Override // i8.c
    public final void e(a8.b bVar) {
        t tVar = this.f7015a.f7022t0;
        if (tVar != null) {
            ((z) tVar).d(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [l8.q] */
    @Override // androidx.lifecycle.d0
    public final void f(Object obj) {
        LinearLayout linearLayout;
        Object obj2;
        b8.a aVar = (b8.a) obj;
        int i10 = u.A0;
        u uVar = this.f7015a;
        if (uVar.V() && (linearLayout = uVar.f7025w0) != null) {
            boolean z9 = true;
            if (aVar.f1545a != 1) {
                z9 = false;
            }
            if (!z9) {
                linearLayout.removeAllViews();
                if (aVar.b() && (obj2 = aVar.f1546b) != null && !((List) obj2).isEmpty()) {
                    ArrayList arrayList = new ArrayList((Collection) obj2);
                    final ArrayList a10 = w7.a.a(uVar.f4484m0);
                    arrayList.sort(new Comparator() { // from class: l8.q
                        @Override // java.util.Comparator
                        public final int compare(Object obj3, Object obj4) {
                            int i11;
                            String str;
                            int indexOf;
                            String str2;
                            a8.f fVar = (a8.f) obj3;
                            a8.f fVar2 = (a8.f) obj4;
                            u uVar2 = s.this.f7015a;
                            int i12 = u.A0;
                            uVar2.getClass();
                            int i13 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                            List list = a10;
                            if (fVar == null || (str2 = fVar.f191a) == null || (i11 = list.indexOf(str2)) < 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (fVar2 != null && (str = fVar2.f191a) != null && (indexOf = list.indexOf(str)) >= 0) {
                                i13 = indexOf;
                            }
                            return Integer.compare(i11, i13);
                        }
                    });
                    m3.p0 a11 = uVar.f7027y0.a(0);
                    a11.f7340b = 16;
                    ArrayList arrayList2 = a11.f7339a;
                    while (arrayList2.size() > 16) {
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    uVar.X(0, arrayList);
                    return;
                }
                TextView l10 = w8.i.l(uVar.f4484m0, "Could not load home — pull to retry", 14, w8.i.f11068h, 0);
                l10.setPadding(uVar.U(24), uVar.U(16), uVar.U(24), uVar.U(16));
                l10.setOnClickListener(new r(this, 0));
                uVar.f7025w0.addView(l10, new LinearLayout.LayoutParams(-1, -2));
                uVar.Z();
            }
        }
    }
}
