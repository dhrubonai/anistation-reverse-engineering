package j0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f5611a;

    public e(Object obj) {
        this.f5611a = (InputContentInfo) obj;
    }

    @Override // j0.f
    public final ClipDescription a() {
        return this.f5611a.getDescription();
    }

    @Override // j0.f
    public final Object c() {
        return this.f5611a;
    }

    @Override // j0.f
    public final Uri g() {
        return this.f5611a.getContentUri();
    }

    @Override // j0.f
    public final void h() {
        this.f5611a.requestPermission();
    }

    @Override // j0.f
    public final Uri i() {
        return this.f5611a.getLinkUri();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f5611a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
