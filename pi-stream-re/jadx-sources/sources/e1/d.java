package e1;

import android.os.Bundle;
import android.text.Spanned;
import f1.b0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3365a = b0.J(0);

    /* renamed from: b, reason: collision with root package name */
    public static final String f3366b = b0.J(1);

    /* renamed from: c, reason: collision with root package name */
    public static final String f3367c = b0.J(2);

    /* renamed from: d, reason: collision with root package name */
    public static final String f3368d = b0.J(3);

    /* renamed from: e, reason: collision with root package name */
    public static final String f3369e = b0.J(4);

    public static Bundle a(Spanned spanned, f fVar, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f3365a, spanned.getSpanStart(fVar));
        bundle2.putInt(f3366b, spanned.getSpanEnd(fVar));
        bundle2.putInt(f3367c, spanned.getSpanFlags(fVar));
        bundle2.putInt(f3368d, i10);
        if (bundle != null) {
            bundle2.putBundle(f3369e, bundle);
        }
        return bundle2;
    }
}
