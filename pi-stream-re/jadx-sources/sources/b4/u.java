package b4;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class u implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1495a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1496b;

    public u(Context context, int i10) {
        this.f1495a = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                this.f1496b = context;
                return;
            } else {
                this.f1496b = context.getApplicationContext();
                return;
            }
        }
        this.f1496b = context.getApplicationContext();
    }

    @Override // b4.x
    public final /* bridge */ /* synthetic */ w a(Object obj, int i10, int i11, v3.l lVar) {
        switch (this.f1495a) {
            case 0:
                return c((Uri) obj, i10, i11, lVar);
            case 1:
                return c((Uri) obj, i10, i11, lVar);
            default:
                return c((Uri) obj, i10, i11, lVar);
        }
    }

    @Override // b4.x
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f1495a) {
            case 0:
                return d((Uri) obj);
            case 1:
                return d((Uri) obj);
            default:
                return d((Uri) obj);
        }
    }

    public final w c(Uri uri, int i10, int i11, v3.l lVar) {
        boolean z9;
        boolean z10 = true;
        int i12 = this.f1495a;
        Context context = this.f1496b;
        switch (i12) {
            case 0:
                return new w(new o4.b(uri), new t(context, uri));
            case 1:
                if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
                    z10 = false;
                }
                if (!z10) {
                    return null;
                }
                return new w(new o4.b(uri), w3.c.b(context, uri, new w3.a(context.getContentResolver())));
            default:
                if (i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    return null;
                }
                Long l10 = (Long) lVar.c(e4.f0.f3482d);
                if (l10 == null || l10.longValue() != -1) {
                    z10 = false;
                }
                if (!z10) {
                    return null;
                }
                return new w(new o4.b(uri), w3.c.b(context, uri, new w3.b(context.getContentResolver())));
        }
    }

    public final boolean d(Uri uri) {
        switch (this.f1495a) {
            case 0:
                return w7.b.K(uri);
            case 1:
                if (w7.b.K(uri) && !uri.getPathSegments().contains("video")) {
                    return true;
                }
                return false;
            default:
                if (w7.b.K(uri) && uri.getPathSegments().contains("video")) {
                    return true;
                }
                return false;
        }
    }
}
