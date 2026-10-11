package g0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v0 implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final z f4264a;

    public v0(z zVar) {
        this.f4264a = zVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        h hVar = new h(new f.p0(contentInfo));
        h a10 = ((k0.u) this.f4264a).a(view, hVar);
        if (a10 == null) {
            return null;
        }
        if (a10 == hVar) {
            return contentInfo;
        }
        ContentInfo t9 = a10.f4216a.t();
        Objects.requireNonNull(t9);
        return com.google.android.gms.common.internal.o0.n(t9);
    }
}
