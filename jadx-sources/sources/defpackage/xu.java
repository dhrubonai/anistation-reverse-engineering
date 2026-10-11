package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xu extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ ak6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(ak6 ak6Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = ak6Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c.i();
    }
}
