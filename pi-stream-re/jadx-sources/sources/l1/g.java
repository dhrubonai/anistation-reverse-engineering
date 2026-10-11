package l1;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class g extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f6651a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f6652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f6653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f6653c = hVar;
        this.f6651a = contentResolver;
        this.f6652b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        h hVar = this.f6653c;
        hVar.a(e.c(hVar.f6660a, hVar.f6668i, hVar.f6667h));
    }
}
