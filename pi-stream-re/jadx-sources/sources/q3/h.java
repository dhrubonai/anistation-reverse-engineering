package q3;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9145c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f9143a = i10;
        this.f9145c = obj;
        this.f9144b = obj2;
    }

    @Override // q3.r
    public final void c(s sVar) {
        int i10 = this.f9143a;
        Object obj = this.f9144b;
        switch (i10) {
            case 0:
                e0 e0Var = a0.f9121a;
                e0Var.y((View) obj, 1.0f);
                e0Var.getClass();
                sVar.w(this);
                return;
            case 1:
                ((ArrayList) ((n.e) obj).getOrDefault(((u) this.f9145c).f9188b, null)).remove(sVar);
                sVar.w(this);
                return;
            default:
                ((s) obj).z();
                sVar.w(this);
                return;
        }
    }
}
