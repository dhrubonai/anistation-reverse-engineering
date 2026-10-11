package y;

import android.content.res.ColorStateList;
import android.content.res.Resources;

/* loaded from: classes.dex */
public abstract class j {
    public static int a(Resources resources, int i10, Resources.Theme theme) {
        return resources.getColor(i10, theme);
    }

    public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
        return resources.getColorStateList(i10, theme);
    }
}
