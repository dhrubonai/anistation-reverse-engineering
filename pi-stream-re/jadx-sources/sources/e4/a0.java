package e4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class a0 implements v3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3468a;

    public /* synthetic */ a0(int i10) {
        this.f3468a = i10;
    }

    @Override // v3.n
    public final x3.e0 a(Object obj, int i10, int i11, v3.l lVar) {
        switch (this.f3468a) {
            case 0:
                return new z((Bitmap) obj, 0);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new f4.e(drawable, 0);
                }
                return null;
            default:
                return new z((File) obj);
        }
    }

    @Override // v3.n
    public final /* bridge */ /* synthetic */ boolean b(Object obj, v3.l lVar) {
        switch (this.f3468a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }
}
