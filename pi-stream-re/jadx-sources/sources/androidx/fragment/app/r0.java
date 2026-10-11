package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f965a;

    /* renamed from: b, reason: collision with root package name */
    public final int f966b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f967c;

    public r0(s0 s0Var, int i10) {
        this.f967c = s0Var;
        this.f965a = i10;
    }

    @Override // androidx.fragment.app.q0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        s0 s0Var = this.f967c;
        y yVar = s0Var.f989w;
        int i10 = this.f965a;
        if (yVar != null && i10 < 0 && yVar.j().N()) {
            return false;
        }
        return s0Var.P(arrayList, arrayList2, i10, this.f966b);
    }
}
