package m6;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class u extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f7539e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f7540f;

    /* renamed from: g, reason: collision with root package name */
    public final j3.j f7541g;

    public u(n nVar, int i10) {
        super(nVar);
        this.f7539e = R.drawable.design_password_eye;
        this.f7541g = new j3.j(this, 5);
        if (i10 != 0) {
            this.f7539e = i10;
        }
    }

    @Override // m6.o
    public final void b() {
        q();
    }

    @Override // m6.o
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // m6.o
    public final int d() {
        return this.f7539e;
    }

    @Override // m6.o
    public final View.OnClickListener f() {
        return this.f7541g;
    }

    @Override // m6.o
    public final boolean k() {
        return true;
    }

    @Override // m6.o
    public final boolean l() {
        boolean z9;
        EditText editText = this.f7540f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }

    @Override // m6.o
    public final void m(EditText editText) {
        this.f7540f = editText;
        q();
    }

    @Override // m6.o
    public final void r() {
        boolean z9;
        EditText editText = this.f7540f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f7540f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // m6.o
    public final void s() {
        EditText editText = this.f7540f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
