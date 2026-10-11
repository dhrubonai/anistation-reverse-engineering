package q3;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9160b;

    public k(View view, ArrayList arrayList) {
        this.f9159a = view;
        this.f9160b = arrayList;
    }

    @Override // q3.r
    public final void a() {
    }

    @Override // q3.r
    public final void b() {
    }

    @Override // q3.r
    public final void c(s sVar) {
        sVar.w(this);
        this.f9159a.setVisibility(8);
        ArrayList arrayList = this.f9160b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // q3.r
    public final void d() {
    }

    @Override // q3.r
    public final void e(s sVar) {
        sVar.w(this);
        sVar.a(this);
    }
}
