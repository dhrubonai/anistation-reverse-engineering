package j3;

import android.text.Html;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f6040a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f6040a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
