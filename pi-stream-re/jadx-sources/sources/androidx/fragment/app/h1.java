package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f900e;

    public h1(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f896a = i10;
        this.f897b = arrayList;
        this.f898c = arrayList2;
        this.f899d = arrayList3;
        this.f900e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f896a; i10++) {
            View view = (View) this.f897b.get(i10);
            String str = (String) this.f898c.get(i10);
            WeakHashMap weakHashMap = g0.y0.f4277a;
            g0.n0.v(view, str);
            g0.n0.v((View) this.f899d.get(i10), (String) this.f900e.get(i10));
        }
    }
}
