package m6;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f7552b;

    public /* synthetic */ w(TextInputLayout textInputLayout, int i10) {
        this.f7551a = i10;
        this.f7552b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7551a;
        TextInputLayout textInputLayout = this.f7552b;
        switch (i10) {
            case 0:
                CheckableImageButton checkableImageButton = textInputLayout.f2805c.f7493x;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                textInputLayout.f2807d.requestLayout();
                return;
        }
    }
}
