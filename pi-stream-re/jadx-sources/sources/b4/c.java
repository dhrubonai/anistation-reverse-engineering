package b4;

import android.content.res.AssetManager;
import android.net.Uri;

/* loaded from: classes.dex */
public final class c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f1441a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1442b;

    public c(AssetManager assetManager, a aVar) {
        this.f1441a = assetManager;
        this.f1442b = aVar;
    }

    @Override // b4.x
    public final w a(Object obj, int i10, int i11, v3.l lVar) {
        com.bumptech.glide.load.data.k kVar;
        Uri uri = (Uri) obj;
        String substring = uri.toString().substring(22);
        o4.b bVar = new o4.b(uri);
        int i12 = ((b) this.f1442b).f1436a;
        AssetManager assetManager = this.f1441a;
        switch (i12) {
            case 0:
                kVar = new com.bumptech.glide.load.data.k(assetManager, substring, 0);
                break;
            default:
                kVar = new com.bumptech.glide.load.data.k(assetManager, substring, 1);
                break;
        }
        return new w(bVar, kVar);
    }

    @Override // b4.x
    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
