package e4;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class z implements x3.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3536a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3537b;

    public /* synthetic */ z(Object obj, int i10) {
        this.f3536a = i10;
        this.f3537b = obj;
    }

    @Override // x3.e0
    public final int b() {
        int intrinsicWidth;
        int intrinsicHeight;
        int i10 = 1;
        int i11 = this.f3536a;
        Object obj = this.f3537b;
        switch (i11) {
            case 0:
                return p4.m.c((Bitmap) obj);
            case 1:
                return ((byte[]) obj).length;
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                intrinsicWidth = animatedImageDrawable.getIntrinsicWidth();
                intrinsicHeight = animatedImageDrawable.getIntrinsicHeight();
                int i12 = intrinsicHeight * intrinsicWidth;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                char[] cArr = p4.m.f8575a;
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                int i13 = p4.l.f8574a[config.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2 && i13 != 3) {
                        i10 = 4;
                        if (i13 == 4) {
                            i10 = 8;
                        }
                    } else {
                        i10 = 2;
                    }
                }
                return i10 * i12 * 2;
            default:
                return 1;
        }
    }

    @Override // x3.e0
    public final Class d() {
        switch (this.f3536a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return this.f3537b.getClass();
        }
    }

    @Override // x3.e0
    public final void e() {
        switch (this.f3536a) {
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f3537b;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                return;
            default:
                return;
        }
    }

    @Override // x3.e0
    public final Object get() {
        int i10 = this.f3536a;
        Object obj = this.f3537b;
        switch (i10) {
            case 0:
                return (Bitmap) obj;
            case 1:
                return (byte[]) obj;
            case 2:
                return (AnimatedImageDrawable) obj;
            default:
                return obj;
        }
    }

    public z(byte[] bArr) {
        this.f3536a = 1;
        w7.b.q(bArr);
        this.f3537b = bArr;
    }

    public z(File file) {
        this.f3536a = 3;
        w7.b.q(file);
        this.f3537b = file;
    }
}
