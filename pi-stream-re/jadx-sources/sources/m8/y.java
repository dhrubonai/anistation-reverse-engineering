package m8;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f7728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f7729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f7730c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l8.z f7731d;

    public /* synthetic */ y(Context context, LinearLayout linearLayout, List list, l8.z zVar) {
        this.f7728a = list;
        this.f7729b = linearLayout;
        this.f7730c = context;
        this.f7731d = zVar;
    }

    public final void a(ArrayList arrayList) {
        LinearLayout linearLayout = this.f7729b;
        Context context = this.f7730c;
        l8.z zVar = this.f7731d;
        List list = this.f7728a;
        list.clear();
        list.addAll(arrayList);
        linearLayout.post(new v1.z(linearLayout, context, list, zVar, 4));
    }
}
