package g8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.y;
import w8.i;

/* loaded from: classes.dex */
public abstract class b extends y {

    /* renamed from: m0, reason: collision with root package name */
    public Context f4484m0;

    public final int U(int i10) {
        return i.e(O(), i10);
    }

    public final boolean V() {
        if (q() && !this.Q && !this.C) {
            return true;
        }
        return false;
    }

    public abstract View W();

    @Override // androidx.fragment.app.y
    public void w(Context context) {
        super.w(context);
        this.f4484m0 = context;
    }

    @Override // androidx.fragment.app.y
    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return W();
    }
}
