package z1;

import android.view.View;
import m3.a1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f11924a;

    /* renamed from: b, reason: collision with root package name */
    public int f11925b;

    /* renamed from: c, reason: collision with root package name */
    public int f11926c;

    /* renamed from: d, reason: collision with root package name */
    public int f11927d;

    public /* synthetic */ h(int i10, int i11, int i12, int i13) {
        this.f11924a = i10;
        this.f11925b = i11;
        this.f11926c = i12;
        this.f11927d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f11924a - this.f11925b <= 1) {
                return false;
            }
        } else if (this.f11926c - this.f11927d <= 1) {
            return false;
        }
        return true;
    }

    public final void b(a1 a1Var) {
        View view = a1Var.f7153a;
        this.f11924a = view.getLeft();
        this.f11925b = view.getTop();
        this.f11926c = view.getRight();
        this.f11927d = view.getBottom();
    }
}
