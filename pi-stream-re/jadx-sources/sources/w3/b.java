package w3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f10935b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f10936a;

    public b(ContentResolver contentResolver) {
        this.f10936a = contentResolver;
    }

    @Override // w3.d
    public final Cursor a(Uri uri) {
        return this.f10936a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f10935b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
