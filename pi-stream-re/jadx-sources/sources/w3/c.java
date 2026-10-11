package w3;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f10937a;

    /* renamed from: b, reason: collision with root package name */
    public final e f10938b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f10939c;

    public c(Uri uri, e eVar) {
        this.f10937a = uri;
        this.f10938b = eVar;
    }

    public static c b(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.a(context).f2172c.b().f(), dVar, com.bumptech.glide.b.a(context).f2173d, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        InputStream inputStream = this.f10939c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final v3.a d() {
        return v3.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(g gVar, com.bumptech.glide.load.data.d dVar) {
        try {
            InputStream f10 = f();
            this.f10939c = f10;
            dVar.s(f10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            dVar.n(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x004a, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0048, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0025: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:38), block:B:70:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream f() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.c.f():java.io.InputStream");
    }
}
