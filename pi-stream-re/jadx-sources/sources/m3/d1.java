package m3;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d1 extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7195a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f7196b;

    public d1(e1 e1Var) {
        this.f7196b = e1Var;
    }

    @Override // m3.o0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0 && this.f7195a) {
            this.f7195a = false;
            this.f7196b.d();
        }
    }

    @Override // m3.o0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 != 0 || i11 != 0) {
            this.f7195a = true;
        }
    }
}
