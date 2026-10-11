package android.support.v4.media;

import a.e;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends e {
    @Override // a.e
    public final void d(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = w7.b.Y(bundle);
        }
        if (i10 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("media_item")) {
                    Parcelable parcelable = bundle.getParcelable("media_item");
                    if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
