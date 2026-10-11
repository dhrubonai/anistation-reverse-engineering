package d6;

import android.content.Context;
import msr.pistream.app.R;
import q6.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f3232f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3234b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3235c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3236d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3237e;

    public a(Context context) {
        boolean b02 = g.b0(context, R.attr.elevationOverlayEnabled, false);
        int A = g.A(context, R.attr.elevationOverlayColor, 0);
        int A2 = g.A(context, R.attr.elevationOverlayAccentColor, 0);
        int A3 = g.A(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f3233a = b02;
        this.f3234b = A;
        this.f3235c = A2;
        this.f3236d = A3;
        this.f3237e = f10;
    }
}
