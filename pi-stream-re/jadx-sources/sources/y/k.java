package y;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f11437a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f11438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11439c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f11437a = colorStateList;
        this.f11438b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f11439c = hashCode;
    }
}
