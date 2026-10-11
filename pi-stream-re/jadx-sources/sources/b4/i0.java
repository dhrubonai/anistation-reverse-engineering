package b4;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class i0 implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f1467b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final h0 f1468a;

    public i0(h0 h0Var) {
        this.f1468a = h0Var;
    }

    @Override // b4.x
    public final w a(Object obj, int i10, int i11, v3.l lVar) {
        com.bumptech.glide.load.data.e oVar;
        Uri uri = (Uri) obj;
        o4.b bVar = new o4.b(uri);
        g0 g0Var = (g0) this.f1468a;
        int i12 = g0Var.f1460a;
        ContentResolver contentResolver = g0Var.f1461b;
        switch (i12) {
            case 0:
                oVar = new com.bumptech.glide.load.data.a(contentResolver, uri, 0);
                break;
            case 1:
                oVar = new com.bumptech.glide.load.data.a(contentResolver, uri, 1);
                break;
            default:
                oVar = new com.bumptech.glide.load.data.o(contentResolver, uri);
                break;
        }
        return new w(bVar, oVar);
    }

    @Override // b4.x
    public final boolean b(Object obj) {
        return f1467b.contains(((Uri) obj).getScheme());
    }
}
