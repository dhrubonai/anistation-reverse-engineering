package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class m0 extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1109b = 0;

    /* renamed from: a, reason: collision with root package name */
    public i0 f1110a;

    public final void a(n nVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            r6.h0.s(activity, "activity");
            j6.e.n(activity, nVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(n.ON_DESTROY);
        this.f1110a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        i0 i0Var = this.f1110a;
        if (i0Var != null) {
            i0Var.f1098a.a();
        }
        a(n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        i0 i0Var = this.f1110a;
        if (i0Var != null) {
            j0 j0Var = i0Var.f1098a;
            int i10 = j0Var.f1100a + 1;
            j0Var.f1100a = i10;
            if (i10 == 1 && j0Var.f1103d) {
                j0Var.f1105f.e(n.ON_START);
                j0Var.f1103d = false;
            }
        }
        a(n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(n.ON_STOP);
    }
}
