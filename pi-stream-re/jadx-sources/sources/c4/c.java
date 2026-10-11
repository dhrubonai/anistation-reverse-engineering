package c4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import b4.w;
import b4.x;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.io.FileNotFoundException;
import v3.l;

/* loaded from: classes.dex */
public final class c implements e {
    public static final String[] B = {"_data"};
    public volatile e A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2064a;

    /* renamed from: b, reason: collision with root package name */
    public final x f2065b;

    /* renamed from: c, reason: collision with root package name */
    public final x f2066c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f2067d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2068e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2069f;

    /* renamed from: x, reason: collision with root package name */
    public final l f2070x;

    /* renamed from: y, reason: collision with root package name */
    public final Class f2071y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f2072z;

    public c(Context context, x xVar, x xVar2, Uri uri, int i10, int i11, l lVar, Class cls) {
        this.f2064a = context.getApplicationContext();
        this.f2065b = xVar;
        this.f2066c = xVar2;
        this.f2067d = uri;
        this.f2068e = i10;
        this.f2069f = i11;
        this.f2070x = lVar;
        this.f2071y = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f2071y;
    }

    public final e b() {
        boolean isExternalStorageLegacy;
        boolean z9;
        w a10;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f2064a;
        l lVar = this.f2070x;
        int i10 = this.f2069f;
        int i11 = this.f2068e;
        if (isExternalStorageLegacy) {
            Uri uri = this.f2067d;
            try {
                Cursor query = context.getContentResolver().query(uri, B, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (!TextUtils.isEmpty(string)) {
                                File file = new File(string);
                                query.close();
                                a10 = this.f2065b.a(file, i11, i10, lVar);
                            } else {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri uri2 = this.f2067d;
            boolean z10 = true;
            if (w7.b.K(uri2) && uri2.getPathSegments().contains("picker")) {
                z9 = true;
            } else {
                z9 = false;
            }
            x xVar = this.f2066c;
            if (z9) {
                a10 = xVar.a(uri2, i11, i10, lVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    z10 = false;
                }
                if (z10) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                a10 = xVar.a(uri2, i11, i10, lVar);
            }
        }
        if (a10 == null) {
            return null;
        }
        return a10.f1503c;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        e eVar = this.A;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f2072z = true;
        e eVar = this.A;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final v3.a d() {
        return v3.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(g gVar, com.bumptech.glide.load.data.d dVar) {
        try {
            e b10 = b();
            if (b10 == null) {
                dVar.n(new IllegalArgumentException("Failed to build fetcher for: " + this.f2067d));
            } else {
                this.A = b10;
                if (this.f2072z) {
                    cancel();
                } else {
                    b10.e(gVar, dVar);
                }
            }
        } catch (FileNotFoundException e10) {
            dVar.n(e10);
        }
    }
}
