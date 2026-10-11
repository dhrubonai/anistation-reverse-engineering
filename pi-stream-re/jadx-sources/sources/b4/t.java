package b4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class t implements com.bumptech.glide.load.data.e {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1492c = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f1493a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f1494b;

    public t(Context context, Uri uri) {
        this.f1493a = context;
        this.f1494b = uri;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return File.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final v3.a d() {
        return v3.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        Cursor query = this.f1493a.getContentResolver().query(this.f1494b, f1492c, null, null, null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            dVar.n(new FileNotFoundException("Failed to find file path for: " + this.f1494b));
            return;
        }
        dVar.s(new File(str));
    }
}
