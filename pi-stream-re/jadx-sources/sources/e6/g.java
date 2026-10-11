package e6;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f3575a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f3576b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3577c;

    /* renamed from: d, reason: collision with root package name */
    public int f3578d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3585k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f3579e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f3580f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: g, reason: collision with root package name */
    public float f3581g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f3582h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f3583i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3584j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f3586l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f3575a = charSequence;
        this.f3576b = textPaint;
        this.f3577c = i10;
        this.f3578d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f3575a == null) {
            this.f3575a = "";
        }
        int max = Math.max(0, this.f3577c);
        CharSequence charSequence = this.f3575a;
        int i10 = this.f3580f;
        TextPaint textPaint = this.f3576b;
        if (i10 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f3586l);
        }
        int min = Math.min(charSequence.length(), this.f3578d);
        this.f3578d = min;
        if (this.f3585k && this.f3580f == 1) {
            this.f3579e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f3579e);
        obtain.setIncludePad(this.f3584j);
        if (this.f3585k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f3586l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f3580f);
        float f10 = this.f3581g;
        if (f10 != 0.0f || this.f3582h != 1.0f) {
            obtain.setLineSpacing(f10, this.f3582h);
        }
        if (this.f3580f > 1) {
            obtain.setHyphenationFrequency(this.f3583i);
        }
        return obtain.build();
    }
}
