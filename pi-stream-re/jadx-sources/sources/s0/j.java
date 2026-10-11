package s0;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j extends q0.j {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f9745a;

    public j(EditText editText) {
        this.f9745a = new WeakReference(editText);
    }

    @Override // q0.j
    public final void a() {
        k.a((EditText) this.f9745a.get(), 1);
    }
}
