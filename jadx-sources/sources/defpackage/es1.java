package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class es1 {
    public final boolean a;
    public final int b;
    public final int c;

    static {
        Math.round(5.1000000000000005d);
    }

    public es1(Context context) {
        TypedValue G = sw0.G(context.getTheme(), R.attr.elevationOverlayEnabled);
        boolean z = false;
        if (G != null && G.type == 18 && G.data != 0) {
            z = true;
        }
        int B = h41.B(context, R.attr.elevationOverlayColor);
        h41.B(context, R.attr.elevationOverlayAccentColor);
        int B2 = h41.B(context, R.attr.colorSurface);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = B;
        this.c = B2;
    }
}
