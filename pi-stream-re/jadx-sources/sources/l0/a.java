package l0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import q0.u;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6577a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(new Handler());
        this.f6578b = bVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f6577a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9, Uri uri) {
        switch (this.f6577a) {
            case 1:
                ((u) this.f6578b).c();
                return;
            default:
                super.onChange(z9, uri);
                return;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        Cursor cursor;
        switch (this.f6577a) {
            case 0:
                b bVar = (b) this.f6578b;
                if (!bVar.f6580b || (cursor = bVar.f6581c) == null || cursor.isClosed()) {
                    return;
                }
                bVar.f6579a = bVar.f6581c.requery();
                return;
            default:
                super.onChange(z9);
                return;
        }
    }
}
