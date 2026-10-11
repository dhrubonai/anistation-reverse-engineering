package g0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ContentInfo.Builder f4175a;

    public d(ClipData clipData, int i10) {
        this.f4175a = com.google.android.gms.common.internal.o0.l(clipData, i10);
    }

    @Override // g0.e
    public final void a(Bundle bundle) {
        this.f4175a.setExtras(bundle);
    }

    @Override // g0.e
    public final void b(Uri uri) {
        this.f4175a.setLinkUri(uri);
    }

    @Override // g0.e
    public final h build() {
        ContentInfo build;
        build = this.f4175a.build();
        return new h(new f.p0(build));
    }

    @Override // g0.e
    public final void c(int i10) {
        this.f4175a.setFlags(i10);
    }
}
