package l8;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.List;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements androidx.lifecycle.d0, k8.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7032b;

    public /* synthetic */ x(MainActivity mainActivity, int i10) {
        this.f7031a = i10;
        this.f7032b = mainActivity;
    }

    @Override // k8.f
    public final List b(int i10) {
        int i11 = this.f7031a;
        MainActivity mainActivity = this.f7032b;
        switch (i11) {
            case 18:
            default:
                int i12 = MainActivity.f7741b0;
                return mainActivity.I(i10);
        }
    }

    @Override // androidx.lifecycle.d0
    public final void f(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        int i10 = this.f7031a;
        MainActivity mainActivity = this.f7032b;
        switch (i10) {
            case 0:
                b8.a aVar = (b8.a) obj;
                int i11 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar.b() && (obj3 = aVar.f1546b) != null) {
                    mainActivity.F.b("spotlight", (List) obj3);
                    return;
                }
                return;
            case 1:
                b8.a aVar2 = (b8.a) obj;
                int i12 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar2.b() && (obj4 = aVar2.f1546b) != null) {
                    mainActivity.F.b("special", (List) obj4);
                    return;
                }
                return;
            case 2:
                b8.a aVar3 = (b8.a) obj;
                int i13 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar3.b() && (obj5 = aVar3.f1546b) != null) {
                    mainActivity.F.b("popular", (List) obj5);
                    return;
                }
                return;
            case 3:
                b8.a aVar4 = (b8.a) obj;
                int i14 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar4.b() && (obj6 = aVar4.f1546b) != null) {
                    mainActivity.F.b("top", (List) obj6);
                    return;
                }
                return;
            case 4:
                b8.a aVar5 = (b8.a) obj;
                int i15 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar5.b() && (obj7 = aVar5.f1546b) != null) {
                    mainActivity.F.b("upcomingSeason", (List) obj7);
                    return;
                }
                return;
            case 5:
                b8.a aVar6 = (b8.a) obj;
                int i16 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar6.b() && (obj8 = aVar6.f1546b) != null) {
                    mainActivity.F.b("fan", (List) obj8);
                    return;
                }
                return;
            case 6:
                b8.a aVar7 = (b8.a) obj;
                int i17 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar7.b() && (obj9 = aVar7.f1546b) != null) {
                    mainActivity.F.b("movies", (List) obj9);
                    return;
                }
                return;
            case zzaja.zze.zzg /* 7 */:
                b8.a aVar8 = (b8.a) obj;
                int i18 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar8.b() && (obj10 = aVar8.f1546b) != null) {
                    mainActivity.F.b("tv", (List) obj10);
                    return;
                }
                return;
            case 8:
                b8.a aVar9 = (b8.a) obj;
                int i19 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar9.b() && (obj11 = aVar9.f1546b) != null) {
                    mainActivity.F.b("new", (List) obj11);
                    return;
                }
                return;
            case 9:
                b8.a aVar10 = (b8.a) obj;
                int i20 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar10.b() && (obj12 = aVar10.f1546b) != null) {
                    mainActivity.F.b("ona", (List) obj12);
                    return;
                }
                return;
            default:
                b8.a aVar11 = (b8.a) obj;
                int i21 = MainActivity.f7741b0;
                mainActivity.getClass();
                if (aVar11.b() && (obj2 = aVar11.f1546b) != null) {
                    mainActivity.F.b("ova", (List) obj2);
                    return;
                }
                return;
        }
    }
}
