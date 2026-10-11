package s0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9737a;

    /* renamed from: b, reason: collision with root package name */
    public e f9738b;

    public f(TextView textView) {
        this.f9737a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f9737a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = q0.l.a().b();
        if (b10 != 0) {
            boolean z9 = true;
            if (b10 != 1) {
                if (b10 != 3) {
                    return charSequence;
                }
            } else {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z9 = false;
                }
                if (z9 && charSequence != null) {
                    if (i10 != 0 || i11 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i10, i11);
                    }
                    return q0.l.a().f(0, charSequence.length(), charSequence);
                }
                return charSequence;
            }
        }
        q0.l a10 = q0.l.a();
        if (this.f9738b == null) {
            this.f9738b = new e(textView, this);
        }
        a10.g(this.f9738b);
        return charSequence;
    }
}
