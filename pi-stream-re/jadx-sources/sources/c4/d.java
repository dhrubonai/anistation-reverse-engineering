package c4;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import b4.w;
import b4.x;
import v3.l;

/* loaded from: classes.dex */
public final class d implements x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2073a;

    /* renamed from: b, reason: collision with root package name */
    public final x f2074b;

    /* renamed from: c, reason: collision with root package name */
    public final x f2075c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f2076d;

    public d(Context context, x xVar, x xVar2, Class cls) {
        this.f2073a = context.getApplicationContext();
        this.f2074b = xVar;
        this.f2075c = xVar2;
        this.f2076d = cls;
    }

    @Override // b4.x
    public final w a(Object obj, int i10, int i11, l lVar) {
        Uri uri = (Uri) obj;
        return new w(new o4.b(uri), new c(this.f2073a, this.f2074b, this.f2075c, uri, i10, i11, lVar, this.f2076d));
    }

    @Override // b4.x
    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT >= 29 && w7.b.K(uri)) {
            return true;
        }
        return false;
    }
}
