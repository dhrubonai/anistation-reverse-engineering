package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.e55;
import defpackage.st3;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends e55 {
    @Override // defpackage.e55
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = st3.K(bundle);
        }
        if (i == 0) {
            if (bundle != null) {
                if (bundle.containsKey("search_results")) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                    parcelableArray.getClass();
                    ArrayList arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
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
