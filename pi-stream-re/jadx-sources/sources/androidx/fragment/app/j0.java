package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class j0 implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f910b;

    public /* synthetic */ j0(s0 s0Var, int i10) {
        this.f909a = i10;
        this.f910b = s0Var;
    }

    @Override // c.b
    public final void a(Object obj) {
        int i10;
        switch (this.f909a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((Boolean) arrayList.get(i11)).booleanValue()) {
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    iArr[i11] = i10;
                }
                s0 s0Var = this.f910b;
                p0 p0Var = (p0) s0Var.C.pollFirst();
                if (p0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                i.g gVar = s0Var.f970c;
                String str = p0Var.f948a;
                y t9 = gVar.t(str);
                if (t9 == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                t9.D(p0Var.f949b, strArr, iArr);
                return;
            case 1:
            default:
                b((c.a) obj);
                return;
            case 2:
                b((c.a) obj);
                return;
        }
    }

    public final void b(c.a aVar) {
        int i10 = this.f909a;
        s0 s0Var = this.f910b;
        switch (i10) {
            case 2:
                p0 p0Var = (p0) s0Var.C.pollFirst();
                if (p0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                i.g gVar = s0Var.f970c;
                String str = p0Var.f948a;
                y t9 = gVar.t(str);
                if (t9 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                } else {
                    t9.u(p0Var.f949b, aVar.f1572a, aVar.f1573b);
                    return;
                }
            default:
                p0 p0Var2 = (p0) s0Var.C.pollFirst();
                if (p0Var2 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                i.g gVar2 = s0Var.f970c;
                String str2 = p0Var2.f948a;
                y t10 = gVar2.t(str2);
                if (t10 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    return;
                } else {
                    t10.u(p0Var2.f949b, aVar.f1572a, aVar.f1573b);
                    return;
                }
        }
    }
}
