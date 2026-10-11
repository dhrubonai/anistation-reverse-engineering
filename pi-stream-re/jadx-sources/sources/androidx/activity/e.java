package androidx.activity;

import android.text.TextUtils;
import androidx.fragment.app.b0;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f263a;

    public e(b0 b0Var) {
        this.f263a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e10) {
            if (TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            } else {
                throw e10;
            }
        }
    }
}
