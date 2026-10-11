package f;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.i1;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f3739b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3740c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3741d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3742e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3743f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f3744g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final n.k f3745h = new n.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3746a = new Object[2];

    public androidx.appcompat.widget.q a(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.q(context, attributeSet);
    }

    public androidx.appcompat.widget.s b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.s(context, attributeSet, msr.pistream.app.R.attr.buttonStyle);
    }

    public androidx.appcompat.widget.t c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet, msr.pistream.app.R.attr.checkboxStyle);
    }

    public androidx.appcompat.widget.i0 d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.i0(context, attributeSet);
    }

    public i1 e(Context context, AttributeSet attributeSet) {
        return new i1(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        n.k kVar = f3745h;
        Constructor constructor = (Constructor) kVar.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3739b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f3746a);
    }

    public final void g(TextView textView, String str) {
        if (textView != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
