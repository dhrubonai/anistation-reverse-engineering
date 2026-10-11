package g0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class u0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static h b(View view, h hVar) {
        ContentInfo t9 = hVar.f4216a.t();
        Objects.requireNonNull(t9);
        ContentInfo n9 = com.google.android.gms.common.internal.o0.n(t9);
        ContentInfo performReceiveContent = view.performReceiveContent(n9);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == n9) {
            return hVar;
        }
        return new h(new f.p0(performReceiveContent));
    }

    public static void c(View view, String[] strArr, z zVar) {
        if (zVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new v0(zVar));
        }
    }
}
