package z2;

import android.text.Layout;
import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d0.b f11993c = new d0.b(18);

    /* renamed from: a, reason: collision with root package name */
    public final e1.b f11994a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11995b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z9, int i12, int i13) {
        boolean z10;
        int i14;
        if (z9) {
            i14 = i12;
            z10 = true;
        } else {
            z10 = false;
            i14 = -16777216;
        }
        this.f11994a = new e1.b(spannableStringBuilder, alignment, null, null, f10, 0, i10, f11, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, i14, Integer.MIN_VALUE, 0.0f);
        this.f11995b = i13;
    }
}
