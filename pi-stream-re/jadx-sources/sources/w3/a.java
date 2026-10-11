package w3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f10933b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f10934a;

    public a(ContentResolver contentResolver) {
        this.f10934a = contentResolver;
    }

    @Override // w3.d
    public final Cursor a(Uri uri) {
        return this.f10934a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f10933b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
