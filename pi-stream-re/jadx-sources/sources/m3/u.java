package m3;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public int f7370b;

    /* renamed from: c, reason: collision with root package name */
    public int f7371c;

    /* renamed from: d, reason: collision with root package name */
    public int f7372d;

    /* renamed from: e, reason: collision with root package name */
    public int f7373e;

    /* renamed from: f, reason: collision with root package name */
    public int f7374f;

    /* renamed from: g, reason: collision with root package name */
    public int f7375g;

    /* renamed from: j, reason: collision with root package name */
    public int f7378j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7380l;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7369a = true;

    /* renamed from: h, reason: collision with root package name */
    public int f7376h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f7377i = 0;

    /* renamed from: k, reason: collision with root package name */
    public List f7379k = null;

    public final void a(View view) {
        int a10;
        int size = this.f7379k.size();
        View view2 = null;
        int i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((a1) this.f7379k.get(i11)).f7153a;
            l0 l0Var = (l0) view3.getLayoutParams();
            if (view3 != view && !l0Var.c() && (a10 = (l0Var.a() - this.f7372d) * this.f7373e) >= 0 && a10 < i10) {
                view2 = view3;
                if (a10 == 0) {
                    break;
                } else {
                    i10 = a10;
                }
            }
        }
        if (view2 == null) {
            this.f7372d = -1;
        } else {
            this.f7372d = ((l0) view2.getLayoutParams()).a();
        }
    }

    public final View b(a3.h hVar) {
        List list = this.f7379k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((a1) this.f7379k.get(i10)).f7153a;
                l0 l0Var = (l0) view.getLayoutParams();
                if (!l0Var.c() && this.f7372d == l0Var.a()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View d10 = hVar.d(this.f7372d);
        this.f7372d += this.f7373e;
        return d10;
    }
}
