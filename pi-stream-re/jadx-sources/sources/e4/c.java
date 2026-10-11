package e4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.lifecycle.q0;

/* loaded from: classes.dex */
public final class c implements v3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3472a;

    /* renamed from: b, reason: collision with root package name */
    public final y3.d f3473b;

    public c() {
        this.f3472a = 0;
        this.f3473b = new q0();
    }

    @Override // v3.n
    public final x3.e0 a(Object obj, int i10, int i11, v3.l lVar) {
        switch (this.f3472a) {
            case 0:
                return c(com.google.android.gms.internal.p002firebaseauthapi.a.g(obj), i10, i11, lVar);
            default:
                return d.c(((u3.e) ((u3.a) obj)).b(), this.f3473b);
        }
    }

    @Override // v3.n
    public final /* bridge */ /* synthetic */ boolean b(Object obj, v3.l lVar) {
        switch (this.f3472a) {
            case 0:
                com.google.android.gms.internal.p002firebaseauthapi.a.w(obj);
                return true;
            default:
                return true;
        }
    }

    public final d c(ImageDecoder.Source source, int i10, int i11, v3.l lVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new d4.b(i10, i11, lVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new d(decodeBitmap, this.f3473b);
    }

    public c(y3.d dVar) {
        this.f3472a = 1;
        this.f3473b = dVar;
    }
}
