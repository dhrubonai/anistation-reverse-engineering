package m6;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f7496a;

    /* renamed from: b, reason: collision with root package name */
    public final n f7497b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f7498c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f7499d;

    public o(n nVar) {
        this.f7496a = nVar.f7487a;
        this.f7497b = nVar;
        this.f7498c = nVar.getContext();
        this.f7499d = nVar.f7493x;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public h0.d h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(h0.h hVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z9) {
    }

    public final void q() {
        this.f7497b.e(false);
    }

    public abstract void r();

    public void s() {
    }
}
