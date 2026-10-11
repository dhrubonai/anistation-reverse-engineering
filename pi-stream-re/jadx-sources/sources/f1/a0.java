package f1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class a0 {
    public static Drawable a(Context context, Resources resources, int i10) {
        return resources.getDrawable(i10, context.getTheme());
    }
}
