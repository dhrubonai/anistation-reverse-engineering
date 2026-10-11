package s0;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class i extends j6.e {

    /* renamed from: b, reason: collision with root package name */
    public final h f9744b;

    public i(TextView textView) {
        super(16);
        this.f9744b = new h(textView);
    }

    @Override // j6.e
    public final InputFilter[] o(InputFilter[] inputFilterArr) {
        boolean z9;
        if (q0.l.f8923j != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return inputFilterArr;
        }
        return this.f9744b.o(inputFilterArr);
    }

    @Override // j6.e
    public final void w(boolean z9) {
        boolean z10;
        if (q0.l.f8923j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        this.f9744b.w(z9);
    }

    @Override // j6.e
    public final void z(boolean z9) {
        boolean z10;
        if (q0.l.f8923j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = !z10;
        h hVar = this.f9744b;
        if (z11) {
            hVar.f9743d = z9;
        } else {
            hVar.z(z9);
        }
    }
}
