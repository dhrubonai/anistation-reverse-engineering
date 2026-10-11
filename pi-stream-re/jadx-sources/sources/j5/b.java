package j5;

import android.content.Context;
import b5.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6168b = new b();

    /* renamed from: a, reason: collision with root package name */
    public h f6169a = null;

    public static h a(Context context) {
        h hVar;
        b bVar = f6168b;
        synchronized (bVar) {
            if (bVar.f6169a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                bVar.f6169a = new h(context, 12, 0);
            }
            hVar = bVar.f6169a;
        }
        return hVar;
    }
}
