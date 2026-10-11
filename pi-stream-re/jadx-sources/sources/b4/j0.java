package b4;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class j0 implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f1474b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final x f1475a;

    public j0(x xVar) {
        this.f1475a = xVar;
    }

    @Override // b4.x
    public final w a(Object obj, int i10, int i11, v3.l lVar) {
        return this.f1475a.a(new o(((Uri) obj).toString()), i10, i11, lVar);
    }

    @Override // b4.x
    public final boolean b(Object obj) {
        return f1474b.contains(((Uri) obj).getScheme());
    }
}
